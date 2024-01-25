import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static556 {

	@OriginalMember(owner = "client!ve", name = "k", descriptor = "F")
	public static float aFloat222;

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
	public static int anInt8901 = 0;

	@OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
	public static int anInt8908 = 0;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!us;Ljava/lang/String;I)Lclient!jfa;")
	public static Class165 method7402(@OriginalArg(0) int arg0, @OriginalArg(1) Class43_Sub3 arg1, @OriginalArg(2) String arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg0);
		OpenGL.glShaderSourceARB(local6, arg2);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static381.anIntArray531, 0);
		if (Static381.anIntArray531[0] == 0) {
			if (Static381.anIntArray531[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static381.anIntArray531, 1);
			if (Static381.anIntArray531[1] > 1) {
				@Pc(50) byte[] local50 = new byte[Static381.anIntArray531[1]];
				OpenGL.glGetInfoLogARB(local6, Static381.anIntArray531[1], Static381.anIntArray531, 0, local50, 0);
				System.out.println(new String(local50));
			}
			if (Static381.anIntArray531[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class165(arg1, local6, arg0);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!qh;)V")
	public static void method7405(@OriginalArg(1) Class3_Sub11 arg0) {
		@Pc(9) int local9 = arg0.method3138();
		Static564.aClass171Array1 = new Class171[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static564.aClass171Array1[local14] = new Class171();
			Static564.aClass171Array1[local14].anInt4927 = arg0.method3138();
			Static564.aClass171Array1[local14].aString64 = arg0.method3125();
		}
		Static532.anInt8384 = arg0.method3138();
		Static278.anInt5102 = arg0.method3138();
		Static588.anInt2860 = arg0.method3138();
		Static72.aClass133_Sub1Array1 = new Class133_Sub1[Static278.anInt5102 + 1 - Static532.anInt8384];
		for (@Pc(75) int local75 = 0; local75 < Static588.anInt2860; local75++) {
			@Pc(83) int local83 = arg0.method3138();
			@Pc(91) Class133_Sub1 local91 = Static72.aClass133_Sub1Array1[local83] = new Class133_Sub1();
			local91.anInt4096 = arg0.method3118();
			local91.anInt4097 = arg0.method3116();
			local91.anInt4101 = local83 + Static532.anInt8384;
			local91.aString49 = arg0.method3125();
			local91.aString50 = arg0.method3125();
		}
		Static449.anInt7388 = arg0.method3116();
		Static559.aBoolean700 = true;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)V")
	public static void method7408() throws IOException {
		if (Static78.aClass152_2 == null || Static474.anInt7707 <= 0) {
			return;
		}
		@Pc(18) int local18 = 0;
		while (true) {
			@Pc(23) Class3_Sub34 local23 = (Class3_Sub34) Static409.aClass130_38.method3543();
			if (local23 == null) {
				Static218.anInt4297 = 0;
				Static379.anInt6523 += local18;
				return;
			}
			Static78.aClass152_2.method3911(local23.anInt6004, local23.aClass3_Sub11_Sub1_2.aByteArray36);
			Static474.anInt7707 -= local23.anInt6004;
			local18 += local23.anInt6004;
			local23.method7812();
			local23.aClass3_Sub11_Sub1_2.method3083();
			local23.method5171();
		}
	}
}
