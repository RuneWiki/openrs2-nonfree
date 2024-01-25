import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public final class Class2_Sub3_Sub5_Sub1 extends Class2_Sub3_Sub5 {

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "(II)[[I")
	@Override
	public int[][] method9155(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass10_41.method211(arg0);
		if (super.aClass10_41.aBoolean11 && this.method2185()) {
			@Pc(28) int[] local28 = local16[0];
			@Pc(32) int[] local32 = local16[1];
			@Pc(36) int[] local36 = local16[2];
			@Pc(44) int local44 = super.anInt2305 * (arg0 % super.anInt2305);
			for (@Pc(46) int local46 = 0; local46 < Static222.anInt4971; local46++) {
				@Pc(58) int local58 = super.anIntArray104[local46 % super.anInt2302 + local44];
				local36[local46] = (local58 & 0xFF) << 4;
				local32[local46] = local58 >> 4 & 0xFF0;
				local28[local46] = local58 >> 12 & 0xFF0;
			}
		}
		return local16;
	}
}
