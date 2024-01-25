import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "[[I")
	public static int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
	public static int anInt305;

	@OriginalMember(owner = "client!ag", name = "h", descriptor = "J")
	public static long aLong21;

	@OriginalMember(owner = "client!ag", name = "i", descriptor = "Lclient!n;")
	public static Interface8 anInterface8_3;

	@OriginalMember(owner = "client!ag", name = "n", descriptor = "Lclient!kr;")
	public static Class171 aClass171_12;

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "J")
	public static long aLong20 = -1L;

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(II)Lclient!ov;")
	public static Class226 method386(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			if ((double) Static118.aFloat10 == 3.0D) {
				return Static333.aClass226_10;
			}
			if ((double) Static118.aFloat10 == 4.0D) {
				return Static470.aClass226_8;
			}
			if ((double) Static118.aFloat10 == 6.0D) {
				return Static97.aClass226_3;
			}
			if ((double) Static118.aFloat10 >= 8.0D) {
				return Static268.aClass226_7;
			}
		} else if (arg0 == 1) {
			if ((double) Static118.aFloat10 == 3.0D) {
				return Static97.aClass226_3;
			}
			if ((double) Static118.aFloat10 == 4.0D) {
				return Static268.aClass226_7;
			}
			if ((double) Static118.aFloat10 == 6.0D) {
				return Static24.aClass226_1;
			}
			if ((double) Static118.aFloat10 >= 8.0D) {
				return Static210.aClass226_6;
			}
		} else if (arg0 == 2) {
			if ((double) Static118.aFloat10 == 3.0D) {
				return Static24.aClass226_1;
			}
			if ((double) Static118.aFloat10 == 4.0D) {
				return Static210.aClass226_6;
			}
			if ((double) Static118.aFloat10 == 6.0D) {
				return Static89.aClass226_2;
			}
			if ((double) Static118.aFloat10 >= 8.0D) {
				return Static534.aClass226_9;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(JILjava/lang/String;IIILjava/lang/String;IZZI)V")
	public static void method390(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9) {
		if (!Static15.aBoolean16 && Static16.anInt415 < 500) {
			@Pc(21) int local21 = arg9 == -1 ? Static108.anInt2198 : arg9;
			@Pc(35) Class1_Sub24 local35 = new Class1_Sub24(arg5, arg2, local21, arg4, arg6, arg0, arg3, arg1, arg7, arg8);
			Static248.aClass37_30.method970(local35);
			Static16.anInt415++;
		}
	}
}
