import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static548 {

	@OriginalMember(owner = "client!si", name = "b", descriptor = "Lclient!aj;")
	public static Class15 aClass15_136;

	@OriginalMember(owner = "client!si", name = "l", descriptor = "[I")
	public static final int[] anIntArray761 = new int[32];

	@OriginalMember(owner = "client!si", name = "a", descriptor = "()V")
	public static void method7836() {
		while (true) {
			@Pc(1) boolean local1 = true;
			@Pc(3) int local3;
			for (local3 = 0; local3 < Static569.aClass383Array1.length; local3++) {
				if (Static569.aClass383Array1[local3].method9131()) {
					Static619.aLongArray30[local3] = Static569.aClass383Array1[local3].method9128();
				} else {
					synchronized (Static569.aClass383Array1[local3]) {
						Static569.aClass383Array1[local3].notify();
					}
					local1 = false;
				}
			}
			if (local1) {
				Static569.aClass383Array1[Static569.aClass383Array1.length - 1].method9132();
				Static348.method5200(1);
				while (true) {
					local1 = true;
					for (local3 = 0; local3 < Static569.aClass383Array1.length - 1; local3++) {
						if (!Static569.aClass383Array1[local3].method9131()) {
							synchronized (Static569.aClass383Array1[local3]) {
								Static569.aClass383Array1[local3].notify();
							}
							local1 = false;
						}
					}
					if (local1) {
						for (@Pc(102) int local102 = 1; local102 < Static569.aClass383Array1.length - 2; local102++) {
							Static569.aClass383Array1[local102].method9132();
						}
						Static348.method5200(2);
						while (!Static569.aClass383Array1[0].method9131()) {
							synchronized (Static569.aClass383Array1[0]) {
								Static569.aClass383Array1[0].notify();
							}
							try {
								Static373.method5403(1L);
							} catch (@Pc(142) Exception local142) {
							}
						}
						Static569.aClass383Array1[0].method9132();
						return;
					}
					try {
						Static373.method5403(1L);
					} catch (@Pc(99) Exception local99) {
					}
				}
			}
			try {
				Static373.method5403(1L);
			} catch (@Pc(47) Exception local47) {
			}
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V")
	public static void method7837() {
		if (Static365.aByteArray63 != null) {
			Static616.method8707(Static41.anInt961);
		} else if (Static252.anInt4525 == -1) {
			Static74.method1422(Static492.aString90, Static506.aString86, Static41.anInt961);
		} else {
			Static365.method5322(Static41.anInt961);
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(II)V")
	public static void method7838(@OriginalArg(1) int arg0) {
		if (Static27.method666(arg0)) {
			Static213.method3715(-1, Static489.aClass260ArrayArray3[arg0]);
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!wea;[Lclient!uca;)V")
	public static void method7842(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) Class3_Sub15[] arg1) {
		@Pc(6) int local6;
		if (Static236.aBoolean325) {
			local6 = arg0.method9298(arg1);
			Static671.aClass13_21.method8472(local6, arg1);
		}
		if (Static108.aClass21Array1 == Static121.aClass21Array2) {
			@Pc(28) int local28;
			if (arg0 instanceof Class28_Sub1_Sub1) {
				local6 = ((Class28_Sub1_Sub1) arg0).aShort125;
				local28 = ((Class28_Sub1_Sub1) arg0).aShort123;
			} else {
				local6 = arg0.anInt10729 >> Static391.anInt10262;
				local28 = arg0.anInt10731 >> Static391.anInt10262;
			}
			Static671.aClass13_21.EA(Static582.aClass21Array3[0].method7980(arg0.anInt10731, arg0.anInt10729), Static436.method6232(local6, local28), Static179.method3209(local6, local28), Static260.method4008(local6, local28));
		}
		@Pc(64) Class28_Sub3 local64 = arg0.method9291(Static671.aClass13_21);
		if (local64 == null) {
			return;
		}
		if (arg0.aBoolean817) {
			@Pc(72) Class28_Sub8[] local72 = local64.aClass28_Sub8Array1;
			for (@Pc(74) int local74 = 0; local74 < local72.length; local74++) {
				@Pc(79) Class28_Sub8 local79 = local72[local74];
				if (local79.aBoolean716) {
					Static642.method8919(local79.anInt9153 + local79.anInt9149, local79.anInt9150 + local79.anInt9149, local79.anInt9152 - local79.anInt9149, local79.anInt9151 - local79.anInt9149);
				}
			}
		}
		if (local64.aBoolean145) {
			local64.aClass28_Sub1_5 = arg0;
			if (Static140.aBoolean220) {
				@Pc(119) Class321 local119 = Static645.aClass321_3;
				synchronized (Static645.aClass321_3) {
					Static645.aClass321_3.method7864(local64);
					return;
				}
			}
			Static645.aClass321_3.method7864(local64);
			return;
		}
		Static519.method7297(local64);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!wea;ILclient!vq;I)V")
	public static void method7844(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(2) Class372 arg1, @OriginalArg(3) int arg2) {
		if (Static199.anInt3915 >= 50 || (arg1 == null || arg1.anIntArrayArray65 == null || arg1.anIntArrayArray65.length <= arg2 || arg1.anIntArrayArray65[arg2] == null)) {
			return;
		}
		@Pc(32) int local32 = arg1.anIntArrayArray65[arg2][0];
		@Pc(36) int local36 = local32 >> 8;
		@Pc(42) int local42 = local32 >> 5 & 0x7;
		@Pc(59) int local59;
		if (arg1.anIntArrayArray65[arg2].length > 1) {
			local59 = (int) (Math.random() * (double) arg1.anIntArrayArray65[arg2].length);
			if (local59 > 0) {
				local36 = arg1.anIntArrayArray65[arg2][local59];
			}
		}
		@Pc(75) int local75 = local32 & 0x1F;
		local59 = 256;
		if (arg1.anIntArray904 != null && arg1.anIntArray899 != null) {
			local59 = (int) (Math.random() * (double) (arg1.anIntArray899[arg2] - arg1.anIntArray904[arg2])) + arg1.anIntArray904[arg2];
		}
		@Pc(113) int local113 = arg1.anIntArray903 == null ? 255 : arg1.anIntArray903[arg2];
		if (local75 == 0) {
			if (arg0 == Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2) {
				if (!arg1.aBoolean773) {
					Static291.method4560(local113, local36, 0, local42, local59);
					return;
				}
				Static264.method4359(false, 0, local42, local36, local113, local59);
			}
		} else if (Static24.aClass3_Sub22_4.aClass6_Sub28_2.method8690() != 0) {
			@Pc(156) int local156 = arg0.anInt10729 - 256 >> 9;
			@Pc(163) int local163 = arg0.anInt10731 - 256 >> 9;
			@Pc(184) int local184 = Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2 == arg0 ? 0 : local75 + (arg0.aByte174 << 24) + (local156 << 16) + (local163 << 8);
			Static240.aClass182Array1[Static199.anInt3915++] = new Class182((byte) (arg1.aBoolean773 ? 2 : 1), local36, local42, 0, local113, local184, local59, arg0);
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)Z")
	public static boolean method7846() {
		try {
			if (Static18.anInt450 == 2) {
				if (Static172.aClass3_Sub4_2 == null) {
					Static172.aClass3_Sub4_2 = Static680.method614(Static403.aClass15_107, Static453.anInt7540, Static499.anInt8156);
					if (Static172.aClass3_Sub4_2 == null) {
						return false;
					}
				}
				if (Static107.aClass226_1 == null) {
					Static107.aClass226_1 = new Class226(Static527.aClass15_133, Static154.aClass15_42);
				}
				@Pc(29) Class3_Sub1_Sub3 local29 = Static366.aClass3_Sub1_Sub3_4;
				if (Static257.aClass3_Sub1_Sub3_2 != null) {
					local29 = Static257.aClass3_Sub1_Sub3_2;
				}
				if (local29.method2171(Static107.aClass226_1, Static172.aClass3_Sub4_2, Static597.aClass15_148)) {
					Static366.aClass3_Sub1_Sub3_4 = local29;
					Static366.aClass3_Sub1_Sub3_4.method2181();
					@Pc(59) int local59;
					if (Static229.anInt4278 <= 0) {
						Static18.anInt450 = 0;
						Static366.aClass3_Sub1_Sub3_4.method2149(Static553.anInt9041);
						for (local59 = 0; local59 < Static231.anIntArray387.length; local59++) {
							Static366.aClass3_Sub1_Sub3_4.method2169(Static231.anIntArray387[local59], local59);
							Static231.anIntArray387[local59] = 255;
						}
					} else {
						Static18.anInt450 = 3;
						Static366.aClass3_Sub1_Sub3_4.method2149(Static553.anInt9041 >= Static229.anInt4278 ? Static229.anInt4278 : Static553.anInt9041);
						for (local59 = 0; local59 < Static231.anIntArray387.length; local59++) {
							Static366.aClass3_Sub1_Sub3_4.method2169(Static231.anIntArray387[local59], local59);
							Static231.anIntArray387[local59] = 255;
						}
					}
					if (Static257.aClass3_Sub1_Sub3_2 == null) {
						if (Static89.aLong51 <= 0L) {
							Static366.aClass3_Sub1_Sub3_4.method2177(Static512.aBoolean627, Static172.aClass3_Sub4_2);
						} else {
							Static366.aClass3_Sub1_Sub3_4.method2173(Static89.aLong51, Static512.aBoolean627, Static172.aClass3_Sub4_2);
						}
					}
					if (Static343.aClass127_5 != null) {
						Static343.aClass127_5.method7565(Static366.aClass3_Sub1_Sub3_4);
					}
					Static89.aLong51 = 0L;
					Static172.aClass3_Sub4_2 = null;
					Static107.aClass226_1 = null;
					Static257.aClass3_Sub1_Sub3_2 = null;
					Static403.aClass15_107 = null;
					return true;
				}
			}
		} catch (@Pc(155) Exception local155) {
			local155.printStackTrace();
			Static366.aClass3_Sub1_Sub3_4.method2176();
			Static107.aClass226_1 = null;
			Static172.aClass3_Sub4_2 = null;
			Static18.anInt450 = 0;
			Static257.aClass3_Sub1_Sub3_2 = null;
			Static403.aClass15_107 = null;
		}
		return false;
	}
}
