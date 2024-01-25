import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "[I")
	public static int[] anIntArray741;

	@OriginalMember(owner = "client!qp", name = "f", descriptor = "Lclient!kea;")
	public static Class161 aClass161_107;

	@OriginalMember(owner = "client!qp", name = "g", descriptor = "Lclient!dd;")
	public static Class60 aClass60_2;

	@OriginalMember(owner = "client!qp", name = "e", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_119 = new Class158(27, 18);

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V")
	public static void method7152() {
		Static302.method4985();
		Static549.aClass66_4 = null;
		Static214.aClass66_2 = null;
		Static401.aClass66_3 = null;
		Static236.aClass5_4 = null;
		Static313.aClass92ArrayArray1 = null;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(ZIIIII)V")
	public static void method7153(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 1) {
			arg2 = 1;
		}
		if (arg4 < 1) {
			arg4 = 1;
		}
		@Pc(19) int local19 = arg4 - 334;
		if (local19 < 0) {
			local19 = 0;
		} else if (local19 > 100) {
			local19 = 100;
		}
		@Pc(44) int local44 = Static44.aShort19 + local19 * (Static147.aShort45 - Static44.aShort19) / 100;
		if (local44 < Static347.aShort99) {
			local44 = Static347.aShort99;
		} else if (local44 > Static205.aShort72) {
			local44 = Static205.aShort72;
		}
		@Pc(66) int local66 = arg4 * 512 * local44 / (arg2 * 334);
		@Pc(104) int local104;
		@Pc(111) int local111;
		@Pc(75) short local75;
		if (local66 < Static194.aShort71) {
			local75 = Static194.aShort71;
			local44 = arg2 * local75 * 334 / (arg4 * 512);
			if (local44 > Static205.aShort72) {
				local44 = Static205.aShort72;
				local104 = arg4 * 512 * local44 / (local75 * 334);
				local111 = (arg2 - local104) / 2;
				if (arg0) {
					Static121.aClass5_7.F();
					Static121.aClass5_7.method7459(local111, arg3, -16777216, arg4, arg1);
					Static121.aClass5_7.method7459(local111, arg3, -16777216, arg4, arg1 + arg2 - local111);
				}
				arg2 -= local111 * 2;
				arg1 += local111;
			}
		} else if (Static119.aShort39 < local66) {
			local75 = Static119.aShort39;
			local44 = local75 * 334 * arg2 / (arg4 * 512);
			if (Static347.aShort99 > local44) {
				local44 = Static347.aShort99;
				local104 = arg2 * local75 * 334 / (local44 * 512);
				local111 = (arg4 - local104) / 2;
				if (arg0) {
					Static121.aClass5_7.F();
					Static121.aClass5_7.method7459(arg2, arg3, -16777216, local111, arg1);
					Static121.aClass5_7.method7459(arg2, arg4 + arg3 - local111, -16777216, local111, arg1);
				}
				arg4 -= local111 * 2;
				arg3 += local111;
			}
		}
		Static57.anInt1221 = arg4 * local44 / 334;
		Static188.anInt4292 = (short) arg2;
		Static163.anInt9272 = arg3;
		Static18.anInt679 = (short) arg4;
		Static220.anInt4797 = arg1;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IBLclient!qf;I)V")
	public static void method7156(@OriginalArg(0) int arg0, @OriginalArg(2) Class245 arg1, @OriginalArg(3) int arg2) {
		Static489.anInt8713 = arg2;
		Static216.anInt2086 = arg0;
		Static398.aClass245_14 = arg1;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "()V")
	public static void method7157() {
		Static366.method5735(Static399.anInt7385);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method7158(@OriginalArg(0) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(20) int local20 = 0; local20 < local10; local20++) {
			local7 *= 37L;
			@Pc(30) char local30 = arg0.charAt(local20);
			if (local30 >= 'A' && local30 <= 'Z') {
				local7 += local30 + 1 - 65;
			} else if (local30 >= 'a' && local30 <= 'z') {
				local7 += local30 + 1 - 97;
			} else if (local30 >= '0' && local30 <= '9') {
				local7 += local30 + 27 - 48;
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

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(III)I")
	public static int method7159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = arg1 >> 31 & arg0 - 1;
		return local11 + ((arg1 >>> 31) + arg1) % arg0;
	}
}
