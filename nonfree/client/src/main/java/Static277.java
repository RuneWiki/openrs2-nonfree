import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!kea", name = "n", descriptor = "I")
	public static int anInt5778;

	@OriginalMember(owner = "client!kea", name = "q", descriptor = "Lclient!sn;")
	public static Class313 aClass313_9;

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_49 = new Class257(27, 15);

	@OriginalMember(owner = "client!kea", name = "l", descriptor = "Lclient!so;")
	public static final Class314 aClass314_9 = new Class314(9, 4);

	@OriginalMember(owner = "client!kea", name = "o", descriptor = "Z")
	public static boolean aBoolean411 = false;

	@OriginalMember(owner = "client!kea", name = "p", descriptor = "Z")
	public static volatile boolean aBoolean412 = true;

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIII)V")
	public static void method4713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1012) {
			Static273.method4692(Static482.aClass165_8, arg0, arg1);
		} else if (arg2 == 1001) {
			Static273.method4692(Static342.aClass165_7, arg0, arg1);
		} else if (arg2 == 1008) {
			Static273.method4692(Static548.aClass165_10, arg0, arg1);
		} else if (arg2 == 1007) {
			Static273.method4692(Static396.aClass165_9, arg0, arg1);
		} else if (arg2 == 1006) {
			Static273.method4692(Static594.aClass165_11, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!ai;[Lclient!et;I)Lclient!jfa;")
	public static Class155 method4714(@OriginalArg(0) Class16_Sub1_Sub1 arg0, @OriginalArg(1) Class91[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			if (arg1[local7] == null || arg1[local7].aLong84 <= 0L) {
				return null;
			}
		}
		@Pc(35) long local35 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(37) int local37 = 0; local37 < arg1.length; local37++) {
			OpenGL.glAttachObjectARB(local35, arg1[local37].aLong84);
		}
		OpenGL.glLinkProgramARB(local35);
		OpenGL.glGetObjectParameterivARB(local35, 35714, Static26.anIntArray33, 0);
		if (Static26.anIntArray33[0] == 0) {
			if (Static26.anIntArray33[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local35, 35716, Static26.anIntArray33, 1);
			if (Static26.anIntArray33[1] > 1) {
				@Pc(95) byte[] local95 = new byte[Static26.anIntArray33[1]];
				OpenGL.glGetInfoLogARB(local35, Static26.anIntArray33[1], Static26.anIntArray33, 0, local95, 0);
				System.out.println(new String(local95));
			}
			if (Static26.anIntArray33[0] == 0) {
				for (@Pc(119) int local119 = 0; local119 < arg1.length; local119++) {
					OpenGL.glDetachObjectARB(local35, arg1[local119].aLong84);
				}
				OpenGL.glDeleteObjectARB(local35);
				return null;
			}
		}
		return new Class155(arg0, local35, arg1);
	}
}
