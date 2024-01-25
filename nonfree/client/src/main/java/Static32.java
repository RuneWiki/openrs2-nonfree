import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "Lclient!ga;")
	public static Class111 aClass111_5;

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString12;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
	public static void method782() {
		if (Static162.aString32.toLowerCase().indexOf("microsoft") != -1) {
			Static564.anIntArray618[189] = 26;
			Static564.anIntArray618[221] = 43;
			Static564.anIntArray618[187] = 27;
			Static564.anIntArray618[191] = 73;
			Static564.anIntArray618[222] = 59;
			Static564.anIntArray618[219] = 42;
			Static564.anIntArray618[223] = 28;
			Static564.anIntArray618[220] = 74;
			Static564.anIntArray618[188] = 71;
			Static564.anIntArray618[186] = 57;
			Static564.anIntArray618[192] = 58;
			Static564.anIntArray618[190] = 72;
			return;
		}
		Static564.anIntArray618[92] = 74;
		Static564.anIntArray618[61] = 27;
		Static564.anIntArray618[93] = 43;
		Static564.anIntArray618[59] = 57;
		Static564.anIntArray618[47] = 73;
		Static564.anIntArray618[91] = 42;
		if (Static162.aMethod2 == null) {
			Static564.anIntArray618[222] = 59;
			Static564.anIntArray618[192] = 58;
		} else {
			Static564.anIntArray618[192] = 28;
			Static564.anIntArray618[222] = 58;
			Static564.anIntArray618[520] = 59;
		}
		Static564.anIntArray618[46] = 72;
		Static564.anIntArray618[45] = 26;
		Static564.anIntArray618[44] = 71;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)V")
	public static void method784() {
		if (Static33.aClass23_2 == null) {
			return;
		}
		if (Static33.aClass23_2.anInt875 == 1) {
			Static33.aClass23_2 = null;
			return;
		}
		if (Static33.aClass23_2.anInt875 == 2) {
			Static410.method5764(Static581.aString94, 2, Static374.aClass114_7);
			Static33.aClass23_2 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!qi;Z[Lclient!mn;)Lclient!hr;")
	public static Class142 method785(@OriginalArg(0) Class12_Sub2_Sub2 arg0, @OriginalArg(2) Class217[] arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg1.length; local12++) {
			if (arg1[local12] == null || arg1[local12].aLong255 <= 0L) {
				return null;
			}
		}
		@Pc(36) long local36 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(38) int local38 = 0; local38 < arg1.length; local38++) {
			OpenGL.glAttachObjectARB(local36, arg1[local38].aLong255);
		}
		OpenGL.glLinkProgramARB(local36);
		OpenGL.glGetObjectParameterivARB(local36, 35714, Static39.anIntArray41, 0);
		if (Static39.anIntArray41[0] == 0) {
			if (Static39.anIntArray41[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local36, 35716, Static39.anIntArray41, 1);
			if (Static39.anIntArray41[1] > 1) {
				@Pc(89) byte[] local89 = new byte[Static39.anIntArray41[1]];
				OpenGL.glGetInfoLogARB(local36, Static39.anIntArray41[1], Static39.anIntArray41, 0, local89, 0);
				System.out.println(new String(local89));
			}
			if (Static39.anIntArray41[0] == 0) {
				for (@Pc(113) int local113 = 0; local113 < arg1.length; local113++) {
					OpenGL.glDetachObjectARB(local36, arg1[local113].aLong255);
				}
				OpenGL.glDeleteObjectARB(local36);
				return null;
			}
		}
		return new Class142(arg0, local36, arg1);
	}
}
