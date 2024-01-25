import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "Lclient!mp;")
	public static Class30 aClass30_5;

	@OriginalMember(owner = "client!kh", name = "r", descriptor = "I")
	public static int anInt3453;

	@OriginalMember(owner = "client!kh", name = "u", descriptor = "I")
	public static int anInt3456;

	@OriginalMember(owner = "client!kh", name = "E", descriptor = "[Lclient!wa;")
	public static Class210[] aClass210Array1;

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "Lclient!hj;")
	public static final Class14_Sub4_Sub2 aClass14_Sub4_Sub2_3 = new Class14_Sub4_Sub2(5000);

	@OriginalMember(owner = "client!kh", name = "q", descriptor = "Lclient!rm;")
	public static final Class178 aClass178_7 = new Class178(16);

	@OriginalMember(owner = "client!kh", name = "v", descriptor = "I")
	public static int anInt3457 = -1;

	@OriginalMember(owner = "client!kh", name = "w", descriptor = "I")
	public static int anInt3458 = 0;

	@OriginalMember(owner = "client!kh", name = "z", descriptor = "S")
	public static short aShort50 = 320;

	@OriginalMember(owner = "client!kh", name = "B", descriptor = "I")
	public static int anInt3460 = -1;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)I")
	public static int method3265() {
		return ((Static345.anInt6584 == 0 ? 0 : 1) << 21) + (Static228.anInt4497 << 17) + ((Static153.aBoolean212 ? 1 : 0) << 10) + ((Static281.aBoolean353 ? 1 : 0) << 8) + ((Static53.aBoolean87 ? 1 : 0) << 6) + ((Static29.aBoolean312 ? 1 : 0) << 4) + ((Static266.aBoolean339 ? 1 : 0) << 3) + (Static85.anInt2078 & 0x7) + ((Static323.aBoolean52 ? 1 : 0) << 5) + ((Static27.aBoolean30 ? 1 : 0) << 9) + (((Static109.anInt2428 & 0x3) << 11) - (-((Static9.aBoolean10 ? 1 : 0) << 13) - ((Static185.aBoolean242 ? 1 : 0) << 15) + -((Static134.aBoolean191 ? 1 : 0) << 16) + -((Static181.aBoolean239 ? 1 : 0) << 19))) + ((Static282.anInt5377 == 0 ? 0 : 1) << 20) + ((Static78.anInt1894 == 0 ? 0 : 1) << 22) + (Static83.method5758() << 23) + (Static232.anInt2218 << 25) + ((Static267.aBoolean340 ? 1 : 0) << 27) + (Static203.anInt6246 << 28);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)V")
	public static void method3266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class213 local7 = Static98.aClass213ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 != null && local7.aClass10_Sub5_1 != null) {
			local7.aClass10_Sub5_1 = null;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method3267(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local10 = (local10 << 5) + arg0.charAt(local17) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IB)V")
	public static void method3269(@OriginalArg(0) int arg0) {
		if (Static126.method2624(arg0)) {
			Static218.method3935(-1, Static182.aClass146ArrayArray1[arg0]);
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
	public static void method3270() {
		if (!Static184.aBoolean241) {
			return;
		}
		@Pc(16) Class146 local16 = Static70.method1717(Static88.anInt2109, Static188.anInt3867);
		if (local16 != null && local16.anObjectArray7 != null) {
			@Pc(25) Class14_Sub15 local25 = new Class14_Sub15();
			local25.aClass146_22 = local16;
			local25.anObjectArray3 = local16.anObjectArray7;
			Static10.method223(local25);
		}
		Static184.aBoolean241 = false;
		Static288.anInt5579 = -1;
		Static166.method3295(local16);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IC)Z")
	public static boolean method3271(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
