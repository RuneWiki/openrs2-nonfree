import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!bv", name = "g", descriptor = "F")
	public static float aFloat13;

	@OriginalMember(owner = "client!bv", name = "h", descriptor = "F")
	public static float aFloat14;

	@OriginalMember(owner = "client!bv", name = "e", descriptor = "[J")
	public static final long[] aLongArray2 = new long[32];

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!eo;IIIII)V")
	public static void method596(@OriginalArg(0) Class69 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt3075 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass2_Sub20Array3[local4] != null) {
				arg0.anInt3075++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt3075; local22++) {
			@Pc(31) long local31 = Static351.aLongArrayArrayArray2[arg1][arg2][arg3];
			@Pc(41) Class170 local41;
			while (local31 != 0L) {
				local41 = Static140.aClass170Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass2_Sub20_1 == arg0.aClass2_Sub20Array3[local22]) {
					continue label51;
				}
			}
			local31 = Static351.aLongArrayArrayArray2[arg1][arg4][arg5];
			while (local31 != 0L) {
				local41 = Static140.aClass170Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass2_Sub20_1 == arg0.aClass2_Sub20Array3[local22]) {
					continue label51;
				}
			}
			for (@Pc(93) int local93 = local22; local93 < arg0.anInt3075 - 1; local93++) {
				arg0.aClass2_Sub20Array3[local93] = arg0.aClass2_Sub20Array3[local93 + 1];
			}
			arg0.anInt3075--;
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(I[Lclient!em;IIZI)V")
	public static void method599(@OriginalArg(0) int arg0, @OriginalArg(1) Class68[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(18) Class68 local18 = arg1[local7];
			if (local18 != null && local18.anInt2221 == arg2) {
				Static38.method5044(arg0, arg4, arg3, local18);
				Static357.method4871(local18, arg0, arg3);
				if (local18.anInt2179 - local18.anInt2188 < local18.anInt2176) {
					local18.anInt2176 = local18.anInt2179 - local18.anInt2188;
				}
				if (local18.anInt2243 - local18.anInt2252 < local18.anInt2172) {
					local18.anInt2172 = local18.anInt2243 - local18.anInt2252;
				}
				if (local18.anInt2176 < 0) {
					local18.anInt2176 = 0;
				}
				if (local18.anInt2172 < 0) {
					local18.anInt2172 = 0;
				}
				if (local18.anInt2249 == 0) {
					Static49.method804(local18, arg4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(III)I")
	public static int method600(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(40) int local40 = Static136.method2317(arg0 - 1, arg1 + -1) + Static136.method2317(arg0 + 1, arg1 - 1) + Static136.method2317(arg0 + -1, arg1 + 1) + Static136.method2317(arg0 + 1, arg1 + 1);
		@Pc(69) int local69 = Static136.method2317(arg0 - 1, arg1) + Static136.method2317(arg0 + 1, arg1) + Static136.method2317(arg0, arg1 - 1) + Static136.method2317(arg0, arg1 + 1);
		@Pc(74) int local74 = Static136.method2317(arg0, arg1);
		return local74 / 4 + local69 / 8 + local40 / 16;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIZI)V")
	public static void method601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class2_Sub5_Sub13 local8 = Static208.method3306(arg0, 4);
		local8.method4547();
		local8.anInt5641 = arg3;
		local8.anInt5643 = arg2;
		local8.anInt5644 = arg1;
	}
}
