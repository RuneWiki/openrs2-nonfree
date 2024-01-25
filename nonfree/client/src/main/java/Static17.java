import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!b", name = "g", descriptor = "I")
	public static int anInt349;

	@OriginalMember(owner = "client!b", name = "f", descriptor = "Z")
	public static boolean aBoolean28 = false;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!vq;Lclient!km;IIIII)V")
	public static void method305(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static327.anInt6252) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static198.anInt4128) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static15.anInt1162 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class128 local62 = Static273.aClass128ArrayArrayArray4[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static261.aClass60Array2[local17].method2264(local23, local32) + Static261.aClass60Array2[local17].method2264(local23 + 1, local32) + Static261.aClass60Array2[local17].method2264(local23, local32 + 1) + Static261.aClass60Array2[local17].method2264(local23 + 1, local32 + 1)) / 4 - (Static261.aClass60Array2[arg2].method2264(arg3, arg4) + Static261.aClass60Array2[arg2].method2264(arg3 + 1, arg4) + Static261.aClass60Array2[arg2].method2264(arg3, arg4 + 1) + Static261.aClass60Array2[arg2].method2264(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class8_Sub4 local143 = local62.aClass8_Sub4_1;
									@Pc(146) Class8_Sub4 local146 = local62.aClass8_Sub4_2;
									if (local143 != null && local143.method5622()) {
										arg1.method5621(arg0, local1, local143, (local32 - arg4) * 128 + (1 - arg6) * 64, (local23 - arg3) * 128 + (1 - arg5) * 64, local140);
									}
									if (local146 != null && local146.method5622()) {
										arg1.method5621(arg0, local1, local146, (local32 - arg4) * 128 + (1 - arg6) * 64, (local23 - arg3) * 128 + (1 - arg5) * 64, local140);
									}
									for (@Pc(219) Class117 local219 = local62.aClass117_2; local219 != null; local219 = local219.aClass117_1) {
										@Pc(223) Class8_Sub1 local223 = local219.aClass8_Sub1_1;
										if (local223 != null && local223.method5622() && (local23 == local223.aShort98 || local23 == local3) && (local32 == local223.aShort97 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort96 + 1 - local223.aShort98;
											@Pc(260) int local260 = local223.aShort99 + 1 - local223.aShort97;
											arg1.method5621(arg0, local1, local223, (local223.aShort97 - arg4) * 128 + (local260 - arg6) * 64, (local223.aShort98 - arg3) * 128 + (local252 - arg5) * 64, local140);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
	public static void method306() {
		@Pc(1) Class198 local1 = Static204.aClass198_154;
		synchronized (Static204.aClass198_154) {
			Static204.aClass198_154.method5209();
		}
		local1 = Static349.aClass198_242;
		synchronized (Static349.aClass198_242) {
			Static349.aClass198_242.method5209();
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(III)Z")
	public static boolean method309(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static2.aByteArrayArrayArray1[1][arg1][arg0] & 0x2) != 0;
	}
}
