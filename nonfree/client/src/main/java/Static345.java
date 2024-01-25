import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!oca", name = "H", descriptor = "Lclient!ci;")
	public static Class3_Sub9_Sub1 aClass3_Sub9_Sub1_2;

	@OriginalMember(owner = "client!oca", name = "N", descriptor = "Lclient!js;")
	public static Class154 aClass154_1;

	@OriginalMember(owner = "client!oca", name = "X", descriptor = "Lclient!kea;")
	public static Class161 aClass161_73;

	@OriginalMember(owner = "client!oca", name = "Z", descriptor = "Lclient!kea;")
	public static Class161 aClass161_74;

	@OriginalMember(owner = "client!oca", name = "ab", descriptor = "I")
	public static int anInt6586;

	@OriginalMember(owner = "client!oca", name = "I", descriptor = "[I")
	public static final int[] anIntArray563 = new int[2048];

	@OriginalMember(owner = "client!oca", name = "S", descriptor = "Lclient!raa;")
	public static final Class253 aClass253_11 = new Class253("WTRC", 1);

	@OriginalMember(owner = "client!oca", name = "W", descriptor = "I")
	public static int anInt6584 = 0;

	@OriginalMember(owner = "client!oca", name = "cb", descriptor = "I")
	public static int anInt6588 = 0;

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "([Lclient!ni;Lclient!ad;I)Lclient!is;")
	public static Class138 method5497(@OriginalArg(0) Class206[] arg0, @OriginalArg(1) Class5_Sub1 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] == null || arg0[local7].aLong183 <= 0L) {
				return null;
			}
		}
		@Pc(35) long local35 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(37) int local37 = 0; local37 < arg0.length; local37++) {
			OpenGL.glAttachObjectARB(local35, arg0[local37].aLong183);
		}
		OpenGL.glLinkProgramARB(local35);
		OpenGL.glGetObjectParameterivARB(local35, 35714, Static339.anIntArray501, 0);
		if (Static339.anIntArray501[0] == 0) {
			if (Static339.anIntArray501[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local35, 35716, Static339.anIntArray501, 1);
			if (Static339.anIntArray501[1] > 1) {
				@Pc(91) byte[] local91 = new byte[Static339.anIntArray501[1]];
				OpenGL.glGetInfoLogARB(local35, Static339.anIntArray501[1], Static339.anIntArray501, 0, local91, 0);
				System.out.println(new String(local91));
			}
			if (Static339.anIntArray501[0] == 0) {
				for (@Pc(115) int local115 = 0; local115 < arg0.length; local115++) {
					OpenGL.glDetachObjectARB(local35, arg0[local115].aLong183);
				}
				OpenGL.glDeleteObjectARB(local35);
				return null;
			}
		}
		return new Class138(arg1, local35, arg0);
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(B)V")
	public static void method5498() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static400.aBooleanArray34[local3] = false;
		}
		Static443.anInt8112 = -1;
		Static83.anInt1814 = Static311.anInt6050;
		Static522.anInt9090 = Static27.anInt778;
		Static25.anInt758 = Static223.anInt4829;
		Static225.anInt4852 = Static347.anInt6620;
		Static305.anInt5998 = 5;
		Static418.anInt7807 = -1;
		Static515.anInt8982 = 0;
		Static99.anInt6726 = 0;
		Static186.anInt4252 = Static329.anInt6297;
		Static364.anInt6823 = Static262.anInt5491;
	}

	@OriginalMember(owner = "client!oca", name = "b", descriptor = "(B)V")
	public static void method5499() {
		for (@Pc(18) Class3_Sub8 local18 = (Class3_Sub8) Static536.aClass71_67.method2089(); local18 != null; local18 = (Class3_Sub8) Static536.aClass71_67.method2086()) {
			if (local18.anInt801 == -1) {
				local18.anInt798 = 0;
				if (local18.anInt789 >= 0 && local18.anInt791 >= 0 && Static118.anInt2527 > local18.anInt789 && Static549.anInt9482 > local18.anInt791) {
					Static451.method6822(local18);
				}
			} else {
				local18.method7820();
			}
		}
	}

	@OriginalMember(owner = "client!oca", name = "i", descriptor = "(I)V")
	public static void method5502() {
		@Pc(5) Class125 local5 = Static260.aClass125_36;
		synchronized (Static260.aClass125_36) {
			Static260.aClass125_36.method3521();
		}
	}
}
