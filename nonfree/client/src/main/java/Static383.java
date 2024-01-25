import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!nq", name = "ub", descriptor = "I")
	public static int anInt7319;

	@OriginalMember(owner = "client!nq", name = "A", descriptor = "I")
	public static int anInt7281 = 0;

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!et;I)V")
	public static void method6061(@OriginalArg(0) Class3_Sub1_Sub4 arg0) {
		if (Static433.aBoolean672) {
			return;
		}
		arg0.method8671();
		Static443.anInt8026--;
		if (!arg0.aBoolean288) {
			@Pc(21) long local21 = arg0.aLong73;
			@Pc(27) Class3_Sub1_Sub10 local27;
			for (local27 = (Class3_Sub1_Sub10) Static107.aClass307_15.method7424(local21); local27 != null && !local27.aString59.equals(arg0.aString27); local27 = (Class3_Sub1_Sub10) Static107.aClass307_15.method7422()) {
			}
			if (local27 != null && local27.method4923(arg0)) {
				Static478.method8208(local27);
			}
			return;
		}
		for (@Pc(59) Class3_Sub1_Sub10 local59 = (Class3_Sub1_Sub10) Static379.aClass30_9.method780(); local59 != null; local59 = (Class3_Sub1_Sub10) Static379.aClass30_9.method783()) {
			if (local59.aString59.equals(arg0.aString27)) {
				@Pc(69) boolean local69 = false;
				for (@Pc(75) Class3_Sub1_Sub4 local75 = (Class3_Sub1_Sub4) local59.aClass30_7.method780(); local75 != null; local75 = (Class3_Sub1_Sub4) local59.aClass30_7.method783()) {
					if (arg0 == local75) {
						if (local59.method4923(arg0)) {
							Static478.method8208(local59);
						}
						local69 = true;
						break;
					}
				}
				if (local69) {
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)V")
	public static void method6077() {
		Static376.aClass112_43.method3638();
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IZI)I")
	public static int method6079(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(24) byte local24;
		if (arg1 > 20000) {
			local24 = 4;
			Static351.method5758();
		} else if (arg1 > 10000) {
			local24 = 3;
			Static596.method8155();
		} else if (arg1 > 5000) {
			Static173.method8277();
			local24 = 2;
		} else {
			Static534.method7607();
			local24 = 1;
		}
		if (arg0 != Static552.aClass3_Sub48_30.aClass23_Sub18_2.method5152()) {
			Static552.aClass3_Sub48_30.method7830(Static552.aClass3_Sub48_30.aClass23_Sub18_1, arg0);
			Static559.method7893(false, arg0);
		}
		Static152.method3314();
		return local24;
	}
}
