import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!ew", name = "n", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_74 = new Class189("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

	@OriginalMember(owner = "client!ew", name = "x", descriptor = "[I")
	public static final int[] anIntArray136 = new int[50];

	@OriginalMember(owner = "client!ew", name = "B", descriptor = "[I")
	public static final int[] anIntArray137 = new int[200];

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(IJBIZ)Ljava/lang/String;")
	public static String method1789(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(5) char local5 = ',';
		@Pc(7) char local7 = '.';
		if (arg0 == 0) {
			local5 = '.';
			local7 = ',';
		}
		if (arg0 == 2) {
			local7 = ' ';
		}
		@Pc(20) boolean local20 = false;
		if (arg1 < 0L) {
			local20 = true;
			arg1 = -arg1;
		}
		@Pc(36) StringBuffer local36 = new StringBuffer(26);
		@Pc(40) int local40;
		@Pc(44) int local44;
		if (arg2 > 0) {
			for (local40 = 0; local40 < arg2; local40++) {
				local44 = (int) arg1;
				arg1 /= 10L;
				local36.append((char) (local44 + 48 - (int) arg1 * 10));
			}
			local36.append(local5);
		}
		local40 = 0;
		while (true) {
			local44 = (int) arg1;
			arg1 /= 10L;
			local36.append((char) (local44 + 48 - (int) arg1 * 10));
			if (arg1 == 0L) {
				if (local20) {
					local36.append('-');
				}
				return local36.reverse().toString();
			}
			if (arg3) {
				local40++;
				if (local40 % 3 == 0) {
					local36.append(local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(II)I")
	public static int method1790(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(19) int local19 = local13 | local13 >>> 2;
		@Pc(30) int local30 = local19 | local19 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return ~local42 & arg0;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(Ljava/lang/String;JIIIZLjava/lang/String;ZIII)V")
	public static void method1792(@OriginalArg(0) String arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) String arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (!Static438.aBoolean636 && Static158.anInt3162 < 500) {
			@Pc(20) int local20 = arg2 == -1 ? Static25.anInt849 : arg2;
			@Pc(34) Class3_Sub14 local34 = new Class3_Sub14(arg5, arg0, local20, arg9, arg8, arg1, arg7, arg3, arg4, arg6);
			Static184.aClass243_21.method5198(local34);
			Static158.anInt3162++;
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(III)V")
	public static void method1793(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub4_Sub12 local8 = Static393.method5080(arg0, 7);
		local8.method3248();
		local8.anInt4063 = arg1;
	}

	@OriginalMember(owner = "client!ew", name = "c", descriptor = "(II)Z")
	public static boolean method1794(@OriginalArg(0) int arg0) {
		if (arg0 == 5 || arg0 == 45 || arg0 == 21 || arg0 == 47 || arg0 == 1006) {
			return true;
		} else {
			return arg0 == 60 || arg0 == 1011;
		}
	}
}
