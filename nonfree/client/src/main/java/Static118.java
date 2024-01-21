import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!ub", name = "M", descriptor = "Lclient!la;")
	public static Class17 aClass17_37;

	@OriginalMember(owner = "client!ub", name = "S", descriptor = "Lclient!la;")
	public static Class17 aClass17_38;

	@OriginalMember(owner = "client!ub", name = "V", descriptor = "Lclient!vd;")
	public static Class43 aClass43_1;

	@OriginalMember(owner = "client!ub", name = "W", descriptor = "Lclient!ie;")
	public static Class4_Sub4_Sub5_Sub2 aClass4_Sub4_Sub5_Sub2_5;

	@OriginalMember(owner = "client!ub", name = "H", descriptor = "Lclient!v;")
	public static Class76 aClass76_1214 = Static134.method2017("Die Verbindung konnte");

	@OriginalMember(owner = "client!ub", name = "I", descriptor = "I")
	public static int anInt2555 = 0;

	@OriginalMember(owner = "client!ub", name = "J", descriptor = "I")
	public static int anInt2556 = -1;

	@OriginalMember(owner = "client!ub", name = "K", descriptor = "Lclient!v;")
	private static Class76 aClass76_1215 = Static134.method2017("Your account has been disabled)3");

	@OriginalMember(owner = "client!ub", name = "N", descriptor = "Lclient!v;")
	public static Class76 aClass76_1216 = aClass76_1215;

	@OriginalMember(owner = "client!ub", name = "Q", descriptor = "Lclient!v;")
	public static Class76 aClass76_1217 = Static134.method2017("Null");

	@OriginalMember(owner = "client!ub", name = "R", descriptor = "Lclient!gf;")
	public static Class28 aClass28_13 = new Class28(32);

	@OriginalMember(owner = "client!ub", name = "U", descriptor = "[I")
	public static int[] anIntArray384 = new int[2000];

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "([BI)[B")
	public static byte[] method1795(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class4_Sub10 local4 = new Class4_Sub10(arg0);
		@Pc(17) int local17 = local4.method599();
		@Pc(21) int local21 = local4.method549();
		if (local21 < 0 || Static68.anInt1726 != 0 && local21 > Static68.anInt1726) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(40) byte[] local40 = new byte[local21];
			local4.method560(local40, local21);
			return local40;
		} else {
			@Pc(52) int local52 = local4.method549();
			if (local52 < 0 || Static68.anInt1726 != 0 && Static68.anInt1726 < local52) {
				throw new RuntimeException();
			}
			@Pc(69) byte[] local69 = new byte[local52];
			if (local17 == 1) {
				Static22.method338(local69, local52, arg0, local21);
			} else {
				Static19.aClass10_2.method150(local69, local4);
			}
			return local69;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZI)Lclient!kc;")
	public static Class4_Sub4_Sub9 method1796(@OriginalArg(1) int arg0) {
		@Pc(6) Class4_Sub4_Sub9 local6 = (Class4_Sub4_Sub9) Static32.aClass72_13.method1781((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static29.aClass17_7.method290(12, arg0);
		local6 = new Class4_Sub4_Sub9();
		if (local20 != null) {
			local6.method1029(new Class4_Sub10(local20));
		}
		local6.method1028();
		Static32.aClass72_13.method1783(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)I")
	public static int method1797(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg1 > 0) {
			arg1--;
			local12 = local12 << 1 | arg0 & 0x1;
			arg0 >>>= 0x1;
		}
		return local12;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
	public static void method1798() {
		aClass17_37 = null;
		aClass17_38 = null;
		aClass76_1216 = null;
		aClass28_13 = null;
		aClass76_1214 = null;
		anIntArray384 = null;
		aClass76_1217 = null;
		aClass4_Sub4_Sub5_Sub2_5 = null;
		aClass43_1 = null;
		aClass76_1215 = null;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZ)Lclient!o;")
	public static Class4_Sub4_Sub12 method1799(@OriginalArg(0) int arg0) {
		@Pc(15) Class4_Sub4_Sub12 local15 = (Class4_Sub4_Sub12) Static20.aClass72_9.method1781((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static103.aClass17_31.method290(8, arg0);
		local15 = new Class4_Sub4_Sub12();
		if (local25 != null) {
			local15.method1419(new Class4_Sub10(local25));
		}
		Static20.aClass72_9.method1783(local15, (long) arg0);
		return local15;
	}
}
