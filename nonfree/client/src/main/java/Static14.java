import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!aj", name = "Wb", descriptor = "Lclient!oh;")
	public static Class220 aClass220_1;

	@OriginalMember(owner = "client!aj", name = "Eb", descriptor = "[I")
	public static final int[] anIntArray22 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!aj", name = "Fb", descriptor = "[[I")
	public static final int[][] anIntArrayArray3 = new int[6][];

	@OriginalMember(owner = "client!aj", name = "Rb", descriptor = "Lclient!ml;")
	public static final Class199 aClass199_1 = new Class199("WTWIP", 3);

	@OriginalMember(owner = "client!aj", name = "Xb", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_6 = new Class40("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

	@OriginalMember(owner = "client!aj", name = "x", descriptor = "(I)V")
	public static void method518() {
		Static197.aClass42_13.method1108();
		Static77.aClass187_7.method4808();
		Static241.aClass187_6.method4808();
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZJIII)Ljava/lang/String;")
	public static String method521(@OriginalArg(0) boolean arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg3 == 0) {
			local7 = '.';
			local9 = ',';
		}
		if (arg3 == 2) {
			local9 = ' ';
		}
		@Pc(27) boolean local27 = false;
		if (arg1 < 0L) {
			arg1 = -arg1;
			local27 = true;
		}
		@Pc(43) StringBuffer local43 = new StringBuffer(26);
		@Pc(47) int local47;
		@Pc(52) int local52;
		if (arg2 > 0) {
			for (local47 = 0; local47 < arg2; local47++) {
				local52 = (int) arg1;
				arg1 /= 10L;
				local43.append((char) (local52 + 48 - (int) arg1 * 10));
			}
			local43.append(local7);
		}
		local47 = 0;
		while (true) {
			local52 = (int) arg1;
			arg1 /= 10L;
			local43.append((char) (local52 + 48 - (int) arg1 * 10));
			if (arg1 == 0L) {
				if (local27) {
					local43.append('-');
				}
				return local43.reverse().toString();
			}
			if (arg0) {
				local47++;
				if (local47 % 3 == 0) {
					local43.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIZIII)I")
	public static int method523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg3 & 0x1) == 1) {
			@Pc(6) int local6 = arg2;
			arg2 = arg1;
			arg1 = local6;
		}
		@Pc(14) int local14 = arg5 & 0x3;
		if (local14 == 0) {
			return arg4;
		} else if (local14 == 1) {
			return 7 + 1 - arg0 - arg2;
		} else if (local14 == 2) {
			return 7 + 1 - arg4 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZIIIII)V")
	public static void method528(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static398.anInt7144 <= arg1 && arg3 <= Static71.anInt4958 && Static4.anInt6709 <= arg0 && arg4 <= Static492.anInt8451) {
			Static18.method596(arg2, arg3, arg4, arg1, arg0);
		} else {
			Static366.method5592(arg4, arg1, arg3, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IBI)Z")
	public static boolean method530(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static136.method2572(arg1, arg0) | (arg1 & 0x60000) != 0 || Static376.method5638(arg0, arg1) || Static297.method5710(arg0, arg1);
	}
}
