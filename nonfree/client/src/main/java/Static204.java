import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "Lclient!cn;")
	public static Class46 aClass46_1;

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "F")
	public static float aFloat63;

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_91 = new Class263(9, 6);

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)V")
	public static void method3261() {
		Static180.anInt3908 = 0;
		for (@Pc(12) int local12 = 0; local12 < 2048; local12++) {
			Static43.aClass1_Sub3Array1[local12] = null;
			Static5.aByteArray1[local12] = 1;
			Static413.aClass155Array1[local12] = null;
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)[Lclient!ud;")
	public static Class247[] method3264() {
		return new Class247[] { Static168.aClass247_25, Static168.aClass247_26, Static168.aClass247_27, Static168.aClass247_28, Static168.aClass247_29, Static168.aClass247_30, Static168.aClass247_31, Static168.aClass247_32, Static168.aClass247_33, Static168.aClass247_34, Static168.aClass247_35, Static168.aClass247_36 };
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(B)V")
	public static void method3266() {
		if (Static81.aBoolean127) {
			return;
		}
		Static81.aBoolean127 = true;
		Static450.aBoolean515 = true;
		if (Static12.aClass34_Sub1_1.aBoolean454) {
			Static26.aFloat5 = (int) Static26.aFloat5 + 47 & 0xFFFFFFF0;
		} else {
			Static191.aFloat61 += (12.0F - Static191.aFloat61) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLclient!ou;)V")
	public static void method3269(@OriginalArg(1) Class30_Sub1_Sub1 arg0) {
		@Pc(11) boolean local11 = false;
		if (Static187.anInt3975 == arg0.anInt1300 || arg0.anInt1303 == -1 || arg0.anInt1271 != 0) {
			local11 = true;
		} else {
			@Pc(40) Class235 local40 = Static107.aClass239_1.method5420(arg0.anInt1303);
			if (local40.aBoolean431 || arg0.anInt1260 + 1 > local40.anIntArray632[arg0.anInt1294]) {
				local11 = true;
			}
		}
		if (local11) {
			@Pc(68) int local68 = arg0.anInt1300 - arg0.anInt1305;
			@Pc(73) int local73 = Static187.anInt3975 - arg0.anInt1305;
			@Pc(84) int local84 = arg0.anInt1285 * 128 + arg0.method944() * 64;
			@Pc(96) int local96 = arg0.anInt1312 * 128 + arg0.method944() * 64;
			@Pc(108) int local108 = arg0.anInt1259 * 128 + arg0.method944() * 64;
			@Pc(120) int local120 = arg0.anInt1272 * 128 + arg0.method944() * 64;
			arg0.anInt7488 = (local73 * local120 + (local68 - local73) * local96) / local68;
			arg0.anInt7490 = (local108 * local73 + (local68 - local73) * local84) / local68;
		}
		arg0.anInt1316 = 0;
		if (arg0.anInt1291 == 0) {
			arg0.method943(false, 8192);
		}
		if (arg0.anInt1291 == 1) {
			arg0.method943(false, 12288);
		}
		if (arg0.anInt1291 == 2) {
			arg0.method943(false, 0);
		}
		if (arg0.anInt1291 == 3) {
			arg0.method943(false, 4096);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIBI)V")
	public static void method3270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(4) int local4;
		if (arg0 >= arg3) {
			for (local4 = arg3; local4 < arg0; local4++) {
				Static60.anIntArrayArray14[local4][arg1] = arg2;
			}
		} else {
			for (local4 = arg0; local4 < arg3; local4++) {
				Static60.anIntArrayArray14[local4][arg1] = arg2;
			}
		}
	}
}
