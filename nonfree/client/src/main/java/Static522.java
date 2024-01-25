import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static522 {

	@OriginalMember(owner = "client!sj", name = "E", descriptor = "D")
	public static double aDouble15;

	@OriginalMember(owner = "client!sj", name = "K", descriptor = "[I")
	public static int[] anIntArray557;

	@OriginalMember(owner = "client!sj", name = "P", descriptor = "J")
	public static long aLong237;

	@OriginalMember(owner = "client!sj", name = "F", descriptor = "I")
	public static int anInt9104 = 0;

	@OriginalMember(owner = "client!sj", name = "J", descriptor = "I")
	public static final int anInt9107 = 0;

	@OriginalMember(owner = "client!sj", name = "N", descriptor = "[I")
	public static final int[] anIntArray558 = new int[1000];

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(BII)Z")
	public static boolean method7781(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static495.method7405(arg1, arg0) | (arg0 & 0x70000) != 0 || Static216.method3671(arg1, arg0);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Ljava/lang/String;II)Lclient!mda;")
	public static Class203 method7782(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class203 local13;
		try {
			local13 = (Class203) Class.forName("Class203_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			local13 = new Class203_Sub2();
		}
		local13.anInt9926 = arg1;
		local13.aString112 = arg0;
		return local13;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)V")
	public static void method7784() {
		if (Static42.anApplet1 == null) {
			return;
		}
		try {
			@Pc(15) String local15 = Static42.anApplet1.getParameter("cookiehost");
			@Pc(23) int local23 = (int) (Static32.method595() / 86400000L) - 11745;
			@Pc(35) String local35 = "usrdob=" + local23 + "; version=1; path=/; domain=" + local15;
			Static654.method5163("document.cookie=\"" + local35 + "\"", Static42.anApplet1);
		} catch (@Pc(49) Throwable local49) {
		}
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(II)V")
	public static void method7785(@OriginalArg(0) int arg0) {
		Static243.anInt4836 = 100;
		Static16.anInt284 = arg0;
		Static316.anInt6069 = -1;
		Static344.anInt6482 = 3;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IZIIIIIII)Z")
	public static boolean method7786(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anIntArray335[0];
		@Pc(13) int local13 = Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anIntArray336[0];
		if (local8 < 0 || local8 >= Static442.anInt7975 || local13 < 0 || Static284.anInt7916 <= local13) {
			return false;
		} else if (arg6 >= 0 && arg6 < Static442.anInt7975 && arg4 >= 0 && arg4 < Static284.anInt7916) {
			@Pc(70) int local70 = Static108.method1764(local13, local8, arg6, arg7, arg1, arg3, arg5, arg2, Static297.anIntArray433, Static619.aClass319Array1[Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aByte131], arg4, arg0, Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.method4913(), Static647.anIntArray649);
			if (local70 < 1) {
				return false;
			}
			Static106.anInt2100 = Static297.anIntArray433[local70 - 1];
			Static51.anInt935 = Static647.anIntArray649[local70 - 1];
			Static362.aBoolean439 = false;
			Static168.method3101();
			return true;
		} else {
			return false;
		}
	}
}
