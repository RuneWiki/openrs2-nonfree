import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "I")
	public static int anInt2022 = -1;

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "Lclient!cc;")
	public static Class26 aClass26_18 = new Class26(30);

	@OriginalMember(owner = "client!tn", name = "m", descriptor = "Z")
	public static boolean aBoolean122 = true;

	@OriginalMember(owner = "client!tn", name = "o", descriptor = "Z")
	public static boolean aBoolean123 = false;

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(I)Lclient!gh;")
	public static Class67 method1541() {
		try {
			return (Class67) Class.forName("Class67_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "(B)Lclient!vn;")
	public static Class4_Sub3_Sub14_Sub1 method1546() {
		@Pc(14) byte[] local14 = Static230.aByteArrayArray36[0];
		@Pc(22) int local22 = Static301.anIntArray643[0] * Static110.anIntArray185[0];
		@Pc(66) Class4_Sub3_Sub14_Sub1 local66;
		if (Static223.aBooleanArray22[0]) {
			@Pc(71) int[] local71 = new int[local22];
			@Pc(75) byte[] local75 = Static141.aByteArrayArray54[0];
			for (@Pc(77) int local77 = 0; local77 < local22; local77++) {
				local71[local77] = (local75[local77] & 0xFF) << 24 | Static58.anIntArray85[local14[local77] & 0xFF];
			}
			local66 = new Class4_Sub3_Sub14_Sub1_Sub1(Static47.anInt889, Static105.anInt2162, Static195.anIntArray402[0], Static187.anIntArray391[0], Static110.anIntArray185[0], Static301.anIntArray643[0], local71);
		} else {
			@Pc(29) int[] local29 = new int[local22];
			for (@Pc(31) int local31 = 0; local31 < local22; local31++) {
				local29[local31] = Static58.anIntArray85[local14[local31] & 0xFF];
			}
			local66 = new Class4_Sub3_Sub14_Sub1(Static47.anInt889, Static105.anInt2162, Static195.anIntArray402[0], Static187.anIntArray391[0], Static110.anIntArray185[0], Static301.anIntArray643[0], local29);
		}
		Static304.method4707();
		return local66;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(III)Z")
	public static boolean method1547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		@Pc(15) Class184 local15 = Static6.method99(arg0);
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local15.method4494(arg1);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILclient!fh;II)[Lclient!uj;")
	public static Class4_Sub3_Sub14[] method1548(@OriginalArg(0) int arg0, @OriginalArg(1) Class58 arg1) {
		return Static12.method197(arg1, arg0, 0) ? Static131.method2001() : null;
	}
}
