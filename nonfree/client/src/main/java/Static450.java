import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static450 {

	@OriginalMember(owner = "client!qea", name = "r", descriptor = "[[[S")
	public static short[][][] aShortArrayArrayArray2;

	@OriginalMember(owner = "client!qea", name = "u", descriptor = "I")
	public static int anInt8291;

	@OriginalMember(owner = "client!qea", name = "s", descriptor = "Z")
	public static boolean aBoolean595 = false;

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "([Lclient!rr;II)V")
	public static void method6851(@OriginalArg(0) Class15_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class15_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt10304;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt10304 < local27 + (local29 & 0x1)) {
				@Pc(44) Class15_Sub1 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method6851(arg0, arg1, local10 - 1);
		method6851(arg0, local10 + 1, arg2);
	}
}
