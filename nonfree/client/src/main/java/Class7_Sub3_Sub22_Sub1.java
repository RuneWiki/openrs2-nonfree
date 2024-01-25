import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!us")
public final class Class7_Sub3_Sub22_Sub1 extends Class7_Sub3_Sub22 {

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method5596(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass235_41.method4862(arg0);
		if (super.aClass235_41.aBoolean402 && this.method5208()) {
			@Pc(28) int[] local28 = local16[0];
			@Pc(32) int[] local32 = local16[1];
			@Pc(36) int[] local36 = local16[2];
			@Pc(44) int local44 = arg0 % super.anInt6580 * super.anInt6580;
			for (@Pc(46) int local46 = 0; local46 < Static58.anInt1052; local46++) {
				@Pc(58) int local58 = super.anIntArray584[local44 + local46 % super.anInt6585];
				local36[local46] = (local58 & 0xFF) << 4;
				local32[local46] = local58 >> 4 & 0xFF0;
				local28[local46] = local58 >> 12 & 0xFF0;
			}
		}
		return local16;
	}
}
