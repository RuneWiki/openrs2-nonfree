import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!pca", name = "d", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray3;

	@OriginalMember(owner = "client!pca", name = "f", descriptor = "Lclient!bg;")
	public static Class33 aClass33_1;

	@OriginalMember(owner = "client!pca", name = "j", descriptor = "[[B")
	public static byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!pca", name = "h", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_73 = new Class303(21, 8);

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(ILclient!vj;IIII)Lclient!br;")
	public static Class24_Sub1_Sub1 method5816(@OriginalArg(0) int arg0, @OriginalArg(1) Class45_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1.aBoolean707 || Static259.method3984(arg4) && Static259.method3984(arg3)) {
			return new Class24_Sub1_Sub1(arg1, 3553, arg2, arg0, arg4, arg3, true);
		} else if (arg1.aBoolean698) {
			return new Class24_Sub1_Sub1(arg1, 34037, arg2, arg0, arg4, arg3, true);
		} else {
			return new Class24_Sub1_Sub1(arg1, arg2, arg0, arg4, arg3, Static371.method5424(arg4), Static371.method5424(arg3), true);
		}
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(BLclient!r;)V")
	public static void method5820(@OriginalArg(1) Class45 arg0) {
		for (@Pc(11) Class41_Sub9 local11 = (Class41_Sub9) Static361.aClass178_20.method4168(); local11 != null; local11 = (Class41_Sub9) Static361.aClass178_20.method4165()) {
			if (local11.aBoolean724) {
				local11.method7720(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(B)V")
	public static void method5821() {
		Static51.aClass6_5.method102();
		Static490.aClass6_60.method102();
		Static301.aClass6_34.method102();
		Static296.aClass6_32.method102();
	}
}
