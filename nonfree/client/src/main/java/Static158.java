import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
	public static int anInt3508;

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "Lclient!mb;")
	public static Class3_Sub17 aClass3_Sub17_4;

	@OriginalMember(owner = "client!rh", name = "i", descriptor = "Lclient!qf;")
	public static Class77 aClass77_14;

	@OriginalMember(owner = "client!rh", name = "j", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1360 = Static120.method1824("RuneScape wurde aktualisiert(Q");

	@OriginalMember(owner = "client!rh", name = "p", descriptor = "[Z")
	public static final boolean[] aBooleanArray18 = new boolean[100];

	@OriginalMember(owner = "client!rh", name = "z", descriptor = "J")
	public static long aLong118 = 0L;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZI)Z")
	public static boolean method2506(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 >> arg1 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IILclient!qf;I)V")
	public static void method2511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77 arg2) {
		if (Static64.aClass77_2 != null || Static148.aBoolean134 || (arg2 == null || Static173.method2789(arg2) == null)) {
			return;
		}
		Static64.aClass77_2 = arg2;
		Static23.aClass77_1 = Static173.method2789(arg2);
		Static132.anInt2830 = arg0;
		Static95.aBoolean148 = false;
		Static100.anInt2097 = arg1;
		Static21.anInt513 = 0;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIIIIILclient!dd;IZJ)Z")
	public static boolean method2514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class3_Sub1_Sub5 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) long arg11) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= Static64.anInt1390 || local4 >= Static49.anInt1086) {
					return false;
				}
				@Pc(25) Class3_Sub15 local25 = Static185.aClass3_Sub15ArrayArrayArray1[arg0][local1][local4];
				if (local25 != null && local25.anInt2014 >= 5) {
					return false;
				}
			}
		}
		@Pc(49) Class4 local49 = new Class4();
		local49.aLong4 = arg11;
		local49.anInt180 = arg0;
		local49.anInt177 = arg5;
		local49.anInt184 = arg6;
		local49.anInt189 = arg7;
		local49.aClass3_Sub1_Sub5_1 = arg8;
		local49.anInt175 = arg9;
		local49.anInt185 = arg1;
		local49.anInt188 = arg2;
		local49.anInt178 = arg1 + arg3 - 1;
		local49.anInt172 = arg2 + arg4 - 1;
		for (@Pc(92) int local92 = arg1; local92 < arg1 + arg3; local92++) {
			for (@Pc(95) int local95 = arg2; local95 < arg2 + arg4; local95++) {
				@Pc(98) int local98 = 0;
				if (local92 > arg1) {
					local98++;
				}
				if (local92 < arg1 + arg3 - 1) {
					local98 += 4;
				}
				if (local95 > arg2) {
					local98 += 8;
				}
				if (local95 < arg2 + arg4 - 1) {
					local98 += 2;
				}
				for (@Pc(124) int local124 = arg0; local124 >= 0; local124--) {
					if (Static185.aClass3_Sub15ArrayArrayArray1[local124][local92][local95] == null) {
						Static185.aClass3_Sub15ArrayArrayArray1[local124][local92][local95] = new Class3_Sub15(local124, local92, local95);
					}
				}
				@Pc(157) Class3_Sub15 local157 = Static185.aClass3_Sub15ArrayArrayArray1[arg0][local92][local95];
				local157.aClass4Array3[local157.anInt2014] = local49;
				local157.anIntArray278[local157.anInt2014] = local98;
				local157.anInt2000 |= local98;
				local157.anInt2014++;
			}
		}
		if (arg10) {
			Static153.aClass4Array2[Static170.anInt3814++] = local49;
		}
		return true;
	}
}
