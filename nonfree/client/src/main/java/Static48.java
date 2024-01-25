import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!bn", name = "q", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_9 = new Class200(9, -1);

	@OriginalMember(owner = "client!bn", name = "r", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_21 = new Class130(44, 3);

	@OriginalMember(owner = "client!bn", name = "s", descriptor = "Z")
	public static boolean aBoolean92 = false;

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(III)Z")
	public static boolean method1417(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static368.method5984(arg1, arg0) | (arg1 & 0x70000) != 0 || Static136.method2563(arg1, arg0);
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Z)V")
	public static void method1421(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static330.aClass77ArrayArrayArray2 = Static338.aClass77ArrayArrayArray3;
			Static364.aClass51Array3 = Static2.aClass51Array1;
		} else {
			Static330.aClass77ArrayArrayArray2 = Static68.aClass77ArrayArrayArray1;
			Static364.aClass51Array3 = Static559.aClass51Array4;
		}
		Static442.anInt7929 = Static330.aClass77ArrayArrayArray2.length;
	}

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "(I)V")
	public static void method1426() {
		@Pc(17) Class3_Sub14 local17 = Static139.method2308(Static424.aClass130_105, Static24.aClass233_1);
		local17.aClass3_Sub3_Sub2_2.method4220(Static634.method8682());
		local17.aClass3_Sub3_Sub2_2.method4201(Static109.anInt2357);
		local17.aClass3_Sub3_Sub2_2.method4201(Static330.anInt6165);
		local17.aClass3_Sub3_Sub2_2.method4220(Static262.aClass3_Sub27_12.aClass21_Sub26_2.method8162());
		Static562.method8096(local17);
	}
}
