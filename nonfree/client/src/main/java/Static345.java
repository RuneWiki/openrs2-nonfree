import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!wf", name = "u", descriptor = "Lclient!hb;")
	public static Class79 aClass79_1;

	@OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
	public static int anInt6709 = 0;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIILclient!os;ZILclient!tj;)V")
	public static void method5623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class120 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) Class122 arg5) {
		if (arg4) {
			Static164.aClass57_23.method5448((Static298.anInt5944 - Static164.aClass57_23.method5433()) / 2, (Static171.anInt3583 - Static164.aClass57_23.method5441()) / 2);
			Static237.aClass57_15.method5448((Static298.anInt5944 - Static237.aClass57_15.method5433()) / 2, 18);
		}
		arg3.method5547(-1, Static309.anInt6133 == 1 ? Static181.aString32 : Static40.aString238, Static298.anInt5944 / 2, arg0, Static171.anInt3583 / 2 - 26);
		@Pc(54) int local54 = Static171.anInt3583 / 2 - 18;
		arg5.method4728(Static298.anInt5944 / 2 - 152, local54, 304, 34, arg1, 0);
		arg5.method4728(Static298.anInt5944 / 2 - 151, local54 - -1, 302, 32, 0, 0);
		arg5.method4732(Static298.anInt5944 / 2 - 150, local54 + 2, Static176.anInt5893 * 3, 30, arg2, 0);
		arg5.method4732(Static176.anInt5893 * 3 + Static298.anInt5944 / 2 - 150, local54 - -2, 300 - Static176.anInt5893 * 3, 30, 0, 0);
		arg3.method5547(-1, Static176.aString218, Static298.anInt5944 / 2, arg0, Static171.anInt3583 / 2 + 4);
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(II)V")
	public static void method5625() {
		Static181.aClass198_14.method5243(5);
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)V")
	public static void method5626() {
		if (!Static155.aBoolean96) {
			return;
		}
		@Pc(17) Class181 local17 = Static214.method3735(Static203.anInt4169, Static147.anInt2908);
		if (local17 != null && local17.anObjectArray26 != null) {
			@Pc(26) Class3_Sub41 local26 = new Class3_Sub41();
			local26.anObjectArray34 = local17.anObjectArray26;
			local26.aClass181_54 = local17;
			Static139.method2275(local26);
		}
		Static155.aBoolean96 = false;
		Static164.anInt6256 = -1;
		Static316.method5250(local17);
	}
}
