import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!ki", name = "g", descriptor = "Lclient!la;")
	public static Class58 aClass58_5;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!n;BII)V")
	public static void method4722(@OriginalArg(0) Class225 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static584.aClass225_51 = arg0;
		Static44.anInt579 = arg2;
		Static435.anInt8160 = arg1;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)I")
	public static int method4723(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) int local11 = arg2.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local8 > local13 - local17 || local11 > local15 - local19) {
			if (local13 - local17 >= local8) {
				return -1;
			}
			if (local11 <= local15 - local19) {
				return 1;
			}
			@Pc(54) char local54;
			if (local17 == '\u0000') {
				local54 = arg0.charAt(local13++);
			} else {
				local54 = local17;
			}
			@Pc(70) char local70;
			if (local19 == '\u0000') {
				local70 = arg2.charAt(local15++);
			} else {
				local70 = local19;
			}
			local17 = Static542.method7874(local54);
			local19 = Static542.method7874(local70);
			local54 = Static7.method146(local54, arg1);
			local70 = Static7.method146(local70, arg1);
			if (local54 != local70 && Character.toUpperCase(local54) != Character.toUpperCase(local70)) {
				local54 = Character.toLowerCase(local54);
				local70 = Character.toLowerCase(local70);
				if (local70 != local54) {
					return Static408.method6470(local54, arg1) - Static408.method6470(local70, arg1);
				}
			}
		}
		@Pc(139) int local139 = Math.min(local8, local11);
		for (@Pc(149) int local149 = 0; local149 < local139; local149++) {
			if (arg1 == 2) {
				local13 = local8 - local149 - 1;
				local15 = local11 - local149 - 1;
			} else {
				local15 = local149;
				local13 = local149;
			}
			@Pc(178) char local178 = arg0.charAt(local13);
			@Pc(182) char local182 = arg2.charAt(local15);
			if (local182 != local178 && Character.toUpperCase(local178) != Character.toUpperCase(local182)) {
				local178 = Character.toLowerCase(local178);
				local182 = Character.toLowerCase(local182);
				if (local178 != local182) {
					return Static408.method6470(local178, arg1) - Static408.method6470(local182, arg1);
				}
			}
		}
		@Pc(230) int local230 = local8 - local11;
		if (local230 != 0) {
			return local230;
		}
		for (@Pc(236) int local236 = 0; local236 < local139; local236++) {
			@Pc(242) char local242 = arg0.charAt(local236);
			@Pc(246) char local246 = arg2.charAt(local236);
			if (local246 != local242) {
				return Static408.method6470(local242, arg1) - Static408.method6470(local246, arg1);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)Z")
	public static boolean method4728(@OriginalArg(0) int arg0) {
		return arg0 == 7 || arg0 == 8 || arg0 == 9;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!dda;ZI[B)Lclient!av;")
	public static Class23 method4729(@OriginalArg(0) Class44_Sub2_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg1);
		OpenGL.glShaderSourceRawARB(local6, arg2);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static378.anIntArray298, 0);
		if (Static378.anIntArray298[0] == 0) {
			if (Static378.anIntArray298[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static378.anIntArray298, 1);
			if (Static378.anIntArray298[1] > 1) {
				@Pc(59) byte[] local59 = new byte[Static378.anIntArray298[1]];
				OpenGL.glGetInfoLogARB(local6, Static378.anIntArray298[1], Static378.anIntArray298, 0, local59, 0);
				System.out.println(new String(local59));
			}
			if (Static378.anIntArray298[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class23(arg0, local6, arg1);
	}
}
