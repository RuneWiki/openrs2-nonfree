import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!df", name = "r", descriptor = "Lclient!bt;")
	public static Class43 aClass43_4;

	@OriginalMember(owner = "client!df", name = "w", descriptor = "I")
	public static int anInt1870 = 0;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
	public static void method1645() {
		if (Static275.aClass6_Sub4_Sub10_1 != null) {
			Static275.aClass6_Sub4_Sub10_1 = null;
			Static94.method1546(Static166.anInt2811, Static494.anInt8391, Static314.anInt5338, Static347.anInt10656);
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 == arg1) {
			Static408.method5842(arg6, arg1, arg2, arg4, arg3, arg5);
		} else if (Static502.anInt8456 <= arg3 - arg1 && arg3 + arg1 <= Static153.anInt2554 && Static55.anInt4238 <= arg5 - arg0 && Static292.anInt4921 >= arg0 + arg5) {
			Static19.method476(arg3, arg2, arg1, arg4, arg6, arg0, arg5);
		} else {
			Static219.method3189(arg4, arg1, arg5, arg0, arg6, arg3, arg2);
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(B)Z")
	public static boolean method1647() {
		if (Static233.aClass6_Sub4_Sub12_2 == null) {
			return false;
		} else {
			if (Static233.aClass6_Sub4_Sub12_2.anInt7577 >= 2000) {
				Static233.aClass6_Sub4_Sub12_2.anInt7577 -= 2000;
			}
			return Static233.aClass6_Sub4_Sub12_2.anInt7577 == 1008;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BLclient!ns;)V")
	public static void method1649(@OriginalArg(1) Class2_Sub1_Sub1_Sub3 arg0) {
		@Pc(9) int local9 = arg0.anInt5100 - Static90.anInt1698;
		@Pc(21) int local21 = arg0.anInt5094 * 512 + arg0.method4326() * 256;
		@Pc(33) int local33 = arg0.anInt5076 * 512 + arg0.method4326() * 256;
		arg0.anInt10006 += (local21 - arg0.anInt10006) / local9;
		arg0.anInt5122 = 0;
		arg0.anInt10001 += (local33 - arg0.anInt10001) / local9;
		if (arg0.anInt5069 == 0) {
			arg0.method4327(8192);
		}
		if (arg0.anInt5069 == 1) {
			arg0.method4327(12288);
		}
		if (arg0.anInt5069 == 2) {
			arg0.method4327(0);
		}
		if (arg0.anInt5069 == 3) {
			arg0.method4327(4096);
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ZI)V")
	public static void method1650(@OriginalArg(1) int arg0) {
		Static53.anIntArray62 = new int[arg0];
		Static201.anIntArray601 = new int[arg0];
		Static163.anIntArray155 = new int[arg0];
		Static357.anIntArray361 = new int[arg0];
		Static666.anIntArray708 = new int[arg0];
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIILclient!bq;)V")
	public static void method1652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub1_Sub3 arg3) {
		@Pc(4) Class351 local4 = Static31.method714(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass2_Sub1_Sub3_1 = arg3;
		@Pc(16) int local16 = Static289.aClass12Array3 == Static68.aClass12Array2 ? 1 : 0;
		if (arg3.method8447()) {
			if (arg3.method8446()) {
				arg3.aClass2_Sub1_22 = Static643.aClass2_Sub1Array5[local16];
				Static643.aClass2_Sub1Array5[local16] = arg3;
				return;
			}
			arg3.aClass2_Sub1_22 = Static229.aClass2_Sub1Array2[local16];
			Static229.aClass2_Sub1Array2[local16] = arg3;
			Static119.aBoolean126 = true;
			return;
		}
		arg3.aClass2_Sub1_22 = Static512.aClass2_Sub1Array4[local16];
		Static512.aClass2_Sub1Array4[local16] = arg3;
	}
}
