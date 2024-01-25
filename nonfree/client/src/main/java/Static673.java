import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static673 {

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "[Lclient!jga;")
	public static Interface18[] anInterface18Array1;

	@OriginalMember(owner = "client!wl", name = "i", descriptor = "Lclient!gda;")
	public static Class126 aClass126_298;

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "Lclient!jj;")
	public static final Class187 aClass187_8 = new Class187();

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
	public static void method9140() {
		if (Static471.anInt7669 <= 0) {
			Static220.aString35 = "";
			return;
		}
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < Static464.aStringArray33.length; local20++) {
			if (Static464.aStringArray33[local20].indexOf("--> ") != -1) {
				local18++;
				if (local18 == Static471.anInt7669) {
					Static220.aString35 = Static464.aStringArray33[local20].substring(Static464.aStringArray33[local20].indexOf(">") + 2);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIZILclient!ha;Lclient!mk;IIIIII)V")
	public static void method9141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class100 arg3, @OriginalArg(5) Class5_Sub1_Sub13 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg1 < arg5 && arg9 + arg1 > arg5 && arg0 - 13 < arg2 && arg0 + 3 > arg2 && arg4.aBoolean414) {
			arg7 = arg10;
		}
		@Pc(36) int[] local36 = null;
		if (Static412.method6083(arg4.anInt6068)) {
			local36 = Static82.aClass134_1.method3191((int) arg4.aLong176).anIntArray372;
		} else if (arg4.anInt6067 != -1) {
			local36 = Static82.aClass134_1.method3191(arg4.anInt6067).anIntArray372;
		} else if (Static250.method4080(arg4.anInt6068)) {
			@Pc(119) Class5_Sub9 local119 = (Class5_Sub9) Static677.aClass306_37.method6943((long) (int) arg4.aLong176);
			if (local119 != null) {
				@Pc(124) Class4_Sub1_Sub1_Sub2_Sub2 local124 = local119.aClass4_Sub1_Sub1_Sub2_Sub2_1;
				@Pc(127) Class105 local127 = local124.aClass105_1;
				if (local127.anIntArray134 != null) {
					local127 = local127.method2622(Static23.aClass247_1);
				}
				if (local127 != null) {
					local36 = local127.anIntArray131;
				}
			}
		} else if (Static126.method1893(arg4.anInt6068)) {
			@Pc(88) Class354 local88;
			if (arg4.anInt6068 == 1001) {
				local88 = Static528.aClass243_3.method5556((int) arg4.aLong176);
			} else {
				local88 = Static528.aClass243_3.method5556((int) (arg4.aLong176 >>> 32 & 0x7FFFFFFFL));
			}
			if (local88.anIntArray526 != null) {
				local88 = local88.method8024(Static23.aClass247_1);
			}
			if (local88 != null) {
				local36 = local88.anIntArray527;
			}
		}
		@Pc(168) String local168 = Static461.method6496(arg4);
		if (local36 != null) {
			local168 = local168 + Static462.method6508(local36);
		}
		Static196.aClass70_3.method8438(Static67.aClass155Array3, arg1 + 3, arg7, local168, arg0, Static12.anIntArray9);
		if (arg4.aBoolean412) {
			Static28.aClass155_3.method7202(arg1 + Static73.aClass196_5.method4556(local168) + 5, arg0 + -12);
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(FIIIIIZII)[[I")
	public static int[][] method9142(@OriginalArg(0) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class5_Sub3_Sub9 local13 = new Class5_Sub3_Sub9();
		local13.anInt2145 = 3;
		local13.aBoolean145 = false;
		local13.anInt2156 = 4;
		local13.anInt2150 = (int) (arg0 * 4096.0F);
		local13.anInt2155 = 4;
		local13.method9210();
		Static515.method7064(256, 64);
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			local13.method1917(local9[local46], local46);
		}
		return local9;
	}
}
