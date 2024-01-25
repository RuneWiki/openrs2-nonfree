import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!hj", name = "l", descriptor = "Lclient!aa;")
	public static Class2 aClass2_2;

	@OriginalMember(owner = "client!hj", name = "y", descriptor = "[Lclient!aa;")
	public static Class2[] aClass2Array10;

	@OriginalMember(owner = "client!hj", name = "p", descriptor = "[B")
	public static final byte[] aByteArray52 = new byte[520];

	@OriginalMember(owner = "client!hj", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString38 = null;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIZ)I")
	public static int method2357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg0 / arg1;
		@Pc(13) int local13 = arg0 & arg1 - 1;
		@Pc(17) int local17 = arg2 / arg1;
		@Pc(28) int local28 = arg1 - 1 & arg2;
		@Pc(33) int local33 = Static201.method3083(local17, local7);
		@Pc(40) int local40 = Static201.method3083(local17, local7 + 1);
		@Pc(47) int local47 = Static201.method3083(local17 + 1, local7);
		@Pc(56) int local56 = Static201.method3083(local17 + 1, local7 + 1);
		@Pc(63) int local63 = Static386.method5391(local33, arg1, local40, local13);
		@Pc(70) int local70 = Static386.method5391(local47, arg1, local56, local13);
		return Static386.method5391(local63, arg1, local70, local28);
	}
}
