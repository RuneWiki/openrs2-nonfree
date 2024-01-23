import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "Lclient!d;")
	public static Class17 aClass17_1;

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
	public static int anInt3836;

	@OriginalMember(owner = "client!sf", name = "j", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
	public static int anInt3841;

	@OriginalMember(owner = "client!sf", name = "p", descriptor = "[S")
	public static short[] aShortArray51;

	@OriginalMember(owner = "client!sf", name = "s", descriptor = "I")
	public static int anInt3843;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1302 = Static200.method3116("<col=40ff00>");

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1303 = Static200.method3116("Click to switch");

	@OriginalMember(owner = "client!sf", name = "i", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1304 = Static200.method3116("p12_full");

	@OriginalMember(owner = "client!sf", name = "r", descriptor = "[I")
	public static int[] anIntArray502 = new int[2048];

	@OriginalMember(owner = "client!sf", name = "t", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1305 = aClass60_1303;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)Lclient!kh;")
	public static Class60 method2859(@OriginalArg(1) int arg0) {
		@Pc(5) Class60 local5 = Static40.method681(arg0);
		for (@Pc(11) int local11 = local5.method1835() - 3; local11 > 0; local11 -= 3) {
			local5 = Static34.method611(new Class60[] { local5.method1797(0, local11), Static203.aClass60_1480, local5.method1818(local11) });
		}
		if (local5.method1835() > 9) {
			return Static34.method611(new Class60[] { Static219.aClass60_1642, local5.method1797(0, local5.method1835() - 8), Static201.aClass60_1464, Static37.aClass60_287, local5, Static190.aClass60_1374 });
		} else if (local5.method1835() > 6) {
			return Static34.method611(new Class60[] { Static191.aClass60_1375, local5.method1797(0, local5.method1835() - 4), Static188.aClass60_1360, Static37.aClass60_287, local5, Static190.aClass60_1374 });
		} else {
			return Static34.method611(new Class60[] { Static26.aClass60_195, local5, Static178.aClass60_1300 });
		}
	}
}
