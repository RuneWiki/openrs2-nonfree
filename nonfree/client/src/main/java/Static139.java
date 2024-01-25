import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!ee", name = "hb", descriptor = "I")
	public static int anInt2623;

	@OriginalMember(owner = "client!ee", name = "cb", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_26 = new Class286(14, 6);

	@OriginalMember(owner = "client!ee", name = "M", descriptor = "I")
	public static int anInt2622 = -1;

	@OriginalMember(owner = "client!ee", name = "eb", descriptor = "I")
	public static int anInt2624 = 0;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method2321(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(18) String local18 = Static282.method4264(arg0);
		if (local18 == null) {
			return;
		}
		for (@Pc(24) int local24 = 0; local24 < Static299.anInt6884; local24++) {
			@Pc(30) String local30 = Static383.aStringArray25[local24];
			@Pc(34) String local34 = Static282.method4264(local30);
			if (Static593.method8157(local18, arg0, local34, local30)) {
				Static299.anInt6884--;
				for (@Pc(47) int local47 = local24; local47 < Static299.anInt6884; local47++) {
					Static383.aStringArray25[local47] = Static383.aStringArray25[local47 + 1];
					Static59.aStringArray3[local47] = Static59.aStringArray3[local47 + 1];
					Static301.aStringArray17[local47] = Static301.aStringArray17[local47 + 1];
					Static715.aStringArray30[local47] = Static715.aStringArray30[local47 + 1];
					Static572.aBooleanArray25[local47] = Static572.aBooleanArray25[local47 + 1];
				}
				Static455.anInt8019 = Static210.anInt3647;
				@Pc(108) Class400 local108 = Static81.method1057();
				@Pc(114) Class3_Sub48 local114 = Static89.method1200(Static71.aClass286_17, local108.aClass399_2);
				local114.aClass3_Sub28_Sub2_1.method5329(Static605.method8305(arg0));
				local114.aClass3_Sub28_Sub2_1.method5283(arg0);
				local108.method9223(local114);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIZ)I")
	public static int method2322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) Class3_Sub51 local10 = Static321.method5223(arg2, arg1);
		if (local10 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(30) int local30 = 0;
			for (@Pc(32) int local32 = 0; local32 < local10.anIntArray576.length; local32++) {
				if (arg0 == local10.anIntArray577[local32]) {
					local30 += local10.anIntArray576[local32];
				}
			}
			return local30;
		}
	}
}
