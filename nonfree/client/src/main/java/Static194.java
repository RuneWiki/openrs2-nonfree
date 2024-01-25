import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!hea", name = "D", descriptor = "I")
	public static int anInt3795;

	@OriginalMember(owner = "client!hea", name = "H", descriptor = "Lclient!pj;")
	public static Class248 aClass248_30;

	@OriginalMember(owner = "client!hea", name = "K", descriptor = "F")
	public static float aFloat89;

	@OriginalMember(owner = "client!hea", name = "y", descriptor = "Lclient!cda;")
	public static final Class47 aClass47_1 = new Class47();

	@OriginalMember(owner = "client!hea", name = "E", descriptor = "I")
	public static int anInt3796 = 0;

	@OriginalMember(owner = "client!hea", name = "G", descriptor = "I")
	public static final int anInt3798 = Static1.method54(1600);

	@OriginalMember(owner = "client!hea", name = "I", descriptor = "Z")
	public static boolean aBoolean298 = false;

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(BLclient!oa;)V")
	public static void method3292(@OriginalArg(1) Class90 arg0) {
		for (@Pc(14) Class60_Sub4 local14 = (Class60_Sub4) Static357.aClass349_12.method7890(); local14 != null; local14 = (Class60_Sub4) Static357.aClass349_12.method7896()) {
			if (local14.aBoolean319) {
				local14.method3583(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(ILclient!oa;Lclient!jd;Lclient!vu;)V")
	public static void method3293(@OriginalArg(1) Class90 arg0, @OriginalArg(2) Class6_Sub22 arg1, @OriginalArg(3) Class336 arg2) {
		@Pc(10) Class71 local10 = arg2.method7790(arg0);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.QA();
		if (local10.b() > local16) {
			local16 = local10.b();
		}
		@Pc(28) int local28 = arg1.anInt4397;
		@Pc(31) int local31 = arg1.anInt4394;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(55) int local55;
		@Pc(78) int local78;
		if (arg2.aString89 != null) {
			local37 = Static557.aClass202_14.method4975(Static12.aStringArray1, arg2.aString89, null, null);
			for (local55 = 0; local55 < local37; local55++) {
				@Pc(61) String local61 = Static12.aStringArray1[local55];
				if (local55 < local37 - 1) {
					local61 = local61.substring(0, local61.length() - 4);
				}
				local78 = Static208.aClass329_5.method7447(local61);
				if (local39 < local78) {
					local39 = local78;
				}
			}
			local41 = Static208.aClass329_5.method7445() * local37 + Static208.aClass329_5.method7441() / 2;
		}
		local55 = local16 / 2 + arg1.anInt4397;
		@Pc(116) int local116 = arg1.anInt4394;
		if (local16 + Static490.anInt1912 > local28) {
			local55 = local39 / 2 + Static490.anInt1912 + local16 / 2 + 10 + 5;
			local28 = Static490.anInt1912;
		} else if (Static490.anInt1921 - local16 < local28) {
			local28 = Static490.anInt1921 - local16;
			local55 = Static490.anInt1921 - local39 / 2 - local16 / 2 - 10 - 5;
		}
		if (local31 < Static490.anInt1916 + local16) {
			local31 = Static490.anInt1916;
			local116 = Static490.anInt1916 + local16 / 2 + 10;
		} else if (local31 > Static490.anInt1920 - local16) {
			local116 = Static490.anInt1920 - local16 / 2 - local41 - 10;
			local31 = Static490.anInt1920 - local16;
		}
		local78 = (int) (Math.atan2((double) (local28 - arg1.anInt4397), (double) (local31 - arg1.anInt4394)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method7768((float) local28 + (float) local16 / 2.0F, (float) local31 + (float) local16 / 2.0F, 4096, local78);
		@Pc(253) int local253 = -2;
		@Pc(255) int local255 = -2;
		@Pc(257) int local257 = -2;
		@Pc(259) int local259 = -2;
		if (arg2.aString89 != null) {
			local255 = local116;
			local253 = local55 - local39 / 2 - 5;
			local257 = local253 + local39 + 10;
			local259 = local37 * Static208.aClass329_5.method7445() + local116 + 3;
			if (arg2.anInt9761 != 0) {
				arg0.method7482(local116, arg2.anInt9761, local257 - local253, -local116 + local259, local253);
			}
			if (arg2.anInt9750 != 0) {
				arg0.method7516(arg2.anInt9750, local259 - local116, local253, local116, local257 - local253);
			}
			for (@Pc(327) int local327 = 0; local327 < local37; local327++) {
				@Pc(333) String local333 = Static12.aStringArray1[local327];
				if (local37 - 1 > local327) {
					local333 = local333.substring(0, local333.length() - 4);
				}
				Static208.aClass329_5.method7446(arg0, local333, local55, local116, arg2.anInt9743);
				local116 += Static208.aClass329_5.method7445();
			}
		}
		if (arg2.anInt9766 == -1 && arg2.aString89 == null) {
			return;
		}
		@Pc(380) Class6_Sub38 local380 = new Class6_Sub38(arg1);
		local16 >>= 0x1;
		local380.anInt7289 = local257;
		local380.anInt7292 = local253;
		local380.anInt7293 = local16 + local31;
		local380.anInt7285 = local255;
		local380.anInt7282 = local31 - local16;
		local380.anInt7287 = local16 + local28;
		local380.anInt7291 = local28 - local16;
		local380.anInt7284 = local259;
		Static288.aClass298_170.method6812(local380);
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method3294(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			local15 = arg0.charAt(local17) + (local15 << 5) - local15;
		}
		return local15;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(IILclient!en;Ljava/lang/String;)Lclient!hba;")
	public static Class123 method3296(@OriginalArg(0) int arg0, @OriginalArg(2) Class90_Sub1 arg1, @OriginalArg(3) String arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg0);
		OpenGL.glShaderSourceARB(local6, arg2);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static390.anIntArray499, 0);
		if (Static390.anIntArray499[0] == 0) {
			if (Static390.anIntArray499[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static390.anIntArray499, 1);
			if (Static390.anIntArray499[1] > 1) {
				@Pc(53) byte[] local53 = new byte[Static390.anIntArray499[1]];
				OpenGL.glGetInfoLogARB(local6, Static390.anIntArray499[1], Static390.anIntArray499, 0, local53, 0);
				System.out.println(new String(local53));
			}
			if (Static390.anIntArray499[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class123(arg1, local6, arg0);
	}
}
