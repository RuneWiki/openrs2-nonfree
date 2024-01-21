import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class3_Sub2_Sub13 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ke", name = "Z", descriptor = "Z")
	private boolean aBoolean123;

	@OriginalMember(owner = "client!ke", name = "ab", descriptor = "Z")
	private boolean aBoolean124;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!ff;BI)V")
	@Override
	public void method2789(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean124 = arg0.method1354() == 1;
		} else if (arg1 == 1) {
			this.aBoolean123 = arg0.method1354() == 1;
		} else if (arg1 == 2) {
			super.aBoolean271 = arg0.method1354() == 1;
		}
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method2797(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass46_39.method1416(arg0);
		if (super.aClass46_39.aBoolean117) {
			@Pc(29) int[] local29 = this.method2787(this.aBoolean123 ? Static124.anInt2869 - arg0 : arg0, 0);
			if (this.aBoolean124) {
				for (@Pc(42) int local42 = 0; local42 < Static86.anInt1942; local42++) {
					local11[local42] = local29[Static165.anInt321 - local42];
				}
			} else {
				Static184.method1124(local29, 0, local11, 0, Static86.anInt1942);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method2796(@OriginalArg(1) int arg0) {
		@Pc(7) int[][] local7 = super.aClass28_39.method997(arg0);
		if (super.aClass28_39.aBoolean89) {
			@Pc(35) int[][] local35 = this.method2785(this.aBoolean123 ? Static124.anInt2869 - arg0 : arg0, 0);
			@Pc(39) int[] local39 = local35[0];
			@Pc(43) int[] local43 = local35[2];
			@Pc(47) int[] local47 = local35[1];
			@Pc(51) int[] local51 = local7[1];
			@Pc(55) int[] local55 = local7[0];
			@Pc(59) int[] local59 = local7[2];
			@Pc(64) int local64;
			if (this.aBoolean124) {
				for (local64 = 0; local64 < Static86.anInt1942; local64++) {
					local55[local64] = local39[Static165.anInt321 - local64];
					local51[local64] = local47[Static165.anInt321 - local64];
					local59[local64] = local43[Static165.anInt321 - local64];
				}
			} else {
				for (local64 = 0; local64 < Static86.anInt1942; local64++) {
					local55[local64] = local39[local64];
					local51[local64] = local47[local64];
					local59[local64] = local43[local64];
				}
			}
		}
		return local7;
	}
}
