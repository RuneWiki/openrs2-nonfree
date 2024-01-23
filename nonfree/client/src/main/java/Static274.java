import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!tj", name = "M", descriptor = "Lclient!ph;")
	public static Class138 aClass138_76;

	@OriginalMember(owner = "client!tj", name = "N", descriptor = "[I")
	public static int[] anIntArray472;

	@OriginalMember(owner = "client!tj", name = "U", descriptor = "Lclient!ph;")
	public static Class138 aClass138_77;

	@OriginalMember(owner = "client!tj", name = "Z", descriptor = "I")
	public static int anInt5246;

	@OriginalMember(owner = "client!tj", name = "ab", descriptor = "[I")
	public static int[] anIntArray473;

	@OriginalMember(owner = "client!tj", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString171 = "green:";

	@OriginalMember(owner = "client!tj", name = "O", descriptor = "Ljava/lang/String;")
	public static String aString172 = "green:";

	@OriginalMember(owner = "client!tj", name = "R", descriptor = "Lclient!bo;")
	public static Class24 aClass24_27 = new Class24();

	@OriginalMember(owner = "client!tj", name = "T", descriptor = "I")
	public static int anInt5242 = 0;

	@OriginalMember(owner = "client!tj", name = "g", descriptor = "(I)V")
	public static void method4065() {
		if (Static212.anInt4177 <= 0) {
			Static147.aClass7_4 = Static81.aClass7_2;
			Static81.aClass7_2 = null;
			Static176.method4598(40);
		} else {
			Static122.method1957();
		}
	}

	@OriginalMember(owner = "client!tj", name = "h", descriptor = "(I)V")
	public static void method4066() {
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < 104; local13++) {
			for (@Pc(18) int local18 = 0; local18 < 104; local18++) {
				if (Static247.method3812(local18, local13, local11, Static122.aClass1_Sub17ArrayArrayArray3, true)) {
					local11++;
				}
				if (local11 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lclient!no;I)I")
	public static int method4068(@OriginalArg(0) Class22_Sub3_Sub1 arg0) {
		@Pc(13) Class112 local13 = arg0.aClass112_1;
		if (local13.anIntArray283 != null) {
			local13 = local13.method2817();
			if (local13 == null) {
				return -1;
			}
		}
		@Pc(29) int local29 = local13.anInt3521;
		@Pc(33) Class78 local33 = arg0.method3659();
		if (arg0.anInt4566 == local33.anInt2171) {
			local29 = local13.anInt3506;
		} else if (arg0.anInt4566 == local33.anInt2143 || local33.anInt2162 == arg0.anInt4566 || arg0.anInt4566 == local33.anInt2150 || arg0.anInt4566 == local33.anInt2132) {
			local29 = local13.anInt3525;
		} else if (arg0.anInt4566 == local33.anInt2151 || local33.anInt2148 == arg0.anInt4566 || local33.anInt2166 == arg0.anInt4566 || local33.anInt2161 == arg0.anInt4566) {
			local29 = local13.anInt3522;
		}
		return local29;
	}
}
