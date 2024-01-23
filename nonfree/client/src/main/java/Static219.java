import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
	public static int anInt4587;

	@OriginalMember(owner = "client!qk", name = "l", descriptor = "[[Lclient!mn;")
	public static Class115[][] aClass115ArrayArray1;

	@OriginalMember(owner = "client!qk", name = "m", descriptor = "Lclient!pe;")
	public static Class135 aClass135_7;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "[I")
	public static int[] anIntArray378 = new int[50];

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "Z")
	public static boolean aBoolean384 = false;

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "Z")
	public static boolean aBoolean385 = false;

	@OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
	public static int anInt4589 = 0;

	@OriginalMember(owner = "client!qk", name = "k", descriptor = "Lclient!a;")
	public static Class1 aClass1_17 = new Class1();

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(III)J")
	public static long method3696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub31 local7 = Static180.aClass2_Sub31ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass65_1 == null ? 0L : local7.aClass65_1.aLong104;
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(III)I")
	public static int method3697(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = 0;
		while (arg0 > 0) {
			local18 = arg1 & 0x1 | local18 << 1;
			arg1 >>>= 0x1;
			arg0--;
		}
		return local18;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "([SI)[S")
	public static short[] method3698(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(21) short[] local21 = new short[arg0.length];
			Static301.method300(arg0, 0, local21, 0, arg0.length);
			return local21;
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method3699(@OriginalArg(0) long arg0) {
		return Static21.method454(arg0);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)V")
	public static void method3700(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static180.aClass2_Sub31ArrayArrayArray2 = Static102.aClass2_Sub31ArrayArrayArray1;
			Static141.anIntArrayArrayArray4 = Static144.anIntArrayArrayArray5;
			Static73.aClass2_Sub12ArrayArray1 = Static284.aClass2_Sub12ArrayArray3;
		} else {
			Static180.aClass2_Sub31ArrayArrayArray2 = Static272.aClass2_Sub31ArrayArrayArray3;
			Static141.anIntArrayArrayArray4 = Static274.anIntArrayArrayArray14;
			Static73.aClass2_Sub12ArrayArray1 = Static103.aClass2_Sub12ArrayArray2;
		}
		Static63.anInt1426 = Static180.aClass2_Sub31ArrayArrayArray2.length;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!li;Lclient!jd;BLclient!jd;)V")
	public static void method3701(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(3) Class84 arg2) {
		Static121.anInterface3_1 = arg0;
		Static296.aClass84_134 = arg2;
		Static203.aClass84_86 = arg1;
		if (Static296.aClass84_134 != null) {
			Static165.anInt3459 = Static296.aClass84_134.method2116(1);
		}
		if (Static203.aClass84_86 != null) {
			Static199.anInt4145 = Static203.aClass84_86.method2116(1);
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIB)Ljava/lang/String;")
	public static String method3702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 - arg1;
		if (local4 < -9) {
			return "<col=ff0000>";
		} else if (local4 < -6) {
			return "<col=ff3000>";
		} else if (local4 < -3) {
			return "<col=ff7000>";
		} else if (local4 < 0) {
			return "<col=ffb000>";
		} else if (local4 > 9) {
			return "<col=00ff00>";
		} else if (local4 > 6) {
			return "<col=40ff00>";
		} else if (local4 <= 3) {
			return local4 > 0 ? "<col=c0ff00>" : "<col=ffff00>";
		} else {
			return "<col=80ff00>";
		}
	}
}
