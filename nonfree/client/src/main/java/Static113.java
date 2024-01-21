import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!mb", name = "mb", descriptor = "Lclient!sd;")
	public static Class60 aClass60_23;

	@OriginalMember(owner = "client!mb", name = "jb", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!mb", name = "lb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1609 = Static118.method2249("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!mb", name = "nb", descriptor = "[I")
	public static final int[] anIntArray327 = new int[25];

	@OriginalMember(owner = "client!mb", name = "ob", descriptor = "I")
	public static int anInt2778 = 1;

	@OriginalMember(owner = "client!mb", name = "qb", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1611 = Static118.method2249("Members only world");

	@OriginalMember(owner = "client!mb", name = "pb", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1610 = aClass65_1611;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "([BIIIBIII[Lclient!n;I)V")
	public static void method2100(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class57[] arg7, @OriginalArg(9) int arg8) {
		@Pc(3) int local3 = -1;
		@Pc(13) Class1_Sub14 local13 = new Class1_Sub14(arg0);
		while (true) {
			@Pc(19) int local19 = local13.method1703();
			if (local19 == 0) {
				return;
			}
			local3 += local19;
			@Pc(30) int local30 = 0;
			while (true) {
				@Pc(34) int local34 = local13.method1703();
				if (local34 == 0) {
					break;
				}
				local30 += local34 - 1;
				@Pc(46) int local46 = local30 & 0x3F;
				@Pc(52) int local52 = local30 >> 6 & 0x3F;
				@Pc(56) int local56 = local30 >> 12;
				@Pc(60) int local60 = local13.method1738();
				@Pc(64) int local64 = local60 >> 2;
				@Pc(68) int local68 = local60 & 0x3;
				if (arg1 == local56 && arg2 <= local52 && arg2 + 8 > local52 && arg3 <= local46 && arg3 + 8 > local46) {
					@Pc(99) Class1_Sub2_Sub13 local99 = Static5.method65(local3);
					@Pc(118) int local118 = Static183.method2980(local99.anInt1988, local68, local46 & 0x7, arg8, local52 & 0x7, local99.anInt2001) + arg5;
					@Pc(135) int local135 = arg6 + Static11.method205(local99.anInt2001, local46 & 0x7, local99.anInt1988, arg8, local68, local52 & 0x7);
					if (local118 > 0 && local135 > 0 && local118 < 103 && local135 < 103) {
						@Pc(152) int local152 = arg4;
						if ((Static106.aByteArrayArrayArray67[1][local118][local135] & 0x2) == 2) {
							local152 = arg4 - 1;
						}
						@Pc(168) Class57 local168 = null;
						if (local152 >= 0) {
							local168 = arg7[local152];
						}
						Static134.method2559(local3, local68 + arg8 & 0x3, local118, arg4, true, local168, arg4, local135, Static13.aBoolean36, local64);
					}
				}
			}
		}
	}
}
