import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!gr", name = "P", descriptor = "[[Lclient!rca;")
	public static Class278[][] aClass278ArrayArray1;

	@OriginalMember(owner = "client!gr", name = "D", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_86 = new Class81(82, 2);

	@OriginalMember(owner = "client!gr", name = "H", descriptor = "[I")
	public static final int[] anIntArray184 = new int[13];

	@OriginalMember(owner = "client!gr", name = "L", descriptor = "[I")
	public static final int[] anIntArray185 = new int[2];

	@OriginalMember(owner = "client!gr", name = "N", descriptor = "[I")
	public static final int[] anIntArray186 = new int[13];

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIBLclient!wo;Lclient!r;)V")
	public static void method2698(@OriginalArg(3) Class361 arg0, @OriginalArg(4) Class12 arg1) {
		Static266.aClass361_88.method7860();
		if (Static521.aBoolean629) {
			return;
		}
		for (@Pc(16) Class1_Sub27 local16 = (Class1_Sub27) arg0.method7854(); local16 != null; local16 = (Class1_Sub27) arg0.method7853()) {
			@Pc(24) Class196 local24 = Static313.aClass46_2.method1408(local16.anInt5625);
			if (Static562.method7553(local24)) {
				@Pc(36) boolean local36 = Static438.method6323(local16, arg1, local24);
				if (local36) {
					Static595.method7929(arg1, local24, local16);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(II[BIII)V")
	public static void method2700(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		if (arg3 >= arg2) {
			return;
		}
		arg0 += arg3;
		@Pc(34) int local34 = arg2 - arg3 >> 2;
		while (true) {
			local34--;
			if (local34 < 0) {
				local34 = arg2 - arg3 & 0x3;
				while (true) {
					local34--;
					if (local34 < 0) {
						return;
					}
					arg1[arg0++] = 1;
				}
			}
			@Pc(39) int local39 = arg0 + 1;
			arg1[arg0] = 1;
			@Pc(44) int local44 = local39 + 1;
			arg1[local39] = 1;
			@Pc(49) int local49 = local44 + 1;
			arg1[local44] = 1;
			arg0 = local49 + 1;
			arg1[local49] = 1;
		}
	}
}
