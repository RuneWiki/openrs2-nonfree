import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class1_Sub1_Sub10_Sub1 extends Class1_Sub1_Sub10 {

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3313(@OriginalArg(0) int arg0) {
		@Pc(12) int[][] local12 = super.aClass39_41.method1383(arg0);
		if (super.aClass39_41.aBoolean82 && this.method919()) {
			@Pc(24) int[] local24 = local12[0];
			@Pc(28) int[] local28 = local12[1];
			@Pc(36) int local36 = super.anInt1393 * (arg0 % super.anInt1393);
			@Pc(40) int[] local40 = local12[2];
			for (@Pc(42) int local42 = 0; local42 < Static176.anInt3921; local42++) {
				@Pc(55) int local55 = super.anIntArray128[local36 + local42 % super.anInt1406];
				local40[local42] = (local55 & 0xFF) << 4;
				local28[local42] = local55 >> 4 & 0xFF0;
				local24[local42] = local55 >> 12 & 0xFF0;
			}
		}
		return local12;
	}
}
