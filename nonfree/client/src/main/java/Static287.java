import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!lw", name = "A", descriptor = "I")
	public static int anInt5847;

	@OriginalMember(owner = "client!lw", name = "k", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_101 = new Class133(82, 3);

	@OriginalMember(owner = "client!lw", name = "w", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray33 = new String[100];

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIIJ)V")
	public static void method4860(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2) {
		@Pc(10) int local10 = (int) arg2 >> 14 & 0x1F;
		@Pc(17) int local17 = (int) arg2 >> 20 & 0x3;
		@Pc(28) int local28 = Integer.MAX_VALUE & (int) (arg2 >>> 32);
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static501.method7220(arg1, 0, true, local17, local10, 0, 0, arg0);
			return;
		}
		@Pc(46) Class242 local46 = Static454.aClass298_3.method7185(local28);
		@Pc(57) int local57;
		@Pc(54) int local54;
		if (local17 == 0 || local17 == 2) {
			local54 = local46.anInt7193;
			local57 = local46.anInt7195;
		} else {
			local54 = local46.anInt7195;
			local57 = local46.anInt7193;
		}
		@Pc(68) int local68 = local46.anInt7172;
		if (local17 != 0) {
			local68 = (local68 << local17 & 0xF) + (local68 >> 4 - local17);
		}
		Static501.method7220(arg1, local54, true, 0, 0, local57, local68, arg0);
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "([BI)Lclient!ka;")
	public static Class3_Sub10_Sub10 method4866(@OriginalArg(0) byte[] arg0) {
		@Pc(9) Class3_Sub10_Sub10 local9 = new Class3_Sub10_Sub10();
		@Pc(14) Class3_Sub27 local14 = new Class3_Sub27(arg0);
		local14.anInt9191 = local14.aByteArray114.length - 2;
		@Pc(27) int local27 = local14.method7591();
		@Pc(38) int local38 = local14.aByteArray114.length - local27 - 12 - 2;
		local14.anInt9191 = local38;
		@Pc(47) int local47 = local14.method7549();
		local9.anInt4987 = local14.method7591();
		local9.anInt4985 = local14.method7591();
		local9.anInt4992 = local14.method7591();
		local9.anInt4990 = local14.method7591();
		@Pc(75) int local75 = local14.method7548();
		@Pc(86) int local86;
		@Pc(92) int local92;
		if (local75 > 0) {
			local9.aClass267Array1 = new Class267[local75];
			for (local86 = 0; local86 < local75; local86++) {
				local92 = local14.method7591();
				@Pc(99) Class267 local99 = new Class267(Static483.method7134(local92));
				local9.aClass267Array1[local86] = local99;
				while (local92-- > 0) {
					@Pc(110) int local110 = local14.method7549();
					@Pc(116) int local116 = local14.method7549();
					local99.method6640(new Class3_Sub47(local116), (long) local110);
				}
			}
		}
		local14.anInt9191 = 0;
		local9.aString37 = local14.method7595();
		local9.anIntArray446 = new int[local47];
		local9.anIntArray447 = new int[local47];
		local9.aStringArray26 = new String[local47];
		local86 = 0;
		while (local14.anInt9191 < local38) {
			local92 = local14.method7591();
			if (local92 == 3) {
				local9.aStringArray26[local86] = local14.method7589().intern();
			} else if (local92 >= 100 || local92 == 21 || local92 == 38 || local92 == 39) {
				local9.anIntArray446[local86] = local14.method7548();
			} else {
				local9.anIntArray446[local86] = local14.method7549();
			}
			local9.anIntArray447[local86++] = local92;
		}
		return local9;
	}
}
