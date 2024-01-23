import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!li", name = "b", descriptor = "I")
	public static int anInt3528;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "I")
	public static int anInt3527 = 0;

	@OriginalMember(owner = "client!li", name = "e", descriptor = "I")
	public static int anInt3531 = 1;

	@OriginalMember(owner = "client!li", name = "f", descriptor = "I")
	public static int anInt3532 = 0;

	@OriginalMember(owner = "client!li", name = "g", descriptor = "Z")
	public static boolean aBoolean182 = false;

	@OriginalMember(owner = "client!li", name = "i", descriptor = "[I")
	public static int[] anIntArray325 = new int[2000];

	@OriginalMember(owner = "client!li", name = "m", descriptor = "I")
	public static int anInt3537 = 0;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(II)I")
	public static int method2850(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "([BI)Lclient!ml;")
	public static Class1_Sub2_Sub16 method2852(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(25) Class1_Sub2_Sub16 local25;
		if (Static296.aBoolean335) {
			local25 = new Class1_Sub2_Sub16_Sub1(arg0, Static298.anIntArray623, Static121.anIntArray257, Static166.anIntArray343, Static81.anIntArray204, Static200.aByteArrayArray83);
		} else {
			local25 = new Class1_Sub2_Sub16_Sub2(arg0, Static298.anIntArray623, Static121.anIntArray257, Static166.anIntArray343, Static81.anIntArray204, Static200.aByteArrayArray83);
		}
		Static265.method4490();
		return local25;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!kb;ILclient!kb;)V")
	public static void method2853(@OriginalArg(0) Class83 arg0, @OriginalArg(2) Class83 arg1) {
		Static229.aClass83_154 = arg0;
		Static105.aClass83_201 = arg1;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
	public static void method2854() {
		@Pc(8) int[] local8 = new int[Static78.anInt1887];
		@Pc(10) int local10 = 0;
		@Pc(16) int local16;
		for (local16 = 0; local16 < Static78.anInt1887; local16++) {
			@Pc(27) Class138 local27 = Static238.method4099(local16);
			if (local27.anInt5057 >= 0 || local27.anInt5080 >= 0) {
				local8[local10++] = local16;
			}
		}
		Static265.anIntArray572 = new int[local10];
		for (local16 = 0; local16 < local10; local16++) {
			Static265.anIntArray572[local16] = local8[local16];
		}
	}
}
