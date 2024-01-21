import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
	public static int anInt475;

	@OriginalMember(owner = "client!kc", name = "T", descriptor = "[I")
	public static int[] anIntArray73;

	@OriginalMember(owner = "client!kc", name = "V", descriptor = "Lclient!oa;")
	public static Class9 aClass9_4;

	@OriginalMember(owner = "client!kc", name = "Y", descriptor = "[I")
	public static int[] anIntArray74;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
	public static final int anInt473 = 20;

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "Lclient!fe;")
	public static Class17 aClass17_21 = new Class17(30);

	@OriginalMember(owner = "client!kc", name = "U", descriptor = "Lclient!lc;")
	public static Class31 aClass31_161 = Static56.method1206("@cya@");

	@OriginalMember(owner = "client!kc", name = "W", descriptor = "Lclient!lc;")
	public static Class31 aClass31_162 = Static56.method1206("Password: ");

	@OriginalMember(owner = "client!kc", name = "ab", descriptor = "I")
	public static int anInt504 = 0;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)V")
	public static void method327() {
		Static76.anIntArrayArrayArray3 = new int[4][105][105];
		Static37.anIntArray223 = new int[104];
		Static49.aByteArrayArrayArray37 = new byte[4][104][104];
		Static76.anInt2263 = 99;
		Static103.anIntArray389 = new int[104];
		Static21.aByteArrayArrayArray12 = new byte[4][104][104];
		Static18.anIntArray97 = new int[104];
		Static39.anIntArrayArray49 = new int[105][105];
		Static63.aByteArrayArrayArray28 = new byte[4][104][104];
		Static77.aByteArrayArrayArray30 = new byte[4][105][105];
		Static54.anIntArray266 = new int[104];
		Static23.anIntArray113 = new int[104];
		Static95.aByteArrayArrayArray34 = new byte[4][104][104];
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)I")
	public static int method331(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg0 + arg1 * 57;
		@Pc(21) int local21 = local15 ^ local15 << 13;
		@Pc(35) int local35 = Integer.MAX_VALUE & local21 * (local21 * 15731 * local21 + 789221) + 1376312589;
		return local35 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(IB)Z")
	public static boolean method336(@OriginalArg(0) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!lc;ZLclient!lc;Lclient!kc;)[Lclient!cb;")
	public static Class2_Sub1_Sub3_Sub1[] method337(@OriginalArg(0) Class31 arg0, @OriginalArg(2) Class31 arg1, @OriginalArg(3) Class11 arg2) {
		@Pc(13) int local13 = arg2.method345(arg1);
		@Pc(19) int local19 = arg2.method334(local13, arg0);
		return Static95.method1606(arg2, local13, local19);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZI)V")
	public static void method343(@OriginalArg(0) boolean arg0) {
		Static15.anInt644++;
		if (Static15.anInt644 < 50 && !arg0) {
			return;
		}
		Static15.anInt644 = 0;
		if (Static45.aBoolean85 || Static89.aClass35_4 == null) {
			return;
		}
		Static20.aClass2_Sub6_Sub1_11.method684(217);
		try {
			Static89.aClass35_4.method1347(Static20.aClass2_Sub6_Sub1_11.anInt952, Static20.aClass2_Sub6_Sub1_11.aByteArray11);
			Static20.aClass2_Sub6_Sub1_11.anInt952 = 0;
		} catch (@Pc(43) IOException local43) {
			Static45.aBoolean85 = true;
		}
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)V")
	public static void method349() {
		@Pc(5) Object local5 = Static23.anObject1;
		synchronized (Static23.anObject1) {
			if (Static42.anInt1582 == 0) {
				Static51.aClass51_2.method1467(5, new Class24());
			}
			Static42.anInt1582 = 600;
		}
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)V")
	public static void method351() {
		aClass31_161 = null;
		anIntArray74 = null;
		aClass31_162 = null;
		aClass9_4 = null;
		anIntArray73 = null;
		aClass17_21 = null;
	}
}
