import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ah", name = "x", descriptor = "Lclient!nb;")
	public static Class1_Sub1_Sub12_Sub1 aClass1_Sub1_Sub12_Sub1_1;

	@OriginalMember(owner = "client!ah", name = "y", descriptor = "J")
	public static long aLong10;

	@OriginalMember(owner = "client!ah", name = "w", descriptor = "Lclient!ed;")
	public static Class23 aClass23_119 = Static169.method2903("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

	@OriginalMember(owner = "client!ah", name = "z", descriptor = "Z")
	public static boolean aBoolean17 = false;

	@OriginalMember(owner = "client!ah", name = "B", descriptor = "[Z")
	public static boolean[] aBooleanArray3 = new boolean[100];

	@OriginalMember(owner = "client!ah", name = "C", descriptor = "I")
	public static int anInt347 = 0;

	@OriginalMember(owner = "client!ah", name = "D", descriptor = "[I")
	public static int[] anIntArray47 = new int[] { 0, 1, -2, 0, 0, 0, 0, 6, 1, 0, 0, 0, 2, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, -2, 0, 6, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 2, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 2, 0, 6, 0, 0, 0, 0, 0, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 6, 0, 3, 0, 0, -2, 20, 0, 2, 2, 0, 0, 0, 0, 0, 3, 0, 0, 2, 0, 15, 0, 0, 5, -1, -2, -2, 0, 0, 0, 14, 6, -1, 0, -1, -1, 0, 0, 0, 0, 12, 0, 10, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 5, 4, 0, 24, 5, 0, 4, 0, 0, 0, 0, 0, 1, 0, 0, -2, 0, 0, 0, -2, 4, 5, 0, 7, 4, 0, 0, 0, 6, 0, 0, 8, 0, 0, 0, 0, 0, 6, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 11, 0, 0, 0, 7, 0, 6, 0, 0, 6, 0, 0, 0, 3, 0, 3, 0, -2, 0, 10, 0, 0, -2, 0, 0, 4, 0, 6, 0, 0, 0, 0, 0, 4 };

	@OriginalMember(owner = "client!ah", name = "F", descriptor = "[I")
	public static int[] anIntArray48 = new int[50];

	@OriginalMember(owner = "client!ah", name = "H", descriptor = "I")
	public static int anInt349 = -1;

	@OriginalMember(owner = "client!ah", name = "I", descriptor = "Z")
	public static boolean aBoolean18 = false;

	@OriginalMember(owner = "client!ah", name = "K", descriptor = "Lclient!ed;")
	public static Class23 aClass23_120 = Static169.method2903("W-=hlen Sie eine Welt");

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(JB)Lclient!ed;")
	public static Class23 method183(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(34) int local34 = 0;
			@Pc(36) long local36 = arg0;
			while (local36 != 0L) {
				local36 /= 37L;
				local34++;
			}
			@Pc(50) byte[] local50 = new byte[local34];
			while (arg0 != 0L) {
				@Pc(54) long local54 = arg0;
				arg0 /= 37L;
				local34--;
				local50[local34] = Static116.aByteArray27[(int) (local54 - arg0 * 37L)];
			}
			@Pc(79) Class23 local79 = new Class23();
			local79.aByteArray10 = local50;
			local79.anInt1053 = local50.length;
			return local79;
		}
	}

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "(I)V")
	public static void method184() {
		aClass23_120 = null;
		anIntArray47 = null;
		aClass1_Sub1_Sub12_Sub1_1 = null;
		anIntArray48 = null;
		aClass23_119 = null;
		aBooleanArray3 = null;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V")
	public static void method185() {
		Static27.aClass79_3.method2659();
	}
}
