import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "Lclient!dj;")
	public static Class57 aClass57_1;

	@OriginalMember(owner = "client!bw", name = "d", descriptor = "Lclient!ik;")
	public static final Class117 aClass117_2 = new Class117();

	@OriginalMember(owner = "client!bw", name = "f", descriptor = "[F")
	public static final float[] aFloatArray12 = new float[4];

	@OriginalMember(owner = "client!bw", name = "g", descriptor = "I")
	public static int anInt1087 = 0;

	@OriginalMember(owner = "client!bw", name = "h", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_18 = new Class177(23, 3);

	@OriginalMember(owner = "client!bw", name = "i", descriptor = "[Lclient!ia;")
	public static final Class1_Sub3[] aClass1_Sub3Array1 = new Class1_Sub3[2048];

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(I[I[IIB)V")
	public static void method789(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		if (arg0 >= arg3) {
			return;
		}
		@Pc(14) int local14 = (arg3 + arg0) / 2;
		@Pc(16) int local16 = arg0;
		@Pc(20) int local20 = arg1[local14];
		arg1[local14] = arg1[arg3];
		arg1[arg3] = local20;
		@Pc(34) int local34 = arg2[local14];
		arg2[local14] = arg2[arg3];
		arg2[arg3] = local34;
		@Pc(51) int local51 = local20 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(53) int local53 = arg0; local53 < arg3; local53++) {
			if ((local51 & local53) + local20 > arg1[local53]) {
				@Pc(68) int local68 = arg1[local53];
				arg1[local53] = arg1[local16];
				arg1[local16] = local68;
				@Pc(82) int local82 = arg2[local53];
				arg2[local53] = arg2[local16];
				arg2[local16++] = local82;
			}
		}
		arg1[arg3] = arg1[local16];
		arg1[local16] = local20;
		arg2[arg3] = arg2[local16];
		arg2[local16] = local34;
		method789(arg0, arg1, arg2, local16 - 1);
		method789(local16 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IB)Lclient!pj;")
	public static Class1_Sub8 method790(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return new Class1_Sub8_Sub24();
		} else if (arg0 == 1) {
			return new Class1_Sub8_Sub3();
		} else if (arg0 == 2) {
			return new Class1_Sub8_Sub6();
		} else if (arg0 == 3) {
			return new Class1_Sub8_Sub32();
		} else if (arg0 == 4) {
			return new Class1_Sub8_Sub18();
		} else if (arg0 == 5) {
			return new Class1_Sub8_Sub35();
		} else if (arg0 == 6) {
			return new Class1_Sub8_Sub29();
		} else if (arg0 == 7) {
			return new Class1_Sub8_Sub28();
		} else if (arg0 == 8) {
			return new Class1_Sub8_Sub34();
		} else if (arg0 == 9) {
			return new Class1_Sub8_Sub30();
		} else if (arg0 == 10) {
			return new Class1_Sub8_Sub39();
		} else if (arg0 == 11) {
			return new Class1_Sub8_Sub4();
		} else if (arg0 == 12) {
			return new Class1_Sub8_Sub10();
		} else if (arg0 == 13) {
			return new Class1_Sub8_Sub16();
		} else if (arg0 == 14) {
			return new Class1_Sub8_Sub7();
		} else if (arg0 == 15) {
			return new Class1_Sub8_Sub31();
		} else if (arg0 == 16) {
			return new Class1_Sub8_Sub20();
		} else if (arg0 == 17) {
			return new Class1_Sub8_Sub33();
		} else if (arg0 == 18) {
			return new Class1_Sub8_Sub27_Sub1();
		} else if (arg0 == 19) {
			return new Class1_Sub8_Sub23();
		} else if (arg0 == 20) {
			return new Class1_Sub8_Sub17();
		} else if (arg0 == 21) {
			return new Class1_Sub8_Sub19();
		} else if (arg0 == 22) {
			return new Class1_Sub8_Sub5();
		} else if (arg0 == 23) {
			return new Class1_Sub8_Sub26();
		} else if (arg0 == 24) {
			return new Class1_Sub8_Sub13();
		} else if (arg0 == 25) {
			return new Class1_Sub8_Sub12();
		} else if (arg0 == 26) {
			return new Class1_Sub8_Sub8();
		} else if (arg0 == 27) {
			return new Class1_Sub8_Sub25();
		} else if (arg0 == 28) {
			return new Class1_Sub8_Sub14();
		} else if (arg0 == 29) {
			return new Class1_Sub8_Sub21();
		} else if (arg0 == 30) {
			return new Class1_Sub8_Sub11();
		} else if (arg0 == 31) {
			return new Class1_Sub8_Sub2();
		} else if (arg0 == 32) {
			return new Class1_Sub8_Sub15();
		} else if (arg0 == 33) {
			return new Class1_Sub8_Sub38();
		} else if (arg0 == 34) {
			return new Class1_Sub8_Sub37();
		} else if (arg0 == 35) {
			return new Class1_Sub8_Sub22();
		} else if (arg0 == 36) {
			return new Class1_Sub8_Sub36();
		} else if (arg0 == 37) {
			return new Class1_Sub8_Sub9();
		} else if (arg0 == 38) {
			return new Class1_Sub8_Sub1();
		} else if (arg0 == 39) {
			return new Class1_Sub8_Sub27();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(III)I")
	public static int method792(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}
}
