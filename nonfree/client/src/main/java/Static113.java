import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!ne", name = "N", descriptor = "B")
	public static byte aByte4;

	@OriginalMember(owner = "client!ne", name = "ab", descriptor = "Lclient!j;")
	public static Class41 aClass41_2;

	@OriginalMember(owner = "client!ne", name = "db", descriptor = "J")
	public static long aLong92;

	@OriginalMember(owner = "client!ne", name = "O", descriptor = "Lclient!tg;")
	private static Class81 aClass81_934 = Static120.method2057(" from your friend list first)3");

	@OriginalMember(owner = "client!ne", name = "R", descriptor = "Lclient!tg;")
	public static Class81 aClass81_935 = Static120.method2057("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!ne", name = "T", descriptor = "[I")
	public static int[] anIntArray272 = new int[25];

	@OriginalMember(owner = "client!ne", name = "fb", descriptor = "Lclient!tg;")
	private static Class81 aClass81_939 = Static120.method2057("slide:");

	@OriginalMember(owner = "client!ne", name = "W", descriptor = "Lclient!tg;")
	public static Class81 aClass81_936 = aClass81_939;

	@OriginalMember(owner = "client!ne", name = "X", descriptor = "I")
	public static int anInt2566 = 0;

	@OriginalMember(owner = "client!ne", name = "Y", descriptor = "Lclient!tg;")
	public static Class81 aClass81_937 = Static120.method2057("<col=ffffff> )4 ");

	@OriginalMember(owner = "client!ne", name = "eb", descriptor = "Lclient!tg;")
	public static Class81 aClass81_938 = aClass81_934;

	@OriginalMember(owner = "client!ne", name = "gb", descriptor = "Lclient!tg;")
	public static Class81 aClass81_940 = aClass81_939;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method1994(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static157.aClass8_1);
		arg0.addMouseMotionListener(Static157.aClass8_1);
		arg0.addFocusListener(Static157.aClass8_1);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZZZII)Lclient!ud;")
	public static Class82_Sub1 method1995(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class66 local10 = null;
		if (Static158.aClass67_5 != null) {
			local10 = new Class66(arg3, Static158.aClass67_5, Static47.aClass67Array1[arg3], 1000000);
		}
		return new Class82_Sub1(local10, Static73.aClass66_2, arg3, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "(I)V")
	public static void method1996() {
		Static12.anImage44 = null;
		Static149.aFontMetrics1 = null;
		Static54.aFont1 = null;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IILclient!vb;)Z")
	public static boolean method1997(@OriginalArg(1) int arg0, @OriginalArg(2) Class82 arg1) {
		@Pc(8) byte[] local8 = arg1.method2952(arg0);
		if (local8 == null) {
			return false;
		} else {
			Static67.method1206(local8);
			return true;
		}
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(B)V")
	public static void method1998() {
		aClass41_2 = null;
		aClass81_934 = null;
		aClass81_939 = null;
		aClass81_940 = null;
		aClass81_936 = null;
		anIntArray272 = null;
		aClass81_937 = null;
		aClass81_938 = null;
		aClass81_935 = null;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!vb;I)V")
	public static void method1999(@OriginalArg(0) Class82 arg0) {
		Static9.aClass82_3 = arg0;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(Lclient!rh;B)Z")
	public static boolean method2000(@OriginalArg(0) Class77 arg0) {
		@Pc(2) int local2 = arg0.anInt3249;
		if (local2 == 205) {
			Static153.anInt3498 = 250;
			return true;
		}
		@Pc(29) int local29;
		@Pc(33) int local33;
		if (local2 >= 300 && local2 <= 313) {
			local29 = (local2 - 300) / 2;
			local33 = local2 & 0x1;
			Static33.aClass90_1.method3122(local33 == 1, local29);
		}
		if (local2 >= 314 && local2 <= 323) {
			local29 = (local2 - 314) / 2;
			local33 = local2 & 0x1;
			Static33.aClass90_1.method3123(local29, local33 == 1);
		}
		if (local2 == 324) {
			Static33.aClass90_1.method3124(false);
		}
		if (local2 == 325) {
			Static33.aClass90_1.method3124(true);
		}
		if (local2 == 326) {
			Static104.aClass1_Sub8_Sub1_2.method366(217);
			Static33.aClass90_1.method3125(Static104.aClass1_Sub8_Sub1_2);
			return true;
		} else {
			return false;
		}
	}
}
