import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static423 {

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
	public static int anInt7640;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
	public static int anInt7643 = -1;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "J")
	public static long aLong204 = -1L;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IBIJZ)Ljava/lang/String;")
	public static String method6621(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg1 == 0) {
			local7 = '.';
			local9 = ',';
		}
		if (arg1 == 2) {
			local9 = ' ';
		}
		@Pc(27) boolean local27 = false;
		if (arg2 < 0L) {
			arg2 = -arg2;
			local27 = true;
		}
		@Pc(41) StringBuffer local41 = new StringBuffer(26);
		@Pc(55) int local55;
		@Pc(60) int local60;
		if (arg0 > 0) {
			for (local55 = 0; local55 < arg0; local55++) {
				local60 = (int) arg2;
				arg2 /= 10L;
				local41.append((char) (local60 + 48 - (int) arg2 * 10));
			}
			local41.append(local7);
		}
		local55 = 0;
		while (true) {
			local60 = (int) arg2;
			arg2 /= 10L;
			local41.append((char) (local60 + 48 - (int) arg2 * 10));
			if (arg2 == 0L) {
				if (local27) {
					local41.append('-');
				}
				return local41.reverse().toString();
			}
			if (arg3) {
				local55++;
				if (local55 % 3 == 0) {
					local41.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)V")
	public static void method6622(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static449.anInt7994 = arg0;
		Static429.aClass4_Sub10Array1 = new Class4_Sub10[Static256.anIntArray247[Static449.anInt7994] + 1];
		Static563.anInt9404 = 0;
		Static401.anInt7429 = 0;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)V")
	public static void method6624(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class77 local7 = Static330.aClass77ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static475.method7133(local7.aClass4_Sub1_Sub4_2);
		Static475.method7133(local7.aClass4_Sub1_Sub4_1);
		if (local7.aClass4_Sub1_Sub4_2 != null) {
			local7.aClass4_Sub1_Sub4_2 = null;
		}
		if (local7.aClass4_Sub1_Sub4_1 != null) {
			local7.aClass4_Sub1_Sub4_1 = null;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIII)V")
	public static void method6625(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(8) int local8 = 0; local8 < Static619.anInt10014; local8++) {
			@Pc(14) Rectangle local14 = Class10_Sub2.aRectangleArray2[local8];
			if (arg3 < local14.width + local14.x && local14.x < arg3 + arg2 && arg0 < local14.y + local14.height && local14.y < arg0 + arg1) {
				Static477.aBooleanArray21[local8] = true;
			}
		}
		Static520.method8069(arg3, arg0, arg3 + arg2, arg1 + arg0);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!sl;)Lclient!cw;")
	public static Class61 method6627(@OriginalArg(1) Class3_Sub3 arg0) {
		@Pc(7) Class61 local7 = new Class61();
		local7.anInt2092 = arg0.method4221();
		local7.aClass3_Sub4_Sub16_1 = Static430.aClass113_2.method2868(local7.anInt2092);
		return local7;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	public static byte[] method6628(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		if (local6 == 0) {
			return new byte[0];
		}
		@Pc(29) int local29 = local6 + 3 & 0xFFFFFFFC;
		@Pc(35) int local35 = local29 / 4 * 3;
		if (local6 <= local29 - 2 || Static232.method3888(arg0.charAt(local29 - 2)) == -1) {
			local35 -= 2;
		} else if (local29 - 1 >= local6 || Static232.method3888(arg0.charAt(local29 - 1)) == -1) {
			local35--;
		}
		@Pc(76) byte[] local76 = new byte[local35];
		Static488.method7267(local76, arg0, 0);
		return local76;
	}
}
