import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!kd", name = "I", descriptor = "I")
	public static int anInt3245 = 0;

	@OriginalMember(owner = "client!kd", name = "K", descriptor = "I")
	public static int anInt3247 = 0;

	@OriginalMember(owner = "client!kd", name = "L", descriptor = "F")
	public static float aFloat33 = 128.0F;

	@OriginalMember(owner = "client!kd", name = "N", descriptor = "Ljava/lang/String;")
	public static String aString111 = "Loading textures - ";

	@OriginalMember(owner = "client!kd", name = "O", descriptor = "Ljava/lang/String;")
	public static String aString112 = "Loading sprites - ";

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIBLclient!cb;)V")
	public static void method2636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class15_Sub2_Sub1 arg2) {
		if (arg2.anInt5332 == arg0 && arg0 != -1) {
			@Pc(18) Class112 local18 = Static208.method3496(arg0);
			@Pc(21) int local21 = local18.anInt3857;
			if (local21 == 1) {
				arg2.anInt5368 = 0;
				arg2.anInt5362 = 1;
				arg2.anInt5377 = 0;
				arg2.anInt5343 = arg1;
				arg2.anInt5353 = 0;
				Static28.method558(false, local18, arg2.anInt5377, arg2.anInt5358, arg2.anInt5371);
			}
			if (local21 == 2) {
				arg2.anInt5353 = 0;
			}
		} else if (arg0 == -1 || arg2.anInt5332 == -1 || Static208.method3496(arg0).anInt3870 >= Static208.method3496(arg2.anInt5332).anInt3870) {
			arg2.anInt5377 = 0;
			arg2.anInt5343 = arg1;
			arg2.anInt5332 = arg0;
			arg2.anInt5353 = 0;
			arg2.anInt5368 = 0;
			arg2.anInt5362 = 1;
			arg2.anInt5370 = arg2.anInt5342;
			if (arg2.anInt5332 != -1) {
				Static28.method558(false, Static208.method3496(arg2.anInt5332), arg2.anInt5377, arg2.anInt5358, arg2.anInt5371);
			}
		}
	}
}
