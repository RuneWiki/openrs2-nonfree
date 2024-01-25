import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
	public static int anInt7300;

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "Lclient!pl;")
	public static Class259 aClass259_134;

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_134 = new Class286(40, -1);

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "([[BLclient!gl;B)V")
	public static void method6119(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class49_Sub1 arg1) {
		@Pc(8) int local8 = Static420.aByteArrayArray27.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			@Pc(21) byte[] local21 = arg0[local10];
			if (local21 != null) {
				@Pc(34) int local34 = (Static234.anIntArray280[local10] >> 8) * 64 - Static35.anInt906;
				@Pc(45) int local45 = (Static234.anIntArray280[local10] & 0xFF) * 64 - Static130.anInt5246;
				Static352.method5248();
				arg1.method3005(local34, Static307.aClass100_6, local45, local21, Static495.aClass355Array1);
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)Lclient!mca;")
	public static Class2_Sub2 method6121(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return new Class2_Sub2_Sub15();
		} else if (arg0 == 1) {
			return new Class2_Sub2_Sub38();
		} else if (arg0 == 2) {
			return new Class2_Sub2_Sub6();
		} else if (arg0 == 3) {
			return new Class2_Sub2_Sub3();
		} else if (arg0 == 4) {
			return new Class2_Sub2_Sub22();
		} else if (arg0 == 5) {
			return new Class2_Sub2_Sub23();
		} else if (arg0 == 6) {
			return new Class2_Sub2_Sub7();
		} else if (arg0 == 7) {
			return new Class2_Sub2_Sub21();
		} else if (arg0 == 8) {
			return new Class2_Sub2_Sub18();
		} else if (arg0 == 9) {
			return new Class2_Sub2_Sub32();
		} else if (arg0 == 10) {
			return new Class2_Sub2_Sub30();
		} else if (arg0 == 11) {
			return new Class2_Sub2_Sub27();
		} else if (arg0 == 12) {
			return new Class2_Sub2_Sub13();
		} else if (arg0 == 13) {
			return new Class2_Sub2_Sub33();
		} else if (arg0 == 14) {
			return new Class2_Sub2_Sub29();
		} else if (arg0 == 15) {
			return new Class2_Sub2_Sub26();
		} else if (arg0 == 16) {
			return new Class2_Sub2_Sub17();
		} else if (arg0 == 17) {
			return new Class2_Sub2_Sub24();
		} else if (arg0 == 18) {
			return new Class2_Sub2_Sub2_Sub1();
		} else if (arg0 == 19) {
			return new Class2_Sub2_Sub10();
		} else if (arg0 == 20) {
			return new Class2_Sub2_Sub39();
		} else if (arg0 == 21) {
			return new Class2_Sub2_Sub11();
		} else if (arg0 == 22) {
			return new Class2_Sub2_Sub19();
		} else if (arg0 == 23) {
			return new Class2_Sub2_Sub4();
		} else if (arg0 == 24) {
			return new Class2_Sub2_Sub12();
		} else if (arg0 == 25) {
			return new Class2_Sub2_Sub1();
		} else if (arg0 == 26) {
			return new Class2_Sub2_Sub28();
		} else if (arg0 == 27) {
			return new Class2_Sub2_Sub8();
		} else if (arg0 == 28) {
			return new Class2_Sub2_Sub20();
		} else if (arg0 == 29) {
			return new Class2_Sub2_Sub5();
		} else if (arg0 == 30) {
			return new Class2_Sub2_Sub9();
		} else if (arg0 == 31) {
			return new Class2_Sub2_Sub37();
		} else if (arg0 == 32) {
			return new Class2_Sub2_Sub34();
		} else if (arg0 == 33) {
			return new Class2_Sub2_Sub25();
		} else if (arg0 == 34) {
			return new Class2_Sub2_Sub35();
		} else if (arg0 == 35) {
			return new Class2_Sub2_Sub36();
		} else if (arg0 == 36) {
			return new Class2_Sub2_Sub14();
		} else if (arg0 == 37) {
			return new Class2_Sub2_Sub16();
		} else if (arg0 == 38) {
			return new Class2_Sub2_Sub31();
		} else if (arg0 == 39) {
			return new Class2_Sub2_Sub2();
		} else {
			return null;
		}
	}
}
