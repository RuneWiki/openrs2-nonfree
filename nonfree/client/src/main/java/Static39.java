import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!di", name = "L", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1527 = Static151.method2243("Allocating memory");

	@OriginalMember(owner = "client!di", name = "u", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1525 = aClass62_1527;

	@OriginalMember(owner = "client!di", name = "y", descriptor = "I")
	public static int anInt4448 = 0;

	@OriginalMember(owner = "client!di", name = "A", descriptor = "I")
	public static int anInt4450 = 20;

	@OriginalMember(owner = "client!di", name = "D", descriptor = "[I")
	public static final int[] anIntArray400 = new int[100];

	@OriginalMember(owner = "client!di", name = "H", descriptor = "I")
	public static int anInt4456 = 0;

	@OriginalMember(owner = "client!di", name = "I", descriptor = "I")
	public static int anInt4457 = 0;

	@OriginalMember(owner = "client!di", name = "J", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1526 = Static151.method2243("<col=00ff80>");

	@OriginalMember(owner = "client!di", name = "P", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1528 = Static151.method2243("Abbrechen");

	@OriginalMember(owner = "client!di", name = "Q", descriptor = "I")
	public static int anInt4460 = 0;

	@OriginalMember(owner = "client!di", name = "R", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1529 = Static151.method2243("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ILclient!pb;I)Z")
	public static boolean method3119(@OriginalArg(0) int arg0, @OriginalArg(1) Class71 arg1) {
		@Pc(8) byte[] local8 = arg1.method2121(arg0);
		if (local8 == null) {
			return false;
		} else {
			Static91.method1391(local8);
			return true;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(BJ)Lclient!mb;")
	public static Class62 method3121(@OriginalArg(1) long arg0) {
		return Static10.method177(arg0);
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(Z)V")
	public static void method3126() {
		@Pc(15) int local15;
		for (@Pc(7) int local7 = -1; local7 < Static145.anInt3126; local7++) {
			if (local7 == -1) {
				local15 = 2047;
			} else {
				local15 = Static28.anIntArray60[local7];
			}
			@Pc(25) Class7_Sub2_Sub2 local25 = Static62.aClass7_Sub2_Sub2Array1[local15];
			if (local25 != null && local25.anInt3090 > 0) {
				local25.anInt3090--;
				if (local25.anInt3090 == 0) {
					local25.aClass62_1066 = null;
				}
			}
		}
		for (local15 = 0; local15 < Static118.anInt2607; local15++) {
			@Pc(61) int local61 = Static199.anIntArray373[local15];
			@Pc(65) Class7_Sub2_Sub1 local65 = Static9.aClass7_Sub2_Sub1Array1[local61];
			if (local65 != null && local65.anInt3090 > 0) {
				local65.anInt3090--;
				if (local65.anInt3090 == 0) {
					local65.aClass62_1066 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ILclient!pb;)V")
	public static void method3131(@OriginalArg(1) Class71 arg0) {
		Static95.aClass71_18 = arg0;
	}
}
