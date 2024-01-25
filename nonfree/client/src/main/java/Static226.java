import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!io", name = "r", descriptor = "Lclient!jfa;")
	public static Class168 aClass168_3;

	@OriginalMember(owner = "client!io", name = "u", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard3;

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ZLjava/lang/String;JB)V")
	public static void method4406(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) long arg2) {
		if (arg0) {
			Static230.method5037();
			if (Static375.aString68.equals("")) {
				Static403.anInt6918 = 39;
				return;
			}
		}
		@Pc(19) Class1_Sub20 local19 = new Class1_Sub20(576);
		local19.method4378(10);
		local19.method4381((int) (Math.random() * 65535.0D));
		local19.method4380(arg2);
		local19.method4381(arg0 ? Static509.anInt8472 : Static208.anInt8805);
		local19.method4399(arg1);
		local19.method4380(arg0 ? Static83.aLong88 : Static368.aLong283);
		if (arg0) {
			local19.method4380(Static455.method6387(Static375.aString68));
			try {
				local19.method4380(Long.parseLong(Static365.aString67));
			} catch (@Pc(105) Exception local105) {
				Static403.anInt6918 = 39;
				return;
			}
		} else {
			local19.method4421((int) (Math.random() * 9.9999999E7D));
			local19.method4421((int) (Math.random() * 9.9999999E7D));
			local19.method4421((int) (Math.random() * 9.9999999E7D));
			local19.method4421((int) (Math.random() * 9.9999999E7D));
		}
		local19.method4421((int) (Math.random() * 9.9999999E7D));
		local19.method4407(Static502.aBigInteger4, Static566.aBigInteger6);
		@Pc(123) Class1_Sub48 local123 = Static240.method3953();
		local123.aClass1_Sub20_Sub1_2.method4378(arg0 ? Static189.aClass232_12.anInt6494 : Static189.aClass232_9.anInt6494);
		@Pc(136) int local136 = 1;
		if (Static292.aString59 != null) {
			local136 = Static292.aString59.length() + 1 + 1;
		}
		local123.aClass1_Sub20_Sub1_2.method4381(local136 + local19.anInt5238 + 28);
		local123.aClass1_Sub20_Sub1_2.method4381(619);
		local123.aClass1_Sub20_Sub1_2.method4378(Static562.anInt9127);
		local123.aClass1_Sub20_Sub1_2.method4378(Static275.aClass230_2.anInt6313);
		Static259.method4058(local123.aClass1_Sub20_Sub1_2);
		@Pc(184) String local184 = arg0 ? Static446.aString81 : Static292.aString59;
		local123.aClass1_Sub20_Sub1_2.method4378(local184 == null ? 0 : 1);
		if (local184 != null) {
			local123.aClass1_Sub20_Sub1_2.method4399(local184);
		}
		local123.aClass1_Sub20_Sub1_2.method4412(local19.aByteArray52, local19.anInt5238);
		Static34.method813(local123);
		Static446.anInt7727 = 0;
		Static31.anInt879 = 1;
		Static403.anInt6918 = -3;
		Static17.anInt564 = 0;
	}
}
