import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!hf", name = "s", descriptor = "F")
	public static float aFloat47;

	@OriginalMember(owner = "client!hf", name = "z", descriptor = "Lclient!os;")
	public static final Class281 aClass281_10 = new Class281(14, 7);

	@OriginalMember(owner = "client!hf", name = "r", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_70 = new Class225(93, -2);

	@OriginalMember(owner = "client!hf", name = "t", descriptor = "Z")
	public static boolean aBoolean332 = false;

	@OriginalMember(owner = "client!hf", name = "p", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_60 = new Class349(18, -1);

	@OriginalMember(owner = "client!hf", name = "v", descriptor = "I")
	public static int anInt3710 = -1;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIII)V")
	public static void method3334(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(44) String local44 = "tele " + arg1 + "," + (arg0 >> 6) + "," + (arg2 >> 6) + "," + (arg0 & 0x3F) + "," + (arg2 & 0x3F);
		System.out.println(local44);
		Static118.method1733(local44, true, false);
	}
}
