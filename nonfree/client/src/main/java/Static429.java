import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!pf", name = "g", descriptor = "[I")
	public static int[] anIntArray527;

	@OriginalMember(owner = "client!pf", name = "i", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger7 = new BigInteger("8204013232bc4e4e727b2641e0a0ba41d3ad6f01ebde2b9f6a0134e88dbbe990c4c34a75d9b717a4e47c8c702125effcc5d98c914340642f28fcf2855169504afc39e59929083b7a32c237bf665dc089f1386e26a10c3dd6a66d973b13b8ce59543c8e3317b6c5ad2ce3625f67f8ccc9edc4e7af8fccda07e57529aae8cdd176d137cb8a8361760c829a5ff1074ec75bf9754cc8b3d388a04703a91ba595643161bd211461e7611cc7720e12861cc16cb92fa63ff6156b3245300945453c549725277f190c18c54aa0e0e92cbcff5d24598a377f1a78891267d1c5b3795f4bbb1d599d16ecb5dbf644f8a202976499b25692d5ace4c4559d595603920ffcca2eb94b11fe7f3db7f862ebd0f49a88493ca9532661b9ac0af6d693d797739f198a55dc9078b82bcf504d6f076b5be5306c6742c867426182f8af7c4422da2dffaf00c810838f48d2dbe27d1bae5d6d47b7c0a9b54d2ecd674a82b18918d92f98553ba69bb9dab543a891999005d347d88f0b7346eeed71188b2d569117e71b2b175f63abc9b43c9ff6957c1a25cff16610bb09ae285f37cbfffaa4c438609d5139ed88b7a09c94bee55ab1d4a6a4c116caef9766768186e728eb5e55a5c99ddd7e67e57b712970a02b747c4637741736316fee8fafae22d0ce3fef12f1656104278f4a127ce0eeafe4618d6cc72eac94a11678769fdb46550695d59fd16ea76947", 16);

	@OriginalMember(owner = "client!pf", name = "k", descriptor = "Z")
	public static boolean aBoolean581 = false;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "([Ljava/lang/String;I)V")
	public static void method6434(@OriginalArg(0) String[] arg0) {
		if (arg0.length <= 1) {
			Static216.aString49 = Static216.aString49 + arg0[0];
			Static209.anInt4374 += arg0[0].length();
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			if (arg0[local11].startsWith("pause")) {
				@Pc(20) int local20 = 5;
				try {
					local20 = Integer.parseInt(arg0[local11].substring(6));
				} catch (@Pc(29) Exception local29) {
				}
				Static576.method8008("Pausing for " + local20 + " seconds...");
				Static366.anInt6577 = local11 + 1;
				Static7.aStringArray2 = arg0;
				Static505.aLong234 = Static438.method6517() + (long) (local20 * 1000);
				return;
			}
			Static216.aString49 = arg0[local11];
			Static66.method1256(false);
		}
	}
}
