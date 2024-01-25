import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static530 {

	@OriginalMember(owner = "client!we", name = "O", descriptor = "Lclient!nba;")
	public static Class195 aClass195_2;

	@OriginalMember(owner = "client!we", name = "K", descriptor = "Ljava/util/Hashtable;")
	public static Hashtable aHashtable7 = new Hashtable();

	@OriginalMember(owner = "client!we", name = "Q", descriptor = "[I")
	public static final int[] anIntArray817 = new int[13];

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(BLclient!ui;IILclient!qa;)V")
	public static void method8089(@OriginalArg(1) Class295 arg0, @OriginalArg(4) Class4 arg1) {
		Static18.aClass295_4.method7541();
		if (Static443.aBoolean572) {
			return;
		}
		for (@Pc(26) Class1_Sub51 local26 = (Class1_Sub51) arg0.method7543(); local26 != null; local26 = (Class1_Sub51) arg0.method7540()) {
			@Pc(34) Class65 local34 = Static335.aClass32_4.method1129(local26.anInt9566);
			if (Static208.method3828(local34)) {
				@Pc(46) boolean local46 = Static375.method7394(arg1, local26, local34);
				if (local46) {
					Static432.method6706(local26, arg1, local34);
				}
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
	public static void method8090() {
		for (@Pc(7) int local7 = 0; local7 < Static336.anInt6245; local7++) {
			@Pc(13) int local13 = Static392.anIntArray674[local7];
			@Pc(21) Class20_Sub1_Sub1_Sub2 local21 = ((Class1_Sub41) Static362.aClass230_46.method6144((long) local13)).aClass20_Sub1_Sub1_Sub2_2;
			@Pc(25) int local25 = Static352.aClass1_Sub17_Sub2_2.method4487();
			if ((local25 & 0x1) != 0) {
				local25 += Static352.aClass1_Sub17_Sub2_2.method4487() << 8;
			}
			@Pc(48) int local48;
			if ((local25 & 0x100) != 0) {
				local48 = Static352.aClass1_Sub17_Sub2_2.method4494();
				local21.anInt8986 = Static352.aClass1_Sub17_Sub2_2.method4442();
				local21.anInt9016 = Static352.aClass1_Sub17_Sub2_2.method4449();
				local21.anInt8995 = local48 & 0x7FFF;
				local21.aBoolean676 = (local48 & 0x8000) != 0;
				local21.anInt8989 = local21.anInt8986 + local21.anInt8995 + Static445.anInt7791;
			}
			if ((local25 & 0x40) != 0) {
				local21.anInt9034 = Static352.aClass1_Sub17_Sub2_2.method4461();
				if (local21.anInt9034 == 65535) {
					local21.anInt9034 = -1;
				}
			}
			if ((local25 & 0x800) != 0) {
				local21.anInt8962 = Static352.aClass1_Sub17_Sub2_2.method4468();
				local21.anInt8981 = Static352.aClass1_Sub17_Sub2_2.method4485();
				local21.anInt9031 = Static352.aClass1_Sub17_Sub2_2.method4501();
				local21.anInt8956 = Static352.aClass1_Sub17_Sub2_2.method4501();
				local21.anInt8978 = Static352.aClass1_Sub17_Sub2_2.method4502() + Static445.anInt7791;
				local21.anInt8975 = Static352.aClass1_Sub17_Sub2_2.method4502() + Static445.anInt7791;
				local21.anInt8971 = Static352.aClass1_Sub17_Sub2_2.method4467();
				local21.anInt8956 += local21.anIntArray781[0];
				local21.anInt9035 = 1;
				local21.anInt8981 += local21.anIntArray781[0];
				local21.anInt9031 += local21.anIntArray780[0];
				local21.anInt9037 = 0;
				local21.anInt8962 += local21.anIntArray780[0];
			}
			if ((local25 & 0x200) != 0) {
				local21.anInt9043 = Static352.aClass1_Sub17_Sub2_2.method4494();
				local21.anInt9050 = Static352.aClass1_Sub17_Sub2_2.method4494();
			}
			@Pc(219) int local219;
			if ((local25 & 0x80) != 0) {
				local48 = Static352.aClass1_Sub17_Sub2_2.method4480();
				local219 = Static352.aClass1_Sub17_Sub2_2.method4487();
				local21.method7823(Static445.anInt7791, local219, local48);
				local21.anInt8982 = Static445.anInt7791 + 300;
				local21.anInt8996 = Static352.aClass1_Sub17_Sub2_2.method4487();
			}
			if ((local25 & 0x4) != 0) {
				local48 = Static352.aClass1_Sub17_Sub2_2.method4480();
				local219 = Static352.aClass1_Sub17_Sub2_2.method4442();
				local21.method7823(Static445.anInt7791, local219, local48);
			}
			if ((local25 & 0x20) != 0) {
				if (local21.aClass283_1.method7376()) {
					Static231.method4171(local21);
				}
				local21.method7826(Static358.aClass95_1.method2362(Static352.aClass1_Sub17_Sub2_2.method4502()));
				local21.method7810(local21.aClass283_1.anInt8439);
				local21.anInt9018 = local21.aClass283_1.anInt8419 << 3;
				if (local21.aClass283_1.method7376()) {
					Static509.method7776(local21.anIntArray780[0], local21, null, null, local21.anIntArray781[0], 0, local21.aByte108);
				}
			}
			if ((local25 & 0x10) != 0) {
				local48 = Static352.aClass1_Sub17_Sub2_2.method4494();
				if (local48 == 65535) {
					local48 = -1;
				}
				local219 = Static352.aClass1_Sub17_Sub2_2.method4449();
				Static31.method7249(local48, local21, local219);
			}
			if ((local25 & 0x1000) != 0) {
				local48 = Static352.aClass1_Sub17_Sub2_2.method4467();
				@Pc(353) int[] local353 = new int[local48];
				@Pc(356) int[] local356 = new int[local48];
				@Pc(359) int[] local359 = new int[local48];
				for (@Pc(361) int local361 = 0; local361 < local48; local361++) {
					@Pc(367) int local367 = Static352.aClass1_Sub17_Sub2_2.method4472();
					if (local367 == 65535) {
						local367 = -1;
					}
					local353[local361] = local367;
					local356[local361] = Static352.aClass1_Sub17_Sub2_2.method4467();
					local359[local361] = Static352.aClass1_Sub17_Sub2_2.method4502();
				}
				Static356.method4493(local353, local21, local356, local359);
			}
			@Pc(419) int local419;
			if ((local25 & 0x2) != 0) {
				local48 = Static352.aClass1_Sub17_Sub2_2.method4502();
				if (local48 == 65535) {
					local48 = -1;
				}
				local219 = Static352.aClass1_Sub17_Sub2_2.method4471();
				local419 = Static352.aClass1_Sub17_Sub2_2.method4449();
				local21.method7814(local419, false, local219, local48);
			}
			if ((local25 & 0x400) != 0) {
				local21.aByte110 = Static352.aClass1_Sub17_Sub2_2.method4468();
				local21.aByte112 = Static352.aClass1_Sub17_Sub2_2.method4482();
				local21.aByte111 = Static352.aClass1_Sub17_Sub2_2.method4482();
				local21.aByte109 = (byte) Static352.aClass1_Sub17_Sub2_2.method4442();
				local21.anInt8990 = Static445.anInt7791 + Static352.aClass1_Sub17_Sub2_2.method4494();
				local21.anInt9007 = Static445.anInt7791 + Static352.aClass1_Sub17_Sub2_2.method4472();
			}
			if ((local25 & 0x2000) != 0) {
				local48 = Static352.aClass1_Sub17_Sub2_2.method4502();
				local219 = Static352.aClass1_Sub17_Sub2_2.method4471();
				if (local48 == 65535) {
					local48 = -1;
				}
				local419 = Static352.aClass1_Sub17_Sub2_2.method4467();
				local21.method7814(local419, true, local219, local48);
			}
			if ((local25 & 0x8) != 0) {
				local21.aString205 = Static352.aClass1_Sub17_Sub2_2.method4491();
				local21.anInt9008 = 100;
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIII)I")
	public static int method8093(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg0 & 0xF;
		@Pc(16) int local16 = local7 >= 8 ? arg3 : arg2;
		@Pc(33) int local33 = local7 < 4 ? arg3 : local7 == 12 || local7 == 14 ? arg2 : arg1;
		return ((local7 & 0x1) == 0 ? local16 : -local16) + ((local7 & 0x2) == 0 ? local33 : -local33);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ZJLjava/lang/String;B)V")
	public static void method8094(@OriginalArg(0) boolean arg0, @OriginalArg(1) long arg1, @OriginalArg(2) String arg2) {
		if (arg0) {
			Static453.method6979();
			if (Static260.aString112.equals("")) {
				Static121.anInt2497 = 39;
				return;
			}
		}
		@Pc(19) Class1_Sub17 local19 = new Class1_Sub17(576);
		local19.method4451(10);
		local19.method4473((int) (Math.random() * 65535.0D));
		local19.method4452(arg1);
		local19.method4473(arg0 ? Static313.anInt5989 : Static27.anInt767);
		local19.method4489((int) (Math.random() * 9.9999999E7D));
		local19.method4464(arg2);
		local19.method4489((int) (Math.random() * 9.9999999E7D));
		if (arg0) {
			local19.method4452(Static140.method2622(Static260.aString112));
			try {
				local19.method4452(Long.parseLong(Static429.aString183));
			} catch (@Pc(89) Exception local89) {
				Static121.anInt2497 = 39;
				return;
			}
		} else {
			local19.method4489((int) (Math.random() * 9.9999999E7D));
			local19.method4489((int) (Math.random() * 9.9999999E7D));
			local19.method4489((int) (Math.random() * 9.9999999E7D));
			local19.method4489((int) (Math.random() * 9.9999999E7D));
		}
		local19.method4489((int) (Math.random() * 9.9999999E7D));
		local19.method4457(Static250.aBigInteger4, Static176.aBigInteger2);
		Static259.aClass1_Sub17_Sub2_1.anInt4872 = 0;
		Static259.aClass1_Sub17_Sub2_1.method4451(arg0 ? Static10.aClass39_12.anInt1272 : Static10.aClass39_9.anInt1272);
		Static259.aClass1_Sub17_Sub2_1.method4473(local19.anInt4872 + 28);
		Static259.aClass1_Sub17_Sub2_1.method4473(605);
		Static259.aClass1_Sub17_Sub2_1.method4451(Static544.anInt7853);
		Static259.aClass1_Sub17_Sub2_1.method4451(Static332.aClass250_4.anInt7314);
		Static181.method3534(Static259.aClass1_Sub17_Sub2_1);
		Static259.aClass1_Sub17_Sub2_1.method4454(local19.anInt4872, local19.aByteArray58);
		Static186.anInt3864 = 1;
		Static219.anInt4315 = 0;
		Static245.anInt4713 = 0;
		Static121.anInt2497 = -3;
	}
}
