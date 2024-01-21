import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
	public static int anInt1641 = 1;

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "Lclient!na;")
	public static Class53 aClass53_720 = Static109.method1737("backvmid2");

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "Lclient!na;")
	private static Class53 aClass53_721 = Static109.method1737("Please try again)3");

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "Lclient!na;")
	public static Class53 aClass53_722 = aClass53_721;

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "[I")
	public static int[] anIntArray199 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!kf", name = "j", descriptor = "Lclient!na;")
	public static Class53 aClass53_723 = Static109.method1737("invback");

	@OriginalMember(owner = "client!kf", name = "s", descriptor = "Lclient!na;")
	public static Class53 aClass53_724 = Static109.method1737("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!kf", name = "u", descriptor = "Lclient!na;")
	public static Class53 aClass53_725 = Static109.method1737("Wen m-Ochten Sie von der Liste entfernen?");

	@OriginalMember(owner = "client!kf", name = "v", descriptor = "Lclient!na;")
	public static Class53 aClass53_726 = Static109.method1737("T");

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)Z")
	public static boolean method1113(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0 && Static82.anInt989 == arg1) {
			return true;
		} else if (arg0 == 1 && arg1 == Static60.anInt1556) {
			return true;
		} else {
			return (arg0 == 2 || arg0 == 3) && arg1 == Static39.anInt1178;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IB)I")
	public static int method1114(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x3F;
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V")
	public static void method1115() {
		aClass53_725 = null;
		aClass53_726 = null;
		aClass53_724 = null;
		aClass53_721 = null;
		aClass53_723 = null;
		anIntArray199 = null;
		aClass53_720 = null;
		aClass53_722 = null;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)V")
	public static void method1116(@OriginalArg(0) int arg0) {
		if (!Static98.method1633(arg0)) {
			return;
		}
		@Pc(14) Class3_Sub1_Sub15[] local14 = Static107.aClass3_Sub1_Sub15ArrayArray1[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class3_Sub1_Sub15 local22 = local14[local16];
			if (local22 != null) {
				local22.anInt2698 = 0;
				local22.anInt2697 = 0;
			}
		}
	}
}
