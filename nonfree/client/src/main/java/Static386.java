import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static386 {

	@OriginalMember(owner = "client!oi", name = "B", descriptor = "I")
	public static int anInt6800;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIB)Lclient!ni;")
	public static Class6_Sub1_Sub1_Sub1 method5686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) Class346 local11 = Static389.aClass346ArrayArrayArray2[arg1][arg0][arg2];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class6_Sub1_Sub1_Sub1 local17 = null;
		@Pc(24) int local24 = -1;
		for (@Pc(27) Class153 local27 = local11.aClass153_3; local27 != null; local27 = local27.aClass153_1) {
			@Pc(31) Class6_Sub1_Sub1 local31 = local27.aClass6_Sub1_Sub1_1;
			if (local31 instanceof Class6_Sub1_Sub1_Sub1) {
				@Pc(37) Class6_Sub1_Sub1_Sub1 local37 = (Class6_Sub1_Sub1_Sub1) local31;
				@Pc(47) int local47 = (local37.method6165() - 1) * 256 + 252;
				@Pc(54) int local54 = local37.anInt8761 - local47 >> 9;
				@Pc(62) int local62 = local37.anInt8764 - local47 >> 9;
				@Pc(69) int local69 = local47 + local37.anInt8761 >> 9;
				@Pc(76) int local76 = local37.anInt8764 + local47 >> 9;
				if (arg0 >= local54 && arg2 >= local62 && arg0 <= local69 && local76 >= arg2) {
					@Pc(108) int local108 = (local76 + 1 - arg2) * (local69 - -1 - arg0);
					if (local108 > local24) {
						local24 = local108;
						local17 = local37;
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)I")
	public static int method5688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static435.aByteArrayArray2 == null ? 0 : Static435.aByteArrayArray2[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "([Lclient!lo;II)V")
	public static void method5689(@OriginalArg(0) Class6_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class6_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt8758;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt8758 > local27 + (local29 & 0x1)) {
				@Pc(44) Class6_Sub1 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method5689(arg0, arg1, local10 - 1);
		method5689(arg0, local10 + 1, arg2);
	}
}
