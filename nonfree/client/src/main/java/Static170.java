import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
	public static int anInt3418;

	@OriginalMember(owner = "client!kk", name = "i", descriptor = "[I")
	public static int[] anIntArray205;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IJ)V", line = 4)
	public static void method3387(@OriginalArg(1) long arg0) {
		@Pc(10) int local10 = Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6768 + Class21.anInt642;
		@Pc(15) int local15 = Class11_Sub1_Sub2.anInt327 + Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6770;
		if (Static265.anInt5451 - local10 < -500 || Static265.anInt5451 - local10 > 500 || Static58.anInt2392 - local15 < -500 || Static58.anInt2392 - local15 > 500) {
			Static265.anInt5451 = local10;
			Static58.anInt2392 = local15;
		}
		@Pc(62) int local62;
		@Pc(70) int local70;
		if (Static265.anInt5451 != local10) {
			local62 = local10 - Static265.anInt5451;
			local70 = (int) (arg0 * (long) local62 / 320L);
			if (local62 > 0) {
				if (local70 == 0) {
					local70 = 1;
				} else if (local62 < local70) {
					local70 = local62;
				}
			} else if (local70 == 0) {
				local70 = -1;
			} else if (local62 > local70) {
				local70 = local62;
			}
			Static265.anInt5451 += local70;
		}
		if (!Static203.aClass177_Sub1_2.aBoolean351) {
			Class28.aFloat27 += (float) arg0 * Class198.aFloat67 / 6.0F;
			Class187.aFloat66 += Class128.aFloat38 * (float) arg0 / 6.0F;
		}
		if (Static58.anInt2392 != local15) {
			local62 = local15 - Static58.anInt2392;
			local70 = (int) ((long) local62 * arg0 / 320L);
			if (local62 > 0) {
				if (local70 == 0) {
					local70 = 1;
				} else if (local62 < local70) {
					local70 = local62;
				}
			} else if (local70 == 0) {
				local70 = -1;
			} else if (local62 > local70) {
				local70 = local62;
			}
			Static58.anInt2392 += local70;
		}
		Static315.method6142();
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V", line = 96)
	public static void method3388() {
		for (@Pc(15) Class2_Sub2_Sub1 local15 = (Class2_Sub2_Sub1) Class92.aClass135_20.method3552(); local15 != null; local15 = (Class2_Sub2_Sub1) Class92.aClass135_20.method3553()) {
			@Pc(20) Class11_Sub5_Sub4 local20 = local15.aClass11_Sub5_Sub4_1;
			if (local20.aBoolean445) {
				local15.method6469();
				local20.method5879();
			} else if (local20.anInt6492 <= Class83.anInt2345) {
				local20.method5880(Class116.anInt3144);
				if (local20.aBoolean445) {
					local15.method6469();
				} else {
					Static306.method5631(local20, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(B)V", line = 133)
	public static void method3389() {
		Class14.aClass2_Sub4_Sub2_4.anInt5289 = 0;
		Class61.anInt1834 = 0;
		Static37.aClass89_35 = null;
		Class2_Sub2_Sub9.anInt2770 = 0;
		Static311.aClass89_222 = null;
		Class12_Sub4.aClass89_164 = null;
		Class2_Sub3_Sub24.anInt4945 = 0;
		Class150.aClass2_Sub4_Sub2_3.anInt5289 = 0;
		Static62.aClass89_57 = null;
		Static150.method2957();
		Static286.method5281();
		for (@Pc(35) int local35 = 0; local35 < 2048; local35++) {
			Class9.aClass11_Sub5_Sub2_Sub1Array1[local35] = null;
		}
		Static17.aClass11_Sub5_Sub2_Sub1_3 = null;
		for (@Pc(51) int local51 = 0; local51 < Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1.length; local51++) {
			@Pc(57) Class11_Sub5_Sub2_Sub2 local57 = Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[local51];
			if (local57 != null) {
				local57.anInt4602 = -1;
			}
		}
		Static279.method1460();
		Static291.anInt5899 = 1;
		Static313.method5706(30);
		for (@Pc(76) int local76 = 0; local76 < 100; local76++) {
			Class2_Sub3_Sub10_Sub1.aBooleanArray59[local76] = true;
		}
		Static87.method2004();
		Static350.aLong222 = 0L;
		Static359.aClass2_Sub16_2 = null;
	}
}
