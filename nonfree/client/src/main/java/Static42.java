import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!cl", name = "Z", descriptor = "Lclient!vg;")
	public static Class101 aClass101_1;

	@OriginalMember(owner = "client!cl", name = "M", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_12 = new Class93("Attack", "Angreifen", "Attaquer", "Atacar");

	@OriginalMember(owner = "client!cl", name = "X", descriptor = "Z")
	public static boolean aBoolean84 = false;

	@OriginalMember(owner = "client!cl", name = "Y", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_13 = new Class93("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

	@OriginalMember(owner = "client!cl", name = "ab", descriptor = "Ljava/lang/String;")
	public static String aString11 = null;

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(IB)Lclient!oa;")
	public static Class2_Sub11_Sub14 method990(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub11_Sub14 local10 = (Class2_Sub11_Sub14) Static221.aClass179_7.method5092((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25;
		if (arg0 < 32768) {
			local25 = Static217.aClass191_142.method5459(0, arg0);
		} else {
			local25 = Static187.aClass191_119.method5459(0, arg0 & 0x7FFF);
		}
		local10 = new Class2_Sub11_Sub14();
		if (local25 != null) {
			local10.method3934(new Class2_Sub10(local25));
		}
		if (arg0 >= 32768) {
			local10.method3929();
		}
		Static221.aClass179_7.method5085(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZII)Lclient!jm;")
	public static Class2_Sub26 method991(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(23) long local23 = (long) (arg1 | (arg0 ? Integer.MIN_VALUE : 0));
		return (Class2_Sub26) Static210.aClass199_20.method5751(local23);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IILclient!ae;IIBLclient!hb;Lclient!on;I)V")
	public static void method992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class77 arg5, @OriginalArg(7) Class146 arg6, @OriginalArg(8) int arg7) {
		@Pc(13) Class120 local13 = Static278.method5042(arg4);
		if (local13 == null || !local13.aBoolean322 || !local13.method3337()) {
			return;
		}
		@Pc(32) int local32;
		if (local13.anIntArray297 != null) {
			@Pc(30) int[] local30 = new int[local13.anIntArray297.length];
			@Pc(44) int local44;
			for (local32 = 0; local32 < local30.length / 2; local32++) {
				if (Static182.anInt3602 == 4) {
					local44 = (int) Static92.aFloat28 & 0x3FFF;
				} else {
					local44 = (int) Static92.aFloat28 + Static256.anInt5068 & 0x3FFF;
				}
				@Pc(55) int local55 = Class24.anIntArray35[local44];
				@Pc(59) int local59 = Class24.anIntArray36[local44];
				if (Static182.anInt3602 != 4) {
					local55 = local55 * 256 / (Static331.anInt3201 + 256);
					local59 = local59 * 256 / (Static331.anInt3201 + 256);
				}
				local30[local32 * 2] = (local59 * (arg7 + local13.anIntArray297[local32 * 2] * 4) + (arg1 + local13.anIntArray297[local32 * 2 + 1] * 4) * local55 >> 15) + arg6.anInt4468 / 2 + arg3;
				local30[local32 * 2 + 1] = arg6.anInt4414 / 2 + arg0 - (local59 * (arg1 + local13.anIntArray297[local32 * 2 + 1] * 4) - (arg7 + local13.anIntArray297[local32 * 2] * 4) * local55 >> 15);
			}
			Static16.method636(arg2, local30, local13.anInt3664, arg6.anIntArray351, arg6.anIntArray347);
			for (local44 = 0; local44 < local30.length / 2 - 1; local44++) {
				arg2.method4250(local30[local44 * 2], local30[local44 * 2 + 1], local30[local44 * 2 + 2], local30[local44 * 2 + 3], local13.anInt3655, arg5, arg3, arg0);
			}
			arg2.method4250(local30[local30.length - 2], local30[local30.length - 1], local30[0], local30[1], local13.anInt3655, arg5, arg3, arg0);
		}
		@Pc(266) Class31 local266 = null;
		if (local13.anInt3646 != -1) {
			local266 = local13.method3330(arg2, false);
			if (local266 != null) {
				Static29.method766(arg1, local266, arg6, arg3, arg5, arg7, arg0);
			}
		}
		if (local13.aString32 == null) {
			return;
		}
		local32 = 0;
		if (local266 != null) {
			local32 = local266.method4393();
		}
		@Pc(300) Class37 local300 = Static299.aClass37_5;
		@Pc(302) Class188 local302 = Static203.aClass188_7;
		if (local13.anInt3662 == 1) {
			local300 = Static193.aClass37_2;
			local302 = Static24.aClass188_1;
		}
		if (local13.anInt3662 == 2) {
			local302 = Static289.aClass188_8;
			local300 = Static56.aClass37_1;
		}
		Static188.method3699(arg5, local13.aString32, arg3, arg7, local32, local302, arg0, local13.anInt3663, local300, arg6, arg1);
		return;
	}

	@OriginalMember(owner = "client!cl", name = "f", descriptor = "(I)V")
	public static void method994() {
		Static345.aClass119_21.method3304();
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIIIB)V")
	public static void method995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static71.method1642(arg5);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg5 - arg2;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(21) int local21 = arg5;
		@Pc(24) int local24 = -arg5;
		@Pc(26) int local26 = local15;
		@Pc(29) int local29 = -local15;
		@Pc(31) int local31 = -1;
		@Pc(33) int local33 = -1;
		@Pc(37) int[] local37 = Static146.anIntArrayArray91[arg1];
		@Pc(42) int local42 = arg4 - local15;
		Static205.method3670(arg3, local42, local37, arg4 - arg5);
		@Pc(54) int local54 = local15 + arg4;
		Static205.method3670(arg0, local54, local37, local42);
		Static205.method3670(arg3, arg4 + arg5, local37, local54);
		while (local21 > local10) {
			local31 += 2;
			local33 += 2;
			local24 += local31;
			local29 += local33;
			if (local29 >= 0 && local26 >= 1) {
				Static300.anIntArray424[local26] = local10;
				local26--;
				local29 -= local26 << 1;
			}
			local10++;
			@Pc(131) int[] local131;
			@Pc(138) int[] local138;
			@Pc(142) int local142;
			@Pc(147) int local147;
			@Pc(188) int local188;
			@Pc(193) int local193;
			@Pc(198) int local198;
			if (local24 >= 0) {
				local21--;
				if (local15 <= local21) {
					local131 = Static146.anIntArrayArray91[local21 + arg1];
					local138 = Static146.anIntArrayArray91[arg1 - local21];
					local142 = local10 + arg4;
					local147 = arg4 - local10;
					Static205.method3670(arg3, local142, local131, local147);
					Static205.method3670(arg3, local142, local138, local147);
				} else {
					local131 = Static146.anIntArrayArray91[local21 + arg1];
					local138 = Static146.anIntArrayArray91[arg1 - local21];
					local142 = Static300.anIntArray424[local21];
					local147 = local10 + arg4;
					local188 = arg4 - local10;
					local193 = arg4 + local142;
					local198 = arg4 - local142;
					Static205.method3670(arg3, local198, local131, local188);
					Static205.method3670(arg0, local193, local131, local198);
					Static205.method3670(arg3, local147, local131, local193);
					Static205.method3670(arg3, local198, local138, local188);
					Static205.method3670(arg0, local193, local138, local198);
					Static205.method3670(arg3, local147, local138, local193);
				}
				local24 -= local21 << 1;
			}
			local131 = Static146.anIntArrayArray91[arg1 + local10];
			local138 = Static146.anIntArrayArray91[arg1 - local10];
			local142 = arg4 + local21;
			local147 = arg4 - local21;
			if (local10 < local15) {
				local188 = local10 <= local26 ? local26 : Static300.anIntArray424[local10];
				local193 = local188 + arg4;
				local198 = arg4 - local188;
				Static205.method3670(arg3, local198, local131, local147);
				Static205.method3670(arg0, local193, local131, local198);
				Static205.method3670(arg3, local142, local131, local193);
				Static205.method3670(arg3, local198, local138, local147);
				Static205.method3670(arg0, local193, local138, local198);
				Static205.method3670(arg3, local142, local138, local193);
			} else {
				Static205.method3670(arg3, local142, local131, local147);
				Static205.method3670(arg3, local142, local138, local147);
			}
		}
	}
}
