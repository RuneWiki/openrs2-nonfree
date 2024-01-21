import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
	public static int anInt1690;

	@OriginalMember(owner = "client!kb", name = "y", descriptor = "[I")
	public static int[] anIntArray255;

	@OriginalMember(owner = "client!kb", name = "D", descriptor = "[I")
	public static int[] anIntArray256;

	@OriginalMember(owner = "client!kb", name = "G", descriptor = "Lclient!jd;")
	public static Class11 aClass11_72;

	@OriginalMember(owner = "client!kb", name = "Q", descriptor = "Lclient!mb;")
	private static Class45 aClass45_683 = Static63.method1251("wishes to duel with you)3");

	@OriginalMember(owner = "client!kb", name = "z", descriptor = "Lclient!mb;")
	public static Class45 aClass45_681 = aClass45_683;

	@OriginalMember(owner = "client!kb", name = "C", descriptor = "I")
	public static final int anInt1692 = 2301979;

	@OriginalMember(owner = "client!kb", name = "E", descriptor = "Lclient!mb;")
	public static Class45 aClass45_682 = Static63.method1251("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!kb", name = "F", descriptor = "[I")
	public static int[] anIntArray257 = new int[200];

	@OriginalMember(owner = "client!kb", name = "K", descriptor = "I")
	public static int anInt1694 = 0;

	@OriginalMember(owner = "client!kb", name = "L", descriptor = "[J")
	public static long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!kb", name = "M", descriptor = "I")
	public static int anInt1695 = -1;

	@OriginalMember(owner = "client!kb", name = "R", descriptor = "I")
	public static int anInt1697 = 0;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BIIIIIIIII)V")
	public static void method1167(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class5_Sub19 local7 = null;
		for (@Pc(12) Class5_Sub19 local12 = (Class5_Sub19) Static74.aClass10_10.method230(); local12 != null; local12 = (Class5_Sub19) Static74.aClass10_10.method233()) {
			if (arg1 == local12.anInt3115 && arg8 == local12.anInt3117 && local12.anInt3122 == arg2 && arg3 == local12.anInt3124) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class5_Sub19();
			local7.anInt3117 = arg8;
			local7.anInt3124 = arg3;
			local7.anInt3115 = arg1;
			local7.anInt3122 = arg2;
			Static62.method1234(local7);
			Static74.aClass10_10.method234(local7);
		}
		local7.anInt3129 = arg4;
		local7.anInt3120 = arg0;
		local7.anInt3128 = arg5;
		local7.anInt3116 = arg7;
		local7.anInt3125 = arg6;
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(B)V")
	public static void method1168() {
		aClass45_682 = null;
		aClass11_72 = null;
		aClass45_683 = null;
		aClass45_681 = null;
		anIntArray257 = null;
		aLongArray3 = null;
		anIntArray256 = null;
		anIntArray255 = null;
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)V")
	public static void method1169() {
		@Pc(12) int local12 = Static70.aClass5_Sub9_Sub1_3.method1456(8);
		@Pc(21) int local21;
		if (anInt1694 > local12) {
			for (local21 = local12; local21 < anInt1694; local21++) {
				Static79.anIntArray313[Static4.anInt106++] = Static64.anIntArray283[local21];
			}
		}
		if (anInt1694 < local12) {
			throw new RuntimeException("gppov1");
		}
		anInt1694 = 0;
		for (local21 = 0; local21 < local12; local21++) {
			@Pc(73) int local73 = Static64.anIntArray283[local21];
			@Pc(77) Class5_Sub2_Sub4_Sub3_Sub1 local77 = Static34.aClass5_Sub2_Sub4_Sub3_Sub1Array1[local73];
			@Pc(82) int local82 = Static70.aClass5_Sub9_Sub1_3.method1456(1);
			if (local82 == 0) {
				Static64.anIntArray283[anInt1694++] = local73;
				local77.anInt2406 = Static3.anInt94;
			} else {
				@Pc(102) int local102 = Static70.aClass5_Sub9_Sub1_3.method1456(2);
				if (local102 == 0) {
					Static64.anIntArray283[anInt1694++] = local73;
					local77.anInt2406 = Static3.anInt94;
					Static104.anIntArray425[Static79.anInt2240++] = local73;
				} else {
					@Pc(146) int local146;
					@Pc(156) int local156;
					if (local102 == 1) {
						Static64.anIntArray283[anInt1694++] = local73;
						local77.anInt2406 = Static3.anInt94;
						local146 = Static70.aClass5_Sub9_Sub1_3.method1456(3);
						local77.method1619(false, local146);
						local156 = Static70.aClass5_Sub9_Sub1_3.method1456(1);
						if (local156 == 1) {
							Static104.anIntArray425[Static79.anInt2240++] = local73;
						}
					} else if (local102 == 2) {
						Static64.anIntArray283[anInt1694++] = local73;
						local77.anInt2406 = Static3.anInt94;
						local146 = Static70.aClass5_Sub9_Sub1_3.method1456(3);
						local77.method1619(true, local146);
						local156 = Static70.aClass5_Sub9_Sub1_3.method1456(3);
						local77.method1619(true, local156);
						@Pc(212) int local212 = Static70.aClass5_Sub9_Sub1_3.method1456(1);
						if (local212 == 1) {
							Static104.anIntArray425[Static79.anInt2240++] = local73;
						}
					} else if (local102 == 3) {
						Static79.anIntArray313[Static4.anInt106++] = local73;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)I")
	public static int method1171(@OriginalArg(0) int arg0) {
		return arg0 >> 17 & 0x7;
	}
}
