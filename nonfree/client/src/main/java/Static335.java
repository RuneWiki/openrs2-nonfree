import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!mm", name = "n", descriptor = "I")
	public static int anInt5608;

	@OriginalMember(owner = "client!mm", name = "o", descriptor = "I")
	public static int anInt5609;

	@OriginalMember(owner = "client!mm", name = "s", descriptor = "F")
	public static float aFloat119;

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "[I")
	public static final int[] anIntArray313 = new int[3];

	@OriginalMember(owner = "client!mm", name = "g", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_64 = new Class303(76, 8);

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIII)V")
	public static void method4780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(40) String local40 = "tele " + arg2 + "," + (arg0 >> 6) + "," + (arg1 >> 6) + "," + (arg0 & 0x3F) + "," + (arg1 & 0x3F);
		System.out.println(local40);
		Static237.method3663(true, false, local40);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(BZ)I")
	public static int method4783(@OriginalArg(1) boolean arg0) {
		if (Static213.anIntArray500 == null) {
			return 0;
		} else if (arg0 || Static212.aClass66Array1 == null) {
			@Pc(20) int local20 = 0;
			for (@Pc(27) int local27 = 0; local27 < Static213.anIntArray500.length; local27++) {
				@Pc(33) int local33 = Static213.anIntArray500[local27];
				if (Static119.aClass322_43.method6797(local33)) {
					local20++;
				}
				if (Static258.aClass322_128.method6797(local33)) {
					local20++;
				}
			}
			return local20;
		} else {
			return Static213.anIntArray500.length * 2;
		}
	}
}
