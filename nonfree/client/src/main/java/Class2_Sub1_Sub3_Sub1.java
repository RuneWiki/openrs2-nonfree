import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class2_Sub1_Sub3_Sub1 extends Class2_Sub1_Sub3 {

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method2982(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass11_39.method511(arg0);
		if (super.aClass11_39.aBoolean37 && this.method323()) {
			@Pc(28) int[] local28 = local11[0];
			@Pc(32) int[] local32 = local11[1];
			@Pc(40) int local40 = super.anInt466 * (arg0 % super.anInt466);
			@Pc(44) int[] local44 = local11[2];
			for (@Pc(46) int local46 = 0; local46 < Static129.anInt3118; local46++) {
				@Pc(58) int local58 = super.anIntArray68[local40 + local46 % super.anInt471];
				local44[local46] = (local58 & 0xFF) << 4;
				local32[local46] = local58 >> 4 & 0xFF0;
				local28[local46] = local58 >> 12 & 0xFF0;
			}
		}
		return local11;
	}
}
