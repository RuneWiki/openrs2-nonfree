import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!gd", name = "O", descriptor = "Lclient!hi;")
	public static Class13 aClass13_2;

	@OriginalMember(owner = "client!gd", name = "M", descriptor = "Z")
	public static boolean aBoolean108 = false;

	@OriginalMember(owner = "client!gd", name = "X", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_642 = Static181.method2795(" more options");

	@OriginalMember(owner = "client!gd", name = "P", descriptor = "Lclient!qe;")
	public static Class83 aClass83_640 = aClass83_642;

	@OriginalMember(owner = "client!gd", name = "T", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_641 = Static181.method2795(")3");

	@OriginalMember(owner = "client!gd", name = "Y", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_643 = Static181.method2795("Null");

	@OriginalMember(owner = "client!gd", name = "Z", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_644 = Static181.method2795("l");

	@OriginalMember(owner = "client!gd", name = "bb", descriptor = "[I")
	public static final int[] anIntArray208 = new int[25];

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!ae;I)Z")
	public static boolean method1674(@OriginalArg(0) Class5 arg0) {
		if (arg0.anIntArray15 == null) {
			return false;
		}
		for (@Pc(10) int local10 = 0; local10 < arg0.anIntArray15.length; local10++) {
			@Pc(20) int local20 = Static200.method3028(arg0, local10);
			@Pc(25) int local25 = arg0.anIntArray7[local10];
			if (arg0.anIntArray15[local10] == 2) {
				if (local25 <= local20) {
					return false;
				}
			} else if (arg0.anIntArray15[local10] == 3) {
				if (local25 >= local20) {
					return false;
				}
			} else if (arg0.anIntArray15[local10] == 4) {
				if (local25 == local20) {
					return false;
				}
			} else if (local25 != local20) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IILclient!eh;I)Lclient!nb;")
	public static Class2_Sub2_Sub17 method1675(@OriginalArg(0) int arg0, @OriginalArg(2) Class28 arg1, @OriginalArg(3) int arg2) {
		return Static66.method1261(arg2, arg0, arg1) ? Static211.method3199() : null;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!eh;ZIILclient!eh;)Lclient!fe;")
	public static Class2_Sub2_Sub10 method1678(@OriginalArg(0) Class28 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class28 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) int[] local12 = arg2.method876(arg1);
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(26) byte[] local26 = arg2.method851(local12[local14], arg1);
			if (local26 == null) {
				local7 = false;
			} else {
				@Pc(46) int local46 = local26[1] & 0xFF | (local26[0] & 0xFF) << 8;
				@Pc(54) byte[] local54 = arg0.method851(0, local46);
				if (local54 == null) {
					local7 = false;
				}
			}
		}
		if (!local7) {
			return null;
		}
		try {
			return new Class2_Sub2_Sub10(arg2, arg0, arg1, false);
		} catch (@Pc(95) Exception local95) {
			return null;
		}
	}
}
