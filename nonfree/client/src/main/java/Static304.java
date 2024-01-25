import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!tr", name = "p", descriptor = "F")
	public static float aFloat76;

	@OriginalMember(owner = "client!tr", name = "q", descriptor = "[Lclient!cq;")
	public static Class8[] aClass8Array13;

	@OriginalMember(owner = "client!tr", name = "k", descriptor = "I")
	public static int anInt6088 = -1;

	@OriginalMember(owner = "client!tr", name = "n", descriptor = "Lclient!kp;")
	public static final Class126 aClass126_1 = new Class126();

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIIIII)I")
	public static int method5273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg0 & 0x1) == 1) {
			@Pc(12) int local12 = arg4;
			arg4 = arg1;
			arg1 = local12;
		}
		@Pc(20) int local20 = arg2 & 0x3;
		if (local20 == 0) {
			return arg3;
		} else if (local20 == 1) {
			return arg5;
		} else if (local20 == 2) {
			return 1 + 7 - arg4 - arg3;
		} else {
			return 7 + 1 - arg5 - arg1;
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(ILjava/util/Random;I)I")
	public static int method5274(@OriginalArg(1) Random arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static43.method896(arg1)) {
			return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
		} else {
			@Pc(38) int local38 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(41) int local41;
			do {
				local41 = arg0.nextInt();
			} while (local38 <= local41);
			return Static180.method3196(local41, arg1);
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(II)I")
	public static int method5275(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(36) int local36 = local22 | local22 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return local42 + 1;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method5276(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(8) String local8 = arg1.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(21) int local21 = 0;
		@Pc(27) int local27 = arg0 ? 32768 : 0;
		@Pc(35) int local35 = (arg0 ? Static85.anInt1642 : Static41.anInt1130) + local27;
		for (@Pc(37) int local37 = local27; local37 < local35; local37++) {
			@Pc(43) Class1_Sub2_Sub2 local43 = Static106.method1656(local37);
			if (local43.aBoolean74 && local43.method886().toLowerCase().indexOf(local8) != -1) {
				if (local21 >= 50) {
					Static273.aShortArray89 = null;
					Static210.anInt4430 = -1;
					return;
				}
				if (local21 >= local11.length) {
					@Pc(75) short[] local75 = new short[local11.length * 2];
					for (@Pc(77) int local77 = 0; local77 < local21; local77++) {
						local75[local77] = local11[local77];
					}
					local11 = local75;
				}
				local11[local21++] = (short) local37;
			}
		}
		Static138.anInt6325 = 0;
		Static210.anInt4430 = local21;
		Static273.aShortArray89 = local11;
		@Pc(110) String[] local110 = new String[Static210.anInt4430];
		for (@Pc(112) int local112 = 0; local112 < Static210.anInt4430; local112++) {
			local110[local112] = Static106.method1656(local11[local112]).method886();
		}
		Static288.method5031(local110, Static273.aShortArray89);
	}
}
