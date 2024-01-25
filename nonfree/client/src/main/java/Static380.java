import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!th", name = "f", descriptor = "Lclient!tf;")
	public static Class231 aClass231_2;

	@OriginalMember(owner = "client!th", name = "h", descriptor = "[J")
	public static long[] aLongArray7;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(II[IIIIII)V")
	public static void method5652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(7) int arg5) {
		if (arg3 > 0 && !Static99.method4914(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg4 <= 0 || Static99.method4914(arg4)) {
			@Pc(40) int local40 = 0;
			@Pc(51) int local51 = arg4 > arg3 ? arg3 : arg4;
			@Pc(59) int local59 = arg3 >> 1;
			@Pc(63) int local63 = arg4 >> 1;
			@Pc(65) int[] local65 = arg2;
			@Pc(70) int[] local70 = new int[local63 * local59];
			while (true) {
				OpenGL.glTexImage2Di(arg5, local40, arg1, arg3, arg4, 0, 32993, arg0, local65, 0);
				if (local51 <= 1) {
					return;
				}
				@Pc(87) int local87 = 0;
				@Pc(89) int local89 = 0;
				@Pc(93) int local93 = arg3;
				@Pc(95) int[] local95 = local70;
				for (@Pc(97) int local97 = 0; local97 < local63; local97++) {
					for (@Pc(101) int local101 = 0; local101 < local59; local101++) {
						@Pc(108) int local108 = local65[local89++];
						@Pc(113) int local113 = local65[local89++];
						@Pc(118) int local118 = local65[local93++];
						@Pc(122) int local122 = local108 & 0xFF;
						@Pc(128) int local128 = local108 >> 8 & 0xFF;
						@Pc(134) int local134 = local108 >> 24 & 0xFF;
						@Pc(139) int local139 = local65[local93++];
						@Pc(145) int local145 = local108 >> 16 & 0xFF;
						@Pc(151) int local151 = local122 + (local113 & 0xFF);
						@Pc(159) int local159 = local145 + (local113 >> 16 & 0xFF);
						@Pc(167) int local167 = local128 + (local113 >> 8 & 0xFF);
						@Pc(175) int local175 = local134 + (local113 >> 24 & 0xFF);
						@Pc(183) int local183 = local175 + (local118 >> 24 & 0xFF);
						@Pc(191) int local191 = local167 + (local118 >> 8 & 0xFF);
						@Pc(197) int local197 = local151 + (local118 & 0xFF);
						@Pc(205) int local205 = local159 + (local118 >> 16 & 0xFF);
						@Pc(211) int local211 = local197 + (local139 & 0xFF);
						@Pc(219) int local219 = local191 + (local139 >> 8 & 0xFF);
						@Pc(227) int local227 = local205 + (local139 >> 16 & 0xFF);
						@Pc(235) int local235 = local183 + (local139 >> 24 & 0xFF);
						local70[local87++] = (local219 & 0x3FC) << 6 | (local227 & 0x3FC) << 14 | (local235 & 0x3FC) << 22 | local211 >> 2 & 0xFF;
					}
					local93 += arg3;
					local89 += arg3;
				}
				local70 = local65;
				local65 = local95;
				arg3 = local59;
				arg4 = local63;
				local40++;
				local51 >>= 0x1;
				local63 >>= 0x1;
				local59 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!md;II)Z")
	public static boolean method5653(@OriginalArg(0) Class6_Sub1_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0.method3803(2);
		@Pc(28) int local28;
		@Pc(33) int local33;
		@Pc(103) int local103;
		@Pc(107) int local107;
		@Pc(113) int local113;
		if (local8 == 0) {
			if (arg0.method3803(1) != 0) {
				method5653(arg0, arg1);
			}
			local28 = arg0.method3803(6);
			local33 = arg0.method3803(6);
			@Pc(45) boolean local45 = arg0.method3803(1) == 1;
			if (local45) {
				Static71.anIntArray110[Static438.anInt7768++] = arg1;
			}
			if (Static374.aClass3_Sub2_Sub1_Sub2Array1[arg1] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(68) Class216 local68 = Static373.aClass216Array1[arg1];
			@Pc(76) Class3_Sub2_Sub1_Sub2 local76 = Static374.aClass3_Sub2_Sub1_Sub2Array1[arg1] = new Class3_Sub2_Sub1_Sub2();
			local76.anInt6602 = arg1;
			if (Static184.aClass6_Sub1Array1[arg1] != null) {
				local76.method5531(Static184.aClass6_Sub1Array1[arg1]);
			}
			local76.method5517(local68.anInt6269);
			local76.anInt6569 = local68.anInt6266;
			local103 = local68.anInt6270;
			local107 = local103 >> 28;
			local113 = local103 >> 14 & 0xFF;
			local76.aBoolean422 = local68.aBoolean400;
			@Pc(121) int local121 = local103 & 0xFF;
			local76.aByteArray85[0] = Static340.aByteArray74[arg1];
			local76.aByte103 = (byte) local107;
			local76.method5537(local28 + (local113 << 6) - Static2.anInt6396, -Static348.anInt6273 + (local121 << 6) + local33);
			local76.aBoolean423 = false;
			Static373.aClass216Array1[arg1] = null;
			return true;
		} else if (local8 == 1) {
			local28 = arg0.method3803(2);
			local33 = Static373.aClass216Array1[arg1].anInt6270;
			Static373.aClass216Array1[arg1].anInt6270 = ((local28 + (local33 >> 28) & 0x3) << 28) + (local33 & 0xFFFFFFF);
			return false;
		} else {
			@Pc(208) int local208;
			@Pc(213) int local213;
			@Pc(222) int local222;
			if (local8 != 2) {
				local28 = arg0.method3803(18);
				local33 = local28 >> 16;
				local208 = local28 >> 8 & 0xFF;
				local213 = local28 & 0xFF;
				local222 = Static373.aClass216Array1[arg1].anInt6270;
				local103 = local33 + (local222 >> 28) & 0x3;
				local107 = local208 + (local222 >> 14) & 0xFF;
				local113 = local222 + local213 & 0xFF;
				Static373.aClass216Array1[arg1].anInt6270 = (local103 << 28) + ((local107 << 14) + local113);
				return false;
			}
			local28 = arg0.method3803(5);
			local33 = local28 >> 3;
			local208 = local28 & 0x7;
			local213 = Static373.aClass216Array1[arg1].anInt6270;
			local222 = (local213 >> 28) + local33 & 0x3;
			local103 = local213 >> 14 & 0xFF;
			local107 = local213 & 0xFF;
			if (local208 == 0) {
				local103--;
				local107--;
			}
			if (local208 == 1) {
				local107--;
			}
			if (local208 == 2) {
				local107--;
				local103++;
			}
			if (local208 == 3) {
				local103--;
			}
			if (local208 == 4) {
				local103++;
			}
			if (local208 == 5) {
				local103--;
				local107++;
			}
			if (local208 == 6) {
				local107++;
			}
			if (local208 == 7) {
				local107++;
				local103++;
			}
			Static373.aClass216Array1[arg1].anInt6270 = (local103 << 14) + ((local222 << 28) + local107);
			return false;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(B)[Lclient!ph;")
	public static Class193[] method5654() {
		return new Class193[] { Static136.aClass193_3, Static427.aClass193_7, Static107.aClass193_2, Static168.aClass193_4, Static388.aClass193_6, Static78.aClass193_1 };
	}
}
