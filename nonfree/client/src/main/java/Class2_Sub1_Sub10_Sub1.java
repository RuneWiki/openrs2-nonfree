import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public final class Class2_Sub1_Sub10_Sub1 extends Class2_Sub1_Sub10 {

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4586(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = this.aClass25_41.method652(arg0);
		if (this.aClass25_41.aBoolean53 && this.method1330()) {
			@Pc(30) int[] local30 = local16[1];
			@Pc(38) int local38 = this.anInt1727 * (arg0 % this.anInt1727);
			@Pc(42) int[] local42 = local16[2];
			@Pc(46) int[] local46 = local16[0];
			for (@Pc(48) int local48 = 0; local48 < Static281.anInt5558; local48++) {
				@Pc(65) int local65 = this.anIntArray150[local48 % this.anInt1730 + local38];
				local42[local48] = (local65 & 0xFF) << 4;
				local30[local48] = local65 >> 4 & 0xFF0;
				local46[local48] = local65 >> 12 & 0xFF0;
			}
		}
		return local16;
	}
}
