import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "Lclient!la;")
	public static Class208 aClass208_140;

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "Lclient!la;")
	public static Class208 aClass208_141;

	@OriginalMember(owner = "client!mh", name = "h", descriptor = "J")
	public static long aLong289;

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "Lclient!el;")
	public static final Class109 aClass109_212 = new Class109(82, -2);

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "([Ljava/lang/String;I[III)V")
	public static void method8719(@OriginalArg(0) String[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 <= arg3) {
			return;
		}
		@Pc(15) int local15 = (arg3 + arg1) / 2;
		@Pc(17) int local17 = arg3;
		@Pc(21) String local21 = arg0[local15];
		arg0[local15] = arg0[arg1];
		arg0[arg1] = local21;
		@Pc(35) int local35 = arg2[local15];
		arg2[local15] = arg2[arg1];
		arg2[arg1] = local35;
		for (@Pc(47) int local47 = arg3; local47 < arg1; local47++) {
			if (local21 == null || arg0[local47] != null && arg0[local47].compareTo(local21) < (local47 & 0x1)) {
				@Pc(80) String local80 = arg0[local47];
				arg0[local47] = arg0[local17];
				arg0[local17] = local80;
				@Pc(94) int local94 = arg2[local47];
				arg2[local47] = arg2[local17];
				arg2[local17++] = local94;
			}
		}
		arg0[arg1] = arg0[local17];
		arg0[local17] = local21;
		arg2[arg1] = arg2[local17];
		arg2[local17] = local35;
		method8719(arg0, local17 - 1, arg2, arg3);
		method8719(arg0, arg1, arg2, local17 + 1);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!ec;I)V")
	public static void method8721(@OriginalArg(0) Class8_Sub1_Sub3_Sub2 arg0) {
		if (arg0 instanceof Class8_Sub1_Sub3_Sub2_Sub2) {
			@Pc(38) Class8_Sub1_Sub3_Sub2_Sub2 local38 = (Class8_Sub1_Sub3_Sub2_Sub2) arg0;
			if (local38.aClass227_1 != null) {
				Static549.method7980(-124, local38.aByte145 != Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aByte145, local38);
			}
		} else if (arg0 instanceof Class8_Sub1_Sub3_Sub2_Sub1) {
			@Pc(17) Class8_Sub1_Sub3_Sub2_Sub1 local17 = (Class8_Sub1_Sub3_Sub2_Sub1) arg0;
			Static302.method4634(local17, local17.aByte145 != Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aByte145);
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(I[Lclient!cn;IIZI)V")
	public static void method8724(@OriginalArg(0) int arg0, @OriginalArg(1) Class73[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) Class73 local9 = arg1[local3];
			if (local9 != null && local9.anInt1410 == arg4) {
				Static395.method5773(arg0, local9, arg3, arg2);
				Static542.method7940(arg0, arg2, local9);
				if (local9.anInt1421 - local9.anInt1384 < local9.anInt1376) {
					local9.anInt1376 = local9.anInt1421 - local9.anInt1384;
				}
				if (local9.anInt1376 < 0) {
					local9.anInt1376 = 0;
				}
				if (local9.anInt1340 > local9.anInt1414 - local9.anInt1394) {
					local9.anInt1340 = local9.anInt1414 - local9.anInt1394;
				}
				if (local9.anInt1340 < 0) {
					local9.anInt1340 = 0;
				}
				if (local9.anInt1391 == 0) {
					Static547.method7962(local9, arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIBIZ)V")
	public static void method8725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (Static517.aFrame1 != null && (arg0 != 3 || Static537.anInt3769 != arg3 || Static274.anInt4835 != arg2)) {
			Static606.method8452(Static294.aClass230_3, Static517.aFrame1);
			Static517.aFrame1 = null;
		}
		if (arg0 == 3 && Static517.aFrame1 == null) {
			Static517.aFrame1 = Static222.method3177(arg2, 0, Static294.aClass230_3, arg3);
			if (Static517.aFrame1 != null) {
				Static274.anInt4835 = arg2;
				Static537.anInt3769 = arg3;
				Static52.method792();
			}
		}
		if (arg0 == 3 && Static517.aFrame1 == null) {
			method8725(Static637.aClass5_Sub20_31.aClass24_Sub7_2.method2574(), arg1, -1, -1, true);
			return;
		}
		@Pc(118) Container local118;
		@Pc(93) Insets local93;
		if (Static517.aFrame1 != null) {
			local118 = Static517.aFrame1;
			Static584.anInt9793 = arg2;
			Static340.anInt6053 = arg3;
		} else if (Static675.aFrame3 == null) {
			if (Static492.anApplet2 == null) {
				local118 = Static361.anApplet_Sub1_1;
			} else {
				local118 = Static492.anApplet2;
			}
			Static340.anInt6053 = local118.getSize().width;
			Static584.anInt9793 = local118.getSize().height;
		} else {
			local93 = Static675.aFrame3.getInsets();
			Static340.anInt6053 = Static675.aFrame3.getSize().width - local93.right - local93.left;
			@Pc(111) int local111 = -local93.top;
			Static584.anInt9793 = Static675.aFrame3.getSize().height + local111 - local93.bottom;
			local118 = Static675.aFrame3;
		}
		if (arg0 == 1) {
			Static211.anInt3445 = (Static340.anInt6053 - Static264.anInt4559) / 2;
			Static70.anInt1125 = Static264.anInt4559;
			Static631.anInt10283 = Static47.anInt794;
			Static228.anInt3709 = 0;
		} else {
			Static115.method1644();
		}
		if (Static408.aClass201_8 != Static570.aClass201_10) {
			@Pc(184) boolean local184;
			if (Static70.anInt1125 < 1024 && Static631.anInt10283 < 768) {
				local184 = true;
			} else {
				local184 = false;
			}
		}
		if (arg4) {
			Static1.method8127();
		} else {
			Static24.aCanvas1.setSize(Static70.anInt1125, Static631.anInt10283);
			if (Static40.aBoolean61) {
				Static81.method1260(Static24.aCanvas1);
			} else {
				Static457.aClass57_11.method7699(Static24.aCanvas1, Static70.anInt1125, Static631.anInt10283);
			}
			if (local118 == Static675.aFrame3) {
				local93 = Static675.aFrame3.getInsets();
				Static24.aCanvas1.setLocation(Static211.anInt3445 + local93.left, local93.top - -Static228.anInt3709);
			} else {
				Static24.aCanvas1.setLocation(Static211.anInt3445, Static228.anInt3709);
			}
		}
		if (arg0 < 2) {
			Static168.aBoolean243 = false;
		} else {
			Static168.aBoolean243 = true;
		}
		if (Static390.anInt6669 != -1) {
			Static294.method4358(true);
		}
		if (Static492.aClass295_1 != null && Static70.method1121(Static107.anInt1746)) {
			Static289.method9265();
		}
		for (@Pc(287) int local287 = 0; local287 < 100; local287++) {
			Static386.aBooleanArray13[local287] = true;
		}
		Static494.aBoolean619 = true;
	}
}
