import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!su", name = "u", descriptor = "Lclient!vi;")
	public static Class257 aClass257_2;

	@OriginalMember(owner = "client!su", name = "w", descriptor = "Z")
	public static boolean aBoolean58;

	@OriginalMember(owner = "client!su", name = "s", descriptor = "Lclient!mo;")
	public static final Class168 aClass168_6 = new Class168(3, 14);

	@OriginalMember(owner = "client!su", name = "t", descriptor = "Lclient!os;")
	public static final Class182 aClass182_44 = new Class182("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

	@OriginalMember(owner = "client!su", name = "v", descriptor = "Lclient!cd;")
	public static final Class36 aClass36_3 = new Class36("", 13);

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IZIZ)I")
	public static int method900(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class10_Sub44 local10 = Static40.method555(arg0, arg1);
		if (local10 == null) {
			return 0;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(27) int local27 = 0;
			for (@Pc(29) int local29 = 0; local29 < local10.anIntArray703.length; local29++) {
				if (arg2 == local10.anIntArray704[local29]) {
					local27 += local10.anIntArray703[local29];
				}
			}
			return local27;
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IIIII)I")
	public static int method908(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = arg0 & 0xF;
		@Pc(21) int local21 = local12 < 8 ? arg2 : arg1;
		@Pc(38) int local38 = local12 < 4 ? arg1 : local12 == 12 || local12 == 14 ? arg2 : arg3;
		return ((local12 & 0x1) == 0 ? local21 : -local21) + ((local12 & 0x2) == 0 ? local38 : -local38);
	}
}
