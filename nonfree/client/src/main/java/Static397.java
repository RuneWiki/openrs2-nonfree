import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!pi", name = "p", descriptor = "I")
	public static int anInt6953;

	@OriginalMember(owner = "client!pi", name = "r", descriptor = "I")
	public static int anInt6954;

	@OriginalMember(owner = "client!pi", name = "m", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger10 = new BigInteger("b8723b79d189873a9eccf9ec8dd00bbf9393b64e6cc79bc8b45e583f074bf82bdcbf22aa5c0dff9481f14cff10422de6bc4abd0a20050d2836985a16e28e1989050860a405fff1cd6161dbead76c2053c8da9df43378dfe05edcc0847202f957ae5045238cf2246d13862e1d04d20b476418b0c135e746b757ba742dda9161a4cfb7f4781593ed6c9cc3b0cb6622556bbafcd14f60cb71d5a2fa888c91f08fa00f9ebc3a12cc42c67dca60559aa66a7266603effde04004274d9a06bc76ce65639c07f0ed01aa51004a1d4dd0ba486ed5078a820c6d3e683bf3a5b886a69af4a1765812c7a520d9ae1e4d43815b814a2a1d849931f870dad08121d5aa6a9ba98abfccd1fdc98ffe15bef53864eebfe3cc79de84578dd01978eeed674a776d28e414d9f0dfcd3c16054853f28d8efac5680cfa5dc56eefc9229da06f3f1d0e5add02d46127bfc636b7c11c1c6e0c88bf9caf06306a0ac17b91637735eff3b056c44beb0ecbdc7893027d2fb0f54a08641f516713bc63fe32191a156e93d9010c030493d2075aef9603605b093dca16b551ca9de6e4869fb2a0d02636e14ceba72c2dd3a82b77c8c1d8155121f93845de743124f361ba5cd531b83167557652322f5a78187fb0eb042943c3a34f32933a350a2ad23c3160c8cd74d007e4c8e14d28fa5da2b1e1f397f8e5a3f36c3420ec25e3e9a0a0368607364ea852f71ced869", 16);

	@OriginalMember(owner = "client!pi", name = "q", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_109 = new Class47(45, 7);

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZZI)V")
	public static void method5811(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg0) {
			Static16.anInt469--;
			if (Static16.anInt469 == 0) {
				Static171.anIntArray212 = null;
			}
		}
		if (!arg1) {
			return;
		}
		Static133.anInt2980--;
		if (Static133.anInt2980 == 0) {
			Static50.anIntArray51 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(BLclient!rr;)V")
	public static void method5813(@OriginalArg(1) Class292 arg0) {
		if (Static450.anInt3552 != arg0.anInt7955) {
			return;
		}
		if (Static328.aClass4_Sub1_Sub1_Sub2_2.aString63 == null) {
			arg0.anInt7967 = 0;
			arg0.anInt7942 = 0;
			return;
		}
		arg0.anInt7951 = 150;
		arg0.anInt7897 = (int) (Math.sin((double) Static312.anInt5688 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt7942 = Static272.anInt5214;
		arg0.anInt7885 = 5;
		arg0.anInt7967 = Static597.method7850(Static328.aClass4_Sub1_Sub1_Sub2_2.aString63);
		arg0.anInt7941 = 0;
		arg0.anInt7969 = Static328.aClass4_Sub1_Sub1_Sub2_2.anInt7120;
		arg0.anInt7936 = Static328.aClass4_Sub1_Sub1_Sub2_2.anInt7100;
		arg0.anInt7886 = Static328.aClass4_Sub1_Sub1_Sub2_2.anInt7081;
		@Pc(80) Class57 local80 = arg0.anInt7936 == -1 ? null : Static78.aClass298_2.method6521(arg0.anInt7936);
		if (local80 != null) {
			Static240.method4205(arg0.anInt7969, local80);
		}
	}
}
