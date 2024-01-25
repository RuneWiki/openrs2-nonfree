import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class1_Sub2_Sub21_Sub1 extends Class1_Sub2_Sub21 {

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5965(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass99_41.method1772(arg0);
		if (super.aClass99_41.aBoolean228 && this.method3976()) {
			@Pc(30) int[] local30 = local11[0];
			@Pc(34) int[] local34 = local11[1];
			@Pc(38) int[] local38 = local11[2];
			@Pc(46) int local46 = arg0 % super.anInt4991 * super.anInt4991;
			for (@Pc(48) int local48 = 0; local48 < Static218.anInt3990; local48++) {
				@Pc(61) int local61 = super.anIntArray373[local46 + local48 % super.anInt4988];
				local38[local48] = (local61 & 0xFF) << 4;
				local34[local48] = local61 >> 4 & 0xFF0;
				local30[local48] = local61 >> 12 & 0xFF0;
			}
		}
		return local11;
	}
}
