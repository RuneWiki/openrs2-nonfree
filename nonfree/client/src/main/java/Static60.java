import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "Lclient!hc;")
	public static Class51 aClass51_22;

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
	public static int anInt1650 = 0;

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "Z")
	public static boolean aBoolean92 = false;

	@OriginalMember(owner = "client!ei", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString96 = "";

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(III)J")
	public static long method1145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub16 local7 = Static142.aClass1_Sub16ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt2929; local13++) {
			@Pc(19) Class47 local19 = local7.aClass47Array1[local13];
			if ((local19.aLong73 >> 29 & 0x3L) == 2L && local19.anInt2146 == arg1 && local19.anInt2148 == arg2) {
				return local19.aLong73;
			}
		}
		return 0L;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIILjava/lang/String;)V")
	public static void method1146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3) {
		@Pc(13) Class122 local13 = Static106.method2192(arg2, arg1);
		if (local13 == null) {
			return;
		}
		if (local13.anObjectArray29 != null) {
			@Pc(23) Class1_Sub30 local23 = new Class1_Sub30();
			local23.anInt5447 = arg0;
			local23.aString385 = arg3;
			local23.aClass122_18 = local13;
			local23.anObjectArray32 = local13.anObjectArray29;
			Static153.method2746(local23);
		}
		@Pc(41) boolean local41 = true;
		if (local13.anInt4672 > 0) {
			local41 = Static107.method2202(local13);
		}
		if (!local41 || !Static39.method702(local13).method3655(arg0 - 1)) {
			return;
		}
		if (arg0 == 1) {
			Static171.aClass1_Sub13_Sub1_3.method1825(50);
			Static171.aClass1_Sub13_Sub1_3.method1754(arg1);
			Static171.aClass1_Sub13_Sub1_3.method1789(arg2);
		}
		if (arg0 == 2) {
			Static171.aClass1_Sub13_Sub1_3.method1825(19);
			Static171.aClass1_Sub13_Sub1_3.method1754(arg1);
			Static171.aClass1_Sub13_Sub1_3.method1789(arg2);
		}
		if (arg0 == 3) {
			Static171.aClass1_Sub13_Sub1_3.method1825(65);
			Static171.aClass1_Sub13_Sub1_3.method1754(arg1);
			Static171.aClass1_Sub13_Sub1_3.method1789(arg2);
		}
		if (arg0 == 4) {
			Static171.aClass1_Sub13_Sub1_3.method1825(187);
			Static171.aClass1_Sub13_Sub1_3.method1754(arg1);
			Static171.aClass1_Sub13_Sub1_3.method1789(arg2);
		}
		if (arg0 == 5) {
			Static171.aClass1_Sub13_Sub1_3.method1825(84);
			Static171.aClass1_Sub13_Sub1_3.method1754(arg1);
			Static171.aClass1_Sub13_Sub1_3.method1789(arg2);
		}
		if (arg0 == 6) {
			Static171.aClass1_Sub13_Sub1_3.method1825(166);
			Static171.aClass1_Sub13_Sub1_3.method1754(arg1);
			Static171.aClass1_Sub13_Sub1_3.method1789(arg2);
		}
		if (arg0 == 7) {
			Static171.aClass1_Sub13_Sub1_3.method1825(43);
			Static171.aClass1_Sub13_Sub1_3.method1754(arg1);
			Static171.aClass1_Sub13_Sub1_3.method1789(arg2);
		}
		if (arg0 == 8) {
			Static171.aClass1_Sub13_Sub1_3.method1825(55);
			Static171.aClass1_Sub13_Sub1_3.method1754(arg1);
			Static171.aClass1_Sub13_Sub1_3.method1789(arg2);
		}
		if (arg0 == 9) {
			Static171.aClass1_Sub13_Sub1_3.method1825(229);
			Static171.aClass1_Sub13_Sub1_3.method1754(arg1);
			Static171.aClass1_Sub13_Sub1_3.method1789(arg2);
		}
		if (arg0 == 10) {
			Static171.aClass1_Sub13_Sub1_3.method1825(70);
			Static171.aClass1_Sub13_Sub1_3.method1754(arg1);
			Static171.aClass1_Sub13_Sub1_3.method1789(arg2);
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)I")
	public static int method1147() {
		return 15;
	}
}
