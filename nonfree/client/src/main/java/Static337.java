import jaggl.OpenGL;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!lda", name = "q", descriptor = "I")
	public static int anInt5758;

	@OriginalMember(owner = "client!lda", name = "r", descriptor = "I")
	public static int anInt5759;

	@OriginalMember(owner = "client!lda", name = "x", descriptor = "I")
	public static int anInt5770;

	@OriginalMember(owner = "client!lda", name = "s", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray24;

	@OriginalMember(owner = "client!lda", name = "i", descriptor = "I")
	public static int anInt5763 = 0;

	@OriginalMember(owner = "client!lda", name = "u", descriptor = "I")
	public static int anInt5765 = -2;

	@OriginalMember(owner = "client!lda", name = "v", descriptor = "I")
	public static int anInt5768 = 0;

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(BLclient!dga;[Lclient!fb;)Lclient!haa;")
	public static Class145 method5201(@OriginalArg(1) Class75_Sub1_Sub1 arg0, @OriginalArg(2) Class108[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			if (arg1[local7] == null || arg1[local7].aLong88 <= 0L) {
				return null;
			}
		}
		@Pc(39) long local39 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(41) int local41 = 0; local41 < arg1.length; local41++) {
			OpenGL.glAttachObjectARB(local39, arg1[local41].aLong88);
		}
		OpenGL.glLinkProgramARB(local39);
		OpenGL.glGetObjectParameterivARB(local39, 35714, Static544.anIntArray584, 0);
		if (Static544.anIntArray584[0] == 0) {
			if (Static544.anIntArray584[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local39, 35716, Static544.anIntArray584, 1);
			if (Static544.anIntArray584[1] > 1) {
				@Pc(107) byte[] local107 = new byte[Static544.anIntArray584[1]];
				OpenGL.glGetInfoLogARB(local39, Static544.anIntArray584[1], Static544.anIntArray584, 0, local107, 0);
				System.out.println(new String(local107));
			}
			if (Static544.anIntArray584[0] == 0) {
				for (@Pc(131) int local131 = 0; local131 < arg1.length; local131++) {
					OpenGL.glDetachObjectARB(local39, arg1[local131].aLong88);
				}
				OpenGL.glDeleteObjectARB(local39);
				return null;
			}
		}
		return new Class145(arg0, local39, arg1);
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method5202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class243 local7 = Static334.aClass243ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(14) Class123 local14 = local7.aClass123_5; local14 != null; local14 = local14.aClass123_1) {
			@Pc(18) Class60_Sub1_Sub1 local18 = local14.aClass60_Sub1_Sub1_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort100 == arg1 && local18.aShort102 == arg2) {
				Static29.method342(local18, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method5203(@OriginalArg(1) long arg0) {
		Static657.aCalendar3.setTime(new Date(arg0));
		@Pc(13) int local13 = Static657.aCalendar3.get(7);
		@Pc(17) int local17 = Static657.aCalendar3.get(5);
		@Pc(21) int local21 = Static657.aCalendar3.get(2);
		@Pc(25) int local25 = Static657.aCalendar3.get(1);
		@Pc(29) int local29 = Static657.aCalendar3.get(11);
		@Pc(33) int local33 = Static657.aCalendar3.get(12);
		@Pc(37) int local37 = Static657.aCalendar3.get(13);
		return Static167.aStringArray12[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static684.aStringArray48[local21] + "-" + local25 + " " + local29 / 10 + local29 % 10 + ":" + local33 / 10 + local33 % 10 + ":" + local37 / 10 + local37 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(ZII)Z")
	public static boolean method5204(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static137.method2610(arg0, arg1) & Static250.method4363(arg0, arg1);
	}
}
