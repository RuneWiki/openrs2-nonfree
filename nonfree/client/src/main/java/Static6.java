import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!af", name = "bb", descriptor = "I")
	public static int anInt195;

	@OriginalMember(owner = "client!af", name = "T", descriptor = "Lclient!bh;")
	public static Class7 aClass7_1 = new Class7();

	@OriginalMember(owner = "client!af", name = "Z", descriptor = "Lclient!rc;")
	public static Class66 aClass66_1 = new Class66(64);

	@OriginalMember(owner = "client!af", name = "cb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_81 = Static8.method128("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!af", name = "db", descriptor = "[I")
	public static int[] anIntArray7 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II)V")
	public static void method107(@OriginalArg(0) int arg0) {
		if (arg0 == Static73.anInt1886) {
			return;
		}
		if (Static73.anInt1886 == 0) {
			Static33.method717();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static129.anInt3680 = 0;
			Static54.anInt1731 = 0;
			Static81.anInt2484 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static24.aClass21_3 != null) {
			Static24.aClass21_3.method1029();
			Static24.aClass21_3 = null;
		}
		if (Static73.anInt1886 == 25) {
			Static156.anInt4306 = 0;
			Static88.anInt2730 = 1;
			Static155.anInt4268 = 0;
			Static15.anInt437 = 1;
			Static23.anInt710 = 0;
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static103.method2148(Static127.aClass16_Sub1_41, Static46.aCanvas38, Static107.aClass16_Sub1_35);
		} else {
			Static26.method575();
		}
		Static73.anInt1886 = arg0;
	}

	@OriginalMember(owner = "client!af", name = "g", descriptor = "(I)V")
	public static void method111() {
		anIntArray7 = null;
		aClass66_1 = null;
		aClass18_81 = null;
		aClass7_1 = null;
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(II)I")
	public static int method112(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(24) int local24 = local10 | local10 >>> 2;
		@Pc(30) int local30 = local24 | local24 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return local42 + 1;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(BLclient!ea;)Z")
	public static boolean method113(@OriginalArg(1) Class18 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static39.anInt1205; local16++) {
			if (arg0.method734(Static39.aClass18Array6[local16])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!dd;Lclient!dd;I)V")
	public static void method115(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class16 arg1) {
		Static34.aClass16_5 = arg1;
		Static53.aClass16_6 = arg0;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!ef;I)Z")
	public static boolean method116(@OriginalArg(0) Class20 arg0) {
		if (arg0.anIntArray80 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < arg0.anIntArray80.length; local12++) {
			@Pc(19) int local19 = Static87.method1881(local12, arg0);
			@Pc(24) int local24 = arg0.anIntArray86[local12];
			if (arg0.anIntArray80[local12] == 2) {
				if (local24 <= local19) {
					return false;
				}
			} else if (arg0.anIntArray80[local12] == 3) {
				if (local19 <= local24) {
					return false;
				}
			} else if (arg0.anIntArray80[local12] == 4) {
				if (local24 == local19) {
					return false;
				}
			} else if (local24 != local19) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Z[BILclient!s;)V")
	public static void method117(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class69 arg2) {
		@Pc(3) Class1_Sub7 local3 = new Class1_Sub7();
		local3.anInt1089 = 0;
		local3.aClass69_2 = arg2;
		local3.aLong139 = arg1;
		local3.aByteArray5 = arg0;
		@Pc(22) Class59 local22 = Static164.aClass59_58;
		synchronized (Static164.aClass59_58) {
			Static164.aClass59_58.method2411(local3);
		}
		Static48.method1037();
	}
}
