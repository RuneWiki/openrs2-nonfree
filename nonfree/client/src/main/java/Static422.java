import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!paa", name = "g", descriptor = "I")
	public static int anInt7631;

	@OriginalMember(owner = "client!paa", name = "j", descriptor = "I")
	public static int anInt7634;

	@OriginalMember(owner = "client!paa", name = "m", descriptor = "Lclient!uu;")
	public static Class343 aClass343_209;

	@OriginalMember(owner = "client!paa", name = "l", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger7 = new BigInteger("a56a914e1a08786bd12ac1ed9be9fdb2b36ce6b153f20325a4d9440d8477381ab251a63d6d9a5c5113f76668451c095303b47b0e8cee328004e4b74b607ac3f2570ae2f0a4e067a166a2472e73fb901db49133c1fe7c2e33817e94a6acf0bd8004cc411fcae7c58db4c23ed302b1d4b9287f52e6625b636b5372783fd48ac0fb5b36d248df37689cf4af92dc71c70d472a0ed79eb46919311bc5775e78ba28a3d5baed4363b21e229ccde644572de46892d293cdc60481637be8d658d49d4b20e955c9275bcd5421bbf835449eb6bfde808ea033753bed6a4075904ee3512bb1219d7cbf57114cd134fe7107e6e9c4d0fe62599e0ca42bbda7c78df10c670222c9c6b85c77895dbdb739aeff88dd72545a5ef8ec31628eb5de77a9603b4afe626dccf854fa85c85ad7e23c906f13c35549e2825ce40e252657c321a4e1943ea3aadf1861442ad932f315b46db2ba5ac177ddb70e88ba3d0daa129c24243a55e4349a0c75bd0e88b4069bf35b2470fbb0affe2de9f06a575c0a6f9dd377cf6878d043bf4372ed6cabfafba4869af983739202fb9a5759862b1c9a162251bd2e86f6afc23193a25a917b894562adc892c85180cd833f697bb3539ec23162d9845fc42311ec2276a7393d9df413ebeea9b4564218ba463ddd1b878903e1cd50766dbe9ba54a89b9fa7cb21dbfa00d5399dc06647bb520c0c6789a57435b87f94a2d", 16);

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lclient!cea;Z)V")
	public static void method6652(@OriginalArg(0) Class9_Sub2_Sub1_Sub2_Sub1 arg0) {
		@Pc(16) Class3_Sub31 local16 = (Class3_Sub31) Static554.aClass25_41.method426((long) arg0.anInt10204);
		if (local16 == null) {
			return;
		}
		if (local16.aClass3_Sub3_Sub5_3 != null) {
			Static304.aClass3_Sub3_Sub3_3.method2976(local16.aClass3_Sub3_Sub5_3);
			local16.aClass3_Sub3_Sub5_3 = null;
		}
		local16.method8682();
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method6653(@OriginalArg(0) String arg0) {
		return Static104.method1722(arg0, eea.class);
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(BZ)V")
	public static void method6656(@OriginalArg(1) boolean arg0) {
		if (Static73.aString8.length() == 0) {
			return;
		}
		Static8.method147("--> " + Static73.aString8);
		Static214.method3768(Static73.aString8, false, arg0);
		Static11.anInt200 = 0;
		Static73.aString8 = "";
		Static412.anInt7257 = 0;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "([FII)[F")
	public static float[] method6657(@OriginalArg(0) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(11) float[] local11 = new float[arg1];
		Static651.method754(arg0, 0, local11, 0, arg1);
		return local11;
	}
}
