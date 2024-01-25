import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
	public static int anInt4706 = -1;

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "[I")
	public static final int[] anIntArray462 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "Lclient!s;")
	public static final Class217 aClass217_106 = new Class217(27, 0);

	@OriginalMember(owner = "client!ma", name = "i", descriptor = "[B")
	public static final byte[] aByteArray55 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(JZILjava/lang/String;)V")
	public static void method3801(@OriginalArg(0) long arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) String arg2) {
		if (arg1) {
			Static386.method5170();
			if (Static384.aString62.equals("")) {
				Static113.anInt2280 = 39;
				return;
			}
		}
		@Pc(21) Class10_Sub8 local21 = new Class10_Sub8(128);
		local21.method2458(10);
		local21.method2509((int) (Math.random() * 65535.0D));
		local21.method2470(arg0);
		local21.method2509(Static298.anInt5158);
		local21.method2506((int) (Math.random() * 9.9999999E7D));
		local21.method2465(arg2);
		local21.method2506((int) (Math.random() * 9.9999999E7D));
		if (arg1) {
			local21.method2470(Static269.method3820(Static384.aString62));
			try {
				local21.method2470(Long.parseLong(Static410.aString69));
			} catch (@Pc(75) Exception local75) {
				Static113.anInt2280 = 39;
				return;
			}
		} else {
			local21.method2506((int) (Math.random() * 9.9999999E7D));
			local21.method2506((int) (Math.random() * 9.9999999E7D));
			local21.method2506((int) (Math.random() * 9.9999999E7D));
			local21.method2506((int) (Math.random() * 9.9999999E7D));
		}
		local21.method2506((int) (Math.random() * 9.9999999E7D));
		local21.method2489(Static394.aBigInteger2, Static369.aBigInteger1);
		Static337.aClass10_Sub8_Sub2_2.anInt2989 = 0;
		Static337.aClass10_Sub8_Sub2_2.method2458(arg1 ? Static53.aClass216_12.anInt6089 : Static53.aClass216_9.anInt6089);
		Static337.aClass10_Sub8_Sub2_2.method2509(local21.anInt2989 + 28);
		Static337.aClass10_Sub8_Sub2_2.method2509(597);
		Static337.aClass10_Sub8_Sub2_2.method2458(Static191.anInt3842);
		Static337.aClass10_Sub8_Sub2_2.method2458(Static102.aClass147_3.anInt4151);
		Static282.method4002(Static337.aClass10_Sub8_Sub2_2);
		Static337.aClass10_Sub8_Sub2_2.method2457(local21.anInt2989, local21.aByteArray44);
		Static284.anInt4990 = 0;
		Static113.anInt2280 = -3;
		Static241.anInt4381 = 0;
		Static268.anInt4867 = 1;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
	public static void method3803() {
		Static383.aClass68Array1 = new Class68[50];
		Static443.anInt7418 = 0;
	}
}
