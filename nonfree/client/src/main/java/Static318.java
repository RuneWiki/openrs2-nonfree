import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!q", name = "B", descriptor = "I")
	public static int anInt5167;

	@OriginalMember(owner = "client!q", name = "G", descriptor = "[I")
	public static int[] anIntArray417;

	@OriginalMember(owner = "client!q", name = "A", descriptor = "Z")
	public static boolean aBoolean371 = false;

	@OriginalMember(owner = "client!q", name = "D", descriptor = "I")
	public static int anInt5169 = 0;

	@OriginalMember(owner = "client!q", name = "F", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_196 = new Class56(4, 20);

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIB)I")
	public static int method4135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = arg0 >> 31 & arg1 - 1;
		return ((arg0 >>> 31) + arg0) % arg1 + local18;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IB)V")
	public static void method4138(@OriginalArg(1) byte arg0) {
		if (Static267.aByteArrayArrayArray14 == null) {
			Static267.aByteArrayArrayArray14 = new byte[4][Static337.anInt5497][Static282.anInt4644];
		}
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static337.anInt5497; local18++) {
				for (@Pc(22) int local22 = 0; local22 < Static282.anInt4644; local22++) {
					Static267.aByteArrayArrayArray14[local14][local18][local22] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(BLclient!hd;)Lclient!hd;")
	public static Class110 method4139(@OriginalArg(1) Class110 arg0) {
		@Pc(11) Class110 local11 = Static55.method754(arg0);
		if (local11 == null) {
			local11 = arg0.aClass110_8;
		}
		return local11;
	}

	@OriginalMember(owner = "client!q", name = "d", descriptor = "(I)V")
	public static void method4141() {
		if (Static165.aBoolean224) {
			return;
		}
		Static165.aBoolean224 = true;
		Static333.aBoolean386 = true;
		if (Static413.aClass49_Sub1_1.aBoolean230) {
			Static439.aFloat99 = (int) Static439.aFloat99 + 47 & 0xFFFFFFF0;
		} else {
			Static390.aFloat102 += (12.0F - Static390.aFloat102) / 2.0F;
		}
	}
}
