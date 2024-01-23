import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class1_Sub1_Sub7_Sub1 extends Class1_Sub1_Sub7 {

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method4444(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = this.aClass153_41.method3955(arg0);
		if (this.aClass153_41.aBoolean396 && this.method3654()) {
			@Pc(30) int[] local30 = local16[0];
			@Pc(34) int[] local34 = local16[1];
			@Pc(38) int[] local38 = local16[2];
			@Pc(46) int local46 = arg0 % this.anInt4782 * this.anInt4782;
			for (@Pc(48) int local48 = 0; local48 < Static131.anInt2513; local48++) {
				@Pc(66) int local66 = this.anIntArray562[local46 + local48 % this.anInt4781];
				local38[local48] = (local66 & 0xFF) << 4;
				local34[local48] = local66 >> 4 & 0xFF0;
				local30[local48] = local66 >> 12 & 0xFF0;
			}
		}
		return local16;
	}
}
