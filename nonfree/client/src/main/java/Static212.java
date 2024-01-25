import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!mk", name = "K", descriptor = "[I")
	public static int[] anIntArray312;

	@OriginalMember(owner = "client!mk", name = "N", descriptor = "I")
	public static int anInt4289;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method3825(@OriginalArg(0) String arg0) {
		Static60.aString14 = arg0;
		if (Static154.aClass123_2.anApplet1 == null) {
			return;
		}
		try {
			@Pc(14) String local14 = Static154.aClass123_2.anApplet1.getParameter("cookieprefix");
			@Pc(19) String local19 = Static154.aClass123_2.anApplet1.getParameter("cookiehost");
			@Pc(34) String local34 = local14 + "settings=" + arg0 + "; version=1; path=/; domain=" + local19;
			if (arg0.length() == 0) {
				local34 = local34 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local34 = local34 + "; Expires=" + Static119.method2130(Static101.method1805() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static406.method5996("document.cookie=\"" + local34 + "\"", Static154.aClass123_2.anApplet1);
		} catch (@Pc(91) Throwable local91) {
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(CI)Z")
	public static boolean method3827(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!rs;III)V")
	public static void method3828(@OriginalArg(0) Class103 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long local7 = Static132.aLongArrayArrayArray1[arg1][arg2][arg3];
		@Pc(9) long local9 = 0L;
		arg0.anInt3024 = 0;
		@Pc(21) int local21;
		while (local9 <= 48L) {
			local21 = (int) (local7 >> (int) local9 & 0xFFFFL);
			if (local21 <= 0) {
				break;
			}
			arg0.aClass2_Sub8_Sub1Array3[arg0.anInt3024++] = Static41.aClass2_Sub8_Sub1Array1[local21 - 1];
			local9 += 16L;
		}
		for (local21 = arg0.anInt3024; local21 < 4; local21++) {
			arg0.aClass2_Sub8_Sub1Array3[local21] = null;
		}
	}

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "(I)V")
	public static void method3829() {
		Static77.method1332(Static148.aClass183_43);
		Static76.aClass2_Sub24_Sub2_7.method5746(Static195.method3553());
		Static76.aClass2_Sub24_Sub2_7.method5721(Static7.anInt157);
		Static76.aClass2_Sub24_Sub2_7.method5721(Static336.anInt6217);
		Static76.aClass2_Sub24_Sub2_7.method5746(Static87.anInt1875);
	}
}
