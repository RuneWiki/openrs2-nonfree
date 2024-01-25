import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "Lclient!aj;")
	public static Class10 aClass10_4;

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "F")
	public static float aFloat102;

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "Lclient!gt;")
	public static Class93 aClass93_3;

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
	public static int anInt4109 = 1;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "([[BZLclient!ks;)V")
	public static void method3241(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class113_Sub1 arg1) {
		@Pc(16) int[] local16 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(19) int local19 = arg0.length;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = 0; local21 < local19; local21++) {
			@Pc(27) byte[] local27 = arg0[local21];
			if (local27 != null) {
				@Pc(34) Class5_Sub15 local34 = new Class5_Sub15(local27);
				local40 = Static362.anIntArray418[local21] >> 8;
				@Pc(46) int local46 = Static362.anIntArray418[local21] & 0xFF;
				@Pc(53) int local53 = local40 * 64 - Static31.anInt618;
				@Pc(60) int local60 = local46 * 64 - Static226.anInt3768;
				Static341.method4427();
				arg1.method2971(local53, Static226.anInt3768, Static163.aClass240Array1, Static31.anInt618, local60, local34);
				arg1.method2978(local60, Static407.aClass200_9, local34, local16, local53);
				if (!arg1.aBoolean242 && local40 == Static345.anInt5641 / 8 && Static375.anInt6241 / 8 == local46 && local16[0] != -1) {
					Static51.aClass207_1 = Static42.aClass235_1.method5351(Static420.aClass175_2, local16[3], local16[1], local16[2], local16[0]);
					Static293.anInt4611 = local16[4];
				}
			}
		}
		for (@Pc(136) int local136 = 0; local136 < local19; local136++) {
			@Pc(149) int local149 = (Static362.anIntArray418[local136] >> 8) * 64 - Static31.anInt618;
			local40 = (Static362.anIntArray418[local136] & 0xFF) * 64 - Static226.anInt3768;
			@Pc(164) byte[] local164 = arg0[local136];
			if (local164 == null && Static375.anInt6241 < 800) {
				Static341.method4427();
				arg1.method2969(local40, local149);
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;I)V")
	public static void method3242(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		Static226.anInt3761 = 2;
		Static93.anInt1623 = arg2;
		Static157.method2214(arg1, arg0);
	}
}
