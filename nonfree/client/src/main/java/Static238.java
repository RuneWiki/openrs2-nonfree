import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!ij", name = "m", descriptor = "I")
	public static int anInt3898;

	@OriginalMember(owner = "client!ij", name = "p", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_144 = new Class288(25, 20);

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)I")
	public static int method3335(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!ep;[Lclient!ee;I)Lclient!waa;")
	public static Class369 method3336(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) Class83[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			if (arg1[local7] == null || arg1[local7].aLong66 <= 0L) {
				return null;
			}
		}
		@Pc(34) long local34 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(36) int local36 = 0; local36 < arg1.length; local36++) {
			OpenGL.glAttachObjectARB(local34, arg1[local36].aLong66);
		}
		OpenGL.glLinkProgramARB(local34);
		OpenGL.glGetObjectParameterivARB(local34, 35714, Static270.anIntArray288, 0);
		if (Static270.anIntArray288[0] == 0) {
			if (Static270.anIntArray288[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local34, 35716, Static270.anIntArray288, 1);
			if (Static270.anIntArray288[1] > 1) {
				@Pc(86) byte[] local86 = new byte[Static270.anIntArray288[1]];
				OpenGL.glGetInfoLogARB(local34, Static270.anIntArray288[1], Static270.anIntArray288, 0, local86, 0);
				System.out.println(new String(local86));
			}
			if (Static270.anIntArray288[0] == 0) {
				for (@Pc(107) int local107 = 0; local107 < arg1.length; local107++) {
					OpenGL.glDetachObjectARB(local34, arg1[local107].aLong66);
				}
				OpenGL.glDeleteObjectARB(local34);
				return null;
			}
		}
		return new Class369(arg0, local34, arg1);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)V")
	public static void method3337() {
		if (Static512.anInt8554 <= 1) {
			Static234.aClass2_Sub5_48.method176(2, Static234.aClass2_Sub5_48.aClass6_Sub20_1);
		} else {
			Static234.aClass2_Sub5_48.method176(4, Static234.aClass2_Sub5_48.aClass6_Sub20_1);
		}
	}
}
