import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!or", name = "B", descriptor = "Lclient!ss;")
	public static Class219 aClass219_15 = null;

	@OriginalMember(owner = "client!or", name = "pb", descriptor = "Ljava/lang/String;")
	public static String aString39 = "";

	@OriginalMember(owner = "client!or", name = "Lb", descriptor = "I")
	public static int anInt5212 = 0;

	@OriginalMember(owner = "client!or", name = "sc", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_132 = new Class131(69, 7);

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(IIII)V")
	public static void method4203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class211 local7 = Static268.aClass211ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class26_Sub3 local13 = local7.aClass26_Sub3_3;
		@Pc(16) Class26_Sub3 local16 = local7.aClass26_Sub3_2;
		if (local13 != null) {
			local13.anInt5755 = local13.anInt5755 * arg3 / (0x10 << Static139.anInt2355 - 7);
			local13.anInt5765 = local13.anInt5765 * arg3 / (0x10 << Static139.anInt2355 - 7);
		}
		if (local16 != null) {
			local16.anInt5755 = local16.anInt5755 * arg3 / (0x10 << Static139.anInt2355 - 7);
			local16.anInt5765 = local16.anInt5765 * arg3 / (0x10 << Static139.anInt2355 - 7);
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IILclient!ea;Lclient!oa;Ljava/lang/String;IIILclient!gv;ILclient!ss;I)V")
	public static void method4206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class62 arg2, @OriginalArg(3) Class129 arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class101 arg8, @OriginalArg(10) Class219 arg9, @OriginalArg(11) int arg10) {
		@Pc(13) int local13;
		if (Static310.anInt5540 == 4) {
			local13 = (int) Static274.aFloat78 & 0x3FFF;
		} else {
			local13 = Static182.anInt7140 + (int) Static274.aFloat78 & 0x3FFF;
		}
		@Pc(34) int local34 = Math.max(arg9.anInt6398 / 2, arg9.anInt6363 / 2) + 10;
		@Pc(42) int local42 = arg7 * arg7 + arg1 * arg1;
		if (local34 * local34 < local42) {
			return;
		}
		@Pc(57) int local57 = Class4.anIntArray7[local13];
		@Pc(61) int local61 = Class4.anIntArray6[local13];
		if (Static310.anInt5540 != 4) {
			local61 = local61 * 256 / (Static427.anInt7386 + 256);
			local57 = local57 * 256 / (Static427.anInt7386 + 256);
		}
		@Pc(92) int local92 = arg1 * local61 + arg7 * local57 >> 15;
		@Pc(103) int local103 = arg7 * local61 - local57 * arg1 >> 15;
		@Pc(110) int local110 = arg8.method1973(null, 100, arg4);
		@Pc(118) int local118 = arg8.method1972(arg4, null);
		@Pc(124) int local124 = local92 - local110 / 2;
		if (-arg9.anInt6398 <= local124 && local124 <= arg9.anInt6398 && -arg9.anInt6363 <= local103 && local103 <= arg9.anInt6363) {
			arg3.method5830(arg10, arg2, null, 50, arg0, arg9.anInt6398 / 2 + arg0 + local124, null, 0, 0, arg5, arg4, local110, arg5 + arg9.anInt6363 / 2 - arg6 - local103 - local118);
		}
	}
}
