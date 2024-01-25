import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!is", name = "L", descriptor = "F")
	public static float aFloat51;

	@OriginalMember(owner = "client!is", name = "H", descriptor = "I")
	public static int anInt3402 = 100;

	@OriginalMember(owner = "client!is", name = "J", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_118 = new Class67(20, -1);

	@OriginalMember(owner = "client!is", name = "K", descriptor = "I")
	public static int anInt3404 = -1;

	@OriginalMember(owner = "client!is", name = "S", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_49 = new Class242(57, -1);

	@OriginalMember(owner = "client!is", name = "T", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_119 = new Class67(14, 8);

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IILclient!et;I)V")
	public static void method2672(@OriginalArg(0) int arg0, @OriginalArg(2) Class11_Sub1_Sub3_Sub1 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg1.anInt3302 && arg2 != -1) {
			@Pc(90) Class64 local90 = Static402.aClass37_2.method665(arg2);
			@Pc(93) int local93 = local90.anInt1204;
			if (local93 == 1) {
				arg1.anInt3337 = arg0;
				arg1.anInt3268 = 0;
				arg1.anInt3278 = 0;
				arg1.anInt3296 = 0;
				arg1.anInt3275 = 1;
				Static379.method131(arg1.anInt3296, arg1.anInt6428, local90, arg1.aByte90, false, arg1.anInt6430);
			}
			if (local93 == 2) {
				arg1.anInt3278 = 0;
				return;
			}
		} else if (arg2 == -1 || arg1.anInt3302 == -1 || Static402.aClass37_2.method665(arg2).anInt1199 >= Static402.aClass37_2.method665(arg1.anInt3302).anInt1199) {
			arg1.anInt3344 = arg1.anInt3342;
			arg1.anInt3337 = arg0;
			arg1.anInt3275 = 1;
			arg1.anInt3302 = arg2;
			arg1.anInt3268 = 0;
			arg1.anInt3278 = 0;
			arg1.anInt3296 = 0;
			if (arg1.anInt3302 != -1) {
				Static379.method131(arg1.anInt3296, arg1.anInt6428, Static402.aClass37_2.method665(arg1.anInt3302), arg1.aByte90, false, arg1.anInt6430);
				return;
			}
		} else {
			return;
		}
	}
}
