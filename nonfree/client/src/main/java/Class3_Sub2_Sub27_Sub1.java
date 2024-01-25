import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class3_Sub2_Sub27_Sub1 extends Class3_Sub2_Sub27 {

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5901(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass249_41.method5303(arg0);
		if (super.aClass249_41.aBoolean583 && this.method5810()) {
			@Pc(28) int[] local28 = local16[0];
			@Pc(32) int[] local32 = local16[1];
			@Pc(36) int[] local36 = local16[2];
			@Pc(44) int local44 = super.anInt7470 * (arg0 % super.anInt7470);
			for (@Pc(46) int local46 = 0; local46 < Static406.anInt6694; local46++) {
				@Pc(58) int local58 = super.anIntArray521[local46 % super.anInt7472 + local44];
				local36[local46] = (local58 & 0xFF) << 4;
				local32[local46] = local58 >> 4 & 0xFF0;
				local28[local46] = local58 >> 12 & 0xFF0;
			}
		}
		return local16;
	}
}
