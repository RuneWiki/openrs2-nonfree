import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static675 {

	@OriginalMember(owner = "client!wr", name = "l", descriptor = "I")
	public static int anInt10315 = 100;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(II)I")
	public static int method8723(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(20) int local20 = local7 | local7 >>> 1;
		@Pc(26) int local26 = local20 | local20 >>> 2;
		@Pc(32) int local32 = local26 | local26 >>> 4;
		@Pc(38) int local38 = local32 | local32 >>> 8;
		@Pc(44) int local44 = local38 | local38 >>> 16;
		return ~local44 & arg0;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZI)V")
	public static void method8724(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static277.anInt5201 != -1) {
				Static452.method6501(Static277.anInt5201);
			}
			for (@Pc(18) Class3_Sub28 local18 = (Class3_Sub28) Static222.aClass62_21.method1680(); local18 != null; local18 = (Class3_Sub28) Static222.aClass62_21.method1681()) {
				if (!local18.method8771()) {
					local18 = (Class3_Sub28) Static222.aClass62_21.method1680();
					if (local18 == null) {
						break;
					}
				}
				Static414.method5937(true, local18, false);
			}
			Static277.anInt5201 = -1;
			Static222.aClass62_21 = new Class62(8);
			Static180.method2976();
			Static277.anInt5201 = Static360.anInt6421;
			Static345.method5204(false);
			Static517.method7334();
			Static543.method7510(Static277.anInt5201);
		}
		Static520.aBoolean516 = true;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)I")
	public static int method8725() {
		return Static418.anInt7055 == 1 ? Static137.anInt2535 : Static224.anInt4089;
	}
}
