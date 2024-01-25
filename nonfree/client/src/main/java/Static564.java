import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static564 {

	@OriginalMember(owner = "client!tea", name = "f", descriptor = "Lclient!ju;")
	public static Class185 aClass185_6;

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "[I")
	public static final int[] anIntArray400 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "Lclient!dg;")
	public static final Class81 aClass81_15 = new Class81();

	@OriginalMember(owner = "client!tea", name = "e", descriptor = "[Lclient!vj;")
	public static final Class371[] aClass371Array6 = new Class371[8];

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(ZI)V")
	public static void method5793(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static84.anInt2018 != -1) {
				Static23.method296(Static84.anInt2018);
			}
			for (@Pc(18) Class5_Sub39 local18 = (Class5_Sub39) Static452.aClass300_33.method7182(); local18 != null; local18 = (Class5_Sub39) Static452.aClass300_33.method7192()) {
				if (!local18.method9048()) {
					local18 = (Class5_Sub39) Static452.aClass300_33.method7182();
					if (local18 == null) {
						break;
					}
				}
				Static68.method931(local18, true, false);
			}
			Static84.anInt2018 = -1;
			Static452.aClass300_33 = new Class300(8);
			Static62.method837();
			Static84.anInt2018 = Static637.anInt10350;
			Static35.method492(false);
			Static283.method4543();
			Static652.method8737(Static84.anInt2018);
		}
		Static511.aString83 = "";
		Static178.aString23 = "";
		Static151.aBoolean260 = false;
		Static255.method3917();
		Static105.anInt2256 = -1;
		Static180.method2994(Static314.anInt5964);
		Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1 = new Class28_Sub1_Sub4_Sub2_Sub2();
		Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt10781 = Static201.anInt3834 * 512 / 2;
		Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anIntArray308[0] = Static201.anInt3834 / 2;
		Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt10784 = Static626.anInt10238 * 512 / 2;
		Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anIntArray307[0] = Static626.anInt10238 / 2;
		Static407.anInt7215 = 0;
		Static332.anInt6132 = 0;
		if (Static660.anInt10605 == 2) {
			Static407.anInt7215 = Static680.anInt10895 << 9;
			Static332.anInt6132 = Static184.anInt3595 << 9;
		} else {
			Static80.method1041();
		}
		Static459.method6575();
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(DI)V")
	public static void method5794(@OriginalArg(0) double arg0) {
		Static65.aClass254_1.method7356(Static504.aClass254_7);
		Static65.aClass254_1.method7358(0, 0, (int) arg0);
		Static374.aClass65_12.method6891(Static65.aClass254_1);
	}
}
