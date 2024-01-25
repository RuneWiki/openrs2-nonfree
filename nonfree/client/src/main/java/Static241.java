import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!jf", name = "rb", descriptor = "[B")
	public static final byte[] aByteArray60 = new byte[2048];

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(JILjava/lang/String;Z)V")
	public static void method4175(@OriginalArg(0) long arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		if (arg2) {
			Static69.method1734();
			if (Static551.aString128.equals("")) {
				Static309.anInt6178 = 39;
				return;
			}
		}
		@Pc(19) Class3_Sub7 local19 = new Class3_Sub7(576);
		local19.method6494(10);
		local19.method6528((int) (Math.random() * 65535.0D));
		local19.method6533(arg0);
		local19.method6528(arg2 ? Static24.anInt772 : Static32.anInt2893);
		local19.method6516(arg1);
		local19.method6533(arg2 ? Static113.aLong80 : Static339.aLong179);
		if (arg2) {
			local19.method6533(Static490.method7465(Static551.aString128));
			try {
				local19.method6533(Long.parseLong(Static361.aString81));
			} catch (@Pc(73) Exception local73) {
				Static309.anInt6178 = 39;
				return;
			}
		} else {
			local19.method6495((int) (Math.random() * 9.9999999E7D));
			local19.method6495((int) (Math.random() * 9.9999999E7D));
			local19.method6495((int) (Math.random() * 9.9999999E7D));
			local19.method6495((int) (Math.random() * 9.9999999E7D));
		}
		local19.method6495((int) (Math.random() * 9.9999999E7D));
		local19.method6545(Static269.aBigInteger6, Static163.aBigInteger4);
		@Pc(119) Class3_Sub9 local119 = Static464.method7107();
		local119.aClass3_Sub7_Sub1_1.method6494(arg2 ? Static261.aClass33_40.anInt1080 : Static261.aClass33_37.anInt1080);
		local119.aClass3_Sub7_Sub1_1.method6528(local19.anInt7869 + 28);
		local119.aClass3_Sub7_Sub1_1.method6528(615);
		local119.aClass3_Sub7_Sub1_1.method6494(Static126.anInt2904);
		local119.aClass3_Sub7_Sub1_1.method6494(Static581.aClass335_4.anInt9905);
		Static488.method2079(local119.aClass3_Sub7_Sub1_1);
		local119.aClass3_Sub7_Sub1_1.method6500(local19.anInt7869, local19.aByteArray86);
		Static230.method3933(local119);
		Static138.anInt3230 = 0;
		Static309.anInt6178 = -3;
		Static526.anInt9591 = 1;
		Static149.anInt2868 = 0;
	}
}
