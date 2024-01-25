import jaggl.OpenGL;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!ifa", name = "f", descriptor = "I")
	public static int anInt3909;

	@OriginalMember(owner = "client!ifa", name = "g", descriptor = "Lclient!la;")
	public static Class207 aClass207_47;

	@OriginalMember(owner = "client!ifa", name = "c", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger4 = new BigInteger("9b60e152f650f105f68010a0a070834aa293c663fd240bebc114a10e711bf1361f67058210e24d7eba7a9fe59771d58e4877780f2409b16e69c4ae70bec50c7f", 16);

	@OriginalMember(owner = "client!ifa", name = "e", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_43 = new Class46(41, -1);

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ILclient!om;[Lclient!kea;)Lclient!oo;")
	public static Class259 method3516(@OriginalArg(1) Class133_Sub1_Sub2 arg0, @OriginalArg(2) Class193[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			if (arg1[local7] == null || arg1[local7].aLong122 <= 0L) {
				return null;
			}
		}
		@Pc(35) long local35 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(37) int local37 = 0; local37 < arg1.length; local37++) {
			OpenGL.glAttachObjectARB(local35, arg1[local37].aLong122);
		}
		OpenGL.glLinkProgramARB(local35);
		OpenGL.glGetObjectParameterivARB(local35, 35714, Static318.anIntArray290, 0);
		if (Static318.anIntArray290[0] == 0) {
			if (Static318.anIntArray290[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local35, 35716, Static318.anIntArray290, 1);
			if (Static318.anIntArray290[1] > 1) {
				@Pc(88) byte[] local88 = new byte[Static318.anIntArray290[1]];
				OpenGL.glGetInfoLogARB(local35, Static318.anIntArray290[1], Static318.anIntArray290, 0, local88, 0);
				System.out.println(new String(local88));
			}
			if (Static318.anIntArray290[0] == 0) {
				for (@Pc(112) int local112 = 0; local112 < arg1.length; local112++) {
					OpenGL.glDetachObjectARB(local35, arg1[local112].aLong122);
				}
				OpenGL.glDeleteObjectARB(local35);
				return null;
			}
		}
		return new Class259(arg0, local35, arg1);
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ILclient!ul;)Lclient!ul;")
	public static Class5_Sub1_Sub5 method3518(@OriginalArg(1) Class5_Sub1_Sub5 arg0) {
		@Pc(19) Class5_Sub1_Sub5 local19 = arg0 == null ? new Class5_Sub1_Sub5() : new Class5_Sub1_Sub5(arg0);
		local19.method8299();
		return local19;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IZI)Z")
	public static boolean method3519(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x22) != 0;
	}
}
