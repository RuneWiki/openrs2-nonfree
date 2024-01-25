import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "Z")
	public static boolean aBoolean324 = false;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(BLclient!jo;)V")
	public static void method3501(@OriginalArg(1) Class168 arg0) {
		Static579.aClass168_97 = arg0;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Z)J")
	public static synchronized long method3502() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (local5 < Static431.aLong184) {
			Static510.aLong147 += Static431.aLong184 - local5;
		}
		Static431.aLong184 = local5;
		return local5 + Static510.aLong147;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V")
	public static void method3503() {
		Static336.anIntArray462 = Static373.method5923(0.4F);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "([IIII[I)V")
	public static void method3504(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(22) int local22 = (arg2 + arg1) / 2;
		@Pc(24) int local24 = arg1;
		@Pc(28) int local28 = arg3[local22];
		arg3[local22] = arg3[arg2];
		arg3[arg2] = local28;
		@Pc(42) int local42 = arg0[local22];
		arg0[local22] = arg0[arg2];
		arg0[arg2] = local42;
		@Pc(61) int local61 = ~local28 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(63) int local63 = arg1; local63 < arg2; local63++) {
			if (arg3[local63] < local28 + (local61 & local63)) {
				@Pc(83) int local83 = arg3[local63];
				arg3[local63] = arg3[local24];
				arg3[local24] = local83;
				@Pc(97) int local97 = arg0[local63];
				arg0[local63] = arg0[local24];
				arg0[local24++] = local97;
			}
		}
		arg3[arg2] = arg3[local24];
		arg3[local24] = local28;
		arg0[arg2] = arg0[local24];
		arg0[local24] = local42;
		method3504(arg0, arg1, local24 - 1, arg3);
		method3504(arg0, local24 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(III)Z")
	public static boolean method3505(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
