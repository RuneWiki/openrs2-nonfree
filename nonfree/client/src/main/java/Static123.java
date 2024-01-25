import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!g", name = "M", descriptor = "Lclient!f;")
	public static Class80 aClass80_5;

	@OriginalMember(owner = "client!g", name = "K", descriptor = "Z")
	public static boolean aBoolean119 = true;

	@OriginalMember(owner = "client!g", name = "R", descriptor = "[I")
	public static final int[] anIntArray205 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!g", name = "d", descriptor = "(B)V")
	public static void method1834() {
		if (Static402.anInt6944 == 0) {
			return;
		}
		try {
			if (++Static148.anInt2522 > 2000) {
				if (Static372.aClass161_6 != null) {
					Static372.aClass161_6.method3764();
					Static372.aClass161_6 = null;
				}
				if (Static53.anInt1070 >= 1) {
					Static402.anInt6944 = 0;
					Static423.anInt7327 = -5;
					return;
				}
				Static53.anInt1070++;
				Static402.anInt6944 = 1;
				Static148.anInt2522 = 0;
				if (Static163.anInt3040 == Static41.anInt7070) {
					Static163.anInt3040 = Static58.anInt1248;
				} else {
					Static163.anInt3040 = Static41.anInt7070;
				}
			}
			if (Static402.anInt6944 == 1) {
				Static184.aClass100_3 = Static119.aClass138_7.method3205(Static163.anInt3040, Static212.aString4);
				Static402.anInt6944 = 2;
			}
			@Pc(106) int local106;
			if (Static402.anInt6944 == 2) {
				if (Static184.aClass100_3.anInt2365 == 2) {
					throw new IOException();
				}
				if (Static184.aClass100_3.anInt2365 != 1) {
					return;
				}
				Static372.aClass161_6 = new Class161((Socket) Static184.aClass100_3.anObject4, Static119.aClass138_7);
				Static184.aClass100_3 = null;
				Static372.aClass161_6.method3763(Static232.aClass1_Sub1_Sub1_2.aByteArray66, Static232.aClass1_Sub1_Sub1_2.anInt5056);
				Static363.method4998();
				local106 = Static372.aClass161_6.method3770();
				Static363.method4998();
				if (local106 != 21) {
					Static423.anInt7327 = local106;
					Static402.anInt6944 = 0;
					Static372.aClass161_6.method3764();
					Static372.aClass161_6 = null;
					return;
				}
				Static402.anInt6944 = 3;
			}
			if (Static402.anInt6944 == 3) {
				if (Static372.aClass161_6.method3765() < 1) {
					return;
				}
				Static40.aStringArray7 = new String[Static372.aClass161_6.method3770()];
				Static402.anInt6944 = 4;
			}
			if (Static402.anInt6944 == 4) {
				if (Static372.aClass161_6.method3765() < Static40.aStringArray7.length * 8) {
					return;
				}
				Static173.aClass1_Sub1_Sub1_1.anInt5056 = 0;
				Static372.aClass161_6.method3769(Static40.aStringArray7.length * 8, 0, Static173.aClass1_Sub1_Sub1_1.aByteArray66);
				for (local106 = 0; local106 < Static40.aStringArray7.length; local106++) {
					Static40.aStringArray7[local106] = Static402.method5431(Static173.aClass1_Sub1_Sub1_1.method4094());
				}
				Static402.anInt6944 = 0;
				Static423.anInt7327 = 21;
				Static372.aClass161_6.method3764();
				Static372.aClass161_6 = null;
				return;
			}
		} catch (@Pc(204) IOException local204) {
			if (Static372.aClass161_6 != null) {
				Static372.aClass161_6.method3764();
				Static372.aClass161_6 = null;
			}
			if (Static53.anInt1070 < 1) {
				if (Static41.anInt7070 == Static163.anInt3040) {
					Static163.anInt3040 = Static58.anInt1248;
				} else {
					Static163.anInt3040 = Static41.anInt7070;
				}
				Static402.anInt6944 = 1;
				Static148.anInt2522 = 0;
				Static53.anInt1070++;
			} else {
				Static423.anInt7327 = -4;
				Static402.anInt6944 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!ir;B)I")
	public static int method1836(@OriginalArg(0) Class26_Sub2_Sub2 arg0) {
		if (arg0.anInt7126 == 0) {
			return 0;
		}
		@Pc(48) int local48;
		@Pc(55) int local55;
		if (arg0.anInt7090 != -1) {
			@Pc(15) Class26_Sub2_Sub2 local15 = null;
			if (arg0.anInt7090 < 32768) {
				local15 = Static410.aClass26_Sub2_Sub2_Sub2Array1[arg0.anInt7090];
			} else if (arg0.anInt7090 >= 32768) {
				local15 = Static311.aClass26_Sub2_Sub2_Sub1Array1[arg0.anInt7090 - 32768];
			}
			if (local15 != null) {
				local48 = arg0.anInt7068 - local15.anInt7068;
				local55 = arg0.anInt7065 - local15.anInt7065;
				if (local48 != 0 || local55 != 0) {
					arg0.method5526((int) (Math.atan2((double) local48, (double) local55) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class26_Sub2_Sub2_Sub1) {
			@Pc(84) Class26_Sub2_Sub2_Sub1 local84 = (Class26_Sub2_Sub2_Sub1) arg0;
			if (local84.anInt6644 != -1 && (local84.anInt7148 == 0 || local84.anInt7150 > 0)) {
				local84.method5526(local84.anInt6644);
				local84.anInt6644 = -1;
			}
		} else if (arg0 instanceof Class26_Sub2_Sub2_Sub2) {
			@Pc(114) Class26_Sub2_Sub2_Sub2 local114 = (Class26_Sub2_Sub2_Sub2) arg0;
			if (local114.anInt7167 != -1 && (local114.anInt7148 == 0 || local114.anInt7150 > 0)) {
				local48 = local114.anInt7068 - (local114.anInt7167 - Static437.anInt7555 - Static437.anInt7555) * 64;
				local55 = local114.anInt7065 - (local114.anInt7166 - Static134.anInt5502 - Static134.anInt5502) * 64;
				if (local48 != 0 || local55 != 0) {
					local114.method5526((int) (Math.atan2((double) local48, (double) local55) * 2607.5945876176133D) & 0x3FFF);
				}
				local114.anInt7167 = -1;
			}
		}
		return arg0.method5525();
	}
}
