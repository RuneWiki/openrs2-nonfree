import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!bda", name = "f", descriptor = "Z")
	public static boolean aBoolean69 = false;

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(ILclient!sl;)Lclient!ufa;")
	public static Class56_Sub1_Sub1 method847(@OriginalArg(1) Class2_Sub17 arg0) {
		@Pc(14) Class56_Sub1 local14 = Static125.method2246(arg0);
		@Pc(18) int local18 = arg0.method2836();
		return new Class56_Sub1_Sub1(local14.aClass97_15, local14.aClass252_11, local14.anInt9417, local14.anInt9419, local14.anInt9422, local14.anInt9414, local14.anInt9421, local14.anInt9415, local14.anInt9412, local14.anInt9425, local14.anInt9433, local14.anInt9426, local14.anInt9423, local14.anInt9430, local14.anInt9431, local18);
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(ILclient!ria;BIILclient!jl;ILclient!da;Ljava/lang/String;Lclient!aa;II)V")
	public static void method848(@OriginalArg(0) int arg0, @OriginalArg(1) Class303 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class183 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class37 arg6, @OriginalArg(8) String arg7, @OriginalArg(9) Class1 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(15) int local15;
		if (Static407.anInt6909 == 4) {
			local15 = (int) Static225.aFloat85 & 0x3FFF;
		} else {
			local15 = (int) Static225.aFloat85 + Static463.anInt7491 & 0x3FFF;
		}
		@Pc(34) int local34 = Math.max(arg1.anInt7914 / 2, arg1.anInt7971 / 2) + 10;
		@Pc(43) int local43 = arg2 * arg2 + arg10 * arg10;
		if (local43 > local34 * local34) {
			return;
		}
		@Pc(53) int local53 = Class290.anIntArray546[local15];
		@Pc(57) int local57 = Class290.anIntArray547[local15];
		if (Static407.anInt6909 != 4) {
			local57 = local57 * 256 / (Static594.anInt9866 + 256);
			local53 = local53 * 256 / (Static594.anInt9866 + 256);
		}
		@Pc(89) int local89 = local53 * arg10 + local57 * arg2 >> 14;
		@Pc(100) int local100 = arg10 * local57 - arg2 * local53 >> 14;
		@Pc(123) int local123 = arg4.method4452(100, (Class31[]) null, arg7);
		@Pc(129) int local129 = local89 - local123 / 2;
		@Pc(137) int local137 = arg4.method4456((Class31[]) null, arg7, 100, 0);
		if (-arg1.anInt7914 <= local129 && arg1.anInt7914 >= local129 && local100 >= -arg1.anInt7971 && arg1.anInt7971 >= local100) {
			arg6.method6078(1, arg5 + arg1.anInt7971 / 2 - local137 - local100 - arg9, arg0, arg1.anInt7914 / 2 + local129 + arg3, local123, arg5, 0, (int[]) null, 50, 0, 0, arg3, arg8, arg7, (Class31[]) null);
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(BI)Lclient!au;")
	public static Class2_Sub4 method849(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return new Class2_Sub4_Sub25();
		} else if (arg0 == 1) {
			return new Class2_Sub4_Sub12();
		} else if (arg0 == 2) {
			return new Class2_Sub4_Sub33();
		} else if (arg0 == 3) {
			return new Class2_Sub4_Sub16();
		} else if (arg0 == 4) {
			return new Class2_Sub4_Sub24();
		} else if (arg0 == 5) {
			return new Class2_Sub4_Sub36();
		} else if (arg0 == 6) {
			return new Class2_Sub4_Sub34();
		} else if (arg0 == 7) {
			return new Class2_Sub4_Sub26();
		} else if (arg0 == 8) {
			return new Class2_Sub4_Sub21();
		} else if (arg0 == 9) {
			return new Class2_Sub4_Sub3();
		} else if (arg0 == 10) {
			return new Class2_Sub4_Sub22();
		} else if (arg0 == 11) {
			return new Class2_Sub4_Sub39();
		} else if (arg0 == 12) {
			return new Class2_Sub4_Sub18();
		} else if (arg0 == 13) {
			return new Class2_Sub4_Sub32();
		} else if (arg0 == 14) {
			return new Class2_Sub4_Sub37();
		} else if (arg0 == 15) {
			return new Class2_Sub4_Sub4();
		} else if (arg0 == 16) {
			return new Class2_Sub4_Sub1();
		} else if (arg0 == 17) {
			return new Class2_Sub4_Sub6();
		} else if (arg0 == 18) {
			return new Class2_Sub4_Sub29_Sub1();
		} else if (arg0 == 19) {
			return new Class2_Sub4_Sub13();
		} else if (arg0 == 20) {
			return new Class2_Sub4_Sub30();
		} else if (arg0 == 21) {
			return new Class2_Sub4_Sub27();
		} else if (arg0 == 22) {
			return new Class2_Sub4_Sub14();
		} else if (arg0 == 23) {
			return new Class2_Sub4_Sub5();
		} else if (arg0 == 24) {
			return new Class2_Sub4_Sub35();
		} else if (arg0 == 25) {
			return new Class2_Sub4_Sub10();
		} else if (arg0 == 26) {
			return new Class2_Sub4_Sub15();
		} else if (arg0 == 27) {
			return new Class2_Sub4_Sub11();
		} else if (arg0 == 28) {
			return new Class2_Sub4_Sub8();
		} else if (arg0 == 29) {
			return new Class2_Sub4_Sub20();
		} else if (arg0 == 30) {
			return new Class2_Sub4_Sub28();
		} else if (arg0 == 31) {
			return new Class2_Sub4_Sub17();
		} else if (arg0 == 32) {
			return new Class2_Sub4_Sub7();
		} else if (arg0 == 33) {
			return new Class2_Sub4_Sub38();
		} else if (arg0 == 34) {
			return new Class2_Sub4_Sub9();
		} else if (arg0 == 35) {
			return new Class2_Sub4_Sub19();
		} else if (arg0 == 36) {
			return new Class2_Sub4_Sub31();
		} else if (arg0 == 37) {
			return new Class2_Sub4_Sub2();
		} else if (arg0 == 38) {
			return new Class2_Sub4_Sub23();
		} else if (arg0 == 39) {
			return new Class2_Sub4_Sub29();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(IIILclient!rea;)V")
	public static void method850(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class299 arg2) {
		Static403.aClass299ArrayArray1[arg0][arg1] = arg2;
	}
}
