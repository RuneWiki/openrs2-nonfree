import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
	public static int anInt5964;

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_162 = new Class129(12, 16);

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_163 = new Class129(93, 6);

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
	public static void method4754() {
		Static348.aClass200_7.JA(Static351.aFloat141 * ((float) Static216.aClass1_Sub1_1.anInt4515 * 0.1F + 0.7F));
		Static348.aClass200_7.B(Static246.anInt3976, Static397.aFloat151, Static229.aFloat93, (float) (Static247.anInt3977 << 0), (float) (Static12.anInt240 << 0), (float) (Static44.anInt788 << 0));
		Static348.aClass200_7.method5826(Static300.aClass24_2);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/String;BJZ)V")
	public static void method4755(@OriginalArg(0) String arg0, @OriginalArg(2) long arg1, @OriginalArg(3) boolean arg2) {
		if (arg2) {
			Static59.method949();
			if (Static294.aString53.equals("")) {
				Static456.anInt7451 = 39;
				return;
			}
		}
		@Pc(19) Class5_Sub15 local19 = new Class5_Sub15(128);
		local19.method5583(10);
		local19.method5566((int) (Math.random() * 65535.0D));
		local19.method5587(arg1);
		local19.method5566(Static250.anInt4070);
		local19.method5550((int) (Math.random() * 9.9999999E7D));
		local19.method5545(arg0);
		local19.method5550((int) (Math.random() * 9.9999999E7D));
		if (arg2) {
			local19.method5587(Static83.method1230(Static294.aString53));
			try {
				local19.method5587(Long.parseLong(Static256.aString45));
			} catch (@Pc(71) Exception local71) {
				Static456.anInt7451 = 39;
				return;
			}
		} else {
			local19.method5550((int) (Math.random() * 9.9999999E7D));
			local19.method5550((int) (Math.random() * 9.9999999E7D));
			local19.method5550((int) (Math.random() * 9.9999999E7D));
			local19.method5550((int) (Math.random() * 9.9999999E7D));
		}
		local19.method5550((int) (Math.random() * 9.9999999E7D));
		local19.method5589(Static317.aBigInteger1, Static407.aBigInteger2);
		Static281.aClass5_Sub15_Sub2_13.anInt7013 = 0;
		Static281.aClass5_Sub15_Sub2_13.method5583(arg2 ? Static316.aClass210_12.anInt5855 : Static316.aClass210_9.anInt5855);
		Static281.aClass5_Sub15_Sub2_13.method5566(local19.anInt7013 + 28);
		Static281.aClass5_Sub15_Sub2_13.method5566(602);
		Static281.aClass5_Sub15_Sub2_13.method5583(Static38.anInt4834);
		Static281.aClass5_Sub15_Sub2_13.method5583(Static217.aClass197_2.anInt5079);
		Static61.method964(Static281.aClass5_Sub15_Sub2_13);
		Static281.aClass5_Sub15_Sub2_13.method5557(local19.anInt7013, local19.aByteArray93);
		Static188.anInt3155 = 1;
		Static274.anInt4304 = 0;
		Static456.anInt7451 = -3;
		Static371.anInt6077 = 0;
	}
}
