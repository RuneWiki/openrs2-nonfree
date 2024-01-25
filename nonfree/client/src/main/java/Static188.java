import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!gea", name = "Pb", descriptor = "I")
	public static int anInt3129;

	@OriginalMember(owner = "client!gea", name = "ac", descriptor = "I")
	public static int anInt3131;

	@OriginalMember(owner = "client!gea", name = "U", descriptor = "Lclient!mba;")
	public static Class230 aClass230_3;

	@OriginalMember(owner = "client!gea", name = "Ic", descriptor = "I")
	public static int anInt3149;

	@OriginalMember(owner = "client!gea", name = "lc", descriptor = "Lclient!mja;")
	public static Class238 aClass238_1;

	@OriginalMember(owner = "client!gea", name = "tc", descriptor = "I")
	public static int anInt3178;

	@OriginalMember(owner = "client!gea", name = "ub", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_93 = new Class160(3, -1);

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "(Z)V")
	public static void method2811() {
		if (!Static541.aBoolean639) {
			return;
		}
		while (true) {
			while (Static545.aClass169_Sub1Array2.length > Static501.anInt8735) {
				@Pc(27) Class169_Sub1 local27 = Static545.aClass169_Sub1Array2[Static501.anInt8735];
				if (local27 != null && local27.anInt4673 == -1) {
					if (Static418.aClass14_Sub47_2 == null) {
						Static418.aClass14_Sub47_2 = Static193.aClass101_5.method2156(local27.aString57);
					}
					@Pc(56) int local56 = Static418.aClass14_Sub47_2.anInt10186;
					if (local56 == -1) {
						return;
					}
					Static418.aClass14_Sub47_2 = null;
					local27.anInt4673 = local56;
					Static501.anInt8735++;
				} else {
					Static501.anInt8735++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Z)Ljava/lang/String;")
	public static String method2821() {
		return Static455.aBoolean533 || Static379.aClass14_Sub2_Sub20_3 == null ? "" : Static379.aClass14_Sub2_Sub20_3.aString114;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(III)Z")
	public static boolean method2826(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0xC580) != 0;
	}
}
