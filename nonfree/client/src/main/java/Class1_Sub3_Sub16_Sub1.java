import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class1_Sub3_Sub16_Sub1 extends Class1_Sub3_Sub16 {

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6083(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass20_41.method474(arg0);
		if (super.aClass20_41.aBoolean14 && this.method5066()) {
			@Pc(28) int[] local28 = local16[0];
			@Pc(32) int[] local32 = local16[1];
			@Pc(36) int[] local36 = local16[2];
			@Pc(44) int local44 = super.anInt6271 * (arg0 % super.anInt6271);
			for (@Pc(46) int local46 = 0; local46 < Static347.anInt5974; local46++) {
				@Pc(58) int local58 = super.anIntArray516[local46 % super.anInt6269 + local44];
				local36[local46] = (local58 & 0xFF) << 4;
				local32[local46] = local58 >> 4 & 0xFF0;
				local28[local46] = local58 >> 12 & 0xFF0;
			}
		}
		return local16;
	}
}
