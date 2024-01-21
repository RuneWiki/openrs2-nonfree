import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!uf", name = "r", descriptor = "I")
	public static int anInt4043;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
	public static int anInt4032 = 0;

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1401 = Static151.method2243("mapfunction");

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1402 = Static151.method2243("Zugewiesener Speicher)3");

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
	public static int anInt4035 = 1;

	@OriginalMember(owner = "client!uf", name = "v", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1405 = Static151.method2243(" from your friend list first)3");

	@OriginalMember(owner = "client!uf", name = "k", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1403 = aClass62_1405;

	@OriginalMember(owner = "client!uf", name = "m", descriptor = "[I")
	public static final int[] anIntArray369 = new int[5];

	@OriginalMember(owner = "client!uf", name = "n", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1404 = Static151.method2243(":chalreq:");

	@OriginalMember(owner = "client!uf", name = "s", descriptor = "I")
	public static int anInt4044 = 0;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IILclient!kd;)Lclient!mb;")
	public static Class62 method2788(@OriginalArg(2) Class2_Sub11 arg0) {
		try {
			@Pc(15) Class62 local15 = new Class62();
			local15.anInt2653 = arg0.method1572();
			if (local15.anInt2653 > 32767) {
				local15.anInt2653 = 32767;
			}
			local15.aByteArray28 = new byte[local15.anInt2653];
			arg0.anInt2235 += Static52.aClass83_1.method2394(local15.anInt2653, arg0.aByteArray26, arg0.anInt2235, local15.aByteArray28, 0);
			return local15;
		} catch (@Pc(52) Exception local52) {
			return Static185.aClass62_1359;
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
	public static void method2789() {
		Static203.anInt4219 &= 0x7FF;
		if (Static202.anInt4179 < 128) {
			Static202.anInt4179 = 128;
		}
		@Pc(18) int local18 = Static169.anInt3578 >> 7;
		@Pc(20) int local20 = 0;
		@Pc(24) int local24 = Static17.anInt446 >> 7;
		if (Static202.anInt4179 > 383) {
			Static202.anInt4179 = 383;
		}
		@Pc(37) int local37 = Static175.method2548(Static17.anInt446, Static126.anInt2806, Static169.anInt3578);
		@Pc(61) int local61;
		if (local18 > 3 && local24 > 3 && local18 < 100 && local24 < 100) {
			for (local61 = local18 - 4; local61 <= local18 + 4; local61++) {
				for (@Pc(67) int local67 = local24 - 4; local67 <= local24 + 4; local67++) {
					@Pc(71) int local71 = Static126.anInt2806;
					if (local71 < 3 && (Static133.aByteArrayArrayArray11[1][local61][local67] & 0x2) == 2) {
						local71++;
					}
					@Pc(99) int local99 = local37 - Static171.anIntArrayArrayArray7[local71][local61][local67];
					if (local20 < local99) {
						local20 = local99;
					}
				}
			}
		}
		local61 = local20 * 192;
		if (local61 > 98048) {
			local61 = 98048;
		}
		if (local61 < 32768) {
			local61 = 32768;
		}
		if (Static152.anInt3230 < local61) {
			Static152.anInt3230 += (local61 - Static152.anInt3230) / 24;
		} else if (Static152.anInt3230 > local61) {
			Static152.anInt3230 += (local61 - Static152.anInt3230) / 80;
			return;
		}
	}
}
