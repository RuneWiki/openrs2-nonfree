import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "Lclient!sl;")
	public static Class331 aClass331_1;

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_130 = new Class322(119, 3);

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)I")
	public static int method6419(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(III[B)Ljava/lang/String;")
	public static String method6420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(8) char[] local8 = new char[arg1];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			@Pc(29) int local29 = arg2[local12 + arg0] & 0xFF;
			if (local29 != 0) {
				if (local29 >= 128 && local29 < 160) {
					@Pc(51) char local51 = Static211.aCharArray7[local29 - 128];
					if (local51 == '\u0000') {
						local51 = '?';
					}
					local29 = local51;
				}
				local8[local10++] = (char) local29;
			}
		}
		return new String(local8, 0, local10);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!ml;B[Lclient!uk;)Lclient!vr;")
	public static Class384 method6421(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(2) Class362[] arg1) {
		for (@Pc(14) int local14 = 0; local14 < arg1.length; local14++) {
			if (arg1[local14] == null || arg1[local14].aLong320 <= 0L) {
				return null;
			}
		}
		@Pc(44) long local44 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(46) int local46 = 0; local46 < arg1.length; local46++) {
			OpenGL.glAttachObjectARB(local44, arg1[local46].aLong320);
		}
		OpenGL.glLinkProgramARB(local44);
		OpenGL.glGetObjectParameterivARB(local44, 35714, Static377.anIntArray370, 0);
		if (Static377.anIntArray370[0] == 0) {
			if (Static377.anIntArray370[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local44, 35716, Static377.anIntArray370, 1);
			if (Static377.anIntArray370[1] > 1) {
				@Pc(109) byte[] local109 = new byte[Static377.anIntArray370[1]];
				OpenGL.glGetInfoLogARB(local44, Static377.anIntArray370[1], Static377.anIntArray370, 0, local109, 0);
				System.out.println(new String(local109));
			}
			if (Static377.anIntArray370[0] == 0) {
				for (@Pc(130) int local130 = 0; local130 < arg1.length; local130++) {
					OpenGL.glDetachObjectARB(local44, arg1[local130].aLong320);
				}
				OpenGL.glDeleteObjectARB(local44);
				return null;
			}
		}
		return new Class384(arg0, local44, arg1);
	}
}
