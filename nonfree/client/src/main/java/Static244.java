import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!jga", name = "x", descriptor = "[Lclient!xa;")
	public static Class13[] aClass13Array16;

	@OriginalMember(owner = "client!jga", name = "y", descriptor = "F")
	public static float aFloat94;

	@OriginalMember(owner = "client!jga", name = "D", descriptor = "Lclient!lca;")
	public static Class205 aClass205_1;

	@OriginalMember(owner = "client!jga", name = "w", descriptor = "Z")
	public static boolean aBoolean365 = false;

	@OriginalMember(owner = "client!jga", name = "A", descriptor = "I")
	public static int anInt4833 = 0;

	@OriginalMember(owner = "client!jga", name = "C", descriptor = "I")
	public static int anInt4835 = 0;

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(ILclient!eh;)Lclient!tq;")
	public static Class52_Sub3 method4129(@OriginalArg(1) Class4_Sub9 arg0) {
		@Pc(7) Class52 local7 = Static72.method1294(arg0);
		@Pc(11) int local11 = arg0.method6026();
		@Pc(19) int local19 = arg0.method6026();
		return new Class52_Sub3(local7.aClass297_12, local7.aClass58_13, local7.anInt8820, local7.anInt8826, local7.anInt8822, local7.anInt8828, local7.anInt8824, local7.anInt8827, local7.anInt8821, local11, local19);
	}

	@OriginalMember(owner = "client!jga", name = "e", descriptor = "(I)Z")
	public static boolean method4131() {
		try {
			return Static420.method6045();
		} catch (@Pc(14) IOException local14) {
			Static25.method449();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(82) String local82 = "T2 - " + (Static491.aClass64_424 == null ? -1 : Static491.aClass64_424.method1581()) + "," + (Static29.aClass64_37 == null ? -1 : Static29.aClass64_37.method1581()) + "," + (Static342.aClass64_294 == null ? -1 : Static342.aClass64_294.method1581()) + " - " + Static474.anInt4412 + "," + (Static373.anInt6695 + Static129.aClass10_Sub1_Sub2_Sub2_1.anIntArray653[0]) + "," + (Static6.anInt97 + Static129.aClass10_Sub1_Sub2_Sub2_1.anIntArray654[0]) + " - ";
			for (@Pc(84) int local84 = 0; Static474.anInt4412 > local84 && local84 < 50; local84++) {
				local82 = local82 + Static487.aClass4_Sub9_Sub1_2.aByteArray97[local84] + ",";
			}
			Static473.method6593(local19, local82);
			Static362.method5445(false);
			return true;
		}
	}
}
