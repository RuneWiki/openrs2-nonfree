import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static561 {

	@OriginalMember(owner = "client!tv", name = "s", descriptor = "I")
	public static int anInt9391;

	@OriginalMember(owner = "client!tv", name = "l", descriptor = "Lclient!sm;")
	public static final Class311 aClass311_14 = new Class311("", 12);

	@OriginalMember(owner = "client!tv", name = "q", descriptor = "I")
	public static int anInt9389 = 0;

	@OriginalMember(owner = "client!tv", name = "t", descriptor = "Lclient!dj;")
	public static final Class74 aClass74_14 = new Class74(12, 0, 1, 0);

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(BILclient!cs;)V")
	public static void method8090(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub1_Sub2_Sub1 arg1) {
		@Pc(15) int local15 = -1;
		@Pc(17) int local17 = 0;
		if (Static101.anInt2262 < arg1.anInt5788) {
			Static69.method1703(arg1);
		} else if (Static101.anInt2262 > arg1.anInt5754) {
			Static475.method7128(arg1, false);
			local17 = Static374.anInt7015;
			local15 = Static585.anInt9592;
		} else {
			Static633.method8663(arg1);
		}
		if (arg1.anInt8916 < 512 || arg1.anInt8911 < 512 || arg1.anInt8916 >= (Static634.anInt10129 - 1) * 512 || arg1.anInt8911 >= Static638.anInt10172 * 512 - 512) {
			arg1.anInt5718 = -1;
			arg1.anIntArray306 = null;
			local17 = 0;
			arg1.anInt5754 = 0;
			local15 = -1;
			arg1.anInt5717 = -1;
			arg1.anInt5720 = -1;
			arg1.anInt5788 = 0;
			arg1.anInt8916 = arg1.anIntArray310[0] * 512 + arg1.method5059() * 256;
			arg1.anInt8911 = arg1.anIntArray309[0] * 512 + arg1.method5059() * 256;
			arg1.method5068();
		}
		if (arg1 == Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2 && (arg1.anInt8916 < 6144 || arg1.anInt8911 < 6144 || arg1.anInt8916 >= (Static634.anInt10129 - 12) * 512 || (Static638.anInt10172 - 12) * 512 <= arg1.anInt8911)) {
			arg1.anInt5718 = -1;
			local15 = -1;
			arg1.anInt5754 = 0;
			arg1.anInt5717 = -1;
			local17 = 0;
			arg1.anInt5788 = 0;
			arg1.anIntArray306 = null;
			arg1.anInt5720 = -1;
			arg1.anInt8916 = arg1.anIntArray310[0] * 512 + arg1.method5059() * 256;
			arg1.anInt8911 = arg1.anIntArray309[0] * 512 + arg1.method5059() * 256;
			arg1.method5068();
		}
		@Pc(223) int local223 = Static452.method2911(arg1);
		Static223.method3719(arg1);
		Static580.method8226(local15, local17, local223, arg1);
		Static192.method3268(local15, arg1);
		Static130.method2518(arg1);
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(I[BLclient!mba;I)Lclient!ob;")
	public static Class242 method8093(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class5_Sub1_Sub2 arg1) {
		if (arg0 == null) {
			return null;
		}
		@Pc(9) int local9 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local9);
		OpenGL.glProgramRawARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static564.anIntArray596, 0);
		if (Static564.anIntArray596[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class242(arg1, 34336, local9);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
