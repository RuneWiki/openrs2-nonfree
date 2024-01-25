import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!wo", name = "l", descriptor = "Lclient!ac;")
	public static Class4 aClass4_10;

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "I")
	public static int anInt6682 = 0;

	@OriginalMember(owner = "client!wo", name = "d", descriptor = "[I")
	public static final int[] anIntArray851 = new int[4096];

	@OriginalMember(owner = "client!wo", name = "g", descriptor = "[I")
	public static final int[] anIntArray852 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!wo", name = "i", descriptor = "[I")
	public static final int[] anIntArray853 = new int[14];

	@OriginalMember(owner = "client!wo", name = "j", descriptor = "I")
	public static int anInt6688 = 0;

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(II)V")
	public static void method5696() {
		@Pc(1) Class103 local1 = Static283.aClass103_59;
		synchronized (Static283.aClass103_59) {
			Static283.aClass103_59.method2679(5);
		}
		local1 = Static41.aClass103_12;
		synchronized (Static41.aClass103_12) {
			Static41.aClass103_12.method2679(5);
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)V")
	public static void method5697() {
		Static182.aClass103_31.method2684();
		Static138.aClass103_27.method2684();
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IILclient!ap;)Ljava/lang/String;")
	public static String method5698(@OriginalArg(2) Class7_Sub3 arg0) {
		try {
			@Pc(9) int local9 = arg0.method2732();
			if (local9 > 32767) {
				local9 = 32767;
			}
			@Pc(22) byte[] local22 = new byte[local9];
			arg0.anInt3005 += Static169.aClass101_1.method2646(local22, arg0.aByteArray33, local9, arg0.anInt3005, 0);
			return Static74.method1483(local22, local9, 0);
		} catch (@Pc(48) Exception local48) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZI)V")
	public static void method5700(@OriginalArg(1) int arg0) {
		@Pc(8) Class7_Sub1_Sub15 local8 = Static315.method5104(1, arg0);
		local8.method4788();
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IC)Z")
	public static boolean method5701(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(34) char[] local34 = Static36.aCharArray1;
			for (@Pc(36) int local36 = 0; local36 < local34.length; local36++) {
				@Pc(42) char local42 = local34[local36];
				if (arg0 == local42) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IZLclient!hq;BLclient!pe;II)V")
	public static void method5702(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class94 arg2, @OriginalArg(4) Class89 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1) {
			Static326.aClass52_29.method4123((Static128.anInt2823 - Static326.aClass52_29.method4141()) / 2, (Static214.anInt4266 - Static326.aClass52_29.method4140()) / 2);
			Static149.aClass52_17.method4123((Static128.anInt2823 - Static149.aClass52_17.method4141()) / 2, 18);
		}
		arg2.method5687(-1, Static345.anInt6530 == 1 ? Static203.aString262 : Static140.aString199, arg0, Static214.anInt4266 / 2 - 26, Static128.anInt2823 / 2);
		@Pc(54) int local54 = Static214.anInt4266 / 2 - 18;
		arg3.method5481(Static128.anInt2823 / 2 - 152, local54, 304, 34, arg5, 0);
		arg3.method5481(Static128.anInt2823 / 2 - 151, local54 + 1, 302, 32, 0, 0);
		arg3.method5439(Static128.anInt2823 / 2 - 150, local54 + 2, Static100.anInt2433 * 3, 30, arg4, 0);
		arg3.method5439(Static128.anInt2823 / 2 + Static100.anInt2433 * 3 - 150, local54 - -2, 300 - Static100.anInt2433 * 3, 30, 0, 0);
		arg2.method5687(-1, Static74.aString136, arg0, Static214.anInt4266 / 2 + 4, Static128.anInt2823 / 2);
	}
}
