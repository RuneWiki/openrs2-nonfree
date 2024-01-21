import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
	public static int anInt2539;

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "Lclient!v;")
	private static Class76 aClass76_1200 = Static134.method2017("Cancel");

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "Lclient!v;")
	public static Class76 aClass76_1201 = Static134.method2017("M");

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "Lclient!v;")
	public static Class76 aClass76_1202 = Static134.method2017("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "Lclient!v;")
	public static Class76 aClass76_1203 = null;

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "Lclient!v;")
	public static Class76 aClass76_1204 = aClass76_1200;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZ)Lclient!ea;")
	public static Class4_Sub4_Sub2 method1780(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub4_Sub2 local10 = (Class4_Sub4_Sub2) Static31.aClass72_12.method1781((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static82.aClass17_27.method290(3, arg0);
		local10 = new Class4_Sub4_Sub2();
		if (local25 != null) {
			local10.method365(new Class4_Sub10(local25));
		}
		Static31.aClass72_12.method1783(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
	public static void method1782() {
		aClass76_1204 = null;
		aClass76_1201 = null;
		aClass76_1200 = null;
		aClass76_1203 = null;
		aClass76_1202 = null;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)Lclient!v;")
	public static Class76 method1785(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg1 - arg0;
		if (local12 < -9) {
			return Static100.aClass76_1059;
		} else if (local12 < -6) {
			return Static41.aClass76_488;
		} else if (local12 < -3) {
			return Static127.aClass76_1289;
		} else if (local12 < 0) {
			return Static54.aClass76_1196;
		} else if (local12 > 9) {
			return Static50.aClass76_566;
		} else if (local12 > 6) {
			return Static90.aClass76_948;
		} else if (local12 > 3) {
			return Static49.aClass76_558;
		} else if (local12 > 0) {
			return Static60.aClass76_661;
		} else {
			return Static6.aClass76_52;
		}
	}
}
