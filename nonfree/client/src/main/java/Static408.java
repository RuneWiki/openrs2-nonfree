import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static408 {

	@OriginalMember(owner = "client!ur", name = "K", descriptor = "Ljava/lang/String;")
	public static String aString61;

	@OriginalMember(owner = "client!ur", name = "L", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_153 = new Class209("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIZII)V")
	public static void method5372(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class2_Sub5_Sub13 local13 = Static208.method3306(arg0, 8);
		local13.method4547();
		local13.anInt5643 = arg2;
		local13.anInt5644 = arg3;
		local13.anInt5641 = arg1;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method5373(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(32) int local32 = 0;
			for (@Pc(34) long local34 = arg0; local34 != 0L; local34 /= 37L) {
				local32++;
			}
			@Pc(50) StringBuffer local50 = new StringBuffer(local32);
			while (arg0 != 0L) {
				@Pc(54) long local54 = arg0;
				arg0 /= 37L;
				@Pc(68) char local68 = Static165.aCharArray4[(int) (local54 - arg0 * 37L)];
				if (local68 == '_') {
					@Pc(78) int local78 = local50.length() - 1;
					local50.setCharAt(local78, Character.toUpperCase(local50.charAt(local78)));
					local68 = ' ';
				}
				local50.append(local68);
			}
			local50.reverse();
			local50.setCharAt(0, Character.toUpperCase(local50.charAt(0)));
			return local50.toString();
		}
	}

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "(III)I")
	public static int method5375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = arg0 - 1 & arg1 >> 31;
		return local16 + (arg1 + (arg1 >>> 31)) % arg0;
	}

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "(B)V")
	public static void method5376() {
		Static438.aClass2_Sub23_Sub2_2.method5515();
		@Pc(18) int local18 = Static438.aClass2_Sub23_Sub2_2.method5519(8);
		@Pc(23) int local23;
		if (Static62.anInt1371 > local18) {
			for (local23 = local18; local23 < Static62.anInt1371; local23++) {
				Static146.anIntArray271[Static141.anInt3016++] = Static173.anIntArray307[local23];
			}
		}
		if (local18 > Static62.anInt1371) {
			throw new RuntimeException("gnpov1");
		}
		Static62.anInt1371 = 0;
		for (local23 = 0; local23 < local18; local23++) {
			@Pc(61) int local61 = Static173.anIntArray307[local23];
			@Pc(65) Class3_Sub2_Sub1_Sub1 local65 = Static174.aClass3_Sub2_Sub1_Sub1Array1[local61];
			@Pc(70) int local70 = Static438.aClass2_Sub23_Sub2_2.method5519(1);
			if (local70 == 0) {
				Static173.anIntArray307[Static62.anInt1371++] = local61;
				local65.anInt6130 = Static131.anInt2821;
			} else {
				@Pc(90) int local90 = Static438.aClass2_Sub23_Sub2_2.method5519(2);
				if (local90 == 0) {
					Static173.anIntArray307[Static62.anInt1371++] = local61;
					local65.anInt6130 = Static131.anInt2821;
					Static1.anIntArray67[Static121.anInt2701++] = local61;
				} else {
					@Pc(132) int local132;
					@Pc(142) int local142;
					if (local90 == 1) {
						Static173.anIntArray307[Static62.anInt1371++] = local61;
						local65.anInt6130 = Static131.anInt2821;
						local132 = Static438.aClass2_Sub23_Sub2_2.method5519(3);
						local65.method1431(1, local132);
						local142 = Static438.aClass2_Sub23_Sub2_2.method5519(1);
						if (local142 == 1) {
							Static1.anIntArray67[Static121.anInt2701++] = local61;
						}
					} else if (local90 == 2) {
						Static173.anIntArray307[Static62.anInt1371++] = local61;
						local65.anInt6130 = Static131.anInt2821;
						if (Static438.aClass2_Sub23_Sub2_2.method5519(1) == 1) {
							local132 = Static438.aClass2_Sub23_Sub2_2.method5519(3);
							local65.method1431(2, local132);
							local142 = Static438.aClass2_Sub23_Sub2_2.method5519(3);
							local65.method1431(2, local142);
						} else {
							local132 = Static438.aClass2_Sub23_Sub2_2.method5519(3);
							local65.method1431(0, local132);
						}
						local132 = Static438.aClass2_Sub23_Sub2_2.method5519(1);
						if (local132 == 1) {
							Static1.anIntArray67[Static121.anInt2701++] = local61;
						}
					} else if (local90 == 3) {
						Static146.anIntArray271[Static141.anInt3016++] = local61;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ur", name = "d", descriptor = "(B)V")
	public static void method5377() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static129.aBooleanArray15[local3] = false;
		}
		Static24.anInt5083 = 0;
		Static363.anInt6254 = Static140.anInt2975;
		Static203.anInt4634 = Static364.anInt6270;
		Static67.anInt1492 = Static119.anInt2680;
		Static184.anInt3598 = Static355.anInt6031;
		Static340.anInt5848 = Static23.anInt567;
		Static159.anInt3195 = 5;
		Static256.anInt4806 = 0;
		Static385.anInt6454 = -1;
		Static61.anInt1366 = Static131.anInt2821;
		Static103.anInt2414 = -1;
	}
}
