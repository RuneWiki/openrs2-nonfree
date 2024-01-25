import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!fw", name = "c", descriptor = "I")
	public static int anInt1972;

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lclient!sq;IIIII)V")
	public static void method1585(@OriginalArg(0) Class183 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt4999 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) long local16 = Static404.aLongArrayArrayArray1[arg1][local4][local7];
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
						@Pc(35) Class93 local35 = Static203.aClass93Array1[local27 - 1];
						for (@Pc(37) int local37 = 0; local37 < arg0.anInt4999; local37++) {
							if (arg0.aClass1_Sub29Array3[local37] == local35.aClass1_Sub29_2) {
								local18 += 16L;
								continue label49;
							}
						}
						arg0.aClass1_Sub29Array3[arg0.anInt4999++] = local35.aClass1_Sub29_2;
						if (arg0.anInt4999 == 4) {
							break label56;
						}
						local18 += 16L;
					}
				}
			}
		}
		for (local7 = arg0.anInt4999; local7 < 4; local7++) {
			arg0.aClass1_Sub29Array3[local7] = null;
		}
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(ZIII)I")
	public static int method1586(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 7 - arg1;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(II)I")
	public static int method1587(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(ZZ)Z")
	public static boolean method1588(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}
}
