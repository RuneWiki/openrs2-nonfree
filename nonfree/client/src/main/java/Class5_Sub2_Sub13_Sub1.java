import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class5_Sub2_Sub13_Sub1 extends Class5_Sub2_Sub13 {

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method9037(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass160_41.method3854(arg0);
		if (super.aClass160_41.aBoolean310 && this.method2413()) {
			@Pc(28) int[] local28 = local16[0];
			@Pc(32) int[] local32 = local16[1];
			@Pc(36) int[] local36 = local16[2];
			@Pc(44) int local44 = super.anInt2812 * (arg0 % super.anInt2812);
			for (@Pc(46) int local46 = 0; local46 < Static597.anInt10025; local46++) {
				@Pc(58) int local58 = super.anIntArray165[local44 + local46 % super.anInt2810];
				local36[local46] = (local58 & 0xFF) << 4;
				local32[local46] = local58 >> 4 & 0xFF0;
				local28[local46] = local58 >> 12 & 0xFF0;
			}
		}
		return local16;
	}
}
