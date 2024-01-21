import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!dh", name = "o", descriptor = "Lclient!ph;")
	public static Class72 aClass72_1;

	@OriginalMember(owner = "client!dh", name = "q", descriptor = "I")
	public static int anInt1069;

	@OriginalMember(owner = "client!dh", name = "w", descriptor = "Lclient!uf;")
	public static Class1_Sub2_Sub5_Sub5 aClass1_Sub2_Sub5_Sub5_2;

	@OriginalMember(owner = "client!dh", name = "n", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_668 = Static118.method2249("Started 3d library");

	@OriginalMember(owner = "client!dh", name = "s", descriptor = "Lclient!oc;")
	public static Class65 aClass65_669 = aClass65_668;

	@OriginalMember(owner = "client!dh", name = "u", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_670 = Static118.method2249("wishes to trade with you)3");

	@OriginalMember(owner = "client!dh", name = "v", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_671 = Static118.method2249("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

	@OriginalMember(owner = "client!dh", name = "z", descriptor = "Lclient!oc;")
	public static Class65 aClass65_672 = aClass65_670;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILclient!oc;)V")
	public static void method687(@OriginalArg(1) Class65 arg0) {
		@Pc(3) Class1_Sub10 local3 = method691(arg0);
		if (local3 == null) {
			return;
		}
		Static119.anInt2954 = local3.anInt1865 - Static57.anInt1532;
		@Pc(26) int local26 = Static119.anInt2954 + (int) ((double) Static132.aClass97_11.anInt4353 / Static164.aDouble11);
		Static90.anInt4438 = Static33.anInt974 + Static25.anInt737 - local3.anInt1862;
		@Pc(43) int local43 = Static119.anInt2954 - (int) ((double) Static132.aClass97_11.anInt4353 / Static164.aDouble11);
		if (local43 < 0) {
			Static119.anInt2954 = (int) ((double) Static132.aClass97_11.anInt4353 / Static164.aDouble11);
		}
		@Pc(64) int local64 = Static90.anInt4438 - (int) ((double) Static132.aClass97_11.anInt4354 / Static164.aDouble11);
		@Pc(73) int local73 = Static90.anInt4438 + (int) ((double) Static132.aClass97_11.anInt4354 / Static164.aDouble11);
		if (Static190.anInt4160 < local26) {
			Static119.anInt2954 = Static190.anInt4160 - (int) ((double) Static132.aClass97_11.anInt4353 / Static164.aDouble11);
		}
		if (local64 < 0) {
			Static90.anInt4438 = (int) ((double) Static132.aClass97_11.anInt4354 / Static164.aDouble11);
		}
		if (Static25.anInt737 < local73) {
			Static90.anInt4438 = Static25.anInt737 - (int) ((double) Static132.aClass97_11.anInt4354 / Static164.aDouble11);
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(JI)Lclient!oc;")
	public static Class65 method688(@OriginalArg(0) long arg0) {
		Static82.aCalendar2.setTime(new Date(arg0));
		@Pc(13) int local13 = Static82.aCalendar2.get(7);
		@Pc(17) int local17 = Static82.aCalendar2.get(5);
		@Pc(21) int local21 = Static82.aCalendar2.get(2);
		@Pc(25) int local25 = Static82.aCalendar2.get(1);
		@Pc(29) int local29 = Static82.aCalendar2.get(11);
		@Pc(33) int local33 = Static82.aCalendar2.get(12);
		@Pc(37) int local37 = Static82.aCalendar2.get(13);
		return Static109.method2004(new Class65[] { Static209.aClass65Array67[local13 - 1], Static102.aClass65_1509, Static118.method2250(local17 / 10), Static118.method2250(local17 % 10), Static195.aClass65_2508, Static1.aClass65Array68[local21], Static195.aClass65_2508, Static118.method2250(local25), Static28.aClass65_598, Static118.method2250(local29 / 10), Static118.method2250(local29 % 10), Static68.aClass65_933, Static118.method2250(local33 / 10), Static118.method2250(local33 % 10), Static68.aClass65_933, Static118.method2250(local37 / 10), Static118.method2250(local37 % 10), Static168.aClass65_1729 });
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "([BI)[B")
	public static byte[] method690(@OriginalArg(0) byte[] arg0) {
		@Pc(11) int local11 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local11];
		Static217.method2361(arg0, 0, local14, 0, local11);
		return local14;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lclient!oc;I)Lclient!hi;")
	public static Class1_Sub10 method691(@OriginalArg(0) Class65 arg0) {
		if (arg0.method2482() == 0) {
			return null;
		}
		for (@Pc(19) Class1_Sub10 local19 = (Class1_Sub10) Static182.aClass91_21.method3148(); local19 != null; local19 = (Class1_Sub10) Static182.aClass91_21.method3150()) {
			if (local19.aClass65_1134.method2445(arg0)) {
				return local19;
			}
		}
		return null;
	}
}
