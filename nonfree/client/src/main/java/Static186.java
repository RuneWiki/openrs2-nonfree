import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!gi", name = "J", descriptor = "Lclient!wn;")
	public static Class358 aClass358_1;

	@OriginalMember(owner = "client!gi", name = "K", descriptor = "[Lclient!iea;")
	public static Class31[] aClass31Array6;

	@OriginalMember(owner = "client!gi", name = "H", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_74 = new Class200(95, 7);

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!tk;B[Lclient!dc;)Lclient!pt;")
	public static Class278 method3190(@OriginalArg(0) Class13_Sub3_Sub1 arg0, @OriginalArg(2) Class66[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			if (arg1[local7] == null || arg1[local7].aLong62 <= 0L) {
				return null;
			}
		}
		@Pc(33) long local33 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(35) int local35 = 0; local35 < arg1.length; local35++) {
			OpenGL.glAttachObjectARB(local33, arg1[local35].aLong62);
		}
		OpenGL.glLinkProgramARB(local33);
		OpenGL.glGetObjectParameterivARB(local33, 35714, Static18.anIntArray39, 0);
		if (Static18.anIntArray39[0] == 0) {
			if (Static18.anIntArray39[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local33, 35716, Static18.anIntArray39, 1);
			if (Static18.anIntArray39[1] > 1) {
				@Pc(85) byte[] local85 = new byte[Static18.anIntArray39[1]];
				OpenGL.glGetInfoLogARB(local33, Static18.anIntArray39[1], Static18.anIntArray39, 0, local85, 0);
				System.out.println(new String(local85));
			}
			if (Static18.anIntArray39[0] == 0) {
				for (@Pc(109) int local109 = 0; local109 < arg1.length; local109++) {
					OpenGL.glDetachObjectARB(local33, arg1[local109].aLong62);
				}
				OpenGL.glDeleteObjectARB(local33);
				return null;
			}
		}
		return new Class278(arg0, local33, arg1);
	}

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "(I)[Lclient!oea;")
	public static Class252[] method3192() {
		return new Class252[] { Static285.aClass252_9, Static648.aClass252_13, Static104.aClass252_2 };
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIII)I")
	public static int method3193(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 / arg2;
		@Pc(13) int local13 = arg2 - 1 & arg0;
		@Pc(17) int local17 = arg1 / arg2;
		@Pc(23) int local23 = arg1 & arg2 - 1;
		@Pc(30) int local30 = Static113.method2020(local7, local17);
		@Pc(39) int local39 = Static113.method2020(local7 + 1, local17);
		@Pc(48) int local48 = Static113.method2020(local7, local17 + 1);
		@Pc(57) int local57 = Static113.method2020(local7 + 1, local17 + 1);
		@Pc(64) int local64 = Static534.method7399(arg2, local39, local13, local30);
		@Pc(71) int local71 = Static534.method7399(arg2, local57, local13, local48);
		return Static534.method7399(arg2, local71, local23, local64);
	}
}
