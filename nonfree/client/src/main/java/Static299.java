import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static299 {

	@OriginalMember(owner = "client!jha", name = "i", descriptor = "[F")
	public static final float[] aFloatArray25 = new float[4];

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(IZ)V")
	public static void method4190() {
		Static650.aClass2_Sub30_29.method2988(0, Static650.aClass2_Sub30_29.aClass11_Sub12_2);
		Static650.aClass2_Sub30_29.method2988(0, Static650.aClass2_Sub30_29.aClass11_Sub12_1);
		Static650.aClass2_Sub30_29.method2988(1, Static650.aClass2_Sub30_29.aClass11_Sub27_2);
		Static650.aClass2_Sub30_29.method2988(1, Static650.aClass2_Sub30_29.aClass11_Sub27_1);
		Static650.aClass2_Sub30_29.method2988(0, Static650.aClass2_Sub30_29.aClass11_Sub25_1);
		Static650.aClass2_Sub30_29.method2988(0, Static650.aClass2_Sub30_29.aClass11_Sub7_1);
		Static650.aClass2_Sub30_29.method2988(0, Static650.aClass2_Sub30_29.aClass11_Sub10_1);
		Static650.aClass2_Sub30_29.method2988(0, Static650.aClass2_Sub30_29.aClass11_Sub24_1);
		Static650.aClass2_Sub30_29.method2988(0, Static650.aClass2_Sub30_29.aClass11_Sub1_1);
		Static650.aClass2_Sub30_29.method2988(0, Static650.aClass2_Sub30_29.aClass11_Sub21_1);
		Static650.aClass2_Sub30_29.method2988(0, Static650.aClass2_Sub30_29.aClass11_Sub16_1);
		Static650.aClass2_Sub30_29.method2988(0, Static650.aClass2_Sub30_29.aClass11_Sub4_1);
		Static650.aClass2_Sub30_29.method2988(0, Static650.aClass2_Sub30_29.aClass11_Sub29_1);
		Static650.aClass2_Sub30_29.method2988(0, Static650.aClass2_Sub30_29.aClass11_Sub26_1);
		Static650.aClass2_Sub30_29.method2988(0, Static650.aClass2_Sub30_29.aClass11_Sub18_2);
		Static650.aClass2_Sub30_29.method2988(0, Static650.aClass2_Sub30_29.aClass11_Sub18_1);
		Static650.aClass2_Sub30_29.method2988(0, Static650.aClass2_Sub30_29.aClass11_Sub19_1);
		Static650.aClass2_Sub30_29.method2988(0, Static650.aClass2_Sub30_29.aClass11_Sub13_1);
		Static650.aClass2_Sub30_29.method2988(0, Static650.aClass2_Sub30_29.aClass11_Sub23_1);
		Static650.aClass2_Sub30_29.method2988(0, Static650.aClass2_Sub30_29.aClass11_Sub17_1);
		Static334.method4628();
		Static650.aClass2_Sub30_29.method2988(2, Static650.aClass2_Sub30_29.aClass11_Sub14_1);
		Static650.aClass2_Sub30_29.method2988(1, Static650.aClass2_Sub30_29.aClass11_Sub9_1);
		Static593.method8176();
		Static408.method6014();
		Static30.aBoolean64 = true;
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(IIII)I")
	public static int method4192(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg1 >>= 0x4;
		} else if (arg2 > 217) {
			arg1 >>= 0x3;
		} else if (arg2 > 192) {
			arg1 >>= 0x2;
		} else if (arg2 > 179) {
			arg1 >>= 0x1;
		}
		return (arg1 >> 5 << 7) + ((arg0 & 0xFF) >> 2 << 10) + (arg2 >> 1);
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(II)V")
	public static void method4193(@OriginalArg(0) int arg0) {
		Static288.anInt4460 = arg0;
		Static533.aClass85_54.method1748();
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(III)Z")
	public static boolean method4195(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static302.method4222(arg0, arg1) & Static507.method7185(arg0, arg1);
	}
}
