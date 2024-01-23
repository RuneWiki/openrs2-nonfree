import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class1_Sub3_Sub17 extends Class1_Sub3 {

	@OriginalMember(owner = "client!k", name = "O", descriptor = "[I")
	private int[] anIntArray221 = new int[3];

	@OriginalMember(owner = "client!k", name = "R", descriptor = "I")
	private int anInt3079 = 409;

	@OriginalMember(owner = "client!k", name = "Q", descriptor = "I")
	private int anInt3078 = 4096;

	@OriginalMember(owner = "client!k", name = "V", descriptor = "I")
	private int anInt3081 = 4096;

	@OriginalMember(owner = "client!k", name = "X", descriptor = "I")
	private int anInt3083 = 4096;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!ql;IZ)V")
	@Override
	public void method4121(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3079 = arg0.method1764();
		} else if (arg1 == 1) {
			this.anInt3083 = arg0.method1764();
		} else if (arg1 == 2) {
			this.anInt3081 = arg0.method1764();
		} else if (arg1 == 3) {
			this.anInt3078 = arg0.method1764();
		} else if (arg1 == 4) {
			@Pc(70) int local70 = arg0.method1773();
			this.anIntArray221[0] = (local70 & 0xFF0000) << 4;
			this.anIntArray221[1] = local70 >> 4 & 0xFF0;
			this.anIntArray221[2] = local70 >> 12 & 0x0;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4120(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass21_41.method589(arg0);
		if (super.aClass21_41.aBoolean48) {
			@Pc(21) int[][] local21 = this.method4129(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[2];
			@Pc(33) int[] local33 = local11[0];
			@Pc(37) int[] local37 = local21[1];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static110.anInt2934; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(60) int local60 = local53 - this.anIntArray221[0];
				if (local60 < 0) {
					local60 = -local60;
				}
				if (local60 > this.anInt3079) {
					local33[local47] = local53;
					local41[local47] = local37[local47];
					local45[local47] = local29[local47];
				} else {
					@Pc(94) int local94 = local37[local47];
					local60 = local94 - this.anIntArray221[1];
					if (local60 < 0) {
						local60 = -local60;
					}
					if (this.anInt3079 < local60) {
						local33[local47] = local53;
						local41[local47] = local94;
						local45[local47] = local29[local47];
					} else {
						@Pc(134) int local134 = local29[local47];
						local60 = local134 - this.anIntArray221[2];
						if (local60 < 0) {
							local60 = -local60;
						}
						if (local60 > this.anInt3079) {
							local33[local47] = local53;
							local41[local47] = local94;
							local45[local47] = local134;
						} else {
							local33[local47] = local53 * this.anInt3078 >> 12;
							local41[local47] = local94 * this.anInt3081 >> 12;
							local45[local47] = local134 * this.anInt3083 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}
}
