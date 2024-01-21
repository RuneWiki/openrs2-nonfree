import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!mc", name = "z", descriptor = "I")
	public static int anInt3053;

	@OriginalMember(owner = "client!mc", name = "L", descriptor = "I")
	public static int anInt3059;

	@OriginalMember(owner = "client!mc", name = "v", descriptor = "I")
	public static int anInt3051 = 0;

	@OriginalMember(owner = "client!mc", name = "C", descriptor = "Lclient!rf;")
	private static Class70 aClass70_993 = Static49.method1293("Malformed login packet)3");

	@OriginalMember(owner = "client!mc", name = "w", descriptor = "Lclient!rf;")
	public static Class70 aClass70_992 = aClass70_993;

	@OriginalMember(owner = "client!mc", name = "M", descriptor = "Lclient!rf;")
	private static Class70 aClass70_996 = Static49.method1293("You have only just left another world)3");

	@OriginalMember(owner = "client!mc", name = "I", descriptor = "Lclient!rf;")
	public static Class70 aClass70_994 = aClass70_996;

	@OriginalMember(owner = "client!mc", name = "K", descriptor = "Lclient!rf;")
	public static Class70 aClass70_995 = Static49.method1293("Lade)3)3)3");

	@OriginalMember(owner = "client!mc", name = "N", descriptor = "I")
	public static int anInt3060 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IB)Z")
	public static boolean method2265(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(19) int local19 = Static20.aShortArray7[arg0];
		if (local19 >= 2000) {
			local19 -= 2000;
		}
		return local19 == 1003;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)V")
	public static void method2266() {
		aClass70_992 = null;
		aClass70_995 = null;
		aClass70_993 = null;
		aClass70_994 = null;
		aClass70_996 = null;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(JZ)Lclient!rf;")
	public static Class70 method2267(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(27) int local27 = 0;
			for (@Pc(29) long local29 = arg0; local29 != 0L; local29 /= 37L) {
				local27++;
			}
			@Pc(43) byte[] local43 = new byte[local27];
			while (arg0 != 0L) {
				@Pc(47) long local47 = arg0;
				arg0 /= 37L;
				local27--;
				local43[local27] = Static16.aByteArray5[(int) (local47 - arg0 * 37L)];
			}
			@Pc(79) Class70 local79 = new Class70();
			local79.aByteArray46 = local43;
			local79.anInt3915 = local43.length;
			return local79;
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(III)V")
	public static void method2268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static90.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < local7.anInt2953; local12++) {
			@Pc(18) Class53 local18 = local7.aClass53Array2[local12];
			if ((local18.aLong99 >> 29 & 0x3L) == 2L && local18.anInt3109 == arg1 && local18.anInt3107 == arg2) {
				Static150.method3044(local18);
				return;
			}
		}
	}
}
