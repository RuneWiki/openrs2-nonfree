import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!dw", name = "R", descriptor = "I")
	public static int anInt1470;

	@OriginalMember(owner = "client!dw", name = "K", descriptor = "I")
	public static int anInt1464 = -1;

	@OriginalMember(owner = "client!dw", name = "O", descriptor = "I")
	public static int anInt1468 = 20;

	@OriginalMember(owner = "client!dw", name = "Q", descriptor = "Lclient!of;")
	public static final Class174 aClass174_52 = new Class174("glow1:", "leuchten1:", "brillant1:", "brilho1:");

	@OriginalMember(owner = "client!dw", name = "U", descriptor = "[C")
	public static final char[] aCharArray3 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!dw", name = "i", descriptor = "(I)V")
	public static void method1462() {
		Static276.anInt4608 = 0;
		Static325.aClass193_54.method4524();
		Static367.aBoolean425 = false;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIIBIIII)V")
	public static void method1463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg5;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg6 - arg4;
		@Pc(20) int local20 = arg5 - arg4;
		@Pc(24) int local24 = arg6 * arg6;
		@Pc(28) int local28 = arg5 * arg5;
		@Pc(32) int local32 = local16 * local16;
		@Pc(41) int local41 = local20 * local20;
		@Pc(45) int local45 = local28 << 1;
		@Pc(49) int local49 = local24 << 1;
		@Pc(53) int local53 = local41 << 1;
		@Pc(57) int local57 = local32 << 1;
		@Pc(61) int local61 = arg5 << 1;
		@Pc(65) int local65 = local20 << 1;
		@Pc(74) int local74 = local45 + (1 - local61) * local24;
		@Pc(83) int local83 = local28 - (local61 - 1) * local49;
		@Pc(91) int local91 = local53 + local32 * (1 - local65);
		@Pc(100) int local100 = local41 - (local65 - 1) * local57;
		@Pc(104) int local104 = local24 << 2;
		@Pc(108) int local108 = local28 << 2;
		@Pc(112) int local112 = local32 << 2;
		@Pc(116) int local116 = local41 << 2;
		@Pc(120) int local120 = local45 * 3;
		@Pc(126) int local126 = local49 * (local61 - 3);
		@Pc(130) int local130 = local53 * 3;
		@Pc(136) int local136 = (local65 - 3) * local57;
		@Pc(138) int local138 = local108;
		@Pc(144) int local144 = (arg5 - 1) * local104;
		@Pc(146) int local146 = local116;
		@Pc(152) int local152 = (local20 - 1) * local112;
		@Pc(156) int[] local156 = Static296.anIntArrayArray42[arg3];
		Static201.method3084(local156, arg2 - arg6, -local16 + arg2, arg1);
		Static201.method3084(local156, arg2 - local16, arg2 - -local16, arg0);
		Static201.method3084(local156, arg2 + local16, arg2 - -arg6, arg1);
		while (local9 > 0) {
			@Pc(200) boolean local200 = local20 >= local9;
			if (local200) {
				if (local91 < 0) {
					while (local91 < 0) {
						local100 += local146;
						local91 += local130;
						local130 += local116;
						local11++;
						local146 += local116;
					}
				}
				if (local100 < 0) {
					local91 += local130;
					local100 += local146;
					local130 += local116;
					local146 += local116;
					local11++;
				}
				local91 += -local152;
				local100 += -local136;
				local152 -= local112;
				local136 -= local112;
			}
			if (local74 < 0) {
				while (local74 < 0) {
					local74 += local120;
					local83 += local138;
					local120 += local108;
					local138 += local108;
					local7++;
				}
			}
			if (local83 < 0) {
				local74 += local120;
				local83 += local138;
				local138 += local108;
				local120 += local108;
				local7++;
			}
			local74 += -local144;
			local83 += -local126;
			local9--;
			local144 -= local104;
			local126 -= local104;
			@Pc(337) int local337 = arg3 - local9;
			@Pc(341) int local341 = local9 + arg3;
			@Pc(345) int local345 = arg2 + local7;
			@Pc(350) int local350 = arg2 - local7;
			if (local200) {
				@Pc(356) int local356 = arg2 + local11;
				@Pc(361) int local361 = arg2 - local11;
				Static201.method3084(Static296.anIntArrayArray42[local337], local350, local361, arg1);
				Static201.method3084(Static296.anIntArrayArray42[local337], local361, local356, arg0);
				Static201.method3084(Static296.anIntArrayArray42[local337], local356, local345, arg1);
				Static201.method3084(Static296.anIntArrayArray42[local341], local350, local361, arg1);
				Static201.method3084(Static296.anIntArrayArray42[local341], local361, local356, arg0);
				Static201.method3084(Static296.anIntArrayArray42[local341], local356, local345, arg1);
			} else {
				Static201.method3084(Static296.anIntArrayArray42[local337], local350, local345, arg1);
				Static201.method3084(Static296.anIntArrayArray42[local341], local350, local345, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!dq;IILjava/awt/Component;I)Lclient!kl;")
	public static Class96 method1464(@OriginalArg(0) Class51 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) int arg3) {
		if (Static203.anInt3626 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(46) Class96 local46 = (Class96) Class.forName("Class96_Sub1").getDeclaredConstructor().newInstance();
			local46.anIntArray269 = new int[(Static158.aBoolean222 ? 2 : 1) * 256];
			local46.anInt4100 = arg1;
			local46.method3461(arg2);
			local46.anInt4098 = (arg1 & 0xFFFFFC00) + 1024;
			if (local46.anInt4098 > 16384) {
				local46.anInt4098 = 16384;
			}
			local46.method3469(local46.anInt4098);
			if (Static293.anInt5087 > 0 && Static362.aClass117_1 == null) {
				Static362.aClass117_1 = new Class117();
				Static362.aClass117_1.aClass51_3 = arg0;
				arg0.method1385(Static293.anInt5087, Static362.aClass117_1);
			}
			if (Static362.aClass117_1 != null) {
				if (Static362.aClass117_1.aClass96Array1[arg3] != null) {
					throw new IllegalArgumentException();
				}
				Static362.aClass117_1.aClass96Array1[arg3] = local46;
			}
			return local46;
		} catch (@Pc(116) Throwable local116) {
			try {
				@Pc(122) Class96_Sub2 local122 = new Class96_Sub2(arg0, arg3);
				local122.anIntArray269 = new int[(Static158.aBoolean222 ? 2 : 1) * 256];
				local122.anInt4100 = arg1;
				local122.method3461(arg2);
				local122.anInt4098 = 16384;
				local122.method3469(local122.anInt4098);
				if (Static293.anInt5087 > 0 && Static362.aClass117_1 == null) {
					Static362.aClass117_1 = new Class117();
					Static362.aClass117_1.aClass51_3 = arg0;
					arg0.method1385(Static293.anInt5087, Static362.aClass117_1);
				}
				if (Static362.aClass117_1 != null) {
					if (Static362.aClass117_1.aClass96Array1[arg3] != null) {
						throw new IllegalArgumentException();
					}
					Static362.aClass117_1.aClass96Array1[arg3] = local122;
				}
				return local122;
			} catch (@Pc(184) Throwable local184) {
				return new Class96();
			}
		}
	}
}
