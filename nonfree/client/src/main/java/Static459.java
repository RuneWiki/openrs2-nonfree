import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static459 {

	@OriginalMember(owner = "client!rr", name = "C", descriptor = "Lclient!bs;")
	public static Class38 aClass38_2;

	@OriginalMember(owner = "client!rr", name = "w", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_242 = new Class235(80, 4);

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!rga;IIIII)V")
	public static void method6334(@OriginalArg(0) Class8_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static175.anInt9133) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static27.anInt373) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static507.anInt8645 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class39 local62 = Static292.aClass39ArrayArrayArray2[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static199.aClass47Array1[local17].method7545(local23, local32) + Static199.aClass47Array1[local17].method7545(local23 + 1, local32) + Static199.aClass47Array1[local17].method7545(local23, local32 + 1) + Static199.aClass47Array1[local17].method7545(local23 + 1, local32 + 1)) / 4 - (Static199.aClass47Array1[arg1].method7545(arg2, arg3) + Static199.aClass47Array1[arg1].method7545(arg2 + 1, arg3) + Static199.aClass47Array1[arg1].method7545(arg2, arg3 + 1) + Static199.aClass47Array1[arg1].method7545(arg2 + 1, arg3 + 1)) / 4;
									@Pc(151) Class8_Sub3_Sub4 local151 = local62.aClass8_Sub3_Sub4_1;
									@Pc(154) Class8_Sub3_Sub4 local154 = local62.aClass8_Sub3_Sub4_2;
									if (local151 != null && local151.method7629()) {
										arg0.method7623(local148, local1, Static402.aClass134_11, local151, (local23 - arg2) * Static379.anInt6307 + (1 - arg4) * Static142.anInt2687, (local32 - arg3) * Static379.anInt6307 + (1 - arg5) * Static142.anInt2687);
									}
									if (local154 != null && local154.method7629()) {
										arg0.method7623(local148, local1, Static402.aClass134_11, local154, (local23 - arg2) * Static379.anInt6307 + (1 - arg4) * Static142.anInt2687, (local32 - arg3) * Static379.anInt6307 + (1 - arg5) * Static142.anInt2687);
									}
									for (@Pc(227) Class111 local227 = local62.aClass111_1; local227 != null; local227 = local227.aClass111_2) {
										@Pc(231) Class8_Sub3_Sub3 local231 = local227.aClass8_Sub3_Sub3_1;
										if (local231 != null && local231.method7629() && (local23 == local231.aShort132 || local23 == local3) && (local32 == local231.aShort131 || local32 == local11)) {
											@Pc(260) int local260 = local231.aShort133 + 1 - local231.aShort132;
											@Pc(268) int local268 = local231.aShort130 + 1 - local231.aShort131;
											arg0.method7623(local148, local1, Static402.aClass134_11, local231, (local231.aShort132 - arg2) * Static379.anInt6307 + (local260 - arg4) * Static142.anInt2687, (local231.aShort131 - arg3) * Static379.anInt6307 + (local268 - arg5) * Static142.anInt2687);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)Z")
	public static boolean method6335() {
		return Static216.anInt4135 >= 1;
	}

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "(I)V")
	public static void method6336() {
		for (@Pc(10) Class1_Sub38 local10 = (Class1_Sub38) Static356.aClass353_43.method7677(); local10 != null; local10 = (Class1_Sub38) Static356.aClass353_43.method7687()) {
			if (local10.aBoolean483) {
				local10.method4951();
			}
		}
		for (@Pc(34) Class1_Sub38 local34 = (Class1_Sub38) Static413.aClass353_56.method7677(); local34 != null; local34 = (Class1_Sub38) Static413.aClass353_56.method7687()) {
			if (local34.aBoolean483) {
				local34.method4951();
			}
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(III[IIIII)V")
	public static void method6337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg1 > 0 && !Static230.method3483(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static230.method3483(arg2)) {
			@Pc(42) int local42 = 0;
			@Pc(54) int local54 = arg1 >= arg2 ? arg2 : arg1;
			@Pc(58) int local58 = arg1 >> 1;
			@Pc(62) int local62 = arg2 >> 1;
			@Pc(64) int[] local64 = arg3;
			@Pc(69) int[] local69 = new int[local58 * local62];
			while (true) {
				OpenGL.glTexImage2Di(arg4, local42, arg0, arg1, arg2, 0, 32993, arg5, local64, 0);
				if (local54 <= 1) {
					return;
				}
				@Pc(87) int local87 = 0;
				@Pc(89) int local89 = 0;
				@Pc(94) int local94 = arg1;
				@Pc(96) int[] local96 = local69;
				for (@Pc(98) int local98 = 0; local98 < local62; local98++) {
					for (@Pc(102) int local102 = 0; local102 < local58; local102++) {
						@Pc(109) int local109 = local64[local89++];
						@Pc(114) int local114 = local64[local94++];
						@Pc(119) int local119 = local64[local89++];
						@Pc(123) int local123 = local109 & 0xFF;
						@Pc(128) int local128 = local64[local94++];
						@Pc(134) int local134 = local109 >> 24 & 0xFF;
						@Pc(140) int local140 = local109 >> 16 & 0xFF;
						@Pc(146) int local146 = local109 >> 8 & 0xFF;
						@Pc(152) int local152 = local123 + (local119 & 0xFF);
						@Pc(160) int local160 = local134 + (local119 >> 24 & 0xFF);
						@Pc(168) int local168 = local140 + (local119 >> 16 & 0xFF);
						@Pc(176) int local176 = local146 + (local119 >> 8 & 0xFF);
						@Pc(182) int local182 = local152 + (local114 & 0xFF);
						@Pc(190) int local190 = local160 + (local114 >> 24 & 0xFF);
						@Pc(198) int local198 = local176 + (local114 >> 8 & 0xFF);
						@Pc(206) int local206 = local168 + (local114 >> 16 & 0xFF);
						@Pc(214) int local214 = local198 + (local128 >> 8 & 0xFF);
						@Pc(220) int local220 = local182 + (local128 & 0xFF);
						@Pc(228) int local228 = local190 + (local128 >> 24 & 0xFF);
						@Pc(236) int local236 = local206 + (local128 >> 16 & 0xFF);
						local69[local87++] = local220 >> 2 & 0xFF | (local228 & 0x3FC) << 22 | (local236 & 0x3FC) << 14 | (local214 & 0x3FC) << 6;
					}
					local89 += arg1;
					local94 += arg1;
				}
				local69 = local64;
				local64 = local96;
				arg1 = local58;
				arg2 = local62;
				local54 >>= 0x1;
				local42++;
				local58 >>= 0x1;
				local62 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
