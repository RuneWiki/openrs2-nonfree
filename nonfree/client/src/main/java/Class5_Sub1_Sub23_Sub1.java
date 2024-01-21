import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class5_Sub1_Sub23_Sub1 extends Class5_Sub1_Sub23 {

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3193(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass105_41.method3106(arg0);
		if (super.aClass105_41.aBoolean183 && this.method2806()) {
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[0];
			@Pc(36) int[] local36 = local16[2];
			@Pc(44) int local44 = super.anInt3718 * (arg0 % super.anInt3718);
			for (@Pc(46) int local46 = 0; local46 < Static174.anInt3489; local46++) {
				@Pc(58) int local58 = super.anIntArray381[local46 % super.anInt3727 + local44];
				local36[local46] = (local58 & 0xFF) << 4;
				local28[local46] = local58 >> 4 & 0xFF0;
				local32[local46] = local58 >> 12 & 0xFF0;
			}
		}
		return local16;
	}
}
