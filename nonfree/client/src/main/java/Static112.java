import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!ie", name = "m", descriptor = "F")
	public static float aFloat98;

	@OriginalMember(owner = "client!ie", name = "v", descriptor = "I")
	public static int anInt5358;

	@OriginalMember(owner = "client!ie", name = "s", descriptor = "I")
	public static volatile int anInt5355 = 0;

	@OriginalMember(owner = "client!ie", name = "E", descriptor = "Lclient!fo;")
	public static Class57_Sub1 aClass57_Sub1_44 = null;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIII)I")
	public static int method4461(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) int local3 = arg3 & 0xF;
		@Pc(19) int local19 = local3 < 8 ? arg0 : arg2;
		@Pc(34) int local34 = local3 >= 4 ? (local3 == 12 || local3 == 14 ? arg0 : arg1) : arg2;
		return ((local3 & 0x2) == 0 ? local34 : -local34) + ((local3 & 0x1) == 0 ? local19 : -local19);
	}
}
