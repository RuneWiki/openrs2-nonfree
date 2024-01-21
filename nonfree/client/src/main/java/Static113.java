import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
	public static int anInt2744;

	@OriginalMember(owner = "client!nh", name = "q", descriptor = "Lclient!hb;")
	public static Class3_Sub1_Sub3_Sub1_Sub1 aClass3_Sub1_Sub3_Sub1_Sub1_2;

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
	public static int anInt2742 = 0;

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1533 = Static122.method531("Schlie-8en");

	@OriginalMember(owner = "client!nh", name = "i", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1534 = Static122.method531("VOLL");

	@OriginalMember(owner = "client!nh", name = "j", descriptor = "Z")
	public static boolean aBoolean181 = false;

	@OriginalMember(owner = "client!nh", name = "l", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1536 = Static122.method531("wave:");

	@OriginalMember(owner = "client!nh", name = "k", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1535 = aClass73_1536;

	@OriginalMember(owner = "client!nh", name = "n", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1537 = Static122.method531("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!nh", name = "s", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1540 = Static122.method531("Login limit exceeded)3");

	@OriginalMember(owner = "client!nh", name = "p", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1538 = aClass73_1540;

	@OriginalMember(owner = "client!nh", name = "r", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1539 = aClass73_1536;

	@OriginalMember(owner = "client!nh", name = "t", descriptor = "I")
	public static int anInt2747 = -1;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)Lclient!rf;")
	public static Class3_Sub1_Sub16 method2035() {
		if (Static103.aClass3_Sub1_Sub16_1 == null) {
			Static103.aClass3_Sub1_Sub16_1 = new Class3_Sub1_Sub16();
		}
		return Static103.aClass3_Sub1_Sub16_1;
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V")
	public static void method2036() {
		aClass73_1536 = null;
		aClass3_Sub1_Sub3_Sub1_Sub1_2 = null;
		aClass73_1539 = null;
		aClass73_1537 = null;
		aClass73_1533 = null;
		aClass73_1538 = null;
		aClass73_1540 = null;
		aClass73_1534 = null;
		aClass73_1535 = null;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(I[B)V")
	public static void method2037(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class3_Sub12 local10 = new Class3_Sub12(arg0);
		local10.anInt1793 = arg0.length - 2;
		Static96.anInt2130 = local10.method1359();
		Static124.aByteArrayArray8 = new byte[Static96.anInt2130][];
		Static143.anIntArray350 = new int[Static96.anInt2130];
		Static37.anIntArray89 = new int[Static96.anInt2130];
		Static72.anIntArray177 = new int[Static96.anInt2130];
		Static42.anIntArray46 = new int[Static96.anInt2130];
		local10.anInt1793 = arg0.length - Static96.anInt2130 * 8 - 7;
		Static57.anInt1344 = local10.method1359();
		Static86.anInt1939 = local10.method1359();
		@Pc(63) int local63 = (local10.method1354() & 0xFF) + 1;
		for (@Pc(65) int local65 = 0; local65 < Static96.anInt2130; local65++) {
			Static42.anIntArray46[local65] = local10.method1359();
		}
		for (@Pc(79) int local79 = 0; local79 < Static96.anInt2130; local79++) {
			Static72.anIntArray177[local79] = local10.method1359();
		}
		for (@Pc(97) int local97 = 0; local97 < Static96.anInt2130; local97++) {
			Static37.anIntArray89[local97] = local10.method1359();
		}
		for (@Pc(111) int local111 = 0; local111 < Static96.anInt2130; local111++) {
			Static143.anIntArray350[local111] = local10.method1359();
		}
		local10.anInt1793 = arg0.length + 3 - Static96.anInt2130 * 8 - local63 * 3 - 7;
		Static9.anIntArray12 = new int[local63];
		for (@Pc(153) int local153 = 1; local153 < local63; local153++) {
			Static9.anIntArray12[local153] = local10.method1376();
			if (Static9.anIntArray12[local153] == 0) {
				Static9.anIntArray12[local153] = 1;
			}
		}
		local10.anInt1793 = 0;
		for (@Pc(182) int local182 = 0; local182 < Static96.anInt2130; local182++) {
			@Pc(188) int local188 = Static37.anIntArray89[local182];
			@Pc(192) int local192 = Static143.anIntArray350[local182];
			@Pc(196) int local196 = local192 * local188;
			@Pc(199) byte[] local199 = new byte[local196];
			Static124.aByteArrayArray8[local182] = local199;
			@Pc(207) int local207 = local10.method1354();
			@Pc(216) int local216;
			if (local207 == 0) {
				for (local216 = 0; local216 < local196; local216++) {
					local199[local216] = local10.method1342();
				}
			} else if (local207 == 1) {
				for (local216 = 0; local216 < local188; local216++) {
					for (@Pc(220) int local220 = 0; local220 < local192; local220++) {
						local199[local220 * local188 + local216] = local10.method1342();
					}
				}
			}
		}
	}
}
