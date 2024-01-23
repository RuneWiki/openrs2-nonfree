import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
	public static int anInt2220;

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
	public static int anInt2219 = -1;

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "[I")
	public static int[] anIntArray187 = new int[200];

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
	public static void method1807() {
		Static207.method3280(0, 0);
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V")
	public static void method1808() {
		for (@Pc(10) Class1_Sub1_Sub4 local10 = (Class1_Sub1_Sub4) Static185.aClass24_21.method460(); local10 != null; local10 = (Class1_Sub1_Sub4) Static185.aClass24_21.method464()) {
			@Pc(20) Class22_Sub1 local20 = local10.aClass22_Sub1_1;
			if (Static295.anInt5586 != local20.anInt443 || local20.aBoolean29) {
				local10.method4616();
			} else if (local20.anInt438 <= Static37.anInt757) {
				local20.method449(Static147.anInt2946);
				if (local20.aBoolean29) {
					local10.method4616();
				} else {
					Static230.method3623(local20.anInt443, local20.anInt447, local20.anInt445, local20.anInt442, 60, local20, 0, -1L, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method1809(@OriginalArg(0) int arg0) {
		@Pc(21) byte[] local21;
		if (arg0 == 100 && Static229.anInt4478 > 0) {
			local21 = Static243.aByteArrayArray18[--Static229.anInt4478];
			Static243.aByteArrayArray18[Static229.anInt4478] = null;
			return local21;
		} else if (arg0 == 5000 && Static92.anInt1753 > 0) {
			local21 = Static76.aByteArrayArray4[--Static92.anInt1753];
			Static76.aByteArrayArray4[Static92.anInt1753] = null;
			return local21;
		} else if (arg0 == 30000 && Static15.anInt243 > 0) {
			local21 = Static108.aByteArrayArray9[--Static15.anInt243];
			Static108.aByteArrayArray9[Static15.anInt243] = null;
			return local21;
		} else {
			return new byte[arg0];
		}
	}
}
