import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!kg", name = "v", descriptor = "[Lclient!kr;")
	public static Class29[] aClass29Array1;

	@OriginalMember(owner = "client!kg", name = "y", descriptor = "I")
	public static int anInt5461;

	@OriginalMember(owner = "client!kg", name = "u", descriptor = "[[I")
	public static final int[][] anIntArrayArray27 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(BLclient!vaa;[Lclient!qp;)Lclient!mp;")
	public static Class254 method4860(@OriginalArg(1) Class22_Sub2_Sub2 arg0, @OriginalArg(2) Class315[] arg1) {
		for (@Pc(14) int local14 = 0; local14 < arg1.length; local14++) {
			if (arg1[local14] == null || arg1[local14].aLong278 <= 0L) {
				return null;
			}
		}
		@Pc(44) long local44 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(46) int local46 = 0; local46 < arg1.length; local46++) {
			OpenGL.glAttachObjectARB(local44, arg1[local46].aLong278);
		}
		OpenGL.glLinkProgramARB(local44);
		OpenGL.glGetObjectParameterivARB(local44, 35714, Static484.anIntArray560, 0);
		if (Static484.anIntArray560[0] == 0) {
			if (Static484.anIntArray560[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local44, 35716, Static484.anIntArray560, 1);
			if (Static484.anIntArray560[1] > 1) {
				@Pc(108) byte[] local108 = new byte[Static484.anIntArray560[1]];
				OpenGL.glGetInfoLogARB(local44, Static484.anIntArray560[1], Static484.anIntArray560, 0, local108, 0);
				System.out.println(new String(local108));
			}
			if (Static484.anIntArray560[0] == 0) {
				for (@Pc(129) int local129 = 0; local129 < arg1.length; local129++) {
					OpenGL.glDetachObjectARB(local44, arg1[local129].aLong278);
				}
				OpenGL.glDeleteObjectARB(local44);
				return null;
			}
		}
		return new Class254(arg0, local44, arg1);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IBLclient!bc;)V")
	public static void method4861(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub8 arg1) {
		Static580.aClass3_Sub22_24.aClass21_Sub16_4.method5404();
		if (arg1 == null) {
			Static625.method8226();
		}
		Static467.aClass107_3.method5380();
		Static642.method8453(arg1);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IC)I")
	public static int method4862(@OriginalArg(1) char arg0) {
		return arg0 >= '\u0000' && Class10_Sub11.anIntArray796.length > arg0 ? Class10_Sub11.anIntArray796[arg0] : -1;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILclient!nt;IB)V")
	public static void method4863(@OriginalArg(0) int arg0, @OriginalArg(1) Class270 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			return;
		}
		if (arg1.anObjectArray13 != null) {
			@Pc(14) Class3_Sub41 local14 = new Class3_Sub41();
			local14.anObjectArray4 = arg1.anObjectArray13;
			local14.aClass270_12 = arg1;
			Static540.method7160(local14);
		}
		Static318.anInt1773 = arg1.anInt7001;
		Static496.anInt7898 = arg0;
		Static418.anInt6410 = arg1.anInt7020;
		Static302.anInt4875 = arg1.anInt6975;
		Static167.anInt2966 = arg1.anInt7022;
		Static474.aBoolean505 = true;
		Static723.anInt11214 = arg2;
		Static216.anInt3565 = arg1.anInt6973;
		Static539.method7146(arg1);
	}
}
