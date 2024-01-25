import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static435 {

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "Lclient!ra;")
	public static Class67 aClass67_11;

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_110 = new Class306("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method6295(@OriginalArg(0) int arg0) {
		@Pc(16) byte[] local16;
		if (arg0 == 100 && Static200.anInt3881 > 0) {
			local16 = Static68.aByteArrayArray3[--Static200.anInt3881];
			Static68.aByteArrayArray3[Static200.anInt3881] = null;
			return local16;
		} else if (arg0 == 5000 && Static263.anInt5061 > 0) {
			local16 = Static238.aByteArrayArray17[--Static263.anInt5061];
			Static238.aByteArrayArray17[Static263.anInt5061] = null;
			return local16;
		} else if (arg0 == 30000 && Static51.anInt1022 > 0) {
			local16 = Static164.aByteArrayArray8[--Static51.anInt1022];
			Static164.aByteArrayArray8[Static51.anInt1022] = null;
			return local16;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIII)I")
	public static int method6297(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static530.aByteArrayArrayArray17[arg0][arg1][arg2] & 0x8) == 0) {
			return arg0 <= 0 || (Static530.aByteArrayArrayArray17[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}
}
