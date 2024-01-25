import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
	public static int anInt596;

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "[Lclient!b;")
	public static Interface1[] anInterface1Array1;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
	public static void method594() {
		for (@Pc(10) Class2_Sub1_Sub14 local10 = (Class2_Sub1_Sub14) Static36.aClass271_4.method7177(); local10 != null; local10 = (Class2_Sub1_Sub14) Static36.aClass271_4.method7175()) {
			@Pc(17) Class15_Sub3_Sub3_Sub5 local17 = local10.aClass15_Sub3_Sub3_Sub5_1;
			if (local17.aBoolean433) {
				local10.method9825();
				local17.method5333();
			} else if (local17.anInt5879 <= Static62.anInt1184) {
				local17.method5336(Static87.anInt1634);
				if (local17.aBoolean433) {
					local10.method9825();
				} else {
					Static69.method1291(local17, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)I")
	public static int method595() {
		return Static287.anInt5258;
	}
}
