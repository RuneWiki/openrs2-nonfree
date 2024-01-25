import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bn", name = "r", descriptor = "I")
	public static int anInt603;

	@OriginalMember(owner = "client!bn", name = "s", descriptor = "Lclient!dq;")
	public static Class51 aClass51_1;

	@OriginalMember(owner = "client!bn", name = "q", descriptor = "Lclient!lp;")
	public static Class140 aClass140_5 = new Class140(8);

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IB)V")
	public static void method580(@OriginalArg(0) int arg0) {
		if (arg0 == Static93.anInt1702) {
			return;
		}
		Static373.anInt6324 = Static291.anInt5062 = Static300.anIntArray329[arg0];
		Static11.method195();
		Static392.anIntArrayArray56 = new int[Static373.anInt6324][Static291.anInt5062];
		Static200.anIntArrayArray26 = new int[Static373.anInt6324][Static291.anInt5062];
		Static390.anIntArrayArrayArray12 = new int[4][Static373.anInt6324 >> 3][Static291.anInt5062 >> 3];
		for (@Pc(40) int local40 = 0; local40 < 4; local40++) {
			Static250.aClass128Array1[local40] = Static390.method5421(Static291.anInt5062, Static373.anInt6324);
		}
		Static6.aByteArrayArrayArray1 = new byte[4][Static373.anInt6324][Static291.anInt5062];
		Static68.method1253(Static291.anInt5062, Static373.anInt6324);
		Static288.method4162(Static373.anInt6324 >> 3, Static413.aClass167_11, Static291.anInt5062 >> 3);
		Static93.anInt1702 = arg0;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(BLclient!uu;ZLjava/lang/String;)Lclient!jf;")
	public static Class118 method582(@OriginalArg(1) Class250 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2) {
		@Pc(19) int local19 = arg0.method5790(arg2);
		if (local19 == -1) {
			return new Class118(0);
		}
		@Pc(32) int[] local32 = arg0.method5818(local19);
		@Pc(38) Class118 local38 = new Class118(local32.length);
		@Pc(40) int local40 = 0;
		@Pc(42) int local42 = 0;
		while (true) {
			while (local40 < local38.anInt3450) {
				@Pc(56) Class3_Sub25 local56 = new Class3_Sub25(arg0.method5806(local19, local32[local42++]));
				@Pc(60) int local60 = local56.method4108();
				@Pc(64) int local64 = local56.method4083();
				@Pc(68) int local68 = local56.method4096();
				if (!arg1 && local68 == 1) {
					local38.anInt3450--;
				} else {
					local38.anIntArray216[local40] = local60;
					local38.anIntArray215[local40] = local64;
					local40++;
				}
			}
			return local38;
		}
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(IB)Z")
	public static boolean method583(@OriginalArg(0) int arg0) {
		for (@Pc(10) Class3_Sub38 local10 = (Class3_Sub38) Static325.aClass193_54.method4519(); local10 != null; local10 = (Class3_Sub38) Static325.aClass193_54.method4525()) {
			if (Static419.method5747(local10.anInt5875) && local10.aLong199 == (long) arg0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!nj;I)V")
	public static void method584(@OriginalArg(0) Class3_Sub25 arg0) {
		@Pc(9) int local9 = arg0.method4086();
		Static282.aClass91Array1 = new Class91[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static282.aClass91Array1[local14] = new Class91();
			Static282.aClass91Array1[local14].anInt2418 = arg0.method4086();
			Static282.aClass91Array1[local14].aString35 = arg0.method4119();
		}
		Static73.anInt1338 = arg0.method4086();
		Static134.anInt2393 = arg0.method4086();
		Static102.anInt1841 = arg0.method4086();
		Static371.aClass41_Sub1Array2 = new Class41_Sub1[Static134.anInt2393 + 1 - Static73.anInt1338];
		for (@Pc(66) int local66 = 0; local66 < Static102.anInt1841; local66++) {
			@Pc(72) int local72 = arg0.method4086();
			@Pc(80) Class41_Sub1 local80 = Static371.aClass41_Sub1Array2[local72] = new Class41_Sub1();
			local80.anInt7097 = arg0.method4096();
			local80.anInt7095 = arg0.method4108();
			local80.anInt7107 = local72 + Static73.anInt1338;
			local80.aString66 = arg0.method4119();
			local80.aString65 = arg0.method4119();
		}
		Static93.anInt1699 = arg0.method4108();
		Static160.aBoolean224 = true;
	}
}
