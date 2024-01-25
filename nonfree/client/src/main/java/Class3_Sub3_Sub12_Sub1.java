import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class3_Sub3_Sub12_Sub1 extends Class3_Sub3_Sub12 {

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method5734(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass84_41.method2091(arg0);
		if (super.aClass84_41.aBoolean144 && this.method1565()) {
			@Pc(28) int[] local28 = local16[0];
			@Pc(32) int[] local32 = local16[1];
			@Pc(36) int[] local36 = local16[2];
			@Pc(44) int local44 = super.anInt1904 * (arg0 % super.anInt1904);
			for (@Pc(46) int local46 = 0; local46 < Static131.anInt2755; local46++) {
				@Pc(58) int local58 = super.anIntArray111[local44 + local46 % super.anInt1909];
				local36[local46] = (local58 & 0xFF) << 4;
				local32[local46] = local58 >> 4 & 0xFF0;
				local28[local46] = local58 >> 12 & 0xFF0;
			}
		}
		return local16;
	}
}
