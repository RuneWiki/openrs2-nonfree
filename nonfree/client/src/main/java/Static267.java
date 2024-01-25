import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!pa", name = "U", descriptor = "[[I")
	public static int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!pa", name = "W", descriptor = "Lclient!km;")
	public static Class82 aClass82_6;

	@OriginalMember(owner = "client!pa", name = "X", descriptor = "[Z")
	public static boolean[] aBooleanArray110;

	@OriginalMember(owner = "client!pa", name = "Y", descriptor = "I")
	public static int anInt4716;

	@OriginalMember(owner = "client!pa", name = "Z", descriptor = "Lclient!qr;")
	public static Class12_Sub1_Sub2_Sub2 aClass12_Sub1_Sub2_Sub2_1;

	@OriginalMember(owner = "client!pa", name = "ab", descriptor = "Lclient!dc;")
	public static Class45 aClass45_2;

	@OriginalMember(owner = "client!pa", name = "L", descriptor = "J")
	public static long aLong156 = -1L;

	@OriginalMember(owner = "client!pa", name = "P", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_142 = new Class41(61, 2);

	@OriginalMember(owner = "client!pa", name = "Q", descriptor = "I")
	public static int anInt4711 = 0;

	@OriginalMember(owner = "client!pa", name = "V", descriptor = "I")
	public static int anInt4715 = 0;

	@OriginalMember(owner = "client!pa", name = "bb", descriptor = "Z")
	public static boolean aBoolean346 = true;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IZILclient!fc;IB)V")
	public static void method4129(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class71 arg2) {
		Static261.anInt4643 = arg0;
		Static328.anInt5775 = arg1;
		Static238.anInt4359 = 0;
		Static35.anInt745 = 1;
		Static48.anInt940 = 10000;
		Static142.aBoolean242 = false;
		Static48.aClass71_15 = arg2;
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(III)I")
	public static int method4131(@OriginalArg(0) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(41) int local41 = (arg0 & 0x7F) * 96 >> 7;
			if (local41 < 2) {
				local41 = 2;
			} else if (local41 > 126) {
				local41 = 126;
			}
			return (arg0 & 0xFF80) + local41;
		}
	}

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "(I)Lclient!ba;")
	public static Class2_Sub1_Sub2 method4132() {
		@Pc(16) Class2_Sub1_Sub2 local16 = (Class2_Sub1_Sub2) Static8.aClass174_1.method4102();
		if (local16 != null) {
			local16.method5745();
			local16.method5748();
			return local16;
		}
		do {
			local16 = (Class2_Sub1_Sub2) Static258.aClass174_11.method4102();
			if (local16 == null) {
				return null;
			}
			if (local16.method408() > Static51.method979()) {
				return null;
			}
			local16.method5745();
			local16.method5748();
		} while ((Long.MIN_VALUE & local16.aLong209) == 0L);
		return local16;
	}
}
