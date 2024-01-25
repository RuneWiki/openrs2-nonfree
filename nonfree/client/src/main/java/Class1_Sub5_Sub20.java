import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class1_Sub5_Sub20 extends Class1_Sub5 {

	@OriginalMember(owner = "client!oa", name = "U", descriptor = "[I")
	private int[] anIntArray409;

	@OriginalMember(owner = "client!oa", name = "V", descriptor = "[I")
	private int[] anIntArray410;

	@OriginalMember(owner = "client!oa", name = "P", descriptor = "I")
	private int anInt4432 = 2048;

	@OriginalMember(owner = "client!oa", name = "T", descriptor = "I")
	private int anInt4436 = 0;

	@OriginalMember(owner = "client!oa", name = "S", descriptor = "I")
	private int anInt4435 = 10;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V")
	public Class1_Sub5_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
	@Override
	public void method5801() {
		this.method3798();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method5814(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4435 = arg0.method5720();
		} else if (arg1 == 1) {
			this.anInt4432 = arg0.method5715();
		} else if (arg1 == 2) {
			this.anInt4436 = arg0.method5720();
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5805(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass214_41.method5651(arg0);
		if (super.aClass214_41.aBoolean544) {
			@Pc(23) int local23 = Static191.anIntArray379[arg0];
			@Pc(35) int local35;
			if (this.anInt4436 == 0) {
				@Pc(135) short local135 = 0;
				for (local35 = 0; local35 < this.anInt4435; local35++) {
					if (this.anIntArray409[local35] <= local23 && this.anIntArray409[local35 + 1] > local23) {
						if (this.anIntArray410[local35] > local23) {
							local135 = 4096;
						}
						break;
					}
				}
				Static361.method1852(local15, 0, Static75.anInt1566, local135);
			} else {
				for (@Pc(31) int local31 = 0; local31 < Static75.anInt1566; local31++) {
					local35 = 0;
					@Pc(37) short local37 = 0;
					@Pc(41) int local41 = Static49.anIntArray492[local31];
					@Pc(44) int local44 = this.anInt4436;
					if (local44 == 1) {
						local35 = local41;
					} else if (local44 == 2) {
						local35 = (local41 + local23 - 4096 >> 1) + 2048;
					} else if (local44 == 3) {
						local35 = (local41 - local23 >> 1) + 2048;
					}
					for (local44 = 0; local44 < this.anInt4435; local44++) {
						if (this.anIntArray409[local44] <= local35 && local35 < this.anIntArray409[local44 + 1]) {
							if (this.anIntArray410[local44] > local35) {
								local37 = 4096;
							}
							break;
						}
					}
					local15[local31] = local37;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V")
	private void method3798() {
		this.anIntArray410 = new int[this.anInt4435 + 1];
		this.anIntArray409 = new int[this.anInt4435 + 1];
		@Pc(21) int local21 = 0;
		@Pc(26) int local26 = 4096 / this.anInt4435;
		@Pc(33) int local33 = local26 * this.anInt4432 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt4435; local35++) {
			this.anIntArray409[local35] = local21;
			this.anIntArray410[local35] = local33 + local21;
			local21 += local26;
		}
		this.anIntArray409[this.anInt4435] = 4096;
		this.anIntArray410[this.anInt4435] = this.anIntArray410[0] + 4096;
	}
}
