import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!dk", name = "G", descriptor = "[I")
	public static int[] anIntArray95;

	@OriginalMember(owner = "client!dk", name = "I", descriptor = "I")
	public static int anInt1407;

	@OriginalMember(owner = "client!dk", name = "A", descriptor = "I")
	public static int anInt1401 = 0;

	@OriginalMember(owner = "client!dk", name = "f", descriptor = "(I)V")
	public static void method1311() {
		if (Static43.aClass205_3 == null) {
			return;
		}
		if (Static43.aClass205_3.anInt6370 == 1) {
			Static43.aClass205_3 = null;
			return;
		}
		if (Static43.aClass205_3.anInt6370 == 2) {
			Static136.method2751(Static209.aString150, 2, Static133.aClass15_7);
			Static43.aClass205_3 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(BI)V")
	public static void method1312(@OriginalArg(1) int arg0) {
		Static161.anInt3398 = arg0;
		@Pc(12) Class11 local12 = Static24.aClass11_16;
		synchronized (Static24.aClass11_16) {
			Static24.aClass11_16.method213();
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIZBIII)V")
	public static void method1314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static205.anInt4108 = arg5;
		Static215.anInt4291 = arg1;
		Static29.anInt4720 = arg0;
		Static273.anInt5190 = arg3;
		Static273.anInt5197 = arg4;
		if (arg2 && Static205.anInt4108 >= 100) {
			Static141.anInt2986 = Static215.anInt4291 * 128 + 64;
			Static124.anInt2717 = Static273.anInt5190 * 128 + 64;
			Static103.anInt2301 = Static279.method4730(Static219.anInt4400, Static124.anInt2717, Static141.anInt2986) - Static273.anInt5197;
		}
		Static205.anInt4115 = 2;
	}

	@OriginalMember(owner = "client!dk", name = "i", descriptor = "(I)V")
	public static void method1316() {
		for (@Pc(14) Class14_Sub6 local14 = (Class14_Sub6) Static93.aClass18_8.method459(); local14 != null; local14 = (Class14_Sub6) Static93.aClass18_8.method453()) {
			if (local14.anInt877 == -1) {
				local14.anInt878 = 0;
				Static215.method3867(local14);
			} else {
				local14.method5986();
			}
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z[[I)V")
	public static void method1317(@OriginalArg(1) int[][] arg0) {
		Static104.anIntArrayArray31 = arg0;
	}
}
