import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "Lclient!kh;")
	public static Class52_Sub1 aClass52_Sub1_25;

	@OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
	public static int anInt4049;

	@OriginalMember(owner = "client!vc", name = "o", descriptor = "Lclient!kh;")
	public static Class52_Sub1 aClass52_Sub1_26;

	@OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
	public static int anInt4051;

	@OriginalMember(owner = "client!vc", name = "r", descriptor = "[Lclient!ah;")
	public static Class3_Sub3_Sub2_Sub1[] aClass3_Sub3_Sub2_Sub1Array12;

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1997 = Static193.method3027("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1996 = aClass70_1997;

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "Z")
	public static boolean aBoolean183 = true;

	@OriginalMember(owner = "client!vc", name = "j", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1998 = Static193.method3027("Loaded wordpack");

	@OriginalMember(owner = "client!vc", name = "k", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1999 = Static193.method3027("gleiten:");

	@OriginalMember(owner = "client!vc", name = "l", descriptor = "Lclient!vc;")
	public static final Class94 aClass94_13 = new Class94(30);

	@OriginalMember(owner = "client!vc", name = "q", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_2000 = Static193.method3027("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!vc", name = "t", descriptor = "Lclient!oc;")
	public static Class70 aClass70_2001 = aClass70_1998;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
	public static void method3156() {
		for (@Pc(4) Class3_Sub27 local4 = (Class3_Sub27) Static87.aClass10_125.method267(); local4 != null; local4 = (Class3_Sub27) Static87.aClass10_125.method268()) {
			if (local4.aClass3_Sub19_Sub4_2 != null) {
				Static169.aClass3_Sub19_Sub3_2.method2923(local4.aClass3_Sub19_Sub4_2);
				local4.aClass3_Sub19_Sub4_2 = null;
			}
			if (local4.aClass3_Sub19_Sub4_3 != null) {
				Static169.aClass3_Sub19_Sub3_2.method2923(local4.aClass3_Sub19_Sub4_3);
				local4.aClass3_Sub19_Sub4_3 = null;
			}
		}
		Static87.aClass10_125.method262();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!oc;ZIILclient!oc;Lclient!oc;)V")
	public static void method3159(@OriginalArg(0) Class70 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class70 arg3, @OriginalArg(5) Class70 arg4) {
		for (@Pc(10) int local10 = 99; local10 > 0; local10--) {
			Static124.anIntArray330[local10] = Static124.anIntArray330[local10 - 1];
			Static106.aClass70Array40[local10] = Static106.aClass70Array40[local10 - 1];
			Static25.aClass70Array10[local10] = Static25.aClass70Array10[local10 - 1];
			Static22.aClass70Array8[local10] = Static22.aClass70Array8[local10 - 1];
			Static195.anIntArray343[local10] = Static195.anIntArray343[local10 - 1];
		}
		Static26.anInt551++;
		Static106.aClass70Array40[0] = arg3;
		Static25.aClass70Array10[0] = arg0;
		Static124.anIntArray330[0] = arg1;
		Static195.anIntArray343[0] = arg2;
		Static37.anInt3223 = Static86.anInt1703;
		Static22.aClass70Array8[0] = arg4;
	}
}
