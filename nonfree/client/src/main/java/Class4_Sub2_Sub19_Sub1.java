import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jv")
public final class Class4_Sub2_Sub19_Sub1 extends Class4_Sub2_Sub19 {

	static {
		new Class93("", 76);
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5842(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass207_41.method4800(arg0);
		if (super.aClass207_41.aBoolean426 && this.method2880()) {
			@Pc(28) int[] local28 = local11[0];
			@Pc(32) int[] local32 = local11[1];
			@Pc(36) int[] local36 = local11[2];
			@Pc(44) int local44 = super.anInt3832 * (arg0 % super.anInt3832);
			for (@Pc(46) int local46 = 0; local46 < Static350.anInt6330; local46++) {
				@Pc(59) int local59 = super.anIntArray314[local44 + local46 % super.anInt3838];
				local36[local46] = (local59 & 0xFF) << 4;
				local32[local46] = local59 >> 4 & 0xFF0;
				local28[local46] = local59 >> 12 & 0xFF0;
			}
		}
		return local11;
	}
}
