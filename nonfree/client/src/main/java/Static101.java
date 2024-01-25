import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!dia", name = "b", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_66 = new Class288(19, 2);

	@OriginalMember(owner = "client!dia", name = "c", descriptor = "I")
	public static int anInt1893 = 0;

	@OriginalMember(owner = "client!dia", name = "f", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_67 = new Class288(65, -1);

	@OriginalMember(owner = "client!dia", name = "g", descriptor = "[I")
	public static final int[] anIntArray134 = new int[4096];

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(Z)Ljava/lang/String;")
	public static String method1536() {
		return Static627.aBoolean736 || Static601.aClass2_Sub2_Sub11_4 == null ? "" : Static601.aClass2_Sub2_Sub11_4.aString44;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(BZLjava/lang/String;)V")
	public static void method1537(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return;
		}
		if (Static124.anInt2182 >= 100) {
			Static3.method8592(Static434.aClass271_39.method5972(Static483.anInt7694));
			return;
		}
		@Pc(28) String local28 = Static60.method906(arg1);
		if (local28 == null) {
			return;
		}
		@Pc(72) String local72;
		for (@Pc(33) int local33 = 0; local33 < Static124.anInt2182; local33++) {
			@Pc(41) String local41 = Static60.method906(Static214.aStringArray14[local33]);
			if (local41 != null && local41.equals(local28)) {
				Static3.method8592(arg1 + Static434.aClass271_40.method5972(Static483.anInt7694));
				return;
			}
			if (Static594.aStringArray45[local33] != null) {
				local72 = Static60.method906(Static594.aStringArray45[local33]);
				if (local72 != null && local72.equals(local28)) {
					Static3.method8592(arg1 + Static434.aClass271_40.method5972(Static483.anInt7694));
					return;
				}
			}
		}
		for (@Pc(103) int local103 = 0; local103 < Static352.anInt5497; local103++) {
			local72 = Static60.method906(Static213.aStringArray13[local103]);
			if (local72 != null && local72.equals(local28)) {
				Static3.method8592(Static434.aClass271_45.method5972(Static483.anInt7694) + arg1 + Static434.aClass271_46.method5972(Static483.anInt7694));
				return;
			}
			if (Static565.aStringArray44[local103] != null) {
				@Pc(147) String local147 = Static60.method906(Static565.aStringArray44[local103]);
				if (local147 != null && local147.equals(local28)) {
					Static3.method8592(Static434.aClass271_45.method5972(Static483.anInt7694) + arg1 + Static434.aClass271_46.method5972(Static483.anInt7694));
					return;
				}
			}
		}
		if (Static60.method906(Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aString50).equals(local28)) {
			Static3.method8592(Static434.aClass271_42.method5972(Static483.anInt7694));
			return;
		}
		@Pc(205) Class2_Sub40 local205 = Static464.method6285(Static251.aClass131_1, Static526.aClass179_110);
		local205.aClass2_Sub22_Sub2_2.method8537(Static154.method2286(arg1) + 1);
		local205.aClass2_Sub22_Sub2_2.method8540(arg1);
		local205.aClass2_Sub22_Sub2_2.method8537(arg0 ? 1 : 0);
		Static528.method7295(local205);
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(II[IIIBII)V")
	public static void method1538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg1 > 0 && !Static485.method6790(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg4 <= 0 || Static485.method6790(arg4)) {
			@Pc(37) int local37 = 0;
			@Pc(44) int local44 = arg4 <= arg1 ? arg4 : arg1;
			@Pc(56) int local56 = arg1 >> 1;
			@Pc(60) int local60 = arg4 >> 1;
			@Pc(62) int[] local62 = arg2;
			@Pc(67) int[] local67 = new int[local56 * local60];
			while (true) {
				OpenGL.glTexImage2Di(arg5, local37, arg3, arg1, arg4, 0, 32993, arg0, local62, 0);
				if (local44 <= 1) {
					return;
				}
				@Pc(85) int local85 = 0;
				@Pc(87) int local87 = 0;
				@Pc(91) int local91 = arg1;
				@Pc(93) int[] local93 = local67;
				for (@Pc(95) int local95 = 0; local95 < local60; local95++) {
					for (@Pc(99) int local99 = 0; local99 < local56; local99++) {
						@Pc(106) int local106 = local62[local87++];
						@Pc(111) int local111 = local62[local87++];
						@Pc(116) int local116 = local62[local91++];
						@Pc(120) int local120 = local106 & 0xFF;
						@Pc(126) int local126 = local106 >> 16 & 0xFF;
						@Pc(132) int local132 = local106 >> 8 & 0xFF;
						@Pc(138) int local138 = local106 >> 24 & 0xFF;
						@Pc(143) int local143 = local62[local91++];
						@Pc(151) int local151 = local138 + (local111 >> 24 & 0xFF);
						@Pc(157) int local157 = local120 + (local111 & 0xFF);
						@Pc(165) int local165 = local126 + (local111 >> 16 & 0xFF);
						@Pc(173) int local173 = local132 + (local111 >> 8 & 0xFF);
						@Pc(179) int local179 = local157 + (local116 & 0xFF);
						@Pc(187) int local187 = local165 + (local116 >> 16 & 0xFF);
						@Pc(195) int local195 = local173 + (local116 >> 8 & 0xFF);
						@Pc(203) int local203 = local151 + (local116 >> 24 & 0xFF);
						@Pc(211) int local211 = local203 + (local143 >> 24 & 0xFF);
						@Pc(219) int local219 = local195 + (local143 >> 8 & 0xFF);
						@Pc(227) int local227 = local187 + (local143 >> 16 & 0xFF);
						@Pc(233) int local233 = local179 + (local143 & 0xFF);
						local67[local85++] = (local227 & 0x3FC) << 14 | (local211 & 0x3FC) << 22 | (local219 & 0x3FC) << 6 | local233 >> 2 & 0xFF;
					}
					local91 += arg1;
					local87 += arg1;
				}
				local67 = local62;
				arg4 = local60;
				local62 = local93;
				arg1 = local56;
				local56 >>= 0x1;
				local60 >>= 0x1;
				local44 >>= 0x1;
				local37++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
