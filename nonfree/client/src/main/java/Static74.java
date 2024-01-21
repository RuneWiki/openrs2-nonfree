import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!na", name = "mb", descriptor = "I")
	public static int anInt951;

	@OriginalMember(owner = "client!na", name = "D", descriptor = "I")
	public static int anInt920 = 0;

	@OriginalMember(owner = "client!na", name = "G", descriptor = "I")
	public static int anInt923 = 0;

	@OriginalMember(owner = "client!na", name = "J", descriptor = "Lclient!je;")
	public static Class40 aClass40_518 = Static69.method1231("<col=80ff00>");

	@OriginalMember(owner = "client!na", name = "K", descriptor = "Lclient!je;")
	private static Class40 aClass40_519 = Static69.method1231("Bad session id)3");

	@OriginalMember(owner = "client!na", name = "cb", descriptor = "I")
	public static volatile int anInt942 = 0;

	@OriginalMember(owner = "client!na", name = "eb", descriptor = "Lclient!je;")
	public static Class40 aClass40_520 = aClass40_519;

	@OriginalMember(owner = "client!na", name = "kb", descriptor = "I")
	public static int anInt949 = 0;

	@OriginalMember(owner = "client!na", name = "lb", descriptor = "I")
	public static int anInt950 = 0;

	@OriginalMember(owner = "client!na", name = "tb", descriptor = "I")
	public static int anInt958 = -1;

	@OriginalMember(owner = "client!na", name = "Rb", descriptor = "Lclient!je;")
	public static Class40 aClass40_521 = Static69.method1231("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(III)V")
	public static void method627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static112.method1873(arg1)) {
			Static63.method280(Static45.aClass2_Sub13ArrayArray1[arg1], arg0);
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IJ)V")
	public static void method634(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < Static114.anInt2621; local14++) {
			if (Static88.aLongArray7[local14] == arg0) {
				Static114.anInt2621--;
				for (@Pc(38) int local38 = local14; local38 < Static114.anInt2621; local38++) {
					Static85.aClass40Array17[local38] = Static85.aClass40Array17[local38 + 1];
					Static39.anIntArray104[local38] = Static39.anIntArray104[local38 + 1];
					Static88.aLongArray7[local38] = Static88.aLongArray7[local38 + 1];
					Static3.anIntArray7[local38] = Static3.anIntArray7[local38 + 1];
				}
				Static21.anInt643 = Static70.anInt1886;
				Static57.aClass2_Sub9_Sub1_2.method673(20);
				Static57.aClass2_Sub9_Sub1_2.method647(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "j", descriptor = "(I)V")
	public static void method635() {
		aClass40_518 = null;
		aClass40_520 = null;
		aClass40_521 = null;
		aClass40_519 = null;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BI[BI)Lclient!je;")
	public static Class40 method651(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class40 local9 = new Class40();
		local9.aByteArray18 = new byte[arg0];
		local9.anInt1425 = 0;
		for (@Pc(25) int local25 = arg2; local25 < arg2 + arg0; local25++) {
			if (arg1[local25] != 0) {
				local9.aByteArray18[local9.anInt1425++] = arg1[local25];
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BLclient!je;)Z")
	public static boolean method654(@OriginalArg(1) Class40 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static75.anInt1945; local16++) {
			if (arg0.method984(Static56.aClass40Array5[local16])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!na", name = "k", descriptor = "(II)V")
	public static void method659(@OriginalArg(1) int arg0) {
		if (Static77.anInt2023 == 0) {
			Static129.aClass2_Sub5_Sub4_2.method1974(arg0);
		} else {
			Static26.anInt673 = arg0;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BJ)Lclient!je;")
	public static Class40 method665(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(29) int local29 = 0;
			@Pc(36) long local36 = arg0;
			while (local36 != 0L) {
				local36 /= 37L;
				local29++;
			}
			@Pc(50) byte[] local50 = new byte[local29];
			while (arg0 != 0L) {
				@Pc(54) long local54 = arg0;
				arg0 /= 37L;
				local29--;
				local50[local29] = Static11.aByteArray7[(int) (local54 - arg0 * 37L)];
			}
			@Pc(79) Class40 local79 = new Class40();
			local79.aByteArray18 = local50;
			local79.anInt1425 = local50.length;
			return local79;
		}
	}
}
