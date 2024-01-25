import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "Lclient!tp;")
	public static Class237 aClass237_2;

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "Lclient!ru;")
	public static Class219 aClass219_2;

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
	public static int anInt2548;

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_134 = new Class123(31, 6);

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIILjava/lang/String;I)V")
	public static void method2112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class57_Sub6 local7 = new Class57_Sub6();
		local7.anInt4849 = arg6 + Static66.anInt1741;
		local7.anInt4850 = arg0;
		local7.anInt4857 = arg4;
		local7.anInt4856 = arg1;
		local7.aString32 = arg5;
		local7.anInt4854 = arg2;
		local7.anInt4851 = arg3;
		Static298.aClass111_4.method2696(local7);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z[[BLclient!uo;)V")
	public static void method2114(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class115_Sub1 arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.anInt7278; local3++) {
			Static280.method4210();
			for (@Pc(9) int local9 = 0; local9 < Static181.anInt3574 >> 3; local9++) {
				for (@Pc(13) int local13 = 0; local13 < Static117.anInt2450 >> 3; local13++) {
					@Pc(23) int local23 = Static287.anIntArrayArrayArray10[local3][local9][local13];
					if (local23 != -1) {
						@Pc(32) int local32 = local23 >> 24 & 0x3;
						if (!arg1.aBoolean462 || local32 == 0) {
							@Pc(46) int local46 = local23 >> 1 & 0x3;
							@Pc(52) int local52 = local23 >> 14 & 0x3FF;
							@Pc(58) int local58 = local23 >> 3 & 0x7FF;
							@Pc(68) int local68 = local58 / 8 + (local52 / 8 << 8);
							for (@Pc(70) int local70 = 0; local70 < Static411.anIntArray508.length; local70++) {
								if (local68 == Static411.anIntArray508[local70] && arg0[local70] != null) {
									arg1.method6000(local9 * 8, Static209.aClass210Array2, local13 * 8, (local58 & 0x7) * 8, local3, Static126.aClass66_5, (local52 & 0x7) * 8, local46, arg0[local70], local32);
									break;
								}
							}
						}
					}
				}
			}
		}
	}
}
