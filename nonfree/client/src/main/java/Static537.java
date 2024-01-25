import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static537 {

	@OriginalMember(owner = "client!uea", name = "h", descriptor = "F")
	public static float aFloat208;

	@OriginalMember(owner = "client!uea", name = "i", descriptor = "Lclient!ri;")
	public static Class284 aClass284_152;

	@OriginalMember(owner = "client!uea", name = "m", descriptor = "F")
	public static float aFloat209;

	@OriginalMember(owner = "client!uea", name = "n", descriptor = "Lclient!ri;")
	public static Class284 aClass284_153;

	@OriginalMember(owner = "client!uea", name = "f", descriptor = "Lclient!sba;")
	public static final Class297 aClass297_34 = new Class297(64);

	@OriginalMember(owner = "client!uea", name = "k", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_143 = new Class287(23, -1);

	@OriginalMember(owner = "client!uea", name = "l", descriptor = "I")
	public static int anInt9359 = 0;

	@OriginalMember(owner = "client!uea", name = "b", descriptor = "(II)Z")
	public static boolean method7342(@OriginalArg(1) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}

	@OriginalMember(owner = "client!uea", name = "b", descriptor = "(Z)V")
	public static void method7344() {
		Static467.aBoolean560 = false;
		Static559.aClass236Array6 = new Class236[500];
		Static473.anInt8222 = 0;
		Static529.anInt9241 = 0;
		Static440.anInt7810 = Static331.anInt6010;
		Static71.aClass236Array1 = new Class236[1000];
		Static541.anInt9451 = Static331.anInt6010;
		Static122.aClass236Array3 = new Class236[500];
		Static259.anInt1154 = 0;
		Static58.anInt1550 = 0;
		Static461.anIntArrayArrayArray13 = new int[Static590.anInt10277][Static349.anInt6237 + 1][Static414.anInt7451 + 1];
		Static100.aClass236Array5 = new Class236[2000];
		if (Static68.aClass31_4 instanceof l) {
			Static383.aBoolean467 = false;
		} else {
			Static383.aBoolean467 = true;
		}
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(IIIII)V")
	public static void method7345(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class3_Sub7_Sub19 local8 = Static73.method5992(8, arg2);
		local8.method7363();
		local8.anInt9381 = arg1;
		local8.anInt9377 = arg0;
		local8.anInt9383 = arg3;
	}

	@OriginalMember(owner = "client!uea", name = "b", descriptor = "(IIIII)V")
	public static void method7346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(12) int local12 = -arg2;
		@Pc(14) int local14 = -1;
		@Pc(22) int local22 = Static4.method56(arg2 + arg0, Static384.anInt6641, Static191.anInt4134);
		@Pc(33) int local33 = Static4.method56(arg0 - arg2, Static384.anInt6641, Static191.anInt4134);
		Static504.method6755(arg3, local22, Static570.anIntArrayArray100[arg1], local33);
		while (local7 < local9) {
			local14 += 2;
			local12 += local14;
			@Pc(65) int local65;
			@Pc(69) int local69;
			@Pc(88) int local88;
			@Pc(96) int local96;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local65 = arg1 - local9;
				local69 = local9 + arg1;
				if (Static112.anInt2687 <= local69 && local65 <= Static333.anInt6022) {
					local88 = Static4.method56(arg0 + local7, Static384.anInt6641, Static191.anInt4134);
					local96 = Static4.method56(arg0 - local7, Static384.anInt6641, Static191.anInt4134);
					if (local69 <= Static333.anInt6022) {
						Static504.method6755(arg3, local88, Static570.anIntArrayArray100[local69], local96);
					}
					if (Static112.anInt2687 <= local65) {
						Static504.method6755(arg3, local88, Static570.anIntArrayArray100[local65], local96);
					}
				}
			}
			local7++;
			local65 = arg1 - local7;
			local69 = local7 + arg1;
			if (Static112.anInt2687 <= local69 && local65 <= Static333.anInt6022) {
				local88 = Static4.method56(local9 + arg0, Static384.anInt6641, Static191.anInt4134);
				local96 = Static4.method56(arg0 - local9, Static384.anInt6641, Static191.anInt4134);
				if (Static333.anInt6022 >= local69) {
					Static504.method6755(arg3, local88, Static570.anIntArrayArray100[local69], local96);
				}
				if (Static112.anInt2687 <= local65) {
					Static504.method6755(arg3, local88, Static570.anIntArrayArray100[local65], local96);
				}
			}
		}
	}
}
