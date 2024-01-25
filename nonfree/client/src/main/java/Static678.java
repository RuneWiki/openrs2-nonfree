import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static678 {

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "Lclient!iha;")
	public static Class165 aClass165_1;

	@OriginalMember(owner = "client!wv", name = "g", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_226 = new Class151(91, 9);

	@OriginalMember(owner = "client!wv", name = "h", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_158 = new Class216(70, 2);

	@OriginalMember(owner = "client!wv", name = "i", descriptor = "I")
	public static int anInt10617 = -1;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method8981(@OriginalArg(1) Class33 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static423.aBoolean517) {
			local7 = Static383.method8455();
			local9 = Static286.method4120();
		}
		Static53.method1251(Static506.anInt7915, Static342.anInt8649, arg0, Static357.anInt5417 + local7, local9 + Static430.anInt6771);
		Static344.aClass56_10.method8052(local7 + Static357.anInt5417 + 3, Static279.aClass179_24.method4066(Static164.anInt2984), local9 + Static430.anInt6771 + 14, -10660793, -1);
		@Pc(65) int local65 = local7 + Static373.aClass161_1.method5903();
		@Pc(72) int local72 = Static373.aClass161_1.method5898() + local9;
		@Pc(76) int local76;
		@Pc(93) int local93;
		if (Static19.aBoolean35) {
			local76 = 0;
			for (@Pc(81) Class4_Sub5_Sub12 local81 = (Class4_Sub5_Sub12) Static256.aClass367_3.method8308(); local81 != null; local81 = (Class4_Sub5_Sub12) Static256.aClass367_3.method8309()) {
				local93 = local9 + Static430.anInt6771 + local76 * 16 + 31;
				local76++;
				if (local81.anInt4687 == 1) {
					Static239.method3539(local65, Static430.anInt6771 + local9, local72, arg0, -1, Static342.anInt8649, (Class4_Sub5_Sub17) local81.aClass367_5.aClass4_Sub5_58.aClass4_Sub5_67, Static506.anInt7915, local93, Static357.anInt5417 + local7, -256);
				} else {
					Static219.method3256(arg0, Static506.anInt7915, local93, Static430.anInt6771 + local9, local65, -256, local81, local72, local7 + Static357.anInt5417, Static342.anInt8649, -1);
				}
			}
			if (Static581.aClass4_Sub5_Sub12_1 != null) {
				Static53.method1251(Static4.anInt76, Static485.anInt7635, arg0, Static398.anInt5803, Static587.anInt9057);
				local76 = 0;
				Static344.aClass56_10.method8052(Static398.anInt5803 + 3, Static581.aClass4_Sub5_Sub12_1.aString45, Static587.anInt9057 + 14, -10660793, -1);
				for (@Pc(181) Class4_Sub5_Sub17 local181 = (Class4_Sub5_Sub17) Static581.aClass4_Sub5_Sub12_1.aClass367_5.method8308(); local181 != null; local181 = (Class4_Sub5_Sub17) Static581.aClass4_Sub5_Sub12_1.aClass367_5.method8309()) {
					@Pc(191) int local191 = local76 * 16 + Static587.anInt9057 + 31;
					local76++;
					Static239.method3539(local65, Static587.anInt9057, local72, arg0, -1, Static485.anInt7635, local181, Static4.anInt76, local191, Static398.anInt5803, -256);
				}
				Static39.method4896(Static398.anInt5803, Static4.anInt76, Static587.anInt9057, Static485.anInt7635);
			}
		} else {
			local76 = 0;
			for (@Pc(228) Class4_Sub5_Sub17 local228 = (Class4_Sub5_Sub17) Static87.aClass163_14.method3639(); local228 != null; local228 = (Class4_Sub5_Sub17) Static87.aClass163_14.method3640()) {
				local93 = (Static574.anInt8895 - local76 - 1) * 16 + local9 + Static430.anInt6771 + 31;
				Static239.method3539(local65, Static430.anInt6771 + local9, local72, arg0, -1, Static342.anInt8649, local228, Static506.anInt7915, local93, Static357.anInt5417 + local7, -256);
				local76++;
			}
		}
		Static39.method4896(Static357.anInt5417 + local7, Static506.anInt7915, Static430.anInt6771 + local9, Static342.anInt8649);
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(BII)Z")
	public static boolean method8983(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static654.method8725(arg1, arg0) & (Static564.method7467(arg1, arg0) | (arg1 & 0x2000) != 0 | Static188.method2954(arg1, arg0));
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method8984(@OriginalArg(1) String arg0) {
		return Static221.method3263(arg0, jh.class);
	}
}
