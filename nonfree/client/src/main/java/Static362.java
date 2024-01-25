import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!o", name = "d", descriptor = "I")
	public static int anInt6567 = 0;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public static boolean method5319(@OriginalArg(1) String arg0) {
		return Static300.method7776(arg0, fw.class);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IZ)V")
	public static void method5323(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static165.anInt3165 != -1) {
				Static257.method3746(Static165.anInt3165);
			}
			for (@Pc(18) Class1_Sub38 local18 = (Class1_Sub38) Static148.aClass91_6.method2278(); local18 != null; local18 = (Class1_Sub38) Static148.aClass91_6.method2276()) {
				if (!local18.method7907()) {
					local18 = (Class1_Sub38) Static148.aClass91_6.method2278();
					if (local18 == null) {
						break;
					}
				}
				Static336.method5001(true, local18, false);
			}
			Static165.anInt3165 = -1;
			Static148.aClass91_6 = new Class91(8);
			Static570.method7676();
			Static165.anInt3165 = Static142.anInt2751;
			Static209.method7201(false);
			Static506.method7088();
			Static451.method6308(Static165.anInt3165);
		}
		Static447.aBoolean596 = true;
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(I)V")
	public static void method5324(@OriginalArg(0) int arg0) {
		Static584.anInt9623 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static327.anInt5993; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static191.anInt3757; local6++) {
				if (Static568.aClass360ArrayArrayArray22[arg0][local3][local6] == null) {
					Static568.aClass360ArrayArrayArray22[arg0][local3][local6] = new Class360(arg0);
				}
			}
		}
	}
}
