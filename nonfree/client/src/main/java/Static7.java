import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!af", name = "i", descriptor = "I")
	public static int anInt63 = 0;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IZLclient!uf;)V")
	public static void method60(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class8_Sub32 arg1) {
		@Pc(4) int local4 = arg1.anInt5295;
		@Pc(12) int local12 = (int) arg1.aLong203;
		arg1.method4273();
		if (arg0) {
			Static291.method2816(local4);
		}
		Static224.method3490(local4);
		@Pc(28) Class159 local28 = Static82.method1361(local12);
		if (local28 != null) {
			Static128.method2075(local28);
		}
		@Pc(35) int local35 = Static185.anInt3679;
		@Pc(37) int local37;
		for (local37 = 0; local37 < local35; local37++) {
			if (Static168.method4156(Static204.aShortArray34[local37])) {
				Static272.method4048(local37);
			}
		}
		if (Static185.anInt3679 == 1) {
			Static147.aBoolean246 = false;
			Static216.method3391(Static17.anInt485, Static202.anInt4178, Static111.anInt2293, Static215.anInt4426);
		} else {
			Static216.method3391(Static17.anInt485, Static202.anInt4178, Static111.anInt2293, Static215.anInt4426);
			local37 = Static229.aClass8_Sub1_Sub5_3.method2014(Static183.aString127);
			for (@Pc(80) int local80 = 0; local80 < Static185.anInt3679; local80++) {
				@Pc(93) int local93 = Static229.aClass8_Sub1_Sub5_3.method2014(Static105.method1704(local80));
				if (local37 < local93) {
					local37 = local93;
				}
			}
			Static202.anInt4178 = (Static225.aBoolean372 ? 26 : 22) + Static185.anInt3679 * 15;
			Static17.anInt485 = local37 + 8;
		}
		if (Static248.anInt4917 != -1) {
			Static88.method1440(1, Static248.anInt4917);
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ZIIZZ)Lclient!pk;")
	public static Class132 method62(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		@Pc(15) Class133 local15 = null;
		if (Static176.aClass57_3 != null) {
			local15 = new Class133(arg1, Static176.aClass57_3, Static123.aClass57Array1[arg1], 1000000);
		}
		Static83.aClass46_Sub1Array1[arg1] = Static139.aClass148_1.method3565(local15, Static253.aClass133_4, arg1);
		if (arg3) {
			Static83.aClass46_Sub1Array1[arg1].method978();
		}
		return new Class132(Static83.aClass46_Sub1Array1[arg1], arg0, arg2);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II)V")
	public static void method63() {
		Static183.aClass61_31.method1381(5);
	}
}
