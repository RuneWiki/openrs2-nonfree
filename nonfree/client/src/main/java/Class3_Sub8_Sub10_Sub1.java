import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class3_Sub8_Sub10_Sub1 extends Class3_Sub8_Sub10 {

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8774(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass326_41.method7329(arg0);
		if (super.aClass326_41.aBoolean628 && this.method4091()) {
			@Pc(28) int[] local28 = local16[0];
			@Pc(32) int[] local32 = local16[1];
			@Pc(36) int[] local36 = local16[2];
			@Pc(44) int local44 = super.anInt4763 * (arg0 % super.anInt4763);
			for (@Pc(46) int local46 = 0; local46 < Static91.anInt1849; local46++) {
				@Pc(59) int local59 = super.anIntArray275[local44 + local46 % super.anInt4762];
				local36[local46] = (local59 & 0xFF) << 4;
				local32[local46] = local59 >> 4 & 0xFF0;
				local28[local46] = local59 >> 12 & 0xFF0;
			}
		}
		return local16;
	}
}
