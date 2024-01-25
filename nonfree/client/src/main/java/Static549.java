import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static549 {

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger4 = new BigInteger("b4f39e1b3c4d34abaca0b1771ce88db6bb88be4c31da26bdfad5ecc85e1deff5088ac7ce6cf768a7b123322223e740cd833376e4bb8f78021ff8271542ec220d78e1fead53541924d77d02dc461d073f46d8970d6c1c903e146dc60b2f38a53240ff2ad64092e9562cb138a919e9f2044dcb79382afe492386206b88208af03387a581d134073bd98e52a24f013805ef2380595b045a44f7b555d57028bcf656c06615b9e8cf79efb92f9dadbb50a48f030ac99d89ae3d7fa50ba3d3f7e195012aa6042b6e049a56ba6ad3cc5179af9e0973dd7bdbce1faac67153bd76747896ae1d02ade0dd19093780f9c6f12d77127fa28bc9bc5202528a110339a898bb660bca91b54084e999f5a9fe561afa68e98f19a8fef6c479086ebb71bff30e844b86854443debae2bea98341b804c8ef00fa69b351b60a997b2678e5a4182c8e1c6ca65e6bfd43dc6db752df99bd3c9d28e40f8841e2d89d7b2c825bce45b8e9b96c1cf7c33ea652b50998a5da497da91f1d6d2894dfed6713f4dff69246ec22c94907f049bb7916c893725e022362b856b0e7b96484394fce05df25111cb00d46dbf592ea9980f7a1763b3a2182b72312e20b2d3de5200698bba3fb2cbe17c89eba1c1fcf976893d3379fafa0cc9ed47f6421d7dafcba416bc234aafe46502e4369675ad0ce523d4140b635e736d9e3377dd22e557a69b34729bb931b547737dd", 16);

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "Lclient!kf;")
	public static final Class178 aClass178_22 = new Class178();

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(CB)C")
	public static char method7293(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
	public static void method7294() {
		@Pc(7) Class204 local7 = null;
		try {
			local7 = Static408.method5892("2");
			@Pc(28) Class3_Sub11 local28 = new Class3_Sub11(Static440.anInt7368 * 6 + 3);
			local28.method5213(1);
			local28.method5200(Static440.anInt7368);
			for (@Pc(38) int local38 = 0; local38 < Static468.anIntArray497.length; local38++) {
				if (Static351.aBooleanArray21[local38]) {
					local28.method5200(local38);
					local28.method5215(Static468.anIntArray497[local38]);
				}
			}
			local7.method4678(local28.anInt6128, 0, local28.aByteArray62);
		} catch (@Pc(69) Exception local69) {
		}
		try {
			if (local7 != null) {
				local7.method4677();
			}
		} catch (@Pc(76) Exception local76) {
		}
		Static359.aLong179 = Static158.method2936();
		Static11.aBoolean7 = false;
	}
}
