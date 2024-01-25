import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!iw", name = "e", descriptor = "D")
	public static double aDouble25;

	@OriginalMember(owner = "client!iw", name = "m", descriptor = "Lclient!oq;")
	public static Class256 aClass256_8;

	@OriginalMember(owner = "client!iw", name = "o", descriptor = "I")
	public static int anInt4017;

	@OriginalMember(owner = "client!iw", name = "x", descriptor = "Lclient!haa;")
	public static Class131 aClass131_1;

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "(I)I")
	public static int method3437() {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(11) boolean local11 = false;
		if (Static452.aClass226_6.aBoolean416 && !Static452.aClass226_6.aBoolean415) {
			if (Static359.aString67.startsWith("win")) {
				local9 = true;
				local11 = true;
			} else {
				local9 = true;
			}
			local7 = true;
		}
		if (Static630.aBoolean742) {
			local9 = false;
		}
		if (Static279.aBoolean311) {
			local7 = false;
		}
		if (Static644.aBoolean749) {
			local11 = false;
		}
		if (!local7 && !local9 && !local11) {
			return Static528.method7298();
		}
		@Pc(54) int local54 = -1;
		@Pc(56) int local56 = -1;
		@Pc(58) int local58 = -1;
		if (local7) {
			try {
				local54 = Static560.method7665(1000, 2);
			} catch (@Pc(67) Exception local67) {
			}
		}
		if (local11) {
			try {
				local58 = Static560.method7665(1000, 3);
				if (Static234.aClass2_Sub5_48.aClass6_Sub21_2.method7280() == 3) {
					@Pc(86) Class117 local86 = Static192.aClass95_4.method7008();
					@Pc(91) long local91 = local86.aLong91 & 0xFFFFFFFFFFFFL;
					@Pc(94) int local94 = local86.anInt3083;
					if (local94 == 4318) {
						local9 &= local91 >= 64425238954L;
					} else if (local94 == 4098) {
						local9 &= local91 >= 60129613779L;
					}
				}
			} catch (@Pc(126) Exception local126) {
			}
		}
		if (local9) {
			try {
				local56 = Static560.method7665(1000, 1);
			} catch (@Pc(136) Exception local136) {
			}
		}
		if (local54 == -1 && local56 == -1 && local58 == -1) {
			return Static528.method7298();
		}
		local56 = (int) ((float) local56 * 1.1F);
		local58 = (int) ((float) local58 * 1.1F);
		if (local54 > local58 && local56 < local54) {
			return Static246.method3383(local54);
		} else if (local58 > local56) {
			return Static39.method623(3, local58);
		} else {
			return Static39.method623(1, local56);
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(BIIIIII)I")
	public static int method3439(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg4 & 0x1) == 1) {
			@Pc(18) int local18 = arg0;
			arg0 = arg2;
			arg2 = local18;
		}
		@Pc(26) int local26 = arg5 & 0x3;
		if (local26 == 0) {
			return arg3;
		} else if (local26 == 1) {
			return arg1;
		} else if (local26 == 2) {
			return 7 + 1 - arg3 - arg0;
		} else {
			return 1 + 7 - arg2 - arg1;
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(IZ)V")
	public static void method3440(@OriginalArg(0) int arg0) {
		Static347.anInt5452 = arg0;
		Static160.anInt2883 = -1;
		Static160.anInt2883 = -1;
		Static61.method909();
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(II)I")
	public static int method3441(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!iw", name = "c", descriptor = "(I)V")
	public static void method3442() {
		if (Static617.anApplet2 == null) {
			return;
		}
		try {
			@Pc(15) String local15 = Static617.anApplet2.getParameter("cookiehost");
			@Pc(23) int local23 = (int) (Static476.method6413() / 86400000L) - 11745;
			@Pc(35) String local35 = "usrdob=" + local23 + "; version=1; path=/; domain=" + local15;
			Static651.method4295("document.cookie=\"" + local35 + "\"", Static617.anApplet2);
		} catch (@Pc(49) Throwable local49) {
		}
	}
}
