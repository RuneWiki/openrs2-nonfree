import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static356 {

	@OriginalMember(owner = "client!lq", name = "q", descriptor = "Z")
	public static boolean aBoolean441 = false;

	@OriginalMember(owner = "client!lq", name = "v", descriptor = "Z")
	public static boolean aBoolean442 = false;

	@OriginalMember(owner = "client!lq", name = "p", descriptor = "Z")
	public static boolean aBoolean443 = false;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IILclient!qp;)V")
	public static void method5433(@OriginalArg(0) int arg0, @OriginalArg(2) Class304 arg1) {
		if (Static431.aBoolean550) {
			arg0 = 0;
			Static431.aBoolean550 = false;
		}
		if (Static524.aClass304_2 != null && Static524.aClass304_2.method7335(arg1)) {
			return;
		}
		Static524.aClass304_2 = arg1;
		Static300.aLong272 = Static549.method7758();
		Static243.anInt4675 = arg0;
		Static288.anInt5174 = arg0;
		if (Static288.anInt5174 == 0) {
			Static359.method5447();
			return;
		}
		Static520.aFloat173 = Static548.aFloat178;
		Static251.aClass277_4 = Static372.aClass277_7;
		Static659.anInt10194 = Static15.anInt224;
		Static34.aFloat1 = Static496.aFloat163;
		Static188.anInt3779 = Static223.anInt4381;
		Static621.aFloat197 = Static358.aFloat110;
		Static15.anInt228 = Static557.anInt9015;
		Static602.aClass81_4 = Static547.aClass81_3;
		Static49.aFloat2 = Static255.aFloat98;
		Static467.aFloat160 = Static194.aFloat71;
		Static95.aFloat7 = Static366.aFloat111;
		if (Static372.aClass277_7 == null) {
			return;
		}
		if (Static372.aClass277_7.method6936()) {
			Static251.aClass277_4 = Static372.aClass277_7.method6933();
			Static372.aClass277_7 = Static251.aClass277_4;
		}
		if (Static372.aClass277_7 != null && Static372.aClass277_7 != Static524.aClass304_2.aClass277_6) {
			Static372.aClass277_7.method6939(Static524.aClass304_2.aClass277_6);
			return;
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIIILclient!lga;IZ)V")
	public static void method5434(@OriginalArg(1) int arg0, @OriginalArg(4) Class223 arg1, @OriginalArg(5) int arg2) {
		Static417.anInt7212 = arg2;
		Static319.anInt5508 = arg0;
		Static557.aBoolean682 = false;
		Static145.aClass6_Sub17_Sub4_2 = null;
		Static655.anInt10164 = 0;
		Static432.anInt7414 = 1;
		Static672.aClass223_121 = arg1;
		Static99.anInt2024 = 2;
	}
}
