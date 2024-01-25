import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static583 {

	@OriginalMember(owner = "client!ts", name = "m", descriptor = "I")
	public static int anInt9586;

	@OriginalMember(owner = "client!ts", name = "l", descriptor = "Lclient!vq;")
	public static final Class378 aClass378_3 = new Class378();

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZLclient!gga;)Lclient!dda;")
	public static Class63 method8067(@OriginalArg(1) Class6_Sub23 arg0) {
		@Pc(10) Class7 local10 = Static262.method5239()[arg0.method8374()];
		@Pc(17) Class249 local17 = Static119.method1848()[arg0.method8374()];
		@Pc(21) int local21 = arg0.method8395();
		@Pc(25) int local25 = arg0.method8395();
		@Pc(29) int local29 = arg0.method8363();
		@Pc(33) int local33 = arg0.method8363();
		@Pc(43) int local43 = arg0.method8395();
		@Pc(47) int local47 = arg0.method8369();
		@Pc(51) int local51 = arg0.method8369();
		return new Class63(local10, local17, local21, local25, local29, local33, local43, local47, local51);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ILclient!gga;)V")
	public static void method8068(@OriginalArg(1) Class6_Sub23 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static127.anInt1400; local7++) {
			@Pc(19) int local19 = arg0.method8404();
			@Pc(25) int local25 = arg0.method8363();
			if (local25 == 65535) {
				local25 = -1;
			}
			if (Static473.aClass235_Sub1Array1[local19] != null) {
				Static473.aClass235_Sub1Array1[local19].anInt6473 = local25;
			}
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Z)V")
	public static void method8069() {
		for (@Pc(10) Class6_Sub35 local10 = (Class6_Sub35) Static130.aClass362_12.method8538(); local10 != null; local10 = (Class6_Sub35) Static130.aClass362_12.method8530()) {
			if (local10.aBoolean377) {
				local10.method4895();
			}
		}
		for (@Pc(30) Class6_Sub35 local30 = (Class6_Sub35) Static247.aClass362_20.method8538(); local30 != null; local30 = (Class6_Sub35) Static247.aClass362_20.method8530()) {
			if (local30.aBoolean377) {
				local30.method4895();
			}
		}
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(ILjava/lang/String;)V")
	public static void method8076(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static573.method4494(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < Static477.anInt8198; local30++) {
			@Pc(36) String local36 = Static572.aStringArray58[local30];
			if (local36.startsWith("*")) {
				local36 = local36.substring(1);
			}
			local36 = Static573.method4494(local36);
			if (local36 != null && local36.equals(local20)) {
				Static477.anInt8198--;
				for (@Pc(62) int local62 = local30; local62 < Static477.anInt8198; local62++) {
					Static572.aStringArray58[local62] = Static572.aStringArray58[local62 + 1];
					Static658.aStringArray65[local62] = Static658.aStringArray65[local62 + 1];
					Static602.aStringArray63[local62] = Static602.aStringArray63[local62 + 1];
					Static123.aStringArray18[local62] = Static123.aStringArray18[local62 + 1];
					Static287.aBooleanArray17[local62] = Static287.aBooleanArray17[local62 + 1];
				}
				Static206.anInt3566 = Static94.anInt1719;
				@Pc(119) Class6_Sub26 local119 = Static268.method3981(Static377.aClass15_2, Static328.aClass289_127);
				local119.aClass6_Sub23_Sub1_2.method8366(Static622.method8568(arg0));
				local119.aClass6_Sub23_Sub1_2.method8398(arg0);
				Static670.method9077(local119);
				return;
			}
		}
	}
}
