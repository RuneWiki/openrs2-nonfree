import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static474 {

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
	public static int anInt7694 = 0;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!kv;B)V")
	public static void method6691(@OriginalArg(0) Class4_Sub6 arg0) {
		arg0.aClass4_Sub1_13 = null;
		@Pc(12) int local12 = arg0.aClass4_Sub8Array1.length;
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			arg0.aClass4_Sub8Array1[local22].aBoolean558 = false;
		}
		@Pc(42) Class387[] local42 = Class231.aClass387Array1;
		synchronized (Class231.aClass387Array1) {
			if (local12 < Class231.aClass387Array1.length && Static17.anIntArray27[local12] < 200) {
				Class231.aClass387Array1[local12].method9017(arg0);
				@Pc(73) int local73 = Static17.anIntArray27[local12]++;
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)V")
	public static void method6692() {
		@Pc(1) Class168 local1 = Static630.aClass168_93;
		synchronized (Static630.aClass168_93) {
			Static630.aClass168_93.method3852(5);
		}
	}
}
