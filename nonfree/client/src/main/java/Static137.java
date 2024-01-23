import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "Lclient!hc;")
	public static Class51 aClass51_45;

	@OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
	public static int anInt3321;

	@OriginalMember(owner = "client!lh", name = "q", descriptor = "I")
	public static int anInt3325;

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "J")
	public static volatile long aLong106 = 0L;

	@OriginalMember(owner = "client!lh", name = "n", descriptor = "Z")
	public static boolean aBoolean177 = false;

	@OriginalMember(owner = "client!lh", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString215 = "Loaded world list data";

	@OriginalMember(owner = "client!lh", name = "s", descriptor = "Z")
	public static boolean aBoolean178 = false;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(BII[Lclient!jb;II[BIZII)V")
	public static void method2501(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class65[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		@Pc(18) Class1_Sub13 local18 = new Class1_Sub13(arg5);
		@Pc(20) int local20 = -1;
		while (true) {
			@Pc(24) int local24 = local18.method1788();
			if (local24 == 0) {
				return;
			}
			local20 += local24;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local18.method1780();
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(51) int local51 = local32 & 0x3F;
				@Pc(57) int local57 = local32 >> 6 & 0x3F;
				@Pc(61) int local61 = local32 >> 12;
				@Pc(65) int local65 = local18.method1772();
				@Pc(69) int local69 = local65 & 0x3;
				@Pc(73) int local73 = local65 >> 2;
				if (arg6 == local61 && arg8 <= local57 && local57 < arg8 + 8 && local51 >= arg3 && local51 < arg3 + 8) {
					@Pc(104) Class31 local104 = Static77.method1518(local20);
					@Pc(121) int local121 = arg7 + Static255.method4132(local104.anInt1331, local69, local57 & 0x7, arg0, local51 & 0x7, local104.anInt1321);
					@Pc(139) int local139 = arg4 + Static145.method2635(local51 & 0x7, arg0, local104.anInt1331, local57 & 0x7, local69, local104.anInt1321);
					if (local121 > 0 && local139 > 0 && local121 < 103 && local139 < 103) {
						@Pc(154) Class65 local154 = null;
						@Pc(158) int local158 = arg1;
						if ((Static145.aByteArrayArrayArray13[1][local121][local139] & 0x2) == 2) {
							local158 = arg1 - 1;
						}
						if (local158 >= 0) {
							local154 = arg2[local158];
						}
						Static24.method482(true, local154, local139, arg1, local73, local121, arg1, local69 + arg0 & 0x3, local20);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V")
	public static void method2502() {
		Static171.aClass1_Sub13_Sub1_3.method1825(7);
		Static171.aClass1_Sub13_Sub1_3.method1770(0L);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIII)V")
	public static void method2506(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static171.anInt3982 == 1) {
			Static51.aClass1_Sub2_Sub4Array6[Static24.anInt805 / 100].method892(Static266.anInt5550 - 8, Static223.anInt4901 + -8);
		}
		if (Static171.anInt3982 == 2) {
			Static51.aClass1_Sub2_Sub4Array6[Static24.anInt805 / 100 + 4].method892(Static266.anInt5550 - 8, Static223.anInt4901 - 8);
		}
		Static28.method580();
	}
}
