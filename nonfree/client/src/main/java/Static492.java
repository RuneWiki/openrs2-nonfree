import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static492 {

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "[I")
	public static int[] anIntArray567;

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "Lclient!lma;")
	public static final Class234 aClass234_6 = new Class234();

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray32 = new String[100];

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
	public static void method6653() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static508.aBooleanArray21[local3] = false;
		}
		Static565.anInt8603 = -1;
		Static358.anInt5640 = -1;
		Static494.anInt7853 = -1;
		Static67.anInt1614 = -1;
		Static45.anInt1294 = 0;
		Static631.anInt9738 = 0;
		Static262.anInt4081 = 1;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "([Lclient!ee;II)V")
	public static void method6654(@OriginalArg(0) Class9_Sub1[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class9_Sub1 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt10693;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt10693 > local27 + (local29 & 0x1)) {
				@Pc(44) Class9_Sub1 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method6654(arg0, arg1, local10 - 1);
		method6654(arg0, local10 + 1, arg2);
	}
}
