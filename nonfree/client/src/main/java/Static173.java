import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)V")
	public static void method3199() {
		Static168.aClass89_61.method3439();
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(IB)V")
	public static void method3200(@OriginalArg(0) int arg0) {
		if (arg0 == -1 && !Static107.aBoolean118) {
			Static168.method3119();
		} else if (arg0 != -1 && (arg0 != Static165.anInt4097 || !Static84.method1985()) && Static14.anInt485 != 0 && !Static107.aBoolean118) {
			Static175.method3276(arg0, Static142.aClass13_Sub1_20, Static14.anInt485);
		}
		Static165.anInt4097 = arg0;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(II)Lclient!ra;")
	public static Class72 method3201(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 & 0xFFFF;
		@Pc(16) int local16 = arg0 >> 16;
		if (Static197.aClass72ArrayArray1[local16] == null || Static197.aClass72ArrayArray1[local16][local12] == null) {
			@Pc(30) boolean local30 = Static62.method1443(local16);
			if (!local30) {
				return null;
			}
		}
		return Static197.aClass72ArrayArray1[local16][local12];
	}
}
