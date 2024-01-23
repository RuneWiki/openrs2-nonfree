import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class1_Sub1_Sub18_Sub1 extends Class1_Sub1_Sub18 {

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4462(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = this.aClass71_41.method1894(arg0);
		if (this.aClass71_41.aBoolean190 && this.method2080()) {
			@Pc(28) int[] local28 = local16[0];
			@Pc(32) int[] local32 = local16[2];
			@Pc(36) int[] local36 = local16[1];
			@Pc(44) int local44 = this.anInt2337 * (arg0 % this.anInt2337);
			for (@Pc(46) int local46 = 0; local46 < Static6.anInt4960; local46++) {
				@Pc(63) int local63 = this.anIntArray164[local44 + local46 % this.anInt2336];
				local32[local46] = (local63 & 0xFF) << 4;
				local36[local46] = local63 >> 4 & 0xFF0;
				local28[local46] = local63 >> 12 & 0xFF0;
			}
		}
		return local16;
	}
}
