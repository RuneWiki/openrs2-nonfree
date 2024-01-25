import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nq")
public final class Class5_Sub1_Sub24 extends Class5_Sub1 {

	@OriginalMember(owner = "client!nq", name = "E", descriptor = "I")
	private int anInt6351 = 4096;

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub24() {
		super(1, true);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(BILclient!co;)V")
	@Override
	public void method7164(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt6351 = arg1.method4227();
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7155(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass104_41.method2752(arg0);
		if (super.aClass104_41.aBoolean203) {
			@Pc(33) int[] local33 = this.method7160(0, Static160.anInt3274 & arg0 - 1);
			@Pc(39) int[] local39 = this.method7160(0, arg0);
			@Pc(49) int[] local49 = this.method7160(0, arg0 + 1 & Static160.anInt3274);
			for (@Pc(51) int local51 = 0; local51 < Static147.anInt3075; local51++) {
				@Pc(64) int local64 = (local49[local51] - local33[local51]) * this.anInt6351;
				@Pc(84) int local84 = this.anInt6351 * (local39[local51 + 1 & Static497.anInt9138] - local39[local51 - 1 & Static497.anInt9138]);
				@Pc(88) int local88 = local84 >> 12;
				@Pc(92) int local92 = local64 >> 12;
				@Pc(98) int local98 = local88 * local88 >> 12;
				@Pc(104) int local104 = local92 * local92 >> 12;
				@Pc(118) int local118 = (int) (Math.sqrt((double) ((float) (local104 + local98 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(126) int local126 = local118 == 0 ? 0 : 16777216 / local118;
				local11[local51] = 4096 - local126;
			}
		}
		return local11;
	}
}
