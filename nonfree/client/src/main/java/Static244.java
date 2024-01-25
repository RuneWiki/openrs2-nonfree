import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
	public static int anInt6205;

	@OriginalMember(owner = "client!qi", name = "n", descriptor = "Z")
	public static boolean aBoolean511 = false;

	@OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
	public static int anInt6207 = 1;

	@OriginalMember(owner = "client!qi", name = "p", descriptor = "Z")
	public static boolean aBoolean512 = false;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)J")
	public static long method5350() {
		return Static25.aClass11_1.method5104();
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(BII[II)V")
	public static void method5351(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		arg0--;
		@Pc(8) int local8 = arg1 - 1;
		@Pc(11) int local11 = local8 - 7;
		while (local11 > arg0) {
			@Pc(15) int local15 = arg0 + 1;
			arg2[local15] = arg3;
			@Pc(20) int local20 = local15 + 1;
			arg2[local20] = arg3;
			@Pc(25) int local25 = local20 + 1;
			arg2[local25] = arg3;
			@Pc(30) int local30 = local25 + 1;
			arg2[local30] = arg3;
			@Pc(35) int local35 = local30 + 1;
			arg2[local35] = arg3;
			@Pc(40) int local40 = local35 + 1;
			arg2[local40] = arg3;
			@Pc(45) int local45 = local40 + 1;
			arg2[local45] = arg3;
			arg0 = local45 + 1;
			arg2[arg0] = arg3;
		}
		while (arg0 < local8) {
			arg0++;
			arg2[arg0] = arg3;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!ur;Lclient!ur;ZIB)I")
	public static int method5352(@OriginalArg(0) Class127_Sub1 arg0, @OriginalArg(1) Class127_Sub1 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11;
		@Pc(14) int local14;
		if (arg3 == 1) {
			local11 = arg1.anInt6375;
			local14 = arg0.anInt6375;
			if (!arg2) {
				if (local11 == -1) {
					local11 = 2001;
				}
				if (local14 == -1) {
					local14 = 2001;
				}
			}
			return local11 - local14;
		} else if (arg3 == 2) {
			return Static207.method3707(arg0.method5492().aString184, arg1.method5492().aString184, Static331.anInt3763);
		} else if (arg3 == 3) {
			if (arg1.aString251.equals("-")) {
				if (arg0.aString251.equals("-")) {
					return 0;
				} else if (arg2) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg0.aString251.equals("-")) {
				return arg2 ? 1 : -1;
			} else {
				return Static207.method3707(arg0.aString251, arg1.aString251, Static331.anInt3763);
			}
		} else if (arg3 == 4) {
			if (arg1.method5481()) {
				return arg0.method5481() ? 0 : 1;
			} else if (arg0.method5481()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 5) {
			if (arg1.method5482()) {
				return arg0.method5482() ? 0 : 1;
			} else if (arg0.method5482()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 6) {
			if (arg1.method5487()) {
				return arg0.method5487() ? 0 : 1;
			} else if (arg0.method5487()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 7) {
			if (arg1.method5483()) {
				return arg0.method5483() ? 0 : 1;
			} else if (arg0.method5483()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 8) {
			local11 = arg1.anInt6394;
			local14 = arg0.anInt6394;
			if (arg2) {
				if (local11 == 1000) {
					local11 = -1;
				}
				if (local14 == 1000) {
					local14 = -1;
				}
			} else {
				if (local11 == -1) {
					local11 = 1000;
				}
				if (local14 == -1) {
					local14 = 1000;
				}
			}
			return local11 - local14;
		} else {
			return arg1.anInt6390 - arg0.anInt6390;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
	public static void method5353(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static90.anInt1705 >= 100) {
			Static335.method5587(Static259.aString206);
			return;
		}
		@Pc(21) String local21 = Static44.method909(arg0);
		if (local21 == null) {
			return;
		}
		@Pc(66) String local66;
		for (@Pc(31) int local31 = 0; local31 < Static90.anInt1705; local31++) {
			@Pc(39) String local39 = Static44.method909(Static61.aStringArray7[local31]);
			if (local39 != null && local39.equals(local21)) {
				Static335.method5587(arg0 + Static144.aString109);
				return;
			}
			if (Static327.aStringArray41[local31] != null) {
				local66 = Static44.method909(Static327.aStringArray41[local31]);
				if (local66 != null && local66.equals(local21)) {
					Static335.method5587(arg0 + Static144.aString109);
					return;
				}
			}
		}
		for (@Pc(89) int local89 = 0; local89 < Static295.anInt5953; local89++) {
			local66 = Static44.method909(Static301.aStringArray36[local89]);
			if (local66 != null && local66.equals(local21)) {
				Static335.method5587(Static245.aString37 + arg0 + Static204.aString275);
				return;
			}
			if (Static315.aStringArray39[local89] != null) {
				@Pc(128) String local128 = Static44.method909(Static315.aStringArray39[local89]);
				if (local128 != null && local128.equals(local21)) {
					Static335.method5587(Static245.aString37 + arg0 + Static204.aString275);
					return;
				}
			}
		}
		if (Static44.method909(Static127.aClass10_Sub1_Sub2_Sub2_1.aString152).equals(local21)) {
			Static335.method5587(Static29.aString20);
		} else {
			Static305.aClass1_Sub21_Sub2_3.method5757(42);
			Static305.aClass1_Sub21_Sub2_3.method5718(Static165.method2895(arg0) + 1);
			Static305.aClass1_Sub21_Sub2_3.method5752(arg0);
			Static305.aClass1_Sub21_Sub2_3.method5718(arg1 ? 1 : 0);
		}
	}
}
