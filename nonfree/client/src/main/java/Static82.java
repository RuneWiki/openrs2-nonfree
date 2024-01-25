import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!cu", name = "f", descriptor = "Lclient!gja;")
	public static Class134 aClass134_1;

	@OriginalMember(owner = "client!cu", name = "d", descriptor = "I")
	public static int anInt1434 = 1;

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "Lclient!po;")
	public static final Class290 aClass290_1 = new Class290("runescape", "RuneScape", 0);

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "Z")
	public static boolean aBoolean119 = false;

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lclient!aba;I)Lclient!qea;")
	public static Class299 method1331(@OriginalArg(0) Class4_Sub1_Sub1 arg0) {
		@Pc(7) Class299 local7;
		if (Static90.aClass299_1 == null) {
			local7 = new Class299();
		} else {
			local7 = Static90.aClass299_1;
			Static90.aClass299_1 = Static90.aClass299_1.aClass299_3;
			Static347.anInt5726--;
			local7.aClass299_3 = null;
		}
		local7.aClass4_Sub1_Sub1_1 = arg0;
		return local7;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lclient!ha;IB)V")
	public static void method1333(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int arg1) {
		if (!Static429.aBoolean478 || !Static343.aBoolean381) {
			Static43.anInt712 = 0;
			return;
		}
		if (Static499.aBoolean539) {
			Static427.aLong200 = Static147.aClass77_1.method5828();
		}
		Static424.anInt6889 = 0;
		Static117.anInt1892 = 0;
		Static179.anInt3379 = 0;
		@Pc(37) int[] local37 = arg0.Y();
		Static403.anInt6805 = (int) ((float) local37[3] / 3.0F);
		Static29.anInt420 = (int) ((float) local37[2] / 3.0F);
		arg0.method8649(Static146.anIntArray138);
		if ((int) ((float) Static146.anIntArray138[0] / 3.0F) != Static504.anInt8078 || Static362.anInt9811 != (int) ((float) Static146.anIntArray138[1] / 3.0F)) {
			Static504.anInt8078 = (int) ((float) Static146.anIntArray138[0] / 3.0F);
			Static362.anInt9811 = (int) ((float) Static146.anIntArray138[1] / 3.0F);
			Static310.anInt5339 = Static362.anInt9811 >> 1;
			Static538.anInt8593 = Static504.anInt8078 >> 1;
			Static660.anIntArray613 = new int[Static504.anInt8078 * Static362.anInt9811];
		}
		Static394.aClass10_4 = arg0.method8595();
		Static43.anInt712 = 0;
		for (@Pc(118) int local118 = 0; local118 < Static115.anInt1870; local118++) {
			Static506.method6314(-10151, arg0, Static429.aClass250Array119[local118], arg1);
		}
		for (@Pc(139) int local139 = 0; local139 < Static609.anInt7074; local139++) {
			Static506.method6314(-10151, arg0, Static41.aClass250Array16[local139], arg1);
		}
		for (@Pc(164) int local164 = 0; local164 < Static412.anInt6979; local164++) {
			Static506.method6314(-10050 - 101, arg0, Static96.aClass250Array178[local164], arg1);
		}
		Static547.anInt8693 = 0;
		if (Static43.anInt712 > 0) {
			@Pc(197) int local197 = Static660.anIntArray613.length;
			@Pc(204) int local204 = local197 - local197 & 0x7;
			@Pc(206) int local206 = 0;
			while (local204 > local206) {
				Static660.anIntArray613[local206++] = Integer.MAX_VALUE;
				Static660.anIntArray613[local206++] = Integer.MAX_VALUE;
				Static660.anIntArray613[local206++] = Integer.MAX_VALUE;
				Static660.anIntArray613[local206++] = Integer.MAX_VALUE;
				Static660.anIntArray613[local206++] = Integer.MAX_VALUE;
				Static660.anIntArray613[local206++] = Integer.MAX_VALUE;
				Static660.anIntArray613[local206++] = Integer.MAX_VALUE;
				Static660.anIntArray613[local206++] = Integer.MAX_VALUE;
			}
			while (local197 > local206) {
				Static660.anIntArray613[local206++] = Integer.MAX_VALUE;
			}
			Static278.anInt4947 = 1;
			for (@Pc(281) int local281 = 0; local281 < Static43.anInt712; local281++) {
				@Pc(287) Class250 local287 = Static5.aClass250Array181[local281];
				Static550.method4219(local287.aShortArray106[1], local287.aShortArray106[0], local287.aShortArray104[1], local287.aShortArray104[3], local287.aShortArray105[1], local287.aShortArray104[0], local287.aShortArray105[3], local287.aShortArray105[0], local287.aShortArray106[3]);
				Static550.method4219(local287.aShortArray106[2], local287.aShortArray106[1], local287.aShortArray104[2], local287.aShortArray104[3], local287.aShortArray105[2], local287.aShortArray104[1], local287.aShortArray105[3], local287.aShortArray105[1], local287.aShortArray106[3]);
			}
			Static278.anInt4947 = 2;
		}
		if (Static499.aBoolean539) {
			Static381.aLong189 = Static147.aClass77_1.method5828() - Static427.aLong200;
		}
	}
}
