import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!dj", name = "u", descriptor = "I")
	public static int anInt1787 = 0;

	@OriginalMember(owner = "client!dj", name = "H", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_25 = new Class119(21, 6);

	@OriginalMember(owner = "client!dj", name = "K", descriptor = "I")
	public static int anInt1795 = 0;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	public static void method1395(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			return;
		}
		if (Static415.anInt6805 >= 100) {
			Static155.method2520(Static102.aClass189_74.method4262(Static53.anInt1454));
			return;
		}
		@Pc(24) String local24 = Static40.method777(arg1);
		if (local24 == null) {
			return;
		}
		@Pc(66) String local66;
		for (@Pc(29) int local29 = 0; local29 < Static415.anInt6805; local29++) {
			@Pc(36) String local36 = Static40.method777(Static82.aStringArray32[local29]);
			if (local36 != null && local36.equals(local24)) {
				Static155.method2520(arg1 + Static88.aClass189_69.method4262(Static53.anInt1454));
				return;
			}
			if (Static135.aStringArray29[local29] != null) {
				local66 = Static40.method777(Static135.aStringArray29[local29]);
				if (local66 != null && local66.equals(local24)) {
					Static155.method2520(arg1 + Static88.aClass189_69.method4262(Static53.anInt1454));
					return;
				}
			}
		}
		for (@Pc(92) int local92 = 0; local92 < Static202.anInt3950; local92++) {
			local66 = Static40.method777(Static388.aStringArray45[local92]);
			if (local66 != null && local66.equals(local24)) {
				Static155.method2520(Static396.aClass189_214.method4262(Static53.anInt1454) + arg1 + Static130.aClass189_138.method4262(Static53.anInt1454));
				return;
			}
			if (Static93.aStringArray19[local92] != null) {
				@Pc(138) String local138 = Static40.method777(Static93.aStringArray19[local92]);
				if (local138 != null && local138.equals(local24)) {
					Static155.method2520(Static396.aClass189_214.method4262(Static53.anInt1454) + arg1 + Static130.aClass189_138.method4262(Static53.anInt1454));
					return;
				}
			}
		}
		if (Static40.method777(Static379.aClass7_Sub2_Sub3_Sub2_2.aString36).equals(local24)) {
			Static155.method2520(Static312.aClass189_173.method4262(Static53.anInt1454));
		} else {
			Static30.method641(Static157.aClass217_55);
			Static302.aClass3_Sub7_Sub1_2.method2628(Static24.method582(arg1) + 1);
			Static302.aClass3_Sub7_Sub1_2.method2608(arg1);
			Static302.aClass3_Sub7_Sub1_2.method2628(arg0 ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "(I)V")
	public static void method1396() {
		if (!Static446.aBoolean648) {
			return;
		}
		@Pc(11) Class156 local11 = Static109.method1853(Static129.anInt2687, Static213.anInt4082);
		if (local11 != null && local11.anObjectArray12 != null) {
			@Pc(20) Class3_Sub31 local20 = new Class3_Sub31();
			local20.anObjectArray36 = local11.anObjectArray12;
			local20.aClass156_11 = local11;
			Static285.method4059(local20);
		}
		Static446.aBoolean648 = false;
		Static25.anInt849 = -1;
		Static338.anInt5764 = -1;
		if (local11 != null) {
			Static386.method5010(local11);
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "([Lclient!mq;BI)V")
	public static void method1397(@OriginalArg(0) Class156[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class156 local6 = arg0[local1];
			if (local6 != null) {
				if (local6.anInt4792 == 0) {
					if (local6.aClass156Array2 != null) {
						method1397(local6.aClass156Array2, arg1);
					}
					@Pc(30) Class3_Sub9 local30 = (Class3_Sub9) Static318.aClass11_42.method324((long) local6.anInt4850);
					if (local30 != null) {
						Static88.method1668(arg1, local30.anInt1804);
					}
				}
				@Pc(49) Class3_Sub31 local49;
				if (arg1 == 0 && local6.anObjectArray32 != null) {
					local49 = new Class3_Sub31();
					local49.aClass156_11 = local6;
					local49.anObjectArray36 = local6.anObjectArray32;
					Static285.method4059(local49);
				}
				if (arg1 == 1 && local6.anObjectArray25 != null) {
					if (local6.anInt4868 >= 0) {
						@Pc(77) Class156 local77 = Static435.method5705(local6.anInt4850);
						if (local77 == null || local77.aClass156Array2 == null || local77.aClass156Array2.length <= local6.anInt4868 || local77.aClass156Array2[local6.anInt4868] != local6) {
							continue;
						}
					}
					local49 = new Class3_Sub31();
					local49.anObjectArray36 = local6.anObjectArray25;
					local49.aClass156_11 = local6;
					Static285.method4059(local49);
				}
			}
		}
	}
}
