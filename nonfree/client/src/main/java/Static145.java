import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!kh", name = "n", descriptor = "I")
	public static int anInt2764;

	@OriginalMember(owner = "client!kh", name = "q", descriptor = "I")
	public static int anInt2767;

	@OriginalMember(owner = "client!kh", name = "x", descriptor = "I")
	public static int anInt2773;

	@OriginalMember(owner = "client!kh", name = "r", descriptor = "Lclient!l;")
	public static Class98 aClass98_19 = new Class98(64);

	@OriginalMember(owner = "client!kh", name = "w", descriptor = "I")
	public static int anInt2772 = 1;

	@OriginalMember(owner = "client!kh", name = "z", descriptor = "I")
	public static int anInt2775 = 0;

	@OriginalMember(owner = "client!kh", name = "B", descriptor = "I")
	public static int anInt2777 = 0;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/awt/Component;III)Lclient!oc;")
	public static Class128 method2479(@OriginalArg(0) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(6) Class local6 = Class.forName("Class128_Sub1");
			@Pc(10) Class128 local10 = (Class128) local6.getDeclaredConstructor().newInstance();
			local10.method4294(arg0, arg1, arg2);
			return local10;
		} catch (@Pc(25) Throwable local25) {
			@Pc(29) Class128_Sub2 local29 = new Class128_Sub2();
			local29.method4294(arg0, arg1, arg2);
			return local29;
		}
	}

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "(I)V")
	public static void method2480() {
		Static188.aClass98_30.method2571();
		Static132.aClass98_16.method2571();
		Static3.aClass98_1.method2571();
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IILclient!nc;)V")
	public static void method2481(@OriginalArg(1) int arg0, @OriginalArg(2) Class10_Sub5_Sub1 arg1) {
		@Pc(6) Class3_Sub20 local6 = (Class3_Sub20) Static245.aClass30_32.method663((long) arg0);
		if (local6 == null) {
			Static114.method5018(arg0, Static99.anInt1826, null, arg1, arg1.anIntArray535[0], null, 0, arg1.anIntArray537[0]);
		} else {
			local6.method2657();
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIIIIIZIB)V")
	public static void method2483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		@Pc(3) int local3;
		@Pc(10) int local10;
		for (local3 = 0; local3 < 104; local3++) {
			for (local10 = 0; local10 < 104; local10++) {
				Static158.anIntArrayArray46[local3][local10] = 0;
				Static57.anIntArrayArray14[local3][local10] = 99999999;
			}
		}
		Static158.anIntArrayArray46[arg3][arg1] = 99;
		local3 = arg3;
		local10 = arg1;
		@Pc(64) byte local64 = 0;
		Static57.anIntArrayArray14[arg3][arg1] = 0;
		Static76.anIntArray141[0] = arg3;
		@Pc(76) int local76 = 0;
		@Pc(79) int local79 = local64 + 1;
		Static35.anIntArray55[0] = arg1;
		@Pc(86) int[][] local86 = Static138.aClass153Array1[Static99.anInt1826].anIntArrayArray69;
		@Pc(88) boolean local88 = false;
		@Pc(213) int local213;
		while (local79 != local76) {
			local3 = Static76.anIntArray141[local76];
			local10 = Static35.anIntArray55[local76];
			local76 = local76 + 1 & 0xFFF;
			if (arg6 == local3 && arg0 == local10) {
				local88 = true;
				break;
			}
			if (arg7 != 0) {
				if ((arg7 < 5 || arg7 == 10) && Static138.aClass153Array1[Static99.anInt1826].method4086(arg0, arg7 - 1, 2, local3, local10, arg6, arg8)) {
					local88 = true;
					break;
				}
				if (arg7 < 10 && Static138.aClass153Array1[Static99.anInt1826].method4077(arg6, arg7 - 1, arg8, local10, arg0, local3, 2)) {
					local88 = true;
					break;
				}
			}
			if (arg4 != 0 && arg2 != 0 && Static138.aClass153Array1[Static99.anInt1826].method4079(arg4, arg2, local10, local3, 2, arg0, arg6, arg5)) {
				local88 = true;
				break;
			}
			local213 = Static57.anIntArrayArray14[local3][local10] + 1;
			if (local3 > 0 && Static158.anIntArrayArray46[local3 - 1][local10] == 0 && (local86[local3 - 1][local10] & 0x2C010E) == 0 && (local86[local3 - 1][local10 + 1] & 0x2C0138) == 0) {
				Static76.anIntArray141[local79] = local3 - 1;
				Static35.anIntArray55[local79] = local10;
				Static158.anIntArrayArray46[local3 - 1][local10] = 2;
				Static57.anIntArrayArray14[local3 - 1][local10] = local213;
				local79 = local79 + 1 & 0xFFF;
			}
			if (local3 < 102 && Static158.anIntArrayArray46[local3 + 1][local10] == 0 && (local86[local3 + 2][local10] & 0x2C0183) == 0 && (local86[local3 + 2][local10 + 1] & 0x2C01E0) == 0) {
				Static76.anIntArray141[local79] = local3 + 1;
				Static35.anIntArray55[local79] = local10;
				local79 = local79 + 1 & 0xFFF;
				Static158.anIntArrayArray46[local3 + 1][local10] = 8;
				Static57.anIntArrayArray14[local3 + 1][local10] = local213;
			}
			if (local10 > 0 && Static158.anIntArrayArray46[local3][local10 - 1] == 0 && (local86[local3][local10 - 1] & 0x2C010E) == 0 && (local86[local3 + 1][local10 - 1] & 0x2C0183) == 0) {
				Static76.anIntArray141[local79] = local3;
				Static35.anIntArray55[local79] = local10 - 1;
				Static158.anIntArrayArray46[local3][local10 - 1] = 1;
				local79 = local79 + 1 & 0xFFF;
				Static57.anIntArrayArray14[local3][local10 - 1] = local213;
			}
			if (local10 < 102 && Static158.anIntArrayArray46[local3][local10 + 1] == 0 && (local86[local3][local10 + 2] & 0x2C0138) == 0 && (local86[local3 + 1][local10 + 2] & 0x2C01E0) == 0) {
				Static76.anIntArray141[local79] = local3;
				Static35.anIntArray55[local79] = local10 + 1;
				local79 = local79 + 1 & 0xFFF;
				Static158.anIntArrayArray46[local3][local10 + 1] = 4;
				Static57.anIntArrayArray14[local3][local10 + 1] = local213;
			}
			if (local3 > 0 && local10 > 0 && Static158.anIntArrayArray46[local3 - 1][local10 - 1] == 0 && (local86[local3 - 1][local10] & 0x2C013E) == 0 && (local86[local3 - 1][local10 - 1] & 0x2C010E) == 0 && (local86[local3][local10 - 1] & 0x2C018F) == 0) {
				Static76.anIntArray141[local79] = local3 - 1;
				Static35.anIntArray55[local79] = local10 - 1;
				local79 = local79 + 1 & 0xFFF;
				Static158.anIntArrayArray46[local3 - 1][local10 - 1] = 3;
				Static57.anIntArrayArray14[local3 - 1][local10 - 1] = local213;
			}
			if (local3 < 102 && local10 > 0 && Static158.anIntArrayArray46[local3 + 1][local10 - 1] == 0 && (local86[local3 + 1][local10 - 1] & 0x2C018F) == 0 && (local86[local3 + 2][local10 - 1] & 0x2C0183) == 0 && (local86[local3 + 2][local10] & 0x2C01E3) == 0) {
				Static76.anIntArray141[local79] = local3 + 1;
				Static35.anIntArray55[local79] = local10 - 1;
				Static158.anIntArrayArray46[local3 + 1][local10 - 1] = 9;
				local79 = local79 + 1 & 0xFFF;
				Static57.anIntArrayArray14[local3 + 1][local10 - 1] = local213;
			}
			if (local3 > 0 && local10 < 102 && Static158.anIntArrayArray46[local3 - 1][local10 + 1] == 0 && (local86[local3 - 1][local10 + 1] & 0x2C013E) == 0 && (local86[local3 - 1][local10 + 2] & 0x2C0138) == 0 && (local86[local3][local10 + 2] & 0x2C01F8) == 0) {
				Static76.anIntArray141[local79] = local3 - 1;
				Static35.anIntArray55[local79] = local10 + 1;
				Static158.anIntArrayArray46[local3 - 1][local10 + 1] = 6;
				Static57.anIntArrayArray14[local3 - 1][local10 + 1] = local213;
				local79 = local79 + 1 & 0xFFF;
			}
			if (local3 < 102 && local10 < 102 && Static158.anIntArrayArray46[local3 + 1][local10 + 1] == 0 && (local86[local3 + 1][local10 + 2] & 0x2C01F8) == 0 && (local86[local3 + 2][local10 + 2] & 0x2C01E0) == 0 && (local86[local3 + 2][local10 + 1] & 0x2C01E3) == 0) {
				Static76.anIntArray141[local79] = local3 + 1;
				Static35.anIntArray55[local79] = local10 + 1;
				local79 = local79 + 1 & 0xFFF;
				Static158.anIntArrayArray46[local3 + 1][local10 + 1] = 12;
				Static57.anIntArrayArray14[local3 + 1][local10 + 1] = local213;
			}
		}
		if (!local88) {
			local213 = 1000;
			@Pc(922) int local922 = 100;
			for (@Pc(929) int local929 = arg6 - 10; local929 <= arg6 + 10; local929++) {
				for (@Pc(940) int local940 = arg0 - 10; local940 <= arg0 + 10; local940++) {
					if (local929 >= 0 && local940 >= 0 && local929 < 104 && local940 < 104 && Static57.anIntArrayArray14[local929][local940] < 100) {
						@Pc(974) int local974 = 0;
						if (local929 < arg6) {
							local974 = arg6 - local929;
						} else if (arg4 + arg6 - 1 < local929) {
							local974 = local929 + 1 - arg6 - arg4;
						}
						@Pc(1003) int local1003 = 0;
						if (arg0 > local940) {
							local1003 = arg0 - local940;
						} else if (arg0 + arg2 - 1 < local940) {
							local1003 = local940 + 1 - arg0 - arg2;
						}
						@Pc(1044) int local1044 = local974 * local974 + local1003 * local1003;
						if (local1044 < local213 || local213 == local1044 && Static57.anIntArrayArray14[local929][local940] < local922) {
							local10 = local940;
							local213 = local1044;
							local922 = Static57.anIntArrayArray14[local929][local940];
							local3 = local929;
						}
					}
				}
			}
			if (local213 == 1000) {
				return;
			}
			if (local3 == arg3 && arg1 == local10) {
				return;
			}
		}
		Static81.anInt1533 = local3;
		Static6.aBoolean11 = false;
		Static247.anInt4992 = local10;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIZZIILjava/lang/String;Ljava/lang/String;JIZ)V")
	public static void method2484(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) String arg6, @OriginalArg(8) long arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9) {
		@Pc(8) int[] local8 = new int[4];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			local8[local10] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(30) Class3_Sub26 local30 = new Class3_Sub26(128);
		local30.method3907(10);
		local30.method3938((arg2 ? 4 : 0) | (arg9 ? 2 : 0) | (arg1 ? 1 : 0));
		local30.method3913(arg7);
		local30.method3944(local8[0]);
		local30.method3914(arg6);
		local30.method3944(local8[1]);
		local30.method3938(Static60.anInt723);
		local30.method3907(arg3);
		local30.method3907(arg0);
		local30.method3944(local8[2]);
		local30.method3938(arg4);
		local30.method3938(arg8);
		local30.method3944(local8[3]);
		local30.method3902(Static47.aBigInteger3, Static58.aBigInteger2);
		@Pc(122) Class3_Sub26 local122 = new Class3_Sub26(350);
		local122.method3914(arg5);
		@Pc(135) int local135 = 8 - Static147.method2494(arg5) % 8;
		for (@Pc(137) int local137 = 0; local137 < local135; local137++) {
			local122.method3907((int) (Math.random() * 255.0D));
		}
		local122.method3927(local8);
		Static215.aClass3_Sub26_Sub1_2.anInt4615 = 0;
		Static215.aClass3_Sub26_Sub1_2.method3907(22);
		Static215.aClass3_Sub26_Sub1_2.method3938(local122.anInt4615 + local30.anInt4615 + 2);
		Static215.aClass3_Sub26_Sub1_2.method3938(554);
		Static215.aClass3_Sub26_Sub1_2.method3945(local30.anInt4615, local30.aByteArray64);
		Static215.aClass3_Sub26_Sub1_2.method3945(local122.anInt4615, local122.aByteArray64);
		Static254.anInt5245 = 0;
		Static205.anInt4056 = -3;
		Static214.anInt4184 = 1;
		Static93.anInt1701 = 0;
	}
}
