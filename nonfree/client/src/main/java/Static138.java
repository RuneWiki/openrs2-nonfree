import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "Lclient!hd;")
	public static Class131 aClass131_1;

	@OriginalMember(owner = "client!eka", name = "e", descriptor = "[Lclient!vr;")
	public static Class33[] aClass33Array11;

	@OriginalMember(owner = "client!eka", name = "g", descriptor = "Lclient!qk;")
	public static Class289 aClass289_1;

	@OriginalMember(owner = "client!eka", name = "f", descriptor = "I")
	public static int anInt2778 = 500;

	@OriginalMember(owner = "client!eka", name = "i", descriptor = "[C")
	public static final char[] aCharArray2 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(I[BILclient!pa;)Lclient!qea;")
	public static Class281 method2537(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) Class13_Sub1_Sub1 arg2) {
		if (arg1 == null || arg1.length == 0) {
			return null;
		}
		@Pc(18) long local18 = OpenGL.glCreateShaderObjectARB(arg0);
		OpenGL.glShaderSourceRawARB(local18, arg1);
		OpenGL.glCompileShaderARB(local18);
		OpenGL.glGetObjectParameterivARB(local18, 35713, Static74.anIntArray124, 0);
		if (Static74.anIntArray124[0] == 0) {
			if (Static74.anIntArray124[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local18, 35716, Static74.anIntArray124, 1);
			if (Static74.anIntArray124[1] > 1) {
				@Pc(62) byte[] local62 = new byte[Static74.anIntArray124[1]];
				OpenGL.glGetInfoLogARB(local18, Static74.anIntArray124[1], Static74.anIntArray124, 0, local62, 0);
				System.out.println(new String(local62));
			}
			if (Static74.anIntArray124[0] == 0) {
				OpenGL.glDeleteObjectARB(local18);
				return null;
			}
		}
		return new Class281(arg2, local18, arg0);
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(B)V")
	public static void method2538() {
		Static355.anInt5755 = 0;
		@Pc(12) int local12 = Static287.anInt4910 + (Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10729 >> 9);
		@Pc(20) int local20 = (Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10731 >> 9) + Static72.anInt1361;
		if (local12 >= 3053 && local12 <= 3156 && local20 >= 3056 && local20 <= 3136) {
			Static355.anInt5755 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local20 >= 9492 && local20 <= 9535) {
			Static355.anInt5755 = 1;
		}
		if (Static355.anInt5755 == 1 && local12 >= 3139 && local12 <= 3199 && local20 >= 3008 && local20 <= 3062) {
			Static355.anInt5755 = 0;
		}
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(BLclient!gaa;)V")
	public static void method2539(@OriginalArg(1) Class3_Sub25_Sub1 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static185.anInt3761; local3++) {
			@Pc(9) int local9 = Static272.anIntArray429[local3];
			@Pc(13) Class28_Sub1_Sub1_Sub1_Sub1 local13 = Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[local9];
			@Pc(17) int local17 = arg0.method8632();
			if ((local17 & 0x10) != 0) {
				local17 += arg0.method8632() << 8;
			}
			if ((local17 & 0x800) != 0) {
				local17 += arg0.method8632() << 16;
			}
			Static470.method6821(arg0, local9, local13, local17);
		}
	}
}
