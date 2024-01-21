import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!ic", name = "C", descriptor = "[[S")
	public static short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!ic", name = "p", descriptor = "Lclient!lf;")
	public static Class49 aClass49_809 = Static32.method683(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
	public static void method1221() {
		aShortArrayArray3 = null;
		aClass49_809 = null;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B[B)[B")
	public static byte[] method1222(@OriginalArg(1) byte[] arg0) {
		@Pc(11) int local11 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local11];
		Static191.method1826(arg0, 0, local14, 0, local11);
		return local14;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIILclient!kf;BLclient!vg;)V")
	public static void method1223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub2_Sub2_Sub3 arg4, @OriginalArg(6) Class85 arg5) {
		if (arg4 == null) {
			return;
		}
		@Pc(22) int local22 = arg0 * arg0 + arg2 * arg2;
		@Pc(28) int local28 = Static63.anInt1356 + Static43.anInt1034 & 0x7FF;
		@Pc(40) int local40 = Math.max(arg5.anInt3858 / 2, arg5.anInt3867 / 2) + 10;
		if (local40 * local40 < local22) {
			return;
		}
		@Pc(54) int local54 = Class2_Sub2_Sub2_Sub4.anIntArray218[local28];
		@Pc(62) int local62 = local54 * 256 / (Static128.anInt2774 + 256);
		@Pc(66) int local66 = Class2_Sub2_Sub2_Sub4.anIntArray217[local28];
		@Pc(74) int local74 = local66 * 256 / (Static128.anInt2774 + 256);
		@Pc(84) int local84 = arg0 * local62 + arg2 * local74 >> 16;
		@Pc(95) int local95 = arg2 * local62 - arg0 * local74 >> 16;
		arg4.method1539(local84 + arg1 + arg5.anInt3858 / 2 - arg4.anInt1889 / 2, -(arg4.anInt1887 / 2) + -local95 + arg3 + arg5.anInt3867 / 2, arg5.anIntArray348, arg5.anIntArray354);
	}
}
