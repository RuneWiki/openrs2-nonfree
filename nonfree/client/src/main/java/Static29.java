import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger7 = new BigInteger("f81a9bd83e1b8e3678882af6eafc821d6ca33d7c921982bb63b5de3bba72ec93803b4364b7810299fe94561c630c9d853cd37e1873becb61211f1b297c74a550fc7a3edfd3755a7bbf912033c97ff14de8343b4aa60cc5921b8d36c60e7cdeee67098d8d13f4291db006dbdba6650dc335517c67432f9be70177c3150c1dbc69cf38623890e0a1065f943340c7ef0374035f42aa1fce8e042e84c520e48318c0d040e513cc61ab854d8fd0c4ecc8ef02b225f945063075d9a4582bb71fedf6a164904550a16b7f5abe7181217d308d7fd5ebc920ac7e801de6c3f2b5242d7e04c699c4925de874bdf2c286452c6a2d19aaa25b2ce5d610faccdd7496fb4fbd1cbdd8e93b98d003f5cf5224fd53c12e10f4f31c25d473d3ddfc60bac2afbb95f2b87b18f35b1b04bec3033b6603cf37405e50c0c53fe82cb895fb0d560d3e3f10f5de6fe9e838c858b74e6350ae30329e193abc88387a56709ad3b65543407869a92eb9bfdb33f4404b2b255ff50bbc5a26d4173e48002d50853f581314d8e6f36ef9bc4e1e4bc636cfffd3988e0be940c0978df738fbaf4eec8ad7ef270c3c4abd57660aeafae6100a5cac7d5f84dcc097f20c9f9c4d02c57fffa657c9d62daa5a00f92604cb5ba266244ba925d3648cdb4a345fc8d6624ae61bebfabcd4f290ca73c4551a7e0e456728d700152cc32a56f78e9580fd5744674e1dc368e9e1d1", 16);

	@OriginalMember(owner = "client!baa", name = "c", descriptor = "(I)V")
	public static void method5863() {
		while (true) {
			if (Static455.aClass3_Sub26_Sub1_2.method5551(Static42.anInt1159) >= 15) {
				@Pc(22) int local22 = Static455.aClass3_Sub26_Sub1_2.method5553(15);
				if (local22 != 32767) {
					@Pc(29) boolean local29 = false;
					@Pc(36) Class3_Sub39 local36 = (Class3_Sub39) Static581.aClass297_39.method6531((long) local22);
					@Pc(42) Class25_Sub2_Sub2_Sub5_Sub2 local42;
					if (local36 == null) {
						local42 = new Class25_Sub2_Sub2_Sub5_Sub2();
						local42.anInt8529 = local22;
						local36 = new Class3_Sub39(local42);
						Static581.aClass297_39.method6537((long) local22, local36);
						local29 = true;
						Static33.aClass3_Sub39Array1[Static238.anInt4737++] = local36;
					}
					local42 = local36.aClass25_Sub2_Sub2_Sub5_Sub2_2;
					Static529.anIntArray535[Static60.anInt1599++] = local22;
					local42.anInt8550 = Static397.anInt6998;
					if (local42.aClass213_1 != null && local42.aClass213_1.method5006()) {
						Static202.method3488(local42);
					}
					@Pc(98) int local98 = Static455.aClass3_Sub26_Sub1_2.method5553(2);
					@Pc(103) int local103 = Static455.aClass3_Sub26_Sub1_2.method5553(1);
					@Pc(110) int local110 = Static455.aClass3_Sub26_Sub1_2.method5553(5);
					local42.method6690(Static181.aClass60_1.method1797(Static455.aClass3_Sub26_Sub1_2.method5553(14)));
					if (local110 > 15) {
						local110 -= 32;
					}
					@Pc(131) int local131 = Static455.aClass3_Sub26_Sub1_2.method5553(5);
					if (local131 > 15) {
						local131 -= 32;
					}
					@Pc(146) int local146 = Static455.aClass3_Sub26_Sub1_2.method5553(3) + 4 << 11 & 0x3B8E;
					@Pc(151) int local151 = Static455.aClass3_Sub26_Sub1_2.method5553(1);
					if (local151 == 1) {
						Static105.anIntArray86[Static427.anInt7540++] = local22;
					}
					local42.method6673(local42.aClass213_1.anInt6196);
					local42.anInt8506 = local42.aClass213_1.anInt6186 << 3;
					if (local29) {
						local42.method6672(true, local146);
					}
					local42.method6688(local42.method6668(), local103 == 1, local110 + Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anIntArray512[0], local98, local131 + Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anIntArray513[0]);
					if (local42.aClass213_1.method5006()) {
						Static138.method2725(local42.anIntArray513[0], null, local42, local42.anIntArray512[0], 0, local42.aByte117, null);
					}
					continue;
				}
			}
			Static455.aClass3_Sub26_Sub1_2.method5547();
			return;
		}
	}
}
