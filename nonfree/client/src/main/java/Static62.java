import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!db", name = "G", descriptor = "I")
	public static int anInt1155;

	@OriginalMember(owner = "client!db", name = "L", descriptor = "Lclient!sd;")
	public static Class227 aClass227_1;

	@OriginalMember(owner = "client!db", name = "Q", descriptor = "B")
	public static byte aByte12;

	@OriginalMember(owner = "client!db", name = "E", descriptor = "Lclient!fp;")
	public static final Class83 aClass83_3 = new Class83(11, 0, 1, 2);

	@OriginalMember(owner = "client!db", name = "N", descriptor = "Lclient!gn;")
	public static final Class94 aClass94_5 = new Class94(5, 18);

	@OriginalMember(owner = "client!db", name = "R", descriptor = "I")
	public static int anInt1162 = 1;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ZZII)I")
	public static int method921(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class7_Sub27 local8 = Static288.method3810(arg0, arg2);
		if (local8 == null) {
			return -1;
		} else if (arg1 >= 0 && arg1 < local8.anIntArray323.length) {
			return local8.anIntArray323[arg1];
		} else {
			return -1;
		}
	}
}
