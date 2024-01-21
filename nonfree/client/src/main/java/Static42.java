import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "Lclient!ke;")
	public static Class43 aClass43_11;

	@OriginalMember(owner = "client!eh", name = "m", descriptor = "I")
	public static int anInt1180;

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
	public static int anInt1175 = 1;

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
	public static int anInt1177 = 0;

	@OriginalMember(owner = "client!eh", name = "h", descriptor = "Lclient!sa;")
	public static Class74 aClass74_4 = new Class74(4096);

	@OriginalMember(owner = "client!eh", name = "j", descriptor = "Lclient!sg;")
	private static Class77 aClass77_472 = Static146.method2172("Members object");

	@OriginalMember(owner = "client!eh", name = "k", descriptor = "[I")
	public static int[] anIntArray184 = new int[4000];

	@OriginalMember(owner = "client!eh", name = "l", descriptor = "Lclient!sg;")
	public static Class77 aClass77_473 = aClass77_472;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Z)V")
	public static void method810() {
		Static169.aClass82_60.method2698();
		Static84.aClass82_46.method2698();
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V")
	public static void method811() {
		Static72.anInt1932 = 0;
		Static174.anInt4449 = 0;
		Static123.method2156();
		Static72.method1390();
		Static46.method842();
		@Pc(27) int local27;
		for (@Pc(21) int local21 = 0; local21 < Static72.anInt1932; local21++) {
			local27 = Static33.anIntArray149[local21];
			if (Static48.aClass2_Sub2_Sub1_Sub6_Sub2Array1[local27].anInt4401 != Static143.anInt3513) {
				Static48.aClass2_Sub2_Sub1_Sub6_Sub2Array1[local27].aClass2_Sub2_Sub16_1 = null;
				Static48.aClass2_Sub2_Sub1_Sub6_Sub2Array1[local27] = null;
			}
		}
		if (Static74.aClass2_Sub18_Sub1_1.anInt3423 != Static25.anInt731) {
			throw new RuntimeException("gnp1 pos:" + Static74.aClass2_Sub18_Sub1_1.anInt3423 + " psize:" + Static25.anInt731);
		}
		for (local27 = 0; local27 < Static145.anInt3533; local27++) {
			if (Static48.aClass2_Sub2_Sub1_Sub6_Sub2Array1[Static160.anIntArray643[local27]] == null) {
				throw new RuntimeException("gnp2 pos:" + local27 + " size:" + Static145.anInt3533);
			}
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
	public static void method812() {
		aClass74_4 = null;
		anIntArray184 = null;
		aClass77_473 = null;
		aClass77_472 = null;
		aClass43_11 = null;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIII)I")
	public static int method813(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 > 179) {
			arg2 /= 2;
		}
		if (arg1 > 192) {
			arg2 /= 2;
		}
		if (arg1 > 217) {
			arg2 /= 2;
		}
		if (arg1 > 243) {
			arg2 /= 2;
		}
		return arg1 / 2 + (arg0 / 4 << 10) + (arg2 / 32 << 7);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method814(@OriginalArg(1) int arg0) {
		@Pc(19) byte[] local19;
		if (arg0 == 100 && Static159.anInt3920 > 0) {
			local19 = Static97.aByteArrayArray6[--Static159.anInt3920];
			Static97.aByteArrayArray6[Static159.anInt3920] = null;
			return local19;
		} else if (arg0 == 5000 && Static85.anInt2203 > 0) {
			local19 = Static158.aByteArrayArray9[--Static85.anInt2203];
			Static158.aByteArrayArray9[Static85.anInt2203] = null;
			return local19;
		} else if (arg0 == 30000 && Static130.anInt3149 > 0) {
			local19 = Static83.aByteArrayArray5[--Static130.anInt3149];
			Static83.aByteArrayArray5[Static130.anInt3149] = null;
			return local19;
		} else {
			return new byte[arg0];
		}
	}
}
