import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!ck", name = "T", descriptor = "Lclient!qr;")
	public static Class62_Sub1_Sub2_Sub2 aClass62_Sub1_Sub2_Sub2_2;

	@OriginalMember(owner = "client!ck", name = "R", descriptor = "[I")
	public static final int[] anIntArray78 = new int[32];

	@OriginalMember(owner = "client!ck", name = "S", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_11 = new Class93("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

	@OriginalMember(owner = "client!ck", name = "W", descriptor = "I")
	public static int anInt830 = 0;

	@OriginalMember(owner = "client!ck", name = "e", descriptor = "(I)Z")
	public static boolean method966() {
		if (Static18.aBoolean56) {
			try {
				if ((Boolean) Static358.method3(Static177.aClass168_2.anApplet1, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(18) Throwable local18) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "(I)V")
	public static void method967() {
		@Pc(16) int local16 = Static269.aClass2_Sub10_Sub1_3.method2052(8);
		@Pc(25) int local25;
		if (Static214.anInt4133 > local16) {
			for (local25 = local16; local25 < Static214.anInt4133; local25++) {
				Static159.anIntArray272[Static322.anInt6489++] = Static103.anIntArray218[local25];
			}
		}
		if (local16 > Static214.anInt4133) {
			throw new RuntimeException("gppov1");
		}
		Static214.anInt4133 = 0;
		for (local25 = 0; local25 < local16; local25++) {
			@Pc(59) int local59 = Static103.anIntArray218[local25];
			@Pc(63) Class62_Sub1_Sub2_Sub2 local63 = Static129.aClass62_Sub1_Sub2_Sub2Array1[local59];
			@Pc(68) int local68 = Static269.aClass2_Sub10_Sub1_3.method2052(1);
			if (local68 == 0) {
				Static103.anIntArray218[Static214.anInt4133++] = local59;
				local63.anInt5333 = Static212.anInt4090;
			} else {
				@Pc(91) int local91 = Static269.aClass2_Sub10_Sub1_3.method2052(2);
				if (local91 == 0) {
					Static103.anIntArray218[Static214.anInt4133++] = local59;
					local63.anInt5333 = Static212.anInt4090;
					Static102.anIntArray217[Static95.anInt6378++] = local59;
				} else {
					@Pc(138) int local138;
					@Pc(150) int local150;
					if (local91 == 1) {
						Static103.anIntArray218[Static214.anInt4133++] = local59;
						local63.anInt5333 = Static212.anInt4090;
						local138 = Static269.aClass2_Sub10_Sub1_3.method2052(3);
						local63.method4788(local138, 1);
						local150 = Static269.aClass2_Sub10_Sub1_3.method2052(1);
						if (local150 == 1) {
							Static102.anIntArray217[Static95.anInt6378++] = local59;
						}
					} else if (local91 == 2) {
						Static103.anIntArray218[Static214.anInt4133++] = local59;
						local63.anInt5333 = Static212.anInt4090;
						if (Static269.aClass2_Sub10_Sub1_3.method2052(1) == 1) {
							local138 = Static269.aClass2_Sub10_Sub1_3.method2052(3);
							local63.method4788(local138, 2);
							local150 = Static269.aClass2_Sub10_Sub1_3.method2052(3);
							local63.method4788(local150, 2);
						} else {
							local138 = Static269.aClass2_Sub10_Sub1_3.method2052(3);
							local63.method4788(local138, 0);
						}
						local138 = Static269.aClass2_Sub10_Sub1_3.method2052(1);
						if (local138 == 1) {
							Static102.anIntArray217[Static95.anInt6378++] = local59;
						}
					} else if (local91 == 3) {
						Static159.anIntArray272[Static322.anInt6489++] = local59;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZLclient!on;B)V")
	public static void method968(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class146 arg1) {
		@Pc(12) int local12 = arg1.anInt4430 == 0 ? arg1.anInt4468 : arg1.anInt4430;
		@Pc(24) int local24 = arg1.anInt4482 == 0 ? arg1.anInt4414 : arg1.anInt4482;
		Static257.method4678(Static265.aClass146ArrayArray41[arg1.anInt4450 >> 16], arg0, local24, arg1.anInt4450, local12);
		if (arg1.aClass146Array2 != null) {
			Static257.method4678(arg1.aClass146Array2, arg0, local24, arg1.anInt4450, local12);
		}
		@Pc(57) Class2_Sub8 local57 = (Class2_Sub8) Static273.aClass199_25.method5751((long) arg1.anInt4450);
		if (local57 != null) {
			Static159.method3016(local12, arg0, local24, local57.anInt694);
		}
	}
}
