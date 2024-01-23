import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!se", name = "b", descriptor = "Lclient!lc;")
	public static Class98 aClass98_149;

	@OriginalMember(owner = "client!se", name = "d", descriptor = "Lclient!lc;")
	public static Class98 aClass98_150;

	@OriginalMember(owner = "client!se", name = "f", descriptor = "S")
	public static short aShort31 = 1;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
	public static void method3906() {
		@Pc(3) boolean local3 = false;
		while (!local3) {
			local3 = true;
			for (@Pc(13) int local13 = 0; local13 < Static60.anInt1152 - 1; local13++) {
				if (Static299.aShortArray93[local13] < 1000 && Static299.aShortArray93[local13 + 1] > 1000) {
					@Pc(38) String local38 = Static35.aStringArray7[local13];
					Static35.aStringArray7[local13] = Static35.aStringArray7[local13 + 1];
					Static35.aStringArray7[local13 + 1] = local38;
					local3 = false;
					@Pc(58) String local58 = Static261.aStringArray34[local13];
					Static261.aStringArray34[local13] = Static261.aStringArray34[local13 + 1];
					Static261.aStringArray34[local13 + 1] = local58;
					@Pc(76) int local76 = Static66.anIntArray136[local13];
					Static66.anIntArray136[local13] = Static66.anIntArray136[local13 + 1];
					Static66.anIntArray136[local13 + 1] = local76;
					@Pc(94) int local94 = Static136.anIntArray251[local13];
					Static136.anIntArray251[local13] = Static136.anIntArray251[local13 + 1];
					Static136.anIntArray251[local13 + 1] = local94;
					@Pc(112) int local112 = Static196.anIntArray322[local13];
					Static196.anIntArray322[local13] = Static196.anIntArray322[local13 + 1];
					Static196.anIntArray322[local13 + 1] = local112;
					@Pc(130) short local130 = Static299.aShortArray93[local13];
					Static299.aShortArray93[local13] = Static299.aShortArray93[local13 + 1];
					Static299.aShortArray93[local13 + 1] = local130;
					@Pc(148) long local148 = Static100.aLongArray4[local13];
					Static100.aLongArray4[local13] = Static100.aLongArray4[local13 + 1];
					Static100.aLongArray4[local13 + 1] = local148;
				}
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "d", descriptor = "(II)V")
	public static void method3908(@OriginalArg(0) int arg0) {
		Static235.anInt4584 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V")
	public static void method3909() {
		aClass98_150 = null;
		aClass98_149 = null;
	}
}
