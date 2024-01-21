import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "Lclient!ke;")
	public static Class52 aClass52_38;

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "[I")
	public static final int[] anIntArray343 = new int[100];

	@OriginalMember(owner = "client!uh", name = "e", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1915 = Static193.method3027("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!uh", name = "f", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1916 = Static193.method3027("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!uh", name = "h", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1917 = Static193.method3027("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)V")
	public static void method3038(@OriginalArg(1) int arg0) {
		if (Static126.method1762(arg0)) {
			Static149.method2178(Static49.aClass6ArrayArray1[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(JI)V")
	public static void method3039(@OriginalArg(0) long arg0) {
		if (arg0 != 0L) {
			Static93.aClass3_Sub4_Sub1_18.method1298(134);
			Static93.aClass3_Sub4_Sub1_18.method1250(arg0);
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IB)[B")
	public static synchronized byte[] method3041(@OriginalArg(0) int arg0) {
		@Pc(18) byte[] local18;
		if (arg0 == 100 && Static186.anInt3814 > 0) {
			local18 = Static180.aByteArrayArray7[--Static186.anInt3814];
			Static180.aByteArrayArray7[Static186.anInt3814] = null;
			return local18;
		} else if (arg0 == 5000 && Static126.anInt2494 > 0) {
			local18 = Static24.aByteArrayArray2[--Static126.anInt2494];
			Static24.aByteArrayArray2[Static126.anInt2494] = null;
			return local18;
		} else if (arg0 == 30000 && Static56.anInt1197 > 0) {
			local18 = Static155.aByteArrayArray5[--Static56.anInt1197];
			Static155.aByteArrayArray5[Static56.anInt1197] = null;
			return local18;
		} else {
			return new byte[arg0];
		}
	}
}
