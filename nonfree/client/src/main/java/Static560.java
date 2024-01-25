import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static560 {

	@OriginalMember(owner = "client!ro", name = "i", descriptor = "Lclient!lf;")
	public static Class221 aClass221_3;

	@OriginalMember(owner = "client!ro", name = "l", descriptor = "Lclient!nca;")
	public static Class254 aClass254_138;

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIII)V")
	public static void method7797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) Class2_Sub6_Sub12 local9 = Static636.method8647(8, (long) arg3);
		local9.method6239();
		local9.anInt6938 = arg0;
		local9.anInt6936 = arg2;
		local9.anInt6934 = arg1;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(BLjava/lang/String;Lclient!uja;I)Lclient!cd;")
	public static Class56 method7801(@OriginalArg(1) String arg0, @OriginalArg(2) Class145_Sub3 arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static598.anIntArray679, 0);
		if (Static598.anIntArray679[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class56(arg1, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Z)V")
	public static void method7804() {
		aClass221_3.method5174();
		aClass221_3.aClass225_109 = null;
		aClass221_3.anInt5773 = 0;
		aClass221_3.aClass225_108 = null;
		aClass221_3.aClass225_111 = null;
		Static283.anInt8842 = 0;
		aClass221_3.anInt5770 = 0;
		aClass221_3.aClass225_110 = null;
		aClass221_3.aClass2_Sub20_Sub2_2.anInt9723 = 0;
		Static278.method3934();
		Static354.method5098();
		for (@Pc(38) int local38 = 0; local38 < 2048; local38++) {
			Static157.aClass4_Sub2_Sub1_Sub2_Sub1Array1[local38] = null;
		}
		Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2 = null;
		for (@Pc(56) int local56 = 0; local56 < Static676.anInt10488; local56++) {
			@Pc(65) Class4_Sub2_Sub1_Sub2_Sub2 local65 = Static459.aClass2_Sub49Array1[local56].aClass4_Sub2_Sub1_Sub2_Sub2_3;
			if (local65 != null) {
				local65.anInt2348 = -1;
			}
		}
		Static183.method2657();
		Static60.anInt1040 = 1;
		Static253.anInt3964 = -1;
		Static45.anInt602 = -1;
		Static261.method9374(-99, 11);
		for (@Pc(96) int local96 = 0; local96 < 100; local96++) {
			Static537.aBooleanArray25[local96] = true;
		}
		Static237.method9870();
		Static33.aClass2_Sub25_1 = null;
		Static195.aLong110 = 0L;
	}
}
