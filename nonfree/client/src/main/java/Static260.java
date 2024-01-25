import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!jga", name = "c", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_40 = new Class181(41, 8);

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(III[II)V")
	public static void method3979(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		arg1--;
		@Pc(12) int local12 = arg3 - 1;
		@Pc(15) int local15 = local12 - 7;
		while (arg1 < local15) {
			@Pc(19) int local19 = arg1 + 1;
			arg2[local19] = arg0;
			@Pc(24) int local24 = local19 + 1;
			arg2[local24] = arg0;
			@Pc(29) int local29 = local24 + 1;
			arg2[local29] = arg0;
			@Pc(34) int local34 = local29 + 1;
			arg2[local34] = arg0;
			@Pc(39) int local39 = local34 + 1;
			arg2[local39] = arg0;
			@Pc(44) int local44 = local39 + 1;
			arg2[local44] = arg0;
			@Pc(49) int local49 = local44 + 1;
			arg2[local49] = arg0;
			arg1 = local49 + 1;
			arg2[arg1] = arg0;
		}
		while (local12 > arg1) {
			arg1++;
			arg2[arg1] = arg0;
		}
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(IIB)I")
	public static int method3980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local7 *= arg0;
			}
			arg0 *= arg0;
			arg1 >>= 0x1;
		}
		if (arg1 == 1) {
			return local7 * arg0;
		} else {
			return local7;
		}
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(I)V")
	public static void method3981() {
		if (Static154.aClass291_2 != null) {
			Static182.aClass90_1 = new Class90();
			Static182.aClass90_1.method1831(Static154.aClass291_2.aClass58_64.method1237(Static321.anInt5554), Static154.aClass291_2.anInt7918, Static154.aClass291_2, Static409.aLong193);
			Static362.aThread5 = new Thread(Static182.aClass90_1, "");
			Static362.aThread5.start();
		}
	}
}
