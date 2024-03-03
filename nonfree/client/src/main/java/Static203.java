import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "Lclient!pe;")
	public static Class177_Sub1 aClass177_Sub1_2;

	@OriginalMember(owner = "client!mo", name = "C", descriptor = "F")
	public static float aFloat29;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IZLclient!r;)Lclient!vi;", line = 495)
	public static Class239 method1088(@OriginalArg(0) int arg0, @OriginalArg(2) Class197 arg1) {
		@Pc(13) byte[] local13 = arg1.method5083(arg0);
		return local13 == null ? null : new Class239(local13);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z)I", line = 639)
	public static int method1090() {
		return 6;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(ILclient!cf;)I", line = 1594)
	public static int method1096(@OriginalArg(1) Class2_Sub5 arg0) {
		@Pc(12) String local12 = Static295.method5422(arg0);
		@Pc(14) int[] local14 = null;
		if (Static275.method2427(arg0.anInt1004)) {
			local14 = Static290.aClass107_2.method2761((int) arg0.aLong30).anIntArray364;
		} else if (arg0.anInt1007 != -1) {
			local14 = Static290.aClass107_2.method2761(arg0.anInt1007).anIntArray364;
		} else if (Static274.method5112(arg0.anInt1004)) {
			@Pc(46) Class11_Sub5_Sub2_Sub2 local46 = Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[(int) arg0.aLong30];
			if (local46 != null) {
				@Pc(51) Class71 local51 = local46.aClass71_1;
				if (local51.anIntArray129 != null) {
					local51 = local51.method2095(Static199.aClass226_1);
				}
				if (local51 != null) {
					local14 = local51.anIntArray131;
				}
			}
		} else if (Static224.method4191(arg0.anInt1004)) {
			@Pc(83) Class41 local83;
			if (arg0.anInt1004 == 1010) {
				local83 = Static334.aClass202_4.method5164((int) arg0.aLong30);
			} else {
				local83 = Static334.aClass202_4.method5164((int) (arg0.aLong30 >>> 32 & 0x7FFFFFFFL));
			}
			if (local83.anIntArray94 != null) {
				local83 = local83.method1535(Static199.aClass226_1);
			}
			if (local83 != null) {
				local14 = local83.anIntArray96;
			}
		}
		if (local14 != null) {
			local12 = local12 + Static149.method2940(local14);
		}
		@Pc(135) int local135 = Static106.aClass239_2.method6128(Static125.aClass13Array12, local12);
		if (arg0.aBoolean82) {
			local135 += Static112.aClass13_7.method6390() + 4;
		}
		return local135;
	}
}
