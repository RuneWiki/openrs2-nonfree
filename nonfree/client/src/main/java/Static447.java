import java.awt.Rectangle;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static447 {

	@OriginalMember(owner = "client!pb", name = "p", descriptor = "F")
	public static float aFloat176;

	@OriginalMember(owner = "client!pb", name = "q", descriptor = "Lclient!mh;")
	public static Class3_Sub34 aClass3_Sub34_1;

	@OriginalMember(owner = "client!pb", name = "m", descriptor = "Lclient!eaa;")
	public static final Class92 aClass92_12 = new Class92();

	@OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
	public static int anInt7715 = 0;

	@OriginalMember(owner = "client!pb", name = "o", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_105 = new Class376(86, 11);

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "([Ljava/awt/Rectangle;IB)V")
	public static void method6463(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (Static418.anInt7055 == 1) {
			Static535.aClass16_10.method8174(arg0, arg1, Static486.anInt8256, Static88.anInt1938);
		} else {
			Static535.aClass16_10.method8174(arg0, arg1, 0, 0);
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILjava/lang/String;I)Z")
	public static boolean method6464(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (Static499.aClass231_4.aBoolean482) {
			Static605.aClass161_7 = new Class161();
			Static605.aClass161_7.aString54 = arg0;
			Static605.aClass161_7.anInt4423 = arg1;
			if (Static216.aClass309_6 != Static229.aClass309_8) {
				Static605.aClass161_7.anInt4421 = Static605.aClass161_7.anInt4423 + 40000;
				Static605.aClass161_7.anInt4422 = Static605.aClass161_7.anInt4423 + 50000;
			}
			for (@Pc(43) int local43 = 0; local43 < Static491.aClass31_Sub1Array7.length; local43++) {
				if (Static491.aClass31_Sub1Array7[local43].anInt10062 == arg1) {
					Static203.anInt3734 = Static491.aClass31_Sub1Array7[local43].anInt10058;
				}
			}
			return true;
		}
		@Pc(69) String local69 = "";
		if (Static229.aClass309_8 != Static216.aClass309_6) {
			local69 = ":" + (arg1 + 7000);
		}
		@Pc(84) String local84 = "";
		if (Static605.aString120 != null) {
			local84 = "/p=" + Static605.aString120;
		}
		@Pc(132) String local132 = "http://" + arg0 + local69 + "/l=" + Static319.anInt5939 + "/a=" + Static88.anInt1933 + local84 + "/j" + (Static133.aBoolean207 ? "1" : "0") + ",o" + (Static206.aBoolean295 ? "1" : "0") + ",a2";
		try {
			Static487.aClient1.getAppletContext().showDocument(new URL(local132), "_self");
			return true;
		} catch (@Pc(142) Exception local142) {
			return false;
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)[Lclient!ot;")
	public static Class270[] method6465() {
		return new Class270[] { Static418.aClass270_15, Static360.aClass270_14, Static84.aClass270_23 };
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!fe;Z)V")
	public static void method6466(@OriginalArg(0) Class23_Sub2_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(2) int local2 = arg0.aShort123; local2 <= arg0.aShort125; local2++) {
			for (@Pc(6) int local6 = arg0.aShort124; local6 <= arg0.aShort122; local6++) {
				@Pc(16) Class247 local16 = Static332.aClass247ArrayArrayArray1[arg0.aByte142][local2][local6];
				if (local16 != null) {
					@Pc(21) Class85 local21 = local16.aClass85_3;
					@Pc(23) Class85 local23 = null;
					while (local21 != null) {
						if (local21.aClass23_Sub2_Sub1_1 == arg0) {
							if (local23 == null) {
								local16.aClass85_3 = local21.aClass85_1;
							} else {
								local23.aClass85_1 = local21.aClass85_1;
							}
							local21.method2102();
							break;
						}
						local23 = local21;
						local21 = local21.aClass85_1;
					}
				}
			}
		}
		if (!arg1) {
			Static161.method2738(arg0);
		}
	}
}
