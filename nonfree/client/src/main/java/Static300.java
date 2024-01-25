import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!tk", name = "I", descriptor = "Z")
	public static boolean aBoolean508;

	@OriginalMember(owner = "client!tk", name = "D", descriptor = "Z")
	public static boolean aBoolean507 = false;

	@OriginalMember(owner = "client!tk", name = "M", descriptor = "I")
	public static int anInt5811 = 0;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!qj;ILclient!qj;)V")
	public static void method5113(@OriginalArg(0) Class165 arg0, @OriginalArg(2) Class165 arg1) {
		Static207.aClass165_63 = arg1;
		Static276.aClass165_83 = arg0;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)V")
	public static void method5114(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static23.aBooleanArray2[arg0]) {
			return;
		}
		Static230.aClass165_70.method4482(arg0);
		if (Static314.aClass177ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(26) boolean local26 = true;
		for (@Pc(33) int local33 = 0; local33 < Static314.aClass177ArrayArray1[arg0].length; local33++) {
			if (Static314.aClass177ArrayArray1[arg0][local33] != null) {
				if (Static314.aClass177ArrayArray1[arg0][local33].anInt5208 == 2) {
					local26 = false;
				} else {
					Static314.aClass177ArrayArray1[arg0][local33] = null;
				}
			}
		}
		if (local26) {
			Static314.aClass177ArrayArray1[arg0] = null;
		}
		Static23.aBooleanArray2[arg0] = false;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(BZ)I")
	public static int method5115(@OriginalArg(1) boolean arg0) {
		@Pc(13) long local13 = Static349.method5647();
		for (@Pc(25) Class1_Sub24 local25 = arg0 ? (Class1_Sub24) Static318.aClass26_28.method871() : (Class1_Sub24) Static318.aClass26_28.method878(); local25 != null; local25 = (Class1_Sub24) Static318.aClass26_28.method878()) {
			if (local13 > (local25.aLong140 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local25.aLong140 & 0x4000000000000000L) != 0L) {
					@Pc(50) int local50 = (int) local25.aLong215;
					Static197.anIntArray793[local50] = Static49.anIntArray126[local50];
					local25.method5710();
					return local50;
				}
				local25.method5710();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZLjava/lang/String;Lclient!qj;I)Lclient!af;")
	public static Class6 method5116(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class165 arg2) {
		@Pc(10) int local10 = arg2.method4502(arg1);
		if (local10 == -1) {
			return new Class6(0);
		}
		@Pc(23) int[] local23 = arg2.method4500(local10);
		@Pc(29) Class6 local29 = new Class6(local23.length);
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		while (true) {
			while (local29.anInt158 > local39) {
				@Pc(55) Class1_Sub7 local55 = new Class1_Sub7(arg2.method4508(local23[local41++], local10));
				@Pc(59) int local59 = local55.method3125();
				@Pc(63) int local63 = local55.method3115();
				@Pc(67) int local67 = local55.method3141();
				if (!arg0 && local67 == 1) {
					local29.anInt158--;
				} else {
					local29.anIntArray21[local39] = local59;
					local29.anIntArray22[local39] = local63;
					local39++;
				}
			}
			return local29;
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIII)V")
	public static void method5117(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static138.aClass204ArrayArrayArray1 == null) {
			return;
		}
		@Pc(19) long local19 = (long) (arg0 | arg1 << 28 | arg2 << 14);
		@Pc(32) Class1_Sub39 local32 = (Class1_Sub39) Static52.aClass26_4.method870(local19);
		if (local32 == null) {
			Static267.method4668(arg1, arg0, arg2);
			return;
		}
		@Pc(46) Class1_Sub28 local46 = (Class1_Sub28) local32.aClass195_47.method5029();
		if (local46 == null) {
			Static267.method4668(arg1, arg0, arg2);
			return;
		}
		@Pc(60) Class5_Sub2_Sub1 local60 = (Class5_Sub2_Sub1) Static267.method4668(arg1, arg0, arg2);
		if (local60 == null) {
			local60 = new Class5_Sub2_Sub1();
		} else {
			local60.anInt873 = local60.anInt870 = -1;
		}
		local60.anInt871 = local46.anInt4493;
		local60.anInt876 = local46.anInt4495;
		label44: while (true) {
			@Pc(88) Class1_Sub28 local88 = (Class1_Sub28) local32.aClass195_47.method5021();
			if (local88 == null) {
				break;
			}
			if (local60.anInt876 != local88.anInt4495) {
				local60.anInt873 = local88.anInt4495;
				local60.anInt875 = local88.anInt4493;
				while (true) {
					@Pc(113) Class1_Sub28 local113 = (Class1_Sub28) local32.aClass195_47.method5021();
					if (local113 == null) {
						break label44;
					}
					if (local60.anInt876 != local113.anInt4495 && local60.anInt873 != local113.anInt4495) {
						local60.anInt870 = local113.anInt4495;
						local60.anInt874 = local113.anInt4493;
					}
				}
			}
		}
		@Pc(161) int local161 = Static16.method362((arg0 << 7) + 64, (arg2 << 7) - -64, arg1);
		Static199.method3745(arg1, arg0, arg2, local161, local60);
	}
}
