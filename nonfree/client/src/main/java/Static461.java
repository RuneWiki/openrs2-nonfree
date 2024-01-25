import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static461 {

	@OriginalMember(owner = "client!qj", name = "x", descriptor = "I")
	public static int anInt8384;

	@OriginalMember(owner = "client!qj", name = "C", descriptor = "I")
	public static int anInt8388;

	@OriginalMember(owner = "client!qj", name = "D", descriptor = "Lclient!ms;")
	public static Class220 aClass220_1;

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(III)Z")
	public static boolean method6933(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILclient!kha;ZIIJI)V")
	public static void method6934(@OriginalArg(1) Class181 arg0, @OriginalArg(4) int arg1, @OriginalArg(5) long arg2, @OriginalArg(6) int arg3) {
		Static37.method729(arg0, arg3, arg2, arg1);
	}
}
