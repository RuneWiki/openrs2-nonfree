import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!ig", name = "j", descriptor = "[[B")
	public static byte[][] aByteArrayArray12;

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_104 = new Class62("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_105 = new Class62("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "[Lclient!ul;")
	public static final Class231[] aClass231Array1 = new Class231[6];

	@OriginalMember(owner = "client!ig", name = "h", descriptor = "[I")
	public static final int[] anIntArray241 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(BI)Lclient!pc;")
	public static Class2_Sub7_Sub14 method2641(@OriginalArg(1) int arg0) {
		@Pc(17) Class2_Sub7_Sub14 local17 = (Class2_Sub7_Sub14) Static284.aClass105_9.method2632((long) arg0);
		if (local17 != null) {
			return local17;
		}
		@Pc(34) byte[] local34;
		if (arg0 < 32768) {
			local34 = Static102.aClass83_49.method1968(arg0, 0);
		} else {
			local34 = Static257.aClass83_89.method1968(arg0 & 0x7FFF, 0);
		}
		local17 = new Class2_Sub7_Sub14();
		if (local34 != null) {
			local17.method4447(new Class2_Sub24(local34));
		}
		if (arg0 >= 32768) {
			local17.method4454();
		}
		Static284.aClass105_9.method2630(local17, (long) arg0);
		return local17;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!bh;B)V")
	public static void method2642(@OriginalArg(0) Class7_Sub2 arg0) {
		arg0.aClass1_Sub2_Sub1_1 = null;
		if (Static129.anInt2817 < 20) {
			Static165.aClass199_3.method4898(arg0);
			Static129.anInt2817++;
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZI)Z")
	public static boolean method2643(@OriginalArg(0) boolean arg0) {
		@Pc(13) boolean local13 = Static383.aClass48_9.method2542();
		if (local13 == arg0) {
			return true;
		}
		if (!arg0) {
			Static383.aClass48_9.method2486();
		} else if (!Static383.aClass48_9.method2450()) {
			arg0 = false;
		}
		if (local13 == arg0) {
			return false;
		} else {
			Static220.aBoolean317 = arg0;
			Static237.method4219(Static154.aClass123_2);
			return true;
		}
	}
}
