import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!k", name = "q", descriptor = "I")
	public static int anInt2689;

	@OriginalMember(owner = "client!k", name = "M", descriptor = "I")
	public static int anInt2698;

	@OriginalMember(owner = "client!k", name = "R", descriptor = "Lclient!cg;")
	public static Class22 aClass22_46;

	@OriginalMember(owner = "client!k", name = "m", descriptor = "Lclient!ul;")
	public static Class172 aClass172_23 = new Class172(64);

	@OriginalMember(owner = "client!k", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString91 = "Loaded config";

	@OriginalMember(owner = "client!k", name = "C", descriptor = "Z")
	public static boolean aBoolean173 = true;

	@OriginalMember(owner = "client!k", name = "L", descriptor = "[Lclient!wi;")
	public static Class186[] aClass186Array3 = new Class186[14];

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(III)V")
	public static void method2192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class4_Sub2_Sub15 local12 = Static131.method1210(arg0, 6);
		local12.method2876();
		local12.anInt3536 = arg1;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(JI)V")
	public static void method2193(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static149.anInt2911 >= 100 && !Static194.aBoolean243 || Static149.anInt2911 >= 200) {
			Static173.method2811(0, Static165.aString117, "");
			return;
		}
		@Pc(32) String local32 = Static94.method1558(arg0);
		@Pc(34) int local34;
		for (local34 = 0; local34 < Static149.anInt2911; local34++) {
			if (Static262.aLongArray9[local34] == arg0) {
				Static173.method2811(0, local32 + Static216.aString143, "");
				return;
			}
		}
		for (local34 = 0; local34 < Static15.anInt334; local34++) {
			if (Static229.aLongArray8[local34] == arg0) {
				Static173.method2811(0, Static266.aString176 + local32 + Static44.aString34, "");
				return;
			}
		}
		if (local32.equals(Static72.aClass13_Sub5_Sub1_1.aString148)) {
			Static173.method2811(0, Static37.aString85, "");
			return;
		}
		Static135.aStringArray15[Static149.anInt2911] = local32;
		Static262.aLongArray9[Static149.anInt2911] = arg0;
		Static73.anIntArray139[Static149.anInt2911] = 0;
		Static71.aStringArray8[Static149.anInt2911] = "";
		Static133.anIntArray225[Static149.anInt2911] = 0;
		Static39.aBooleanArray13[Static149.anInt2911] = false;
		Static149.anInt2911++;
		Static279.anInt5479 = Static131.anInt1441;
		Static175.aClass4_Sub24_Sub1_1.method3123(29);
		Static175.aClass4_Sub24_Sub1_1.method3079(arg0);
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(Z)V")
	public static void method2195() {
		if (Static174.anInt3541 == 0) {
			return;
		}
		try {
			if (++Static37.anInt2375 > 1500) {
				if (Static261.aClass91_3 != null) {
					Static261.aClass91_3.method2302();
					Static261.aClass91_3 = null;
				}
				if (Static263.anInt5160 >= 1) {
					Static140.anInt2773 = -5;
					Static174.anInt3541 = 0;
					return;
				}
				if (Static109.anInt2179 == Static254.anInt4972) {
					Static109.anInt2179 = Static43.anInt869;
				} else {
					Static109.anInt2179 = Static254.anInt4972;
				}
				Static37.anInt2375 = 0;
				Static263.anInt5160++;
				Static174.anInt3541 = 1;
			}
			if (Static174.anInt3541 == 1) {
				Static21.aClass119_1 = Static95.aClass184_3.method4611(Static109.anInt2179, Static68.aString68);
				Static174.anInt3541 = 2;
			}
			@Pc(125) int local125;
			if (Static174.anInt3541 == 2) {
				if (Static21.aClass119_1.anInt3695 == 2) {
					throw new IOException();
				}
				if (Static21.aClass119_1.anInt3695 != 1) {
					return;
				}
				Static261.aClass91_3 = new Class91((Socket) Static21.aClass119_1.anObject4, Static95.aClass184_3);
				Static21.aClass119_1 = null;
				Static261.aClass91_3.method2303(Static175.aClass4_Sub24_Sub1_1.anInt3822, Static175.aClass4_Sub24_Sub1_1.aByteArray47);
				if (Static100.aClass112_44 != null) {
					Static100.aClass112_44.method4464();
				}
				if (Static260.aClass112_115 != null) {
					Static260.aClass112_115.method4464();
				}
				local125 = Static261.aClass91_3.method2305();
				if (Static100.aClass112_44 != null) {
					Static100.aClass112_44.method4464();
				}
				if (Static260.aClass112_115 != null) {
					Static260.aClass112_115.method4464();
				}
				if (local125 != 101) {
					Static174.anInt3541 = 0;
					Static140.anInt2773 = local125;
					Static261.aClass91_3.method2302();
					Static261.aClass91_3 = null;
					return;
				}
				Static174.anInt3541 = 3;
			}
			if (Static174.anInt3541 == 3) {
				if (Static261.aClass91_3.method2300() >= 2) {
					local125 = Static261.aClass91_3.method2305() << 8 | Static261.aClass91_3.method2305();
					Static181.method4700(local125);
					if (Static250.anInt4906 == -1) {
						Static140.anInt2773 = 6;
						Static174.anInt3541 = 0;
						Static261.aClass91_3.method2302();
						Static261.aClass91_3 = null;
						return;
					}
					Static174.anInt3541 = 0;
					Static261.aClass91_3.method2302();
					Static261.aClass91_3 = null;
					Static240.method2128();
					return;
				}
				return;
			}
		} catch (@Pc(206) IOException local206) {
			if (Static261.aClass91_3 != null) {
				Static261.aClass91_3.method2302();
				Static261.aClass91_3 = null;
			}
			if (Static263.anInt5160 >= 1) {
				Static174.anInt3541 = 0;
				Static140.anInt2773 = -4;
			} else {
				Static263.anInt5160++;
				Static174.anInt3541 = 1;
				Static37.anInt2375 = 0;
				if (Static254.anInt4972 == Static109.anInt2179) {
					Static109.anInt2179 = Static43.anInt869;
				} else {
					Static109.anInt2179 = Static254.anInt4972;
				}
			}
		}
	}

	@OriginalMember(owner = "client!k", name = "c", descriptor = "(I)Lclient!ei;")
	public static Class25 method2196() {
		try {
			return new Class25_Sub2();
		} catch (@Pc(13) Throwable local13) {
			try {
				return (Class25) Class.forName("Class25_Sub3").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class25_Sub1();
			}
		}
	}
}
