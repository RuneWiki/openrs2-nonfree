import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static610 {

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
	public static int anInt9363;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(CII)I")
	public static int method7997(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			@Pc(20) char local20 = Character.toLowerCase(arg0);
			local11 = (local20 << 4) + 1;
		}
		return local11;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
	public static void method7998() {
		@Pc(7) int local7 = Static518.anInt10290;
		@Pc(9) int[] local9 = Static489.anIntArray519;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class3_Sub1_Sub2_Sub2_Sub1 local19 = Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[local9[local11]];
			if (local19 != null && local19.anInt9993 > 0) {
				local19.anInt9993--;
				if (local19.anInt9993 == 0) {
					local19.aString119 = null;
				}
			}
		}
		for (@Pc(48) int local48 = 0; local48 < Static105.anInt2131; local48++) {
			@Pc(55) long local55 = (long) Static526.anIntArray558[local48];
			@Pc(61) Class4_Sub45 local61 = (Class4_Sub45) Static597.aClass66_41.method1994(local55);
			if (local61 != null) {
				@Pc(66) Class3_Sub1_Sub2_Sub2_Sub2 local66 = local61.aClass3_Sub1_Sub2_Sub2_Sub2_2;
				if (local66.anInt9993 > 0) {
					local66.anInt9993--;
					if (local66.anInt9993 == 0) {
						local66.aString119 = null;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V")
	public static void method7999() {
		Static310.aClass352_42.method7659();
	}
}
