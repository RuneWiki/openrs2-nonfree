import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class3_Sub2_Sub29 extends Class3_Sub2 {

	@OriginalMember(owner = "client!rh", name = "T", descriptor = "I")
	private int anInt3289;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!ff;BI)V")
	@Override
	public void method2789(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3289 = arg0.method1359();
		}
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method2797(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass46_39.method1416(arg0);
		if (super.aClass46_39.aBoolean117) {
			@Pc(33) int[] local33 = this.method2787(Static124.anInt2869 & arg0 - 1, 0);
			@Pc(39) int[] local39 = this.method2787(arg0, 0);
			@Pc(49) int[] local49 = this.method2787(arg0 + 1 & Static124.anInt2869, 0);
			for (@Pc(51) int local51 = 0; local51 < Static86.anInt1942; local51++) {
				@Pc(65) int local65 = this.anInt3289 * (local49[local51] - local33[local51]);
				@Pc(69) int local69 = local65 >> 12;
				@Pc(88) int local88 = (local39[Static165.anInt321 & local51 + 1] - local39[local51 - 1 & Static165.anInt321]) * this.anInt3289;
				@Pc(94) int local94 = local69 * local69 >> 12;
				@Pc(98) int local98 = local88 >> 12;
				@Pc(104) int local104 = local98 * local98 >> 12;
				@Pc(117) int local117 = (int) (Math.sqrt((double) ((local104 + local94 + 4096) / 4096)) * 4096.0D);
				@Pc(128) int local128 = local117 == 0 ? 0 : 16777216 / local117;
				local19[local51] = 4096 - local128;
			}
		}
		return local19;
	}
}
