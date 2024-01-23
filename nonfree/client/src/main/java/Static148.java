import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
	public static int anInt2996;

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "[Lclient!ge;")
	public static Class53_Sub1[] aClass53_Sub1Array2;

	@OriginalMember(owner = "client!lc", name = "s", descriptor = "I")
	public static int anInt3010;

	@OriginalMember(owner = "client!lc", name = "D", descriptor = "[[Lclient!cc;")
	public static Class22[][] aClass22ArrayArray1;

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "Z")
	public static boolean aBoolean198 = false;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZIII)I")
	public static int method2371(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static210.aBoolean272) {
			arg3 = 1000000;
			Static210.aBoolean272 = false;
		}
		@Pc(18) Class64 local18 = Static61.aClass64ArrayArray1[arg2][arg0];
		@Pc(21) int local21 = local18.anInt2265;
		@Pc(24) float local24 = local18.aFloat22;
		@Pc(34) float local34 = local18.aFloat20 * ((float) arg1 * 0.1F + 0.7F);
		@Pc(37) float local37 = local18.aFloat19;
		@Pc(40) int local40 = local18.anInt2264;
		@Pc(43) Class4_Sub2_Sub15 local43 = local18.aClass4_Sub2_Sub15_3;
		@Pc(46) int local46 = local18.anInt2263;
		@Pc(49) float local49 = local18.aFloat18;
		@Pc(52) float local52 = local18.aFloat17;
		if (!Static14.aBoolean154) {
			local40 = 0;
		}
		@Pc(60) float local60 = local18.aFloat21;
		if (local21 != Static86.anInt1776 || local34 != Static164.aFloat27 || local24 != Static193.aFloat34 || local37 != Static286.aFloat51 || Static40.anInt843 != local46 || local40 != Static160.anInt3184 || Static134.aClass4_Sub2_Sub15_4 != local43 || Static15.aFloat4 != local49 || local60 != Static210.aFloat43 || Static131.aFloat25 != local52) {
			Static276.aFloat50 = Static17.aFloat5;
			Static156.aFloat26 = Static201.aFloat35;
			Static102.anInt2160 = Static158.anInt3163;
			Static207.aClass4_Sub2_Sub15_6 = Static206.aClass4_Sub2_Sub15_5;
			Static268.aFloat48 = Static11.aFloat2;
			Static180.anInt3563 = Static230.anInt4512;
			Static295.aFloat55 = Static67.aFloat9;
			Static72.anInt1321 = Static241.anInt4628;
			Static73.aFloat11 = Static125.aFloat24;
			Static5.aFloat1 = Static68.aFloat10;
			if (Static99.aClass4_Sub2_Sub15_2 == null || Static99.aClass4_Sub2_Sub15_2 == Static207.aClass4_Sub2_Sub15_6) {
				Static99.aClass4_Sub2_Sub15_2 = new Class4_Sub2_Sub15();
			}
			Static40.anInt843 = local46;
			Static131.aFloat25 = local52;
			Static39.anInt5185 = 0;
			Static210.aFloat43 = local60;
			Static286.aFloat51 = local37;
			Static193.aFloat34 = local24;
			Static86.anInt1776 = local21;
			Static164.aFloat27 = local34;
			Static160.anInt3184 = local40;
			Static15.aFloat4 = local49;
			Static134.aClass4_Sub2_Sub15_4 = local43;
		}
		if (Static39.anInt5185 < 65536) {
			Static39.anInt5185 += arg3 * 250;
			if (Static39.anInt5185 < 65536) {
				@Pc(185) int local185 = 65536 - Static39.anInt5185 >> 8;
				@Pc(189) int local189 = Static39.anInt5185 >> 8;
				Static241.anInt4628 = Static72.anInt1321 * local185 + local189 * Static160.anInt3184 >> 8;
				Static230.anInt4512 = ((Static40.anInt843 & 0xFF00FF) * local189 + local185 * (Static180.anInt3563 & 0xFF00FF) & 0xFF00FF00) + ((Static180.anInt3563 & 0xFF00) * local185 + (Static40.anInt843 & 0xFF00) * local189 & 0xFF0000) >> 8;
				Static158.anInt3163 = ((Static86.anInt1776 & 0xFF00FF) * local189 + (Static102.anInt2160 & 0xFF00FF) * local185 & 0xFF00FF00) + (local185 * (Static102.anInt2160 & 0xFF00) + ((Static86.anInt1776 & 0xFF00) * local189) & 0xFF0000) >> 8;
				@Pc(271) float local271 = (float) (65536 - Static39.anInt5185) / 65536.0F;
				@Pc(276) float local276 = (float) Static39.anInt5185 / 65536.0F;
				Static125.aFloat24 = Static164.aFloat27 * local276 + local271 * Static73.aFloat11;
				Static11.aFloat2 = local276 * Static286.aFloat51 + local271 * Static268.aFloat48;
				Static68.aFloat10 = local276 * Static15.aFloat4 + local271 * Static5.aFloat1;
				Static67.aFloat9 = local276 * Static210.aFloat43 + local271 * Static295.aFloat55;
				Static201.aFloat35 = Static156.aFloat26 * local271 + local276 * Static193.aFloat34;
				Static17.aFloat5 = Static131.aFloat25 * local276 + Static276.aFloat50 * local271;
				if (Static207.aClass4_Sub2_Sub15_6 != Static134.aClass4_Sub2_Sub15_4) {
					if (Static207.aClass4_Sub2_Sub15_6 == null || Static134.aClass4_Sub2_Sub15_4 == null) {
						Static206.aClass4_Sub2_Sub15_5 = null;
					} else {
						Static206.aClass4_Sub2_Sub15_5 = Static99.aClass4_Sub2_Sub15_2.method3005(Static207.aClass4_Sub2_Sub15_6, Static134.aClass4_Sub2_Sub15_4, (float) Static39.anInt5185 / 65536.0F);
					}
				}
			} else {
				Static241.anInt4628 = Static160.anInt3184;
				Static158.anInt3163 = Static86.anInt1776;
				Static39.anInt5185 = 65536;
				Static11.aFloat2 = Static286.aFloat51;
				Static67.aFloat9 = Static210.aFloat43;
				Static68.aFloat10 = Static15.aFloat4;
				Static125.aFloat24 = Static164.aFloat27;
				Static201.aFloat35 = Static193.aFloat34;
				Static207.aClass4_Sub2_Sub15_6 = null;
				Static17.aFloat5 = Static131.aFloat25;
				Static230.anInt4512 = Static40.anInt843;
				Static206.aClass4_Sub2_Sub15_5 = Static134.aClass4_Sub2_Sub15_4;
			}
		}
		return Static230.anInt4512;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZI)I")
	public static int method2375(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class4_Sub32 local14 = (Class4_Sub32) Static105.aClass97_9.method2360((long) arg1);
		if (local14 == null) {
			return -1;
		} else if (arg0 >= 0 && local14.anIntArray480.length > arg0) {
			return local14.anIntArray480[arg0];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)V")
	public static void method2387() {
		aClass22ArrayArray1 = null;
		aClass53_Sub1Array2 = null;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!tk;IILjava/awt/Component;I)Lclient!fl;")
	public static Class51 method2393(@OriginalArg(0) Class164 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) int arg3) {
		if (Static79.anInt1529 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(36) Class51 local36 = (Class51) Class.forName("Class51_Sub2").getDeclaredConstructor().newInstance();
			local36.anIntArray358 = new int[(Static14.aBoolean153 ? 2 : 1) * 256];
			local36.anInt4040 = arg1;
			local36.method3284(arg2);
			local36.anInt4041 = (arg1 & -1024) + 1024;
			if (local36.anInt4041 > 16384) {
				local36.anInt4041 = 16384;
			}
			local36.method3285(local36.anInt4041);
			if (Static224.anInt4442 > 0 && Static165.aClass96_1 == null) {
				Static165.aClass96_1 = new Class96();
				Static165.aClass96_1.aClass164_3 = arg0;
				arg0.method3952(Static224.anInt4442, Static165.aClass96_1);
			}
			if (Static165.aClass96_1 != null) {
				if (Static165.aClass96_1.aClass51Array1[arg3] != null) {
					throw new IllegalArgumentException();
				}
				Static165.aClass96_1.aClass51Array1[arg3] = local36;
			}
			return local36;
		} catch (@Pc(117) Throwable local117) {
			try {
				@Pc(123) Class51_Sub1 local123 = new Class51_Sub1(arg0, arg3);
				local123.anInt4040 = arg1;
				local123.anIntArray358 = new int[(Static14.aBoolean153 ? 2 : 1) * 256];
				local123.method3284(arg2);
				local123.anInt4041 = 16384;
				local123.method3285(local123.anInt4041);
				if (Static224.anInt4442 > 0 && Static165.aClass96_1 == null) {
					Static165.aClass96_1 = new Class96();
					Static165.aClass96_1.aClass164_3 = arg0;
					arg0.method3952(Static224.anInt4442, Static165.aClass96_1);
				}
				if (Static165.aClass96_1 != null) {
					if (Static165.aClass96_1.aClass51Array1[arg3] != null) {
						throw new IllegalArgumentException();
					}
					Static165.aClass96_1.aClass51Array1[arg3] = local123;
				}
				return local123;
			} catch (@Pc(188) Throwable local188) {
				return new Class51();
			}
		}
	}
}
