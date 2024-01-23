import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public final class Class1_Sub3_Sub16 extends Class1_Sub3 {

	@OriginalMember(owner = "client!il", name = "O", descriptor = "I")
	private int anInt2827 = 4096;

	@OriginalMember(owner = "client!il", name = "S", descriptor = "I")
	private int anInt2831 = 4096;

	@OriginalMember(owner = "client!il", name = "V", descriptor = "I")
	private int anInt2834 = 4096;

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub16() {
		super(1, false);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4120(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass21_41.method589(arg0);
		if (super.aClass21_41.aBoolean48) {
			@Pc(29) int[][] local29 = this.method4129(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[2];
			@Pc(41) int[] local41 = local7[0];
			@Pc(45) int[] local45 = local29[1];
			@Pc(49) int[] local49 = local7[2];
			@Pc(53) int[] local53 = local7[1];
			for (@Pc(55) int local55 = 0; local55 < Static110.anInt2934; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local37[local55];
				@Pc(69) int local69 = local45[local55];
				if (local61 == local65 && local69 == local65) {
					local41[local55] = this.anInt2831 * local61 >> 12;
					local53[local55] = this.anInt2834 * local65 >> 12;
					local49[local55] = this.anInt2827 * local69 >> 12;
				} else {
					local41[local55] = this.anInt2831;
					local53[local55] = this.anInt2834;
					local49[local55] = this.anInt2827;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Lclient!ql;IZ)V")
	@Override
	public void method4121(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2831 = arg0.method1764();
		} else if (arg1 == 1) {
			this.anInt2834 = arg0.method1764();
		} else if (arg1 == 2) {
			this.anInt2827 = arg0.method1764();
		}
	}
}
