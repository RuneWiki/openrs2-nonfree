import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_52 = new Class92(71, 18);

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
	public static int anInt2940 = 0;

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
	public static int anInt2942 = 1;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(BLclient!rl;[Lclient!mt;)Lclient!jh;")
	public static Class129 method2455(@OriginalArg(1) Class66_Sub2 arg0, @OriginalArg(2) Class168[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			if (arg1[local7] == null || arg1[local7].aLong142 <= 0L) {
				return null;
			}
		}
		@Pc(38) long local38 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(40) int local40 = 0; local40 < arg1.length; local40++) {
			OpenGL.glAttachObjectARB(local38, arg1[local40].aLong142);
		}
		OpenGL.glLinkProgramARB(local38);
		OpenGL.glGetObjectParameterivARB(local38, 35714, Static34.anIntArray495, 0);
		if (Static34.anIntArray495[0] == 0) {
			if (Static34.anIntArray495[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local38, 35716, Static34.anIntArray495, 1);
			if (Static34.anIntArray495[1] > 1) {
				@Pc(95) byte[] local95 = new byte[Static34.anIntArray495[1]];
				OpenGL.glGetInfoLogARB(local38, Static34.anIntArray495[1], Static34.anIntArray495, 0, local95, 0);
				System.out.println(new String(local95));
			}
			if (Static34.anIntArray495[0] == 0) {
				for (@Pc(119) int local119 = 0; local119 < arg1.length; local119++) {
					OpenGL.glDetachObjectARB(local38, arg1[local119].aLong142);
				}
				OpenGL.glDeleteObjectARB(local38);
				return null;
			}
		}
		return new Class129(arg0, local38, arg1);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;I)V")
	public static void method2456(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6) {
		for (@Pc(3) int local3 = 99; local3 > 0; local3--) {
			Static68.anIntArray511[local3] = Static68.anIntArray511[local3 - 1];
			Static141.anIntArray85[local3] = Static141.anIntArray85[local3 - 1];
			Static443.aStringArray52[local3] = Static443.aStringArray52[local3 - 1];
			Static285.aStringArray43[local3] = Static285.aStringArray43[local3 - 1];
			Static352.aStringArray36[local3] = Static352.aStringArray36[local3 - 1];
			Static344.aStringArray37[local3] = Static344.aStringArray37[local3 - 1];
			Static229.anIntArray301[local3] = Static229.anIntArray301[local3 - 1];
		}
		Static68.anIntArray511[0] = arg2;
		Static443.aStringArray52[0] = arg5;
		Static141.anIntArray85[0] = arg6;
		Static285.aStringArray43[0] = arg3;
		Static352.aStringArray36[0] = arg0;
		Static229.anIntArray301[0] = arg4;
		Static181.anInt3575++;
		anInt2940 = Static144.anInt2943;
		Static344.aStringArray37[0] = arg1;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[[BLclient!uo;)V")
	public static void method2457(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class115_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg0.length;
		@Pc(36) int local36;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(23) byte[] local23 = arg0[local17];
			if (local23 != null) {
				@Pc(30) Class6_Sub1 local30 = new Class6_Sub1(local23);
				local36 = Static411.anIntArray508[local17] >> 8;
				@Pc(42) int local42 = Static411.anIntArray508[local17] & 0xFF;
				@Pc(49) int local49 = local36 * 64 - Static2.anInt6396;
				@Pc(56) int local56 = local42 * 64 - Static348.anInt6273;
				Static280.method4210();
				arg1.method5988(local30, local49, local56, Static2.anInt6396, Static348.anInt6273, Static209.aClass210Array2);
				arg1.method5999(local30, Static126.aClass66_5, local56, local12, local49);
				if (!arg1.aBoolean462 && Static96.anInt5953 / 8 == local36 && Static372.anInt6696 / 8 == local42 && local12[0] != -1) {
					Static249.aClass107_1 = Static133.aClass133_2.method3056(local12[0], Static89.aClass70_1, local12[3], local12[2], local12[1]);
					Static292.anInt5205 = local12[4];
				}
			}
		}
		for (@Pc(127) int local127 = 0; local127 < local15; local127++) {
			@Pc(140) int local140 = (Static411.anIntArray508[local127] >> 8) * 64 - Static2.anInt6396;
			local36 = (Static411.anIntArray508[local127] & 0xFF) * 64 - Static348.anInt6273;
			@Pc(154) byte[] local154 = arg0[local127];
			if (local154 == null && Static372.anInt6696 < 800) {
				Static280.method4210();
				arg1.method5992(local140, local36);
			}
		}
	}
}
