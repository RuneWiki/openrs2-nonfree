import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!va", name = "t", descriptor = "F")
	public static float aFloat77;

	@OriginalMember(owner = "client!va", name = "v", descriptor = "Lclient!tq;")
	public static Class191 aClass191_210;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "Lclient!va;")
	public static final Class199 aClass199_30 = new Class199(8);

	@OriginalMember(owner = "client!va", name = "e", descriptor = "[Lclient!di;")
	public static final Class2_Sub11_Sub1[] aClass2_Sub11_Sub1Array3 = new Class2_Sub11_Sub1[14];

	@OriginalMember(owner = "client!va", name = "u", descriptor = "[Z")
	public static final boolean[] aBooleanArray31 = new boolean[100];

	@OriginalMember(owner = "client!va", name = "x", descriptor = "[I")
	public static final int[] anIntArray481 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BJ)V")
	public static void method5741(@OriginalArg(1) long arg0) {
		if (Static275.aClass8ArrayArrayArray4 != null) {
			if (Static182.anInt3602 == 1 || Static182.anInt3602 == 5) {
				Static285.method5106(arg0);
			} else if (Static182.anInt3602 == 4) {
				Static29.method763(arg0);
			}
		}
		Static15.method628((long) Static212.anInt4090, Static147.aClass4_2);
		if (Static111.anInt2471 != -1) {
			Static34.method804(Static111.anInt2471);
		}
		for (@Pc(39) int local39 = 0; local39 < Static53.anInt1131; local39++) {
			if (Static200.aBooleanArray29[local39]) {
				Static135.aBooleanArray12[local39] = true;
			}
			Static19.aBooleanArray3[local39] = Static200.aBooleanArray29[local39];
			Static200.aBooleanArray29[local39] = false;
		}
		Static346.anInt6892 = Static212.anInt4090;
		if (Static147.aClass4_2.method4297()) {
			Static218.aBoolean373 = true;
		}
		if (Static111.anInt2471 != -1) {
			Static53.anInt1131 = 0;
			Static192.method3451();
		}
		Static147.aClass4_2.method4299();
		Static106.method2336(Static147.aClass4_2);
		@Pc(90) int local90 = Static196.method3531();
		if (local90 == -1) {
			local90 = Static264.anInt5425;
		}
		Static70.method1578(local90);
		Static177.method3260(Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5289, Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5280, Static220.anInt4246, Static182.anInt3603);
		Static220.anInt4246 = 0;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(B[II)V")
	public static void method5742(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 31; local3 > 0; local3--) {
			@Pc(9) int local9 = local3 * 36;
			for (@Pc(11) int local11 = 35; local11 > 0; local11--) {
				if (arg0[local9 + local11] == 0 && arg0[local9 + local11 - 37] != 0) {
					arg0[local9 + local11] = arg1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZI)Z")
	public static boolean method5744(@OriginalArg(0) boolean arg0) {
		@Pc(13) boolean local13 = Static147.aClass4_2.method4240();
		if (arg0 == local13) {
			return true;
		}
		if (!arg0) {
			Static147.aClass4_2.method4304();
		} else if (!Static147.aClass4_2.method4275()) {
			arg0 = false;
		}
		if (local13 == arg0) {
			return false;
		} else {
			Static229.aBoolean222 = arg0;
			Static106.method2337(Static177.aClass168_2);
			return true;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method5748(@OriginalArg(0) long arg0) {
		Static281.aCalendar2.setTime(new Date(arg0));
		@Pc(13) int local13 = Static281.aCalendar2.get(7);
		@Pc(17) int local17 = Static281.aCalendar2.get(5);
		@Pc(26) int local26 = Static281.aCalendar2.get(2);
		@Pc(30) int local30 = Static281.aCalendar2.get(1);
		@Pc(34) int local34 = Static281.aCalendar2.get(11);
		@Pc(38) int local38 = Static281.aCalendar2.get(12);
		@Pc(42) int local42 = Static281.aCalendar2.get(13);
		return Static295.aStringArray55[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static301.aStringArray44[local26] + "-" + local30 + " " + local34 / 10 + local34 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZB)V")
	public static void method5754(@OriginalArg(0) boolean arg0) {
		if (arg0 != Static277.aBoolean510) {
			Static277.aBoolean510 = arg0;
			Static34.method805();
		}
	}
}
