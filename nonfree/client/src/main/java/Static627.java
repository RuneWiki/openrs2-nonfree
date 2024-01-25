import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static627 {

	@OriginalMember(owner = "client!wh", name = "M", descriptor = "I")
	public static int anInt10492;

	@OriginalMember(owner = "client!wh", name = "N", descriptor = "Lclient!fs;")
	public static Class107 aClass107_5;

	@OriginalMember(owner = "client!wh", name = "I", descriptor = "Lclient!gt;")
	public static final Class123 aClass123_11 = new Class123();

	@OriginalMember(owner = "client!wh", name = "L", descriptor = "Lclient!wd;")
	public static final Class366 aClass366_15 = new Class366(2);

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILclient!pk;)I")
	public static int method8455(@OriginalArg(1) Class15_Sub1_Sub2_Sub2_Sub2 arg0) {
		@Pc(16) Class300 local16 = arg0.aClass300_1;
		if (local16.anIntArray498 != null) {
			local16 = local16.method7306(Static420.aClass77_1);
			if (local16 == null) {
				return -1;
			}
		}
		@Pc(31) int local31 = local16.anInt8879;
		@Pc(35) Class102 local35 = arg0.method6686();
		if (arg0.anInt8107 == -1 || arg0.aBoolean585) {
			local31 = local16.anInt8907;
		} else if (local35.anInt3731 == arg0.anInt8107 || arg0.anInt8107 == local35.anInt3744 || local35.anInt3753 == arg0.anInt8107 || arg0.anInt8107 == local35.anInt3740) {
			local31 = local16.anInt8911;
		} else if (local35.anInt3763 == arg0.anInt8107 || local35.anInt3734 == arg0.anInt8107 || arg0.anInt8107 == local35.anInt3760 || arg0.anInt8107 == local35.anInt3755) {
			local31 = local16.anInt8884;
		}
		return local31;
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(IIB)Z")
	public static boolean method8456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZIIIIIII)V")
	public static void method8457(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = arg5;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = arg0 - arg2;
		@Pc(25) int local25 = arg5 - arg2;
		@Pc(29) int local29 = arg0 * arg0;
		@Pc(33) int local33 = arg5 * arg5;
		@Pc(37) int local37 = local20 * local20;
		@Pc(41) int local41 = local25 * local25;
		@Pc(45) int local45 = local33 << 1;
		@Pc(49) int local49 = local29 << 1;
		@Pc(53) int local53 = local41 << 1;
		@Pc(57) int local57 = local37 << 1;
		@Pc(61) int local61 = arg5 << 1;
		@Pc(65) int local65 = local25 << 1;
		@Pc(73) int local73 = local45 + (1 - local61) * local29;
		@Pc(82) int local82 = local33 - (local61 - 1) * local49;
		@Pc(91) int local91 = local53 + (1 - local65) * local37;
		@Pc(100) int local100 = local41 - (local65 - 1) * local57;
		@Pc(104) int local104 = local29 << 2;
		@Pc(108) int local108 = local33 << 2;
		@Pc(112) int local112 = local37 << 2;
		@Pc(116) int local116 = local41 << 2;
		@Pc(120) int local120 = local45 * 3;
		@Pc(126) int local126 = (local61 - 3) * local49;
		@Pc(130) int local130 = local53 * 3;
		@Pc(136) int local136 = (local65 - 3) * local57;
		@Pc(138) int local138 = local108;
		@Pc(144) int local144 = (arg5 - 1) * local104;
		@Pc(146) int local146 = local116;
		@Pc(152) int local152 = local112 * (local25 - 1);
		@Pc(156) int[] local156 = Static632.anIntArrayArray65[arg6];
		Static36.method1264(local156, arg3 - arg0, arg4, arg3 - local20);
		Static36.method1264(local156, arg3 - local20, arg1, arg3 + local20);
		Static36.method1264(local156, local20 + arg3, arg4, arg3 + arg0);
		while (local14 > 0) {
			@Pc(198) boolean local198 = local14 <= local25;
			if (local73 < 0) {
				while (local73 < 0) {
					local82 += local138;
					local73 += local120;
					local138 += local108;
					local120 += local108;
					local12++;
				}
			}
			if (local198) {
				if (local91 < 0) {
					while (local91 < 0) {
						local91 += local130;
						local100 += local146;
						local16++;
						local130 += local116;
						local146 += local116;
					}
				}
				if (local100 < 0) {
					local91 += local130;
					local100 += local146;
					local146 += local116;
					local16++;
					local130 += local116;
				}
				local100 += -local136;
				local91 += -local152;
				local136 -= local112;
				local152 -= local112;
			}
			if (local82 < 0) {
				local82 += local138;
				local73 += local120;
				local120 += local108;
				local138 += local108;
				local12++;
			}
			local73 += -local144;
			local82 += -local126;
			local14--;
			local126 -= local104;
			local144 -= local104;
			@Pc(335) int local335 = arg6 - local14;
			@Pc(339) int local339 = arg6 + local14;
			@Pc(343) int local343 = arg3 + local12;
			@Pc(348) int local348 = arg3 - local12;
			if (local198) {
				@Pc(372) int local372 = local16 + arg3;
				@Pc(377) int local377 = arg3 - local16;
				Static36.method1264(Static632.anIntArrayArray65[local335], local348, arg4, local377);
				Static36.method1264(Static632.anIntArrayArray65[local335], local377, arg1, local372);
				Static36.method1264(Static632.anIntArrayArray65[local335], local372, arg4, local343);
				Static36.method1264(Static632.anIntArrayArray65[local339], local348, arg4, local377);
				Static36.method1264(Static632.anIntArrayArray65[local339], local377, arg1, local372);
				Static36.method1264(Static632.anIntArrayArray65[local339], local372, arg4, local343);
			} else {
				Static36.method1264(Static632.anIntArrayArray65[local335], local348, arg4, local343);
				Static36.method1264(Static632.anIntArrayArray65[local339], local348, arg4, local343);
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(BI)I")
	public static int method8458(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
