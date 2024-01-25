import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static601 {

	@OriginalMember(owner = "client!tv", name = "d", descriptor = "Lclient!ht;")
	public static Class165 aClass165_5;

	@OriginalMember(owner = "client!tv", name = "f", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_177 = new Class322(14, -1);

	@OriginalMember(owner = "client!tv", name = "e", descriptor = "Lclient!kl;")
	public static final Class211 aClass211_6 = new Class211();

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "I")
	public static int anInt9518 = 0;

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(II[[[BIIIIIILclient!ha;III)V")
	public static void method8305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class75 arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (arg6 == 0 || arg1 == 0) {
			return;
		}
		if (arg6 == 9) {
			arg6 = 1;
			arg8 = arg8 + 1 & 0x3;
		}
		if (arg6 == 10) {
			arg6 = 1;
			arg8 = arg8 + 3 & 0x3;
		}
		if (arg6 == 11) {
			arg6 = 8;
			arg8 = arg8 + 3 & 0x3;
		}
		arg9.Q(arg10, arg4, arg11, arg7, arg3, arg5, arg2[arg6 - 1][arg8], arg1, arg0);
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;II)V")
	public static void method8306(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(5) String arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(28) Class321 local28 = Static358.aClass321Array1[99];
		for (@Pc(30) int local30 = 99; local30 > 0; local30--) {
			Static358.aClass321Array1[local30] = Static358.aClass321Array1[local30 - 1];
		}
		if (local28 == null) {
			local28 = new Class321(arg1, arg7, arg5, arg2, arg0, arg4, arg6, arg3);
		} else {
			local28.method7713(arg0, arg7, arg6, arg5, arg3, arg1, arg4, arg2);
		}
		Static358.aClass321Array1[0] = local28;
		Static139.anInt2876++;
		Static623.anInt9826 = Static633.anInt8242;
	}
}
