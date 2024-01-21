import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!oc", name = "i", descriptor = "Z")
	public static boolean aBoolean126;

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1087 = Static177.method3050("Unable to connect)3");

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1088 = Static177.method3050("Username: ");

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "[I")
	public static final int[] anIntArray280 = new int[500];

	@OriginalMember(owner = "client!oc", name = "l", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1089 = aClass46_1088;

	@OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
	public static int anInt2971 = -1;

	@OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
	public static int anInt2973 = 0;

	@OriginalMember(owner = "client!oc", name = "u", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1090 = aClass46_1087;

	@OriginalMember(owner = "client!oc", name = "v", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1091 = Static177.method3050("<col=ffffff> )4 ");

	@OriginalMember(owner = "client!oc", name = "x", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1092 = aClass46_1087;

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)V")
	public static void method2210() {
		for (@Pc(7) int local7 = 0; local7 < Static182.anInt4082; local7++) {
			@Pc(13) int local13 = Static121.anIntArray276[local7];
			@Pc(17) Class4_Sub1_Sub1_Sub1_Sub2 local17 = Static97.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local13];
			@Pc(21) int local21 = Static162.aClass4_Sub11_Sub1_3.method1253();
			@Pc(37) int local37;
			if ((local21 & 0x10) != 0) {
				local17.anInt2825 = Static162.aClass4_Sub11_Sub1_3.method1275();
				local37 = Static162.aClass4_Sub11_Sub1_3.method1243();
				local17.anInt2798 = Static142.anInt3325 + (local37 & 0xFFFF);
				local17.anInt2827 = 0;
				local17.anInt2788 = 0;
				if (Static142.anInt3325 < local17.anInt2798) {
					local17.anInt2827 = -1;
				}
				local17.anInt2807 = local37 >> 16;
				if (local17.anInt2825 == 65535) {
					local17.anInt2825 = -1;
				}
			}
			if ((local21 & 0x40) != 0) {
				local17.aClass4_Sub1_Sub11_1 = Static105.method1980(Static162.aClass4_Sub11_Sub1_3.method1275());
				local17.anInt2833 = local17.aClass4_Sub1_Sub11_1.anInt2237;
				local17.anInt2796 = local17.aClass4_Sub1_Sub11_1.anInt2239;
				local17.anInt2800 = local17.aClass4_Sub1_Sub11_1.anInt2265;
				local17.anInt2816 = local17.aClass4_Sub1_Sub11_1.anInt2264;
				local17.anInt2810 = local17.aClass4_Sub1_Sub11_1.anInt2235;
				local17.anInt2792 = local17.aClass4_Sub1_Sub11_1.anInt2259;
				local17.anInt2794 = local17.aClass4_Sub1_Sub11_1.anInt2243;
				local17.anInt2789 = local17.aClass4_Sub1_Sub11_1.anInt2247;
				local17.anInt2805 = local17.aClass4_Sub1_Sub11_1.anInt2251;
			}
			if ((local21 & 0x4) != 0) {
				local17.aClass46_1037 = Static162.aClass4_Sub11_Sub1_3.method1247();
				local17.anInt2826 = 100;
			}
			if ((local21 & 0x2) != 0) {
				local17.anInt2799 = Static162.aClass4_Sub11_Sub1_3.method1235();
				if (local17.anInt2799 == 65535) {
					local17.anInt2799 = -1;
				}
			}
			@Pc(192) int local192;
			if ((local21 & 0x1) != 0) {
				local37 = Static162.aClass4_Sub11_Sub1_3.method1224();
				if (local37 == 65535) {
					local37 = -1;
				}
				local192 = Static162.aClass4_Sub11_Sub1_3.method1253();
				if (local17.anInt2808 == local37 && local37 != -1) {
					@Pc(208) Class4_Sub1_Sub4 local208 = Static137.method2394(local37);
					@Pc(211) int local211 = local208.anInt542;
					if (local211 == 1) {
						local17.anInt2812 = 0;
						local17.anInt2840 = local192;
						local17.anInt2844 = 0;
						local17.anInt2837 = 0;
						Static186.method3139(local208, local17.anInt2844, false, local17.anInt2803, local17.anInt2832);
					}
					if (local211 == 2) {
						local17.anInt2812 = 0;
					}
				} else if (local37 == -1 || local17.anInt2808 == -1 || Static137.method2394(local37).anInt544 >= Static137.method2394(local17.anInt2808).anInt544) {
					local17.anInt2837 = 0;
					local17.anInt2844 = 0;
					local17.anInt2812 = 0;
					local17.anInt2836 = local17.anInt2823;
					local17.anInt2808 = local37;
					local17.anInt2840 = local192;
					if (local17.anInt2808 != -1) {
						Static186.method3139(Static137.method2394(local17.anInt2808), local17.anInt2844, false, local17.anInt2803, local17.anInt2832);
					}
				}
			}
			if ((local21 & 0x80) != 0) {
				local37 = Static162.aClass4_Sub11_Sub1_3.method1253();
				local192 = Static162.aClass4_Sub11_Sub1_3.method1228();
				local17.method2113(local37, Static142.anInt3325, local192);
			}
			if ((local21 & 0x20) != 0) {
				local17.anInt2817 = Static162.aClass4_Sub11_Sub1_3.method1252();
				local17.anInt2791 = Static162.aClass4_Sub11_Sub1_3.method1235();
			}
			if ((local21 & 0x8) != 0) {
				local37 = Static162.aClass4_Sub11_Sub1_3.method1271();
				local192 = Static162.aClass4_Sub11_Sub1_3.method1253();
				local17.method2113(local37, Static142.anInt3325, local192);
				local17.anInt2831 = Static142.anInt3325 + 300;
				local17.anInt2845 = Static162.aClass4_Sub11_Sub1_3.method1271();
			}
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILjava/lang/Object;Lclient!rh;)V")
	public static void method2212(@OriginalArg(1) Object arg0, @OriginalArg(2) Class76 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < 50 && arg1.anEventQueue1.peekEvent() != null; local19++) {
			Static52.method1025(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}
}
