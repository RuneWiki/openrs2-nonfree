import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static394 {

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "Lclient!cw;")
	public static Class47 aClass47_2;

	@OriginalMember(owner = "client!tr", name = "i", descriptor = "I")
	public static int anInt6483 = 0;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIZILjava/lang/String;II)V")
	public static void method5033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class21_Sub8 local7 = new Class21_Sub8();
		local7.anInt7106 = arg6;
		local7.anInt7103 = arg5;
		local7.aString197 = arg4;
		local7.anInt7110 = arg2;
		local7.anInt7113 = arg0;
		local7.anInt7111 = arg1;
		local7.anInt7109 = arg3 + Static266.anInt4392;
		Static286.aClass93_4.method2079(local7);
	}
}
