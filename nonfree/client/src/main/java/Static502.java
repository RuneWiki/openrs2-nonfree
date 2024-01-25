import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static502 {

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
	public static int anInt8865;

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "Lclient!tn;")
	public static Class3_Sub15 aClass3_Sub15_9;

	@OriginalMember(owner = "client!sa", name = "h", descriptor = "F")
	public static float aFloat230 = 0.0F;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(JJ)J")
	public static long method7314(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)V")
	public static void method7317(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub1_Sub21 local8 = Static57.method8561(arg0, 4);
		local8.method8628();
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)Z")
	public static boolean method7318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10) != 0;
	}
}
