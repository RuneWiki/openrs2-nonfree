import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
	public static int anInt3139;

	@OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
	public static int anInt3140;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "Lclient!ai;")
	public static Class6 aClass6_909 = Static38.method685("Lade Texturen )2 ");

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "Lclient!dd;")
	public static Class17 aClass17_21 = new Class17(5);

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
	public static int anInt3134 = 0;

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
	public static int anInt3135 = 500;

	@OriginalMember(owner = "client!qd", name = "h", descriptor = "Ljava/lang/Object;")
	public static Object anObject4 = new Object();

	@OriginalMember(owner = "client!qd", name = "k", descriptor = "[I")
	public static int[] anIntArray287 = new int[] { 0, 6, 14, 0, 0, 0, 0, 2, 0, 3, 0, 15, 0, 11, 0, -1, 0, 0, 6, 6, 0, 5, 0, 0, 0, 2, 0, 0, 1, 4, 0, 0, 6, 0, 2, 0, 6, 0, -2, 0, 0, 6, 0, 0, 0, 10, 0, 0, 0, 0, -1, 0, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, -2, 0, 0, 4, 0, 5, 0, 0, 0, 2, 0, 0, 0, 0, 5, 0, 0, 0, 0, 6, 0, 0, 0, 0, 10, -1, 0, 0, 6, 5, 0, 0, 0, 0, 0, 0, 0, -2, 6, 6, 0, 8, 20, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 12, -2, 0, 0, 0, 0, 0, -2, 0, -2, 11, 6, 0, 0, 4, 0, 6, 0, 0, 3, 0, 0, 4, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, -2, -2, 0, 0, 0, -1, 1, -1, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 3, 0, 0, 2, 0, 0, 7, 0, 4, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 8, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, -2, 0, 24, 0, 0, 0, 4, 0, 0, 0 };

	@OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
	public static int anInt3141 = 0;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)Z")
	public static boolean method2096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 >> arg1 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
	public static void method2097() {
		Static123.method1925();
		Static111.method1783();
		Static28.method514();
		Static97.method1574();
		Static182.method2819();
		Static64.method1014();
		Static110.method1762();
		Static127.method1967();
		Static50.method893();
		Static42.method833();
		Static59.method979();
		Static28.method513();
		((Class56) Static100.anInterface1_2).method1724();
		Static37.aClass17_6.method509();
		Static170.aClass10_Sub1_18.method1590();
		Static152.aClass10_Sub1_16.method1590();
		Static89.aClass10_Sub1_10.method1590();
		Static136.aClass10_Sub1_14.method1590();
		Static165.aClass10_Sub1_17.method1590();
		Static5.aClass10_Sub1_2.method1590();
		Static58.aClass10_Sub1_8.method1590();
		Static132.aClass10_Sub1_13.method1590();
		Static6.aClass10_Sub1_7.method1590();
		Static176.aClass10_Sub1_20.method1590();
		Static124.aClass10_Sub1_11.method1590();
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZIII)Lclient!ai;")
	public static Class6 method2098(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(28) int local28 = 1;
		@Pc(32) int local32 = arg1 / 10;
		while (local32 != 0) {
			local32 /= 10;
			local28++;
		}
		@Pc(43) int local43 = local28;
		if (arg1 < 0 || arg0) {
			local43 = local28 + 1;
		}
		@Pc(54) byte[] local54 = new byte[local43];
		if (arg1 < 0) {
			local54[0] = 45;
		} else if (arg0) {
			local54[0] = 43;
		}
		for (@Pc(73) int local73 = 0; local73 < local28; local73++) {
			@Pc(79) int local79 = arg1 % 10;
			arg1 /= 10;
			if (local79 < 0) {
				local79 = -local79;
			}
			if (local79 > 9) {
				local79 += 39;
			}
			local54[local43 - local73 - 1] = (byte) (local79 + 48);
		}
		@Pc(122) Class6 local122 = new Class6();
		local122.anInt165 = local43;
		local122.aByteArray2 = local54;
		return local122;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V")
	public static void method2099() {
		aClass6_909 = null;
		aClass17_21 = null;
		anObject4 = null;
		anIntArray287 = null;
	}
}
