import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!vm", name = "v", descriptor = "I")
	public static int anInt6528;

	@OriginalMember(owner = "client!vm", name = "G", descriptor = "Lclient!ct;")
	public static Class30 aClass30_101;

	@OriginalMember(owner = "client!vm", name = "H", descriptor = "I")
	public static int anInt6538;

	@OriginalMember(owner = "client!vm", name = "L", descriptor = "Lclient!sd;")
	public static Class13 aClass13_4;

	@OriginalMember(owner = "client!vm", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString60 = null;

	@OriginalMember(owner = "client!vm", name = "I", descriptor = "I")
	public static int anInt6539 = 0;

	@OriginalMember(owner = "client!vm", name = "K", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray42 = new String[100];

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(II)V")
	public static void method5746(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub4_Sub17 local8 = Static132.method2717(arg0, 1);
		local8.method3481();
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(II)I")
	public static int method5749(@OriginalArg(0) int arg0) {
		if (Static165.aClass76_2 != null) {
			Static165.aClass76_2.method2377();
			Static165.aClass76_2 = null;
		}
		Static41.anInt984++;
		if (Static41.anInt984 > 4) {
			Static257.anInt1057 = 0;
			Static41.anInt984 = 0;
			return arg0;
		}
		if (Static225.anInt4520 == anInt6538) {
			Static225.anInt4520 = Static293.anInt4949;
		} else {
			Static225.anInt4520 = anInt6538;
		}
		Static257.anInt1057 = 0;
		return -1;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(ZII)I")
	public static int method5750(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static42.anIntArray73[arg0 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "(II)Lclient!k;")
	public static Class109 method5752(@OriginalArg(1) int arg0) {
		@Pc(5) Class21 local5 = Static163.aClass21_93;
		@Pc(14) Class109 local14;
		synchronized (Static163.aClass21_93) {
			local14 = (Class109) Static163.aClass21_93.method854((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(39) byte[] local39 = aClass30_101.method1161(method5754(arg0), Static101.method2223(arg0));
		local14 = new Class109();
		local14.anInt3257 = arg0;
		if (local39 != null) {
			local14.method2989(new Class1_Sub7(local39));
		}
		@Pc(57) Class21 local57 = Static163.aClass21_93;
		synchronized (Static163.aClass21_93) {
			Static163.aClass21_93.method843(local14, (long) arg0);
			return local14;
		}
	}

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "(II)I")
	private static int method5754(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!vm", name = "h", descriptor = "(I)V")
	public static void method5755() {
		if (Static351.aBoolean199) {
			return;
		}
		Static351.aBoolean199 = true;
		if (Static41.aBoolean62) {
			Static332.aFloat62 = (int) Static332.aFloat62 + 47 & 0xFFFFFFF0;
		} else {
			Static118.aFloat22 += (12.0F - Static118.aFloat22) / 2.0F;
		}
		Static195.aBoolean294 = true;
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(IB)V")
	public static void method5756(@OriginalArg(0) int arg0) {
		Static13.anInt331 = arg0;
		@Pc(12) Class21 local12 = Static93.aClass21_135;
		synchronized (Static93.aClass21_135) {
			Static93.aClass21_135.method857();
		}
	}
}
