import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
	public static int anInt3069;

	@OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
	public static int anInt3070;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "[I")
	public static final int[] anIntArray299 = new int[128];

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BIIII)V")
	public static void method2617(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(8) int local8 = 0; local8 < Static344.anInt6649; local8++) {
			@Pc(14) Rectangle local14 = Class1_Sub5_Sub21.aRectangleArray4[local8];
			if (arg1 < local14.x + local14.width && arg1 + arg3 > local14.x && local14.height + local14.y > arg2 && local14.y < arg0 + arg2) {
				Static78.aBooleanArray7[local8] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!ii;)V")
	public static void method2621(@OriginalArg(1) Class105 arg0) {
		if (Static308.aBoolean499) {
			Static82.method1317(arg0);
		} else {
			Static132.method5857(arg0);
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIIII)V")
	public static void method2625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static236.method4204(arg1);
		@Pc(12) int local12 = 0;
		@Pc(17) int local17 = arg1 - arg0;
		if (local17 < 0) {
			local17 = 0;
		}
		@Pc(23) int local23 = arg1;
		@Pc(26) int local26 = -arg1;
		@Pc(28) int local28 = local17;
		@Pc(35) int local35 = -local17;
		@Pc(37) int local37 = -1;
		@Pc(60) int local60;
		@Pc(69) int local69;
		@Pc(78) int local78;
		@Pc(87) int local87;
		if (arg4 >= Static41.anInt1131 && Static165.anInt3409 >= arg4) {
			@Pc(51) int[] local51 = Static319.anIntArrayArray31[arg4];
			local60 = Static54.method1088(Static60.anInt1399, arg5 - arg1, Static138.anInt6334);
			local69 = Static54.method1088(Static60.anInt1399, arg5 + arg1, Static138.anInt6334);
			local78 = Static54.method1088(Static60.anInt1399, arg5 - local17, Static138.anInt6334);
			local87 = Static54.method1088(Static60.anInt1399, arg5 + local17, Static138.anInt6334);
			Static244.method5351(local60, local78, local51, arg2);
			Static244.method5351(local78, local87, local51, arg3);
			Static244.method5351(local87, local69, local51, arg2);
		}
		@Pc(107) int local107 = -1;
		while (local12 < local23) {
			local37 += 2;
			local107 += 2;
			local26 += local37;
			local35 += local107;
			if (local35 >= 0 && local28 >= 1) {
				local28--;
				Static318.anIntArray641[local28] = local12;
				local35 -= local28 << 1;
			}
			local12++;
			@Pc(200) int local200;
			@Pc(209) int local209;
			@Pc(216) int[] local216;
			@Pc(150) int local150;
			if (local26 >= 0) {
				local23--;
				local26 -= local23 << 1;
				local150 = arg4 - local23;
				local60 = arg4 + local23;
				if (Static41.anInt1131 <= local60 && local150 <= Static165.anInt3409) {
					if (local23 < local17) {
						local69 = Static318.anIntArray641[local23];
						local78 = Static54.method1088(Static60.anInt1399, local12 + arg5, Static138.anInt6334);
						local87 = Static54.method1088(Static60.anInt1399, arg5 - local12, Static138.anInt6334);
						local200 = Static54.method1088(Static60.anInt1399, arg5 + local69, Static138.anInt6334);
						local209 = Static54.method1088(Static60.anInt1399, arg5 - local69, Static138.anInt6334);
						if (Static165.anInt3409 >= local60) {
							local216 = Static319.anIntArrayArray31[local60];
							Static244.method5351(local87, local209, local216, arg2);
							Static244.method5351(local209, local200, local216, arg3);
							Static244.method5351(local200, local78, local216, arg2);
						}
						if (local150 >= Static41.anInt1131) {
							local216 = Static319.anIntArrayArray31[local150];
							Static244.method5351(local87, local209, local216, arg2);
							Static244.method5351(local209, local200, local216, arg3);
							Static244.method5351(local200, local78, local216, arg2);
						}
					} else {
						local69 = Static54.method1088(Static60.anInt1399, arg5 + local12, Static138.anInt6334);
						local78 = Static54.method1088(Static60.anInt1399, arg5 - local12, Static138.anInt6334);
						if (local60 <= Static165.anInt3409) {
							Static244.method5351(local78, local69, Static319.anIntArrayArray31[local60], arg2);
						}
						if (Static41.anInt1131 <= local150) {
							Static244.method5351(local78, local69, Static319.anIntArrayArray31[local150], arg2);
						}
					}
				}
			}
			local150 = arg4 - local12;
			local60 = local12 + arg4;
			if (Static41.anInt1131 <= local60 && local150 <= Static165.anInt3409) {
				local69 = local23 + arg5;
				local78 = arg5 - local23;
				if (Static60.anInt1399 <= local69 && Static138.anInt6334 >= local78) {
					local69 = Static54.method1088(Static60.anInt1399, local69, Static138.anInt6334);
					local78 = Static54.method1088(Static60.anInt1399, local78, Static138.anInt6334);
					if (local12 < local17) {
						local87 = local28 < local12 ? Static318.anIntArray641[local12] : local28;
						local200 = Static54.method1088(Static60.anInt1399, arg5 + local87, Static138.anInt6334);
						local209 = Static54.method1088(Static60.anInt1399, arg5 - local87, Static138.anInt6334);
						if (local60 <= Static165.anInt3409) {
							local216 = Static319.anIntArrayArray31[local60];
							Static244.method5351(local78, local209, local216, arg2);
							Static244.method5351(local209, local200, local216, arg3);
							Static244.method5351(local200, local69, local216, arg2);
						}
						if (Static41.anInt1131 <= local150) {
							local216 = Static319.anIntArrayArray31[local150];
							Static244.method5351(local78, local209, local216, arg2);
							Static244.method5351(local209, local200, local216, arg3);
							Static244.method5351(local200, local69, local216, arg2);
						}
					} else {
						if (Static165.anInt3409 >= local60) {
							Static244.method5351(local78, local69, Static319.anIntArrayArray31[local60], arg2);
						}
						if (Static41.anInt1131 <= local150) {
							Static244.method5351(local78, local69, Static319.anIntArrayArray31[local150], arg2);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(B)V")
	public static void method2628() {
		for (@Pc(16) Class1_Sub2_Sub1 local16 = (Class1_Sub2_Sub1) Static93.aClass14_7.method302(); local16 != null; local16 = (Class1_Sub2_Sub1) Static93.aClass14_7.method313()) {
			@Pc(21) Class10_Sub1_Sub1 local21 = local16.aClass10_Sub1_Sub1_1;
			if (local21.aByte73 != Static127.anInt2487 || Static282.anInt3516 > local21.anInt186) {
				local16.method5796();
				local21.method167();
			} else if (local21.anInt154 <= Static282.anInt3516) {
				if (local21.anInt155 > 0) {
					@Pc(64) Class10_Sub1_Sub2_Sub1 local64 = Static178.aClass10_Sub1_Sub2_Sub1Array1[local21.anInt155 - 1];
					if (local64 != null && local64.anInt6728 >= 0 && local64.anInt6728 < Static43.anInt1151 * 128 && local64.anInt6726 >= 0 && local64.anInt6726 < Static260.anInt5348 * 128) {
						local21.method168(local64.anInt6728, Static282.anInt3516, Static352.method5834(local64.anInt6726, local64.anInt6728, local21.aByte73) - local21.anInt173, local64.anInt6726);
					}
				}
				if (local21.anInt155 < 0) {
					@Pc(129) int local129 = -local21.anInt155 - 1;
					@Pc(138) Class10_Sub1_Sub2_Sub2 local138;
					if (local129 == Static301.anInt6030) {
						local138 = Static127.aClass10_Sub1_Sub2_Sub2_1;
					} else {
						local138 = Static202.aClass10_Sub1_Sub2_Sub2Array1[local129];
					}
					if (local138 != null && local138.anInt6728 >= 0 && local138.anInt6728 < Static43.anInt1151 * 128 && local138.anInt6726 >= 0 && Static260.anInt5348 * 128 > local138.anInt6726) {
						local21.method168(local138.anInt6728, Static282.anInt3516, Static352.method5834(local138.anInt6726, local138.anInt6728, local21.aByte73) - local21.anInt173, local138.anInt6726);
					}
				}
				local21.method161(Static41.anInt1126);
				Static189.method5292(local21, true);
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)V")
	public static void method2629(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class22 local7 = Static157.method2796(arg1);
		@Pc(10) int local10 = local7.anInt444;
		@Pc(13) int local13 = local7.anInt435;
		@Pc(24) int local24 = local7.anInt440;
		@Pc(31) int local31 = Class1_Sub5_Sub14.anIntArray329[local24 - local13];
		if (arg0 < 0 || arg0 > local31) {
			arg0 = 0;
		}
		local31 <<= local13;
		Static306.method5301(arg0 << local13 & local31 | ~local31 & Static81.anIntArray119[local10], local10);
	}
}
