import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!rl", name = "H", descriptor = "Lclient!ja;")
	public static Class125 aClass125_2;

	@OriginalMember(owner = "client!rl", name = "I", descriptor = "[C")
	public static final char[] aCharArray7 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!rl", name = "M", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_107 = new Class186(60, -2);

	@OriginalMember(owner = "client!rl", name = "Q", descriptor = "J")
	public static long aLong173 = 0L;

	@OriginalMember(owner = "client!rl", name = "R", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_98 = new Class231("Take", "Nehmen", "Prendre", "Pegar");

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method4963(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(35) int local35 = 0;
			for (@Pc(37) long local37 = arg0; local37 != 0L; local37 /= 37L) {
				local35++;
			}
			@Pc(55) StringBuffer local55 = new StringBuffer(local35);
			while (arg0 != 0L) {
				@Pc(59) long local59 = arg0;
				arg0 /= 37L;
				local55.append(Static283.aCharArray5[(int) (local59 - arg0 * 37L)]);
			}
			return local55.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4964(@OriginalArg(1) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!in;IIIILclient!qq;)V")
	public static void method4967(@OriginalArg(0) Class118 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class28 arg4) {
		@Pc(9) Class110 local9 = Static405.aClass190_4.method4316(arg0.anInt2988);
		if (local9.anInt2706 == -1) {
			return;
		}
		if (arg0.aBoolean207) {
			@Pc(23) int local23 = arg3 + arg0.anInt2982;
			arg3 = local23 & 0x3;
		} else {
			arg3 = 0;
		}
		@Pc(44) Class12 local44 = local9.method2477(arg4, arg0.aBoolean218, arg3);
		if (local44 == null) {
			return;
		}
		@Pc(50) int local50 = arg0.anInt2997;
		@Pc(53) int local53 = arg0.anInt3025;
		if ((arg3 & 0x1) == 1) {
			local50 = arg0.anInt3025;
			local53 = arg0.anInt2997;
		}
		@Pc(69) int local69 = local44.method5654();
		@Pc(72) int local72 = local44.method5655();
		if (local9.aBoolean195) {
			local69 = local50 * 4;
			local72 = local53 * 4;
		}
		if (local9.anInt2708 == 0) {
			local44.method5667(arg2, arg1 + 4 - local53 * 4, local69, local72);
		} else {
			local44.method5659(arg2, arg1 - (local53 - 1) * 4, local69, local72, 0, local9.anInt2708 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(ILjava/lang/String;)J")
	public static long method4968(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) long local10 = 0L;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local10 = (local10 << 5) + (long) arg0.charAt(local17) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(BIIII)V")
	public static void method4969(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static8.aClass173_Sub1_1.anInt4406 != 0 && arg3 != 0 && Static117.anInt2050 < 50 && arg0 != -1) {
			Static127.aClass197Array1[Static117.anInt2050++] = new Class197((byte) 1, arg0, arg3, arg1, arg2, 0);
		}
	}
}
