import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static649 {

	@OriginalMember(owner = "client!uia", name = "b", descriptor = "Lclient!nl;")
	public static final Class258 aClass258_15 = new Class258("", 10);

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(I)Lclient!ss;")
	public static Class3_Sub48 method8732() {
		@Pc(6) Class3_Sub48 local6 = Static70.method896();
		local6.anInt9730 = 0;
		local6.aClass286_103 = null;
		local6.aClass3_Sub28_Sub2_1 = new Class3_Sub28_Sub2(5000);
		return local6;
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(IILclient!wka;)V")
	public static void method8733(@OriginalArg(1) int arg0, @OriginalArg(2) Class19_Sub1_Sub3_Sub2 arg1) {
		if (arg1.anIntArray425 == null) {
			return;
		}
		@Pc(22) int local22 = arg1.anIntArray425[arg0 + 1];
		if (arg1.aClass100_9.method8976() != local22) {
			arg1.aClass100_9.method8955(local22, arg1.aClass100_9.method8965());
			arg1.anInt7822 = arg1.anInt7824;
			return;
		}
	}
}
