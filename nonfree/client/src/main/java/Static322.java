import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!qf", name = "z", descriptor = "I")
	public static int anInt5332;

	@OriginalMember(owner = "client!qf", name = "K", descriptor = "I")
	public static int anInt5338;

	@OriginalMember(owner = "client!qf", name = "P", descriptor = "I")
	public static int anInt5340;

	@OriginalMember(owner = "client!qf", name = "Q", descriptor = "I")
	public static int anInt5341;

	@OriginalMember(owner = "client!qf", name = "D", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_113 = new Class55("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

	@OriginalMember(owner = "client!qf", name = "I", descriptor = "[Lclient!wg;")
	public static final Class7_Sub4_Sub18[] aClass7_Sub4_Sub18Array4 = new Class7_Sub4_Sub18[14];

	@OriginalMember(owner = "client!qf", name = "J", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_114 = new Class55(" ", ": ", " ", " ");

	@OriginalMember(owner = "client!qf", name = "N", descriptor = "[I")
	public static final int[] anIntArray482 = new int[32];

	@OriginalMember(owner = "client!qf", name = "O", descriptor = "Lclient!jo;")
	public static final Class126 aClass126_44 = new Class126(8);

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
	public static void method4271() {
		Static47.aClass126_7.method2827();
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(III)Z")
	public static boolean method4272(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static187.method2739(arg1, arg0) | (arg1 & 0x10000) != 0 || Static128.method2063(arg0, arg1)) {
			return true;
		} else {
			return (arg0 & 0x37) == 0 && Static141.method2175(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!sr;I)V")
	public static void method4276(@OriginalArg(0) Class26_Sub2_Sub4_Sub1 arg0) {
		for (@Pc(15) Class7_Sub13 local15 = (Class7_Sub13) Static26.aClass85_4.method2010(); local15 != null; local15 = (Class7_Sub13) Static26.aClass85_4.method2000()) {
			if (arg0 == local15.aClass26_Sub2_Sub4_Sub1_1) {
				if (local15.aClass7_Sub8_Sub4_3 != null) {
					Static452.aClass7_Sub8_Sub1_2.method2428(local15.aClass7_Sub8_Sub4_3);
					local15.aClass7_Sub8_Sub4_3 = null;
				}
				local15.method5802();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "([Lclient!rv;Lclient!vd;Z)Lclient!ij;")
	public static Class114 method4280(@OriginalArg(0) Class225[] arg0, @OriginalArg(1) Class51_Sub2 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] == null || arg0[local7].aLong180 <= 0L) {
				return null;
			}
		}
		@Pc(36) long local36 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(38) int local38 = 0; local38 < arg0.length; local38++) {
			OpenGL.glAttachObjectARB(local36, arg0[local38].aLong180);
		}
		OpenGL.glLinkProgramARB(local36);
		OpenGL.glGetObjectParameterivARB(local36, 35714, Static271.anIntArray417, 0);
		if (Static271.anIntArray417[0] == 0) {
			if (Static271.anIntArray417[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local36, 35716, Static271.anIntArray417, 1);
			if (Static271.anIntArray417[1] > 1) {
				@Pc(86) byte[] local86 = new byte[Static271.anIntArray417[1]];
				OpenGL.glGetInfoLogARB(local36, Static271.anIntArray417[1], Static271.anIntArray417, 0, local86, 0);
				System.out.println(new String(local86));
			}
			if (Static271.anIntArray417[0] == 0) {
				for (@Pc(107) int local107 = 0; local107 < arg0.length; local107++) {
					OpenGL.glDetachObjectARB(local36, arg0[local107].aLong180);
				}
				OpenGL.glDeleteObjectARB(local36);
				return null;
			}
		}
		return new Class114(arg1, local36, arg0);
	}
}
