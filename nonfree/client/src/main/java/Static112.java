import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!eda", name = "r", descriptor = "Lclient!rba;")
	public static Class292 aClass292_1;

	@OriginalMember(owner = "client!eda", name = "v", descriptor = "[I")
	public static int[] anIntArray169;

	@OriginalMember(owner = "client!eda", name = "s", descriptor = "I")
	public static int anInt1992 = 0;

	@OriginalMember(owner = "client!eda", name = "t", descriptor = "I")
	public static int anInt1993 = 0;

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(III)I")
	public static int method1662(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg0 > 0) {
			local7 = local7 << 1 | arg1 & 0x1;
			arg1 >>>= 0x1;
			arg0--;
		}
		return local7;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(IIBI)Lclient!oda;")
	public static Class2_Sub34 method1664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) Class2_Sub34 local5 = null;
		if (arg2 == 0) {
			local5 = Static555.method7264(Static386.aClass154_81, Static551.aClass64_2);
		}
		if (arg2 == 1) {
			local5 = Static555.method7264(Static421.aClass154_92, Static551.aClass64_2);
		}
		local5.aClass2_Sub7_Sub2_2.method4511(arg0 + Static310.anInt5129);
		local5.aClass2_Sub7_Sub2_2.method4492(arg1 + Static485.anInt7725);
		local5.aClass2_Sub7_Sub2_2.method4459(Static106.aClass150_3.method2632(82) ? 1 : 0);
		Static484.anInt7716 = arg1;
		Static143.anInt7433 = arg0;
		Static143.aBoolean620 = false;
		Static409.method5539();
		return local5;
	}
}
