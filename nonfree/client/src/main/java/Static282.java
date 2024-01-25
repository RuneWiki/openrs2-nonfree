import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!kp", name = "C", descriptor = "[I")
	public static int[] anIntArray362;

	@OriginalMember(owner = "client!kp", name = "z", descriptor = "Lclient!uh;")
	public static final Class327 aClass327_1 = new Class327();

	@OriginalMember(owner = "client!kp", name = "B", descriptor = "[[B")
	public static final byte[][] aByteArrayArray20 = new byte[250][];

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!tc;Z)V")
	public static void method4860(@OriginalArg(0) Class305 arg0) {
		if (arg0.anInt9235 == Static243.anInt5076) {
			Static518.aBooleanArray37[arg0.anInt9229] = true;
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILclient!oa;)V")
	public static void method4861(@OriginalArg(1) Class15 arg0) {
		Static269.aClass27Array1 = new Class27[Static500.anIntArray611.length];
		for (@Pc(16) int local16 = 0; local16 < Static500.anIntArray611.length; local16++) {
			@Pc(21) int local21 = Static500.anIntArray611[local16];
			@Pc(26) Class297 local26 = Static356.method5901(Static16.aClass254_7, local21);
			@Pc(34) Class111 local34 = arg0.method5346(local26, Static599.method819(Static181.aClass254_57, local21));
			Static269.aClass27Array1[local16] = new Class27(local34, local26);
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(BLclient!pw;)I")
	public static int method4862(@OriginalArg(1) Class261 arg0) {
		if (arg0 == Static593.aClass261_16) {
			return 6407;
		} else if (Static492.aClass261_14 == arg0) {
			return 6408;
		} else if (Static379.aClass261_10 == arg0) {
			return 6406;
		} else if (Static120.aClass261_9 == arg0) {
			return 6409;
		} else if (arg0 == Static249.aClass261_8) {
			return 6410;
		} else if (Static438.aClass261_11 == arg0) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)Z")
	public static boolean method4863(@OriginalArg(1) int arg0) {
		return arg0 == (-arg0 & arg0);
	}

	@OriginalMember(owner = "client!kp", name = "d", descriptor = "(III)Lclient!tc;")
	public static Class305 method4864(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class305 local7 = Static220.method3786(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass305Array2 == null || arg1 >= local7.aClass305Array2.length) {
			return null;
		} else {
			return local7.aClass305Array2[arg1];
		}
	}
}
