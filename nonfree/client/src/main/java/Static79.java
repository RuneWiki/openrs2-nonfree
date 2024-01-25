import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!du", name = "e", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IIIIB)V")
	public static void method1395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) float local9 = (float) Static148.anInt5733 / (float) Static148.anInt5729;
		@Pc(11) int local11 = arg0;
		@Pc(13) int local13 = arg2;
		if (local9 < 1.0F) {
			local13 = (int) ((float) arg0 * local9);
		} else {
			local11 = (int) ((float) arg2 / local9);
		}
		@Pc(40) int local40 = arg3 - (arg2 - local13) / 2;
		@Pc(49) int local49 = arg1 - (arg0 - local11) / 2;
		Static127.anInt2674 = -1;
		Static46.anInt5156 = Static148.anInt5733 - local40 * Static148.anInt5733 / local13;
		Static314.anInt5471 = local49 * Static148.anInt5729 / local11;
		Static71.anInt6920 = -1;
		Static394.method5160();
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method1398(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class4_Sub1_Sub11 local8 = Static405.method5222(arg1, 3);
		local8.method2604();
		local8.aString32 = arg0;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(III)V")
	public static void method1399(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class4_Sub1_Sub11 local13 = Static405.method5222(arg1, 16);
		local13.method2604();
		local13.anInt3083 = arg0;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Lclient!ya;Z)V")
	public static void method1400(@OriginalArg(0) Class19 arg0) {
		if (Static379.aClass183_45.method4148() == 0) {
			return;
		}
		@Pc(58) Class4_Sub17 local58;
		if (Static177.anInt2973 == 0) {
			for (local58 = (Class4_Sub17) Static379.aClass183_45.method4140(); local58 != null; local58 = (Class4_Sub17) Static379.aClass183_45.method4144()) {
				Static444.aClass206_3.method4699(false, local58.aBoolean222 ? Static1.aClass16_Sub1_Sub5_Sub1_1.aClass37_1 : null, Static43.aClass46_12, local58.anInt2372, local58.anInt2367, arg0, false, local58.anInt2368, local58.anInt2366, local58.anInt2373, arg0);
				local58.method5684();
			}
			Static369.method4940();
			return;
		}
		if (Static4.aClass19_34 == null) {
			@Pc(28) Canvas local28 = new Canvas();
			local28.setSize(36, 32);
			Static4.aClass19_34 = Static455.method4241(Static80.anInterface7_3, 0, local28, 0, Static206.aClass66_4);
			Static22.aClass46_4 = Static4.aClass19_34.method4275(Static239.method3546(Static177.anInt2985, Static209.aClass76_48), Static456.method327(Static293.aClass76_60, Static177.anInt2985));
		}
		for (local58 = (Class4_Sub17) Static379.aClass183_45.method4140(); local58 != null; local58 = (Class4_Sub17) Static379.aClass183_45.method4144()) {
			Static444.aClass206_3.method4699(false, local58.aBoolean222 ? Static1.aClass16_Sub1_Sub5_Sub1_1.aClass37_1 : null, Static22.aClass46_4, local58.anInt2372, local58.anInt2367, Static4.aClass19_34, false, local58.anInt2368, local58.anInt2366, local58.anInt2373, arg0);
			local58.method5684();
		}
	}
}
