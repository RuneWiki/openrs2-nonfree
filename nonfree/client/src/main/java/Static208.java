import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "Lclient!oi;")
	public static Class185 aClass185_60;

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "Lclient!ht;")
	public static Class112 aClass112_7;

	@OriginalMember(owner = "client!ka", name = "l", descriptor = "Lclient!du;")
	public static final Class62 aClass62_23 = new Class62(12, 7);

	@OriginalMember(owner = "client!ka", name = "m", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_55 = new Class242(51, 7);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!nt;Lclient!wm;)V")
	public static void method3014(@OriginalArg(1) int arg0, @OriginalArg(2) Class177 arg1, @OriginalArg(3) Class1_Sub19 arg2) {
		@Pc(9) Class1_Sub46 local9 = new Class1_Sub46();
		local9.anInt6950 = arg2.method2915();
		local9.anInt6952 = arg2.method2877();
		local9.anIntArray499 = new int[local9.anInt6950];
		local9.aClass253Array2 = new Class253[local9.anInt6950];
		local9.anIntArray502 = new int[local9.anInt6950];
		local9.aClass253Array1 = new Class253[local9.anInt6950];
		local9.anIntArray500 = new int[local9.anInt6950];
		local9.aByteArrayArrayArray18 = new byte[local9.anInt6950][][];
		for (@Pc(51) int local51 = 0; local51 < local9.anInt6950; local51++) {
			try {
				@Pc(57) int local57 = arg2.method2915();
				@Pc(81) String local81;
				@Pc(85) String local85;
				@Pc(89) int local89;
				if (local57 == 0 || local57 == 1 || local57 == 2) {
					local81 = arg2.method2914();
					local85 = arg2.method2914();
					local89 = 0;
					if (local57 == 1) {
						local89 = arg2.method2877();
					}
					local9.anIntArray499[local51] = local57;
					local9.anIntArray500[local51] = local89;
					local9.aClass253Array2[local51] = arg1.method3834(local85, Static4.method45(local81));
				} else if (local57 == 3 || local57 == 4) {
					local81 = arg2.method2914();
					local85 = arg2.method2914();
					local89 = arg2.method2915();
					@Pc(92) String[] local92 = new String[local89];
					for (@Pc(94) int local94 = 0; local94 < local89; local94++) {
						local92[local94] = arg2.method2914();
					}
					@Pc(111) byte[][] local111 = new byte[local89][];
					@Pc(124) int local124;
					if (local57 == 3) {
						for (@Pc(118) int local118 = 0; local118 < local89; local118++) {
							local124 = arg2.method2877();
							local111[local118] = new byte[local124];
							arg2.method2937(local124, local111[local118]);
						}
					}
					local9.anIntArray499[local51] = local57;
					@Pc(153) Class[] local153 = new Class[local89];
					for (local124 = 0; local124 < local89; local124++) {
						local153[local124] = Static4.method45(local92[local124]);
					}
					local9.aClass253Array1[local51] = arg1.method3856(local153, Static4.method45(local81), local85);
					local9.aByteArrayArrayArray18[local51] = local111;
				}
			} catch (@Pc(240) ClassNotFoundException local240) {
				local9.anIntArray502[local51] = -1;
			} catch (@Pc(247) SecurityException local247) {
				local9.anIntArray502[local51] = -2;
			} catch (@Pc(254) NullPointerException local254) {
				local9.anIntArray502[local51] = -3;
			} catch (@Pc(261) Exception local261) {
				local9.anIntArray502[local51] = -4;
			} catch (@Pc(268) Throwable local268) {
				local9.anIntArray502[local51] = -5;
			}
		}
		Static62.aClass14_4.method205(local9);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
	public static void method3015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class216 local7 = Static259.aClass216ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class11_Sub4 local13 = local7.aClass11_Sub4_2;
		@Pc(16) Class11_Sub4 local16 = local7.aClass11_Sub4_1;
		if (local13 != null) {
			local13.anInt6090 = local13.anInt6090 * arg3 / (0x10 << Static41.anInt612 - 7);
			local13.anInt6085 = local13.anInt6085 * arg3 / (0x10 << Static41.anInt612 - 7);
		}
		if (local16 != null) {
			local16.anInt6090 = local16.anInt6090 * arg3 / (0x10 << Static41.anInt612 - 7);
			local16.anInt6085 = local16.anInt6085 * arg3 / (0x10 << Static41.anInt612 - 7);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)I")
	public static int method3017() {
		if (Static33.aFrame1 == null) {
			return Static443.aBoolean606 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIZII)V")
	public static void method3021(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static33.aFrame1 != null && (arg0 != 3 || Static126.aClass19_Sub1_1.anInt4240 != arg3 || arg1 != Static126.aClass19_Sub1_1.anInt4230)) {
			Static98.method1146(Static259.aClass177_2, Static33.aFrame1);
			Static33.aFrame1 = null;
		}
		if (arg0 == 3 && Static33.aFrame1 == null) {
			Static33.aFrame1 = Static234.method3351(arg3, Static259.aClass177_2, arg1, 0);
			if (Static33.aFrame1 != null) {
				Static126.aClass19_Sub1_1.anInt4230 = arg1;
				Static126.aClass19_Sub1_1.anInt4240 = arg3;
				Static126.aClass19_Sub1_1.method3346(Static259.aClass177_2);
			}
		}
		if (arg0 == 3 && Static33.aFrame1 == null) {
			method3021(Static126.aClass19_Sub1_1.anInt4220, -1, true, -1, arg4);
			return;
		}
		@Pc(75) Container local75;
		@Pc(86) Insets local86;
		if (Static33.aFrame1 != null) {
			local75 = Static33.aFrame1;
			Static455.anInt7239 = arg1;
			Static342.anInt5549 = arg3;
		} else if (Static138.aFrame2 == null) {
			local75 = Static259.aClass177_2.anApplet1;
			Static342.anInt5549 = local75.getSize().width;
			Static455.anInt7239 = local75.getSize().height;
		} else {
			local86 = Static138.aFrame2.getInsets();
			Static342.anInt5549 = Static138.aFrame2.getSize().width - local86.right - local86.left;
			@Pc(102) int local102 = -local86.top;
			Static455.anInt7239 = Static138.aFrame2.getSize().height + local102 - local86.bottom;
			local75 = Static138.aFrame2;
		}
		@Pc(144) int local144;
		if (arg0 == 1) {
			Static192.anInt3532 = Static401.anInt6459;
			Static351.anInt5682 = 0;
			Static232.anInt4198 = (Static342.anInt5549 - Static401.anInt6459) / 2;
			Static40.anInt597 = Static238.anInt4296;
		} else if (Static45.anInt669 < 96 && Static214.anInt3968 == 0) {
			local144 = Static342.anInt5549 <= 1024 ? Static342.anInt5549 : 1024;
			Static232.anInt4198 = (Static342.anInt5549 - local144) / 2;
			@Pc(160) int local160 = Static455.anInt7239 <= 768 ? Static455.anInt7239 : 768;
			Static192.anInt3532 = local144;
			Static40.anInt597 = local160;
			Static351.anInt5682 = 0;
		} else {
			Static192.anInt3532 = Static342.anInt5549;
			Static232.anInt4198 = 0;
			Static40.anInt597 = Static455.anInt7239;
			Static351.anInt5682 = 0;
		}
		if (Static268.aClass170_5 != Static254.aClass170_4) {
			@Pc(203) boolean local203;
			if (Static192.anInt3532 < 1024 && Static40.anInt597 < 768) {
				local203 = true;
			} else {
				local203 = false;
			}
		}
		if (arg2) {
			Static373.method5945();
		} else {
			Static91.aCanvas2.setSize(Static192.anInt3532, Static40.anInt597);
			Static186.aClass117_3.method5686(Static91.aCanvas2);
			if (local75 == Static138.aFrame2) {
				local86 = Static138.aFrame2.getInsets();
				Static91.aCanvas2.setLocation(local86.left + Static232.anInt4198, Static351.anInt5682 + local86.top);
			} else {
				Static91.aCanvas2.setLocation(Static232.anInt4198, Static351.anInt5682);
			}
		}
		if (arg0 < 2) {
			Static443.aBoolean606 = false;
		} else {
			Static443.aBoolean606 = true;
		}
		if (Static118.anInt1785 != -1) {
			Static428.method5437(true);
		}
		if (Static337.aClass110_2 != null && Static242.method3484(Static135.anInt2114)) {
			Static132.method5176();
		}
		for (local144 = 0; local144 < 100; local144++) {
			Static179.aBooleanArray69[local144] = true;
		}
		Static69.aBoolean128 = true;
	}
}
