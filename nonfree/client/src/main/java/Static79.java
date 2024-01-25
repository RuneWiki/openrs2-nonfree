import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!dt", name = "F", descriptor = "I")
	public static int anInt1568 = 0;

	@OriginalMember(owner = "client!dt", name = "Q", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_22 = new Class237(41, 6);

	@OriginalMember(owner = "client!dt", name = "R", descriptor = "[I")
	public static final int[] anIntArray145 = new int[1];

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IB)Lclient!oh;")
	public static Class1_Sub3 method1379(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return new Class1_Sub3_Sub21();
		} else if (arg0 == 1) {
			return new Class1_Sub3_Sub34();
		} else if (arg0 == 2) {
			return new Class1_Sub3_Sub29();
		} else if (arg0 == 3) {
			return new Class1_Sub3_Sub12();
		} else if (arg0 == 4) {
			return new Class1_Sub3_Sub19();
		} else if (arg0 == 5) {
			return new Class1_Sub3_Sub24();
		} else if (arg0 == 6) {
			return new Class1_Sub3_Sub36();
		} else if (arg0 == 7) {
			return new Class1_Sub3_Sub25();
		} else if (arg0 == 8) {
			return new Class1_Sub3_Sub22();
		} else if (arg0 == 9) {
			return new Class1_Sub3_Sub18();
		} else if (arg0 == 10) {
			return new Class1_Sub3_Sub33();
		} else if (arg0 == 11) {
			return new Class1_Sub3_Sub6();
		} else if (arg0 == 12) {
			return new Class1_Sub3_Sub9();
		} else if (arg0 == 13) {
			return new Class1_Sub3_Sub28();
		} else if (arg0 == 14) {
			return new Class1_Sub3_Sub39();
		} else if (arg0 == 15) {
			return new Class1_Sub3_Sub17();
		} else if (arg0 == 16) {
			return new Class1_Sub3_Sub5();
		} else if (arg0 == 17) {
			return new Class1_Sub3_Sub2();
		} else if (arg0 == 18) {
			return new Class1_Sub3_Sub16_Sub1();
		} else if (arg0 == 19) {
			return new Class1_Sub3_Sub1();
		} else if (arg0 == 20) {
			return new Class1_Sub3_Sub3();
		} else if (arg0 == 21) {
			return new Class1_Sub3_Sub7();
		} else if (arg0 == 22) {
			return new Class1_Sub3_Sub8();
		} else if (arg0 == 23) {
			return new Class1_Sub3_Sub4();
		} else if (arg0 == 24) {
			return new Class1_Sub3_Sub38();
		} else if (arg0 == 25) {
			return new Class1_Sub3_Sub23();
		} else if (arg0 == 26) {
			return new Class1_Sub3_Sub37();
		} else if (arg0 == 27) {
			return new Class1_Sub3_Sub30();
		} else if (arg0 == 28) {
			return new Class1_Sub3_Sub27();
		} else if (arg0 == 29) {
			return new Class1_Sub3_Sub10();
		} else if (arg0 == 30) {
			return new Class1_Sub3_Sub20();
		} else if (arg0 == 31) {
			return new Class1_Sub3_Sub32();
		} else if (arg0 == 32) {
			return new Class1_Sub3_Sub31();
		} else if (arg0 == 33) {
			return new Class1_Sub3_Sub13();
		} else if (arg0 == 34) {
			return new Class1_Sub3_Sub15();
		} else if (arg0 == 35) {
			return new Class1_Sub3_Sub35();
		} else if (arg0 == 36) {
			return new Class1_Sub3_Sub11();
		} else if (arg0 == 37) {
			return new Class1_Sub3_Sub14();
		} else if (arg0 == 38) {
			return new Class1_Sub3_Sub26();
		} else if (arg0 == 39) {
			return new Class1_Sub3_Sub16();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(IB)[B")
	public static byte[] method1380(@OriginalArg(0) int arg0) {
		@Pc(19) Class1_Sub2_Sub4 local19 = (Class1_Sub2_Sub4) Static324.aClass90_2.method1862((long) arg0);
		if (local19 == null) {
			@Pc(24) byte[] local24 = new byte[512];
			@Pc(30) Random local30 = new Random((long) arg0);
			for (@Pc(32) int local32 = 0; local32 < 255; local32++) {
				local24[local32] = (byte) local32;
			}
			for (@Pc(47) int local47 = 0; local47 < 255; local47++) {
				@Pc(54) int local54 = 255 - local47;
				@Pc(59) int local59 = Static301.method3334(local54, local30);
				@Pc(63) byte local63 = local24[local59];
				local24[local59] = local24[local54];
				local24[local54] = local24[511 - local47] = local63;
			}
			local19 = new Class1_Sub2_Sub4(local24);
			Static324.aClass90_2.method1865((long) arg0, local19);
		}
		return local19.aByteArray15;
	}
}
