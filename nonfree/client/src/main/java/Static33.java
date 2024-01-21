import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!gd", name = "o", descriptor = "Lclient!pb;")
	public static Class31 aClass31_16;

	@OriginalMember(owner = "client!gd", name = "x", descriptor = "Lclient!p;")
	public static Class33_Sub1 aClass33_Sub1_11;

	@OriginalMember(owner = "client!gd", name = "z", descriptor = "Lclient!lb;")
	public static Class38 aClass38_1;

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
	public static int anInt843 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "Lclient!mc;")
	private static Class42 aClass42_449 = Static23.method501("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "Lclient!fa;")
	public static Class22 aClass22_7 = new Class22();

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "Lclient!mc;")
	public static Class42 aClass42_450 = Static23.method501("(U(Y");

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "Lclient!mc;")
	public static Class42 aClass42_451 = Static23.method501("Lade Konfig )2 ");

	@OriginalMember(owner = "client!gd", name = "r", descriptor = "Lclient!mc;")
	private static Class42 aClass42_454 = Static23.method501("Enter name of player to delete from list");

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "Lclient!mc;")
	public static Class42 aClass42_452 = aClass42_454;

	@OriginalMember(owner = "client!gd", name = "n", descriptor = "[Lclient!v;")
	public static Class1_Sub1_Sub8_Sub1_Sub2[] aClass1_Sub1_Sub8_Sub1_Sub2Array1 = new Class1_Sub1_Sub8_Sub1_Sub2[2048];

	@OriginalMember(owner = "client!gd", name = "p", descriptor = "Lclient!mc;")
	public static Class42 aClass42_453 = aClass42_449;

	@OriginalMember(owner = "client!gd", name = "B", descriptor = "Lclient!mc;")
	private static Class42 aClass42_460 = Static23.method501("Connecting to update server");

	@OriginalMember(owner = "client!gd", name = "s", descriptor = "Lclient!mc;")
	public static Class42 aClass42_455 = aClass42_460;

	@OriginalMember(owner = "client!gd", name = "t", descriptor = "Lclient!mc;")
	private static Class42 aClass42_456 = Static23.method501("wave2:");

	@OriginalMember(owner = "client!gd", name = "u", descriptor = "I")
	public static int anInt849 = 2;

	@OriginalMember(owner = "client!gd", name = "v", descriptor = "[Z")
	public static boolean[] aBooleanArray7 = new boolean[5];

	@OriginalMember(owner = "client!gd", name = "y", descriptor = "Lclient!mc;")
	private static Class42 aClass42_458 = Static23.method501("Please wait )2 attempting to reestablish");

	@OriginalMember(owner = "client!gd", name = "w", descriptor = "Lclient!mc;")
	public static Class42 aClass42_457 = aClass42_458;

	@OriginalMember(owner = "client!gd", name = "A", descriptor = "Lclient!mc;")
	public static Class42 aClass42_459 = aClass42_456;

	@OriginalMember(owner = "client!gd", name = "C", descriptor = "Lclient!mc;")
	public static Class42 aClass42_461 = Static23.method501("@cya@");

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)I")
	public static int method576() {
		return 5;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIII)I")
	public static int method577(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static61.aByteArrayArrayArray7[arg0][arg1][arg2] & 0x8) == 0) {
			return arg0 <= 0 || (Static61.aByteArrayArrayArray7[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)Lclient!qc;")
	public static Class1_Sub1_Sub12 method578(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static61.aClass1_Sub1_Sub12ArrayArray1[local7] == null || Static61.aClass1_Sub1_Sub12ArrayArray1[local7][local11] == null) {
			@Pc(25) boolean local25 = Static107.method1831(local7);
			if (!local25) {
				return null;
			}
		}
		return Static61.aClass1_Sub1_Sub12ArrayArray1[local7][local11];
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!a;")
	public static RuntimeException_Sub1 method579(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString1 = local9.aString1 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V")
	public static void method580() {
		Static50.aClass37_20.method976();
		Static105.aClass37_28.method976();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
	public static void method581() {
		Static15.aClass37_8.method976();
		Static42.aClass37_27.method976();
		Static27.aClass37_11.method976();
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
	public static void method582() {
		for (@Pc(3) int local3 = 0; local3 < Static91.anInt2403; local3++) {
			@Pc(9) int local9 = Static98.anIntArray375[local3];
			@Pc(13) Class1_Sub1_Sub8_Sub1_Sub1 local13 = Static8.aClass1_Sub1_Sub8_Sub1_Sub1Array1[local9];
			if (local13 != null) {
				Static10.method251(local13.aClass1_Sub1_Sub6_1.anInt760, local13);
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V")
	public static void method583() {
		try {
			@Pc(2) Graphics local2 = Static89.aCanvas1.getGraphics();
			Static84.aClass31_30.method993(550, local2, 4);
		} catch (@Pc(10) Exception local10) {
			Static89.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(B)V")
	public static void method584() {
		aClass42_458 = null;
		aClass33_Sub1_11 = null;
		aClass38_1 = null;
		aClass42_457 = null;
		aClass31_16 = null;
		aClass42_456 = null;
		aClass42_453 = null;
		aClass42_449 = null;
		aClass42_455 = null;
		aClass22_7 = null;
		aClass42_454 = null;
		aClass42_450 = null;
		aClass42_452 = null;
		aBooleanArray7 = null;
		aClass42_461 = null;
		aClass42_459 = null;
		aClass1_Sub1_Sub8_Sub1_Sub2Array1 = null;
		aClass42_460 = null;
		aClass42_451 = null;
	}
}
