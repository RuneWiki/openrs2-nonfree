import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static596 {

	@OriginalMember(owner = "client!wu", name = "q", descriptor = "Lclient!me;")
	public static final Class211 aClass211_66 = new Class211(4);

	@OriginalMember(owner = "client!wu", name = "r", descriptor = "I")
	public static int anInt10437 = 0;

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "([Lclient!kk;Lclient!ji;B)Lclient!hq;")
	public static Class147 method8419(@OriginalArg(0) Class185[] arg0, @OriginalArg(1) Class15_Sub3 arg1) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] == null || arg0[local5].aLong164 <= 0L) {
				return null;
			}
		}
		@Pc(30) long local30 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(32) int local32 = 0; local32 < arg0.length; local32++) {
			OpenGL.glAttachObjectARB(local30, arg0[local32].aLong164);
		}
		OpenGL.glLinkProgramARB(local30);
		OpenGL.glGetObjectParameterivARB(local30, 35714, Static239.anIntArray303, 0);
		if (Static239.anIntArray303[0] == 0) {
			if (Static239.anIntArray303[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local30, 35716, Static239.anIntArray303, 1);
			if (Static239.anIntArray303[1] > 1) {
				@Pc(89) byte[] local89 = new byte[Static239.anIntArray303[1]];
				OpenGL.glGetInfoLogARB(local30, Static239.anIntArray303[1], Static239.anIntArray303, 0, local89, 0);
				System.out.println(new String(local89));
			}
			if (Static239.anIntArray303[0] == 0) {
				for (@Pc(113) int local113 = 0; local113 < arg0.length; local113++) {
					OpenGL.glDetachObjectARB(local30, arg0[local113].aLong164);
				}
				OpenGL.glDeleteObjectARB(local30);
				return null;
			}
		}
		return new Class147(arg1, local30, arg0);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(II)I")
	public static int method8421(@OriginalArg(0) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
