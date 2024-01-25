import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class2_Sub4_Sub19_Sub1 extends Class2_Sub4_Sub19 {

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7561(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass143_41.method2531(arg0);
		if (super.aClass143_41.aBoolean214 && this.method6015()) {
			@Pc(28) int[] local28 = local11[0];
			@Pc(32) int[] local32 = local11[1];
			@Pc(36) int[] local36 = local11[2];
			@Pc(44) int local44 = arg0 % super.anInt7460 * super.anInt7460;
			for (@Pc(46) int local46 = 0; local46 < Static143.anInt7434; local46++) {
				@Pc(58) int local58 = super.anIntArray502[local44 + local46 % super.anInt7461];
				local36[local46] = (local58 & 0xFF) << 4;
				local32[local46] = local58 >> 4 & 0xFF0;
				local28[local46] = local58 >> 12 & 0xFF0;
			}
		}
		return local11;
	}
}
