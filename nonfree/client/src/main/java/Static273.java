import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!ul", name = "l", descriptor = "[I")
	public static int[] anIntArray127;

	@OriginalMember(owner = "client!ul", name = "u", descriptor = "I")
	public static int anInt1118;

	@OriginalMember(owner = "client!ul", name = "v", descriptor = "I")
	public static int anInt1119;

	@OriginalMember(owner = "client!ul", name = "j", descriptor = "[I")
	public static int[] anIntArray126 = new int[32];

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "([Ljava/lang/String;II[SI)V")
	public static void method906(@OriginalArg(0) String[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) short[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= arg3) {
			return;
		}
		@Pc(23) int local23 = (arg1 + arg3) / 2;
		@Pc(25) int local25 = arg1;
		@Pc(29) String local29 = arg0[local23];
		arg0[local23] = arg0[arg3];
		arg0[arg3] = local29;
		@Pc(43) short local43 = arg2[local23];
		arg2[local23] = arg2[arg3];
		arg2[arg3] = local43;
		for (@Pc(55) int local55 = arg1; local55 < arg3; local55++) {
			if (local29 == null || arg0[local55] != null && arg0[local55].compareTo(local29) < (local55 & 0x1)) {
				@Pc(78) String local78 = arg0[local55];
				arg0[local55] = arg0[local25];
				arg0[local25] = local78;
				@Pc(92) short local92 = arg2[local55];
				arg2[local55] = arg2[local25];
				arg2[local25++] = local92;
			}
		}
		arg0[arg3] = arg0[local25];
		arg0[local25] = local29;
		arg2[arg3] = arg2[local25];
		arg2[local25] = local43;
		method906(arg0, arg1, arg2, local25 - 1);
		method906(arg0, local25 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "(I)V")
	public static void method910() {
		anIntArray127 = null;
		anIntArray126 = null;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(III)I")
	public static int method914(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = 0;
		while (arg1 > 0) {
			local3 = local3 << 1 | arg0 & 0x1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local3;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(B[B)Z")
	public static boolean method917(@OriginalArg(1) byte[] arg0) {
		@Pc(13) Class4_Sub17 local13 = new Class4_Sub17(arg0);
		@Pc(17) int local17 = local13.method1874();
		if (local17 != 1) {
			return false;
		}
		@Pc(33) boolean local33 = local13.method1874() == 1;
		if (local33) {
			Static122.method2059(local13);
		}
		Static96.method1560(local13);
		return true;
	}
}
