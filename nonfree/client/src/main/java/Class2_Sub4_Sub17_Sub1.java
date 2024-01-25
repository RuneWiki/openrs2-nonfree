import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class Class2_Sub4_Sub17_Sub1 extends Class2_Sub4_Sub17 {

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(BI)[[I")
	@Override
	public int[][] method5594(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass170_41.method3736(arg0);
		if (super.aClass170_41.aBoolean309 && this.method4639()) {
			@Pc(28) int[] local28 = local11[0];
			@Pc(32) int[] local32 = local11[1];
			@Pc(36) int[] local36 = local11[2];
			@Pc(44) int local44 = arg0 % super.anInt5338 * super.anInt5338;
			for (@Pc(46) int local46 = 0; local46 < Static76.anInt1458; local46++) {
				@Pc(59) int local59 = super.anIntArray1055[local44 + local46 % super.anInt5334];
				local36[local46] = (local59 & 0xFF) << 4;
				local32[local46] = local59 >> 4 & 0xFF0;
				local28[local46] = local59 >> 12 & 0xFF0;
			}
		}
		return local11;
	}
}
