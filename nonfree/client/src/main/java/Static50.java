import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!da", name = "d", descriptor = "Lclient!bb;")
	public static Class16 aClass16_4 = new Class16();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
	public static void method1305() {
		for (@Pc(7) int local7 = -1; local7 < Static357.anInt4331; local7++) {
			@Pc(16) int local16;
			if (local7 == -1) {
				local16 = 2047;
			} else {
				local16 = Static298.anIntArray492[local7];
			}
			@Pc(24) Class17_Sub1_Sub1_Sub1 local24 = Static102.aClass17_Sub1_Sub1_Sub1Array1[local16];
			if (local24 != null) {
				Static53.method1367(local24.method4318(), local24);
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZILclient!aq;)V")
	public static void method1306(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class12 arg1) {
		@Pc(15) int local15 = arg1.anInt398 == 0 ? arg1.lb : arg1.anInt398;
		@Pc(27) int local27 = arg1.anInt436 == 0 ? arg1.anInt446 : arg1.anInt436;
		Static249.method4472(Static348.aClass12ArrayArray1[arg1.anInt465 >> 16], local27, local15, arg1.anInt465, arg0);
		if (arg1.aClass12Array3 != null) {
			Static249.method4472(arg1.aClass12Array3, local27, local15, arg1.anInt465, arg0);
		}
		@Pc(60) Class1_Sub37 local60 = (Class1_Sub37) Static351.aClass197_33.method5157((long) arg1.anInt465);
		if (local60 != null) {
			Static118.method2494(local15, local60.anInt6281, local27, arg0);
		}
	}
}
