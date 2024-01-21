import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class3_Sub2_Sub20 extends Class3_Sub2 {

	@OriginalMember(owner = "client!mb", name = "Y", descriptor = "I")
	private int anInt2186;

	@OriginalMember(owner = "client!mb", name = "fb", descriptor = "I")
	private int anInt2191;

	@OriginalMember(owner = "client!mb", name = "eb", descriptor = "I")
	private int anInt2190;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method2796(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass28_39.method997(arg0);
		if (super.aClass28_39.aBoolean89) {
			@Pc(21) int[][] local21 = this.method2785(arg0, 0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local11[0];
			@Pc(37) int[] local37 = local21[2];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static86.anInt1942; local47++) {
				local33[local47] = (local25[local47] * this.anInt2191 >> 12) + this.anInt2190;
				local41[local47] = this.anInt2190 + (this.anInt2191 * local29[local47] >> 12);
				local45[local47] = (local37[local47] * this.anInt2191 >> 12) + this.anInt2190;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!ff;BI)V")
	@Override
	public void method2789(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2190 = arg0.method1359();
		} else if (arg1 == 1) {
			this.anInt2186 = arg0.method1359();
		} else if (arg1 == 2) {
			super.aBoolean271 = arg0.method1354() == 1;
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method2797(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass46_39.method1416(arg0);
		if (super.aClass46_39.aBoolean117) {
			@Pc(17) int[] local17 = this.method2787(arg0, 0);
			for (@Pc(19) int local19 = 0; local19 < Static86.anInt1942; local19++) {
				local7[local19] = (this.anInt2191 * local17[local19] >> 12) + this.anInt2190;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V")
	@Override
	public void method2786() {
		this.anInt2191 = this.anInt2186 - this.anInt2190;
	}
}
