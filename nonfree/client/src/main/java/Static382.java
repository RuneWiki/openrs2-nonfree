import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!ok", name = "ac", descriptor = "Lclient!mn;")
	public static Class227 aClass227_2;

	@OriginalMember(owner = "client!ok", name = "uc", descriptor = "I")
	public static int anInt6461;

	@OriginalMember(owner = "client!ok", name = "D", descriptor = "()V")
	public static void method5221() {
		for (@Pc(1) int local1 = 0; local1 < Static218.aClass144Array1.length; local1++) {
			Static218.aClass144Array1[local1].method3252();
		}
		Static218.aClass144Array1 = null;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIILclient!r;)V")
	public static void method5232(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class134 arg2) {
		Static204.aClass119ArrayArray1 = new Class119[arg1][arg0];
		Static307.aClass134_8 = arg2;
		if (Static570.anIntArray713 != null) {
			Static361.aClass83_4 = Static419.method5825(Static570.anIntArray713[4], Static570.anIntArray713[3], Static570.anIntArray713[2], Static570.anIntArray713[5], Static570.anIntArray713[1], Static570.anIntArray713[0]);
		}
		Static436.aClass119_3 = new Class119();
		Static395.method5457();
	}

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "(IIII)V")
	public static void method5238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14 = arg2 * Static348.aClass1_Sub30_Sub1_1.anInt4865 >> 8;
		if (local14 != 0 && arg0 != -1) {
			Static381.method5109(local14, Static408.aClass270_81, arg0);
			Static340.aBoolean451 = true;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZLjava/lang/String;Z)V")
	public static void method5242(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		@Pc(4) String local4 = arg1.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg0 ? 32768 : 0;
		@Pc(29) int local29 = local19 + (arg0 ? Static183.aClass366_1.anInt9649 : Static183.aClass366_1.anInt9655);
		for (@Pc(31) int local31 = local19; local31 < local29; local31++) {
			@Pc(38) Class1_Sub6_Sub13 local38 = Static183.aClass366_1.method7873(local31);
			if (local38.aBoolean598 && local38.method6223().toLowerCase().indexOf(local4) != -1) {
				if (local13 >= 50) {
					Static86.anInt1814 = -1;
					Static101.aShortArray46 = null;
					return;
				}
				if (local13 >= local11.length) {
					@Pc(67) short[] local67 = new short[local11.length * 2];
					for (@Pc(69) int local69 = 0; local69 < local13; local69++) {
						local67[local69] = local11[local69];
					}
					local11 = local67;
				}
				local11[local13++] = (short) local31;
			}
		}
		Static101.aShortArray46 = local11;
		Static33.anInt2652 = 0;
		Static86.anInt1814 = local13;
		@Pc(111) String[] local111 = new String[Static86.anInt1814];
		for (@Pc(113) int local113 = 0; local113 < Static86.anInt1814; local113++) {
			local111[local113] = Static183.aClass366_1.method7873(local11[local113]).method6223();
		}
		Static458.method6320(Static101.aShortArray46, local111);
	}

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "(IIII)V")
	public static void method5272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 1003) {
			Static80.method1458(Static451.aClass324_43, arg2, arg1);
		} else if (arg0 == 1004) {
			Static80.method1458(Static250.aClass324_23, arg2, arg1);
		} else if (arg0 == 1012) {
			Static80.method1458(Static499.aClass324_18, arg2, arg1);
		} else if (arg0 == 1011) {
			Static80.method1458(Static530.aClass324_50, arg2, arg1);
		} else if (arg0 == 1008) {
			Static80.method1458(Static302.aClass324_29, arg2, arg1);
		}
	}
}
