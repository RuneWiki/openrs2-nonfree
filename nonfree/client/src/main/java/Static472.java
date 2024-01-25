import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static472 {

	@OriginalMember(owner = "client!se", name = "e", descriptor = "I")
	public static int anInt8018;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
	public static void method6447() {
		Static399.anInt7026 = Static379.anInt6307;
		Static146.aBoolean750 = false;
		Static240.aClass342Array2 = new Class342[500];
		Static372.anInt6224 = 0;
		Static134.anInt2588 = 0;
		Static246.anInt4517 = 0;
		Static312.aClass342Array3 = new Class342[500];
		Static220.aClass342Array1 = new Class342[1000];
		Static518.anInt8776 = Static379.anInt6307;
		Static117.anInt2295 = 0;
		Static546.aClass342Array4 = new Class342[2000];
		Static172.anIntArrayArrayArray4 = new int[Static175.anInt9133][Static27.anInt373 + 1][Static507.anInt8645 + 1];
		if (Static402.aClass134_11 instanceof l) {
			Static419.aBoolean572 = false;
		} else {
			Static419.aBoolean572 = true;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(III)V")
	public static void method6448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class39 local7 = Static292.aClass39ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static395.method5455(local7.aClass8_Sub3_Sub4_1);
		Static395.method5455(local7.aClass8_Sub3_Sub4_2);
		if (local7.aClass8_Sub3_Sub4_1 != null) {
			local7.aClass8_Sub3_Sub4_1 = null;
		}
		if (local7.aClass8_Sub3_Sub4_2 != null) {
			local7.aClass8_Sub3_Sub4_2 = null;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IBI)Z")
	public static boolean method6449(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10) != 0;
	}
}
