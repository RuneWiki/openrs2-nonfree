import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!cg", name = "B", descriptor = "Lclient!vb;")
	public static Class70_Sub1 aClass70_Sub1_8;

	@OriginalMember(owner = "client!cg", name = "H", descriptor = "Lclient!ia;")
	private static Class51 aClass51_212 = Static64.method1101("Choose Option");

	@OriginalMember(owner = "client!cg", name = "x", descriptor = "Lclient!ia;")
	public static Class51 aClass51_211 = aClass51_212;

	@OriginalMember(owner = "client!cg", name = "z", descriptor = "Lclient!sf;")
	public static Class105 aClass105_4 = new Class105();

	@OriginalMember(owner = "client!cg", name = "M", descriptor = "Lclient!ia;")
	private static Class51 aClass51_214 = Static64.method1101("Loaded interfaces");

	@OriginalMember(owner = "client!cg", name = "L", descriptor = "Lclient!ia;")
	public static Class51 aClass51_213 = aClass51_214;

	@OriginalMember(owner = "client!cg", name = "Q", descriptor = "[Lclient!oe;")
	public static Class80[] aClass80Array1 = new Class80[6];

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIII)I")
	public static int method525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 < arg2) {
			return arg2;
		} else if (arg0 < arg1) {
			return arg0;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(II)[B")
	public static byte[] method526(@OriginalArg(0) int arg0) {
		@Pc(13) Class1_Sub2_Sub18 local13 = (Class1_Sub2_Sub18) Static87.aClass123_6.method3640((long) arg0);
		if (local13 == null) {
			@Pc(18) byte[] local18 = new byte[512];
			@Pc(24) Random local24 = new Random((long) arg0);
			for (@Pc(26) int local26 = 0; local26 < 255; local26++) {
				local18[local26] = (byte) local26;
			}
			for (@Pc(39) int local39 = 0; local39 < 255; local39++) {
				@Pc(46) int local46 = 255 - local39;
				@Pc(53) int local53 = Static108.method1839(local24, local46);
				@Pc(57) byte local57 = local18[local53];
				local18[local53] = local18[local46];
				local18[local46] = local18[511 - local39] = local57;
			}
			local13 = new Class1_Sub2_Sub18(local18);
			Static87.aClass123_6.method3644(local13, (long) arg0);
		}
		return local13.aByteArray49;
	}
}
