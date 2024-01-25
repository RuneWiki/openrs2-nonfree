import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static423 {

	@OriginalMember(owner = "client!og", name = "m", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_139 = new Class44(126, 2);

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
	public static void method6257() {
		Static469.method9293();
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!av;B)V")
	public static void method6258(@OriginalArg(0) Class12_Sub2_Sub2_Sub1_Sub1 arg0) {
		for (@Pc(15) Class14_Sub31 local15 = (Class14_Sub31) Static41.aClass262_5.method6318(); local15 != null; local15 = (Class14_Sub31) Static41.aClass262_5.method6311()) {
			if (local15.aClass12_Sub2_Sub2_Sub1_Sub1_1 == arg0) {
				if (local15.aClass14_Sub5_Sub4_2 != null) {
					Static217.aClass14_Sub5_Sub3_1.method6029(local15.aClass14_Sub5_Sub4_2);
					local15.aClass14_Sub5_Sub4_2 = null;
				}
				local15.method9315();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ZLclient!ha;)V")
	public static void method6259(@OriginalArg(1) Class137 arg0) {
		for (@Pc(10) Class12_Sub4 local10 = (Class12_Sub4) Static319.aClass376_5.method9008(); local10 != null; local10 = (Class12_Sub4) Static319.aClass376_5.method9014()) {
			if (local10.aBoolean157) {
				local10.method1617(arg0);
			}
		}
	}
}
