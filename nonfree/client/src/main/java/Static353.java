import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "[I")
	public static int[] anIntArray552;

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
	public static int anInt6489;

	@OriginalMember(owner = "client!uk", name = "f", descriptor = "[I")
	public static int[] anIntArray553;

	@OriginalMember(owner = "client!uk", name = "o", descriptor = "[Lclient!jj;")
	public static final Class2_Sub7_Sub10[] aClass2_Sub7_Sub10Array4 = new Class2_Sub7_Sub10[14];

	@OriginalMember(owner = "client!uk", name = "s", descriptor = "D")
	public static double aDouble9 = -1.0D;

	@OriginalMember(owner = "client!uk", name = "v", descriptor = "[I")
	public static final int[] anIntArray554 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZIBI)I")
	public static int method5598(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class2_Sub32 local16 = Static76.method1317(arg0, arg1);
		if (local16 == null) {
			return 0;
		} else if (arg2 >= 0 && arg2 < local16.anIntArray471.length) {
			return local16.anIntArray471[arg2];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!rs;IIIII)V")
	public static void method5599(@OriginalArg(0) Class103 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt3024 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) long local16 = Static132.aLongArrayArrayArray1[arg1][local4][local7];
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
						@Pc(35) Class2_Sub8_Sub1 local35 = Static41.aClass2_Sub8_Sub1Array1[local27 - 1];
						for (@Pc(37) int local37 = 0; local37 < arg0.anInt3024; local37++) {
							if (arg0.aClass2_Sub8_Sub1Array3[local37] == local35) {
								local18 += 16L;
								continue label49;
							}
						}
						arg0.aClass2_Sub8_Sub1Array3[arg0.anInt3024++] = local35;
						if (arg0.anInt3024 == 4) {
							break label56;
						}
						local18 += 16L;
					}
				}
			}
		}
		for (local7 = arg0.anInt3024; local7 < 4; local7++) {
			arg0.aClass2_Sub8_Sub1Array3[local7] = null;
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIB)I")
	public static int method5608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(21) int local21 = arg1 - 1 & arg0 >> 31;
		return ((arg0 >>> 31) + arg0) % arg1 + local21;
	}
}
