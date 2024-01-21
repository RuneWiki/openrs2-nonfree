import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!nf", name = "mb", descriptor = "[Lclient!bg;")
	public static Class2_Sub2_Sub3_Sub2[] aClass2_Sub2_Sub3_Sub2Array8;

	@OriginalMember(owner = "client!nf", name = "bb", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1019 = Static146.method2172("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!nf", name = "db", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1020 = Static146.method2172("RuneScape wurde aktualisiert(Q");

	@OriginalMember(owner = "client!nf", name = "gb", descriptor = "[I")
	public static int[] anIntArray416 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!nf", name = "hb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1021 = aClass77_1019;

	@OriginalMember(owner = "client!nf", name = "jb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1022 = Static146.method2172("<col=ff0000>");

	@OriginalMember(owner = "client!nf", name = "kb", descriptor = "[Lclient!sg;")
	public static Class77[] aClass77Array17 = new Class77[100];

	@OriginalMember(owner = "client!nf", name = "lb", descriptor = "I")
	public static int anInt2648 = -1;

	@OriginalMember(owner = "client!nf", name = "pb", descriptor = "[I")
	public static int[] anIntArray418 = new int[500];

	@OriginalMember(owner = "client!nf", name = "rb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1023 = Static146.method2172("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
	public static void method1881() {
		aClass77_1020 = null;
		aClass77Array17 = null;
		anIntArray416 = null;
		aClass77_1022 = null;
		anIntArray418 = null;
		aClass2_Sub2_Sub3_Sub2Array8 = null;
		aClass77_1019 = null;
		aClass77_1021 = null;
		aClass77_1023 = null;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IJ)Lclient!sg;")
	public static Class77 method1884(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(27) int local27 = 0;
			@Pc(29) long local29 = arg0;
			while (local29 != 0L) {
				local29 /= 37L;
				local27++;
			}
			@Pc(42) byte[] local42 = new byte[local27];
			while (arg0 != 0L) {
				@Pc(45) long local45 = arg0;
				arg0 /= 37L;
				local27--;
				local42[local27] = Static2.aByteArray1[(int) (local45 - arg0 * 37L)];
			}
			@Pc(72) Class77 local72 = new Class77();
			local72.aByteArray46 = local42;
			local72.anInt3606 = local42.length;
			return local72;
		}
	}
}
