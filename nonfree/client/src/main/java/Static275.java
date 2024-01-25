import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!k", name = "d", descriptor = "Lclient!ft;")
	public static Class5_Sub16_Sub1 aClass5_Sub16_Sub1_5;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "[I")
	public static int[] anIntArray678 = new int[1];

	@OriginalMember(owner = "client!k", name = "c", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_167 = new Class136(26, 0);

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ZIIIIIIIII)Z")
	public static boolean method7486(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static243.method3693(arg2, arg0, arg8)) {
			return false;
		}
		@Pc(15) int local15 = Static511.anIntArray674[2];
		@Pc(19) int local19 = Static511.anIntArray674[1];
		@Pc(23) int local23 = Static511.anIntArray674[0];
		if (!Static243.method3693(arg6, arg1, arg7)) {
			return false;
		}
		@Pc(35) int local35 = Static511.anIntArray674[2];
		@Pc(54) int local54 = Static511.anIntArray674[0];
		@Pc(58) int local58 = Static511.anIntArray674[1];
		if (Static243.method3693(arg4, arg3, arg5)) {
			@Pc(70) int local70 = Static511.anIntArray674[2];
			@Pc(74) int local74 = Static511.anIntArray674[1];
			@Pc(78) int local78 = Static511.anIntArray674[0];
			return Static91.method1414(local35, local58, local23, local19, local74, local78, local54, local15, local70);
		} else {
			return false;
		}
	}
}
