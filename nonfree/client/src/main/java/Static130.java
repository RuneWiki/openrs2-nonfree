import java.math.BigInteger;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!ee", name = "Gc", descriptor = "I")
	public static int anInt9950;

	@OriginalMember(owner = "client!ee", name = "Md", descriptor = "D")
	public static double aDouble25;

	@OriginalMember(owner = "client!ee", name = "ob", descriptor = "I")
	public static int anInt9885 = 0;

	@OriginalMember(owner = "client!ee", name = "Ic", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger8 = new BigInteger("9433cff02d105ad4e45a50c83d2c692296130d9d5dbc705c4c4b181ce618425e838ae106d54285af02dc46244e1cc638a2491080d8398fdcfaf2b1e6eb89f1ebc98b5f50757ad060418e3b121f165c7ea0f02d65781f5486b49dadf49efb039d5ad7236b458ea04afbd9f3a188693cc9b470361666076847d9a71e773bffafe8d90103de5d2eb170d8ccdb6fae7c720727552bfd98d730ee287051748ce23f13efa8ed822023b2dec86813952e5049332b3e5a53cacc25d4a04dd618df9efae1e6d72d1e2a247f4d59a3e433591e68552e74cd0fd744c0c7ca2de8092b5fae7309a9c8df0179e5b2f1b63660e403207c390d1dfca47b28071572a97db6a128c8d4fb4469e3906af56ae6f3bb2bfd566b4bab73f1f35a255581e9273f244bbb67f1a6b60a8714f4a0b33db8bc242b45d1920384d05097a9532c4749f495b7a9ef3c1870483c7080dca35e9b75062e0daa3c7eef3f82667feab15e4f96262f6d925bb998ee0364b32b015e4650a8ef19fd52b5874614715ffa0ea79e0933a8826f304ab48f8dc58d24d0b6d9f442f9453265b08d298a08d8364ee9aa5b4de4fe1ceef0c38abc28b5d96588369046548ad194a4bf9d7107f6c8a29463f87d42f64737fd62155008df350b31b1f42156b05c62e35a136c62a3d74b1cc89635acd604772daaf2958dee1a72cd6ecc507de891404687123f59141f580492605f4fe96d", 16);

	@OriginalMember(owner = "client!ee", name = "qd", descriptor = "[I")
	public static final int[] anIntArray532 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method8168(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(22) int local22 = arg0.length();
		while (local22 > local11 && Static605.method8252(arg0.charAt(local11))) {
			local11++;
		}
		while (local22 > local11 && Static605.method8252(arg0.charAt(local22 - 1))) {
			local22--;
		}
		@Pc(61) int local61 = local22 - local11;
		if (local61 < 1 || local61 > 12) {
			return null;
		}
		@Pc(76) StringBuffer local76 = new StringBuffer(local61);
		for (@Pc(78) int local78 = local11; local78 < local22; local78++) {
			@Pc(84) char local84 = arg0.charAt(local78);
			if (Static176.method2775(local84)) {
				@Pc(92) char local92 = Static238.method5010(local84);
				if (local92 != '\u0000') {
					local76.append(local92);
				}
			}
		}
		if (local76.length() == 0) {
			return null;
		} else {
			return local76.toString();
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IB)[B")
	public static byte[] method8186(@OriginalArg(0) int arg0) {
		@Pc(17) Class3_Sub5_Sub7 local17 = (Class3_Sub5_Sub7) Static358.aClass325_1.method7319((long) arg0);
		if (local17 == null) {
			@Pc(22) byte[] local22 = new byte[512];
			@Pc(28) Random local28 = new Random((long) arg0);
			for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
				local22[local30] = (byte) local30;
			}
			for (@Pc(45) int local45 = 0; local45 < 255; local45++) {
				@Pc(51) int local51 = 255 - local45;
				@Pc(56) int local56 = Static93.method1603(local51, local28);
				@Pc(60) byte local60 = local22[local56];
				local22[local56] = local22[local51];
				local22[local51] = local22[511 - local45] = local60;
			}
			local17 = new Class3_Sub5_Sub7(local22);
			Static358.aClass325_1.method7322(local17, (long) arg0);
		}
		return local17.aByteArray15;
	}
}
