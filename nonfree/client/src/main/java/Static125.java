import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!nh", name = "A", descriptor = "[S")
	public static short[] aShortArray49;

	@OriginalMember(owner = "client!nh", name = "F", descriptor = "I")
	public static int anInt3097;

	@OriginalMember(owner = "client!nh", name = "v", descriptor = "I")
	public static int anInt3092 = 0;

	@OriginalMember(owner = "client!nh", name = "P", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1749 = Static118.method2249("Prepared visibility map");

	@OriginalMember(owner = "client!nh", name = "w", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1746 = aClass65_1749;

	@OriginalMember(owner = "client!nh", name = "E", descriptor = "[Lclient!oc;")
	public static final Class65[] aClass65Array41 = new Class65[200];

	@OriginalMember(owner = "client!nh", name = "I", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1747 = Static118.method2249("Fps:");

	@OriginalMember(owner = "client!nh", name = "K", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1748 = Static118.method2249("Starte 3D)2Softwarebibliothek");

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(JI)V")
	public static void method2375(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static29.anInt859 >= 100) {
			Static31.method603(0, Static117.aClass65_1665, Static123.aClass65_1737);
			return;
		}
		@Pc(31) Class65 local31 = Static134.method2558(arg0).method2488();
		for (@Pc(33) int local33 = 0; local33 < Static29.anInt859; local33++) {
			if (arg0 == Static197.aLongArray9[local33]) {
				Static31.method603(0, Static117.aClass65_1665, Static109.method2004(new Class65[] { local31, Static42.aClass65_690 }));
				return;
			}
		}
		for (@Pc(67) int local67 = 0; local67 < Static33.anInt973; local67++) {
			if (Static206.aLongArray10[local67] == arg0) {
				Static31.method603(0, Static117.aClass65_1665, Static109.method2004(new Class65[] { Static42.aClass65_687, local31, Static28.aClass65_593 }));
				return;
			}
		}
		if (local31.method2470(Static201.aClass6_Sub4_Sub1_3.aClass65_479)) {
			Static31.method603(0, Static117.aClass65_1665, Static126.aClass65_1757);
			return;
		}
		Static197.aLongArray9[Static29.anInt859] = arg0;
		Static149.aClass65Array47[Static29.anInt859++] = Static134.method2558(arg0);
		Static68.anInt1494 = Static1.anInt4459;
		Static45.aClass1_Sub14_Sub1_8.method1761(106);
		Static45.aClass1_Sub14_Sub1_8.method1721(arg0);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIII)V")
	public static void method2376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(4) Class97 local4 = Static173.method2926(arg0, arg2);
		if (local4 != null && local4.anObjectArray14 != null) {
			@Pc(13) Class1_Sub26 local13 = new Class1_Sub26();
			local13.aClass97_14 = local4;
			local13.anObjectArray3 = local4.anObjectArray14;
			Static94.method1780(local13);
		}
		Static83.anInt2029 = arg2;
		Static54.anInt3676 = arg0;
		Static50.anInt1407 = arg1;
		Static138.aBoolean138 = true;
		Static25.method448(local4);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!ri;")
	public static RuntimeException_Sub1 method2380(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString4 = local12.aString4 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZIIII)V")
	public static void method2381(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(17) int local17 = Static100.method1896(Static133.anInt3309, arg2, Static206.anInt4385);
		@Pc(23) int local23 = Static100.method1896(Static133.anInt3309, arg1, Static206.anInt4385);
		@Pc(29) int local29 = Static100.method1896(Static23.anInt685, arg4, Static71.anInt1744);
		@Pc(35) int local35 = Static100.method1896(Static23.anInt685, arg3, Static71.anInt1744);
		for (@Pc(37) int local37 = local17; local37 <= local23; local37++) {
			Static51.method893(arg0, Static40.anIntArrayArray11[local37], local35, local29);
		}
	}
}
