import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!ni", name = "j", descriptor = "I")
	public static int anInt6754;

	@OriginalMember(owner = "client!ni", name = "i", descriptor = "[I")
	public static final int[] anIntArray383 = new int[14];

	@OriginalMember(owner = "client!ni", name = "g", descriptor = "[I")
	public static final int[] anIntArray384 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ni", name = "k", descriptor = "I")
	public static int anInt6753 = -1;

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
	public static int anInt6759 = 0;

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILclient!cn;ZII)V")
	public static void method5773(@OriginalArg(0) int arg0, @OriginalArg(1) Class73 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = arg1.anInt1384;
		@Pc(11) int local11 = arg1.anInt1394;
		if (arg1.aByte25 == 0) {
			arg1.anInt1384 = arg1.anInt1417;
		} else if (arg1.aByte25 == 1) {
			arg1.anInt1384 = arg0 - arg1.anInt1417;
		} else if (arg1.aByte25 == 2) {
			arg1.anInt1384 = arg0 * arg1.anInt1417 >> 14;
		}
		if (arg1.aByte27 == 0) {
			arg1.anInt1394 = arg1.anInt1383;
		} else if (arg1.aByte27 == 1) {
			arg1.anInt1394 = arg3 - arg1.anInt1383;
		} else if (arg1.aByte27 == 2) {
			arg1.anInt1394 = arg3 * arg1.anInt1383 >> 14;
		}
		if (arg1.aByte25 == 4) {
			arg1.anInt1384 = arg1.anInt1385 * arg1.anInt1394 / arg1.anInt1386;
		}
		if (arg1.aByte27 == 4) {
			arg1.anInt1394 = arg1.anInt1384 * arg1.anInt1386 / arg1.anInt1385;
		}
		if (Static206.aBoolean269 && (Static81.method1252(arg1).anInt8267 != 0 || arg1.anInt1391 == 0)) {
			if (arg1.anInt1394 < 5 && arg1.anInt1384 < 5) {
				arg1.anInt1394 = 5;
				arg1.anInt1384 = 5;
			} else {
				if (arg1.anInt1394 <= 0) {
					arg1.anInt1394 = 5;
				}
				if (arg1.anInt1384 <= 0) {
					arg1.anInt1384 = 5;
				}
			}
		}
		if (Static410.anInt7141 == arg1.anInt1367) {
			Static417.aClass73_19 = arg1;
		}
		if (arg2 && arg1.anObjectArray26 != null && (local8 != arg1.anInt1384 || local11 != arg1.anInt1394)) {
			@Pc(248) Class5_Sub3 local248 = new Class5_Sub3();
			local248.aClass73_1 = arg1;
			local248.anObjectArray1 = arg1.anObjectArray26;
			Static118.aClass102_3.method1921(local248);
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)Lclient!fe;")
	public static Class121 method5774() {
		return Static30.method490();
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIB)Z")
	public static boolean method5775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static680.method9332(arg0, arg1)) {
			return (arg0 & 0xB000) != 0 | Static135.method1945(arg0, arg1) | Static233.method3389(arg1, arg0) ? true : (Static477.method6966(arg1, arg0) | Static105.method1531(arg1, arg0)) & (arg1 & 0x37) == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!ub;I)V")
	public static void method5777(@OriginalArg(0) Class5_Sub23_Sub2 arg0) {
		for (@Pc(10) int local10 = 0; local10 < Static226.anInt3673; local10++) {
			@Pc(18) int local18 = Static129.anIntArray122[local10];
			@Pc(22) Class8_Sub1_Sub3_Sub2_Sub1 local22 = Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[local18];
			@Pc(26) int local26 = arg0.method8529();
			if ((local26 & 0x4) != 0) {
				local26 += arg0.method8529() << 8;
			}
			if ((local26 & 0x2000) != 0) {
				local26 += arg0.method8529() << 16;
			}
			Static166.method2389(local22, arg0, local26, local18);
		}
		anInt6754++;
	}
}
