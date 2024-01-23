import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!bi", name = "s", descriptor = "I")
	public static int anInt412;

	@OriginalMember(owner = "client!bi", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString1;

	@OriginalMember(owner = "client!bi", name = "t", descriptor = "Lclient!hh;")
	public static Class50 aClass50_162 = Static186.method3527("(U0a )2 via: ");

	@OriginalMember(owner = "client!bi", name = "x", descriptor = "Lclient!hh;")
	public static Class50 aClass50_163 = Static186.method3527("<col=ff0000>");

	@OriginalMember(owner = "client!bi", name = "z", descriptor = "I")
	public static int anInt417 = -1;

	@OriginalMember(owner = "client!bi", name = "B", descriptor = "I")
	public static int anInt418 = 0;

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(B)V")
	public static void method299() {
		if (Static83.aBoolean101) {
			Static83.aBoolean101 = false;
			Static24.aClass78_1 = null;
			Static224.aClass1_Sub1_Sub8_2 = null;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)V")
	public static void method300() {
		Static10.aClass84_9.method2576();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(III[B)Lclient!hh;")
	public static Class50 method301(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(9) Class50 local9 = new Class50();
		local9.anInt1705 = 0;
		local9.aByteArray12 = new byte[arg0];
		for (@Pc(27) int local27 = arg1; local27 < arg0 + arg1; local27++) {
			if (arg2[local27] != 0) {
				local9.aByteArray12[local9.anInt1705++] = arg2[local27];
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(JB)Lclient!hh;")
	public static Class50 method302(@OriginalArg(0) long arg0) {
		return Static136.method1037(arg0);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IB)Z")
	public static boolean method303(@OriginalArg(0) int arg0) {
		return arg0 == 198 || arg0 == 230 || arg0 == 156 || arg0 == 140 || arg0 == 223;
	}

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "(I)V")
	public static void method305() {
		for (@Pc(12) Class1_Sub4 local12 = (Class1_Sub4) Static76.aClass75_9.method2239(); local12 != null; local12 = (Class1_Sub4) Static76.aClass75_9.method2238()) {
			if (local12.anInt369 == -1) {
				local12.anInt357 = 0;
				Static203.method535(local12);
			} else {
				local12.method3525();
			}
		}
	}
}
