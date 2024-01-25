import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!hu", name = "h", descriptor = "I")
	public static int anInt8072;

	@OriginalMember(owner = "client!hu", name = "l", descriptor = "I")
	public static int anInt8076;

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Ljava/lang/String;ZJB)V")
	public static void method6862(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2) {
		if (arg1) {
			Static133.method2882();
			if (Static479.aString71.equals("")) {
				Static244.anInt4711 = 39;
				return;
			}
		}
		@Pc(19) Class1_Sub13 local19 = new Class1_Sub13(576);
		local19.method3060(10);
		local19.method3038((int) (Math.random() * 65535.0D));
		local19.method3036(arg2);
		local19.method3038(arg1 ? Static328.anInt6209 : Static143.anInt3316);
		local19.method3069((int) (Math.random() * 9.9999999E7D));
		local19.method3061(arg0);
		local19.method3069((int) (Math.random() * 9.9999999E7D));
		if (arg1) {
			local19.method3036(Static314.method5172(Static479.aString71));
			try {
				local19.method3036(Long.parseLong(Static511.aString85));
			} catch (@Pc(112) Exception local112) {
				Static244.anInt4711 = 39;
				return;
			}
		} else {
			local19.method3069((int) (Math.random() * 9.9999999E7D));
			local19.method3069((int) (Math.random() * 9.9999999E7D));
			local19.method3069((int) (Math.random() * 9.9999999E7D));
			local19.method3069((int) (Math.random() * 9.9999999E7D));
		}
		local19.method3069((int) (Math.random() * 9.9999999E7D));
		local19.method3031(Static87.aBigInteger4, Static170.aBigInteger3);
		Static192.aClass1_Sub13_Sub2_1.anInt3400 = 0;
		Static192.aClass1_Sub13_Sub2_1.method3060(arg1 ? Static203.aClass143_12.anInt4449 : Static203.aClass143_9.anInt4449);
		Static192.aClass1_Sub13_Sub2_1.method3038(local19.anInt3400 + 28);
		Static192.aClass1_Sub13_Sub2_1.method3038(609);
		Static192.aClass1_Sub13_Sub2_1.method3060(Static315.anInt5993);
		Static192.aClass1_Sub13_Sub2_1.method3060(Static538.aClass37_4.anInt1407);
		Static355.method1737(Static192.aClass1_Sub13_Sub2_1);
		Static192.aClass1_Sub13_Sub2_1.method3041(local19.aByteArray45, local19.anInt3400);
		Static244.anInt4711 = -3;
		Static165.anInt3646 = 0;
		Static318.anInt6041 = 1;
		Static180.anInt3884 = 0;
	}

	@OriginalMember(owner = "client!hu", name = "c", descriptor = "(III)Z")
	public static boolean method6863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static306.method5089(arg0, arg1) | (arg1 & 0x70000) != 0 || Static309.method5130(arg1, arg0);
	}
}
