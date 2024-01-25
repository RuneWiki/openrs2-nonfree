import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!lu", name = "d", descriptor = "Lclient!oa;")
	public static Class129 aClass129_3;

	@OriginalMember(owner = "client!lu", name = "u", descriptor = "[Z")
	public static final boolean[] aBooleanArray15 = new boolean[100];

	@OriginalMember(owner = "client!lu", name = "v", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_114 = new Class131(39, 7);

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(BLjava/lang/String;I)V")
	public static void method3550(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = Static187.anInt4913;
		@Pc(9) int[] local9 = Static256.anIntArray370;
		@Pc(11) boolean local11 = false;
		for (@Pc(13) int local13 = 0; local13 < local7; local13++) {
			@Pc(21) Class26_Sub2_Sub2_Sub1 local21 = Static311.aClass26_Sub2_Sub2_Sub1Array1[local9[local13]];
			if (local21 != null && Static196.aClass26_Sub2_Sub2_Sub1_1 != local21 && local21.aString51 != null && local21.aString51.equalsIgnoreCase(arg0)) {
				if (arg1 == 1) {
					Static55.method989(Static144.aClass131_73);
					Static232.aClass1_Sub1_Sub1_2.method4117(0);
					Static232.aClass1_Sub1_Sub1_2.method4103(local9[local13]);
				} else if (arg1 == 4) {
					Static55.method989(Static356.aClass131_151);
					Static232.aClass1_Sub1_Sub1_2.method4092(local9[local13]);
					Static232.aClass1_Sub1_Sub1_2.method4125(0);
				} else if (arg1 == 5) {
					Static55.method989(Static359.aClass131_154);
					Static232.aClass1_Sub1_Sub1_2.method4117(0);
					Static232.aClass1_Sub1_Sub1_2.method4092(local9[local13]);
				} else if (arg1 == 6) {
					Static55.method989(Static51.aClass131_34);
					Static232.aClass1_Sub1_Sub1_2.method4092(local9[local13]);
					Static232.aClass1_Sub1_Sub1_2.method4115(0);
				} else if (arg1 == 7) {
					Static55.method989(Static8.aClass131_4);
					Static232.aClass1_Sub1_Sub1_2.method4101(local9[local13]);
					Static232.aClass1_Sub1_Sub1_2.method4098(0);
				}
				local11 = true;
				break;
			}
		}
		if (!local11) {
			Static443.method5893(Static91.aClass84_23.method1678(Static167.anInt3118) + arg0);
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(II)I")
	public static int method3551(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(II)V")
	public static void method3553(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub2_Sub1 local12 = Static258.method5559(arg0, 11);
		local12.method195();
	}
}
