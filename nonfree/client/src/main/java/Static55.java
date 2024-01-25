import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "Z")
	public static boolean aBoolean105;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "Lclient!rba;")
	public static final Class278 aClass278_2 = new Class278("", 15);

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
	public static int anInt1301 = -1;

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "[I")
	public static final int[] anIntArray77 = new int[500];

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
	public static int anInt1303 = 0;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)Z")
	public static boolean method1311() {
		@Pc(10) boolean local10 = true;
		if (Static15.aClass20_1 == null) {
			if (Static579.aClass254_137.method6417(Static451.anInt8595)) {
				Static15.aClass20_1 = Static599.method806(Static579.aClass254_137, Static451.anInt8595);
			} else {
				local10 = false;
			}
		}
		if (Static374.aClass20_3 == null) {
			if (Static579.aClass254_137.method6417(Static2.anInt130)) {
				Static374.aClass20_3 = Static599.method806(Static579.aClass254_137, Static2.anInt130);
			} else {
				local10 = false;
			}
		}
		if (Static366.aClass20_2 == null) {
			if (Static579.aClass254_137.method6417(Static234.anInt4851)) {
				Static366.aClass20_2 = Static599.method806(Static579.aClass254_137, Static234.anInt4851);
			} else {
				local10 = false;
			}
		}
		if (Static54.aClass297_6 == null) {
			if (Static289.aClass254_92.method6417(Static224.anInt4555)) {
				Static54.aClass297_6 = Static356.method5901(Static289.aClass254_92, Static224.anInt4555);
			} else {
				local10 = false;
			}
		}
		if (Static445.aClass20Array1 == null) {
			if (Static579.aClass254_137.method6417(Static224.anInt4555)) {
				Static445.aClass20Array1 = Static599.method819(Static579.aClass254_137, Static224.anInt4555);
			} else {
				local10 = false;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIIILjava/lang/String;)V")
	public static void method1313(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6) {
		@Pc(7) Class55_Sub5 local7 = new Class55_Sub5();
		local7.anInt7147 = arg4;
		local7.anInt7148 = arg5;
		local7.anInt7145 = arg0;
		local7.aString80 = arg6;
		local7.anInt7142 = arg2;
		local7.anInt7141 = arg3;
		local7.anInt7143 = Static129.anInt10429 + arg1;
		Static206.aClass134_10.method3236(local7);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I[BILclient!ia;)Lclient!ne;")
	public static Class226 method1314(@OriginalArg(1) byte[] arg0, @OriginalArg(3) Class15_Sub2_Sub1 arg1) {
		if (arg0 == null) {
			return null;
		}
		@Pc(9) int local9 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local9);
		OpenGL.glProgramRawARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static334.anIntArray446, 0);
		if (Static334.anIntArray446[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class226(arg1, 34336, local9);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
