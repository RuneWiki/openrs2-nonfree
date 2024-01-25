import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!df", name = "g", descriptor = "I")
	public static int anInt1242;

	@OriginalMember(owner = "client!df", name = "k", descriptor = "[[B")
	public static byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!df", name = "e", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_24 = new Class2(55, 6);

	@OriginalMember(owner = "client!df", name = "b", descriptor = "([BI)[B")
	public static byte[] method968(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static464.method3633(arg0, 0, local9, 0, local6);
		return local9;
	}
}
