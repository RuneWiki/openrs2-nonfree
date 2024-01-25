import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "I")
	public static int anInt6452;

	@OriginalMember(owner = "client!kp", name = "g", descriptor = "I")
	public static int anInt6457;

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "I")
	public static int anInt6453 = 0;

	@OriginalMember(owner = "client!kp", name = "e", descriptor = "I")
	public static int anInt6455 = 0;

	@OriginalMember(owner = "client!kp", name = "i", descriptor = "I")
	public static int anInt6459 = -1;

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)V")
	public static void method5055(@OriginalArg(1) int arg0) {
		@Pc(11) Class1_Sub1_Sub1 local11 = Static190.method3007(arg0, 3);
		local11.method28();
	}
}
