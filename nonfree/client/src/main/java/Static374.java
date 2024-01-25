import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!sv", name = "d", descriptor = "I")
	public static int anInt6749;

	@OriginalMember(owner = "client!sv", name = "g", descriptor = "I")
	public static int anInt6752 = 1;

	@OriginalMember(owner = "client!sv", name = "i", descriptor = "Lclient!rl;")
	public static final Class209 aClass209_1 = new Class209();

	@OriginalMember(owner = "client!sv", name = "j", descriptor = "Z")
	public static boolean aBoolean546 = true;

	@OriginalMember(owner = "client!sv", name = "k", descriptor = "[I")
	public static final int[] anIntArray501 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!at;IIIII)V")
	public static void method5290(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt300 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) long local16 = Static392.aLongArrayArrayArray1[arg1][local4][local7];
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
						@Pc(35) Class253 local35 = Static352.aClass253Array1[local27 - 1];
						for (@Pc(37) int local37 = 0; local37 < arg0.anInt300; local37++) {
							if (arg0.aClass1_Sub12Array2[local37] == local35.aClass1_Sub12_2) {
								local18 += 16L;
								continue label49;
							}
						}
						arg0.aClass1_Sub12Array2[arg0.anInt300++] = local35.aClass1_Sub12_2;
						if (arg0.anInt300 == 4) {
							break label56;
						}
						local18 += 16L;
					}
				}
			}
		}
		for (local7 = arg0.anInt300; local7 < 4; local7++) {
			arg0.aClass1_Sub12Array2[local7] = null;
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(ZLclient!tn;)Lclient!tn;")
	public static Class229 method5292(@OriginalArg(1) Class229 arg0) {
		@Pc(11) Class229 local11 = Static51.method754(arg0);
		if (local11 == null) {
			local11 = arg0.aClass229_11;
		}
		return local11;
	}
}
