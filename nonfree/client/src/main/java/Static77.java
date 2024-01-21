import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "[[B")
	public static byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!mf", name = "h", descriptor = "Lclient!fd;")
	public static Class1_Sub9 aClass1_Sub9_12;

	@OriginalMember(owner = "client!mf", name = "j", descriptor = "[S")
	public static short[] aShortArray10;

	@OriginalMember(owner = "client!mf", name = "x", descriptor = "[I")
	public static int[] anIntArray243;

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "Lclient!id;")
	private static Class34 aClass34_1024 = Static9.method266("Your account has been disabled)3");

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
	public static int anInt2077 = 0;

	@OriginalMember(owner = "client!mf", name = "k", descriptor = "Lclient!qd;")
	public static Class63 aClass63_14 = new Class63(50);

	@OriginalMember(owner = "client!mf", name = "l", descriptor = "[I")
	public static int[] anIntArray242 = new int[200];

	@OriginalMember(owner = "client!mf", name = "o", descriptor = "Lclient!id;")
	private static Class34 aClass34_1026 = Static9.method266("Connection lost");

	@OriginalMember(owner = "client!mf", name = "m", descriptor = "Lclient!id;")
	public static Class34 aClass34_1025 = aClass34_1026;

	@OriginalMember(owner = "client!mf", name = "u", descriptor = "Lclient!id;")
	public static Class34 aClass34_1027 = Static9.method266("mapmarker");

	@OriginalMember(owner = "client!mf", name = "v", descriptor = "Lclient!id;")
	public static Class34 aClass34_1028 = aClass34_1024;

	@OriginalMember(owner = "client!mf", name = "w", descriptor = "I")
	public static int anInt2084 = 0;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BJ)Lclient!id;")
	public static Class34 method1358(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(32) long local32 = arg0;
			@Pc(34) int local34 = 0;
			while (local32 != 0L) {
				local34++;
				local32 /= 37L;
			}
			@Pc(50) byte[] local50 = new byte[local34];
			while (arg0 != 0L) {
				@Pc(54) long local54 = arg0;
				arg0 /= 37L;
				local34--;
				local50[local34] = Static43.aByteArray17[(int) (local54 - arg0 * 37L)];
			}
			@Pc(81) Class34 local81 = new Class34();
			local81.aByteArray20 = local50;
			local81.anInt1553 = local50.length;
			return local81;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)V")
	public static void method1359() {
		anIntArray243 = null;
		anIntArray242 = null;
		aClass34_1026 = null;
		aClass34_1027 = null;
		aClass34_1028 = null;
		aClass34_1024 = null;
		aClass63_14 = null;
		aByteArrayArray7 = null;
		aClass1_Sub9_12 = null;
		aShortArray10 = null;
		aClass34_1025 = null;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)Lclient!ae;")
	public static Class1_Sub1_Sub2_Sub1 method1360() {
		@Pc(9) Class1_Sub1_Sub2_Sub1 local9 = new Class1_Sub1_Sub2_Sub1();
		local9.anInt332 = Static87.anIntArray297[0];
		local9.anInt335 = Static78.anIntArray244[0];
		local9.anInt333 = Static123.anInt2913;
		local9.anInt334 = Static116.anIntArray351[0];
		local9.anInt336 = Static91.anIntArray298[0];
		local9.anInt337 = Static78.anInt2092;
		@Pc(46) int local46 = local9.anInt334 * local9.anInt336;
		local9.anIntArray26 = new int[local46];
		@Pc(54) byte[] local54 = aByteArrayArray7[0];
		for (@Pc(56) int local56 = 0; local56 < local46; local56++) {
			local9.anIntArray26[local56] = Static32.anIntArray150[local54[local56] & 0xFF];
		}
		Static5.method212();
		return local9;
	}
}
