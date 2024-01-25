import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!cb", name = "x", descriptor = "I")
	public static int anInt1314;

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "[I")
	public static final int[] anIntArray82 = new int[8];

	@OriginalMember(owner = "client!cb", name = "t", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_12 = new Class242("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!cb", name = "v", descriptor = "[S")
	public static final short[] aShortArray12 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!cb", name = "w", descriptor = "[S")
	public static short[] aShortArray13 = new short[256];

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZII)V")
	public static void method992(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class4_Sub39 local8 = Static195.method2229(arg1, arg0);
		if (local8 != null) {
			local8.method5854();
		}
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
	public static void method993() {
		if (!Static14.method4215()) {
			return;
		}
		if (Static76.aStringArray10 == null) {
			Static19.method434();
		}
		Static343.aBoolean425 = true;
		Static278.anInt7279 = 0;
		try {
			Static311.aClipboard1 = Static102.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(26) Exception local26) {
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!bv;Ljava/lang/String;II)Lclient!fk;")
	public static Class79 method994(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(11) long local11 = OpenGL.glCreateShaderObjectARB(arg2);
		OpenGL.glShaderSourceARB(local11, arg1);
		OpenGL.glCompileShaderARB(local11);
		OpenGL.glGetObjectParameterivARB(local11, 35713, Static7.anIntArray23, 0);
		if (Static7.anIntArray23[0] == 0) {
			if (Static7.anIntArray23[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local11, 35716, Static7.anIntArray23, 1);
			if (Static7.anIntArray23[1] > 1) {
				@Pc(47) byte[] local47 = new byte[Static7.anIntArray23[1]];
				OpenGL.glGetInfoLogARB(local11, Static7.anIntArray23[1], Static7.anIntArray23, 0, local47, 0);
				System.out.println(new String(local47));
			}
			if (Static7.anIntArray23[0] == 0) {
				OpenGL.glDeleteObjectARB(local11);
				return null;
			}
		}
		return new Class79(arg0, local11, arg2);
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)V")
	public static void method995() {
		if (Static249.anIntArray375 != null && Static100.anIntArray135 != null) {
			return;
		}
		Static100.anIntArray135 = new int[256];
		Static249.anIntArray375 = new int[256];
		for (@Pc(21) int local21 = 0; local21 < 256; local21++) {
			@Pc(30) double local30 = (double) local21 / 255.0D * 6.283185307179586D;
			Static249.anIntArray375[local21] = (int) (Math.sin(local30) * 4096.0D);
			Static100.anIntArray135[local21] = (int) (Math.cos(local30) * 4096.0D);
		}
	}
}
