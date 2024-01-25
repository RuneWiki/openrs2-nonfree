import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static475 {

	@OriginalMember(owner = "client!qga", name = "l", descriptor = "[Lclient!ib;")
	public static Class160_Sub1[] aClass160_Sub1Array2 = new Class160_Sub1[0];

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "([Lclient!sf;II)V")
	public static void method7017(@OriginalArg(0) Class41_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class41_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt10369;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt10369 < local27 + (local29 & 0x1)) {
				@Pc(44) Class41_Sub1 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method7017(arg0, arg1, local10 - 1);
		method7017(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!qga", name = "c", descriptor = "(I)V")
	public static void method7018(@OriginalArg(0) int arg0) {
		Static436.anInt7713 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static665.anInt7330; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static92.anInt1526; local6++) {
				if (Static129.aClass313ArrayArrayArray7[arg0][local3][local6] == null) {
					Static129.aClass313ArrayArrayArray7[arg0][local3][local6] = new Class313(arg0);
				}
			}
		}
	}
}
