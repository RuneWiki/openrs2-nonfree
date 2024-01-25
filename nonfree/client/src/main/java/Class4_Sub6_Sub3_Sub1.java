import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public final class Class4_Sub6_Sub3_Sub1 extends Class4_Sub6_Sub3 {

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5694(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass90_41.method2575(arg0);
		if (super.aClass90_41.aBoolean211 && this.method811()) {
			@Pc(28) int[] local28 = local11[0];
			@Pc(32) int[] local32 = local11[1];
			@Pc(36) int[] local36 = local11[2];
			@Pc(44) int local44 = super.anInt1085 * (arg0 % super.anInt1085);
			for (@Pc(46) int local46 = 0; local46 < Static31.anInt797; local46++) {
				@Pc(58) int local58 = super.anIntArray50[local46 % super.anInt1091 + local44];
				local36[local46] = (local58 & 0xFF) << 4;
				local32[local46] = local58 >> 4 & 0xFF0;
				local28[local46] = local58 >> 12 & 0xFF0;
			}
		}
		return local11;
	}
}
