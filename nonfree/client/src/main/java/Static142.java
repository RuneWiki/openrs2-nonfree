import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!et", name = "a", descriptor = "Lclient!nd;")
	public static Class238 aClass238_69;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I)[Lclient!pv;")
	public static Class279[] method2569() {
		if (Static301.aClass279Array1 == null) {
			@Pc(5) Class279[] local5 = Static433.method6267(Static265.aClass286_3);
			@Pc(9) Class279[] local9 = new Class279[local5.length];
			@Pc(11) int local11 = 0;
			@Pc(16) int local16 = Static305.aClass2_Sub49_15.aClass33_Sub10_1.method3565();
			@Pc(75) int local75;
			@Pc(80) Class279 local80;
			label70: for (@Pc(18) int local18 = 0; local18 < local5.length; local18++) {
				@Pc(23) Class279 local23 = local5[local18];
				if ((local23.anInt7361 <= 0 || local23.anInt7361 >= 24) && local23.anInt7364 >= 800 && local23.anInt7368 >= 600 && (local16 != 2 || local23.anInt7364 <= 800 && local23.anInt7368 <= 600) && (local16 != 1 || local23.anInt7364 <= 1024 && local23.anInt7368 <= 768)) {
					for (local75 = 0; local75 < local11; local75++) {
						local80 = local9[local75];
						if (local80.anInt7364 == local23.anInt7364 && local23.anInt7368 == local80.anInt7368) {
							if (local80.anInt7361 < local23.anInt7361) {
								local9[local75] = local23;
							}
							continue label70;
						}
					}
					local9[local11] = local23;
					local11++;
				}
			}
			Static301.aClass279Array1 = new Class279[local11];
			Static650.method2268(local9, 0, Static301.aClass279Array1, 0, local11);
			@Pc(139) int[] local139 = new int[Static301.aClass279Array1.length];
			for (local75 = 0; local75 < Static301.aClass279Array1.length; local75++) {
				local80 = Static301.aClass279Array1[local75];
				local139[local75] = local80.anInt7368 * local80.anInt7364;
			}
			Static200.method3447(Static301.aClass279Array1, local139);
		}
		return Static301.aClass279Array1;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(B)I")
	public static int method2571() {
		return Static456.anInt7430;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ILjava/util/Random;I)I")
	public static int method2572(@OriginalArg(0) int arg0, @OriginalArg(1) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static608.method8539(arg0)) {
			return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(39) int local39 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(42) int local42;
			do {
				local42 = arg1.nextInt();
			} while (local42 >= local39);
			return Static123.method2207(local42, arg0);
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method2573(@OriginalArg(0) Class13 arg0) {
		if (Static633.anInt10265 < 2 && !Static557.aBoolean660 || Static351.aClass303_13 != null) {
			return;
		}
		@Pc(34) String local34;
		if (Static557.aBoolean660 && Static633.anInt10265 < 2) {
			local34 = Static184.aString32 + Static573.aClass345_34.method7951(Static496.anInt7407) + Static80.aString17 + " ->";
		} else if (Static404.aBoolean492 && Static185.aClass221_1.method8050(81) && Static633.anInt10265 > 2) {
			local34 = Static519.method7225(Static10.aClass2_Sub7_Sub21_1);
		} else {
			@Pc(52) Class2_Sub7_Sub21 local52 = Static10.aClass2_Sub7_Sub21_1;
			if (local52 == null) {
				return;
			}
			local34 = Static519.method7225(local52);
			@Pc(61) int[] local61 = null;
			if (Static572.method7950(local52.anInt10014)) {
				local61 = Static470.aClass250_1.method5960((int) local52.aLong262).anIntArray650;
			} else if (local52.anInt10012 != -1) {
				local61 = Static470.aClass250_1.method5960(local52.anInt10012).anIntArray650;
			} else if (Static303.method4765(local52.anInt10014)) {
				@Pc(139) Class2_Sub32 local139 = (Class2_Sub32) Static514.aClass323_32.method7484((long) (int) local52.aLong262);
				if (local139 != null) {
					@Pc(144) Class16_Sub1_Sub1_Sub3_Sub1 local144 = local139.aClass16_Sub1_Sub1_Sub3_Sub1_2;
					@Pc(147) Class113 local147 = local144.aClass113_1;
					if (local147.anIntArray213 != null) {
						local147 = local147.method2752(Static382.aClass282_1);
					}
					if (local147 != null) {
						local61 = local147.anIntArray211;
					}
				}
			} else if (Static342.method5178(local52.anInt10014)) {
				@Pc(108) Class5 local108;
				if (local52.anInt10014 == 1003) {
					local108 = Static79.aClass304_2.method6956((int) local52.aLong262);
				} else {
					local108 = Static79.aClass304_2.method6956((int) (local52.aLong262 >>> 32 & 0x7FFFFFFFL));
				}
				if (local108.anIntArray9 != null) {
					local108 = local108.method77(Static382.aClass282_1);
				}
				if (local108 != null) {
					local61 = local108.anIntArray10;
				}
			}
			if (local61 != null) {
				local34 = local34 + Static416.method6094(local61);
			}
		}
		if (Static633.anInt10265 > 2) {
			local34 = local34 + "<col=ffffff> / " + (Static633.anInt10265 - 2) + Static573.aClass345_27.method7951(Static496.anInt7407);
		}
		if (Static606.aClass303_24 != null) {
			@Pc(219) Class37 local219 = Static606.aClass303_24.method6939(arg0);
			if (local219 == null) {
				local219 = Static544.aClass37_8;
			}
			local219.method6066(Static646.anIntArray736, Static629.anIntArray726, Static606.aClass303_24.anInt7991, Static90.anInt2216, Static570.anInt9338, Static606.aClass303_24.anInt7971, local34, Static402.aClass31Array11, Static159.aRandom1, Static211.anInt4054, Static606.aClass303_24.anInt7978, Static606.aClass303_24.anInt7914, Static606.aClass303_24.anInt7947, Static606.aClass303_24.anInt8000);
			Static437.method6296(Static646.anIntArray736[1], Static646.anIntArray736[2], Static646.anIntArray736[3], Static646.anIntArray736[0]);
		} else if (Static181.aClass303_9 != null && Static51.aClass17_2 == Static579.aClass17_5) {
			@Pc(284) int local284 = Static544.aClass37_8.method6080(Static629.anIntArray726, local34, Static200.anInt3977 + 16, Static402.aClass31Array11, Static159.aRandom1, Static570.anInt9338, Static484.anInt9952 + 4);
			Static437.method6296(Static200.anInt3977, Static551.aClass183_13.method4453(local34) + local284, 16, Static484.anInt9952 + 4);
		}
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(B)V")
	public static void method2574() {
		Static352.aBoolean439 = false;
		Static569.method7932();
	}
}
