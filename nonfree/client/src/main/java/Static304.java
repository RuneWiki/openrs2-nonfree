import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!mo", name = "x", descriptor = "I")
	public static int anInt5564;

	@OriginalMember(owner = "client!mo", name = "z", descriptor = "Z")
	public static boolean aBoolean414;

	@OriginalMember(owner = "client!mo", name = "y", descriptor = "[I")
	public static final int[] anIntArray477 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!mo", name = "E", descriptor = "[I")
	public static final int[] anIntArray478 = new int[1000];

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIIIIII[I)V")
	public static void method4760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(7) int[] arg5) {
		if (arg2 > 0 && !Static150.method2607(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static150.method2607(arg3)) {
			@Pc(52) int local52 = 0;
			@Pc(63) int local63 = arg2 >= arg3 ? arg3 : arg2;
			@Pc(67) int local67 = arg2 >> 1;
			@Pc(71) int local71 = arg3 >> 1;
			@Pc(73) int[] local73 = arg5;
			@Pc(78) int[] local78 = new int[local71 * local67];
			while (true) {
				OpenGL.glTexImage2Di(arg1, local52, arg0, arg2, arg3, 0, 32993, arg4, local73, 0);
				if (local63 <= 1) {
					return;
				}
				@Pc(94) int local94 = 0;
				@Pc(96) int local96 = 0;
				@Pc(100) int local100 = arg2;
				@Pc(102) int[] local102 = local78;
				for (@Pc(104) int local104 = 0; local104 < local71; local104++) {
					for (@Pc(108) int local108 = 0; local108 < local67; local108++) {
						@Pc(115) int local115 = local73[local96++];
						@Pc(120) int local120 = local73[local96++];
						@Pc(125) int local125 = local73[local100++];
						@Pc(131) int local131 = local115 >> 16 & 0xFF;
						@Pc(136) int local136 = local73[local100++];
						@Pc(142) int local142 = local115 >> 8 & 0xFF;
						@Pc(148) int local148 = local115 >> 24 & 0xFF;
						@Pc(152) int local152 = local115 & 0xFF;
						@Pc(160) int local160 = local131 + (local120 >> 16 & 0xFF);
						@Pc(166) int local166 = local152 + (local120 & 0xFF);
						@Pc(174) int local174 = local142 + (local120 >> 8 & 0xFF);
						@Pc(182) int local182 = local148 + (local120 >> 24 & 0xFF);
						@Pc(188) int local188 = local166 + (local125 & 0xFF);
						@Pc(196) int local196 = local160 + (local125 >> 16 & 0xFF);
						@Pc(204) int local204 = local174 + (local125 >> 8 & 0xFF);
						@Pc(212) int local212 = local182 + (local125 >> 24 & 0xFF);
						@Pc(220) int local220 = local212 + (local136 >> 24 & 0xFF);
						@Pc(228) int local228 = local196 + (local136 >> 16 & 0xFF);
						@Pc(234) int local234 = local188 + (local136 & 0xFF);
						@Pc(242) int local242 = local204 + (local136 >> 8 & 0xFF);
						local78[local94++] = (local220 & 0x3FC) << 22 | (local228 & 0x3FC) << 14 | (local242 & 0x3FC) << 6 | local234 >> 2 & 0xFF;
					}
					local100 += arg2;
					local96 += arg2;
				}
				local78 = local73;
				arg2 = local67;
				arg3 = local71;
				local73 = local102;
				local71 >>= 0x1;
				local63 >>= 0x1;
				local67 >>= 0x1;
				local52++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(II)V")
	public static void method4763(@OriginalArg(1) int arg0) {
		Static451.method6879();
		@Pc(13) int local13 = Static266.aClass230_1.method6002(arg0).anInt1478;
		if (local13 == 0) {
			return;
		}
		@Pc(24) int local24 = Static84.aClass302_1.anIntArray692[arg0];
		if (local13 == 5) {
			Static539.anInt9337 = local24;
		}
		if (local13 == 6) {
			Static418.anInt7795 = local24;
		}
	}
}
