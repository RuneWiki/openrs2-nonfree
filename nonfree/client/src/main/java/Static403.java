import jaggl.OpenGL;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!qq", name = "v", descriptor = "Lclient!tq;")
	public static Class285 aClass285_12;

	@OriginalMember(owner = "client!qq", name = "w", descriptor = "F")
	public static float aFloat211;

	@OriginalMember(owner = "client!qq", name = "x", descriptor = "F")
	public static float aFloat212;

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_121 = new Class67("Loaded JACLIB", "JACLIB geladen", "JACLIB chargé", "JACLIB carregado");

	@OriginalMember(owner = "client!qq", name = "t", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger6 = new BigInteger("bd6c259a5e2375a02e470ffef01edcdca9086b340dc25c0a09b3d321febb76415778f9013aca03534ee8f12d7916d48786afc58a87eeff3132ce3cd3ff34b431", 16);

	@OriginalMember(owner = "client!qq", name = "u", descriptor = "[I")
	public static final int[] anIntArray652 = new int[25];

	@OriginalMember(owner = "client!qq", name = "y", descriptor = "Lclient!db;")
	public static final Class57 aClass57_12 = new Class57(7, 0, 1, 1);

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Ljava/lang/String;Lclient!ad;BI)Lclient!ni;")
	public static Class206 method6129(@OriginalArg(0) String arg0, @OriginalArg(1) Class5_Sub1 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg2);
		OpenGL.glShaderSourceARB(local6, arg0);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static538.anIntArray771, 0);
		if (Static538.anIntArray771[0] == 0) {
			if (Static538.anIntArray771[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static538.anIntArray771, 1);
			if (Static538.anIntArray771[1] > 1) {
				@Pc(50) byte[] local50 = new byte[Static538.anIntArray771[1]];
				OpenGL.glGetInfoLogARB(local6, Static538.anIntArray771[1], Static538.anIntArray771, 0, local50, 0);
				System.out.println(new String(local50));
			}
			if (Static538.anIntArray771[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class206(arg1, local6, arg2);
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(I)V")
	public static void method6133() {
		for (@Pc(11) int local11 = 0; local11 < 100; local11++) {
			Static125.aBooleanArray12[local11] = true;
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(BLclient!kr;)V")
	public static void method6134(@OriginalArg(1) Class3_Sub27_Sub1 arg0) {
		arg0.method4533();
		@Pc(15) int local15 = Static342.anInt6448;
		@Pc(25) Class6_Sub1_Sub2_Sub1 local25 = Static111.aClass6_Sub1_Sub2_Sub1_3 = Static498.aClass6_Sub1_Sub2_Sub1Array1[local15] = new Class6_Sub1_Sub2_Sub1();
		local25.anInt8587 = local15;
		@Pc(33) int local33 = arg0.method4536(30);
		@Pc(38) byte local38 = (byte) (local33 >> 28);
		@Pc(44) int local44 = local33 >> 14 & 0x3FFF;
		@Pc(48) int local48 = local33 & 0x3FFF;
		local25.anIntArray733[0] = local44 - Static223.anInt4827;
		local25.anInt8811 = (local25.anIntArray733[0] << 9) + (local25.method7083() << 8);
		local25.anIntArray734[0] = local48 - Static150.anInt3027;
		local25.anInt8813 = (local25.anIntArray734[0] << 9) + (local25.method7083() << 8);
		Static420.anInt7829 = local25.aByte100 = local38;
		if (Static485.aClass3_Sub27Array1[local15] != null) {
			local25.method2047(Static485.aClass3_Sub27Array1[local15]);
		}
		Static235.anInt2721 = 0;
		Static130.anIntArray267[Static235.anInt2721++] = local15;
		Static548.aByteArray118[local15] = 0;
		Static451.anInt8227 = 0;
		for (@Pc(124) int local124 = 1; local124 < 2048; local124++) {
			if (local15 != local124) {
				@Pc(138) int local138 = arg0.method4536(18);
				@Pc(142) int local142 = local138 >> 16;
				@Pc(148) int local148 = local138 >> 8 & 0xFF;
				@Pc(152) int local152 = local138 & 0xFF;
				@Pc(160) Class89 local160 = Static462.aClass89Array1[local124] = new Class89();
				local160.anInt2756 = (local148 << 14) + (local142 << 28) + local152;
				local160.anInt2755 = -1;
				local160.anInt2754 = 0;
				local160.aBoolean203 = false;
				Static305.anIntArray535[Static451.anInt8227++] = local124;
				Static548.aByteArray118[local124] = 0;
			}
		}
		arg0.method4535();
	}
}
