import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString65;

	@OriginalMember(owner = "client!mn", name = "g", descriptor = "Z")
	public static boolean aBoolean408 = false;

	@OriginalMember(owner = "client!mn", name = "q", descriptor = "[I")
	public static final int[] anIntArray402 = new int[5];

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!wn;I)V")
	public static void method4779(@OriginalArg(0) Class2_Sub22_Sub2 arg0) {
		@Pc(7) int local7 = 0;
		arg0.method8566();
		@Pc(20) int local20;
		@Pc(50) int local50;
		for (@Pc(14) int local14 = 0; local14 < Static580.anInt9430; local14++) {
			local20 = Static6.anIntArray9[local14];
			if ((Static166.aByteArray29[local20] & 0x1) == 0) {
				if (local7 > 0) {
					Static166.aByteArray29[local20] = (byte) (Static166.aByteArray29[local20] | 0x2);
					local7--;
				} else {
					local50 = arg0.method8569(1);
					if (local50 == 0) {
						local7 = Static281.method3900(arg0);
						Static166.aByteArray29[local20] = (byte) (Static166.aByteArray29[local20] | 0x2);
					} else {
						Static430.method7015(arg0, local20);
					}
				}
			}
		}
		arg0.method8560();
		if (local7 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method8566();
		@Pc(136) int local136;
		for (local20 = 0; local20 < Static580.anInt9430; local20++) {
			local50 = Static6.anIntArray9[local20];
			if ((Static166.aByteArray29[local50] & 0x1) != 0) {
				if (local7 > 0) {
					local7--;
					Static166.aByteArray29[local50] = (byte) (Static166.aByteArray29[local50] | 0x2);
				} else {
					local136 = arg0.method8569(1);
					if (local136 == 0) {
						local7 = Static281.method3900(arg0);
						Static166.aByteArray29[local50] = (byte) (Static166.aByteArray29[local50] | 0x2);
					} else {
						Static430.method7015(arg0, local50);
					}
				}
			}
		}
		arg0.method8560();
		if (local7 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method8566();
		@Pc(219) int local219;
		for (local50 = 0; local50 < Static339.anInt5376; local50++) {
			local136 = Static113.anIntArray143[local50];
			if ((Static166.aByteArray29[local136] & 0x1) != 0) {
				if (local7 > 0) {
					local7--;
					Static166.aByteArray29[local136] = (byte) (Static166.aByteArray29[local136] | 0x2);
				} else {
					local219 = arg0.method8569(1);
					if (local219 == 0) {
						local7 = Static281.method3900(arg0);
						Static166.aByteArray29[local136] = (byte) (Static166.aByteArray29[local136] | 0x2);
					} else if (Static255.method3523(local136, arg0)) {
						Static166.aByteArray29[local136] = (byte) (Static166.aByteArray29[local136] | 0x2);
					}
				}
			}
		}
		arg0.method8560();
		if (local7 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method8566();
		for (local136 = 0; local136 < Static339.anInt5376; local136++) {
			local219 = Static113.anIntArray143[local136];
			if ((Static166.aByteArray29[local219] & 0x1) == 0) {
				if (local7 > 0) {
					local7--;
					Static166.aByteArray29[local219] = (byte) (Static166.aByteArray29[local219] | 0x2);
				} else {
					@Pc(309) int local309 = arg0.method8569(1);
					if (local309 == 0) {
						local7 = Static281.method3900(arg0);
						Static166.aByteArray29[local219] = (byte) (Static166.aByteArray29[local219] | 0x2);
					} else if (Static255.method3523(local219, arg0)) {
						Static166.aByteArray29[local219] = (byte) (Static166.aByteArray29[local219] | 0x2);
					}
				}
			}
		}
		arg0.method8560();
		if (local7 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static580.anInt9430 = 0;
		Static339.anInt5376 = 0;
		for (local219 = 1; local219 < 2048; local219++) {
			Static166.aByteArray29[local219] = (byte) (Static166.aByteArray29[local219] >> 1);
			@Pc(384) Class13_Sub1_Sub1_Sub1_Sub2 local384 = Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[local219];
			if (local384 == null) {
				Static113.anIntArray143[Static339.anInt5376++] = local219;
			} else {
				Static6.anIntArray9[Static580.anInt9430++] = local219;
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IBILjava/awt/Canvas;)Lclient!sfa;")
	public static Class2_Sub26 method4784(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2) {
		try {
			@Pc(6) Class local6 = Class.forName("Class2_Sub26_Sub2");
			@Pc(15) Class2_Sub26 local15 = (Class2_Sub26) local6.getDeclaredConstructor().newInstance();
			local15.method5619(arg0, arg2, arg1);
			return local15;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class2_Sub26_Sub1 local28 = new Class2_Sub26_Sub1();
			local28.method5619(arg0, arg2, arg1);
			return local28;
		}
	}
}
