import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!jt", name = "I", descriptor = "Lclient!lm;")
	public static Class149 aClass149_1;

	@OriginalMember(owner = "client!jt", name = "j", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_72 = new Class205(66, 3);

	@OriginalMember(owner = "client!jt", name = "u", descriptor = "Lclient!hf;")
	public static Class2_Sub21 aClass2_Sub21_2 = null;

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(Lclient!up;IIIII)V")
	public static void method3000(@OriginalArg(0) Class152 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt3737 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) long local16 = Static223.aLongArrayArrayArray1[arg1][local4][local7];
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
						@Pc(35) Class2_Sub17_Sub1 local35 = Static386.aClass2_Sub17_Sub1Array3[local27 - 1];
						for (@Pc(37) int local37 = 0; local37 < arg0.anInt3737; local37++) {
							if (arg0.aClass2_Sub17_Sub1Array2[local37] == local35) {
								local18 += 16L;
								continue label49;
							}
						}
						arg0.aClass2_Sub17_Sub1Array2[arg0.anInt3737++] = local35;
						if (arg0.anInt3737 == 4) {
							break label56;
						}
						local18 += 16L;
					}
				}
			}
		}
		for (local7 = arg0.anInt3737; local7 < 4; local7++) {
			arg0.aClass2_Sub17_Sub1Array2[local7] = null;
		}
	}

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "(IIII)I")
	public static int method3006(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static350.aClass107Array4 == null) {
			return 0;
		}
		@Pc(16) int local16 = arg0 >> 7;
		@Pc(20) int local20 = arg1 >> 7;
		if (local16 < 0 || local20 < 0 || Static246.anInt4374 - 1 < local16 || Static185.anInt3485 - 1 < local20) {
			return 0;
		}
		@Pc(49) int local49 = arg2;
		if (arg2 < 3 && (Static96.aByteArrayArrayArray8[1][local16][local20] & 0x2) != 0) {
			local49 = arg2 + 1;
		}
		return Static350.aClass107Array4[local49].method4673(arg0, arg1);
	}
}
