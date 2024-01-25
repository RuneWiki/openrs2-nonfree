import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!es")
public final class Class1_Sub1_Sub10_Sub1 extends Class1_Sub1_Sub10 {

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7883(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass153_41.method3557(arg0);
		if (super.aClass153_41.aBoolean340 && this.method2187()) {
			@Pc(28) int[] local28 = local11[0];
			@Pc(32) int[] local32 = local11[1];
			@Pc(36) int[] local36 = local11[2];
			@Pc(44) int local44 = super.anInt2587 * (arg0 % super.anInt2587);
			for (@Pc(46) int local46 = 0; local46 < Static87.anInt1964; local46++) {
				@Pc(59) int local59 = super.anIntArray156[local44 + local46 % super.anInt2592];
				local36[local46] = (local59 & 0xFF) << 4;
				local32[local46] = local59 >> 4 & 0xFF0;
				local28[local46] = local59 >> 12 & 0xFF0;
			}
		}
		return local11;
	}
}
