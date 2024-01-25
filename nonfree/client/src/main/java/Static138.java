import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!er", name = "d", descriptor = "I")
	public static final int anInt2396 = 1403;

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method2061(@OriginalArg(0) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(20) int local20 = 0; local20 < local10; local20++) {
			local7 *= 37L;
			@Pc(30) char local30 = arg0.charAt(local20);
			if (local30 >= 'A' && local30 <= 'Z') {
				local7 += (long) (local30 - 64);
			} else if (local30 >= 'a' && local30 <= 'z') {
				local7 += (long) (local30 + 1 - 'a');
			} else if (local30 >= '0' && local30 <= '9') {
				local7 += (long) (local30 + 27 - 48);
			}
			if (local7 >= 177917621779460413L) {
				break;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IBILclient!ha;II)V")
	public static void method2062(@OriginalArg(0) int arg0, @OriginalArg(3) Class132 arg1, @OriginalArg(4) int arg2) {
		Static367.aClass132_7 = arg1;
		Static467.aClass207_29 = Static367.aClass132_7.method7467();
		Static621.aClass207_37 = Static367.aClass132_7.method7467();
		Static32.aClass207_6 = Static367.aClass132_7.method7467();
		Static309.anIntArray138 = null;
		Static353.anInt6019 = 0;
		Static155.anInterface16Array1 = null;
		Static583.anInt9586 = 100;
		Static43.anInt964 = 100;
		Static630.method5247(arg0, arg2);
		Static59.anInt1160 = -1;
		Static627.anInt10200 = -1;
		Static383.anInt6432 = -1;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IZIII)V")
	public static void method2063(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static49.method969();
		Static321.aLong159 = 0L;
		@Pc(15) int local15 = Static455.method6591();
		if (arg0 == 3 || local15 == 3) {
			arg1 = true;
		}
		if (!Static546.aClass132_13.method7506()) {
			arg1 = true;
		}
		Static331.method4870(arg1, arg3, arg2, local15, arg0);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIIII[B)Z")
	public static boolean method2066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) byte[] arg4) {
		@Pc(9) int local9 = arg2 % 8;
		@Pc(13) int local13;
		if (local9 == 0) {
			local13 = 0;
		} else {
			local13 = 8 - local9;
		}
		@Pc(33) int local33 = -((arg3 + 8 - 1) / 8);
		@Pc(43) int local43 = -((arg2 + 7) / 8);
		for (@Pc(45) int local45 = local33; local45 < 0; local45++) {
			for (@Pc(49) int local49 = local43; local49 < 0; local49++) {
				if (arg4[arg0] == 0) {
					return true;
				}
				arg0 += 8;
			}
			arg0 -= local13;
			if (arg4[arg0 - 1] == 0) {
				return true;
			}
			arg0 += arg1;
		}
		return false;
	}
}
