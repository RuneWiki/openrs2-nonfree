import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!oo", name = "d", descriptor = "[I")
	public static int[] anIntArray372;

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_122 = new Class131(65, -1);

	@OriginalMember(owner = "client!oo", name = "e", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_63 = new Class84("Examine", "Untersuchen", "Examiner", "Examinar");

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lclient!ht;[Lclient!lo;I)Lclient!ed;")
	public static Class65 method3804(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) Class149[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			if (arg1[local7] == null || arg1[local7].aLong133 <= 0L) {
				return null;
			}
		}
		@Pc(34) long local34 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(36) int local36 = 0; local36 < arg1.length; local36++) {
			OpenGL.glAttachObjectARB(local34, arg1[local36].aLong133);
		}
		OpenGL.glLinkProgramARB(local34);
		OpenGL.glGetObjectParameterivARB(local34, 35714, Static113.anIntArray456, 0);
		if (Static113.anIntArray456[0] == 0) {
			if (Static113.anIntArray456[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local34, 35716, Static113.anIntArray456, 1);
			if (Static113.anIntArray456[1] > 1) {
				@Pc(86) byte[] local86 = new byte[Static113.anIntArray456[1]];
				OpenGL.glGetInfoLogARB(local34, Static113.anIntArray456[1], Static113.anIntArray456, 0, local86, 0);
				System.out.println(new String(local86));
			}
			if (Static113.anIntArray456[0] == 0) {
				for (@Pc(110) int local110 = 0; local110 < arg1.length; local110++) {
					OpenGL.glDetachObjectARB(local34, arg1[local110].aLong133);
				}
				OpenGL.glDeleteObjectARB(local34);
				return null;
			}
		}
		return new Class65(arg0, local34, arg1);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZLjava/lang/String;B)V")
	public static void method3808(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		@Pc(4) String local4 = arg1.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg0 ? 32768 : 0;
		@Pc(30) int local30 = local19 + (arg0 ? Static21.aClass245_1.anInt7195 : Static21.aClass245_1.anInt7196);
		for (@Pc(32) int local32 = local19; local32 < local30; local32++) {
			@Pc(39) Class1_Sub2_Sub14 local39 = Static21.aClass245_1.method5566(local32);
			if (local39.aBoolean364 && local39.method4415().toLowerCase().indexOf(local4) != -1) {
				if (local13 >= 50) {
					Static379.anInt6500 = -1;
					Static233.aShortArray53 = null;
					return;
				}
				if (local11.length <= local13) {
					@Pc(70) short[] local70 = new short[local11.length * 2];
					for (@Pc(72) int local72 = 0; local72 < local13; local72++) {
						local70[local72] = local11[local72];
					}
					local11 = local70;
				}
				local11[local13++] = (short) local32;
			}
		}
		Static282.anInt4977 = 0;
		Static233.aShortArray53 = local11;
		Static379.anInt6500 = local13;
		@Pc(113) String[] local113 = new String[Static379.anInt6500];
		for (@Pc(120) int local120 = 0; local120 < Static379.anInt6500; local120++) {
			local113[local120] = Static21.aClass245_1.method5566(local11[local120]).method4415();
		}
		Static232.method3441(local113, Static233.aShortArray53);
	}
}
