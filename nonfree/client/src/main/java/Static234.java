import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!in", name = "d", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_49 = new Class154(27, 2);

	@OriginalMember(owner = "client!in", name = "e", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_63 = new Class349(35, -1);

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(II)I")
	public static int method3333(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local5 += 16;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return arg0 + local5;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method3334(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) long local10 = 0L;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + (long) arg0.charAt(local12) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IJZLjava/lang/String;)V")
	public static void method3335(@OriginalArg(1) long arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2) {
		if (arg1) {
			Static144.method1986();
			if (Static564.aString140.equals("")) {
				Static372.anInt6216 = 39;
				return;
			}
		}
		@Pc(19) Class2_Sub7 local19 = new Class2_Sub7(576);
		local19.method4459(10);
		local19.method4511((int) (Math.random() * 65535.0D));
		local19.method4493(arg0);
		local19.method4511(arg1 ? Static125.anInt2098 : Static516.anInt8248);
		local19.method4481(arg2);
		local19.method4493(arg1 ? Static130.aLong51 : Static309.aLong139);
		if (arg1) {
			local19.method4493(Static367.method5177(Static564.aString140));
			try {
				local19.method4493(Long.parseLong(Static394.aString91));
			} catch (@Pc(75) Exception local75) {
				Static372.anInt6216 = 39;
				return;
			}
		} else {
			local19.method4495((int) (Math.random() * 9.9999999E7D));
			local19.method4495((int) (Math.random() * 9.9999999E7D));
			local19.method4495((int) (Math.random() * 9.9999999E7D));
			local19.method4495((int) (Math.random() * 9.9999999E7D));
		}
		local19.method4495((int) (Math.random() * 9.9999999E7D));
		local19.method4480(Static462.aBigInteger6, Static390.aBigInteger5);
		@Pc(123) Class2_Sub34 local123 = Static593.method7730();
		local123.aClass2_Sub7_Sub2_2.method4459(arg1 ? Static28.aClass283_12.anInt6971 : Static28.aClass283_9.anInt6971);
		@Pc(136) int local136 = 1;
		if (Static409.aString96 != null) {
			local136 = Static409.aString96.length() + 1 + 1;
		}
		local123.aClass2_Sub7_Sub2_2.method4511(local136 + local19.anInt5186 + 28);
		local123.aClass2_Sub7_Sub2_2.method4511(627);
		local123.aClass2_Sub7_Sub2_2.method4459(Static261.anInt4297);
		local123.aClass2_Sub7_Sub2_2.method4459(Static18.aClass308_7.anInt7714);
		Static568.method7409(local123.aClass2_Sub7_Sub2_2);
		@Pc(185) String local185 = arg1 ? Static385.aString89 : Static409.aString96;
		local123.aClass2_Sub7_Sub2_2.method4459(local185 == null ? 0 : 1);
		if (local185 != null) {
			local123.aClass2_Sub7_Sub2_2.method4481(local185);
		}
		local123.aClass2_Sub7_Sub2_2.method4498(local19.aByteArray52, local19.anInt5186);
		Static100.method1508(local123);
		Static372.anInt6216 = -3;
		Static561.anInt9175 = 0;
		Static130.anInt2132 = 1;
		Static565.anInt9250 = 0;
	}
}
