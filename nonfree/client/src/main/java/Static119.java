import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!eca", name = "I", descriptor = "Lclient!st;")
	public static final Class314 aClass314_41 = new Class314(38, 8);

	@OriginalMember(owner = "client!eca", name = "J", descriptor = "I")
	public static int anInt2612 = 0;

	@OriginalMember(owner = "client!eca", name = "K", descriptor = "Z")
	public static boolean aBoolean204 = false;

	@OriginalMember(owner = "client!eca", name = "L", descriptor = "Lclient!fv;")
	public static final Class117 aClass117_3 = new Class117();

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lclient!hj;[Lclient!ws;B)Lclient!jp;")
	public static Class180 method2187(@OriginalArg(0) Class82_Sub3_Sub1 arg0, @OriginalArg(1) Class382[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			if (arg1[local7] == null || arg1[local7].aLong274 <= 0L) {
				return null;
			}
		}
		@Pc(35) long local35 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(37) int local37 = 0; local37 < arg1.length; local37++) {
			OpenGL.glAttachObjectARB(local35, arg1[local37].aLong274);
		}
		OpenGL.glLinkProgramARB(local35);
		OpenGL.glGetObjectParameterivARB(local35, 35714, Static35.anIntArray42, 0);
		if (Static35.anIntArray42[0] == 0) {
			if (Static35.anIntArray42[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local35, 35716, Static35.anIntArray42, 1);
			if (Static35.anIntArray42[1] > 1) {
				@Pc(95) byte[] local95 = new byte[Static35.anIntArray42[1]];
				OpenGL.glGetInfoLogARB(local35, Static35.anIntArray42[1], Static35.anIntArray42, 0, local95, 0);
				System.out.println(new String(local95));
			}
			if (Static35.anIntArray42[0] == 0) {
				for (@Pc(119) int local119 = 0; local119 < arg1.length; local119++) {
					OpenGL.glDetachObjectARB(local35, arg1[local119].aLong274);
				}
				OpenGL.glDeleteObjectARB(local35);
				return null;
			}
		}
		return new Class180(arg0, local35, arg1);
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method2188(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(31) int local31 = 0;
			for (@Pc(33) long local33 = arg0; local33 != 0L; local33 /= 37L) {
				local31++;
			}
			@Pc(49) StringBuffer local49 = new StringBuffer(local31);
			while (arg0 != 0L) {
				@Pc(53) long local53 = arg0;
				arg0 /= 37L;
				@Pc(67) char local67 = Static412.aCharArray11[(int) (local53 - arg0 * 37L)];
				if (local67 == '_') {
					@Pc(75) int local75 = local49.length() - 1;
					local67 = ' ';
					local49.setCharAt(local75, Character.toUpperCase(local49.charAt(local75)));
				}
				local49.append(local67);
			}
			local49.reverse();
			local49.setCharAt(0, Character.toUpperCase(local49.charAt(0)));
			return local49.toString();
		}
	}
}
