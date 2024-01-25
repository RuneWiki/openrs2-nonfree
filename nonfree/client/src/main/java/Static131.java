import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static131 {

	@OriginalMember(owner = "client!ev", name = "d", descriptor = "[I")
	public static final int[] anIntArray180 = new int[6];

	@OriginalMember(owner = "client!ev", name = "k", descriptor = "Lclient!dc;")
	public static final Class70 aClass70_5 = new Class70();

	@OriginalMember(owner = "client!ev", name = "l", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("c212a1842345687146f935ba8e59ac85b4a7a90dfce3d12aba32dc1f33f4f217da4c8c7af730f209fb0810773793679f635f3a73ab65bc3f49569f108f77b5a53b09ac541ebcd44ca817fbd98edfee7ce09e251af793a2a360aa4a69b6b10a6114449caa140cf7ceccb471e38ea7b65aeeddd62ec41c674598a0188cbfad06f8fcf00fe83f26e69de6787b8d23ade62741250820876c592f75d2abc3e4302c3d1ab55b4ded17802ef0c4c99a25b4131f0edc7c7292c143b87973d0cc6cf31e77a27cc5546e0b2c8458001de6f0f0d1c5cca57c975563721b98ac0f1bbd6f20206ac69de0182e9a277d19dab0df8658a1cf6baa96cae460487f22cd50526ea4d7d2d290520b7bbc0c2a9fc9257bb87492c8f7115c76c1684d1374d090241dc887c90cf110f1caa429384ca89e4c3229e79035252f109ea806e0067d37c7dfcd7d434ee2a94a6dd63f9e66461694f6839097db1a7d8b98ff38e6d85ec4a51f34acaace7522490bd72effd3deda7bdf3b65732cf571c49d5547cb664793c8e81de8449c3180133c93b832de8c763b85766eb8947ed180f07d94d69c927fb152408bde6413933f8fe1744180330e8039c600600a811e92cb0ddad2759f5ebf04d988ee6466105148f12649613bf4759e989ce3487562d929aaaf9abb2c24047a85a4f5575ace1ab68cde93c7d2e76e81f18f87e047d0e8903d18ec7f7ae2494887ef", 16);

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(ZII)Z")
	public static boolean method1767(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(III)V")
	public static void method1770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static283.aClass308_10 == Static18.aClass308_7) {
			if (!Static425.method5884(0, -2, 1, arg1, 1, false, 0, arg0)) {
				Static425.method5884(0, -3, 1, arg1, 1, false, 0, arg0);
			}
		} else if (!Static425.method5884(0, -3, 1, arg1, 1, false, 0, arg0)) {
			Static425.method5884(0, -2, 1, arg1, 1, false, 0, arg0);
		}
	}
}
