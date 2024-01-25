import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!gba", name = "Hb", descriptor = "I")
	public static int anInt3479 = 0;

	@OriginalMember(owner = "client!gba", name = "Xb", descriptor = "Lclient!os;")
	public static final Class258 aClass258_11 = new Class258(8, 1);

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(ZI)Z")
	public static boolean method3131(@OriginalArg(1) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method3138(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		@Pc(4) String local4 = arg0.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg1 ? 32768 : 0;
		@Pc(30) int local30 = local19 + (arg1 ? Static320.aClass363_1.anInt9833 : Static320.aClass363_1.anInt9836);
		for (@Pc(32) int local32 = local19; local32 < local30; local32++) {
			@Pc(39) Class4_Sub7_Sub16 local39 = Static320.aClass363_1.method8038(local32);
			if (local39.aBoolean606 && local39.method7163().toLowerCase().indexOf(local4) != -1) {
				if (local13 >= 50) {
					Static556.aShortArray132 = null;
					Static3.anInt32 = -1;
					return;
				}
				if (local11.length <= local13) {
					@Pc(73) short[] local73 = new short[local11.length * 2];
					for (@Pc(75) int local75 = 0; local75 < local13; local75++) {
						local73[local75] = local11[local75];
					}
					local11 = local73;
				}
				local11[local13++] = (short) local32;
			}
		}
		Static3.anInt32 = local13;
		Static178.anInt3781 = 0;
		Static556.aShortArray132 = local11;
		@Pc(108) String[] local108 = new String[Static3.anInt32];
		for (@Pc(115) int local115 = 0; local115 < Static3.anInt32; local115++) {
			local108[local115] = Static320.aClass363_1.method8038(local11[local115]).method7163();
		}
		Static367.method6855(local108, Static556.aShortArray132);
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(Lclient!hfa;I)V")
	public static void method3140(@OriginalArg(0) Class10_Sub1_Sub2_Sub1 arg0) {
		for (@Pc(10) Class4_Sub51 local10 = (Class4_Sub51) Static162.aClass124_19.method3267(); local10 != null; local10 = (Class4_Sub51) Static162.aClass124_19.method3273()) {
			if (local10.aClass10_Sub1_Sub2_Sub1_2 == arg0) {
				if (local10.aClass4_Sub13_Sub2_3 != null) {
					Static430.aClass4_Sub13_Sub1_1.method2274(local10.aClass4_Sub13_Sub2_3);
					local10.aClass4_Sub13_Sub2_3 = null;
				}
				local10.method8013();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "(ILclient!eh;)Ljava/lang/String;")
	public static String method3147(@OriginalArg(1) Class4_Sub9 arg0) {
		return Static550.method7599(arg0);
	}
}
