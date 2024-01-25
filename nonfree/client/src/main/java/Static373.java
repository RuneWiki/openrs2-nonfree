import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!sj", name = "h", descriptor = "[[S")
	public static short[][] aShortArrayArray6;

	@OriginalMember(owner = "client!sj", name = "g", descriptor = "Z")
	public static boolean aBoolean444 = false;

	@OriginalMember(owner = "client!sj", name = "v", descriptor = "[I")
	public static final int[] anIntArray533 = new int[14];

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILjava/lang/String;Lclient!na;B)Lclient!im;")
	public static Class124 method5186(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class75_Sub2 arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg0);
		OpenGL.glShaderSourceARB(local6, arg1);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static42.anIntArray492, 0);
		if (Static42.anIntArray492[0] == 0) {
			if (Static42.anIntArray492[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static42.anIntArray492, 1);
			if (Static42.anIntArray492[1] > 1) {
				@Pc(55) byte[] local55 = new byte[Static42.anIntArray492[1]];
				OpenGL.glGetInfoLogARB(local6, Static42.anIntArray492[1], Static42.anIntArray492, 0, local55, 0);
				System.out.println(new String(local55));
			}
			if (Static42.anIntArray492[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class124(arg2, local6, arg0);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(JZLclient!za;)V")
	public static void method5193(@OriginalArg(0) long arg0, @OriginalArg(2) Class75 arg1) {
		Static358.anInt7402 = 0;
		Static226.anInt3804 = Static313.anInt5629;
		Static313.anInt5629 = 0;
		@Pc(14) long local14 = Static432.method5870();
		for (@Pc(19) Class28_Sub1 local19 = (Class28_Sub1) Static315.aClass97_4.method2145(); local19 != null; local19 = (Class28_Sub1) Static315.aClass97_4.method2148()) {
			if (local19.method530(arg1, arg0)) {
				Static358.anInt7402++;
			}
		}
		if (Static405.aBoolean467 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static315.aClass97_4.method2146() + ", running: " + Static358.anInt7402 + ". Particles: " + Static313.anInt5629 + ". Time taken: " + (Static432.method5870() - local14) + "ms");
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IBII)V")
	public static void method5203(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class2_Sub1_Sub6 local8 = Static267.method3705(arg2, 9);
		local8.method2574();
		local8.anInt3130 = arg1;
		local8.anInt3131 = arg0;
	}
}
