import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class1_Sub1_Sub17_Sub1 extends Class1_Sub1_Sub17 {

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method4714(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = this.aClass45_41.method1139(arg0);
		if (this.aClass45_41.aBoolean95 && this.method4731()) {
			@Pc(20) int[] local20 = local7[1];
			@Pc(24) int[] local24 = local7[0];
			@Pc(28) int[] local28 = local7[2];
			@Pc(36) int local36 = arg0 % this.anInt6249 * this.anInt6249;
			for (@Pc(38) int local38 = 0; local38 < Static62.anInt1350; local38++) {
				@Pc(52) int local52 = this.anIntArray565[local36 + local38 % this.anInt6252];
				local28[local38] = (local52 & 0xFF) << 4;
				local20[local38] = local52 >> 4 & 0xFF0;
				local24[local38] = local52 >> 12 & 0xFF0;
			}
		}
		return local7;
	}
}
