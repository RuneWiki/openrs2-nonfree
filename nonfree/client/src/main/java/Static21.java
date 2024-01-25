import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!aka", name = "j", descriptor = "[I")
	public static int[] anIntArray24;

	@OriginalMember(owner = "client!aka", name = "r", descriptor = "I")
	public static int anInt322 = 0;

	@OriginalMember(owner = "client!aka", name = "n", descriptor = "[I")
	public static int[] anIntArray25 = new int[1];

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(IBIIII[B)V")
	public static void method315(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5) {
		if (arg2 > 0 && !Static45.method8836(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg4 <= 0 || Static45.method8836(arg4)) {
			@Pc(48) int local48 = Static331.method5045(arg0);
			@Pc(50) int local50 = 0;
			@Pc(58) int local58 = arg2 < arg4 ? arg2 : arg4;
			@Pc(62) int local62 = arg2 >> 1;
			@Pc(66) int local66 = arg4 >> 1;
			@Pc(68) byte[] local68 = arg5;
			@Pc(75) byte[] local75 = new byte[local66 * local62 * local48];
			while (true) {
				OpenGL.glTexImage2Dub(arg3, local50, arg1, arg2, arg4, 0, arg0, 5121, local68, 0);
				if (local58 <= 1) {
					return;
				}
				@Pc(95) int local95 = local48 * arg2;
				for (@Pc(97) int local97 = 0; local97 < local48; local97++) {
					@Pc(103) int local103 = local97;
					@Pc(105) int local105 = local97;
					@Pc(109) int local109 = local97 + local95;
					for (@Pc(111) int local111 = 0; local111 < local66; local111++) {
						for (@Pc(115) int local115 = 0; local115 < local62; local115++) {
							@Pc(123) byte local123 = local68[local105];
							local105 += local48;
							@Pc(133) int local133 = local123 + local68[local105];
							@Pc(139) int local139 = local133 + local68[local109];
							local105 += local48;
							local109 += local48;
							@Pc(153) int local153 = local139 + local68[local109];
							local75[local103] = (byte) (local153 >> 2);
							local109 += local48;
							local103 += local48;
						}
						local109 += local95;
						local105 += local95;
					}
				}
				@Pc(206) byte[] local206 = local75;
				local75 = local68;
				arg2 = local62;
				arg4 = local66;
				local68 = local206;
				local50++;
				local62 >>= 0x1;
				local58 >>= 0x1;
				local66 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(IB)V")
	public static void method316(@OriginalArg(0) int arg0) {
		if (arg0 == Static107.anInt1746) {
			return;
		}
		if (arg0 == 13) {
			Static108.method1563();
		}
		if (arg0 != 13 && Static501.aClass295_2 != null) {
			Static501.aClass295_2.method7023();
			Static501.aClass295_2 = null;
		}
		if (arg0 == 3) {
			Static546.method8412(Static390.anInt6669 != Static259.anInt4502);
		}
		if (arg0 == 7) {
			Static210.method7462(Static390.anInt6669 != Static164.anInt2526);
		}
		if (arg0 == 5 || arg0 == 12) {
			Static312.method4750();
		} else if (arg0 == 6 || arg0 == 9) {
			Static108.method1563();
		}
		if (Static103.method1468(Static107.anInt1746)) {
			Static449.aClass208_104.anInt5851 = 2;
			Static43.aClass208_9.anInt5851 = 2;
			Static404.aClass208_93.anInt5851 = 2;
			Static292.aClass208_65.anInt5851 = 2;
			Static348.aClass208_79.anInt5851 = 2;
			Static264.aClass208_59.anInt5851 = 2;
			Static289.aClass208_148.anInt5851 = 2;
		}
		if (Static103.method1468(arg0)) {
			Static148.anInt2388 = 0;
			Static380.anInt6506 = 1;
			Static220.anInt3575 = 1;
			Static73.anInt1183 = 0;
			Static68.anInt1101 = 0;
			Static511.method6253(true);
			Static449.aClass208_104.anInt5851 = 1;
			Static43.aClass208_9.anInt5851 = 1;
			Static404.aClass208_93.anInt5851 = 1;
			Static292.aClass208_65.anInt5851 = 1;
			Static348.aClass208_79.anInt5851 = 1;
			Static264.aClass208_59.anInt5851 = 1;
			Static289.aClass208_148.anInt5851 = 1;
		}
		if (arg0 == 11 || arg0 == 3) {
			Static195.method2804();
		}
		@Pc(213) boolean local213 = arg0 == 2 || Static165.method2306(arg0) || Static416.method8829(arg0);
		@Pc(235) boolean local235 = Static107.anInt1746 == 2 || Static165.method2306(Static107.anInt1746) || Static416.method8829(Static107.anInt1746);
		if (local235 != local213) {
			if (local213) {
				Static252.anInt4340 = Static430.anInt6325;
				if (Static637.aClass5_Sub20_31.aClass24_Sub12_2.method3413() == 0) {
					Static408.method6017();
				} else {
					Static152.method2123(Static430.anInt6325, Static637.aClass5_Sub20_31.aClass24_Sub12_2.method3413(), Static229.aClass208_57);
					Static664.method9163();
				}
				Static410.aClass65_1.method1133(false);
			} else {
				Static408.method6017();
				Static410.aClass65_1.method1133(true);
			}
		}
		if (Static103.method1468(arg0) || arg0 == 13) {
			Static457.aClass57_11.method7718();
		}
		Static107.anInt1746 = arg0;
	}
}
