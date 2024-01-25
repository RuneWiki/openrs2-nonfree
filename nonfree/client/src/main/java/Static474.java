import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static474 {

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "I")
	public static int anInt8507;

	@OriginalMember(owner = "client!raa", name = "d", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_113 = new Class71(99, -2);

	@OriginalMember(owner = "client!raa", name = "f", descriptor = "[I")
	public static final int[] anIntArray461 = new int[4096];

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(B)V")
	public static void method7035() {
		if (Static637.aClass80_3 != null) {
			Static637.aClass80_3.method3195();
		}
		if (Static28.aClass80_1 != null) {
			Static28.aClass80_1.method3195();
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(I[B)V")
	public static synchronized void method7037(@OriginalArg(1) byte[] arg0) {
		if (arg0.length == 100 && Static221.anInt5062 < 1000) {
			Static306.aByteArrayArray101[Static221.anInt5062++] = arg0;
		} else if (arg0.length == 5000 && Static469.anInt8487 < 250) {
			Static370.aByteArrayArray116[Static469.anInt8487++] = arg0;
		} else if (arg0.length == 30000 && Static221.anInt5060 < 50) {
			Static488.aByteArrayArray137[Static221.anInt5060++] = arg0;
		} else if (Static644.aByteArrayArrayArray23 != null) {
			for (@Pc(67) int local67 = 0; local67 < Static70.anIntArray82.length; local67++) {
				if (Static70.anIntArray82[local67] == arg0.length && Static554.anIntArray530[local67] < Static644.aByteArrayArrayArray23[local67].length) {
					Static644.aByteArrayArrayArray23[local67][Static554.anIntArray530[local67]++] = arg0;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method7038(@OriginalArg(0) int arg0) {
		@Pc(21) byte[] local21;
		if (arg0 == 100 && Static221.anInt5062 > 0) {
			local21 = Static306.aByteArrayArray101[--Static221.anInt5062];
			Static306.aByteArrayArray101[Static221.anInt5062] = null;
			return local21;
		} else if (arg0 == 5000 && Static469.anInt8487 > 0) {
			local21 = Static370.aByteArrayArray116[--Static469.anInt8487];
			Static370.aByteArrayArray116[Static469.anInt8487] = null;
			return local21;
		} else if (arg0 == 30000 && Static221.anInt5060 > 0) {
			local21 = Static488.aByteArrayArray137[--Static221.anInt5060];
			Static488.aByteArrayArray137[Static221.anInt5060] = null;
			return local21;
		} else {
			if (Static644.aByteArrayArrayArray23 != null) {
				for (@Pc(74) int local74 = 0; local74 < Static70.anIntArray82.length; local74++) {
					if (Static70.anIntArray82[local74] == arg0 && Static554.anIntArray530[local74] > 0) {
						@Pc(100) byte[] local100 = Static644.aByteArrayArrayArray23[local74][--Static554.anIntArray530[local74]];
						Static644.aByteArrayArrayArray23[local74][Static554.anIntArray530[local74]] = null;
						return local100;
					}
				}
			}
			return new byte[arg0];
		}
	}
}
