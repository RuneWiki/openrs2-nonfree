import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(BILjava/lang/String;)V")
	public static void method5292(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(17) Class3_Sub5_Sub20 local17 = Static447.method6065((long) arg0, 3);
		local17.method8832();
		local17.aString117 = arg1;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)Z")
	public static boolean method5293(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static26.method590(arg0, arg1) | Static315.method4516(arg0, arg1) | Static663.method8844(arg0, arg1)) & Static353.method5112(arg0, arg1);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
	public static void method5295() {
		Static121.aClass295_8.method6464();
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(B[BLclient!sha;I)Lclient!kfa;")
	public static Class193 method5296(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class95_Sub1_Sub1 arg1) {
		if (arg0 == null) {
			return null;
		}
		@Pc(14) int local14 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local14);
		OpenGL.glProgramRawARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static373.anIntArray332, 0);
		if (Static373.anIntArray332[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class193(arg1, 34336, local14);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
