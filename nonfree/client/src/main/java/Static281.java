import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static281 {

	@OriginalMember(owner = "client!lr", name = "kb", descriptor = "Lclient!qa;")
	public static Class4 aClass4_9;

	@OriginalMember(owner = "client!lr", name = "db", descriptor = "Lclient!g;")
	public static final Class110 aClass110_17 = new Class110(1);

	@OriginalMember(owner = "client!lr", name = "mb", descriptor = "[F")
	public static final float[] aFloatArray47 = new float[4];

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIZZ)V")
	public static void method4923(@OriginalArg(3) boolean arg0) {
		Static411.anInt9206 = 22050;
		Static121.aBoolean214 = arg0;
		Static367.anInt6638 = 2;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(III)Z")
	public static boolean method4924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(BILclient!mh;IZI[BI)Lclient!wo;")
	public static Class164_Sub3_Sub1 method4925(@OriginalArg(2) Class4_Sub3 arg0, @OriginalArg(3) int arg1, @OriginalArg(6) byte[] arg2, @OriginalArg(7) int arg3) {
		if (arg0.aBoolean430 || Static329.method5606(arg3) && Static329.method5606(arg1)) {
			return new Class164_Sub3_Sub1(arg0, 3553, 6406, arg3, arg1, false, arg2, 6406);
		} else if (arg0.aBoolean433) {
			return new Class164_Sub3_Sub1(arg0, 34037, 6406, arg3, arg1, false, arg2, 6406);
		} else {
			return new Class164_Sub3_Sub1(arg0, 6406, arg3, arg1, Static184.method3549(arg3), Static184.method3549(arg1), arg2, 6406);
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIBII)V")
	public static void method4927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 >= Static325.anInt6148 && arg0 <= Static119.anInt2469 && arg3 >= Static94.anInt2057 && arg1 <= Static187.anInt3872) {
			Static243.method4317(arg1, arg4, arg3, arg0, arg2);
		} else {
			Static66.method1653(arg2, arg0, arg1, arg3, arg4);
		}
	}
}
