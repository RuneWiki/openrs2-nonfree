import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!d", name = "T", descriptor = "[I")
	public static int[] anIntArray76;

	@OriginalMember(owner = "client!d", name = "i", descriptor = "[I")
	public static final int[] anIntArray71 = new int[32];

	@OriginalMember(owner = "client!d", name = "B", descriptor = "I")
	public static int anInt1162 = 0;

	@OriginalMember(owner = "client!d", name = "I", descriptor = "I")
	public static int anInt1164 = 0;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method909(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ZI)V")
	public static void method911(@OriginalArg(0) boolean arg0) {
		@Pc(14) byte local14;
		@Pc(16) byte[][] local16;
		if (arg0) {
			local14 = 1;
			local16 = Static81.aByteArrayArray9;
		} else {
			local14 = 4;
			local16 = Static73.aByteArrayArray7;
		}
		for (@Pc(24) int local24 = 0; local24 < local14; local24++) {
			Static123.method2158();
			for (@Pc(30) int local30 = 0; local30 < Static162.anInt2152 >> 3; local30++) {
				for (@Pc(34) int local34 = 0; local34 < Static122.anInt2632 >> 3; local34++) {
					@Pc(44) int local44 = Static94.anIntArrayArrayArray1[local24][local30][local34];
					if (local44 != -1) {
						@Pc(53) int local53 = local44 >> 24 & 0x3;
						if (!arg0 || local53 == 0) {
							@Pc(63) int local63 = local44 >> 1 & 0x3;
							@Pc(69) int local69 = local44 >> 14 & 0x3FF;
							@Pc(75) int local75 = local44 >> 3 & 0x7FF;
							@Pc(86) int local86 = (local69 / 8 << 8) + (local75 / 8);
							for (@Pc(88) int local88 = 0; local88 < Static169.anIntArray239.length; local88++) {
								if (local86 == Static169.anIntArray239[local88] && local16[local88] != null) {
									Static181.method810(local53, local30 * 8, local63, arg0, Static212.aClass122_2, local24, Static34.aClass13Array1, (local69 & 0x7) * 8, local16[local88], (local75 & 0x7) * 8, local34 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IILjava/util/Random;)I")
	public static int method915(@OriginalArg(0) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static338.method5554(arg0)) {
			return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
		} else {
			@Pc(38) int local38 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(41) int local41;
			do {
				local41 = arg1.nextInt();
			} while (local41 >= local38);
			return Static109.method1875(arg0, local41);
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I[BII)I")
	public static int method918(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = -1;
		for (@Pc(14) int local14 = arg2; local14 < arg1; local14++) {
			local12 = local12 >>> 8 ^ Class210.anIntArray553[(local12 ^ arg0[local14]) & 0xFF];
		}
		return ~local12;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIILjava/lang/String;II)V")
	public static void method920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) {
		@Pc(7) Class8_Sub3 local7 = new Class8_Sub3();
		local7.anInt1701 = arg2;
		local7.anInt1706 = arg5;
		local7.anInt1704 = arg0 + Static51.anInt1101;
		local7.anInt1708 = arg3;
		local7.aString56 = arg4;
		local7.anInt1709 = arg1;
		Static21.aClass65_2.method1458(local7);
	}
}
