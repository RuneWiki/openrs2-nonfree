import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!la", name = "a", descriptor = "I")
	public static int anInt2409 = 0;

	@OriginalMember(owner = "client!la", name = "b", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_689 = Static181.method2795("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!la", name = "g", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_691 = Static181.method2795("Examine");

	@OriginalMember(owner = "client!la", name = "e", descriptor = "Lclient!qe;")
	public static Class83 aClass83_690 = aClass83_691;

	@OriginalMember(owner = "client!la", name = "f", descriptor = "[I")
	public static final int[] anIntArray237 = new int[4000];

	@OriginalMember(owner = "client!la", name = "h", descriptor = "Lclient!ae;")
	public static Class5 aClass5_11 = null;

	@OriginalMember(owner = "client!la", name = "j", descriptor = "Lclient!s;")
	public static final Class86 aClass86_30 = new Class86(64);

	@OriginalMember(owner = "client!la", name = "k", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_692 = Static181.method2795("p11_full");

	@OriginalMember(owner = "client!la", name = "l", descriptor = "I")
	public static int anInt2413 = 0;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BI)[B")
	public static synchronized byte[] method1812(@OriginalArg(1) int arg0) {
		@Pc(27) byte[] local27;
		if (arg0 == 100 && Static153.anInt3340 > 0) {
			local27 = Static127.aByteArrayArray12[--Static153.anInt3340];
			Static127.aByteArrayArray12[Static153.anInt3340] = null;
			return local27;
		} else if (arg0 == 5000 && Static158.anInt3192 > 0) {
			local27 = Static37.aByteArrayArray3[--Static158.anInt3192];
			Static37.aByteArrayArray3[Static158.anInt3192] = null;
			return local27;
		} else if (arg0 == 30000 && Static50.anInt1305 > 0) {
			local27 = Static162.aByteArrayArray19[--Static50.anInt1305];
			Static162.aByteArrayArray19[Static50.anInt1305] = null;
			return local27;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IB)V")
	public static void method1813(@OriginalArg(0) int arg0) {
		Static43.anInt1142 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V")
	public static void method1814() {
		Static210.anInt4184 &= 0x7FF;
		if (Static153.anInt3302 < 128) {
			Static153.anInt3302 = 128;
		}
		if (Static153.anInt3302 > 383) {
			Static153.anInt3302 = 383;
		}
		@Pc(25) int local25 = Static204.anInt4028 >> 7;
		@Pc(36) int local36 = Static208.anInt4121 >> 7;
		@Pc(42) int local42 = Static177.method2711(Static204.anInt4028, Static43.anInt1126, Static208.anInt4121);
		@Pc(44) int local44 = 0;
		@Pc(64) int local64;
		if (local25 > 3 && local36 > 3 && local25 < 100 && local36 < 100) {
			for (local64 = local25 - 4; local64 <= local25 + 4; local64++) {
				for (@Pc(70) int local70 = local36 - 4; local70 <= local36 + 4; local70++) {
					@Pc(74) int local74 = Static43.anInt1126;
					if (local74 < 3 && (Static9.aByteArrayArrayArray7[1][local64][local70] & 0x2) == 2) {
						local74++;
					}
					@Pc(101) int local101 = local42 - Static170.anIntArrayArrayArray10[local74][local64][local70];
					if (local101 > local44) {
						local44 = local101;
					}
				}
			}
		}
		local64 = local44 * 192;
		if (local64 > 98048) {
			local64 = 98048;
		}
		if (local64 < 32768) {
			local64 = 32768;
		}
		if (Static110.anInt2550 < local64) {
			Static110.anInt2550 += (local64 - Static110.anInt2550) / 24;
		} else if (local64 < Static110.anInt2550) {
			Static110.anInt2550 += (local64 - Static110.anInt2550) / 80;
			return;
		}
	}
}
