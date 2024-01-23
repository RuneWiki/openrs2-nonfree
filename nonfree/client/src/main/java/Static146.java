import java.awt.Component;
import java.awt.Image;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "Ljava/awt/Image;")
	public static Image anImage3;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
	public static void method2486() {
		Static194.aClass187_103.method4530();
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)V")
	public static void method2487(@OriginalArg(1) int arg0) {
		@Pc(14) Class1_Sub7 local14 = (Class1_Sub7) Static229.aClass142_19.method3543((long) arg0);
		if (local14 != null) {
			local14.method4779();
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method2488(@OriginalArg(0) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)Z")
	public static boolean method2489() {
		try {
			return Static50.method951();
		} catch (@Pc(15) IOException local15) {
			Static105.method1211();
			return true;
		} catch (@Pc(20) Exception local20) {
			@Pc(61) String local61 = "T2 - " + Static266.anInt4855 + "," + Static85.anInt1690 + "," + Static165.anInt3261 + " - " + Static88.anInt1723 + "," + (Static90.aClass15_Sub5_Sub2_2.anIntArray501[0] + Static199.anInt3817) + "," + (Static192.anInt3637 + Static90.aClass15_Sub5_Sub2_2.anIntArray504[0]) + " - ";
			for (@Pc(63) int local63 = 0; Static88.anInt1723 > local63 && local63 < 50; local63++) {
				local61 = local61 + Static13.aClass1_Sub14_Sub1_1.aByteArray17[local63] + ",";
			}
			Static159.method2733(local20, local61);
			Static74.method1467();
			return true;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILjava/awt/Component;IILclient!rj;)Lclient!tj;")
	public static Class28 method2490(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class154 arg3) {
		if (Static303.anInt5383 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(32) Class28 local32 = (Class28) Class.forName("Class28_Sub2").getDeclaredConstructor().newInstance();
			local32.anIntArray505 = new int[(Static257.aBoolean319 ? 2 : 1) * 256];
			local32.anInt5716 = arg0;
			local32.method4765(arg1);
			local32.anInt5722 = (arg0 & 0xFFFFFC00) + 1024;
			if (local32.anInt5722 > 16384) {
				local32.anInt5722 = 16384;
			}
			local32.method4776(local32.anInt5722);
			if (Static202.anInt3871 > 0 && Static251.aClass131_1 == null) {
				Static251.aClass131_1 = new Class131();
				Static251.aClass131_1.aClass154_4 = arg3;
				arg3.method3881(Static202.anInt3871, Static251.aClass131_1);
			}
			if (Static251.aClass131_1 != null) {
				if (Static251.aClass131_1.aClass28Array1[arg2] != null) {
					throw new IllegalArgumentException();
				}
				Static251.aClass131_1.aClass28Array1[arg2] = local32;
			}
			return local32;
		} catch (@Pc(108) Throwable local108) {
			try {
				@Pc(114) Class28_Sub1 local114 = new Class28_Sub1(arg3, arg2);
				local114.anInt5716 = arg0;
				local114.anIntArray505 = new int[(Static257.aBoolean319 ? 2 : 1) * 256];
				local114.method4765(arg1);
				local114.anInt5722 = 16384;
				local114.method4776(local114.anInt5722);
				if (Static202.anInt3871 > 0 && Static251.aClass131_1 == null) {
					Static251.aClass131_1 = new Class131();
					Static251.aClass131_1.aClass154_4 = arg3;
					arg3.method3881(Static202.anInt3871, Static251.aClass131_1);
				}
				if (Static251.aClass131_1 != null) {
					if (Static251.aClass131_1.aClass28Array1[arg2] != null) {
						throw new IllegalArgumentException();
					}
					Static251.aClass131_1.aClass28Array1[arg2] = local114;
				}
				return local114;
			} catch (@Pc(175) Throwable local175) {
				return new Class28();
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZI)V")
	public static void method2492() {
		Static313.aClass187_80.method4534(5);
	}
}
