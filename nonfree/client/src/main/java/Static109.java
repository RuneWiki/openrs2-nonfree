import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "[[B")
	public static byte[][] aByteArrayArray16;

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "Lclient!hc;")
	public static Class1_Sub6 aClass1_Sub6_4;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "J")
	public static volatile long aLong97 = 0L;

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "Lclient!ea;")
	public static Class18 aClass18_815 = Static8.method128("Bitte geben Sie Ihr Passwort ein)3");

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z[B)V")
	public static void method2228(@OriginalArg(1) byte[] arg0) {
		@Pc(6) Class1_Sub6 local6 = new Class1_Sub6(arg0);
		local6.anInt839 = arg0.length - 2;
		Static22.anInt615 = local6.method546();
		Static22.aByteArrayArray4 = new byte[Static22.anInt615][];
		Static129.anIntArray331 = new int[Static22.anInt615];
		Static26.anIntArray54 = new int[Static22.anInt615];
		Static131.anIntArray333 = new int[Static22.anInt615];
		Static145.anIntArray375 = new int[Static22.anInt615];
		local6.anInt839 = arg0.length - Static22.anInt615 * 8 - 7;
		Static47.anInt4239 = local6.method546();
		Static101.anInt3032 = local6.method546();
		@Pc(61) int local61 = (local6.method544() & 0xFF) + 1;
		for (@Pc(68) int local68 = 0; local68 < Static22.anInt615; local68++) {
			Static131.anIntArray333[local68] = local6.method546();
		}
		for (@Pc(86) int local86 = 0; local86 < Static22.anInt615; local86++) {
			Static129.anIntArray331[local86] = local6.method546();
		}
		for (@Pc(100) int local100 = 0; local100 < Static22.anInt615; local100++) {
			Static26.anIntArray54[local100] = local6.method546();
		}
		for (@Pc(114) int local114 = 0; local114 < Static22.anInt615; local114++) {
			Static145.anIntArray375[local114] = local6.method546();
		}
		local6.anInt839 = arg0.length + 3 - Static22.anInt615 * 8 - local61 * 3 - 7;
		Static9.anIntArray13 = new int[local61];
		for (@Pc(149) int local149 = 1; local149 < local61; local149++) {
			Static9.anIntArray13[local149] = local6.method501();
			if (Static9.anIntArray13[local149] == 0) {
				Static9.anIntArray13[local149] = 1;
			}
		}
		local6.anInt839 = 0;
		for (@Pc(178) int local178 = 0; local178 < Static22.anInt615; local178++) {
			@Pc(184) int local184 = Static26.anIntArray54[local178];
			@Pc(188) int local188 = Static145.anIntArray375[local178];
			@Pc(192) int local192 = local188 * local184;
			@Pc(195) byte[] local195 = new byte[local192];
			Static22.aByteArrayArray4[local178] = local195;
			@Pc(203) int local203 = local6.method544();
			@Pc(210) int local210;
			if (local203 == 0) {
				for (local210 = 0; local210 < local192; local210++) {
					local195[local210] = local6.method548();
				}
			} else if (local203 == 1) {
				for (local210 = 0; local210 < local184; local210++) {
					for (@Pc(235) int local235 = 0; local235 < local188; local235++) {
						local195[local210 + local235 * local184] = local6.method548();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
	public static void method2229() {
		aClass1_Sub6_4 = null;
		aClass18_815 = null;
		aByteArrayArray16 = null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)I")
	public static int method2230(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > 179) {
			arg1 /= 2;
		}
		if (arg0 > 192) {
			arg1 /= 2;
		}
		if (arg0 > 217) {
			arg1 /= 2;
		}
		if (arg0 > 243) {
			arg1 /= 2;
		}
		return arg0 / 2 + (arg2 / 4 << 10) + (arg1 / 32 << 7);
	}
}
