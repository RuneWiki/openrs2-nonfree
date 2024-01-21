import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!hb", name = "dc", descriptor = "Lclient!w;")
	public static Class55_Sub1 aClass55_Sub1_6;

	@OriginalMember(owner = "client!hb", name = "jc", descriptor = "I")
	public static int anInt1279;

	@OriginalMember(owner = "client!hb", name = "kc", descriptor = "Lclient!hd;")
	public static Class1_Sub1_Sub6_Sub1 aClass1_Sub1_Sub6_Sub1_3;

	@OriginalMember(owner = "client!hb", name = "sc", descriptor = "Lclient!mb;")
	public static Class1_Sub1_Sub6_Sub3 aClass1_Sub1_Sub6_Sub3_11;

	@OriginalMember(owner = "client!hb", name = "ac", descriptor = "Lclient!gd;")
	public static Class23 aClass23_636 = Static15.method178("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!hb", name = "bc", descriptor = "Z")
	public static boolean aBoolean66 = false;

	@OriginalMember(owner = "client!hb", name = "fc", descriptor = "Z")
	public static boolean aBoolean67 = false;

	@OriginalMember(owner = "client!hb", name = "gc", descriptor = "I")
	public static int anInt1277 = 0;

	@OriginalMember(owner = "client!hb", name = "ic", descriptor = "Lclient!gd;")
	public static Class23 aClass23_637 = Static15.method178("(Y");

	@OriginalMember(owner = "client!hb", name = "qc", descriptor = "I")
	public static int anInt1284 = 0;

	@OriginalMember(owner = "client!hb", name = "vc", descriptor = "Lclient!gd;")
	private static Class23 aClass23_639 = Static15.method178("glow1:");

	@OriginalMember(owner = "client!hb", name = "rc", descriptor = "Lclient!gd;")
	public static Class23 aClass23_638 = aClass23_639;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLclient!v;)V")
	public static void method732(@OriginalArg(1) Class66 arg0) {
		Static60.aClass66_1 = arg0;
	}

	@OriginalMember(owner = "client!hb", name = "o", descriptor = "(B)V")
	public static void method737() {
		aClass23_638 = null;
		aClass23_637 = null;
		aClass23_639 = null;
		aClass55_Sub1_6 = null;
		aClass23_636 = null;
		aClass1_Sub1_Sub6_Sub3_11 = null;
		aClass1_Sub1_Sub6_Sub1_3 = null;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILclient!rb;)Z")
	public static boolean method738(@OriginalArg(0) int arg0, @OriginalArg(2) Class55 arg1) {
		@Pc(13) byte[] local13 = arg1.method1871(arg0);
		if (local13 == null) {
			return false;
		} else {
			Static7.method92(local13);
			return true;
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(IZ)V")
	public static void method740(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub14 local10 = (Class1_Sub14) Static7.aClass14_2.method343((long) arg0);
		if (local10 != null) {
			for (@Pc(15) int local15 = 0; local15 < local10.anIntArray407.length; local15++) {
				local10.anIntArray407[local15] = -1;
				local10.anIntArray408[local15] = 0;
			}
		}
	}
}
