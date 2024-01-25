import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static541 {

	@OriginalMember(owner = "client!tg", name = "j", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_154 = new Class274(55, -1);

	@OriginalMember(owner = "client!tg", name = "l", descriptor = "J")
	public static long aLong249 = 0L;

	@OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
	public static int anInt9024 = 0;

	@OriginalMember(owner = "client!tg", name = "s", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_155 = new Class274(111, 1);

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)V")
	public static void method7593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static292.aFloat211 < Static292.aFloat212) {
			Static292.aFloat211 = (float) ((double) Static292.aFloat211 + (double) Static292.aFloat211 / 30.0D);
			if (Static292.aFloat211 > Static292.aFloat212) {
				Static292.aFloat211 = Static292.aFloat212;
			}
			Static466.method3730();
			Static292.anInt8371 = (int) Static292.aFloat211 >> 1;
			Static292.aByteArrayArrayArray11 = Static6.method115(Static292.anInt8371);
		} else if (Static292.aFloat211 > Static292.aFloat212) {
			Static292.aFloat211 = (float) ((double) Static292.aFloat211 - (double) Static292.aFloat211 / 30.0D);
			if (Static292.aFloat211 < Static292.aFloat212) {
				Static292.aFloat211 = Static292.aFloat212;
			}
			Static466.method3730();
			Static292.anInt8371 = (int) Static292.aFloat211 >> 1;
			Static292.aByteArrayArrayArray11 = Static6.method115(Static292.anInt8371);
		}
		if (Static413.anInt7559 != -1 && Static92.anInt1857 != -1) {
			@Pc(79) int local79 = Static413.anInt7559 - Static416.anInt7592;
			if (local79 < 2 || local79 > 2) {
				local79 /= 8;
			}
			@Pc(96) int local96 = Static92.anInt1857 - Static304.anInt5622;
			if (local96 < 2 || local96 > 2) {
				local96 /= 8;
			}
			Static416.anInt7592 -= -local79;
			Static304.anInt5622 += local96;
			if (local79 == 0 && local96 == 0) {
				Static92.anInt1857 = -1;
				Static413.anInt7559 = -1;
			}
			Static466.method3730();
		}
		if (Static347.anInt6415 <= 0) {
			Static549.anInt9101 = -1;
			Static432.anInt7737 = -1;
		} else {
			Static59.anInt1226--;
			if (Static59.anInt1226 == 0) {
				Static347.anInt6415--;
				Static59.anInt1226 = 100;
			}
		}
		if (!Static597.aBoolean720 || Static300.aClass238_33 == null) {
			return;
		}
		for (@Pc(157) Class2_Sub52 local157 = (Class2_Sub52) Static300.aClass238_33.method5833(); local157 != null; local157 = (Class2_Sub52) Static300.aClass238_33.method5838()) {
			@Pc(166) Class105 local166 = Static292.aClass248_4.method6347(local157.aClass2_Sub36_1.anInt6596);
			if (local157.method8573(arg1, arg0)) {
				if (local166.aStringArray8 != null) {
					if (local166.aStringArray8[4] != null) {
						Static115.method1856((long) local157.aClass2_Sub36_1.anInt6596, local166.aString35, local166.anInt3320, (long) local157.aClass2_Sub36_1.anInt6596, true, local166.aStringArray8[4], 1010, false, 0, false, -1, -1);
					}
					if (local166.aStringArray8[3] != null) {
						Static115.method1856((long) local157.aClass2_Sub36_1.anInt6596, local166.aString35, local166.anInt3320, (long) local157.aClass2_Sub36_1.anInt6596, true, local166.aStringArray8[3], 1007, false, 0, false, -1, -1);
					}
					if (local166.aStringArray8[2] != null) {
						Static115.method1856((long) local157.aClass2_Sub36_1.anInt6596, local166.aString35, local166.anInt3320, (long) local157.aClass2_Sub36_1.anInt6596, true, local166.aStringArray8[2], 1003, false, 0, false, -1, -1);
					}
					if (local166.aStringArray8[1] != null) {
						Static115.method1856((long) local157.aClass2_Sub36_1.anInt6596, local166.aString35, local166.anInt3320, (long) local157.aClass2_Sub36_1.anInt6596, true, local166.aStringArray8[1], 1004, false, 0, false, -1, -1);
					}
					if (local166.aStringArray8[0] != null) {
						Static115.method1856((long) local157.aClass2_Sub36_1.anInt6596, local166.aString35, local166.anInt3320, (long) local157.aClass2_Sub36_1.anInt6596, true, local166.aStringArray8[0], 1009, false, 0, false, -1, -1);
					}
				}
				if (!local157.aClass2_Sub36_1.aBoolean488) {
					local157.aClass2_Sub36_1.aBoolean488 = true;
					Static639.method8548(Static229.aClass188_3, local157.aClass2_Sub36_1.anInt6596, local166.anInt3320);
				}
				if (local157.aClass2_Sub36_1.aBoolean488) {
					Static639.method8548(Static525.aClass188_7, local157.aClass2_Sub36_1.anInt6596, local166.anInt3320);
				}
			} else if (local157.aClass2_Sub36_1.aBoolean488) {
				local157.aClass2_Sub36_1.aBoolean488 = false;
				Static639.method8548(Static347.aClass188_5, local157.aClass2_Sub36_1.anInt6596, local166.anInt3320);
			}
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIZ)I")
	public static int method7594(@OriginalArg(1) int arg0) {
		@Pc(12) Class2_Sub22 local12 = Static284.method8371(false, arg0);
		if (local12 == null) {
			return Static496.aClass53_1.method1237(arg0).anInt7144;
		}
		@Pc(22) int local22 = 0;
		for (@Pc(29) int local29 = 0; local29 < local12.anIntArray219.length; local29++) {
			if (local12.anIntArray219[local29] == -1) {
				local22++;
			}
		}
		return local22 + Static496.aClass53_1.method1237(arg0).anInt7144 - local12.anIntArray219.length;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILclient!fca;Lclient!uw;Lclient!ak;IIII)V")
	public static void method7595(@OriginalArg(0) int arg0, @OriginalArg(1) Class11_Sub1_Sub1_Sub2_Sub2 arg1, @OriginalArg(2) Class350 arg2, @OriginalArg(3) Class11_Sub1_Sub1_Sub2_Sub1 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) Class2_Sub31 local11 = new Class2_Sub31();
		local11.anInt5790 = arg0;
		local11.anInt5791 = arg5 << 9;
		local11.anInt5789 = arg6 << 9;
		if (arg2 != null) {
			local11.aClass350_1 = arg2;
			@Pc(32) int local32 = arg2.anInt9662;
			@Pc(35) int local35 = arg2.anInt9622;
			if (arg4 == 1 || arg4 == 3) {
				local32 = arg2.anInt9622;
				local35 = arg2.anInt9662;
			}
			local11.anInt5784 = arg2.anInt9651;
			local11.anInt5793 = arg2.anInt9627;
			local11.anInt5780 = arg2.anInt9628 << 9;
			local11.aBoolean438 = arg2.aBoolean712;
			local11.anInt5788 = local35 + arg5 << 9;
			local11.aBoolean437 = arg2.aBoolean707;
			local11.anInt5782 = arg2.anInt9617;
			local11.anIntArray397 = arg2.anIntArray667;
			local11.anInt5787 = arg2.anInt9644;
			local11.anInt5792 = arg2.anInt9610;
			local11.anInt5786 = arg2.anInt9653;
			local11.anInt5781 = arg6 + local32 << 9;
			if (arg2.anIntArray665 != null) {
				local11.aBoolean436 = true;
				local11.method4826();
			}
			if (local11.anIntArray397 != null) {
				local11.anInt5785 = local11.anInt5784 + (int) ((double) (local11.anInt5787 - local11.anInt5784) * Math.random());
			}
			Static228.aClass238_26.method5837(local11);
		} else if (arg1 != null) {
			local11.aClass11_Sub1_Sub1_Sub2_Sub2_1 = arg1;
			@Pc(201) Class236 local201 = arg1.aClass236_1;
			if (local201.anIntArray462 != null) {
				local11.aBoolean436 = true;
				local201 = local201.method5779(Static438.aClass198_1);
			}
			if (local201 != null) {
				local11.anInt5781 = local201.anInt6892 + arg6 << 9;
				local11.anInt5788 = local201.anInt6892 + arg5 << 9;
				local11.anInt5792 = Static324.method4895(arg1);
				local11.anInt5793 = local201.anInt6918;
				local11.aBoolean437 = local201.aBoolean519;
				local11.anInt5786 = local201.anInt6900;
				local11.anInt5780 = local201.anInt6916 << 9;
				local11.anInt5782 = local201.anInt6931;
			}
			Static124.aClass238_22.method5837(local11);
		} else if (arg3 != null) {
			local11.aClass11_Sub1_Sub1_Sub2_Sub1_1 = arg3;
			local11.anInt5781 = arg3.method2778() + arg6 << 9;
			local11.anInt5788 = arg5 + arg3.method2778() << 9;
			local11.anInt5792 = Static617.method8394(arg3);
			local11.anInt5786 = 256;
			local11.aBoolean437 = arg3.aBoolean45;
			local11.anInt5780 = arg3.anInt553 << 9;
			local11.anInt5793 = arg3.anInt567;
			local11.anInt5782 = 256;
			Static634.aClass222_44.method5476(local11, (long) arg3.anInt3246);
			return;
		}
	}
}
