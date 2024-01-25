import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static671 {

	@OriginalMember(owner = "client!wp", name = "Cd", descriptor = "Lclient!ha;")
	public static Class13 aClass13_21;

	@OriginalMember(owner = "client!wp", name = "cd", descriptor = "[I")
	public static final int[] anIntArray957 = new int[1];

	@OriginalMember(owner = "client!wp", name = "sd", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_158 = new Class218(82, -1);

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(II)Lclient!le;")
	public static Class3_Sub9 method9325(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return new Class3_Sub9_Sub16();
		} else if (arg0 == 1) {
			return new Class3_Sub9_Sub32();
		} else if (arg0 == 2) {
			return new Class3_Sub9_Sub4();
		} else if (arg0 == 3) {
			return new Class3_Sub9_Sub28();
		} else if (arg0 == 4) {
			return new Class3_Sub9_Sub19();
		} else if (arg0 == 5) {
			return new Class3_Sub9_Sub13();
		} else if (arg0 == 6) {
			return new Class3_Sub9_Sub21();
		} else if (arg0 == 7) {
			return new Class3_Sub9_Sub14();
		} else if (arg0 == 8) {
			return new Class3_Sub9_Sub37();
		} else if (arg0 == 9) {
			return new Class3_Sub9_Sub22();
		} else if (arg0 == 10) {
			return new Class3_Sub9_Sub27();
		} else if (arg0 == 11) {
			return new Class3_Sub9_Sub11();
		} else if (arg0 == 12) {
			return new Class3_Sub9_Sub33();
		} else if (arg0 == 13) {
			return new Class3_Sub9_Sub20();
		} else if (arg0 == 14) {
			return new Class3_Sub9_Sub39();
		} else if (arg0 == 15) {
			return new Class3_Sub9_Sub18();
		} else if (arg0 == 16) {
			return new Class3_Sub9_Sub10();
		} else if (arg0 == 17) {
			return new Class3_Sub9_Sub2();
		} else if (arg0 == 18) {
			return new Class3_Sub9_Sub3_Sub1();
		} else if (arg0 == 19) {
			return new Class3_Sub9_Sub35();
		} else if (arg0 == 20) {
			return new Class3_Sub9_Sub17();
		} else if (arg0 == 21) {
			return new Class3_Sub9_Sub23();
		} else if (arg0 == 22) {
			return new Class3_Sub9_Sub34();
		} else if (arg0 == 23) {
			return new Class3_Sub9_Sub31();
		} else if (arg0 == 24) {
			return new Class3_Sub9_Sub5();
		} else if (arg0 == 25) {
			return new Class3_Sub9_Sub29();
		} else if (arg0 == 26) {
			return new Class3_Sub9_Sub24();
		} else if (arg0 == 27) {
			return new Class3_Sub9_Sub8();
		} else if (arg0 == 28) {
			return new Class3_Sub9_Sub1();
		} else if (arg0 == 29) {
			return new Class3_Sub9_Sub9();
		} else if (arg0 == 30) {
			return new Class3_Sub9_Sub30();
		} else if (arg0 == 31) {
			return new Class3_Sub9_Sub12();
		} else if (arg0 == 32) {
			return new Class3_Sub9_Sub25();
		} else if (arg0 == 33) {
			return new Class3_Sub9_Sub6();
		} else if (arg0 == 34) {
			return new Class3_Sub9_Sub7();
		} else if (arg0 == 35) {
			return new Class3_Sub9_Sub15();
		} else if (arg0 == 36) {
			return new Class3_Sub9_Sub36();
		} else if (arg0 == 37) {
			return new Class3_Sub9_Sub26();
		} else if (arg0 == 38) {
			return new Class3_Sub9_Sub38();
		} else if (arg0 == 39) {
			return new Class3_Sub9_Sub3();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(IB)V")
	public static void method9327(@OriginalArg(0) int arg0) {
		@Pc(15) Class3_Sub11_Sub4 local15 = Static583.method8201(17, (long) arg0);
		local15.method2194();
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Z[Lclient!qea;Lclient!pa;)Lclient!os;")
	public static Class261 method9331(@OriginalArg(1) Class281[] arg0, @OriginalArg(2) Class13_Sub1_Sub1 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] == null || arg0[local7].aLong241 <= 0L) {
				return null;
			}
		}
		@Pc(29) long local29 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(31) int local31 = 0; local31 < arg0.length; local31++) {
			OpenGL.glAttachObjectARB(local29, arg0[local31].aLong241);
		}
		OpenGL.glLinkProgramARB(local29);
		OpenGL.glGetObjectParameterivARB(local29, 35714, Static370.anIntArray521, 0);
		if (Static370.anIntArray521[0] == 0) {
			if (Static370.anIntArray521[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local29, 35716, Static370.anIntArray521, 1);
			if (Static370.anIntArray521[1] > 1) {
				@Pc(92) byte[] local92 = new byte[Static370.anIntArray521[1]];
				OpenGL.glGetInfoLogARB(local29, Static370.anIntArray521[1], Static370.anIntArray521, 0, local92, 0);
				System.out.println(new String(local92));
			}
			if (Static370.anIntArray521[0] == 0) {
				for (@Pc(113) int local113 = 0; local113 < arg0.length; local113++) {
					OpenGL.glDetachObjectARB(local29, arg0[local113].aLong241);
				}
				OpenGL.glDeleteObjectARB(local29);
				return null;
			}
		}
		return new Class261(arg1, local29, arg0);
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!jp;I)Lclient!og;")
	public static Class55_Sub3 method9332(@OriginalArg(0) Class3_Sub25 arg0) {
		return new Class55_Sub3(arg0.method8589(), arg0.method8589(), arg0.method8589(), arg0.method8589(), arg0.method8607(), arg0.method8607(), arg0.method8632());
	}
}
