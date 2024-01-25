import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "Lclient!mi;")
	public static Class46 aClass46_16;

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "[I")
	public static final int[] anIntArray346 = new int[14];

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)Z")
	public static boolean method5168() {
		if (Static612.aBoolean729) {
			try {
				Static646.method1788(Static334.anApplet2, "showVideoAd");
				return true;
			} catch (@Pc(13) Throwable local13) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "([Lclient!ga;II)V")
	public static void method5169(@OriginalArg(0) Class3_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class3_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt10311;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt10311 > local27 + (local29 & 0x1)) {
				@Pc(44) Class3_Sub1 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method5169(arg0, arg1, local10 - 1);
		method5169(arg0, local10 + 1, arg2);
	}
}
