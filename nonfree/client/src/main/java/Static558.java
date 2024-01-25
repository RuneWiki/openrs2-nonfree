import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static558 {

	@OriginalMember(owner = "client!tba", name = "b", descriptor = "[I")
	public static int[] anIntArray502;

	@OriginalMember(owner = "client!tba", name = "d", descriptor = "[Lclient!qda;")
	public static Class59[] aClass59Array16;

	@OriginalMember(owner = "client!tba", name = "c", descriptor = "I")
	public static int anInt9108 = 0;

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(I[B)V")
	public static synchronized void method7657(@OriginalArg(1) byte[] arg0) {
		if (arg0.length == 100 && Static447.anInt7823 < 1000) {
			Static353.aByteArrayArray12[Static447.anInt7823++] = arg0;
		} else if (arg0.length == 5000 && Static187.anInt3087 < 250) {
			Static63.aByteArrayArray1[Static187.anInt3087++] = arg0;
		} else if (arg0.length == 30000 && Static213.anInt3438 < 50) {
			Static621.aByteArrayArray23[Static213.anInt3438++] = arg0;
		} else if (Static533.aByteArrayArrayArray16 != null) {
			for (@Pc(69) int local69 = 0; local69 < Static171.anIntArray163.length; local69++) {
				if (Static171.anIntArray163[local69] == arg0.length && Static67.anIntArray61[local69] < Static533.aByteArrayArrayArray16[local69].length) {
					Static533.aByteArrayArrayArray16[local69][Static67.anIntArray61[local69]++] = arg0;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method7659(@OriginalArg(0) int arg0) {
		@Pc(21) byte[] local21;
		if (arg0 == 100 && Static447.anInt7823 > 0) {
			local21 = Static353.aByteArrayArray12[--Static447.anInt7823];
			Static353.aByteArrayArray12[Static447.anInt7823] = null;
			return local21;
		} else if (arg0 == 5000 && Static187.anInt3087 > 0) {
			local21 = Static63.aByteArrayArray1[--Static187.anInt3087];
			Static63.aByteArrayArray1[Static187.anInt3087] = null;
			return local21;
		} else if (arg0 == 30000 && Static213.anInt3438 > 0) {
			local21 = Static621.aByteArrayArray23[--Static213.anInt3438];
			Static621.aByteArrayArray23[Static213.anInt3438] = null;
			return local21;
		} else {
			if (Static533.aByteArrayArrayArray16 != null) {
				for (@Pc(79) int local79 = 0; local79 < Static171.anIntArray163.length; local79++) {
					if (arg0 == Static171.anIntArray163[local79] && Static67.anIntArray61[local79] > 0) {
						@Pc(106) byte[] local106 = Static533.aByteArrayArrayArray16[local79][--Static67.anIntArray61[local79]];
						Static533.aByteArrayArrayArray16[local79][Static67.anIntArray61[local79]] = null;
						return local106;
					}
				}
			}
			return new byte[arg0];
		}
	}
}
