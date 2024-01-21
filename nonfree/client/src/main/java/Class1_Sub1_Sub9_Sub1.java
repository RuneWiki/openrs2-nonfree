import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class1_Sub1_Sub9_Sub1 extends Class1_Sub1_Sub9 {

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3006(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass40_41.method1589(arg0);
		if (super.aClass40_41.aBoolean168 && this.method1116()) {
			@Pc(28) int[] local28 = local16[0];
			@Pc(32) int[] local32 = local16[1];
			@Pc(36) int[] local36 = local16[2];
			@Pc(44) int local44 = arg0 % super.anInt1392 * super.anInt1392;
			for (@Pc(46) int local46 = 0; local46 < Static65.anInt1933; local46++) {
				@Pc(59) int local59 = super.anIntArray145[local44 + local46 % super.anInt1390];
				local36[local46] = (local59 & 0xFF) << 4;
				local32[local46] = local59 >> 4 & 0xFF0;
				local28[local46] = local59 >> 12 & 0xFF0;
			}
		}
		return local16;
	}
}
