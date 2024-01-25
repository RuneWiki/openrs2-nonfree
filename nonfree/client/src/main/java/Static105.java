import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "F")
	public static float aFloat30;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "Lclient!nea;")
	public static final Class244 aClass244_4 = new Class244(2);

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "Z")
	public static boolean aBoolean132 = true;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V")
	public static void method1883(@OriginalArg(0) int arg0) {
		Static220.anInt4513 = arg0;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "([Lclient!ck;Lclient!lea;B)Lclient!kba;")
	public static Class190 method1884(@OriginalArg(0) Class57[] arg0, @OriginalArg(1) Class101_Sub2 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] == null || arg0[local7].aLong52 <= 0L) {
				return null;
			}
		}
		@Pc(31) long local31 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(38) int local38 = 0; local38 < arg0.length; local38++) {
			OpenGL.glAttachObjectARB(local31, arg0[local38].aLong52);
		}
		OpenGL.glLinkProgramARB(local31);
		OpenGL.glGetObjectParameterivARB(local31, 35714, Static461.anIntArray413, 0);
		if (Static461.anIntArray413[0] == 0) {
			if (Static461.anIntArray413[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local31, 35716, Static461.anIntArray413, 1);
			if (Static461.anIntArray413[1] > 1) {
				@Pc(91) byte[] local91 = new byte[Static461.anIntArray413[1]];
				OpenGL.glGetInfoLogARB(local31, Static461.anIntArray413[1], Static461.anIntArray413, 0, local91, 0);
				System.out.println(new String(local91));
			}
			if (Static461.anIntArray413[0] == 0) {
				for (@Pc(115) int local115 = 0; local115 < arg0.length; local115++) {
					OpenGL.glDetachObjectARB(local31, arg0[local115].aLong52);
				}
				OpenGL.glDeleteObjectARB(local31);
				return null;
			}
		}
		return new Class190(arg1, local31, arg0);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)Lclient!hk;")
	public static Class146 method1885(@OriginalArg(0) int arg0) {
		@Pc(13) Class146[] local13 = Static284.method4756();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			if (local13[local15].anInt4597 == arg0) {
				return local13[local15];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IBIZZ)V")
	public static void method1887(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5) {
		Static383.aClass124_79.anInt3918 = 1;
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = -1;
		@Pc(18) String local18 = null;
		if (arg3 != -1) {
			@Pc(26) Class204 local26 = Static142.aClass367_1.method9243(arg3);
			if (local26 == null || local26.method5366() != arg4) {
				return;
			}
			if (local26.method5366()) {
				local18 = local26.aString69;
			} else {
				local16 = local26.anInt5933;
			}
		}
		@Pc(48) int local48 = 0;
		for (@Pc(50) int local50 = 0; local50 < Static372.aClass343_1.anInt9759; local50++) {
			@Pc(57) Class351 local57 = Static372.aClass343_1.method8549(local50);
			if ((!arg5 || local57.aBoolean740) && local57.anInt10178 == -1 && local57.anInt10154 == -1 && local57.anInt10155 == -1 && local57.anInt10158 == 0 && local57.aString119.toLowerCase().indexOf(local11) != -1) {
				if (arg3 != -1) {
					if (arg4) {
						if (!arg1.equals(local57.method8829(arg3, local18))) {
							continue;
						}
					} else if (arg2 != local57.method8822(arg3, local16)) {
						continue;
					}
				}
				if (local48 >= 250) {
					Static280.aShortArray71 = null;
					Static369.anInt11000 = -1;
					return;
				}
				if (local48 >= local14.length) {
					@Pc(133) short[] local133 = new short[local14.length * 2];
					for (@Pc(135) int local135 = 0; local135 < local48; local135++) {
						local133[local135] = local14[local135];
					}
					local14 = local133;
				}
				local14[local48++] = (short) local50;
			}
		}
		Static632.anInt10928 = 0;
		Static369.anInt11000 = local48;
		Static280.aShortArray71 = local14;
		@Pc(182) String[] local182 = new String[Static369.anInt11000];
		for (@Pc(184) int local184 = 0; local184 < Static369.anInt11000; local184++) {
			local182[local184] = Static372.aClass343_1.method8549(local14[local184]).aString119;
		}
		Static389.method6558(local182, Static280.aShortArray71);
		Static383.aClass124_79.method3614();
		Static383.aClass124_79.anInt3918 = 2;
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(II)V")
	public static void method1888(@OriginalArg(0) int arg0) {
		Static630.anIntArray400 = new int[arg0];
		Static574.anIntArray509 = new int[arg0];
		Static433.anIntArray397 = new int[arg0];
		Static17.anIntArray439 = new int[arg0];
		Static525.anIntArray472 = new int[arg0];
	}
}
