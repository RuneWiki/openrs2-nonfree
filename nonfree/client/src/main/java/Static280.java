import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!ki", name = "D", descriptor = "[Lclient!el;")
	public static final Class92[] aClass92Array1 = new Class92[6];

	@OriginalMember(owner = "client!ki", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString57 = "";

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIII)V")
	public static void method4040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class228 local7 = Static469.aClass228ArrayArrayArray6[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class12_Sub2_Sub4 local13 = local7.aClass12_Sub2_Sub4_1;
		@Pc(16) Class12_Sub2_Sub4 local16 = local7.aClass12_Sub2_Sub4_2;
		if (local13 != null) {
			local13.aShort61 = (short) (local13.aShort61 * arg3 / (0x10 << Static562.anInt9207 - 7));
			local13.aShort60 = (short) (local13.aShort60 * arg3 / (0x10 << Static562.anInt9207 - 7));
		}
		if (local16 != null) {
			local16.aShort61 = (short) (local16.aShort61 * arg3 / (0x10 << Static562.anInt9207 - 7));
			local16.aShort60 = (short) (local16.aShort60 * arg3 / (0x10 << Static562.anInt9207 - 7));
		}
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(IIII)V")
	public static void method4042(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = arg1 << 3;
		@Pc(19) int local19 = arg0 << 3;
		Static313.aFloat157 = local19;
		if (Static489.anInt7763 == 2) {
			Static140.anInt4804 = 0;
			Static396.anInt6527 = local3;
			Static584.anInt9487 = local19;
		}
		Static541.aFloat128 = local3;
		Static89.method1342();
		Static122.aBoolean139 = true;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!wu;I)I")
	public static int method4043(@OriginalArg(0) Class366 arg0) {
		if (arg0 == Static43.aClass366_2) {
			return 6407;
		} else if (Static225.aClass366_3 == arg0) {
			return 6408;
		} else if (Static398.aClass366_10 == arg0) {
			return 6406;
		} else if (Static527.aClass366_12 == arg0) {
			return 6409;
		} else if (arg0 == Static4.aClass366_1) {
			return 6410;
		} else if (arg0 == Static505.aClass366_11) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}
}
