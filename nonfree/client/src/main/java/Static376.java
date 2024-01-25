import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!lp", name = "l", descriptor = "I")
	public static int anInt6408;

	@OriginalMember(owner = "client!lp", name = "p", descriptor = "Lclient!cea;")
	public static Class47 aClass47_5;

	// $FF: synthetic field
	@OriginalMember(owner = "client!lp", name = "j", descriptor = "Ljava/lang/Class;")
	private static Class aClass13;

	@OriginalMember(owner = "client!lp", name = "m", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_65 = new Class286(90, 16);

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method5425(@OriginalArg(0) String arg0) {
		return Static501.method7208(arg0, aClass13 == null ? (aClass13 = Class10_Sub2_Sub2.a("fg")) : aClass13);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIIBI)V")
	public static void method5426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(12) int local12 = -arg0;
		@Pc(14) int local14 = -1;
		@Pc(22) int local22 = Static27.method393(arg0 + arg1, Static85.anInt1313, Static316.anInt6313);
		@Pc(30) int local30 = Static27.method393(arg1 - arg0, Static85.anInt1313, Static316.anInt6313);
		Static482.method7040(arg3, local30, Static384.anIntArrayArray38[arg2], local22);
		while (local7 < local9) {
			local14 += 2;
			local12 += local14;
			@Pc(65) int local65;
			@Pc(69) int local69;
			@Pc(94) int local94;
			@Pc(103) int local103;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local65 = arg2 - local9;
				local69 = arg2 + local9;
				if (Static280.anInt5114 <= local69 && Static356.anInt6028 >= local65) {
					local94 = Static27.method393(arg1 + local7, Static85.anInt1313, Static316.anInt6313);
					local103 = Static27.method393(arg1 - local7, Static85.anInt1313, Static316.anInt6313);
					if (Static356.anInt6028 >= local69) {
						Static482.method7040(arg3, local103, Static384.anIntArrayArray38[local69], local94);
					}
					if (Static280.anInt5114 <= local65) {
						Static482.method7040(arg3, local103, Static384.anIntArrayArray38[local65], local94);
					}
				}
			}
			local7++;
			local65 = arg2 - local7;
			local69 = arg2 + local7;
			if (local69 >= Static280.anInt5114 && local65 <= Static356.anInt6028) {
				local94 = Static27.method393(arg1 + local9, Static85.anInt1313, Static316.anInt6313);
				local103 = Static27.method393(arg1 - local9, Static85.anInt1313, Static316.anInt6313);
				if (Static356.anInt6028 >= local69) {
					Static482.method7040(arg3, local103, Static384.anIntArrayArray38[local69], local94);
				}
				if (local65 >= Static280.anInt5114) {
					Static482.method7040(arg3, local103, Static384.anIntArrayArray38[local65], local94);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(CB)C")
	public static char method5427(@OriginalArg(0) char arg0) {
		if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
			return '_';
		} else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
			return arg0;
		} else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
			return 'a';
		} else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
			return 'e';
		} else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
			return 'i';
		} else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
			return 'o';
		} else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
			return 'u';
		} else if (arg0 == 'ç' || arg0 == 'Ç') {
			return 'c';
		} else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
			return 'y';
		} else if (arg0 == 'ñ' || arg0 == 'Ñ') {
			return 'n';
		} else if (arg0 == 'ß') {
			return 'b';
		} else {
			return Character.toLowerCase(arg0);
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "()V")
	public static void method5428() {
		while (true) {
			@Pc(1) boolean local1 = true;
			@Pc(3) int local3;
			for (local3 = 0; local3 < Static150.aClass240Array1.length; local3++) {
				if (Static150.aClass240Array1[local3].method5950()) {
					Static534.aLongArray23[local3] = Static150.aClass240Array1[local3].method5949();
				} else {
					synchronized (Static150.aClass240Array1[local3]) {
						Static150.aClass240Array1[local3].notify();
					}
					local1 = false;
				}
			}
			if (local1) {
				Static150.aClass240Array1[Static150.aClass240Array1.length - 1].method5948();
				Static223.method3524(1);
				while (true) {
					local1 = true;
					for (local3 = 0; local3 < Static150.aClass240Array1.length - 1; local3++) {
						if (!Static150.aClass240Array1[local3].method5950()) {
							synchronized (Static150.aClass240Array1[local3]) {
								Static150.aClass240Array1[local3].notify();
							}
							local1 = false;
						}
					}
					if (local1) {
						for (@Pc(106) int local106 = 1; local106 < Static150.aClass240Array1.length - 2; local106++) {
							Static150.aClass240Array1[local106].method5948();
						}
						Static223.method3524(2);
						while (!Static150.aClass240Array1[0].method5950()) {
							synchronized (Static150.aClass240Array1[0]) {
								Static150.aClass240Array1[0].notify();
							}
							try {
								Static564.method7845(1L);
							} catch (@Pc(148) Exception local148) {
							}
						}
						Static150.aClass240Array1[0].method5948();
						return;
					}
					try {
						Static564.method7845(1L);
					} catch (@Pc(103) Exception local103) {
					}
				}
			}
			try {
				Static564.method7845(1L);
			} catch (@Pc(49) Exception local49) {
			}
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)V")
	public static void method5430(@OriginalArg(1) int arg0) {
		@Pc(9) Class3_Sub4_Sub2 local9 = Static502.method7211(2, (long) arg0);
		local9.method627();
	}
}
