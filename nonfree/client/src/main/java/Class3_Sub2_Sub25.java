import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class3_Sub2_Sub25 extends Class3_Sub2 {

	@OriginalMember(owner = "client!oc", name = "U", descriptor = "I")
	private int anInt2789;

	@OriginalMember(owner = "client!oc", name = "T", descriptor = "I")
	private int anInt2788;

	@OriginalMember(owner = "client!oc", name = "fb", descriptor = "I")
	private int anInt2798;

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method2797(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass46_39.method1416(arg0);
		if (super.aClass46_39.aBoolean117) {
			@Pc(30) int local30 = Static123.anIntArray308[arg0];
			@Pc(36) int local36 = local30 - 2048 >> 1;
			for (@Pc(38) int local38 = 0; local38 < Static86.anInt1942; local38++) {
				@Pc(44) int local44 = Static165.anIntArray17[local38];
				@Pc(50) int local50 = local44 - 2048 >> 1;
				@Pc(61) int local61;
				if (this.anInt2788 == 0) {
					local61 = this.anInt2789 * (local44 - local30);
				} else {
					@Pc(74) int local74 = local50 * local50 + local36 * local36 >> 12;
					local61 = (int) (Math.sqrt((double) (local74 / 4096)) * 4096.0D);
					local61 = (int) ((double) (this.anInt2789 * local61) * 3.141592653589793D);
				}
				local61 -= local61 & 0xFFFFF000;
				if (this.anInt2798 == 0) {
					local61 = Static57.anIntArray142[local61 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt2798 == 2) {
					local61 -= 2048;
					if (local61 < 0) {
						local61 = -local61;
					}
					local61 = 2048 - local61 << 1;
				}
				local7[local38] = local61;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)V")
	@Override
	public void method2786() {
		Static82.method1413();
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!ff;BI)V")
	@Override
	public void method2789(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2788 = arg0.method1354();
		} else if (arg1 == 1) {
			this.anInt2798 = arg0.method1354();
		} else if (arg1 == 3) {
			this.anInt2789 = arg0.method1354();
		}
	}
}
