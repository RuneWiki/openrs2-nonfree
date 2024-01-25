import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!bo", name = "q", descriptor = "I")
	public static int anInt883;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(III)Lclient!hd;")
	public static Class6_Sub5_Sub8 method760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) Class6_Sub5_Sub8 local17 = (Class6_Sub5_Sub8) Static46.aClass234_2.method5464((long) arg1 | (long) arg0 << 32);
		if (local17 == null) {
			local17 = new Class6_Sub5_Sub8(arg0, arg1);
			Static46.aClass234_2.method5466(local17.aLong245, local17);
		}
		return local17;
	}

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "(I)V")
	public static void method761() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static297.aBooleanArray18[local3] = false;
		}
		Static140.anInt2734 = -1;
		Static119.anInt7222 = 0;
		Static383.anInt7014 = Static208.anInt3949;
		Static376.anInt6855 = Static12.anInt183;
		Static534.anInt8866 = Static232.anInt9865;
		Static89.anInt1491 = -1;
		Static331.anInt6260 = Static363.anInt6671;
		Static60.anInt1008 = 5;
		Static478.anInt8411 = 0;
		Static79.anInt2702 = Static378.anInt6923;
		Static58.anInt1002 = Static38.anInt742;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;II)V")
	public static void method762(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(13) Class283 local13 = Static427.aClass283Array1[99];
		for (@Pc(15) int local15 = 99; local15 > 0; local15--) {
			Static427.aClass283Array1[local15] = Static427.aClass283Array1[local15 - 1];
		}
		if (local13 == null) {
			local13 = new Class283(arg3, arg7, arg5, arg2, arg0, arg4, arg6, arg1);
		} else {
			local13.method6355(arg6, arg4, arg7, arg2, arg5, arg0, arg3, arg1);
		}
		Static422.anInt7485++;
		Static427.aClass283Array1[0] = local13;
		Static336.anInt6407 = Static124.anInt2133;
	}
}
