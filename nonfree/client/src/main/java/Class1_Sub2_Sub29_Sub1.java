import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class1_Sub2_Sub29_Sub1 extends Class1_Sub2_Sub29 {

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3129(@OriginalArg(0) int arg0) {
		@Pc(12) int[][] local12 = super.aClass77_39.method2617(arg0);
		if (super.aClass77_39.aBoolean193 && this.method2774()) {
			@Pc(28) int[] local28 = local12[0];
			@Pc(32) int[] local32 = local12[2];
			@Pc(36) int[] local36 = local12[1];
			@Pc(44) int local44 = arg0 % super.anInt3937 * super.anInt3937;
			for (@Pc(46) int local46 = 0; local46 < Static110.anInt2825; local46++) {
				@Pc(58) int local58 = super.anIntArray539[local46 % super.anInt3936 + local44];
				local32[local46] = (local58 & 0xFF) << 4;
				local36[local46] = local58 >> 4 & 0xFF0;
				local28[local46] = local58 >> 12 & 0xFF0;
			}
		}
		return local12;
	}
}
