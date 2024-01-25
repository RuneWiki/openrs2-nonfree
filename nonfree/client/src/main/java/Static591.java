import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static591 {

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray9;

	@OriginalMember(owner = "client!tu", name = "d", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_144 = new Class171(87, -1);

	@OriginalMember(owner = "client!tu", name = "e", descriptor = "Z")
	public static boolean aBoolean662 = false;

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!mfa;B)V")
	public static void method7803(@OriginalArg(0) Class3_Sub5_Sub13 arg0) {
		@Pc(7) boolean local7 = false;
		arg0.method9014();
		for (@Pc(20) Class3_Sub5_Sub13 local20 = (Class3_Sub5_Sub13) Static287.aClass243_9.method5459(); local20 != null; local20 = (Class3_Sub5_Sub13) Static287.aClass243_9.method5453()) {
			if (Static388.method5440(arg0.method5264(), local20.method5264())) {
				Static424.method5839(arg0, local20);
				local7 = true;
				break;
			}
		}
		if (!local7) {
			Static287.aClass243_9.method5457(arg0);
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "([IIIIIIII)V")
	public static void method7804(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (arg4 > 0 && !Static365.method5254(arg4)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static365.method5254(arg2)) {
			@Pc(42) int local42 = 0;
			@Pc(49) int local49 = arg2 > arg4 ? arg4 : arg2;
			@Pc(53) int local53 = arg4 >> 1;
			@Pc(57) int local57 = arg2 >> 1;
			@Pc(59) int[] local59 = arg0;
			@Pc(69) int[] local69 = new int[local57 * local53];
			while (true) {
				OpenGL.glTexImage2Di(arg3, local42, arg1, arg4, arg2, 0, 32993, arg5, local59, 0);
				if (local49 <= 1) {
					return;
				}
				@Pc(88) int local88 = 0;
				@Pc(90) int local90 = 0;
				@Pc(94) int local94 = arg4;
				@Pc(96) int[] local96 = local69;
				for (@Pc(98) int local98 = 0; local98 < local57; local98++) {
					for (@Pc(102) int local102 = 0; local102 < local53; local102++) {
						@Pc(109) int local109 = local59[local90++];
						@Pc(114) int local114 = local59[local94++];
						@Pc(119) int local119 = local59[local90++];
						@Pc(125) int local125 = local109 >> 24 & 0xFF;
						@Pc(131) int local131 = local109 >> 16 & 0xFF;
						@Pc(136) int local136 = local59[local94++];
						@Pc(142) int local142 = local109 >> 8 & 0xFF;
						@Pc(146) int local146 = local109 & 0xFF;
						@Pc(152) int local152 = local146 + (local119 & 0xFF);
						@Pc(160) int local160 = local142 + (local119 >> 8 & 0xFF);
						@Pc(168) int local168 = local131 + (local119 >> 16 & 0xFF);
						@Pc(176) int local176 = local125 + (local119 >> 24 & 0xFF);
						@Pc(182) int local182 = local152 + (local114 & 0xFF);
						@Pc(190) int local190 = local168 + (local114 >> 16 & 0xFF);
						@Pc(198) int local198 = local160 + (local114 >> 8 & 0xFF);
						@Pc(206) int local206 = local176 + (local114 >> 24 & 0xFF);
						@Pc(214) int local214 = local206 + (local136 >> 24 & 0xFF);
						@Pc(222) int local222 = local190 + (local136 >> 16 & 0xFF);
						@Pc(230) int local230 = local198 + (local136 >> 8 & 0xFF);
						@Pc(236) int local236 = local182 + (local136 & 0xFF);
						local69[local88++] = local236 >> 2 & 0xFF | (local230 & 0x3FC) << 6 | (local214 & 0x3FC) << 22 | (local222 & 0x3FC) << 14;
					}
					local94 += arg4;
					local90 += arg4;
				}
				local69 = local59;
				local59 = local96;
				arg2 = local57;
				arg4 = local53;
				local53 >>= 0x1;
				local42++;
				local57 >>= 0x1;
				local49 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
