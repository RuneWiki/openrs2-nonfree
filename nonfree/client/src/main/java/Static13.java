import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!am", name = "e", descriptor = "I")
	public static int anInt184;

	@OriginalMember(owner = "client!am", name = "k", descriptor = "F")
	public static float aFloat9;

	@OriginalMember(owner = "client!am", name = "R", descriptor = "Lclient!nk;")
	public static Class121 aClass121_11;

	@OriginalMember(owner = "client!am", name = "T", descriptor = "Z")
	public static boolean aBoolean6;

	@OriginalMember(owner = "client!am", name = "z", descriptor = "Lclient!gj;")
	public static Class59 aClass59_8 = new Class59();

	@OriginalMember(owner = "client!am", name = "S", descriptor = "Lclient!en;")
	public static Class1_Sub14_Sub1 aClass1_Sub14_Sub1_1 = new Class1_Sub14_Sub1(5000);

	@OriginalMember(owner = "client!am", name = "X", descriptor = "[B")
	public static byte[] aByteArray1 = new byte[520];

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ILclient!nk;II)[Lclient!pa;")
	public static Class1_Sub2_Sub1[] method170(@OriginalArg(1) Class121 arg0, @OriginalArg(2) int arg1) {
		return Static313.method2575(arg1, 0, arg0) ? Static272.method4760() : null;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "([I[Ljava/lang/Object;B)V")
	public static void method171(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1) {
		Static153.method2611(arg1, arg0.length - 1, arg0, 0);
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(B)V")
	public static void method172() {
		@Pc(7) int local7 = 0;
		for (@Pc(17) int local17 = 0; local17 < 104; local17++) {
			for (@Pc(24) int local24 = 0; local24 < 104; local24++) {
				if (Static266.method4191(local7, local24, Static105.aClass1_Sub33ArrayArrayArray2, local17, true)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(II)Lclient!rf;")
	public static Class1_Sub4 method174(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return new Class1_Sub4_Sub5();
		} else if (arg0 == 1) {
			return new Class1_Sub4_Sub2();
		} else if (arg0 == 2) {
			return new Class1_Sub4_Sub36();
		} else if (arg0 == 3) {
			return new Class1_Sub4_Sub25();
		} else if (arg0 == 4) {
			return new Class1_Sub4_Sub35();
		} else if (arg0 == 5) {
			return new Class1_Sub4_Sub10();
		} else if (arg0 == 6) {
			return new Class1_Sub4_Sub7();
		} else if (arg0 == 7) {
			return new Class1_Sub4_Sub23();
		} else if (arg0 == 8) {
			return new Class1_Sub4_Sub6();
		} else if (arg0 == 9) {
			return new Class1_Sub4_Sub30();
		} else if (arg0 == 10) {
			return new Class1_Sub4_Sub37();
		} else if (arg0 == 11) {
			return new Class1_Sub4_Sub39();
		} else if (arg0 == 12) {
			return new Class1_Sub4_Sub38();
		} else if (arg0 == 13) {
			return new Class1_Sub4_Sub21();
		} else if (arg0 == 14) {
			return new Class1_Sub4_Sub28();
		} else if (arg0 == 15) {
			return new Class1_Sub4_Sub3();
		} else if (arg0 == 16) {
			return new Class1_Sub4_Sub12();
		} else if (arg0 == 17) {
			return new Class1_Sub4_Sub27();
		} else if (arg0 == 18) {
			return new Class1_Sub4_Sub8_Sub1();
		} else if (arg0 == 19) {
			return new Class1_Sub4_Sub31();
		} else if (arg0 == 20) {
			return new Class1_Sub4_Sub26();
		} else if (arg0 == 21) {
			return new Class1_Sub4_Sub29();
		} else if (arg0 == 22) {
			return new Class1_Sub4_Sub11();
		} else if (arg0 == 23) {
			return new Class1_Sub4_Sub18();
		} else if (arg0 == 24) {
			return new Class1_Sub4_Sub32();
		} else if (arg0 == 25) {
			return new Class1_Sub4_Sub1();
		} else if (arg0 == 26) {
			return new Class1_Sub4_Sub4();
		} else if (arg0 == 27) {
			return new Class1_Sub4_Sub34();
		} else if (arg0 == 28) {
			return new Class1_Sub4_Sub16();
		} else if (arg0 == 29) {
			return new Class1_Sub4_Sub33();
		} else if (arg0 == 30) {
			return new Class1_Sub4_Sub24();
		} else if (arg0 == 31) {
			return new Class1_Sub4_Sub14();
		} else if (arg0 == 32) {
			return new Class1_Sub4_Sub17();
		} else if (arg0 == 33) {
			return new Class1_Sub4_Sub9();
		} else if (arg0 == 34) {
			return new Class1_Sub4_Sub20();
		} else if (arg0 == 35) {
			return new Class1_Sub4_Sub13();
		} else if (arg0 == 36) {
			return new Class1_Sub4_Sub15();
		} else if (arg0 == 37) {
			return new Class1_Sub4_Sub22();
		} else if (arg0 == 38) {
			return new Class1_Sub4_Sub19();
		} else if (arg0 == 39) {
			return new Class1_Sub4_Sub8();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ZII)I")
	public static int method175(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) Class1_Sub7 local6 = (Class1_Sub7) Static229.aClass142_19.method3543((long) arg0);
		if (local6 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local6.anIntArray22.length) {
			return local6.anIntArray22[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!am", name = "c", descriptor = "(B)V")
	public static void method176() {
		@Pc(3) int local3 = Static103.anInt2068;
		@Pc(17) int local17 = Static209.anInt3975;
		@Pc(24) int local24 = Static171.anInt3365 - Static292.anInt5236 - local3;
		@Pc(31) int local31 = Static132.anInt3685 - Static120.anInt2505 - local17;
		if (local3 <= 0 && local24 <= 0 && local17 <= 0 && local31 <= 0) {
			return;
		}
		try {
			@Pc(59) Container local59;
			if (Static275.aFrame2 != null) {
				local59 = Static275.aFrame2;
			} else if (Static197.aFrame1 == null) {
				local59 = Static26.aClass154_1.anApplet1;
			} else {
				local59 = Static197.aFrame1;
			}
			@Pc(70) int local70 = 0;
			@Pc(72) int local72 = 0;
			if (local59 == Static197.aFrame1) {
				@Pc(79) Insets local79 = Static197.aFrame1.getInsets();
				local70 = local79.left;
				local72 = local79.top;
			}
			@Pc(88) Graphics local88 = local59.getGraphics();
			local88.setColor(Color.black);
			if (local3 > 0) {
				local88.fillRect(local70, local72, local3, Static132.anInt3685);
			}
			if (local17 > 0) {
				local88.fillRect(local70, local72, Static171.anInt3365, local17);
			}
			if (local24 > 0) {
				local88.fillRect(Static171.anInt3365 + local70 - local24, local72, local24, Static132.anInt3685);
			}
			if (local31 > 0) {
				local88.fillRect(local70, Static132.anInt3685 + local72 - local31, Static171.anInt3365, local31);
			}
		} catch (@Pc(140) Exception local140) {
		}
	}
}
