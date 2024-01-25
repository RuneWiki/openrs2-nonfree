import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!ff", name = "O", descriptor = "I")
	public static int anInt2033;

	@OriginalMember(owner = "client!ff", name = "L", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_85 = new Class103(60, 8);

	@OriginalMember(owner = "client!ff", name = "N", descriptor = "Lclient!qh;")
	public static final Class199 aClass199_62 = new Class199(16);

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(II)V")
	public static void method1699(@OriginalArg(1) int arg0) {
		if (!Static69.method1137(arg0)) {
			return;
		}
		@Pc(14) Class124[] local14 = Static87.aClass124ArrayArray7[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(28) Class124 local28 = local14[local16];
			if (local28 != null) {
				local28.anInt3365 = 0;
				local28.anInt3358 = 0;
				local28.anInt3359 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(IB)V")
	public static void method1700(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub5_Sub11 local10 = Static188.method2688(arg0, 3);
		local10.method2667();
	}
}
