import java.io.File;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static219 {

	@OriginalMember(owner = "client!j", name = "r", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger3 = new BigInteger("8a7185d3e399f62cc3811602839c8d086e8b3f1665b10a4fe9370714e5ff22eb4b3c10a749cd1ca9c272998e02cc39cb2ab7bcf7d0854bc7f997b186f6308c817ae0835b6c4a3941c24e5788f905a84db418fbe8dd58edf81f3e0467ca8997e6dacab541e64e18dd43f62a6748a136d320c06ab55b955e4d3751f7d49578eaf73ae06371096420720ea0ce04a5eb67afbda0813e60e0ce664c01aad16c6ddc19616a66a9f34eb11f56420112b84301291f7920538336221c1c239beaca94a6d3509648396c8154bc8b71c1741a3f1ed572d4891596183c4410c0412a4db72553d385cc2439706dcf4340571d1589ef085080d8fda4cec8ffc8d0fd7cd8bf8f104a8af1fe75ffe234aa0734e472ac4b5911d3c462eda8f487f6abe89c07f7e31d38eb7456cb84d5c7fa600d0d9afbe648999d31583bdd3330a3fdcb405fb8b56f35f3f2ee306b8d0ddd714536087db758b966d5f526dfd84b3ce56ae2eed7f6fc1491b61a5d78a686c361d39085744efbe8354f44d8f8e2b06b37b115af11da916b981624624fb2fc49662d8f2de94c12c7086e5947e34653453094b50c6ce6567a757df9486c25ace92737fdfd6d4279032b0d850f4f1f9900322ce14c7eb122ed39e89dd6b48b7781f9e258dc5d7a1d01e6b503f0db08829ef89e7452a171e6e3d84a2014011beb361f6a2fcccd519131f2fc11a8b292c43d49f0dce33788cf", 16);

	@OriginalMember(owner = "client!j", name = "V", descriptor = "[B")
	public static final byte[] aByteArray58 = new byte[2048];

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IBI)Z")
	public static boolean method4019(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static172.method6604(arg1, arg0) || Static462.method6933(arg1, arg0);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(CI)Z")
	public static boolean method4023(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ILjava/io/File;)[B")
	public static byte[] method4025(@OriginalArg(1) File arg0) {
		return Static155.method3051((int) arg0.length(), arg0);
	}
}
