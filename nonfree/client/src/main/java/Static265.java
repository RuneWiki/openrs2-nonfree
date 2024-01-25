import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(Lclient!lb;B)V")
	public static void method4093(@OriginalArg(0) Class221 arg0) {
		Static545.anInt7061 = 0;
		Static344.anInt5900 = 0;
		Static296.aClass66_5 = new Class66();
		Static547.aClass19_Sub4_Sub1_Sub1Array2 = new Class19_Sub4_Sub1_Sub1[1024];
		Static579.aClass19_Sub9Array2 = new Class19_Sub9[Static31.anIntArray431[Static284.anInt5151] + 1];
		Static343.anInt5896 = 0;
		Static330.anInt5785 = 0;
		Static310.method4681(arg0);
		Static715.method6606(arg0);
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(IB)C")
	public static char method4094(@OriginalArg(1) byte arg0) {
		@Pc(15) int local15 = arg0 & 0xFF;
		if (local15 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local15, 16) + " provided");
		}
		if (local15 >= 128 && local15 < 160) {
			@Pc(53) char local53 = Static38.aCharArray1[local15 - 128];
			if (local53 == '\u0000') {
				local53 = '?';
			}
			local15 = local53;
		}
		return (char) local15;
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "([Lclient!uw;BLclient!lt;)Lclient!fka;")
	public static Class115 method4095(@OriginalArg(0) Class378[] arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Class67_Sub1_Sub2 arg2) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] == null || arg0[local7].aLong364 <= 0L) {
				return null;
			}
		}
		@Pc(39) long local39 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(41) int local41 = 0; local41 < arg0.length; local41++) {
			OpenGL.glAttachObjectARB(local39, arg0[local41].aLong364);
		}
		OpenGL.glLinkProgramARB(local39);
		if (arg1 != -122) {
			method4095((Class378[]) null, (byte) -60, (Class67_Sub1_Sub2) null);
		}
		OpenGL.glGetObjectParameterivARB(local39, 35714, Static557.anIntArray513, 0);
		if (Static557.anIntArray513[0] == 0) {
			if (Static557.anIntArray513[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local39, 35716, Static557.anIntArray513, 1);
			if (Static557.anIntArray513[1] > 1) {
				@Pc(118) byte[] local118 = new byte[Static557.anIntArray513[1]];
				OpenGL.glGetInfoLogARB(local39, Static557.anIntArray513[1], Static557.anIntArray513, 0, local118, 0);
				System.out.println(new String(local118));
			}
			if (Static557.anIntArray513[0] == 0) {
				for (@Pc(139) int local139 = 0; local139 < arg0.length; local139++) {
					OpenGL.glDetachObjectARB(local39, arg0[local139].aLong364);
				}
				OpenGL.glDeleteObjectARB(local39);
				return null;
			}
		}
		return new Class115(arg2, local39, arg0);
	}
}
