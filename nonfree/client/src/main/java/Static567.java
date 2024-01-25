import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static567 {

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "I")
	public static int anInt8900;

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "([Lclient!tl;II)V")
	public static void method7862(@OriginalArg(0) Class4_Sub2[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class4_Sub2 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt10233;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt10233 < local27 + (local29 & 0x1)) {
				@Pc(44) Class4_Sub2 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method7862(arg0, arg1, local10 - 1);
		method7862(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Z)J")
	public static synchronized long method7863() {
		@Pc(16) long local16 = System.currentTimeMillis();
		if (Static8.aLong11 > local16) {
			Static471.aLong231 += Static8.aLong11 - local16;
		}
		Static8.aLong11 = local16;
		return Static471.aLong231 + local16;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIB)V")
	public static void method7864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(21) Class2_Sub6_Sub12 local21 = Static636.method8647(19, (long) arg1 | (long) arg0 << 32);
		local21.method6245();
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(B[SI[Ljava/lang/String;I)V")
	public static void method7865(@OriginalArg(1) short[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= arg3) {
			return;
		}
		@Pc(23) int local23 = (arg3 + arg1) / 2;
		@Pc(25) int local25 = arg1;
		@Pc(29) String local29 = arg2[local23];
		arg2[local23] = arg2[arg3];
		arg2[arg3] = local29;
		@Pc(43) short local43 = arg0[local23];
		arg0[local23] = arg0[arg3];
		arg0[arg3] = local43;
		for (@Pc(55) int local55 = arg1; local55 < arg3; local55++) {
			if (local29 == null || arg2[local55] != null && (local55 & 0x1) > arg2[local55].compareTo(local29)) {
				@Pc(82) String local82 = arg2[local55];
				arg2[local55] = arg2[local25];
				arg2[local25] = local82;
				@Pc(96) short local96 = arg0[local55];
				arg0[local55] = arg0[local25];
				arg0[local25++] = local96;
			}
		}
		arg2[arg3] = arg2[local25];
		arg2[local25] = local29;
		arg0[arg3] = arg0[local25];
		arg0[local25] = local43;
		method7865(arg0, arg1, arg2, local25 - 1);
		method7865(arg0, local25 + 1, arg2, arg3);
	}
}
