import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!ica", name = "h", descriptor = "I")
	public static int anInt3913;

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(III)Z")
	public static boolean method3457(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) boolean local18 = (arg1 & 0x37) == 0 ? Static394.method5729(arg1, arg0) : Static536.method7429(arg1, arg0);
		return Static56.method840(arg1, arg0) | (arg0 & 0x10000) != 0 | local18;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIIIIII)V")
	public static void method3458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static556.method7635(arg0);
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg0 - arg4;
		if (local14 < 0) {
			local14 = 0;
		}
		@Pc(23) int local23 = arg0;
		@Pc(26) int local26 = -arg0;
		@Pc(28) int local28 = local14;
		@Pc(31) int local31 = -local14;
		@Pc(33) int local33 = -1;
		@Pc(56) int local56;
		@Pc(64) int local64;
		@Pc(73) int local73;
		@Pc(81) int local81;
		if (arg5 >= Static128.anInt2200 && Static380.anInt6585 >= arg5) {
			@Pc(47) int[] local47 = Static286.anIntArrayArray42[arg5];
			local56 = Static439.method6578(arg2 - arg0, Static361.anInt6317, Static651.anInt10267);
			local64 = Static439.method6578(arg0 + arg2, Static361.anInt6317, Static651.anInt10267);
			local73 = Static439.method6578(arg2 - local14, Static361.anInt6317, Static651.anInt10267);
			local81 = Static439.method6578(local14 + arg2, Static361.anInt6317, Static651.anInt10267);
			Static343.method5202(local56, local47, arg1, local73);
			Static343.method5202(local73, local47, arg3, local81);
			Static343.method5202(local81, local47, arg1, local64);
		}
		@Pc(103) int local103 = -1;
		while (local23 > local10) {
			local103 += 2;
			local33 += 2;
			local31 += local103;
			local26 += local33;
			if (local31 >= 0 && local28 >= 1) {
				local28--;
				Static131.anIntArray115[local28] = local10;
				local31 -= local28 << 1;
			}
			local10++;
			@Pc(199) int local199;
			@Pc(207) int local207;
			@Pc(214) int[] local214;
			@Pc(153) int local153;
			if (local26 >= 0) {
				local23--;
				local26 -= local23 << 1;
				local153 = arg5 - local23;
				local56 = local23 + arg5;
				if (Static128.anInt2200 <= local56 && Static380.anInt6585 >= local153) {
					if (local23 < local14) {
						local64 = Static131.anIntArray115[local23];
						local73 = Static439.method6578(local10 + arg2, Static361.anInt6317, Static651.anInt10267);
						local81 = Static439.method6578(arg2 - local10, Static361.anInt6317, Static651.anInt10267);
						local199 = Static439.method6578(local64 + arg2, Static361.anInt6317, Static651.anInt10267);
						local207 = Static439.method6578(arg2 - local64, Static361.anInt6317, Static651.anInt10267);
						if (local56 <= Static380.anInt6585) {
							local214 = Static286.anIntArrayArray42[local56];
							Static343.method5202(local81, local214, arg1, local207);
							Static343.method5202(local207, local214, arg3, local199);
							Static343.method5202(local199, local214, arg1, local73);
						}
						if (local153 >= Static128.anInt2200) {
							local214 = Static286.anIntArrayArray42[local153];
							Static343.method5202(local81, local214, arg1, local207);
							Static343.method5202(local207, local214, arg3, local199);
							Static343.method5202(local199, local214, arg1, local73);
						}
					} else {
						local64 = Static439.method6578(local10 + arg2, Static361.anInt6317, Static651.anInt10267);
						local73 = Static439.method6578(arg2 - local10, Static361.anInt6317, Static651.anInt10267);
						if (local56 <= Static380.anInt6585) {
							Static343.method5202(local73, Static286.anIntArrayArray42[local56], arg1, local64);
						}
						if (local153 >= Static128.anInt2200) {
							Static343.method5202(local73, Static286.anIntArrayArray42[local153], arg1, local64);
						}
					}
				}
			}
			local153 = arg5 - local10;
			local56 = local10 + arg5;
			if (Static128.anInt2200 <= local56 && Static380.anInt6585 >= local153) {
				local64 = local23 + arg2;
				local73 = arg2 - local23;
				if (Static361.anInt6317 <= local64 && Static651.anInt10267 >= local73) {
					local64 = Static439.method6578(local64, Static361.anInt6317, Static651.anInt10267);
					local73 = Static439.method6578(local73, Static361.anInt6317, Static651.anInt10267);
					if (local14 > local10) {
						local81 = local28 >= local10 ? local28 : Static131.anIntArray115[local10];
						local199 = Static439.method6578(local81 + arg2, Static361.anInt6317, Static651.anInt10267);
						local207 = Static439.method6578(arg2 - local81, Static361.anInt6317, Static651.anInt10267);
						if (Static380.anInt6585 >= local56) {
							local214 = Static286.anIntArrayArray42[local56];
							Static343.method5202(local73, local214, arg1, local207);
							Static343.method5202(local207, local214, arg3, local199);
							Static343.method5202(local199, local214, arg1, local64);
						}
						if (local153 >= Static128.anInt2200) {
							local214 = Static286.anIntArrayArray42[local153];
							Static343.method5202(local73, local214, arg1, local207);
							Static343.method5202(local207, local214, arg3, local199);
							Static343.method5202(local199, local214, arg1, local64);
						}
					} else {
						if (local56 <= Static380.anInt6585) {
							Static343.method5202(local73, Static286.anIntArrayArray42[local56], arg1, local64);
						}
						if (Static128.anInt2200 <= local153) {
							Static343.method5202(local73, Static286.anIntArrayArray42[local153], arg1, local64);
						}
					}
				}
			}
		}
	}
}
