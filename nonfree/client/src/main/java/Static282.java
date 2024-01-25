import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!ka", name = "l", descriptor = "[I")
	public static int[] anIntArray521;

	@OriginalMember(owner = "client!ka", name = "n", descriptor = "Lclient!nd;")
	public static Class238 aClass238_218;

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_175 = new Class200(54, -2);

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger9 = new BigInteger("9bc07162af2ce2a686e2113c86fb5f306892dcc9a3c7571da1d90a109f7c852d56afe0eca956552abb88432b3d63b90ea6fbea6376656d228723875cdebd5e36246dc473f24e0495708f8221a952e1a4616b39bfcbeb215e87869323b6c801d563fa9fbe89c3dd46f2aaaa28c14da7798ee9bf3926f40a84d73a2ceab38701f0a8b15fb0aa8e841874d44ce16965d69a1a66c3a95eb078f67b1193fe11ff0fa1a82097b72f208343389aa723057b5f887902b290ef8b1b9135e2bfd7c7167c0fcc5df7e69868604b8190aefe9c2f3c86fb7b5a5ee15511b6548cea40bfa0a446b0a2b9219623bfec64f007a3820dc3c8606135bfceb887e919927ddf8605cb5f8bbf0a57d5117436f8caf2e47db218fa37af47953710d98a574cd56386021b50f2c194754e00c76624069d707d6bb988524cf8cacffcc586e5962714b5ebcf3b64ec153a2962a6e44c653281d2ff3d11a110f666ab7010d708b5091d7a4cc56314a1b706ffe12e065c19b1491757598bb763ca8e62e74fca68cf3e213f9fb21822557e82b26f39c054a1e98c7e27e7e427d5e9f8517bdb947e73adbcc76e24318d4bc22f14305c7d0822c12986662026057c6e139b3b233522ed5abd67094f7313e11ac42bcb721445f2ec9d06dc5b28679c18a018b138a163aca6508347ba8e1abbd3a2da59e8536979a3ca108b875218788bd49c1b270a097a68dad7563453", 16);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZIILclient!td;I)V")
	public static void method6615(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class326 arg3, @OriginalArg(5) int arg4) {
		if (arg4 < 1 || arg0 < 1 || Static456.anInt7428 - 2 < arg4 || Static5.anInt112 - 2 < arg0) {
			return;
		}
		if (Static348.aClass84ArrayArrayArray5 == null) {
			return;
		}
		@Pc(41) Interface25 local41 = Static348.aClass309_Sub1_1.method7107(arg0, arg1, arg4, arg2);
		if (local41 == null) {
			return;
		}
		if (!(local41 instanceof Class16_Sub1_Sub1_Sub4)) {
			if (local41 instanceof Class16_Sub1_Sub3_Sub2) {
				((Class16_Sub1_Sub3_Sub2) local41).method4364(arg3);
			} else if (local41 instanceof Class16_Sub1_Sub2_Sub1) {
				((Class16_Sub1_Sub2_Sub1) local41).method2083(arg3);
				return;
			} else if (local41 instanceof Class16_Sub1_Sub4_Sub2) {
				((Class16_Sub1_Sub4_Sub2) local41).method6215(arg3);
				return;
			}
			return;
		}
		((Class16_Sub1_Sub1_Sub4) local41).method2558(arg3);
		return;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIFIBLclient!sb;FFIFFII[B)V")
	public static void method6633(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(5) Class310 arg2, @OriginalArg(6) float arg3, @OriginalArg(7) float arg4, @OriginalArg(9) float arg5, @OriginalArg(10) float arg6, @OriginalArg(11) int arg7, @OriginalArg(13) byte[] arg8) {
		@Pc(10) float[] local10 = new float[16384];
		@Pc(39) int local39;
		@Pc(49) int local49;
		for (@Pc(12) int local12 = 0; local12 < 8; local12++) {
			arg2.method7306(arg4 / (float) 128, arg1 / (float) 128, arg5 * 127.0F, arg6 / (float) 16, 0, local10, arg0);
			local39 = arg7;
			arg4 *= 2.0F;
			arg6 *= 2.0F;
			for (local49 = 0; local49 < 16384; local49++) {
				arg8[local39] = (byte) (int) ((float) arg8[local39] + local10[local49]);
				local39++;
			}
			arg5 *= arg3;
			arg1 *= 2.0F;
		}
		local39 = arg7;
		for (local49 = 0; local49 < 16384; local49++) {
			arg8[local39] = (byte) (arg8[local39] + 127);
			local39++;
		}
	}
}
