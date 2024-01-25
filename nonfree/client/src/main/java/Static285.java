import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
	public static int anInt5065;

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
	public static int anInt5068 = -1;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!sl;Ljava/lang/String;I)I")
	public static int method4569(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(1) String arg1) {
		@Pc(11) int local11 = arg0.anInt4736;
		@Pc(15) byte[] local15 = Static537.method7869(arg1);
		arg0.method4214(local15.length);
		arg0.anInt4736 += Static151.aClass303_1.method7627(0, local15.length, local15, arg0.aByteArray54, arg0.anInt4736);
		return arg0.anInt4736 - local11;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([Lclient!jw;II)V")
	public static void method4570(@OriginalArg(0) Class4_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class4_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt8918;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt8918 < local27 + (local29 & 0x1)) {
				@Pc(44) Class4_Sub1 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method4570(arg0, arg1, local10 - 1);
		method4570(arg0, local10 + 1, arg2);
	}
}
