import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!be", name = "e", descriptor = "I")
	public static int anInt2647;

	@OriginalMember(owner = "client!be", name = "k", descriptor = "I")
	public static int anInt2652;

	@OriginalMember(owner = "client!be", name = "b", descriptor = "[B")
	public static final byte[] aByteArray33 = new byte[520];

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
	public static void method2097() {
		Static220.anInt4237 = 0;
		for (@Pc(14) int local14 = 0; local14 < 2048; local14++) {
			Static510.aClass1_Sub35Array1[local14] = null;
			Static500.aByteArray97[local14] = 1;
			Static511.aClass296Array1[local14] = null;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)[Lclient!ba;")
	public static Class23[] method2098() {
		return new Class23[] { Static257.aClass23_4, Static554.aClass23_8, Static307.aClass23_5 };
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIII)I")
	public static int method2100(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static455.aByteArrayArrayArray17[arg1][arg2][arg0] & 0x8) == 0) {
			return arg1 <= 0 || (Static455.aByteArrayArrayArray17[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}
}
