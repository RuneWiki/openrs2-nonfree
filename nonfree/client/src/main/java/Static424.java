import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static424 {

	@OriginalMember(owner = "client!oi", name = "f", descriptor = "Lclient!du;")
	public static Class73 aClass73_2;

	@OriginalMember(owner = "client!oi", name = "j", descriptor = "I")
	public static int anInt7323;

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
	public static int anInt7319 = 0;

	@OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
	public static int anInt7322 = 0;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Ljava/lang/String;CBLjava/lang/String;)Ljava/lang/String;")
	public static String method6291(@OriginalArg(0) String arg0, @OriginalArg(3) String arg1) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) int local11 = arg1.length();
		@Pc(23) int local23 = local8;
		@Pc(27) int local27 = local11 - 1;
		if (local27 != 0) {
			@Pc(34) int local34 = 0;
			while (true) {
				local34 = arg0.indexOf(13, local34);
				if (local34 < 0) {
					break;
				}
				local34++;
				local23 += local27;
			}
		}
		@Pc(53) StringBuffer local53 = new StringBuffer(local23);
		@Pc(55) int local55 = 0;
		while (true) {
			@Pc(60) int local60 = arg0.indexOf(13, local55);
			if (local60 < 0) {
				local53.append(arg0.substring(local55));
				return local53.toString();
			}
			local53.append(arg0.substring(local55, local60));
			local53.append(arg1);
			local55 = local60 + 1;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(I[Lclient!ho;)V")
	public static void method6292(@OriginalArg(1) Class9[] arg0) {
		Static615.anInt10066 = arg0.length;
		Static24.aClass9Array7 = new Class9[Static615.anInt10066 + 10];
		Static493.anIntArray540 = new int[Static615.anInt10066 + 10];
		Static679.method1568(arg0, 0, Static24.aClass9Array7, 0, Static615.anInt10066);
		for (@Pc(32) int local32 = 0; local32 < Static615.anInt10066; local32++) {
			Static493.anIntArray540[local32] = Static24.aClass9Array7[local32].method8930();
		}
		for (@Pc(51) int local51 = Static615.anInt10066; local51 < Static24.aClass9Array7.length; local51++) {
			Static493.anIntArray540[local51] = 12;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIIBI)V")
	public static void method6293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static96.aClass6_Sub22_7.aClass29_Sub5_5.method1502() != 0 && arg1 != 0 && Static505.anInt8479 < 50 && arg0 != -1) {
			Static461.aClass243Array1[Static505.anInt8479++] = new Class243((byte) 1, arg0, arg1, arg3, arg4, 0, arg2, (Class2_Sub1) null);
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)Z")
	public static boolean method6294() {
		return Static272.method4009("jaclib") ? Static272.method4009("hw3d") : false;
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(B)V")
	public static void method6295() {
		Static143.method2106(11);
		Static9.method370();
		System.gc();
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(II[IIIIII)V")
	public static void method6296(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (arg0 > 0 && !Static177.method2498(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static177.method2498(arg3)) {
			@Pc(38) int local38 = 0;
			@Pc(45) int local45 = arg3 <= arg0 ? arg3 : arg0;
			@Pc(49) int local49 = arg0 >> 1;
			@Pc(53) int local53 = arg3 >> 1;
			@Pc(55) int[] local55 = arg1;
			@Pc(60) int[] local60 = new int[local49 * local53];
			while (true) {
				OpenGL.glTexImage2Di(arg4, local38, arg2, arg0, arg3, 0, 32993, arg5, local55, 0);
				if (local45 <= 1) {
					return;
				}
				@Pc(77) int local77 = 0;
				@Pc(79) int local79 = 0;
				@Pc(84) int local84 = arg0;
				@Pc(86) int[] local86 = local60;
				for (@Pc(88) int local88 = 0; local88 < local53; local88++) {
					for (@Pc(92) int local92 = 0; local92 < local49; local92++) {
						@Pc(99) int local99 = local55[local79++];
						@Pc(104) int local104 = local55[local79++];
						@Pc(109) int local109 = local55[local84++];
						@Pc(115) int local115 = local99 >> 24 & 0xFF;
						@Pc(121) int local121 = local99 >> 16 & 0xFF;
						@Pc(125) int local125 = local99 & 0xFF;
						@Pc(131) int local131 = local99 >> 8 & 0xFF;
						@Pc(136) int local136 = local55[local84++];
						@Pc(144) int local144 = local121 + (local104 >> 16 & 0xFF);
						@Pc(152) int local152 = local131 + (local104 >> 8 & 0xFF);
						@Pc(160) int local160 = local115 + (local104 >> 24 & 0xFF);
						@Pc(166) int local166 = local125 + (local104 & 0xFF);
						@Pc(174) int local174 = local160 + (local109 >> 24 & 0xFF);
						@Pc(180) int local180 = local166 + (local109 & 0xFF);
						@Pc(188) int local188 = local152 + (local109 >> 8 & 0xFF);
						@Pc(196) int local196 = local144 + (local109 >> 16 & 0xFF);
						@Pc(204) int local204 = local174 + (local136 >> 24 & 0xFF);
						@Pc(212) int local212 = local196 + (local136 >> 16 & 0xFF);
						@Pc(218) int local218 = local180 + (local136 & 0xFF);
						@Pc(226) int local226 = local188 + (local136 >> 8 & 0xFF);
						local60[local77++] = (local226 & 0x3FC) << 6 | (local204 & 0x3FC) << 22 | (local212 & 0x3FC) << 14 | local218 >> 2 & 0xFF;
					}
					local84 += arg0;
					local79 += arg0;
				}
				local60 = local55;
				arg0 = local49;
				arg3 = local53;
				local55 = local86;
				local38++;
				local49 >>= 0x1;
				local53 >>= 0x1;
				local45 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
