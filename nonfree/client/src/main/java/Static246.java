import java.awt.Canvas;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!hla", name = "c", descriptor = "Lclient!nca;")
	public static Class254 aClass254_84;

	@OriginalMember(owner = "client!hla", name = "h", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar3 = Calendar.getInstance();

	@OriginalMember(owner = "client!hla", name = "a", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar4 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!hla", name = "f", descriptor = "[F")
	public static final float[] aFloatArray23 = new float[16];

	@OriginalMember(owner = "client!hla", name = "a", descriptor = "(B[B)V")
	public static synchronized void method3451(@OriginalArg(1) byte[] arg0) {
		if (arg0.length == 100 && Static362.anInt5815 < 1000) {
			Static645.aByteArrayArray24[Static362.anInt5815++] = arg0;
		} else if (arg0.length == 5000 && Static266.anInt4127 < 250) {
			Static566.aByteArrayArray21[Static266.anInt4127++] = arg0;
		} else if (arg0.length == 30000 && Static288.anInt4454 < 50) {
			Static644.aByteArrayArray23[Static288.anInt4454++] = arg0;
		} else if (Static204.aByteArrayArrayArray2 != null) {
			for (@Pc(77) int local77 = 0; local77 < Static4.anIntArray26.length; local77++) {
				if (Static4.anIntArray26[local77] == arg0.length && Static697.anIntArray743[local77] < Static204.aByteArrayArrayArray2[local77].length) {
					Static204.aByteArrayArrayArray2[local77][Static697.anIntArray743[local77]++] = arg0;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hla", name = "a", descriptor = "(III)Z")
	public static boolean method3452(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!hla", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method3453(@OriginalArg(0) int arg0) {
		@Pc(28) byte[] local28;
		if (arg0 == 100 && Static362.anInt5815 > 0) {
			local28 = Static645.aByteArrayArray24[--Static362.anInt5815];
			Static645.aByteArrayArray24[Static362.anInt5815] = null;
			return local28;
		} else if (arg0 == 5000 && Static266.anInt4127 > 0) {
			local28 = Static566.aByteArrayArray21[--Static266.anInt4127];
			Static566.aByteArrayArray21[Static266.anInt4127] = null;
			return local28;
		} else if (arg0 == 30000 && Static288.anInt4454 > 0) {
			local28 = Static644.aByteArrayArray23[--Static288.anInt4454];
			Static644.aByteArrayArray23[Static288.anInt4454] = null;
			return local28;
		} else {
			if (Static204.aByteArrayArrayArray2 != null) {
				for (@Pc(87) int local87 = 0; local87 < Static4.anIntArray26.length; local87++) {
					if (Static4.anIntArray26[local87] == arg0 && Static697.anIntArray743[local87] > 0) {
						@Pc(119) byte[] local119 = Static204.aByteArrayArrayArray2[local87][--Static697.anIntArray743[local87]];
						Static204.aByteArrayArrayArray2[local87][Static697.anIntArray743[local87]] = null;
						return local119;
					}
				}
			}
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!hla", name = "a", descriptor = "(IIBI)V")
	public static void method3454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = Static243.anInt3820 + arg2;
		@Pc(13) int local13 = Static224.anInt11062 + arg1;
		if (Static632.aClass311ArrayArrayArray3 == null || arg2 < 0 || arg1 < 0 || arg2 >= Static426.anInt6942 || Static280.anInt6752 <= arg1 || Static650.aClass2_Sub30_29.aClass11_Sub12_1.method2753() == 0 && arg0 != Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aByte133) {
			return;
		}
		@Pc(77) long local77 = (long) (arg0 << 28 | local13 << 14 | local9);
		@Pc(83) Class2_Sub53 local83 = (Class2_Sub53) Static596.aClass218_41.method5095(local77, 0);
		if (local83 == null) {
			Static591.method8379(arg0, arg2, arg1);
			return;
		}
		@Pc(98) Class2_Sub48 local98 = (Class2_Sub48) local83.aClass60_217.method1226(7);
		if (local98 == null) {
			Static591.method8379(arg0, arg2, arg1);
			return;
		}
		@Pc(113) Class4_Sub2_Sub5_Sub1 local113 = (Class4_Sub2_Sub5_Sub1) Static591.method8379(arg0, arg2, arg1);
		if (local113 == null) {
			local113 = new Class4_Sub2_Sub5_Sub1(arg2 << 9, Static158.aClass133Array4[arg0].method8217(arg2, arg1), arg1 << 9, arg0, arg0);
		} else {
			local113.anInt7810 = local113.anInt7825 = -1;
		}
		local113.anInt7817 = local98.anInt8383;
		local113.anInt7813 = local98.anInt8384;
		label56: while (true) {
			@Pc(158) Class2_Sub48 local158 = (Class2_Sub48) local83.aClass60_217.method1228();
			if (local158 == null) {
				break;
			}
			if (local113.anInt7817 != local158.anInt8383) {
				local113.anInt7810 = local158.anInt8383;
				local113.anInt7826 = local158.anInt8384;
				while (true) {
					@Pc(189) Class2_Sub48 local189 = (Class2_Sub48) local83.aClass60_217.method1228();
					if (local189 == null) {
						break label56;
					}
					if (local113.anInt7817 != local189.anInt8383 && local113.anInt7810 != local189.anInt8383) {
						local113.anInt7821 = local189.anInt8384;
						local113.anInt7825 = local189.anInt8383;
					}
				}
			}
		}
		@Pc(239) int local239 = Static324.method4554(arg0, (arg2 << 9) + 256, (arg1 << 9) - -256);
		local113.anInt10229 = arg2 << 9;
		local113.anInt10228 = arg1 << 9;
		local113.aByte133 = (byte) arg0;
		local113.aByte134 = (byte) arg0;
		local113.anInt10234 = local239;
		local113.anInt7812 = 0;
		if (Static83.method1237(arg2, arg1)) {
			local113.aByte134++;
		}
		Static57.method912(arg0, arg2, arg1, local239, local113);
	}

	@OriginalMember(owner = "client!hla", name = "b", descriptor = "(Z)I")
	public static int method3455() {
		@Pc(7) Class145 local7 = Static396.aClass145_6;
		@Pc(9) boolean local9 = false;
		if (Static650.aClass2_Sub30_29.aClass11_Sub20_2.method4863() != 0) {
			@Pc(21) Canvas local21 = new Canvas();
			local21.setSize(100, 100);
			local9 = true;
			local7 = Static150.method2167((Interface3) null, local21, 0, 0, (Class254) null);
		}
		@Pc(38) long local38 = Static567.method7863();
		for (@Pc(40) int local40 = 0; local40 < 10000; local40++) {
			local7.method9696();
		}
		@Pc(72) int local72 = (int) (Static567.method7863() - local38);
		local7.method9637(100, 100, 0, -16777216, 0);
		if (local9) {
			local7.method9661();
		}
		return local72;
	}
}
