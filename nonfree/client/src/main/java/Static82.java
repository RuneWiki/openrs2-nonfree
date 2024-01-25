import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!fa", name = "xd", descriptor = "I")
	public static int anInt2376;

	@OriginalMember(owner = "client!fa", name = "cd", descriptor = "[I")
	public static final int[] anIntArray200 = new int[14];

	@OriginalMember(owner = "client!fa", name = "fd", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_113 = new Class159(" from your friend list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

	@OriginalMember(owner = "client!fa", name = "td", descriptor = "Lclient!kn;")
	public static Class116 aClass116_11 = new Class116();

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(Z)V")
	public static void method2081() {
		if (Static356.aClass185_9 == null) {
			return;
		}
		if (Static356.aClass185_9.anInt5682 == 1) {
			Static356.aClass185_9 = null;
			return;
		}
		if (Static356.aClass185_9.anInt5682 == 2) {
			Static248.method4394(Static180.aClass134_3, 2, Static92.aString7);
			Static356.aClass185_9 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(Z)V")
	public static void method2085() {
		if (Static281.anInt5555 < 0) {
			return;
		}
		@Pc(11) long local11 = Static208.method3879();
		Static281.anInt5555 = (int) ((long) Static281.anInt5555 + Static214.aLong61 - local11);
		if (Static281.anInt5555 > 0) {
			@Pc(28) int local28 = (Static281.anInt5555 << 8) / Static173.anInt3686;
			@Pc(33) int local33 = 255 - local28;
			@Pc(38) float local38 = (float) local28 / 255.0F;
			Static192.anInt4032 = ((Static139.anInt3197 & 0xFF00FF) * local28 + local33 * (Static248.aClass50_2.anInt1830 & 0xFF00FF) & 0xFF00FF00) + ((Static139.anInt3197 & 0xFF00) * local28 + (local33 * (Static248.aClass50_2.anInt1830 & 0xFF00)) & 0xFF0000) >>> 8;
			@Pc(76) float local76 = 1.0F - local38;
			Static235.anInt4755 = ((Static143.anInt3253 & 0xFF00) * local28 + (Static248.aClass50_2.anInt1832 & 0xFF00) * local33 & 0xFF0000) + (local33 * (Static248.aClass50_2.anInt1832 & 0xFF00FF) + (Static143.anInt3253 & 0xFF00FF) * local28 & 0xFF00FF00) >>> 8;
			Static151.aFloat61 = local76 * (Static248.aClass50_2.aFloat17 - Static269.aFloat88) + Static269.aFloat88;
			Static140.aFloat63 = Static80.aFloat24 + (Static248.aClass50_2.aFloat18 - Static80.aFloat24) * local76;
			Static127.aFloat36 = local76 * (Static248.aClass50_2.aFloat22 - Static99.aFloat29) + Static99.aFloat29;
			Static150.aFloat64 = Static138.aFloat35 + local76 * (Static248.aClass50_2.aFloat19 - Static138.aFloat35);
			Static261.anInt5279 = Static335.anInt6407 * local28 + Static248.aClass50_2.anInt1839 * local33 >> 8;
			Static337.aFloat96 = Static319.aFloat94 + local76 * (Static248.aClass50_2.aFloat21 - Static319.aFloat94);
			Static177.aFloat68 = Static221.aFloat33 + local76 * (Static248.aClass50_2.aFloat20 - Static221.aFloat33);
			if (Static248.aClass50_2.aClass81_2 != Static290.aClass81_6) {
				Static278.aClass81_7 = Static243.aClass47_10.method2718(Static290.aClass81_6, Static248.aClass50_2.aClass81_2, local76, Static278.aClass81_7);
			}
		} else {
			Static177.aFloat68 = Static248.aClass50_2.aFloat20;
			Static127.aFloat36 = Static248.aClass50_2.aFloat22;
			Static278.aClass81_7 = Static248.aClass50_2.aClass81_2;
			Static151.aFloat61 = Static248.aClass50_2.aFloat17;
			Static192.anInt4032 = Static248.aClass50_2.anInt1830;
			Static140.aFloat63 = Static248.aClass50_2.aFloat18;
			Static235.anInt4755 = Static248.aClass50_2.anInt1832;
			Static261.anInt5279 = Static248.aClass50_2.anInt1839;
			Static281.anInt5555 = -1;
			Static150.aFloat64 = Static248.aClass50_2.aFloat19;
			Static337.aFloat96 = Static248.aClass50_2.aFloat21;
		}
		Static214.aLong61 = local11;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!tj;I)I")
	public static int method2088(@OriginalArg(0) Class193 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method5064(Static170.anInt3632)) {
			local5++;
		}
		if (arg0.method5064(Static40.anInt1100)) {
			local5++;
		}
		if (arg0.method5064(Static166.anInt3582)) {
			local5++;
		}
		if (arg0.method5064(Static204.anInt4277)) {
			local5++;
		}
		if (arg0.method5064(Static119.anInt2859)) {
			local5++;
		}
		if (arg0.method5064(Static47.anInt1277)) {
			local5++;
		}
		if (arg0.method5064(Static11.anInt246)) {
			local5++;
		}
		if (arg0.method5064(Static184.anInt3881)) {
			local5++;
		}
		if (arg0.method5064(Static203.anInt4233)) {
			local5++;
		}
		if (arg0.method5064(Static306.anInt5904)) {
			local5++;
		}
		if (arg0.method5064(Static254.anInt2747)) {
			local5++;
		}
		if (arg0.method5064(Static48.anInt1290)) {
			local5++;
		}
		if (arg0.method5064(Static146.anInt2896)) {
			local5++;
		}
		if (arg0.method5064(Static239.anInt4795)) {
			local5++;
		}
		if (arg0.method5064(Static194.anInt4052)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IBII)V")
	public static void method2091(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(14) Class50 local14 = Static162.aClass50ArrayArray1[arg1][arg0];
		Static331.method5365(5000, local14 == null ? Static65.aClass50_1 : local14);
	}
}
