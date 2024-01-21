import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class3_Sub2_Sub21_Sub1 extends Class3_Sub2_Sub21 {

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method2796(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass28_39.method997(arg0);
		if (super.aClass28_39.aBoolean89 && this.method1771()) {
			@Pc(28) int[] local28 = local16[2];
			@Pc(32) int[] local32 = local16[1];
			@Pc(36) int[] local36 = local16[0];
			@Pc(44) int local44 = super.anInt2278 * (arg0 % super.anInt2278);
			for (@Pc(46) int local46 = 0; local46 < Static86.anInt1942; local46++) {
				@Pc(58) int local58 = super.anIntArray229[local44 + local46 % super.anInt2279];
				local28[local46] = (local58 & 0xFF) << 4;
				local32[local46] = local58 >> 4 & 0xFF0;
				local36[local46] = local58 >> 12 & 0xFF0;
			}
		}
		return local16;
	}
}
