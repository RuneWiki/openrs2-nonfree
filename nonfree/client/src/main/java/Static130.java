import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!ge", name = "t", descriptor = "F")
	public static float aFloat61;

	@OriginalMember(owner = "client!ge", name = "u", descriptor = "Lclient!qc;")
	public static Class153_Sub1 aClass153_Sub1_1;

	@OriginalMember(owner = "client!ge", name = "w", descriptor = "Z")
	public static boolean aBoolean143;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZ)V")
	public static void method2094(@OriginalArg(1) boolean arg0) {
		if (Static223.aString46.length() == 0) {
			return;
		}
		Static269.method3626("--> " + Static223.aString46);
		Static167.method2414(Static223.aString46, false, arg0);
		Static267.anInt4535 = 0;
		Static223.aString46 = "";
		Static422.anInt6912 = 0;
	}

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "(I)V")
	public static void method2095() {
		Static273.aClass126_39.method2827();
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!pf;Lclient!sr;BLclient!vi;III)V")
	public static void method2096(@OriginalArg(0) int arg0, @OriginalArg(1) Class189 arg1, @OriginalArg(2) Class26_Sub2_Sub4_Sub1 arg2, @OriginalArg(4) Class26_Sub2_Sub4_Sub2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(13) Class7_Sub13 local13 = new Class7_Sub13();
		local13.anInt1395 = arg6 << 7;
		local13.anInt1402 = arg5 << 7;
		local13.anInt1393 = arg4;
		if (arg1 != null) {
			local13.aClass189_1 = arg1;
			@Pc(34) int local34 = arg1.anInt5073;
			@Pc(37) int local37 = arg1.anInt5110;
			if (arg0 == 1 || arg0 == 3) {
				local37 = arg1.anInt5073;
				local34 = arg1.anInt5110;
			}
			local13.anInt1394 = arg1.anInt5108;
			local13.anInt1398 = local34 + arg5 << 7;
			local13.anInt1401 = arg1.anInt5060 << 7;
			local13.anIntArray104 = arg1.anIntArray450;
			local13.anInt1404 = arg1.anInt5105;
			local13.anInt1400 = arg1.anInt5092;
			local13.anInt1392 = arg1.anInt5075;
			local13.anInt1391 = local37 + arg6 << 7;
			if (arg1.anIntArray448 != null) {
				local13.aBoolean86 = true;
				local13.method1199();
			}
			if (local13.anIntArray104 != null) {
				local13.anInt1397 = local13.anInt1400 + (int) (Math.random() * (double) (local13.anInt1392 - local13.anInt1400));
			}
			Static423.aClass85_47.method2011(local13);
		} else if (arg2 != null) {
			local13.aClass26_Sub2_Sub4_Sub1_1 = arg2;
			@Pc(133) Class249 local133 = arg2.aClass249_1;
			if (local133.anIntArray579 != null) {
				local13.aBoolean86 = true;
				local133 = local133.method5179(Static224.aClass239_7);
			}
			if (local133 != null) {
				local13.anInt1398 = local133.anInt6507 + arg5 << 7;
				local13.anInt1391 = arg6 + local133.anInt6507 << 7;
				local13.anInt1404 = Static27.method306(arg2);
				local13.anInt1394 = local133.anInt6528;
				local13.anInt1401 = local133.anInt6524 << 7;
			}
			Static26.aClass85_4.method2011(local13);
		} else if (arg3 != null) {
			local13.aClass26_Sub2_Sub4_Sub2_1 = arg3;
			local13.anInt1398 = arg5 + arg3.method5512() << 7;
			local13.anInt1391 = arg6 + arg3.method5512() << 7;
			local13.anInt1404 = Static362.method4647(arg3);
			local13.anInt1394 = arg3.anInt7122;
			local13.anInt1401 = arg3.anInt7126 << 7;
			Static338.aClass164_31.method3508((long) arg3.anInt7080, local13);
		}
	}
}
