import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!vb", name = "z", descriptor = "I")
	public static int anInt4667;

	@OriginalMember(owner = "client!vb", name = "q", descriptor = "Lclient!qe;")
	public static Class78 aClass78_825 = Static199.method3560("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!vb", name = "r", descriptor = "Lclient!qe;")
	public static Class78 aClass78_826 = Static199.method3560(")1p");

	@OriginalMember(owner = "client!vb", name = "y", descriptor = "[I")
	public static int[] anIntArray743 = new int[32];

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BII)V")
	public static void method3689(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static94.anIntArray369[arg0] = arg1;
		@Pc(19) Class2_Sub4 local19 = (Class2_Sub4) Static213.aClass103_11.method3659((long) arg0);
		if (local19 == null) {
			local19 = new Class2_Sub4(4611686018427387905L);
			Static213.aClass103_11.method3665((long) arg0, local19);
		} else if (local19.aLong17 != 4611686018427387905L) {
			local19.aLong17 = Static111.method1911() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BIIZI[Lclient!mj;)V")
	public static void method3691(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class64[] arg4) {
		for (@Pc(1) int local1 = 0; local1 < arg4.length; local1++) {
			@Pc(6) Class64 local6 = arg4[local1];
			if (local6 != null && arg1 == local6.anInt3075) {
				Static192.method3524(local6, arg0, arg2, arg3);
				Static201.method3580(arg3, local6, arg0);
				if (local6.anInt3082 - local6.anInt3040 < local6.anInt3046) {
					local6.anInt3046 = local6.anInt3082 - local6.anInt3040;
				}
				if (local6.anInt3046 < 0) {
					local6.anInt3046 = 0;
				}
				if (local6.anInt3037 > local6.anInt3074 - local6.anInt3021) {
					local6.anInt3037 = local6.anInt3074 - local6.anInt3021;
				}
				if (local6.anInt3037 < 0) {
					local6.anInt3037 = 0;
				}
				if (local6.anInt3051 == 0) {
					Static109.method1892(arg2, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)I")
	public static int method3693(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(24) int local24 = (local13 & 0x33333333) + (local13 >>> 2 & 0xB3333333);
		@Pc(33) int local33 = local24 + (local24 >>> 4) & 0xF0F0F0F;
		@Pc(44) int local44 = local33 + (local33 >>> 8);
		@Pc(50) int local50 = local44 + (local44 >>> 16);
		return local50 & 0xFF;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)V")
	public static void method3696() {
		for (@Pc(8) Class2_Sub11 local8 = (Class2_Sub11) Static12.aClass103_4.method3668(); local8 != null; local8 = (Class2_Sub11) Static12.aClass103_4.method3666()) {
			@Pc(22) int local22 = local8.anInt726;
			if (Static80.method1339(local22)) {
				@Pc(28) boolean local28 = true;
				@Pc(32) Class64[] local32 = Static181.aClass64ArrayArray1[local22];
				for (@Pc(34) int local34 = 0; local34 < local32.length; local34++) {
					if (local32[local34] != null) {
						local28 = local32[local34].aBoolean132;
						break;
					}
				}
				if (!local28) {
					@Pc(56) int local56 = (int) local8.aLong188;
					@Pc(60) Class64 local60 = Static204.method3618(local56);
					if (local60 != null) {
						Static70.method2259(local60);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)I")
	public static int method3698(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class2_Sub26 local10 = (Class2_Sub26) Static48.aClass103_6.method3659((long) arg0);
		if (local10 == null) {
			return 0;
		} else if (arg1 >= 0 && local10.anIntArray602.length > arg1) {
			return local10.anIntArray602[arg1];
		} else {
			return 0;
		}
	}
}
