import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!im", name = "B", descriptor = "I")
	public static int anInt7075 = 0;

	@OriginalMember(owner = "client!im", name = "C", descriptor = "J")
	public static long aLong188 = 0L;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IZ)I")
	public static int method6204(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static184.method3143(arg0);
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(II)Z")
	public static boolean method6205(@OriginalArg(0) int arg0) {
		return arg0 == 4 || arg0 == 8 || arg0 == 11;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIIIILjava/lang/String;B)V")
	public static void method6206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) String arg6) {
		@Pc(11) Class16_Sub8 local11 = new Class16_Sub8();
		local11.anInt7234 = Static389.anInt6694 + arg3;
		local11.anInt7236 = arg0;
		local11.anInt7232 = arg2;
		local11.anInt7233 = arg4;
		local11.aString61 = arg6;
		local11.anInt7229 = arg5;
		local11.anInt7235 = arg1;
		Static187.aClass19_5.method566(local11);
	}
}
