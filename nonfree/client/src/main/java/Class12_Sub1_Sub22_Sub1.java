import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public final class Class12_Sub1_Sub22_Sub1 extends Class12_Sub1_Sub22 {

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7793(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass53_41.method1462(arg0);
		if (super.aClass53_41.aBoolean108 && this.method6369()) {
			@Pc(28) int[] local28 = local16[0];
			@Pc(32) int[] local32 = local16[1];
			@Pc(36) int[] local36 = local16[2];
			@Pc(44) int local44 = arg0 % super.anInt7654 * super.anInt7654;
			for (@Pc(46) int local46 = 0; local46 < Static357.anInt6670; local46++) {
				@Pc(58) int local58 = super.anIntArray538[local46 % super.anInt7647 + local44];
				local36[local46] = (local58 & 0xFF) << 4;
				local32[local46] = local58 >> 4 & 0xFF0;
				local28[local46] = local58 >> 12 & 0xFF0;
			}
		}
		return local16;
	}
}
