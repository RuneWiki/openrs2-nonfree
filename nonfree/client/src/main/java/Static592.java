import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static592 {

	@OriginalMember(owner = "client!wo", name = "C", descriptor = "F")
	public static float aFloat204;

	@OriginalMember(owner = "client!wo", name = "G", descriptor = "Lclient!bi;")
	public static Class31 aClass31_124;

	@OriginalMember(owner = "client!wo", name = "H", descriptor = "I")
	public static int anInt9728;

	@OriginalMember(owner = "client!wo", name = "I", descriptor = "Ljava/lang/Thread;")
	public static Thread aThread7;

	@OriginalMember(owner = "client!wo", name = "y", descriptor = "Lclient!eb;")
	public static final Class81 aClass81_9 = new Class81();

	@OriginalMember(owner = "client!wo", name = "B", descriptor = "I")
	public static int anInt9725 = 0;

	@OriginalMember(owner = "client!wo", name = "E", descriptor = "Z")
	public static volatile boolean aBoolean682 = true;

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZI)V")
	public static void method7964(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static249.anInt4945 != -1) {
				Static540.method7504(Static249.anInt4945);
			}
			for (@Pc(24) Class4_Sub49 local24 = (Class4_Sub49) Static543.aClass183_39.method4286(); local24 != null; local24 = (Class4_Sub49) Static543.aClass183_39.method4283()) {
				if (!local24.method8014()) {
					local24 = (Class4_Sub49) Static543.aClass183_39.method4286();
					if (local24 == null) {
						break;
					}
				}
				Static597.method8029(local24, false, true);
			}
			Static249.anInt4945 = -1;
			Static543.aClass183_39 = new Class183(8);
			Static426.method6089();
			Static249.anInt4945 = Static185.anInt8672;
			Static435.method6179(false);
			Static39.method670();
			Static205.method3638(Static249.anInt4945);
		}
		Static570.aBoolean672 = true;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!bj;)V")
	public static void method7966(@OriginalArg(0) Class32 arg0) {
		if (Static413.anInt7145 >= 65535) {
			return;
		}
		@Pc(6) Class4_Sub32 local6 = arg0.aClass4_Sub32_2;
		Static22.aClass32Array1[Static413.anInt7145] = arg0;
		Static396.aBooleanArray28[Static413.anInt7145] = false;
		Static413.anInt7145++;
		@Pc(21) int local21 = arg0.anInt781;
		if (arg0.aBoolean67) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt781;
		if (arg0.aBoolean68) {
			local29 = Static562.anInt9418 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method6617() + Static436.anInt7494 - local6.method6621() >> Static41.anInt810;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method6617() + local6.method6621() - Static436.anInt7494 >> Static41.anInt810;
			if (local73 >= Static357.anInt6212) {
				local73 = Static357.anInt6212 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray20[local41++];
				@Pc(105) int local105 = (local6.method6614() + Static436.anInt7494 - local6.method6621() >> Static41.anInt810) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static173.anInt3719) {
					local113 = Static173.anInt3719 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static348.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static348.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static413.anInt7145;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static348.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static413.anInt7145 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static348.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static413.anInt7145 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static348.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static413.anInt7145 << 48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method7971(@OriginalArg(1) String arg0) {
		if (!arg0.equals("")) {
			@Pc(22) Class4_Sub41 local22 = Static128.method2707(Static279.aClass61_60, Class16_Sub3.lb);
			local22.aClass4_Sub9_Sub1_3.method5961(-345277664, Static509.method7221(arg0));
			local22.aClass4_Sub9_Sub1_3.method6000(arg0);
			Static551.method7603(local22);
		}
	}
}
