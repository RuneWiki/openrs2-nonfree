import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!td", name = "w", descriptor = "I")
	public static int anInt4358;

	@OriginalMember(owner = "client!td", name = "y", descriptor = "[Lclient!tg;")
	public static Class1_Sub2_Sub2[] aClass1_Sub2_Sub2Array10;

	@OriginalMember(owner = "client!td", name = "z", descriptor = "[Lclient!ka;")
	public static Class64_Sub1[] aClass64_Sub1Array9;

	@OriginalMember(owner = "client!td", name = "G", descriptor = "[Lclient!o;")
	public static Class86[] aClass86Array2;

	@OriginalMember(owner = "client!td", name = "F", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1151 = Static231.method3737(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!td", name = "H", descriptor = "[J")
	public static long[] aLongArray7 = new long[100];

	@OriginalMember(owner = "client!td", name = "I", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1152 = Static231.method3737("welle2:");

	@OriginalMember(owner = "client!td", name = "K", descriptor = "[[I")
	public static int[][] anIntArrayArray39 = new int[104][104];

	@OriginalMember(owner = "client!td", name = "L", descriptor = "[I")
	public static int[] anIntArray353 = new int[32];

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IB)I")
	public static int method3221(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!sc;IILclient!sc;Lclient!sc;)V")
	public static void method3222(@OriginalArg(0) Class107 arg0, @OriginalArg(3) Class107 arg1, @OriginalArg(4) Class107 arg2) {
		Static174.method2775(arg2, arg1, arg0, 9, -1);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILclient!vf;)V")
	public static void method3223(@OriginalArg(1) Class1_Sub26 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static151.aClass13_4 != null) {
			@Pc(16) int local16;
			try {
				Static151.aClass13_4.method357(0L);
				local16 = 0;
				Static151.aClass13_4.method353(local8);
				while (local16 < 24 && local8[local16] == 0) {
					local16++;
				}
				if (local16 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(42) Exception local42) {
				for (local16 = 0; local16 < 24; local16++) {
					local8[local16] = -1;
				}
			}
		}
		arg0.method2993(24, local8);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "([Lclient!i;III)V")
	public static void method3224(@OriginalArg(0) Class54[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 <= arg2) {
			return;
		}
		@Pc(8) int local8 = arg2 - 1;
		@Pc(14) int local14 = (arg2 + arg1) / 2;
		@Pc(18) Class54 local18 = arg0[local14];
		arg0[local14] = arg0[arg2];
		arg0[arg2] = local18;
		@Pc(32) int local32 = arg1 + 1;
		while (local32 > local8) {
			@Pc(36) boolean local36 = true;
			@Pc(39) int local39;
			@Pc(58) int local58;
			@Pc(74) int local74;
			do {
				local32--;
				for (local39 = 0; local39 < 4; local39++) {
					if (Static44.anIntArray101[local39] == 2) {
						local74 = local18.anInt1916;
						local58 = arg0[local32].anInt1916;
					} else if (Static44.anIntArray101[local39] == 1) {
						local58 = arg0[local32].anInt1911;
						if (local58 == -1 && Static40.anIntArray85[local39] == 1) {
							local58 = 2001;
						}
						local74 = local18.anInt1911;
						if (local74 == -1 && Static40.anIntArray85[local39] == 1) {
							local74 = 2001;
						}
					} else if (Static44.anIntArray101[local39] == 3) {
						local58 = arg0[local32].aBoolean173 ? 1 : 0;
						local74 = local18.aBoolean173 ? 1 : 0;
					} else {
						local58 = arg0[local32].anInt1917;
						local74 = local18.anInt1917;
					}
					if (local74 != local58) {
						if ((Static40.anIntArray85[local39] != 1 || local58 <= local74) && (Static40.anIntArray85[local39] != 0 || local58 >= local74)) {
							local36 = false;
						}
						break;
					}
					if (local39 == 3) {
						local36 = false;
					}
				}
			} while (local36);
			local36 = true;
			do {
				local8++;
				for (local39 = 0; local39 < 4; local39++) {
					if (Static44.anIntArray101[local39] == 2) {
						local74 = local18.anInt1916;
						local58 = arg0[local8].anInt1916;
					} else if (Static44.anIntArray101[local39] == 1) {
						local58 = arg0[local8].anInt1911;
						if (local58 == -1 && Static40.anIntArray85[local39] == 1) {
							local58 = 2001;
						}
						local74 = local18.anInt1911;
						if (local74 == -1 && Static40.anIntArray85[local39] == 1) {
							local74 = 2001;
						}
					} else if (Static44.anIntArray101[local39] == 3) {
						local58 = arg0[local8].aBoolean173 ? 1 : 0;
						local74 = local18.aBoolean173 ? 1 : 0;
					} else {
						local74 = local18.anInt1917;
						local58 = arg0[local8].anInt1917;
					}
					if (local58 != local74) {
						if ((Static40.anIntArray85[local39] != 1 || local74 <= local58) && (Static40.anIntArray85[local39] != 0 || local74 >= local58)) {
							local36 = false;
						}
						break;
					}
					if (local39 == 3) {
						local36 = false;
					}
				}
			} while (local36);
			if (local8 < local32) {
				@Pc(322) Class54 local322 = arg0[local8];
				arg0[local8] = arg0[local32];
				arg0[local32] = local322;
			}
		}
		method3224(arg0, local32, arg2);
		method3224(arg0, arg1, local32 + 1);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIII)I")
	public static int method3225(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 > 243) {
			arg2 >>= 0x4;
		} else if (arg0 > 217) {
			arg2 >>= 0x3;
		} else if (arg0 > 192) {
			arg2 >>= 0x2;
		} else if (arg0 > 179) {
			arg2 >>= 0x1;
		}
		return (arg1 >> 2 << 10) + (arg2 >> 5 << 7) + (arg0 >> 1);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "()V")
	public static void method3227() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < Static11.anInt296; local1++) {
			for (local4 = 0; local4 < Static159.anInt3497; local4++) {
				for (local7 = 0; local7 < Static213.anInt4593; local7++) {
					Static174.aClass1_Sub9ArrayArrayArray2[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static209.anInt4460; local4++) {
			Static43.aClass126Array3[local4] = null;
		}
		Static209.anInt4460 = 0;
		for (local7 = 0; local7 < Static176.anInt3801; local7++) {
			Static30.aClass99Array1[local7] = null;
		}
		Static176.anInt3801 = 0;
		for (@Pc(56) int local56 = 0; local56 < Static172.aClass99Array3.length; local56++) {
			Static172.aClass99Array3[local56] = null;
		}
	}
}
