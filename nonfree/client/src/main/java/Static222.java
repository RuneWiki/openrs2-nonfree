import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!kt", name = "r", descriptor = "I")
	public static int anInt4443;

	@OriginalMember(owner = "client!kt", name = "t", descriptor = "I")
	public static int anInt4445;

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(I)I")
	public static int method3438() {
		return 16;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(II)V")
	public static void method3439(@OriginalArg(0) int arg0) {
		if (arg0 != -1 && Static412.aBooleanArray24[arg0]) {
			Static311.aClass211_73.method4753(arg0);
			Static293.aClass68ArrayArray4[arg0] = null;
			Static181.aClass68ArrayArray3[arg0] = null;
			Static412.aBooleanArray24[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "([I[ILclient!bl;[II)V")
	public static void method3440(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class30_Sub1_Sub1_Sub1 arg2, @OriginalArg(3) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(15) int local15 = arg0[local7];
			@Pc(19) int local19 = arg3[local7];
			@Pc(23) int local23 = arg1[local7];
			for (@Pc(25) int local25 = 0; local19 != 0 && arg2.aClass232Array3.length > local25; local25++) {
				if ((local19 & 0x1) != 0) {
					if (local15 == -1) {
						arg2.aClass232Array3[local25] = null;
					} else {
						@Pc(50) Class235 local50 = Static107.aClass239_1.method5420(local15);
						@Pc(53) int local53 = local50.anInt6852;
						@Pc(58) Class232 local58 = arg2.aClass232Array3[local25];
						if (local58 != null) {
							if (local58.anInt6764 == local15) {
								if (local53 == 0) {
									local58 = arg2.aClass232Array3[local25] = null;
								} else if (local53 == 1) {
									local58.anInt6772 = 0;
									local58.anInt6768 = local23;
									local58.anInt6765 = 0;
									local58.anInt6767 = 0;
									local58.anInt6770 = 1;
									Static290.method4258(arg2.anInt7488, 0, arg2.aByte102, arg2.anInt7490, false, local50);
								} else if (local53 == 2) {
									local58.anInt6772 = 0;
								}
							} else if (local50.anInt6856 >= Static107.aClass239_1.method5420(local58.anInt6764).anInt6856) {
								local58 = arg2.aClass232Array3[local25] = null;
							}
						}
						if (local58 == null) {
							local58 = arg2.aClass232Array3[local25] = new Class232();
							local58.anInt6768 = local23;
							local58.anInt6764 = local15;
							local58.anInt6770 = 1;
							local58.anInt6765 = 0;
							local58.anInt6767 = 0;
							local58.anInt6772 = 0;
							Static290.method4258(arg2.anInt7488, 0, arg2.aByte102, arg2.anInt7490, false, local50);
						}
					}
				}
				local19 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method3441(@OriginalArg(0) String arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static41.aStringArray7.length; local12++) {
			if (Static41.aStringArray7[local12].equalsIgnoreCase(arg0)) {
				return local12;
			}
		}
		return -1;
	}
}
