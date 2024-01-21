import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "Lclient!hb;")
	public static Class27 aClass27_3;

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "[I")
	public static int[] anIntArray240;

	@OriginalMember(owner = "client!qa", name = "t", descriptor = "I")
	public static int anInt2146;

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "Lclient!he;")
	public static Class11 aClass11_51;

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "[Lclient!va;")
	public static Class61[] aClass61Array11 = new Class61[100];

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "Lclient!va;")
	private static Class61 aClass61_853 = Static88.method1421("Too many connections from your address)3");

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "Lclient!va;")
	public static Class61 aClass61_854 = aClass61_853;

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "I")
	public static int anInt2144 = 0;

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "Lclient!i;")
	public static Class29 aClass29_58 = new Class29(64);

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "Lclient!va;")
	public static Class61 aClass61_855 = Static88.method1421(": ");

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)Z")
	public static boolean method1246() {
		@Pc(5) Class51 local5 = Static57.aClass51_1;
		synchronized (Static57.aClass51_1) {
			if (Static23.anInt760 == Static96.anInt2450) {
				return false;
			} else {
				Static35.anInt1022 = Static29.anIntArray95[Static96.anInt2450];
				Static100.anInt2667 = Static80.anIntArray242[Static96.anInt2450];
				Static96.anInt2450 = Static96.anInt2450 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V")
	public static void method1247() {
		Static76.anInt2037 = -1;
		Static50.anInt1405 = -1;
		Static23.anInt747 = 0;
		Static96.anInt2447 = -1;
		Static5.anInt34 = 0;
		Static50.aClass10_Sub10_Sub1_3.anInt1957 = 0;
		Static82.aBoolean97 = false;
		Static55.aClass10_Sub10_Sub1_4.anInt1957 = 0;
		Static33.anInt988 = 0;
		Static47.anInt1308 = -1;
		Static19.anInt628 = 0;
		Static35.anInt1020 = 0;
		Static1.anInt2 = 0;
		Static50.method780(30);
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(B)V")
	public static void method1253() {
		aClass61_854 = null;
		aClass27_3 = null;
		aClass29_58 = null;
		anIntArray240 = null;
		aClass61Array11 = null;
		aClass11_51 = null;
		aClass61_855 = null;
		aClass61_853 = null;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IZ)V")
	public static void method1254(@OriginalArg(1) boolean arg0) {
		Static46.anInt1284++;
		if (Static46.anInt1284 < 50 && !arg0) {
			return;
		}
		Static46.anInt1284 = 0;
		if (Static60.aBoolean79 || Static99.aClass27_4 == null) {
			return;
		}
		Static50.aClass10_Sub10_Sub1_3.method1167(139);
		try {
			Static99.aClass27_4.method613(Static50.aClass10_Sub10_Sub1_3.aByteArray9, Static50.aClass10_Sub10_Sub1_3.anInt1957);
			Static50.aClass10_Sub10_Sub1_3.anInt1957 = 0;
		} catch (@Pc(40) IOException local40) {
			Static60.aBoolean79 = true;
		}
	}
}
