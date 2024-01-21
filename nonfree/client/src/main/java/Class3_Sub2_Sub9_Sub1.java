import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class3_Sub2_Sub9_Sub1 extends Class3_Sub2_Sub9 {

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method3326(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass67_41.method1940(arg0);
		if (super.aClass67_41.aBoolean135 && this.method831()) {
			@Pc(28) int[] local28 = local16[1];
			@Pc(36) int local36 = arg0 % super.anInt1105 * super.anInt1105;
			@Pc(40) int[] local40 = local16[0];
			@Pc(44) int[] local44 = local16[2];
			for (@Pc(46) int local46 = 0; local46 < Static190.anInt3865; local46++) {
				@Pc(58) int local58 = super.anIntArray57[local36 + local46 % super.anInt1106];
				local44[local46] = (local58 & 0xFF) << 4;
				local28[local46] = local58 >> 4 & 0xFF0;
				local40[local46] = local58 >> 12 & 0xFF0;
			}
		}
		return local16;
	}
}
