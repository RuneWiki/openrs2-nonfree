import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!li", name = "a", descriptor = "I")
	public static int anInt3218;

	@OriginalMember(owner = "client!li", name = "c", descriptor = "Lclient!jc;")
	public static Class4_Sub2_Sub9 aClass4_Sub2_Sub9_4;

	@OriginalMember(owner = "client!li", name = "o", descriptor = "I")
	public static int anInt3230 = 0;

	@OriginalMember(owner = "client!li", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString111 = "Your ignore list is full. Max of 100 users.";

	@OriginalMember(owner = "client!li", name = "t", descriptor = "Z")
	public static boolean aBoolean208 = false;

	@OriginalMember(owner = "client!li", name = "u", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray21 = new String[500];

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V")
	public static void method2538() {
		Static256.aClass4_Sub24_Sub1_3.method3126();
		@Pc(11) int local11 = Static256.aClass4_Sub24_Sub1_3.method3132(1);
		if (local11 == 0) {
			return;
		}
		@Pc(20) int local20 = Static256.aClass4_Sub24_Sub1_3.method3132(2);
		if (local20 == 0) {
			Static148.anIntArray237[Static291.anInt5649++] = 2047;
			return;
		}
		@Pc(43) int local43;
		@Pc(53) int local53;
		if (local20 == 1) {
			local43 = Static256.aClass4_Sub24_Sub1_3.method3132(3);
			Static72.aClass13_Sub5_Sub1_1.method4210(1, local43);
			local53 = Static256.aClass4_Sub24_Sub1_3.method3132(1);
			if (local53 == 1) {
				Static148.anIntArray237[Static291.anInt5649++] = 2047;
			}
		} else if (local20 == 2) {
			if (Static256.aClass4_Sub24_Sub1_3.method3132(1) == 1) {
				local43 = Static256.aClass4_Sub24_Sub1_3.method3132(3);
				Static72.aClass13_Sub5_Sub1_1.method4210(2, local43);
				local53 = Static256.aClass4_Sub24_Sub1_3.method3132(3);
				Static72.aClass13_Sub5_Sub1_1.method4210(2, local53);
			} else {
				local43 = Static256.aClass4_Sub24_Sub1_3.method3132(3);
				Static72.aClass13_Sub5_Sub1_1.method4210(0, local43);
			}
			local43 = Static256.aClass4_Sub24_Sub1_3.method3132(1);
			if (local43 == 1) {
				Static148.anIntArray237[Static291.anInt5649++] = 2047;
			}
		} else if (local20 == 3) {
			local43 = Static256.aClass4_Sub24_Sub1_3.method3132(7);
			local53 = Static256.aClass4_Sub24_Sub1_3.method3132(7);
			Static222.anInt4467 = Static256.aClass4_Sub24_Sub1_3.method3132(2);
			@Pc(158) int local158 = Static256.aClass4_Sub24_Sub1_3.method3132(1);
			if (local158 == 1) {
				Static148.anIntArray237[Static291.anInt5649++] = 2047;
			}
			@Pc(176) int local176 = Static256.aClass4_Sub24_Sub1_3.method3132(1);
			Static72.aClass13_Sub5_Sub1_1.method3496(local53, local176 == 1, local43);
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
	public static void method2539() {
		Static80.aClass172_13.method4350();
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!we;ILclient!pi;B)V")
	public static void method2541(@OriginalArg(0) Class184 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub24 arg2) {
		@Pc(9) Class4_Sub13 local9 = new Class4_Sub13();
		local9.anInt1728 = arg2.method3110();
		local9.anInt1731 = arg2.method3084();
		local9.anIntArray156 = new int[local9.anInt1728];
		local9.aClass119Array2 = new Class119[local9.anInt1728];
		local9.anIntArray157 = new int[local9.anInt1728];
		local9.aClass119Array1 = new Class119[local9.anInt1728];
		local9.aByteArrayArrayArray5 = new byte[local9.anInt1728][][];
		local9.anIntArray155 = new int[local9.anInt1728];
		for (@Pc(59) int local59 = 0; local59 < local9.anInt1728; local59++) {
			try {
				@Pc(73) int local73 = arg2.method3110();
				@Pc(87) String local87;
				@Pc(95) String local95;
				@Pc(89) int local89;
				if (local73 == 0 || local73 == 1 || local73 == 2) {
					local87 = arg2.method3111();
					local89 = 0;
					local95 = arg2.method3111();
					if (local73 == 1) {
						local89 = arg2.method3084();
					}
					local9.anIntArray157[local59] = local73;
					local9.anIntArray155[local59] = local89;
					local9.aClass119Array1[local59] = arg0.method4618(local95, Static235.method3645(local87));
				} else if (local73 == 3 || local73 == 4) {
					local87 = arg2.method3111();
					local95 = arg2.method3111();
					local89 = arg2.method3110();
					@Pc(152) String[] local152 = new String[local89];
					for (@Pc(154) int local154 = 0; local154 < local89; local154++) {
						local152[local154] = arg2.method3111();
					}
					@Pc(169) byte[][] local169 = new byte[local89][];
					@Pc(181) int local181;
					if (local73 == 3) {
						for (@Pc(174) int local174 = 0; local174 < local89; local174++) {
							local181 = arg2.method3084();
							local169[local174] = new byte[local181];
							arg2.method3088(local181, local169[local174]);
						}
					}
					local9.anIntArray157[local59] = local73;
					@Pc(205) Class[] local205 = new Class[local89];
					for (local181 = 0; local181 < local89; local181++) {
						local205[local181] = Static235.method3645(local152[local181]);
					}
					local9.aClass119Array2[local59] = arg0.method4604(Static235.method3645(local87), local95, local205);
					local9.aByteArrayArrayArray5[local59] = local169;
				}
			} catch (@Pc(242) ClassNotFoundException local242) {
				local9.anIntArray156[local59] = -1;
			} catch (@Pc(249) SecurityException local249) {
				local9.anIntArray156[local59] = -2;
			} catch (@Pc(256) NullPointerException local256) {
				local9.anIntArray156[local59] = -3;
			} catch (@Pc(263) Exception local263) {
				local9.anIntArray156[local59] = -4;
			} catch (@Pc(270) Throwable local270) {
				local9.anIntArray156[local59] = -5;
			}
		}
		Static30.aClass17_4.method619(local9);
	}
}
