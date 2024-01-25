import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "Lclient!us;")
	public static final Class344 aClass344_1 = new Class344(3, 7);

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "Lclient!an;")
	public static final Class20 aClass20_1 = new Class20(5, 16);

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BI)[B")
	public static synchronized byte[] method99(@OriginalArg(1) int arg0) {
		@Pc(21) byte[] local21;
		if (arg0 == 100 && Static574.anInt9695 > 0) {
			local21 = Static456.aByteArrayArray17[--Static574.anInt9695];
			Static456.aByteArrayArray17[Static574.anInt9695] = null;
			return local21;
		} else if (arg0 == 5000 && Static337.anInt6673 > 0) {
			local21 = Static157.aByteArrayArray7[--Static337.anInt6673];
			Static157.aByteArrayArray7[Static337.anInt6673] = null;
			return local21;
		} else if (arg0 == 30000 && Static205.anInt4767 > 0) {
			local21 = Static442.aByteArrayArray16[--Static205.anInt4767];
			Static442.aByteArrayArray16[Static205.anInt4767] = null;
			return local21;
		} else {
			if (Static600.aByteArrayArrayArray12 != null) {
				for (@Pc(74) int local74 = 0; local74 < Static268.anIntArray334.length; local74++) {
					if (arg0 == Static268.anIntArray334[local74] && Static262.anIntArray332[local74] > 0) {
						@Pc(104) byte[] local104 = Static600.aByteArrayArrayArray12[local74][--Static262.anIntArray332[local74]];
						Static600.aByteArrayArrayArray12[local74][Static262.anIntArray332[local74]] = null;
						return local104;
					}
				}
			}
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)Z")
	public static boolean method101(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I[B)V")
	public static synchronized void method102(@OriginalArg(1) byte[] arg0) {
		if (arg0.length == 100 && Static574.anInt9695 < 1000) {
			Static456.aByteArrayArray17[Static574.anInt9695++] = arg0;
		} else if (arg0.length == 5000 && Static337.anInt6673 < 250) {
			Static157.aByteArrayArray7[Static337.anInt6673++] = arg0;
		} else if (arg0.length == 30000 && Static205.anInt4767 < 50) {
			Static442.aByteArrayArray16[Static205.anInt4767++] = arg0;
		} else if (Static600.aByteArrayArrayArray12 != null) {
			for (@Pc(67) int local67 = 0; local67 < Static268.anIntArray334.length; local67++) {
				if (Static268.anIntArray334[local67] == arg0.length && Static262.anIntArray332[local67] < Static600.aByteArrayArrayArray12[local67].length) {
					Static600.aByteArrayArrayArray12[local67][Static262.anIntArray332[local67]++] = arg0;
					return;
				}
			}
		}
	}
}
