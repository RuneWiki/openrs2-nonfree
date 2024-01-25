import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method543(@OriginalArg(0) String arg0) {
		@Pc(9) String local9 = Static40.method1345(Static517.method7398(arg0));
		if (local9 == null) {
			local9 = "";
		}
		return local9;
	}

	@OriginalMember(owner = "client!aha", name = "c", descriptor = "(I)V")
	public static void method544() {
		Static506.aClass94_47.method2952();
	}

	@OriginalMember(owner = "client!aha", name = "e", descriptor = "(I)V")
	public static void method545() {
		try {
			@Pc(20) int local20;
			if (Static453.anInt8163 == 1) {
				local20 = Static623.aClass6_Sub4_Sub2_4.method4801();
				if (local20 > 0 && Static623.aClass6_Sub4_Sub2_4.method4795()) {
					local20 -= Static597.anInt10148;
					if (local20 < 0) {
						local20 = 0;
					}
					Static623.aClass6_Sub4_Sub2_4.method4807(local20);
					return;
				}
				Static623.aClass6_Sub4_Sub2_4.method4805();
				Static623.aClass6_Sub4_Sub2_4.method4790();
				Static370.aClass315_1 = null;
				if (Static473.aClass223_111 == null) {
					Static453.anInt8163 = 0;
				} else {
					Static453.anInt8163 = 2;
				}
				Static152.aClass6_Sub12_1 = null;
			}
			if (Static453.anInt8163 == 3) {
				local20 = Static623.aClass6_Sub4_Sub2_4.method4801();
				if (Static619.anInt7284 > local20 && Static623.aClass6_Sub4_Sub2_4.method4795()) {
					local20 += Static47.anInt1661;
					if (Static619.anInt7284 < local20) {
						local20 = Static619.anInt7284;
					}
					Static623.aClass6_Sub4_Sub2_4.method4807(local20);
				} else {
					Static453.anInt8163 = 0;
					Static47.anInt1661 = 0;
				}
			}
		} catch (@Pc(104) Exception local104) {
			local104.printStackTrace();
			Static623.aClass6_Sub4_Sub2_4.method4805();
			Static370.aClass315_1 = null;
			Static473.aClass223_111 = null;
			Static152.aClass6_Sub12_1 = null;
			Static214.aClass6_Sub4_Sub2_2 = null;
			Static453.anInt8163 = 0;
		}
	}

	@OriginalMember(owner = "client!aha", name = "f", descriptor = "(I)Lclient!qm;")
	public static Class281 method546() {
		return Static212.method3802();
	}
}
