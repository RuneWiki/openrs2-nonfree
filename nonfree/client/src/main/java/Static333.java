import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!qr", name = "D", descriptor = "[Lclient!l;")
	public static Class143[] aClass143Array10;

	@OriginalMember(owner = "client!qr", name = "S", descriptor = "Lclient!ul;")
	public static Class246 aClass246_177;

	@OriginalMember(owner = "client!qr", name = "L", descriptor = "Lclient!kh;")
	public static final Class134 aClass134_44 = new Class134(8);

	@OriginalMember(owner = "client!qr", name = "Q", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_163 = new Class107(20, -1);

	@OriginalMember(owner = "client!qr", name = "R", descriptor = "Z")
	public static boolean aBoolean403 = false;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IZBZI)I")
	public static int method4718(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(4) int arg2) {
		@Pc(8) Class1_Sub14 local8 = Static48.method871(false, arg0);
		if (local8 == null) {
			return 0;
		}
		@Pc(14) int local14 = 0;
		for (@Pc(26) int local26 = 0; local26 < local8.anIntArray146.length; local26++) {
			if (local8.anIntArray146[local26] >= 0 && local8.anIntArray146[local26] < Static165.aClass19_1.anInt579) {
				@Pc(54) Class152 local54 = Static165.aClass19_1.method560(local8.anIntArray146[local26]);
				@Pc(64) int local64 = local54.method3490(arg2, Static400.aClass35_2.method867(arg2).anInt5018);
				if (arg1) {
					local14 += local64 * local8.anIntArray145[local26];
				} else {
					local14 += local64;
				}
			}
		}
		return local14;
	}
}
