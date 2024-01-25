import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!mj", name = "i", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_125 = new Class151(101, -1);

	@OriginalMember(owner = "client!mj", name = "p", descriptor = "[I")
	public static final int[] anIntArray432 = new int[6];

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILjava/lang/String;IIIBII)V")
	public static void method4935(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class3_Sub9 local7 = new Class3_Sub9();
		local7.anInt10332 = arg0;
		local7.anInt10338 = arg5;
		local7.anInt10334 = arg6;
		local7.aString123 = arg1;
		local7.anInt10328 = Static177.anInt3088 + arg3;
		local7.anInt10337 = arg4;
		local7.anInt10330 = arg2;
		Static505.aClass236_6.method4955(local7);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZJ)I")
	public static int method4938(@OriginalArg(1) long arg0) {
		Static56.method1300(arg0);
		return Static33.aCalendar24.get(1);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)I")
	public static int method4942(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static249.anIntArray298[arg1 & 0x3] : Static650.anIntArray709[arg1 & 0x3];
	}
}
