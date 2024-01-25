import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!cv", name = "K", descriptor = "I")
	public static int anInt2013;

	@OriginalMember(owner = "client!cv", name = "W", descriptor = "Lclient!oa;")
	public static Class210 aClass210_1;

	@OriginalMember(owner = "client!cv", name = "L", descriptor = "Lclient!sl;")
	public static final Class266 aClass266_3 = new Class266("", 15);

	@OriginalMember(owner = "client!cv", name = "cb", descriptor = "Z")
	public static boolean aBoolean151 = false;

	@OriginalMember(owner = "client!cv", name = "eb", descriptor = "I")
	public static final int anInt2028 = 328;

	@OriginalMember(owner = "client!cv", name = "gb", descriptor = "Lclient!aq;")
	public static final Class16 aClass16_3 = new Class16(4);

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "(II)I")
	public static int method1940(@OriginalArg(1) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lclient!fw;IIIII)V")
	public static void method1942(@OriginalArg(0) Class96 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt3335 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) long local16 = Static17.aLongArrayArrayArray1[arg1][local4][local7];
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
						@Pc(35) Class201 local35 = Static172.aClass201Array3[local27 - 1];
						for (@Pc(37) int local37 = 0; local37 < arg0.anInt3335; local37++) {
							if (arg0.aClass1_Sub27Array4[local37] == local35.aClass1_Sub27_2) {
								local18 += 16L;
								continue label49;
							}
						}
						arg0.aClass1_Sub27Array4[arg0.anInt3335++] = local35.aClass1_Sub27_2;
						if (arg0.anInt3335 == 4) {
							break label56;
						}
						local18 += 16L;
					}
				}
			}
		}
		for (local7 = arg0.anInt3335; local7 < 4; local7++) {
			arg0.aClass1_Sub27Array4[local7] = null;
		}
	}
}
