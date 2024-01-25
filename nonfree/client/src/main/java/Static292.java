import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!lo", name = "J", descriptor = "I")
	public static int anInt4769;

	@OriginalMember(owner = "client!lo", name = "l", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_114 = new Class40(11, -2);

	@OriginalMember(owner = "client!lo", name = "F", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_115 = new Class40(62, 12);

	@OriginalMember(owner = "client!lo", name = "H", descriptor = "Lclient!vi;")
	public static final Class332 aClass332_123 = new Class332(4);

	@OriginalMember(owner = "client!lo", name = "I", descriptor = "I")
	public static int anInt4768 = 0;

	@OriginalMember(owner = "client!lo", name = "K", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_116 = new Class40(41, -1);

	@OriginalMember(owner = "client!lo", name = "L", descriptor = "Lclient!rh;")
	public static final Class275 aClass275_101 = new Class275();

	@OriginalMember(owner = "client!lo", name = "M", descriptor = "I")
	public static int anInt4770 = 0;

	@OriginalMember(owner = "client!lo", name = "N", descriptor = "[I")
	public static final int[] anIntArray456 = new int[500];

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIIII[B)Z")
	public static boolean method4099(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) byte[] arg4) {
		@Pc(9) int local9 = arg0 % 8;
		@Pc(19) int local19;
		if (local9 == 0) {
			local19 = 0;
		} else {
			local19 = 8 - local9;
		}
		@Pc(32) int local32 = -((arg3 + 8 - 1) / 8);
		@Pc(41) int local41 = -((arg0 + 8 - 1) / 8);
		for (@Pc(43) int local43 = local32; local43 < 0; local43++) {
			for (@Pc(50) int local50 = local41; local50 < 0; local50++) {
				if (arg4[arg2] == 0) {
					return true;
				}
				arg2 += 8;
			}
			arg2 -= local19;
			if (arg4[arg2 - 1] == 0) {
				return true;
			}
			arg2 += arg1;
		}
		return false;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)[I")
	public static int[] method4100() {
		return new int[] { Static425.anInt9464, Static563.anInt9403, Static422.anInt7470 };
	}
}
