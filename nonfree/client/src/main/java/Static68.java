import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!cn", name = "m", descriptor = "I")
	public static int anInt1305;

	@OriginalMember(owner = "client!cn", name = "n", descriptor = "Lclient!sea;")
	public static Class308 aClass308_29;

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIIIIIZ)V")
	public static void method1135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (Static86.aClass1_Sub30_Sub1_1.anInt6185 != 0 && arg5 != 0 && Static439.anInt8379 < 50 && arg3 != -1) {
			Static73.aClass239Array1[Static439.anInt8379++] = new Class239((byte) 2, arg3, arg5, arg4, arg1, arg2, arg0, null);
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IZI)V")
	public static void method1136(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub8_Sub9 local8 = Static465.method6470(arg1, 12);
		local8.method4833();
		local8.anInt5968 = arg0;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lclient!r;BLclient!in;)V")
	public static void method1137(@OriginalArg(0) Class78 arg0, @OriginalArg(2) Class160 arg1) {
		@Pc(31) boolean local31 = Static230.aClass225_1.method4868(arg1.anInt4178, arg1.anInt4167, arg1.anInt4157, arg1.anInt4205, arg0, arg1.aBoolean299 ? Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aClass283_1 : null, arg1.anInt4208 | 0xFF000000) == null;
		if (local31) {
			Static251.aClass111_22.method2552(new Class1_Sub50(arg1.anInt4205, arg1.anInt4178, arg1.anInt4167, arg1.anInt4208 | 0xFF000000, arg1.anInt4157, arg1.aBoolean299));
			Static415.method5900(arg1);
		}
	}
}
