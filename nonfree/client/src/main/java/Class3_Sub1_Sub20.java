import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class3_Sub1_Sub20 extends Class3_Sub1 {

	@OriginalMember(owner = "client!kn", name = "O", descriptor = "[I")
	private int[] anIntArray455;

	@OriginalMember(owner = "client!kn", name = "Q", descriptor = "[I")
	private int[] anIntArray456;

	@OriginalMember(owner = "client!kn", name = "E", descriptor = "I")
	private int anInt5174 = 0;

	@OriginalMember(owner = "client!kn", name = "M", descriptor = "I")
	private int anInt5179 = 2048;

	@OriginalMember(owner = "client!kn", name = "R", descriptor = "I")
	private int anInt5181 = 10;

	static {
		new Class67("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
	}

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kn", name = "f", descriptor = "(I)V")
	@Override
	public void method7786() {
		this.method4344();
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)V")
	private void method4344() {
		this.anIntArray455 = new int[this.anInt5181 + 1];
		this.anIntArray456 = new int[this.anInt5181 + 1];
		@Pc(21) int local21 = 0;
		@Pc(26) int local26 = 4096 / this.anInt5181;
		@Pc(33) int local33 = local26 * this.anInt5179 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt5181; local35++) {
			this.anIntArray456[local35] = local21;
			this.anIntArray455[local35] = local33 + local21;
			local21 += local26;
		}
		this.anIntArray456[this.anInt5181] = 4096;
		this.anIntArray455[this.anInt5181] = this.anIntArray455[0] + 4096;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IILclient!rt;)V")
	@Override
	public void method7783(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub27 arg1) {
		if (arg0 == 0) {
			this.anInt5181 = arg1.method7548();
		} else if (arg0 == 1) {
			this.anInt5179 = arg1.method7591();
		} else if (arg0 == 2) {
			this.anInt5174 = arg1.method7548();
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7784(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass219_41.method5560(arg0);
		if (super.aClass219_41.aBoolean423) {
			@Pc(19) int local19 = Static402.anIntArray741[arg0];
			@Pc(31) int local31;
			if (this.anInt5174 == 0) {
				@Pc(127) short local127 = 0;
				for (local31 = 0; local31 < this.anInt5181; local31++) {
					if (this.anIntArray456[local31] <= local19 && local19 < this.anIntArray456[local31 + 1]) {
						if (this.anIntArray455[local31] > local19) {
							local127 = 4096;
						}
						break;
					}
				}
				Static559.method5958(local11, 0, Static307.anInt4846, local127);
			} else {
				for (@Pc(27) int local27 = 0; local27 < Static307.anInt4846; local27++) {
					local31 = 0;
					@Pc(33) short local33 = 0;
					@Pc(37) int local37 = Static241.anIntArray759[local27];
					@Pc(40) int local40 = this.anInt5174;
					if (local40 == 1) {
						local31 = local37;
					} else if (local40 == 2) {
						local31 = (local19 + local37 - 4096 >> 1) + 2048;
					} else if (local40 == 3) {
						local31 = (local37 - local19 >> 1) + 2048;
					}
					for (local40 = 0; local40 < this.anInt5181; local40++) {
						if (local31 >= this.anIntArray456[local40] && local31 < this.anIntArray456[local40 + 1]) {
							if (this.anIntArray455[local40] > local31) {
								local33 = 4096;
							}
							break;
						}
					}
					local11[local27] = local33;
				}
			}
		}
		return local11;
	}
}
