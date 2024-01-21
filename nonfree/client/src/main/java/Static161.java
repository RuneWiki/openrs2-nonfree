import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!rc", name = "N", descriptor = "Z")
	public static boolean aBoolean168;

	@OriginalMember(owner = "client!rc", name = "K", descriptor = "I")
	public static int anInt3568 = 0;

	@OriginalMember(owner = "client!rc", name = "P", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!rc", name = "R", descriptor = "I")
	public static int anInt3572 = 0;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IB)V")
	public static void method2727(@OriginalArg(0) int arg0) {
		@Pc(8) int[] local8 = Static169.aClass1_Sub2_Sub8_Sub3_3.anIntArray246;
		@Pc(11) int local11 = local8.length;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			local8[local13] = 1;
		}
		@Pc(42) int local42;
		@Pc(44) int local44;
		for (@Pc(29) int local29 = 1; local29 < 103; local29++) {
			local42 = (52736 - local29 * 512) * 4 + 24628;
			for (local44 = 1; local44 < 103; local44++) {
				if ((Static43.aByteArrayArrayArray3[arg0][local44][local29] & 0x18) == 0) {
					Static180.method3070(local8, local42, arg0, local44, local29);
				}
				if (arg0 < 3 && (Static43.aByteArrayArrayArray3[arg0 + 1][local44][local29] & 0x8) != 0) {
					Static180.method3070(local8, local42, arg0 + 1, local44, local29);
				}
				local42 += 4;
			}
		}
		local42 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((238 - (10 - ((int) (Math.random() * 20.0D))) << 8) - (-((int) (Math.random() * 20.0D)) + -238) - 10);
		Static169.aClass1_Sub2_Sub8_Sub3_3.method2355();
		local44 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		@Pc(151) int local151;
		for (@Pc(147) int local147 = 1; local147 < 103; local147++) {
			for (local151 = 1; local151 < 103; local151++) {
				if ((Static43.aByteArrayArrayArray3[arg0][local151][local147] & 0x18) == 0) {
					Static70.method2488(local147, local44, arg0, local42, local151);
				}
				if (arg0 < 3 && (Static43.aByteArrayArrayArray3[arg0 + 1][local151][local147] & 0x8) != 0) {
					Static70.method2488(local147, local44, arg0 + 1, local42, local151);
				}
			}
		}
		Static185.anInt4151 = 0;
		for (local151 = 0; local151 < 104; local151++) {
			for (@Pc(222) int local222 = 0; local222 < 104; local222++) {
				@Pc(229) long local229 = Static212.method3586(Static170.anInt3799, local151, local222);
				if (local229 != 0L) {
					@Pc(244) Class1_Sub2_Sub5 local244 = Static37.method702((int) (local229 >>> 32) & Integer.MAX_VALUE);
					@Pc(247) int local247 = local244.anInt957;
					if (local247 >= 0) {
						@Pc(254) int local254 = local151;
						@Pc(256) int local256 = local222;
						if (local247 != 22 && local247 != 29 && local247 != 34 && local247 != 36 && local247 != 46 && local247 != 47 && local247 != 48) {
							@Pc(286) int[][] local286 = Static66.aClass93Array1[Static170.anInt3799].anIntArrayArray33;
							for (@Pc(288) int local288 = 0; local288 < 10; local288++) {
								@Pc(295) int local295 = (int) (Math.random() * 4.0D);
								if (local295 == 0 && local254 > 0 && local254 > local151 - 3 && (local286[local254 - 1][local256] & 0x12C0108) == 0) {
									local254--;
								}
								if (local295 == 1 && local254 < 103 && local254 < local151 + 3 && (local286[local254 + 1][local256] & 0x12C0180) == 0) {
									local254++;
								}
								if (local295 == 2 && local256 > 0 && local256 > local222 - 3 && (local286[local254][local256 - 1] & 0x12C0102) == 0) {
									local256--;
								}
								if (local295 == 3 && local256 < 103 && local222 + 3 > local256 && (local286[local254][local256 + 1] & 0x12C0120) == 0) {
									local256++;
								}
							}
						}
						Static57.anIntArray126[Static185.anInt4151] = local244.anInt980;
						Static66.anIntArray142[Static185.anInt4151] = local254;
						Static153.anIntArray290[Static185.anInt4151] = local256;
						Static185.anInt4151++;
					}
				}
			}
		}
		Static25.aClass7_1.method1185();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!vi;Lclient!fj;B)V")
	public static void method2729(@OriginalArg(0) int arg0, @OriginalArg(1) Class99 arg1, @OriginalArg(2) Class1_Sub7 arg2) {
		@Pc(9) Class1_Sub20 local9 = new Class1_Sub20();
		local9.anInt3264 = arg2.method2771();
		local9.anInt3263 = arg2.method2793();
		local9.aClass82Array2 = new Class82[local9.anInt3264];
		local9.anIntArray273 = new int[local9.anInt3264];
		local9.anIntArray276 = new int[local9.anInt3264];
		local9.anIntArray275 = new int[local9.anInt3264];
		local9.aByteArrayArrayArray9 = new byte[local9.anInt3264][][];
		local9.aClass82Array1 = new Class82[local9.anInt3264];
		for (@Pc(56) int local56 = 0; local56 < local9.anInt3264; local56++) {
			try {
				@Pc(62) int local62 = arg2.method2771();
				@Pc(81) String local81;
				@Pc(90) String local90;
				@Pc(92) int local92;
				if (local62 == 0 || local62 == 1 || local62 == 2) {
					local81 = new String(arg2.method2761().method768());
					local90 = new String(arg2.method2761().method768());
					local92 = 0;
					if (local62 == 1) {
						local92 = arg2.method2793();
					}
					local9.anIntArray276[local56] = local62;
					local9.anIntArray273[local56] = local92;
					local9.aClass82Array1[local56] = arg1.method3425(local90, Static9.method237(local81));
				} else if (local62 == 3 || local62 == 4) {
					local81 = new String(arg2.method2761().method768());
					local90 = new String(arg2.method2761().method768());
					local92 = arg2.method2771();
					@Pc(155) String[] local155 = new String[local92];
					for (@Pc(157) int local157 = 0; local157 < local92; local157++) {
						local155[local157] = new String(arg2.method2761().method768());
					}
					@Pc(177) byte[][] local177 = new byte[local92][];
					@Pc(190) int local190;
					if (local62 == 3) {
						for (@Pc(184) int local184 = 0; local184 < local92; local184++) {
							local190 = arg2.method2793();
							local177[local184] = new byte[local190];
							arg2.method2780(local190, local177[local184]);
						}
					}
					local9.anIntArray276[local56] = local62;
					@Pc(217) Class[] local217 = new Class[local92];
					for (local190 = 0; local190 < local92; local190++) {
						local217[local190] = Static9.method237(local155[local190]);
					}
					local9.aClass82Array2[local56] = arg1.method3419(local217, local90, Static9.method237(local81));
					local9.aByteArrayArrayArray9[local56] = local177;
				}
			} catch (@Pc(252) ClassNotFoundException local252) {
				local9.anIntArray275[local56] = -1;
			} catch (@Pc(259) SecurityException local259) {
				local9.anIntArray275[local56] = -2;
			} catch (@Pc(266) NullPointerException local266) {
				local9.anIntArray275[local56] = -3;
			} catch (@Pc(273) Exception local273) {
				local9.anIntArray275[local56] = -4;
			} catch (@Pc(280) Throwable local280) {
				local9.anIntArray275[local56] = -5;
			}
		}
		Static121.aClass87_18.method2823(local9);
	}
}
