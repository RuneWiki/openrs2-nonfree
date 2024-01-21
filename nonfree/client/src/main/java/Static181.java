import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "Lclient!ag;")
	public static Class4 aClass4_102;

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "[I")
	public static int[] anIntArray448 = new int[100];

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "[Lclient!bh;")
	public static Class1_Sub2_Sub2_Sub2_Sub1[] aClass1_Sub2_Sub2_Sub2_Sub1Array1 = new Class1_Sub2_Sub2_Sub2_Sub1[32768];

	@OriginalMember(owner = "client!vh", name = "j", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1407 = Static161.method2971("http:)4)4");

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BI)Lclient!rg;")
	public static Class1_Sub2_Sub17 method2981(@OriginalArg(1) int arg0) {
		@Pc(15) Class1_Sub2_Sub17 local15 = (Class1_Sub2_Sub17) Static84.aClass47_16.method1999((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static73.aClass4_51.method2243(1, arg0);
		local15 = new Class1_Sub2_Sub17();
		if (local25 != null) {
			local15.method2615(new Class1_Sub8(local25), arg0);
		}
		Static84.aClass47_16.method1998(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(JZ)V")
	public static void method2982(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static136.method2437(arg0 - 1L);
			Static136.method2437(1L);
		} else {
			Static136.method2437(arg0);
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
	public static void method2983() {
		if (Static140.aClass42_1 != null) {
			@Pc(3) Class42 local3 = Static140.aClass42_1;
			synchronized (Static140.aClass42_1) {
				Static140.aClass42_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!ce;I)V")
	public static void method2984(@OriginalArg(0) Class1_Sub8 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static50.aClass88_2 != null) {
			@Pc(25) int local25;
			try {
				Static50.aClass88_2.method2928(0L);
				Static50.aClass88_2.method2926(local8);
				for (local25 = 0; local25 < 24 && local8[local25] == 0; local25++) {
				}
				if (local25 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(50) Exception local50) {
				for (local25 = 0; local25 < 24; local25++) {
					local8[local25] = -1;
				}
			}
		}
		arg0.method1623(24, local8);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)Z")
	public static boolean method2985(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class1_Sub2_Sub14 local3 = Static4.method79(arg0);
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local3.method2386(arg1);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!be;IIIII)V")
	public static void method2986(@OriginalArg(0) Class1_Sub2_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static4.anInt118) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static101.anInt2832) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static90.anInt2623 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class1_Sub10 local62 = Static170.aClass1_Sub10ArrayArrayArray35[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static114.anIntArrayArrayArray4[local17][local23][local32] + Static114.anIntArrayArrayArray4[local17][local23 + 1][local32] + Static114.anIntArrayArrayArray4[local17][local23][local32 + 1] + Static114.anIntArrayArrayArray4[local17][local23 + 1][local32 + 1]) / 4 - (Static114.anIntArrayArrayArray4[arg1][arg2][arg3] + Static114.anIntArrayArrayArray4[arg1][arg2 + 1][arg3] + Static114.anIntArrayArrayArray4[arg1][arg2][arg3 + 1] + Static114.anIntArrayArrayArray4[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(151) Class7 local151 = local62.aClass7_1;
									if (local151 != null) {
										@Pc(161) Class1_Sub2_Sub2_Sub1 local161;
										if (local151.aClass1_Sub2_Sub2_2 instanceof Class1_Sub2_Sub2_Sub1) {
											local161 = (Class1_Sub2_Sub2_Sub1) local151.aClass1_Sub2_Sub2_2;
											Static13.method495(arg0, local161, (local23 - arg2) * 128 + (1 - arg4) * 64, local148, (local32 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local151.aClass1_Sub2_Sub2_1 instanceof Class1_Sub2_Sub2_Sub1) {
											local161 = (Class1_Sub2_Sub2_Sub1) local151.aClass1_Sub2_Sub2_1;
											Static13.method495(arg0, local161, (local23 - arg2) * 128 + (1 - arg4) * 64, local148, (local32 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(225) int local225 = 0; local225 < local62.anInt1544; local225++) {
										@Pc(231) Class59 local231 = local62.aClass59Array4[local225];
										if (local231 != null && local231.aClass1_Sub2_Sub2_7 instanceof Class1_Sub2_Sub2_Sub1) {
											@Pc(241) Class1_Sub2_Sub2_Sub1 local241 = (Class1_Sub2_Sub2_Sub1) local231.aClass1_Sub2_Sub2_7;
											@Pc(249) int local249 = local231.anInt3142 + 1 - local231.anInt3133;
											@Pc(257) int local257 = local231.anInt3143 + 1 - local231.anInt3130;
											Static13.method495(arg0, local241, (local231.anInt3133 - arg2) * 128 + (local249 - arg4) * 64, local148, (local231.anInt3130 - arg3) * 128 + (local257 - arg5) * 64, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILclient!ag;I)Lclient!ba;")
	public static Class1_Sub2_Sub1_Sub3 method2987(@OriginalArg(1) Class4 arg0, @OriginalArg(2) int arg1) {
		return Static88.method1852(arg0, arg1) ? Static169.method2886() : null;
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V")
	public static void method2988() {
		aClass1_Sub2_Sub2_Sub2_Sub1Array1 = null;
		aClass13_1407 = null;
		aClass4_102 = null;
		anIntArray448 = null;
	}
}
