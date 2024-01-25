import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static569 {

	@OriginalMember(owner = "client!uea", name = "B", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_136 = new Class71(111, -1);

	@OriginalMember(owner = "client!uea", name = "Y", descriptor = "I")
	public static int anInt9789 = -1;

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(III)Z")
	public static boolean method7901(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(IIIILclient!ha;I)V")
	public static void method7902(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class16 arg3, @OriginalArg(5) int arg4) {
		arg3.KA(arg4, arg2, arg0 + arg4, arg2 + arg1);
		arg3.method6114(-16777216, arg4, arg1, arg2, arg0);
		if (Static489.anInt8687 < 100) {
			return;
		}
		@Pc(38) float local38 = (float) Static110.anInt7701 / (float) Static110.anInt7702;
		@Pc(40) int local40 = arg0;
		@Pc(42) int local42 = arg1;
		if (local38 < 1.0F) {
			local42 = (int) (local38 * (float) arg0);
		} else {
			local40 = (int) ((float) arg1 / local38);
		}
		@Pc(68) int local68 = arg4 + (arg0 - local40) / 2;
		@Pc(77) int local77 = arg2 + (arg1 - local42) / 2;
		if (Static202.aClass21_7 == null || Static202.aClass21_7.method5790() != arg0 || Static202.aClass21_7.method5783() != arg1) {
			Static110.method6389(Static110.anInt7708, Static110.anInt7701 + Static110.anInt7703, Static110.anInt7702 + Static110.anInt7708, Static110.anInt7703, local68, local77, local68 + local40, local77 - -local42);
			Static110.method6395(arg3);
			Static202.aClass21_7 = arg3.method6104(local68, local77, local40, local42, false);
		}
		Static202.aClass21_7.method5796(local68, local77);
		@Pc(126) int local126 = local40 * Static407.anInt7789 / Static110.anInt7702;
		@Pc(132) int local132 = Class15_Sub1_Sub4_Sub2.lb * local42 / Static110.anInt7701;
		@Pc(140) int local140 = Static57.anInt1870 * local40 / Static110.anInt7702 + local68;
		@Pc(154) int local154 = local42 + local77 - local132 - local42 * Static616.anInt10359 / Static110.anInt7701;
		@Pc(156) int local156 = -1996554240;
		if (Static18.aClass217_1 == Static281.aClass217_4) {
			local156 = -1996488705;
		}
		arg3.aa(local140, local154, local126, local132, local156, 1);
		arg3.method6106(local140, local154, local126, local132, local156, 0);
		if (Static611.anInt10290 <= 0) {
			return;
		}
		@Pc(186) int local186;
		if (Static100.anInt2681 <= 50) {
			local186 = Static100.anInt2681 * 5;
		} else {
			local186 = 500 - Static100.anInt2681 * 5;
		}
		for (@Pc(199) Class8_Sub35 local199 = (Class8_Sub35) Static110.aClass43_49.method1422(); local199 != null; local199 = (Class8_Sub35) Static110.aClass43_49.method1426()) {
			@Pc(207) Class17 local207 = Static110.aClass12_3.method136(local199.anInt6533);
			if (Static524.method7455(local207)) {
				@Pc(228) int local228;
				@Pc(241) int local241;
				if (Static464.anInt8440 == local199.anInt6533) {
					local228 = local68 + local199.anInt6532 * local40 / Static110.anInt7702;
					local241 = local77 + (Static110.anInt7701 - local199.anInt6536) * local42 / Static110.anInt7701;
					arg3.method6114(local186 << 24 | 0xFFFF00, local228 - 2, 4, local241 - 2, 4);
				} else if (Static182.anInt4253 != -1 && local207.anInt811 == Static182.anInt4253) {
					local228 = local40 * local199.anInt6532 / Static110.anInt7702 + local68;
					local241 = local77 + local42 * (Static110.anInt7701 - local199.anInt6536) / Static110.anInt7701;
					arg3.method6114(local186 << 24 | 0xFFFF00, local228 - 2, 4, local241 - 2, 4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(Lclient!bg;I)V")
	public static void method7905(@OriginalArg(0) Class33 arg0) {
		Static554.aClass33_1 = arg0;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(IILclient!aa;JLclient!tp;IIIB)V")
	public static void method7906(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) long arg3, @OriginalArg(4) Class331 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(15) int local15 = arg5 * arg5 + arg7 * arg7;
		if (arg3 < (long) local15) {
			return;
		}
		@Pc(35) int local35 = Math.min(arg4.anInt9553 / 2, arg4.anInt9505 / 2);
		if (local35 * local35 >= local15) {
			Static605.method7726(arg7, arg4, arg6, arg1, arg5, arg2, Static482.aClass21Array19[arg0]);
			return;
		}
		local35 -= 10;
		@Pc(61) int local61;
		if (Static427.anInt8005 == 4) {
			local61 = (int) Static499.aFloat185 & 0x3FFF;
		} else {
			local61 = Static642.anInt10689 + (int) Static499.aFloat185 & 0x3FFF;
		}
		@Pc(74) int local74 = Class344.anIntArray579[local61];
		@Pc(78) int local78 = Class344.anIntArray578[local61];
		if (Static427.anInt8005 != 4) {
			local74 = local74 * 256 / (Static423.anInt7961 + 256);
			local78 = local78 * 256 / (Static423.anInt7961 + 256);
		}
		@Pc(107) int local107 = arg5 * local74 + arg7 * local78 >> 14;
		@Pc(118) int local118 = local78 * arg5 - arg7 * local74 >> 14;
		@Pc(124) double local124 = Math.atan2((double) local107, (double) local118);
		@Pc(131) int local131 = (int) (Math.sin(local124) * (double) local35);
		@Pc(138) int local138 = (int) (Math.cos(local124) * (double) local35);
		Static565.aClass21Array11[arg0].method5793((float) local131 + (float) arg4.anInt9553 / 2.0F + (float) arg1, (float) arg4.anInt9505 / 2.0F + (float) arg6 - (float) local138, 4096, (int) (-local124 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!uea", name = "k", descriptor = "(I)Lclient!gp;")
	public static Class8_Sub5_Sub8 method7908() {
		@Pc(13) Class8_Sub5_Sub8 local13 = (Class8_Sub5_Sub8) Static557.aClass302_13.method7327();
		if (local13 != null) {
			local13.method8640();
			local13.method8381();
			return local13;
		}
		do {
			local13 = (Class8_Sub5_Sub8) Static465.aClass302_12.method7327();
			if (local13 == null) {
				return null;
			}
			if (local13.method3515() > Static342.method5463()) {
				return null;
			}
			local13.method8640();
			local13.method8381();
		} while ((Long.MIN_VALUE & local13.aLong275) == 0L);
		return local13;
	}
}
