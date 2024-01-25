import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!dc", name = "O", descriptor = "B")
	public static byte aByte34;

	@OriginalMember(owner = "client!dc", name = "Q", descriptor = "Lclient!bu;")
	public static Class32 aClass32_28;

	@OriginalMember(owner = "client!dc", name = "W", descriptor = "Lclient!f;")
	public static Class8 aClass8_4;

	@OriginalMember(owner = "client!dc", name = "S", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_24 = new Class119(5, 8);

	@OriginalMember(owner = "client!dc", name = "T", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray4 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!dc", name = "V", descriptor = "I")
	public static int anInt1683 = 0;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!gj;Z)Z")
	public static boolean method1303(@OriginalArg(0) Class90 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean240) {
			return false;
		} else if (!arg0.method2034(Static144.anInterface9_2)) {
			return false;
		} else if (Static177.aClass11_21.method324((long) arg0.anInt2713) == null) {
			return Static286.aClass11_6.method324((long) arg0.anInt2698) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "([Lclient!hq;ZLclient!vj;)Lclient!wf;")
	public static Class265 method1304(@OriginalArg(0) Class104[] arg0, @OriginalArg(2) Class172_Sub2 arg1) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] == null || arg0[local5].aLong103 <= 0L) {
				return null;
			}
		}
		@Pc(31) long local31 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(33) int local33 = 0; local33 < arg0.length; local33++) {
			OpenGL.glAttachObjectARB(local31, arg0[local33].aLong103);
		}
		OpenGL.glLinkProgramARB(local31);
		OpenGL.glGetObjectParameterivARB(local31, 35714, Static233.anIntArray291, 0);
		if (Static233.anIntArray291[0] == 0) {
			if (Static233.anIntArray291[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local31, 35716, Static233.anIntArray291, 1);
			if (Static233.anIntArray291[1] > 1) {
				@Pc(83) byte[] local83 = new byte[Static233.anIntArray291[1]];
				OpenGL.glGetInfoLogARB(local31, Static233.anIntArray291[1], Static233.anIntArray291, 0, local83, 0);
				System.out.println(new String(local83));
			}
			if (Static233.anIntArray291[0] == 0) {
				for (@Pc(104) int local104 = 0; local104 < arg0.length; local104++) {
					OpenGL.glDetachObjectARB(local31, arg0[local104].aLong103);
				}
				OpenGL.glDeleteObjectARB(local31);
				return null;
			}
		}
		return new Class265(arg1, local31, arg0);
	}
}
