import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!hg", name = "n", descriptor = "Ljava/lang/Object;")
	public static Object anObject7;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(BIILclient!uea;I)V")
	public static void method3304(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class15_Sub2_Sub4_Sub2 arg2) {
		@Pc(10) int local10 = arg2.anIntArray638[0];
		@Pc(15) int local15 = arg2.anIntArray637[0];
		if (local10 < 0 || Static18.anInt5706 <= local10 || local15 < 0 || Static80.anInt1367 <= local15 || (arg1 < 0 || arg1 >= Static18.anInt5706 || arg0 < 0 || Static80.anInt1367 <= arg0)) {
			return;
		}
		@Pc(79) int local79 = Static415.method5914(-4, arg0, Static30.aClass138Array1[arg2.aByte98], true, Static384.anIntArray497, arg1, 0, local15, 0, Static512.anIntArray627, local10, 0, arg2.method7135(), 0);
		if (local79 >= 1 && local79 <= 3) {
			for (@Pc(91) int local91 = 0; local91 < local79 - 1; local91++) {
				arg2.method7152(Static512.anIntArray627[local91], Static384.anIntArray497[local91], (byte) 2);
			}
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z)Ljava/lang/String;")
	public static String method3305() {
		@Pc(12) String local12 = "www";
		if (Static338.aClass45_6 == Static89.aClass45_2) {
			local12 = "www-wtrc";
		} else if (Static336.aClass45_5 == Static338.aClass45_6) {
			local12 = "www-wtqa";
		} else if (Static575.aClass45_8 == Static338.aClass45_6) {
			local12 = "www-wtwip";
		}
		@Pc(33) String local33 = "";
		if (Static315.aString50 != null) {
			local33 = "/p=" + Static315.aString50;
		}
		return "http://" + local12 + "." + Static172.aClass68_4.aString6 + ".com/l=" + Static188.anInt28 + "/a=" + Static543.anInt9322 + local33 + "/";
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILclient!jr;I)V")
	public static void method3306(@OriginalArg(1) Class6_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (Static479.aClass193_4 == null) {
			return;
		}
		try {
			Static479.aClass193_4.method4607(0L);
			Static479.aClass193_4.method4599(24, arg1, arg0.aByteArray97);
		} catch (@Pc(14) Exception local14) {
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IZI)V")
	public static void method3307(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(10) Class6_Sub46 local10 = Static378.method5549(arg1, arg0);
		if (local10 != null) {
			for (@Pc(22) int local22 = 0; local22 < local10.anIntArray582.length; local22++) {
				local10.anIntArray582[local22] = -1;
				local10.anIntArray583[local22] = 0;
			}
		}
	}
}
