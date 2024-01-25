import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!gu", name = "M", descriptor = "Z")
	private static boolean aBoolean168;

	@OriginalMember(owner = "client!gu", name = "N", descriptor = "Z")
	private static boolean aBoolean169;

	@OriginalMember(owner = "client!gu", name = "O", descriptor = "I")
	private static int anInt1671;

	@OriginalMember(owner = "client!gu", name = "P", descriptor = "I")
	private static int anInt1672;

	@OriginalMember(owner = "client!gu", name = "Q", descriptor = "I")
	private static int anInt1673;

	@OriginalMember(owner = "client!gu", name = "R", descriptor = "Z")
	private static boolean aBoolean170;

	@OriginalMember(owner = "client!gu", name = "S", descriptor = "Z")
	private static boolean aBoolean171;

	@OriginalMember(owner = "client!gu", name = "T", descriptor = "Z")
	private static boolean aBoolean172;

	@OriginalMember(owner = "client!gu", name = "U", descriptor = "Z")
	private static boolean aBoolean173;

	@OriginalMember(owner = "client!gu", name = "V", descriptor = "I")
	private static int anInt1674;

	@OriginalMember(owner = "client!gu", name = "W", descriptor = "Z")
	private static boolean aBoolean174;

	@OriginalMember(owner = "client!gu", name = "X", descriptor = "I")
	private static int anInt1675;

	@OriginalMember(owner = "client!gu", name = "Y", descriptor = "I")
	private static int anInt1676;

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "[I")
	public static final int[] anIntArray110 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILclient!pi;IB)V")
	public static void method1439(@OriginalArg(0) int arg0, @OriginalArg(1) Class11_Sub1_Sub1_Sub2 arg1, @OriginalArg(2) int arg2) {
		if (arg0 == arg1.anInt7387 && arg0 != -1) {
			@Pc(95) Class16 local95 = Static114.aClass156_2.method4101(arg0);
			@Pc(98) int local98 = local95.anInt581;
			if (local98 == 1) {
				arg1.anInt7368 = 0;
				arg1.anInt7361 = 0;
				arg1.anInt7401 = arg2;
				arg1.anInt7414 = 0;
				arg1.anInt7371 = 1;
				Static360.method5794(arg1.anInt7347, local95, arg1.anInt7351, arg1.aByte77, arg1.anInt7361, Static350.aClass11_Sub1_Sub1_Sub2_4 == arg1);
			}
			if (local98 == 2) {
				arg1.anInt7368 = 0;
			}
		} else if (arg0 == -1 || arg1.anInt7387 == -1 || Static114.aClass156_2.method4101(arg0).anInt582 >= Static114.aClass156_2.method4101(arg1.anInt7387).anInt582) {
			arg1.anInt7401 = arg2;
			arg1.anInt7368 = 0;
			arg1.anInt7361 = 0;
			arg1.anInt7435 = arg1.anInt7432;
			arg1.anInt7387 = arg0;
			arg1.anInt7414 = 0;
			arg1.anInt7371 = 1;
			if (arg1.anInt7387 != -1) {
				Static360.method5794(arg1.anInt7347, Static114.aClass156_2.method4101(arg1.anInt7387), arg1.anInt7351, arg1.aByte77, arg1.anInt7361, Static350.aClass11_Sub1_Sub1_Sub2_4 == arg1);
			}
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZII)Z")
	public static boolean method1443(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIZ)V")
	public static void method1448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class6_Sub4_Sub6 local8 = Static68.method1408(15, 0);
		local8.method3826();
		local8.anInt4399 = arg0;
		local8.anInt4403 = arg1;
	}
}
