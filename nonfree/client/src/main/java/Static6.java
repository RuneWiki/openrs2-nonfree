import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!aca", name = "r", descriptor = "I")
	public static final int anInt5785 = Static496.method7088(1600);

	@OriginalMember(owner = "client!aca", name = "v", descriptor = "I")
	public static int anInt5790 = 0;

	@OriginalMember(owner = "client!aca", name = "b", descriptor = "(I)V")
	public static void method5189() {
		@Pc(5) Class85 local5 = Static146.aClass85_18;
		synchronized (Static146.aClass85_18) {
			Static146.aClass85_18.method1741();
		}
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(ZI)V")
	public static void method5190(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static542.anInt8552 != -1) {
				Static84.method1246(Static542.anInt8552);
			}
			for (@Pc(19) Class2_Sub26 local19 = (Class2_Sub26) Static463.aClass218_36.method5092(); local19 != null; local19 = (Class2_Sub26) Static463.aClass218_36.method5096()) {
				if (!local19.method9871()) {
					local19 = (Class2_Sub26) Static463.aClass218_36.method5092();
					if (local19 == null) {
						break;
					}
				}
				Static331.method4599(local19, false, true);
			}
			Static542.anInt8552 = -1;
			Static463.aClass218_36 = new Class218(8);
			Static553.method7726();
			Static542.anInt8552 = Static519.aClass132_1.anInt3154;
			Static445.method6516(false);
			Static668.method9110(-57);
			Static484.method6921(Static542.anInt8552);
		}
		Static237.aBoolean968 = true;
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(ILclient!et;)Lclient!wf;")
	public static Class120_Sub4 method5191(@OriginalArg(1) Class2_Sub20 arg0) {
		return new Class120_Sub4(arg0.method8598(), arg0.method8598(), arg0.method8598(), arg0.method8598(), arg0.method8598(), arg0.method8598(), arg0.method8598(), arg0.method8598(), arg0.method8583(), arg0.method8581(-17416));
	}
}
