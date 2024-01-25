import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public final class Class5_Sub1_Sub9_Sub1 extends Class5_Sub1_Sub9 {

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5763(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass154_41.method3176(arg0);
		if (super.aClass154_41.aBoolean254 && this.method1205()) {
			@Pc(28) int[] local28 = local11[0];
			@Pc(32) int[] local32 = local11[1];
			@Pc(36) int[] local36 = local11[2];
			@Pc(44) int local44 = super.anInt1462 * (arg0 % super.anInt1462);
			for (@Pc(46) int local46 = 0; local46 < Static148.anInt2666; local46++) {
				@Pc(58) int local58 = super.anIntArray72[local44 + local46 % super.anInt1463];
				local36[local46] = (local58 & 0xFF) << 4;
				local32[local46] = local58 >> 4 & 0xFF0;
				local28[local46] = local58 >> 12 & 0xFF0;
			}
		}
		return local11;
	}
}
