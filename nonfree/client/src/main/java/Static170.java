import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "Lclient!ne;")
	public static final Class206 aClass206_2 = new Class206();

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "F")
	public static float aFloat162 = 1.0F;

	@OriginalMember(owner = "client!gs", name = "d", descriptor = "I")
	public static int anInt3419 = 0;

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIIIIII)V")
	public static void method3011(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		@Pc(11) Class34[] local11 = Static531.aClass34Array1;
		for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
			@Pc(19) Class34 local19 = local11[local13];
			if (local19 != null && local19.anInt976 == 2) {
				Static280.method4572(local19.anInt971, local19.anInt972, local19.anInt977 * 2, local19.anInt978, arg3 >> 1, arg0 >> 1);
				if (Static469.anIntArray626[0] > -1 && Static481.anInt8318 % 20 < 10) {
					Static438.aClass25Array16[local19.anInt975].method6956(arg1 + Static469.anIntArray626[0] - 12, Static469.anIntArray626[1] + -28 + arg2);
				}
			}
		}
	}
}
