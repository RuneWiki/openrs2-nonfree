import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!eha", name = "j", descriptor = "Lclient!dh;")
	public static Class71 aClass71_32;

	@OriginalMember(owner = "client!eha", name = "l", descriptor = "I")
	public static int anInt3374 = 0;

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(I[Lclient!tp;B)V")
	public static void method2800(@OriginalArg(0) int arg0, @OriginalArg(1) Class331[] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(17) Class331 local17 = arg1[local11];
			if (local17 != null) {
				if (local17.anInt9490 == 0) {
					if (local17.aClass331Array2 != null) {
						method2800(arg0, local17.aClass331Array2);
					}
					@Pc(38) Class8_Sub51 local38 = (Class8_Sub51) Static218.aClass253_14.method6594((long) local17.anInt9578);
					if (local38 != null) {
						Static279.method4733(local38.anInt10454, arg0);
					}
				}
				@Pc(54) Class8_Sub40 local54;
				if (arg0 == 0 && local17.anObjectArray7 != null) {
					local54 = new Class8_Sub40();
					local54.aClass331_14 = local17;
					local54.anObjectArray2 = local17.anObjectArray7;
					Static273.method4698(local54);
				}
				if (arg0 == 1 && local17.anObjectArray15 != null) {
					if (local17.anInt9535 >= 0) {
						@Pc(79) Class331 local79 = Static178.method3435(local17.anInt9578);
						if (local79 == null || local79.aClass331Array2 == null || local17.anInt9535 >= local79.aClass331Array2.length || local17 != local79.aClass331Array2[local17.anInt9535]) {
							continue;
						}
					}
					local54 = new Class8_Sub40();
					local54.aClass331_14 = local17;
					local54.anObjectArray2 = local17.anObjectArray15;
					Static273.method4698(local54);
				}
			}
		}
	}

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(ILclient!bq;Lclient!ha;II)V")
	public static void method2801(@OriginalArg(1) Class43 arg0, @OriginalArg(2) Class16 arg1) {
		Static52.aClass43_15.method1431();
		if (Static304.aBoolean433) {
			return;
		}
		for (@Pc(20) Class8_Sub35 local20 = (Class8_Sub35) arg0.method1422(); local20 != null; local20 = (Class8_Sub35) arg0.method1426()) {
			@Pc(28) Class17 local28 = Static110.aClass12_3.method136(local20.anInt6533);
			if (Static524.method7455(local28)) {
				@Pc(40) boolean local40 = Static574.method7976(local20, arg1, local28);
				if (local40) {
					Static283.method4798(local20, local28, arg1);
				}
			}
		}
	}
}
