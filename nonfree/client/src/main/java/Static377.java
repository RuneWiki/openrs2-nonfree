import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static377 {

	@OriginalMember(owner = "client!nh", name = "M", descriptor = "Lclient!eq;")
	public static Class97 aClass97_96;

	@OriginalMember(owner = "client!nh", name = "K", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_68 = new Class269(63, -1);

	@OriginalMember(owner = "client!nh", name = "L", descriptor = "Lclient!nt;")
	public static final Class238 aClass238_40 = new Class238();

	@OriginalMember(owner = "client!nh", name = "N", descriptor = "[I")
	public static final int[] anIntArray450 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

	@OriginalMember(owner = "client!nh", name = "O", descriptor = "I")
	public static int anInt6756 = 0;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!oea;IIIII)Lclient!m;")
	public static Class88_Sub2_Sub1 method5684(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0.aBoolean550 || Static504.method7825(arg4) && Static504.method7825(arg2)) {
			return new Class88_Sub2_Sub1(arg0, 3553, arg3, arg1, arg4, arg2, true);
		} else if (arg0.aBoolean538) {
			return new Class88_Sub2_Sub1(arg0, 34037, arg3, arg1, arg4, arg2, true);
		} else {
			return new Class88_Sub2_Sub1(arg0, arg3, arg1, arg4, arg2, Static347.method5404(arg4), Static347.method5404(arg2), true);
		}
	}
}
