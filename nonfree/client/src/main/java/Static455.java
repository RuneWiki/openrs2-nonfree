import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static455 {

	@OriginalMember(owner = "client!wv", name = "v", descriptor = "J")
	public static long aLong235;

	@OriginalMember(owner = "client!wv", name = "h", descriptor = "[I")
	public static final int[] anIntArray535 = new int[8];

	@OriginalMember(owner = "client!wv", name = "p", descriptor = "[C")
	public static final char[] aCharArray9 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!wv", name = "w", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_116 = new Class217(30, 3);

	@OriginalMember(owner = "client!wv", name = "x", descriptor = "I")
	public static int anInt7678 = -1;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lclient!qa;I)V")
	public static void method5991(@OriginalArg(0) Class172 arg0) {
		if (Static265.aClass243_31.method5201() == 0) {
			return;
		}
		@Pc(24) Class3_Sub11 local24;
		if (Static105.anInt2382 == 0) {
			for (local24 = (Class3_Sub11) Static265.aClass243_31.method5208(); local24 != null; local24 = (Class3_Sub11) Static265.aClass243_31.method5203()) {
				Static314.aClass12_2.method335(false, false, local24.aBoolean166 ? Static379.aClass7_Sub2_Sub3_Sub2_2.aClass206_1 : null, local24.anInt2090, local24.anInt2096, local24.anInt2094, local24.anInt2093, arg0, local24.anInt2091, arg0, Static271.aClass59_2);
				local24.method5977();
			}
			Static36.method725();
			return;
		}
		if (Static408.aClass172_10 == null) {
			@Pc(73) Canvas local73 = new Canvas();
			local73.setSize(36, 32);
			Static408.aClass172_10 = Static318.method5506(0, 0, Static180.anInterface5_4, Static66.aClass143_2, local73);
			Static152.aClass59_1 = Static408.aClass172_10.method5545(Static388.method5044(Static56.aClass32_26, Static367.anInt6181), Static464.method5837(Static405.aClass32_82, Static367.anInt6181));
		}
		for (local24 = (Class3_Sub11) Static265.aClass243_31.method5208(); local24 != null; local24 = (Class3_Sub11) Static265.aClass243_31.method5203()) {
			Static314.aClass12_2.method335(false, false, local24.aBoolean166 ? Static379.aClass7_Sub2_Sub3_Sub2_2.aClass206_1 : null, local24.anInt2090, local24.anInt2096, local24.anInt2094, local24.anInt2093, arg0, local24.anInt2091, Static408.aClass172_10, Static152.aClass59_1);
			local24.method5977();
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(ILclient!gm;Lclient!qa;III)V")
	public static void method5992(@OriginalArg(0) int arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(2) Class172 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) Class236 local11 = Static326.aClass164_3.method3868(arg1.anInt2764);
		if (local11.anInt6427 == -1) {
			return;
		}
		if (arg1.aBoolean248) {
			@Pc(29) int local29 = arg4 + arg1.anInt2766;
			arg4 = local29 & 0x3;
		} else {
			arg4 = 0;
		}
		@Pc(44) Class8 local44 = local11.method5001(arg1.aBoolean249, arg4, arg2);
		if (local44 == null) {
			return;
		}
		@Pc(50) int local50 = arg1.anInt2762;
		@Pc(53) int local53 = arg1.anInt2782;
		if ((arg4 & 0x1) == 1) {
			local50 = arg1.anInt2782;
			local53 = arg1.anInt2762;
		}
		@Pc(67) int local67 = local44.ja();
		@Pc(70) int local70 = local44.JA();
		if (local11.aBoolean553) {
			local67 = local50 * 4;
			local70 = local53 * 4;
		}
		if (local11.anInt6426 == 0) {
			local44.method5999(arg3, arg0 + 4 - local53 * 4, local67, local70);
		} else {
			local44.M(arg3, arg0 - (local53 - 1) * 4, local67, local70, 0, local11.anInt6426 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIILclient!rl;Lclient!rl;)V")
	public static void method5994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class7_Sub3 arg3, @OriginalArg(4) Class7_Sub3 arg4) {
		@Pc(4) Class118 local4 = Static450.method5835(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass7_Sub3_3 = arg3;
			local4.aClass7_Sub3_2 = arg4;
		}
	}
}
