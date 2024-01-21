import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class4_Sub3_Sub17_Sub1 extends Class4_Sub3_Sub17 {

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3158(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass39_41.method1506(arg0);
		if (super.aClass39_41.aBoolean84 && this.method1444()) {
			@Pc(24) int[] local24 = local7[1];
			@Pc(28) int[] local28 = local7[0];
			@Pc(36) int local36 = super.anInt1805 * (arg0 % super.anInt1805);
			@Pc(40) int[] local40 = local7[2];
			for (@Pc(42) int local42 = 0; local42 < Static134.anInt3188; local42++) {
				@Pc(55) int local55 = super.anIntArray164[local36 + local42 % super.anInt1801];
				local40[local42] = (local55 & 0xFF) << 4;
				local24[local42] = local55 >> 4 & 0xFF0;
				local28[local42] = local55 >> 12 & 0xFF0;
			}
		}
		return local7;
	}
}
