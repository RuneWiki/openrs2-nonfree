import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
	public static int anInt733 = 0;

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "[J")
	public static long[] aLongArray4 = new long[32];

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "[Lclient!je;")
	public static Class40[] aClass40Array2 = new Class40[100];

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "Lclient!je;")
	public static Class40 aClass40_432 = Static69.method1231("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "Lclient!je;")
	public static Class40 aClass40_433 = Static69.method1231("Freie Welt");

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "Lclient!je;")
	public static Class40 aClass40_434 = Static69.method1231("Schlie-8en");

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
	public static int anInt738 = 0;

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "Lclient!je;")
	public static Class40 aClass40_435 = Static69.method1231("jolt");

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "Z")
	public static boolean aBoolean53 = false;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
	public static void method466() {
		aClass40_433 = null;
		aClass40_434 = null;
		aLongArray4 = null;
		aClass40Array2 = null;
		aClass40_435 = null;
		aClass40_432 = null;
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
	public static void method467() {
		while (true) {
			@Pc(10) Class3 local10 = Static5.aClass3_1;
			@Pc(17) Class2_Sub17 local17;
			synchronized (Static5.aClass3_1) {
				local17 = (Class2_Sub17) Static110.aClass3_11.method78();
			}
			if (local17 == null) {
				return;
			}
			local17.aClass24_Sub1_14.method1939(local17.aClass29_4, (int) local17.aLong100, local17.aByteArray28, false);
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!ta;I)V")
	public static void method468(@OriginalArg(0) Class2_Sub1_Sub1_Sub3 arg0) {
		if (arg0.anInt1798 == 0) {
			arg0.anInt1801 = 1024;
		}
		arg0.anInt1770 = 0;
		if (arg0.anInt1798 == 1) {
			arg0.anInt1801 = 1536;
		}
		@Pc(25) int local25 = arg0.anInt1787 - Static28.anInt704;
		@Pc(36) int local36 = arg0.anInt1807 * 128 + arg0.anInt1789 * 64;
		if (arg0.anInt1798 == 2) {
			arg0.anInt1801 = 0;
		}
		@Pc(54) int local54 = arg0.anInt1785 * 128 + arg0.anInt1789 * 64;
		arg0.anInt1792 += (local36 - arg0.anInt1792) / local25;
		arg0.anInt1788 += (local54 - arg0.anInt1788) / local25;
		if (arg0.anInt1798 == 3) {
			arg0.anInt1801 = 512;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BLclient!je;)V")
	public static void method469(@OriginalArg(1) Class40 arg0) {
		if (Static115.aClass2_Sub16Array1 == null) {
			return;
		}
		@Pc(12) long local12 = arg0.method981();
		@Pc(14) int local14 = 0;
		if (local12 == 0L) {
			return;
		}
		while (local14 < Static115.aClass2_Sub16Array1.length && local12 != Static115.aClass2_Sub16Array1[local14].aLong100) {
			local14++;
		}
		if (local14 < Static115.aClass2_Sub16Array1.length && Static115.aClass2_Sub16Array1[local14] != null) {
			Static57.aClass2_Sub9_Sub1_2.method673(107);
			Static57.aClass2_Sub9_Sub1_2.method647(Static115.aClass2_Sub16Array1[local14].aLong100);
		}
	}
}
