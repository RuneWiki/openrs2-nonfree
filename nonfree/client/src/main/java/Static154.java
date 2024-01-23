import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
	public static int anInt3543;

	@OriginalMember(owner = "client!pb", name = "i", descriptor = "Lclient!vb;")
	public static Class105 aClass105_3;

	@OriginalMember(owner = "client!pb", name = "j", descriptor = "[I")
	public static int[] anIntArray577;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "Lclient!wc;")
	public static Class110 aClass110_14 = new Class110(100);

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "S")
	public static short aShort21 = 32767;

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "[I")
	public static int[] anIntArray576 = new int[] { 0, 1, 2, 3 };

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
	public static int anInt3545 = -1;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZBLclient!vb;)V")
	public static void method2748(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class105 arg1) {
		if (aClass105_3 != null) {
			try {
				aClass105_3.method3695();
			} catch (@Pc(8) Exception local8) {
			}
			aClass105_3 = null;
		}
		aClass105_3 = arg1;
		Static34.method423(arg0);
		Static90.aClass2_Sub3_Sub16_1 = null;
		Static200.anInt4497 = 0;
		Static139.aClass2_Sub23_7 = null;
		Static26.aClass2_Sub23_1.anInt2703 = 0;
		while (true) {
			@Pc(40) Class2_Sub3_Sub16 local40 = (Class2_Sub3_Sub16) Static202.aClass103_20.method3668();
			if (local40 == null) {
				while (true) {
					local40 = (Class2_Sub3_Sub16) Static204.aClass103_21.method3668();
					if (local40 == null) {
						if (Static55.aByte5 != 0) {
							try {
								@Pc(95) Class2_Sub23 local95 = new Class2_Sub23(4);
								local95.method2132(4);
								local95.method2132(Static55.aByte5);
								local95.method2117(0);
								aClass105_3.method3692(local95.aByteArray41, 4);
							} catch (@Pc(120) IOException local120) {
								try {
									aClass105_3.method3695();
								} catch (@Pc(127) Exception local127) {
								}
								Static101.anInt2212++;
								aClass105_3 = null;
							}
						}
						Static176.anInt4068 = 0;
						Static146.aLong125 = Static111.method1911();
						return;
					}
					Static8.aClass102_1.method3627(local40);
					Static106.aClass103_12.method3665(local40.aLong188, local40);
					Static16.anInt4875--;
					Static36.anInt666++;
				}
			}
			Static118.aClass103_16.method3665(local40.aLong188, local40);
			Static187.anInt4366++;
			Static74.anInt1595--;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILclient!eb;IIIB)V")
	public static void method2749(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub14 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1.anInt893 == -1 && arg1.anIntArray142 == null) {
			return;
		}
		@Pc(14) int local14 = 0;
		if (arg1.anInt888 < arg4) {
			local14 = arg4 - arg1.anInt888;
		} else if (arg1.anInt894 > arg4) {
			local14 = arg1.anInt894 - arg4;
		}
		if (arg1.anInt902 < arg2) {
			local14 += arg2 - arg1.anInt902;
		} else if (arg2 < arg1.anInt891) {
			local14 += arg1.anInt891 - arg2;
		}
		if (arg1.anInt901 < local14 - 64 || Static110.anInt2433 == 0 || arg0 != arg1.anInt887) {
			if (arg1.aClass2_Sub21_Sub4_2 != null) {
				Static23.aClass2_Sub21_Sub3_1.method3390(arg1.aClass2_Sub21_Sub4_2);
				arg1.aClass2_Sub21_Sub4_2 = null;
			}
			if (arg1.aClass2_Sub21_Sub4_1 != null) {
				Static23.aClass2_Sub21_Sub3_1.method3390(arg1.aClass2_Sub21_Sub4_1);
				arg1.aClass2_Sub21_Sub4_1 = null;
			}
			return;
		}
		local14 -= 64;
		if (local14 < 0) {
			local14 = 0;
		}
		@Pc(132) int local132 = (arg1.anInt901 - local14) * Static110.anInt2433 / arg1.anInt901;
		if (arg1.aClass2_Sub21_Sub4_2 != null) {
			arg1.aClass2_Sub21_Sub4_2.method3853(local132);
		} else if (arg1.anInt893 >= 0) {
			@Pc(144) Class66 local144 = Static233.method2452(Static124.aClass72_Sub1_24, arg1.anInt893, 0);
			if (local144 != null) {
				@Pc(151) Class2_Sub22_Sub1 local151 = local144.method2450().method1956(Static181.aClass96_1);
				@Pc(156) Class2_Sub21_Sub4 local156 = Static237.method3862(local151, local132);
				local156.method3849(-1);
				Static23.aClass2_Sub21_Sub3_1.method3388(local156);
				arg1.aClass2_Sub21_Sub4_2 = local156;
			}
		}
		if (arg1.aClass2_Sub21_Sub4_1 != null) {
			arg1.aClass2_Sub21_Sub4_1.method3853(local132);
			if (arg1.aClass2_Sub21_Sub4_1.method3977()) {
				return;
			}
			arg1.aClass2_Sub21_Sub4_1 = null;
		} else if (arg1.anIntArray142 != null && (arg1.anInt895 -= arg3) <= 0) {
			@Pc(199) int local199 = (int) ((double) arg1.anIntArray142.length * Math.random());
			@Pc(207) Class66 local207 = Static233.method2452(Static124.aClass72_Sub1_24, arg1.anIntArray142[local199], 0);
			if (local207 != null) {
				@Pc(214) Class2_Sub22_Sub1 local214 = local207.method2450().method1956(Static181.aClass96_1);
				@Pc(219) Class2_Sub21_Sub4 local219 = Static237.method3862(local214, local132);
				local219.method3849(0);
				Static23.aClass2_Sub21_Sub3_1.method3388(local219);
				arg1.aClass2_Sub21_Sub4_1 = local219;
				arg1.anInt895 = (int) ((double) (arg1.anInt900 - arg1.anInt899) * Math.random()) + arg1.anInt899;
				return;
			}
		}
	}
}
