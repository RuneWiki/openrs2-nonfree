import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!ah", name = "p", descriptor = "I")
	public static int anInt268;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)V")
	public static void method277() {
		Static251.method4490((long) Static113.anInt2243, Static162.aClass100_7);
		if (Static554.anInt1822 != -1) {
			Static571.method8292(Static554.anInt1822);
		}
		for (@Pc(27) int local27 = 0; local27 < Static595.anInt9912; local27++) {
			if (Static501.aBooleanArray46[local27]) {
				Static623.aBooleanArray57[local27] = true;
			}
			Static567.aBooleanArray53[local27] = Static501.aBooleanArray46[local27];
			Static501.aBooleanArray46[local27] = false;
		}
		Static498.anInt8628 = Static113.anInt2243;
		if (Static554.anInt1822 != -1) {
			Static595.anInt9912 = 0;
			Static19.method335();
		}
		Static162.aClass100_7.la();
		Static498.method7428(Static162.aClass100_7);
		@Pc(68) int local68 = Static77.method1323();
		if (local68 == -1) {
			local68 = Static351.anInt6586;
		}
		if (local68 == -1) {
			local68 = Static648.anInt10745;
		}
		Static384.method6193(local68);
		Static333.anInt9456 = 0;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZLclient!we;Lclient!we;)V")
	public static void method280(@OriginalArg(1) Class6_Sub2 arg0, @OriginalArg(2) Class6_Sub2 arg1) {
		if (arg0.aClass6_Sub2_67 != null) {
			arg0.method8754();
		}
		arg0.aClass6_Sub2_67 = arg1;
		arg0.aClass6_Sub2_66 = arg1.aClass6_Sub2_66;
		arg0.aClass6_Sub2_67.aClass6_Sub2_66 = arg0;
		arg0.aClass6_Sub2_66.aClass6_Sub2_67 = arg0;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIILclient!cq;I)V")
	public static void method281(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6_Sub9 arg2, @OriginalArg(4) int arg3) {
		arg2.aClass6_Sub40_Sub2_1.method8554(arg3);
		arg2.aClass6_Sub40_Sub2_1.method8561(arg1);
		arg2.aClass6_Sub40_Sub2_1.method8561(arg0);
	}
}
