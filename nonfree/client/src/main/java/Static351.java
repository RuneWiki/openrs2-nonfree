import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!wm", name = "nb", descriptor = "Ljava/lang/String;")
	public static String aString149;

	@OriginalMember(owner = "client!wm", name = "K", descriptor = "I")
	public static int anInt4014 = 0;

	@OriginalMember(owner = "client!wm", name = "Z", descriptor = "I")
	public static int anInt4024 = 0;

	@OriginalMember(owner = "client!wm", name = "Gb", descriptor = "Ljava/lang/String;")
	public static String aString151 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(Z)Z")
	public static boolean method3407() {
		return Static49.anInt5279 == 0 ? Static58.aClass1_Sub31_Sub3_1.method4711() : true;
	}

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "(II)I")
	public static int method3411(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 >>> 1;
		@Pc(18) int local18 = local12 | local12 >>> 1;
		@Pc(24) int local24 = local18 | local18 >>> 2;
		@Pc(30) int local30 = local24 | local24 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return ~local42 & arg0;
	}

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "(B)V")
	public static void method3412() {
		Static83.aClass37_31.method919();
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IZIIILclient!rj;)V")
	public static void method3417(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class177 arg4) {
		if (Static58.anInt1391 >= 50 || (arg4 == null || arg4.anIntArrayArray44 == null || arg3 >= arg4.anIntArrayArray44.length || arg4.anIntArrayArray44[arg3] == null)) {
			return;
		}
		@Pc(34) int local34 = arg4.anIntArrayArray44[arg3][0];
		@Pc(38) int local38 = local34 >> 8;
		@Pc(44) int local44 = local34 >> 5 & 0x7;
		@Pc(48) int local48 = local34 & 0x1F;
		@Pc(70) int local70;
		if (arg4.anIntArrayArray44[arg3].length > 1) {
			local70 = (int) (Math.random() * (double) arg4.anIntArrayArray44[arg3].length);
			if (local70 > 0) {
				local38 = arg4.anIntArrayArray44[arg3][local70];
			}
		}
		if (local48 == 0) {
			if (arg1) {
				Static83.method1323(0, local38, local44, 255);
			}
		} else if (Static142.anInt2788 != 0) {
			Static128.anIntArray341[Static58.anInt1391] = local38;
			Static190.anIntArray377[Static58.anInt1391] = local44;
			Static353.anIntArray677[Static58.anInt1391] = 0;
			Static332.aClass110Array1[Static58.anInt1391] = null;
			Static85.anIntArray126[Static58.anInt1391] = 255;
			local70 = (arg2 - 64) / 128;
			@Pc(131) int local131 = (arg0 - 64) / 128;
			Static293.anIntArray569[Static58.anInt1391] = local48 + (local131 << 8) + (local70 << 16);
			Static58.anInt1391++;
		}
	}
}
