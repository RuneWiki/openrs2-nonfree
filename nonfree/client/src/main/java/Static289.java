import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "Lclient!o;")
	public static final Class169 aClass169_268 = new Class169("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!qm", name = "k", descriptor = "I")
	public static int anInt5000 = 0;

	@OriginalMember(owner = "client!qm", name = "w", descriptor = "Lclient!j;")
	public static final Class113 aClass113_12 = new Class113(4, 3);

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIZJ)Ljava/lang/String;")
	public static String method4387(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) long arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg1 == 0) {
			local9 = ',';
			local7 = '.';
		}
		if (arg1 == 2) {
			local9 = ' ';
		}
		@Pc(27) boolean local27 = false;
		if (arg3 < 0L) {
			arg3 = -arg3;
			local27 = true;
		}
		@Pc(48) StringBuffer local48 = new StringBuffer(26);
		@Pc(52) int local52;
		@Pc(57) int local57;
		if (arg0 > 0) {
			for (local52 = 0; local52 < arg0; local52++) {
				local57 = (int) arg3;
				arg3 /= 10L;
				local48.append((char) (local57 + 48 - (int) arg3 * 10));
			}
			local48.append(local7);
		}
		local52 = 0;
		while (true) {
			local57 = (int) arg3;
			arg3 /= 10L;
			local48.append((char) (local57 + 48 - (int) arg3 * 10));
			if (arg3 == 0L) {
				if (local27) {
					local48.append('-');
				}
				return local48.reverse().toString();
			}
			if (arg2) {
				local52++;
				if (local52 % 3 == 0) {
					local48.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "(I)V")
	public static void method4391() {
		Static195.aClass51_23 = null;
		Static274.aClass51_14 = null;
		Static158.aClass51_6 = null;
		Static284.aClass51_15 = null;
		Static381.aClass51_22 = null;
		Static361.aClass51_18 = null;
		Static326.aClass51_17 = null;
		Static152.aClass51_7 = null;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIII)V")
	public static void method4392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= Static372.anInt1561 && Static98.anInt1774 >= arg0) {
			@Pc(20) int local20 = Static140.method5231(arg3, Static264.anInt4589, Static194.anInt3448);
			@Pc(28) int local28 = Static140.method5231(arg2, Static264.anInt4589, Static194.anInt3448);
			Static342.method4855(arg0, arg1, local28, local20);
		}
	}

	@OriginalMember(owner = "client!qm", name = "f", descriptor = "(I)V")
	public static void method4398() {
		Static313.method4638(Static66.aClass164_2, (long) Static366.anInt5883);
		if (Static352.anInt5753 != -1) {
			Static173.method2547(Static352.anInt5753);
		}
		for (@Pc(18) int local18 = 0; local18 < Static75.anInt1459; local18++) {
			if (Static96.aBooleanArray9[local18]) {
				Static277.aBooleanArray26[local18] = true;
			}
			Static227.aBooleanArray23[local18] = Static96.aBooleanArray9[local18];
			Static96.aBooleanArray9[local18] = false;
		}
		Static239.anInt4002 = Static366.anInt5883;
		if (Static66.aClass164_2.method5369()) {
			Static17.aBoolean28 = true;
		}
		if (Static352.anInt5753 != -1) {
			Static75.anInt1459 = 0;
			Static136.method5481();
		}
		Static66.aClass164_2.method5306();
		Static310.method4627(Static157.anInt2870);
		Static109.anInt1911 = 0;
	}
}
