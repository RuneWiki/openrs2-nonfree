import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!ro", name = "O", descriptor = "Lclient!ek;")
	public static Class42 aClass42_77;

	@OriginalMember(owner = "client!ro", name = "N", descriptor = "[I")
	public static int[] anIntArray482 = new int[128];

	@OriginalMember(owner = "client!ro", name = "R", descriptor = "J")
	public static long aLong182 = 0L;

	@OriginalMember(owner = "client!ro", name = "S", descriptor = "Ljava/lang/String;")
	public static String aString167 = null;

	@OriginalMember(owner = "client!ro", name = "V", descriptor = "Ljava/lang/String;")
	public static String aString168 = "Please wait - attempting to reestablish.";

	@OriginalMember(owner = "client!ro", name = "h", descriptor = "(I)V")
	public static void method3951() {
		Static291.aClass157_43.method4027();
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(B)V")
	public static void method3953() {
		@Pc(12) boolean local12 = false;
		while (!local12) {
			local12 = true;
			for (@Pc(18) int local18 = 0; local18 < Static68.anInt1741 - 1; local18++) {
				if (Static290.aShortArray85[local18] < 1000 && Static290.aShortArray85[local18 + 1] > 1000) {
					local12 = false;
					@Pc(48) String local48 = Static175.aStringArray28[local18];
					Static175.aStringArray28[local18] = Static175.aStringArray28[local18 + 1];
					Static175.aStringArray28[local18 + 1] = local48;
					@Pc(66) String local66 = Static56.aStringArray8[local18];
					Static56.aStringArray8[local18] = Static56.aStringArray8[local18 + 1];
					Static56.aStringArray8[local18 + 1] = local66;
					@Pc(84) int local84 = Static67.anIntArray144[local18];
					Static67.anIntArray144[local18] = Static67.anIntArray144[local18 + 1];
					Static67.anIntArray144[local18 + 1] = local84;
					@Pc(102) int local102 = Static56.anIntArray123[local18];
					Static56.anIntArray123[local18] = Static56.anIntArray123[local18 + 1];
					Static56.anIntArray123[local18 + 1] = local102;
					@Pc(120) int local120 = Static131.anIntArray297[local18];
					Static131.anIntArray297[local18] = Static131.anIntArray297[local18 + 1];
					Static131.anIntArray297[local18 + 1] = local120;
					@Pc(138) short local138 = Static290.aShortArray85[local18];
					Static290.aShortArray85[local18] = Static290.aShortArray85[local18 + 1];
					Static290.aShortArray85[local18 + 1] = local138;
					@Pc(156) long local156 = Static166.aLongArray4[local18];
					Static166.aLongArray4[local18] = Static166.aLongArray4[local18 + 1];
					Static166.aLongArray4[local18 + 1] = local156;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "(II)Lclient!cj;")
	public static Class2_Sub8_Sub3 method3954(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub8_Sub3 local10 = (Class2_Sub8_Sub3) Static165.aClass106_5.method2986((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static170.aClass42_48.method1256(arg0, 0);
		if (local21 == null || local21.length <= 1) {
			return null;
		} else {
			local10 = Static238.method4691(local21);
			Static165.aClass106_5.method2990((long) arg0, local10);
			return local10;
		}
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(III)I")
	public static int method3955(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 + arg0 * 57;
		@Pc(16) int local16 = local10 << 13 ^ local10;
		@Pc(30) int local30 = Integer.MAX_VALUE & local16 * (local16 * local16 * 15731 + 789221) + 1376312589;
		return local30 >> 19 & 0xFF;
	}
}
