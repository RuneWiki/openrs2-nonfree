import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class3_Sub2_Sub22 extends Class3_Sub2 {

	@OriginalMember(owner = "client!mg", name = "U", descriptor = "I")
	private int anInt2317;

	@OriginalMember(owner = "client!mg", name = "W", descriptor = "I")
	private int anInt2319;

	@OriginalMember(owner = "client!mg", name = "eb", descriptor = "I")
	private int anInt2326;

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(IB)V")
	private void method1795(@OriginalArg(0) int arg0) {
		this.anInt2326 = arg0 >> 4 & 0xFF0;
		this.anInt2319 = (arg0 & 0xFF) << 4;
		this.anInt2317 = arg0 >> 12 & 0xFF0;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!ff;BI)V")
	@Override
	public void method2789(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method1795(arg0.method1376());
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method2796(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass28_39.method997(arg0);
		if (super.aClass28_39.aBoolean89) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[2];
			for (@Pc(34) int local34 = 0; local34 < Static86.anInt1942; local34++) {
				local24[local34] = this.anInt2317;
				local28[local34] = this.anInt2326;
				local32[local34] = this.anInt2319;
			}
		}
		return local16;
	}
}
