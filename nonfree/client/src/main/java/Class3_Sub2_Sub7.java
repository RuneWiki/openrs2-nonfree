import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class3_Sub2_Sub7 extends Class3_Sub2 {

	@OriginalMember(owner = "client!fd", name = "Z", descriptor = "I")
	private int anInt1054;

	@OriginalMember(owner = "client!fd", name = "ab", descriptor = "I")
	private int anInt1055;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method2796(@OriginalArg(1) int arg0) {
		@Pc(12) int[][] local12 = super.aClass28_39.method997(arg0);
		if (super.aClass28_39.aBoolean89) {
			@Pc(22) int[][] local22 = this.method2785(arg0, 0);
			@Pc(26) int[] local26 = local22[1];
			@Pc(30) int[] local30 = local22[2];
			@Pc(34) int[] local34 = local12[0];
			@Pc(38) int[] local38 = local22[0];
			@Pc(42) int[] local42 = local12[2];
			@Pc(46) int[] local46 = local12[1];
			for (@Pc(48) int local48 = 0; local48 < Static86.anInt1942; local48++) {
				@Pc(54) int local54 = local38[local48];
				@Pc(58) int local58 = local26[local48];
				@Pc(62) int local62 = local30[local48];
				if (local54 < this.anInt1055) {
					local34[local48] = this.anInt1055;
				} else if (local54 <= this.anInt1054) {
					local34[local48] = local54;
				} else {
					local34[local48] = this.anInt1054;
				}
				if (local58 < this.anInt1055) {
					local46[local48] = this.anInt1055;
				} else if (local58 <= this.anInt1054) {
					local46[local48] = local58;
				} else {
					local46[local48] = this.anInt1054;
				}
				if (this.anInt1055 > local62) {
					local42[local48] = this.anInt1055;
				} else if (this.anInt1054 >= local62) {
					local42[local48] = local62;
				} else {
					local42[local48] = this.anInt1054;
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method2797(@OriginalArg(0) int arg0) {
		@Pc(12) int[] local12 = super.aClass46_39.method1416(arg0);
		if (super.aClass46_39.aBoolean117) {
			@Pc(26) int[] local26 = this.method2787(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static86.anInt1942; local28++) {
				@Pc(34) int local34 = local26[local28];
				if (this.anInt1055 > local34) {
					local12[local28] = this.anInt1055;
				} else if (local34 > this.anInt1054) {
					local12[local28] = this.anInt1054;
				} else {
					local12[local28] = local34;
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!ff;BI)V")
	@Override
	public void method2789(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1055 = arg0.method1359();
		} else if (arg1 == 1) {
			this.anInt1054 = arg0.method1359();
		} else if (arg1 == 2) {
			super.aBoolean271 = arg0.method1354() == 1;
		}
	}
}
