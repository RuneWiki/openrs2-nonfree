import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static467 {

	@OriginalMember(owner = "client!rp", name = "X", descriptor = "I")
	public static int anInt8130;

	@OriginalMember(owner = "client!rp", name = "cb", descriptor = "Lclient!k;")
	public static Class168 aClass168_12;

	@OriginalMember(owner = "client!rp", name = "M", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_266 = new Class123(47, 3);

	@OriginalMember(owner = "client!rp", name = "Y", descriptor = "Z")
	public static boolean aBoolean560 = false;

	@OriginalMember(owner = "client!rp", name = "bb", descriptor = "I")
	public static int anInt8132 = 1;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method6392(@OriginalArg(0) String arg0) {
		if (!arg0.equals("")) {
			@Pc(17) Class3_Sub10 local17 = Static129.method2403(Static452.aClass353_2, Static211.aClass287_138);
			local17.aClass3_Sub26_Sub1_1.method6809(Static158.method2898(arg0));
			local17.aClass3_Sub26_Sub1_1.method6772(arg0);
			Static193.method3398(local17);
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method6393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = arg5 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(30) int local30 = local7 * (Static129.aShort36 - Static235.aShort55) / 100 + Static235.aShort55;
		@Pc(36) int local36 = local30 * arg0 >> 8;
		@Pc(43) int local43 = 16384 - arg6 & 0x3FFF;
		@Pc(50) int local50 = 16384 - arg3 & 0x3FFF;
		@Pc(52) int local52 = 0;
		@Pc(54) int local54 = 0;
		@Pc(56) int local56 = local36;
		if (local43 != 0) {
			local54 = Class3_Sub28.anIntArray232[local43] * -local36 >> 14;
			local56 = local36 * Class3_Sub28.anIntArray231[local43] >> 14;
		}
		if (local50 != 0) {
			local52 = local56 * Class3_Sub28.anIntArray232[local50] >> 14;
			local56 = local56 * Class3_Sub28.anIntArray231[local50] >> 14;
		}
		Static335.anInt6057 = arg4 - local54;
		Static407.anInt7345 = arg2 - local52;
		Static568.anInt9808 = arg6;
		Static418.anInt7466 = arg1 - local56;
		Static528.anInt10345 = 0;
		Static421.anInt7497 = arg3;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!er;Z[Lclient!jf;)Lclient!caa;")
	public static Class45 method6394(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(2) Class157[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			if (arg1[local7] == null || arg1[local7].aLong116 <= 0L) {
				return null;
			}
		}
		@Pc(31) long local31 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(33) int local33 = 0; local33 < arg1.length; local33++) {
			OpenGL.glAttachObjectARB(local31, arg1[local33].aLong116);
		}
		OpenGL.glLinkProgramARB(local31);
		OpenGL.glGetObjectParameterivARB(local31, 35714, Static430.anIntArray438, 0);
		if (Static430.anIntArray438[0] == 0) {
			if (Static430.anIntArray438[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local31, 35716, Static430.anIntArray438, 1);
			if (Static430.anIntArray438[1] > 1) {
				@Pc(89) byte[] local89 = new byte[Static430.anIntArray438[1]];
				OpenGL.glGetInfoLogARB(local31, Static430.anIntArray438[1], Static430.anIntArray438, 0, local89, 0);
				System.out.println(new String(local89));
			}
			if (Static430.anIntArray438[0] == 0) {
				for (@Pc(113) int local113 = 0; local113 < arg1.length; local113++) {
					OpenGL.glDetachObjectARB(local31, arg1[local113].aLong116);
				}
				OpenGL.glDeleteObjectARB(local31);
				return null;
			}
		}
		return new Class45(arg0, local31, arg1);
	}
}
