import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class2_Sub1_Sub9_Sub1 extends Class2_Sub1_Sub9 {

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3262(@OriginalArg(0) int arg0) {
		@Pc(20) int[][] local20 = super.aClass43_41.method1433(arg0);
		if (super.aClass43_41.aBoolean92 && this.method1677()) {
			@Pc(32) int[] local32 = local20[1];
			@Pc(36) int[] local36 = local20[0];
			@Pc(40) int[] local40 = local20[2];
			@Pc(48) int local48 = arg0 % super.anInt2113 * super.anInt2113;
			for (@Pc(50) int local50 = 0; local50 < Static135.anInt2897; local50++) {
				@Pc(62) int local62 = super.anIntArray207[local48 + local50 % super.anInt2116];
				local40[local50] = (local62 & 0xFF) << 4;
				local32[local50] = local62 >> 4 & 0xFF0;
				local36[local50] = local62 >> 12 & 0xFF0;
			}
		}
		return local20;
	}
}
