import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gs")
public final class Class3_Sub6_Sub12 extends Class3_Sub6 {

	@OriginalMember(owner = "client!gs", name = "M", descriptor = "[I")
	private int[] anIntArray162;

	@OriginalMember(owner = "client!gs", name = "V", descriptor = "[I")
	private int[] anIntArray163;

	@OriginalMember(owner = "client!gs", name = "N", descriptor = "I")
	private int anInt3945 = 0;

	@OriginalMember(owner = "client!gs", name = "S", descriptor = "I")
	private int anInt3950 = 2048;

	@OriginalMember(owner = "client!gs", name = "R", descriptor = "I")
	private int anInt3949 = 10;

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)V")
	@Override
	public void method8012() {
		this.method3206();
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(B)V")
	private void method3206() {
		this.anIntArray163 = new int[this.anInt3949 + 1];
		this.anIntArray162 = new int[this.anInt3949 + 1];
		@Pc(21) int local21 = 0;
		@Pc(26) int local26 = 4096 / this.anInt3949;
		@Pc(33) int local33 = local26 * this.anInt3950 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt3949; local35++) {
			this.anIntArray163[local35] = local21;
			this.anIntArray162[local35] = local21 + local33;
			local21 += local26;
		}
		this.anIntArray163[this.anInt3949] = 4096;
		this.anIntArray162[this.anInt3949] = this.anIntArray162[0] + 4096;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(BLclient!ie;I)V")
	@Override
	public void method8003(@OriginalArg(1) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3949 = arg0.method6814();
		} else if (arg1 == 1) {
			this.anInt3950 = arg0.method6811();
		} else if (arg1 == 2) {
			this.anInt3945 = arg0.method6814();
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8009(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass170_41.method4104(arg0);
		if (super.aClass170_41.aBoolean337) {
			@Pc(19) int local19 = Static231.anIntArray217[arg0];
			@Pc(31) int local31;
			if (this.anInt3945 == 0) {
				@Pc(131) short local131 = 0;
				for (local31 = 0; local31 < this.anInt3949; local31++) {
					if (this.anIntArray163[local31] <= local19 && this.anIntArray163[local31 + 1] > local19) {
						if (local19 < this.anIntArray162[local31]) {
							local131 = 4096;
						}
						break;
					}
				}
				Static604.method6221(local11, 0, Static481.anInt8358, local131);
			} else {
				for (@Pc(27) int local27 = 0; local27 < Static481.anInt8358; local27++) {
					local31 = 0;
					@Pc(33) short local33 = 0;
					@Pc(37) int local37 = Static595.anIntArray600[local27];
					@Pc(40) int local40 = this.anInt3945;
					if (local40 == 1) {
						local31 = local37;
					} else if (local40 == 2) {
						local31 = (local37 + local19 - 4096 >> 1) + 2048;
					} else if (local40 == 3) {
						local31 = (local37 - local19 >> 1) + 2048;
					}
					for (local40 = 0; local40 < this.anInt3949; local40++) {
						if (local31 >= this.anIntArray163[local40] && this.anIntArray163[local40 + 1] > local31) {
							if (local31 < this.anIntArray162[local40]) {
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
