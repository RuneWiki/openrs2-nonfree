import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!gq", name = "k", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_99 = new Class240(9, 7);

	@OriginalMember(owner = "client!gq", name = "o", descriptor = "I")
	public static int anInt9082 = -1;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lclient!ha;ILclient!mea;)I")
	public static int method7393(@OriginalArg(0) Class95 arg0, @OriginalArg(2) Class225 arg1) {
		if (arg1.anInt6223 != -1) {
			return arg1.anInt6223;
		}
		if (arg1.anInt6226 != -1) {
			@Pc(23) Class250 local23 = arg0.anInterface2_12.method8330(arg1.anInt6226);
			if (!local23.aBoolean466) {
				return local23.aShort56;
			}
		}
		return arg1.anInt6218;
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(ZI)V")
	public static void method7394(@OriginalArg(0) boolean arg0) {
		Static333.method4737();
		if (!Static487.method6425(Static221.anInt3831)) {
			return;
		}
		Static156.anInt2889++;
		if (Static156.anInt2889 < 50 && !arg0) {
			return;
		}
		Static156.anInt2889 = 0;
		if (!Static231.aBoolean352 && Static12.aClass26_1 != null) {
			@Pc(39) Class3_Sub37 local39 = Static90.method1509(Static441.aClass240_74, Static226.aClass144_2);
			Static301.method2678(local39);
			try {
				Static538.method6888();
			} catch (@Pc(46) IOException local46) {
				Static231.aBoolean352 = true;
			}
		}
		Static333.method4737();
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(BI)V")
	public static void method7398(@OriginalArg(1) int arg0) {
		@Pc(14) Class3_Sub5_Sub20 local14 = Static447.method6065((long) arg0, 14);
		local14.method8834();
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method7399(@OriginalArg(1) String arg0) {
		Static390.method5455(0, arg0, "", 0, "", "");
	}
}
