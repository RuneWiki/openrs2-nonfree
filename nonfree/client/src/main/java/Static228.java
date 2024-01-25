import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!la", name = "x", descriptor = "Z")
	public static boolean aBoolean426;

	@OriginalMember(owner = "client!la", name = "t", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_106 = new Class231("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

	@OriginalMember(owner = "client!la", name = "y", descriptor = "[I")
	public static final int[] anIntArray515 = new int[4096];

	@OriginalMember(owner = "client!la", name = "z", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_148 = new Class25(65, 5);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BLclient!kj;)V")
	public static void method4878(@OriginalArg(1) Class11_Sub5_Sub2 arg0) {
		@Pc(11) boolean local11 = false;
		if (arg0.anInt7669 == Static277.anInt5022 || arg0.anInt7665 == -1 || arg0.anInt7662 != 0) {
			local11 = true;
		} else {
			@Pc(32) Class109 local32 = Static37.aClass80_1.method1879(arg0.anInt7665);
			if (local32.aBoolean172 || local32.anIntArray238[arg0.anInt7693] < arg0.anInt7654 + 1) {
				local11 = true;
			}
		}
		if (local11) {
			@Pc(60) int local60 = arg0.anInt7669 - arg0.anInt7629;
			@Pc(66) int local66 = Static277.anInt5022 - arg0.anInt7629;
			@Pc(77) int local77 = arg0.anInt7650 * 128 + arg0.method6215() * 64;
			@Pc(88) int local88 = arg0.anInt7689 * 128 + arg0.method6215() * 64;
			@Pc(99) int local99 = arg0.anInt7661 * 128 + arg0.method6215() * 64;
			@Pc(110) int local110 = arg0.anInt7687 * 128 + arg0.method6215() * 64;
			arg0.anInt7626 = ((local60 - local66) * local77 + local66 * local99) / local60;
			arg0.anInt7622 = (local110 * local66 + (local60 - local66) * local88) / local60;
		}
		arg0.anInt7708 = 0;
		if (arg0.anInt7643 == 0) {
			arg0.method6225(false, 8192);
		}
		if (arg0.anInt7643 == 1) {
			arg0.method6225(false, 12288);
		}
		if (arg0.anInt7643 == 2) {
			arg0.method6225(false, 0);
		}
		if (arg0.anInt7643 == 3) {
			arg0.method6225(false, 4096);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BLclient!qg;)Z")
	public static boolean method4879(@OriginalArg(1) Class203 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean418) {
			return false;
		} else if (!arg0.method4740(Static5.anInterface10_2)) {
			return false;
		} else if (Static86.aClass220_4.method5099((long) arg0.anInt5947) == null) {
			return Static139.aClass220_15.method5099((long) arg0.anInt5975) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILclient!o;ILclient!gi;IIILclient!ta;)V")
	public static void method4887(@OriginalArg(0) int arg0, @OriginalArg(1) Class41 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class93 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class102 arg6) {
		if (arg1 == null) {
			return;
		}
		@Pc(16) int local16;
		if (Static25.anInt7273 == 4) {
			local16 = (int) Static37.aFloat9 & 0x3FFF;
		} else {
			local16 = (int) Static37.aFloat9 + Static149.anInt7397 & 0x3FFF;
		}
		@Pc(35) int local35 = Math.max(arg3.anInt2436 / 2, arg3.anInt2495 / 2) + 10;
		@Pc(43) int local43 = arg2 * arg2 + arg5 * arg5;
		if (local43 > local35 * local35) {
			return;
		}
		@Pc(57) int local57 = Class229.anIntArray537[local16];
		@Pc(66) int local66 = Class229.anIntArray536[local16];
		if (Static25.anInt7273 != 4) {
			local66 = local66 * 256 / (Static148.anInt2711 + 256);
			local57 = local57 * 256 / (Static148.anInt2711 + 256);
		}
		@Pc(95) int local95 = arg2 * local66 + arg5 * local57 >> 15;
		@Pc(106) int local106 = local66 * arg5 - local57 * arg2 >> 15;
		arg1.method6082(arg4 + arg3.anInt2436 / 2 + local95 - arg1.RA() / 2, arg0 + arg3.anInt2495 / 2 + (-local106 - arg1.Q() / 2), arg6, arg4, arg0);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;BILjava/lang/String;)I")
	public static int method4888(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg2.length();
		@Pc(11) int local11 = arg0.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local8 > local13 - local17 || local11 > local15 - local19) {
			if (local8 <= local13 - local17) {
				return -1;
			}
			if (local15 - local19 >= local11) {
				return 1;
			}
			@Pc(61) char local61;
			if (local17 == '\u0000') {
				local61 = arg2.charAt(local13++);
			} else {
				local61 = local17;
			}
			@Pc(77) char local77;
			if (local19 == '\u0000') {
				local77 = arg0.charAt(local15++);
			} else {
				local77 = local19;
			}
			local17 = Static183.method2648(local61);
			local19 = Static183.method2648(local77);
			local61 = Static94.method4450(arg1, local61);
			local77 = Static94.method4450(arg1, local77);
			if (local77 != local61 && Character.toUpperCase(local61) != Character.toUpperCase(local77)) {
				local61 = Character.toLowerCase(local61);
				local77 = Character.toLowerCase(local77);
				if (local61 != local77) {
					return Static154.method2308(arg1, local61) - Static154.method2308(arg1, local77);
				}
			}
		}
		@Pc(142) int local142 = Math.min(local8, local11);
		for (@Pc(144) int local144 = 0; local144 < local142; local144++) {
			if (arg1 == 2) {
				local15 = local11 - local144 - 1;
				local13 = local8 - local144 - 1;
			} else {
				local15 = local144;
				local13 = local144;
			}
			@Pc(173) char local173 = arg2.charAt(local13);
			@Pc(177) char local177 = arg0.charAt(local15);
			if (local173 != local177 && Character.toUpperCase(local173) != Character.toUpperCase(local177)) {
				local173 = Character.toLowerCase(local173);
				local177 = Character.toLowerCase(local177);
				if (local177 != local173) {
					return Static154.method2308(arg1, local173) - Static154.method2308(arg1, local177);
				}
			}
		}
		@Pc(221) int local221 = local8 - local11;
		if (local221 != 0) {
			return local221;
		}
		for (@Pc(235) int local235 = 0; local235 < local142; local235++) {
			@Pc(241) char local241 = arg2.charAt(local235);
			@Pc(245) char local245 = arg0.charAt(local235);
			if (local245 != local241) {
				return Static154.method2308(arg1, local241) - Static154.method2308(arg1, local245);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II)Z")
	public static boolean method4890(@OriginalArg(0) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}
}
