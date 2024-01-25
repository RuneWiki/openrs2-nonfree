import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!bo", name = "L", descriptor = "Lclient!ij;")
	public static Class93 aClass93_11;

	@OriginalMember(owner = "client!bo", name = "W", descriptor = "[Z")
	public static boolean[] aBooleanArray4;

	@OriginalMember(owner = "client!bo", name = "P", descriptor = "I")
	public static int anInt590 = 0;

	@OriginalMember(owner = "client!bo", name = "U", descriptor = "I")
	public static int anInt592 = -1;

	@OriginalMember(owner = "client!bo", name = "Y", descriptor = "I")
	public static int anInt594 = 0;

	@OriginalMember(owner = "client!bo", name = "Z", descriptor = "F")
	public static float aFloat7 = 1024.0F;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Ljava/lang/String;BILclient!ok;ILclient!vg;IILclient!ci;Lclient!de;II)V")
	public static void method534(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class18 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class201 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class36 arg7, @OriginalArg(9) Class46 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(13) int local13;
		if (Static53.anInt992 == 4) {
			local13 = (int) Static164.aFloat24 & 0x3FFF;
		} else {
			local13 = (int) Static164.aFloat24 + Static170.anInt3407 & 0x3FFF;
		}
		@Pc(38) int local38 = Math.max(arg4.anInt6505 / 2, arg4.anInt6510 / 2) + 10;
		@Pc(47) int local47 = arg5 * arg5 + arg9 * arg9;
		if (local47 > local38 * local38) {
			return;
		}
		@Pc(57) int local57 = Class187.anIntArray571[local13];
		@Pc(61) int local61 = Class187.anIntArray570[local13];
		if (Static53.anInt992 != 4) {
			local57 = local57 * 256 / (Static9.anInt191 + 256);
			local61 = local61 * 256 / (Static9.anInt191 + 256);
		}
		@Pc(90) int local90 = local61 * arg5 + arg9 * local57 >> 15;
		@Pc(101) int local101 = local61 * arg9 - local57 * arg5 >> 15;
		@Pc(108) int local108 = arg7.method642(arg0, null, 100);
		@Pc(116) int local116 = arg7.method645(null, arg0);
		@Pc(122) int local122 = local90 - local108 / 2;
		if (local122 >= -arg4.anInt6505 && local122 <= arg4.anInt6505 && local101 >= -arg4.anInt6510 && arg4.anInt6510 >= local101) {
			arg2.method4178(0, 0, arg0, arg6, 0, 50, 1, null, arg4.anInt6505 / 2 + arg10 + local122, arg8, null, arg1 + arg4.anInt6510 / 2 - local101 - arg3 - local116, arg1, arg10, local108);
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method536(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIB[I[Ljava/lang/Object;)V")
	public static void method537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Object[] arg3) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(17) int local17 = (arg1 + arg0) / 2;
		@Pc(19) int local19 = arg0;
		@Pc(23) int local23 = arg2[local17];
		arg2[local17] = arg2[arg1];
		arg2[arg1] = local23;
		@Pc(37) Object local37 = arg3[local17];
		arg3[local17] = arg3[arg1];
		arg3[arg1] = local37;
		for (@Pc(49) int local49 = arg0; local49 < arg1; local49++) {
			if (local23 + (local49 & 0x1) > arg2[local49]) {
				@Pc(68) int local68 = arg2[local49];
				arg2[local49] = arg2[local19];
				arg2[local19] = local68;
				@Pc(82) Object local82 = arg3[local49];
				arg3[local49] = arg3[local19];
				arg3[local19++] = local82;
			}
		}
		arg2[arg1] = arg2[local19];
		arg2[local19] = local23;
		arg3[arg1] = arg3[local19];
		arg3[local19] = local37;
		method537(arg0, local19 - 1, arg2, arg3);
		method537(local19 + 1, arg1, arg2, arg3);
	}
}
