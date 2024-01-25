import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!dv", name = "F", descriptor = "F")
	public static float aFloat18;

	@OriginalMember(owner = "client!dv", name = "S", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_69 = new Class103(16, 3);

	@OriginalMember(owner = "client!dv", name = "T", descriptor = "[I")
	public static final int[] anIntArray113 = new int[50];

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(III[IIBII)V")
	public static void method1354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg1 > 0 && !Static90.method1429(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static90.method1429(arg3)) {
			@Pc(44) int local44 = 0;
			@Pc(55) int local55 = arg3 > arg1 ? arg1 : arg3;
			@Pc(59) int local59 = arg1 >> 1;
			@Pc(63) int local63 = arg3 >> 1;
			@Pc(65) int[] local65 = arg2;
			@Pc(70) int[] local70 = new int[local59 * local63];
			while (true) {
				OpenGL.glTexImage2Di(arg4, local44, arg5, arg1, arg3, 0, 32993, arg0, local65, 0);
				if (local55 <= 1) {
					return;
				}
				@Pc(88) int local88 = 0;
				@Pc(90) int local90 = 0;
				@Pc(94) int local94 = arg1;
				@Pc(96) int[] local96 = local70;
				for (@Pc(98) int local98 = 0; local98 < local63; local98++) {
					for (@Pc(102) int local102 = 0; local102 < local59; local102++) {
						@Pc(109) int local109 = local65[local90++];
						@Pc(114) int local114 = local65[local94++];
						@Pc(119) int local119 = local65[local90++];
						@Pc(124) int local124 = local65[local94++];
						@Pc(130) int local130 = local109 >> 24 & 0xFF;
						@Pc(136) int local136 = local109 >> 16 & 0xFF;
						@Pc(140) int local140 = local109 & 0xFF;
						@Pc(146) int local146 = local109 >> 8 & 0xFF;
						@Pc(152) int local152 = local140 + (local119 & 0xFF);
						@Pc(160) int local160 = local146 + (local119 >> 8 & 0xFF);
						@Pc(168) int local168 = local130 + (local119 >> 24 & 0xFF);
						@Pc(176) int local176 = local136 + (local119 >> 16 & 0xFF);
						@Pc(184) int local184 = local160 + (local114 >> 8 & 0xFF);
						@Pc(192) int local192 = local176 + (local114 >> 16 & 0xFF);
						@Pc(200) int local200 = local168 + (local114 >> 24 & 0xFF);
						@Pc(206) int local206 = local152 + (local114 & 0xFF);
						@Pc(214) int local214 = local184 + (local124 >> 8 & 0xFF);
						@Pc(222) int local222 = local192 + (local124 >> 16 & 0xFF);
						@Pc(230) int local230 = local200 + (local124 >> 24 & 0xFF);
						@Pc(236) int local236 = local206 + (local124 & 0xFF);
						local70[local88++] = (local214 & 0x3FC) << 6 | (local230 & 0x3FC) << 22 | (local222 & 0x3FC) << 14 | local236 >> 2 & 0xFF;
					}
					local94 += arg1;
					local90 += arg1;
				}
				local70 = local65;
				local65 = local96;
				arg1 = local59;
				arg3 = local63;
				local44++;
				local59 >>= 0x1;
				local55 >>= 0x1;
				local63 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "([BIIBILjava/lang/String;)I")
	public static int method1355(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) String arg3) {
		@Pc(10) int local10 = arg1;
		for (@Pc(17) int local17 = 0; local17 < local10; local17++) {
			@Pc(25) char local25 = arg3.charAt(local17);
			if (local25 > '\u0000' && local25 < '\u0080' || !(local25 < ' ' || local25 > 'ÿ')) {
				arg0[arg2 + local17] = (byte) local25;
			} else if (local25 == '€') {
				arg0[arg2 + local17] = -128;
			} else if (local25 == '‚') {
				arg0[local17 + arg2] = -126;
			} else if (local25 == 'ƒ') {
				arg0[arg2 + local17] = -125;
			} else if (local25 == '„') {
				arg0[arg2 + local17] = -124;
			} else if (local25 == '…') {
				arg0[local17 + arg2] = -123;
			} else if (local25 == '†') {
				arg0[local17 + arg2] = -122;
			} else if (local25 == '‡') {
				arg0[local17 + arg2] = -121;
			} else if (local25 == 'ˆ') {
				arg0[arg2 + local17] = -120;
			} else if (local25 == '‰') {
				arg0[arg2 + local17] = -119;
			} else if (local25 == 'Š') {
				arg0[local17 + arg2] = -118;
			} else if (local25 == '‹') {
				arg0[arg2 + local17] = -117;
			} else if (local25 == 'Œ') {
				arg0[local17 + arg2] = -116;
			} else if (local25 == 'Ž') {
				arg0[arg2 + local17] = -114;
			} else if (local25 == '‘') {
				arg0[arg2 + local17] = -111;
			} else if (local25 == '’') {
				arg0[local17 + arg2] = -110;
			} else if (local25 == '“') {
				arg0[arg2 + local17] = -109;
			} else if (local25 == '”') {
				arg0[local17 + arg2] = -108;
			} else if (local25 == '•') {
				arg0[local17 + arg2] = -107;
			} else if (local25 == '–') {
				arg0[arg2 + local17] = -106;
			} else if (local25 == '—') {
				arg0[local17 + arg2] = -105;
			} else if (local25 == '˜') {
				arg0[local17 + arg2] = -104;
			} else if (local25 == '™') {
				arg0[local17 + arg2] = -103;
			} else if (local25 == 'š') {
				arg0[local17 + arg2] = -102;
			} else if (local25 == '›') {
				arg0[local17 + arg2] = -101;
			} else if (local25 == 'œ') {
				arg0[local17 + arg2] = -100;
			} else if (local25 == 'ž') {
				arg0[arg2 + local17] = -98;
			} else if (local25 == 'Ÿ') {
				arg0[local17 + arg2] = -97;
			} else {
				arg0[local17 + arg2] = 63;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIBILclient!er;Lclient!ir;ILclient!lr;)V")
	public static void method1356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class68 arg3, @OriginalArg(5) Class25_Sub5_Sub1_Sub1 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class25_Sub5_Sub1_Sub2 arg6) {
		@Pc(9) Class1_Sub10 local9 = new Class1_Sub10();
		local9.anInt856 = arg2 << 7;
		local9.anInt861 = arg0;
		local9.anInt859 = arg5 << 7;
		if (arg3 != null) {
			local9.aClass68_1 = arg3;
			@Pc(30) int local30 = arg3.anInt1810;
			@Pc(33) int local33 = arg3.anInt1803;
			if (arg1 == 1 || arg1 == 3) {
				local30 = arg3.anInt1803;
				local33 = arg3.anInt1810;
			}
			local9.anInt858 = arg3.anInt1794;
			local9.anInt862 = arg3.anInt1795;
			local9.anInt855 = arg5 + local30 << 7;
			local9.anInt867 = arg2 + local33 << 7;
			local9.anIntArray41 = arg3.anIntArray127;
			local9.anInt857 = arg3.anInt1805 << 7;
			local9.anInt868 = arg3.anInt1807;
			local9.anInt864 = arg3.anInt1801;
			if (arg3.anIntArray125 != null) {
				local9.aBoolean98 = true;
				local9.method834();
			}
			if (local9.anIntArray41 != null) {
				local9.anInt863 = (int) ((double) (local9.anInt868 - local9.anInt862) * Math.random()) + local9.anInt862;
			}
			Static448.aClass227_54.method4972(local9);
		} else if (arg4 != null) {
			local9.aClass25_Sub5_Sub1_Sub1_1 = arg4;
			@Pc(175) Class54 local175 = arg4.aClass54_1;
			if (local175.anIntArray67 != null) {
				local9.aBoolean98 = true;
				local175 = local175.method1148(Static320.aClass249_2);
			}
			if (local175 != null) {
				local9.anInt867 = local175.anInt1348 + arg2 << 7;
				local9.anInt855 = arg5 + local175.anInt1348 << 7;
				local9.anInt864 = Static4.method58(arg4);
				local9.anInt858 = local175.anInt1350;
				local9.anInt857 = local175.lb << 7;
			}
			Static361.aClass227_37.method4972(local9);
		} else if (arg6 != null) {
			local9.aClass25_Sub5_Sub1_Sub2_1 = arg6;
			local9.anInt855 = arg6.method3427() + arg5 << 7;
			local9.anInt867 = arg6.method3427() + arg2 << 7;
			local9.anInt864 = Static332.method4453(arg6);
			local9.anInt858 = arg6.anInt4321;
			local9.anInt857 = arg6.anInt4331 << 7;
			Static38.aClass199_25.method4383((long) arg6.anInt4284, local9);
		}
	}
}
