import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "Lclient!td;")
	public static Class24 aClass24_15;

	@OriginalMember(owner = "client!kca", name = "h", descriptor = "[Lclient!sia;")
	public static Class309[] aClass309Array1;

	@OriginalMember(owner = "client!kca", name = "g", descriptor = "[F")
	public static final float[] aFloatArray34 = new float[4];

	@OriginalMember(owner = "client!kca", name = "i", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_73 = new Class200(113, 3);

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(ZII)Z")
	public static boolean method4604(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static323.method5277(arg1, arg0) | (arg0 & 0x60000) != 0 || Static200.method3474(arg1, arg0) || Static206.method3538(arg1, arg0);
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(IZZ)V")
	public static void method4606(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(10) Class3_Sub32 local10 = Static210.method3568(arg1, arg0);
		if (local10 != null) {
			for (@Pc(19) int local19 = 0; local19 < local10.anIntArray268.length; local19++) {
				local10.anIntArray268[local19] = -1;
				local10.anIntArray267[local19] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(IIZZ)Ljava/lang/String;")
	public static String method4607(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(34) int local34 = 2;
		@Pc(43) int local43 = arg0 / 10;
		while (local43 != 0) {
			local43 /= 10;
			local34++;
		}
		@Pc(55) char[] local55 = new char[local34];
		local55[0] = '+';
		for (@Pc(63) int local63 = local34 - 1; local63 > 0; local63--) {
			@Pc(67) int local67 = arg0;
			arg0 /= 10;
			@Pc(78) int local78 = local67 - arg0 * 10;
			if (local78 < 10) {
				local55[local63] = (char) (local78 + 48);
			} else {
				local55[local63] = (char) (local78 + 87);
			}
		}
		return new String(local55);
	}
}
