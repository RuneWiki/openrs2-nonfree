import jaggl.OpenGL;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!et", name = "J", descriptor = "Lclient!mi;")
	public static Class46 aClass46_13;

	@OriginalMember(owner = "client!et", name = "K", descriptor = "Lclient!mi;")
	public static Class46 aClass46_14;

	@OriginalMember(owner = "client!et", name = "L", descriptor = "Lclient!jj;")
	public static Class167 aClass167_2;

	@OriginalMember(owner = "client!et", name = "H", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger3 = new BigInteger("c88e80e2341a1d30e6dc4c5665a6e1c8b2e9d5b2380aa4bde34378d2c8a575bd47b17d6aaa56b365d411f60440764a0d0b44b55acdddd53b2fa17b7fbcdbe2756c0218419880392addf93f1ca3d24f8c65bf88a5a99e54bc07a0a94dc4fb95aafbdcdc886aa2f9c13202a81ae64b5bc969d4076536982adbdbe5f104b34cde5c3de403ef6950d88a952b37c218e0c2560027b40e4729076205c3486416ce4aea1cade4b660f1698ec76164ab7d611827e6d920a63c8b78d3ff6e45e9eea2d5fbb24988330204c003af4b061f24c1b415dcad503e7283311ee2045501e49b1bab75f3d5f9316dd9cfcfd8ad3d87907c910959e3b40ba664ef60929a0b4ac33033478d0f15d96983a5f8ac876047ac7e851c478807707d0480808c269f69f3fc570e2051dc8651dd9cfede9b6dc1bb182d8273e969bef49c14a74bbd7ecb743819468e01a1e08419e2654d7a51c1371d65918b97b8d9931cbaa8011027bf4927ac4b5ea533e47652f1e706af0b3a8aafc3842bc4be87e0622a829cadb62a6457bd5609ea7435a85ab2e88a4c92914291c6e47669effdff7289ac66aadfe870b1cd578e8b8bfd1c8c8ac3276c59399a83960b2bf0c46f6f529455dc32153e59e08d7f30a59b64f896a4b087329c59a7507f22b9ecdfef44467e272ad4b4ea91e1cfbebef0f197055514c1789466f6bb7a9a20fed9d65204b033b9adb16a46532505", 16);

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IILclient!qo;Ljava/lang/String;)Lclient!tba;")
	public static Class324 method3091(@OriginalArg(0) int arg0, @OriginalArg(2) Class20_Sub3 arg1, @OriginalArg(3) String arg2) {
		@Pc(14) long local14 = OpenGL.glCreateShaderObjectARB(arg0);
		OpenGL.glShaderSourceARB(local14, arg2);
		OpenGL.glCompileShaderARB(local14);
		OpenGL.glGetObjectParameterivARB(local14, 35713, Static329.anIntArray398, 0);
		if (Static329.anIntArray398[0] == 0) {
			if (Static329.anIntArray398[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local14, 35716, Static329.anIntArray398, 1);
			if (Static329.anIntArray398[1] > 1) {
				@Pc(55) byte[] local55 = new byte[Static329.anIntArray398[1]];
				OpenGL.glGetInfoLogARB(local14, Static329.anIntArray398[1], Static329.anIntArray398, 0, local55, 0);
				System.out.println(new String(local55));
			}
			if (Static329.anIntArray398[0] == 0) {
				OpenGL.glDeleteObjectARB(local14);
				return null;
			}
		}
		return new Class324(arg1, local14, arg0);
	}
}
