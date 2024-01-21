import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class2_Sub1_Sub33_Sub1 extends Class2_Sub1_Sub33 {

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method2792(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass66_39.method1971(arg0);
		if (super.aClass66_39.aBoolean123 && this.method2673()) {
			@Pc(28) int[] local28 = local11[1];
			@Pc(32) int[] local32 = local11[0];
			@Pc(36) int[] local36 = local11[2];
			@Pc(44) int local44 = arg0 % super.anInt3957 * super.anInt3957;
			for (@Pc(46) int local46 = 0; local46 < Static120.anInt2812; local46++) {
				@Pc(58) int local58 = super.anIntArray386[local44 + local46 % super.anInt3956];
				local36[local46] = (local58 & 0xFF) << 4;
				local28[local46] = local58 >> 4 & 0xFF0;
				local32[local46] = local58 >> 12 & 0xFF0;
			}
		}
		return local11;
	}
}
