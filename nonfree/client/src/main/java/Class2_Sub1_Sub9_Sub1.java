import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class2_Sub1_Sub9_Sub1 extends Class2_Sub1_Sub9 {

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method3211(@OriginalArg(0) int arg0) {
		@Pc(12) int[][] local12 = super.aClass99_41.method3152(arg0);
		if (super.aClass99_41.aBoolean280 && this.method1051()) {
			@Pc(28) int[] local28 = local12[1];
			@Pc(32) int[] local32 = local12[0];
			@Pc(36) int[] local36 = local12[2];
			@Pc(44) int local44 = arg0 % super.anInt1519 * super.anInt1519;
			for (@Pc(46) int local46 = 0; local46 < Static62.anInt1675; local46++) {
				@Pc(58) int local58 = super.anIntArray155[local46 % super.anInt1523 + local44];
				local36[local46] = (local58 & 0xFF) << 4;
				local28[local46] = local58 >> 4 & 0xFF0;
				local32[local46] = local58 >> 12 & 0xFF0;
			}
		}
		return local12;
	}
}
