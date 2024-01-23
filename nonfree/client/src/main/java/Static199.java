import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!oi", name = "e", descriptor = "Z")
	public static boolean aBoolean348;

	@OriginalMember(owner = "client!oi", name = "j", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString133 = null;

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "[I")
	public static int[] anIntArray414 = new int[256];

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString134 = "green:";

	@OriginalMember(owner = "client!oi", name = "f", descriptor = "S")
	public static short aShort44 = 256;

	@OriginalMember(owner = "client!oi", name = "h", descriptor = "Lclient!ui;")
	public static Class175 aClass175_31 = new Class175(64);

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(I[Ljava/lang/String;II)Ljava/lang/String;")
	public static String method3411(@OriginalArg(1) String[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(20) String local20 = arg0[arg1];
			return local20 == null ? "null" : local20.toString();
		} else {
			@Pc(30) int local30 = 0;
			@Pc(34) int local34 = arg2 + arg1;
			for (@Pc(36) int local36 = arg1; local36 < local34; local36++) {
				@Pc(43) String local43 = arg0[local36];
				if (local43 == null) {
					local30 += 4;
				} else {
					local30 += local43.length();
				}
			}
			@Pc(62) StringBuffer local62 = new StringBuffer(local30);
			for (@Pc(64) int local64 = arg1; local64 < local34; local64++) {
				@Pc(71) String local71 = arg0[local64];
				if (local71 == null) {
					local62.append("null");
				} else {
					local62.append(local71);
				}
			}
			return local62.toString();
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)V")
	public static void method3412() {
		Static266.aClass175_39.method4288(5);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "([Ljava/lang/Object;[IIBI)V")
	public static void method3413(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg2) {
			return;
		}
		@Pc(21) int local21 = (arg2 + arg3) / 2;
		@Pc(25) int local25 = arg1[local21];
		arg1[local21] = arg1[arg2];
		@Pc(33) int local33 = arg3;
		arg1[arg2] = local25;
		@Pc(41) Object local41 = arg0[local21];
		arg0[local21] = arg0[arg2];
		arg0[arg2] = local41;
		for (@Pc(53) int local53 = arg3; local53 < arg2; local53++) {
			if (arg1[local53] < (local53 & 0x1) + local25) {
				@Pc(70) int local70 = arg1[local53];
				arg1[local53] = arg1[local33];
				arg1[local33] = local70;
				@Pc(84) Object local84 = arg0[local53];
				arg0[local53] = arg0[local33];
				arg0[local33++] = local84;
			}
		}
		arg1[arg2] = arg1[local33];
		arg1[local33] = local25;
		arg0[arg2] = arg0[local33];
		arg0[local33] = local41;
		method3413(arg0, arg1, local33 - 1, arg3);
		method3413(arg0, arg1, arg2, local33 + 1);
	}
}
