import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!aca", name = "e", descriptor = "I")
	public static int anInt163 = 1;

	@OriginalMember(owner = "client!aca", name = "h", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_2 = new Class252(4, -1);

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(IZ)V")
	public static void method369(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub2_Sub16 local8 = Static422.method6588(16, arg0);
		local8.method6700();
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(Lclient!lp;IIIII)V")
	public static void method370(@OriginalArg(0) Class111 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt2977 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) long local16 = Static8.aLongArrayArrayArray1[arg1][local4][local7];
				@Pc(18) long local18 = 0L;
				while (true) {
					label49: while (true) {
						if (local18 > 48L) {
							continue label54;
						}
						@Pc(27) int local27 = (int) (local16 >>> (int) local18 & 0xFFFFL);
						if (local27 <= 0) {
							continue label54;
						}
						@Pc(35) Class108 local35 = Static102.aClass108Array1[local27 - 1];
						for (@Pc(37) int local37 = 0; local37 < arg0.anInt2977; local37++) {
							if (arg0.aClass1_Sub5Array3[local37] == local35.aClass1_Sub5_1) {
								local18 += 16L;
								continue label49;
							}
						}
						arg0.aClass1_Sub5Array3[arg0.anInt2977++] = local35.aClass1_Sub5_1;
						if (arg0.anInt2977 == 4) {
							break label56;
						}
						local18 += 16L;
					}
				}
			}
		}
		for (local7 = arg0.anInt2977; local7 < 4; local7++) {
			arg0.aClass1_Sub5Array3[local7] = null;
		}
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(I)Z")
	public static boolean method372() {
		if (Static23.aBoolean56) {
			try {
				if ((Boolean) Static558.method7782("showingVideoAd", Static473.aClass229_14.anApplet1)) {
					return false;
				}
				return true;
			} catch (@Pc(18) Throwable local18) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!aca", name = "b", descriptor = "(I)V")
	public static void method373() {
		if (Static186.anInt3863 == 8) {
			Static506.method7745(4);
		} else if (Static186.anInt3863 == 4 || Static186.anInt3863 == 5) {
			Static506.method7745(2);
		} else if (Static186.anInt3863 == 11) {
			Static506.method7745(2);
		}
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(IIIIIIIZ)V")
	public static void method374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = arg1 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(39) int local39 = Static419.aShort95 + (Static402.aShort90 - Static419.aShort95) * local7 / 100;
		@Pc(45) int local45 = arg6 * local39 >> 8;
		@Pc(52) int local52 = 16384 - arg3 & 0x3FFF;
		@Pc(59) int local59 = 16384 - arg0 & 0x3FFF;
		@Pc(61) int local61 = 0;
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = local45;
		if (local52 != 0) {
			local63 = Class200_Sub1.lb[local52] * -local45 >> 15;
			local65 = Class200_Sub1.anIntArray576[local52] * local45 >> 15;
		}
		if (local59 != 0) {
			local61 = Class200_Sub1.lb[local59] * local65 >> 15;
			local65 = local65 * Class200_Sub1.anIntArray576[local59] >> 15;
		}
		Static46.anInt1256 = arg5 - local65;
		Static469.anInt8096 = arg0;
		Static276.anInt8653 = arg4 - local63;
		Static536.anInt9434 = arg3;
		Static321.anInt6064 = arg2 - local61;
		Static505.anInt6155 = 0;
	}
}
