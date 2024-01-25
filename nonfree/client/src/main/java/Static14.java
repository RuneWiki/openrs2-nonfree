import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!ar", name = "J", descriptor = "Z")
	public static boolean aBoolean22 = true;

	@OriginalMember(owner = "client!ar", name = "L", descriptor = "[I")
	public static final int[] anIntArray25 = new int[500];

	@OriginalMember(owner = "client!ar", name = "N", descriptor = "I")
	public static int anInt254 = 0;

	@OriginalMember(owner = "client!ar", name = "Q", descriptor = "I")
	public static int anInt257 = 0;

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IBI[II)V")
	public static void method247(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		arg3--;
		@Pc(11) int local11 = arg0 - 1;
		@Pc(15) int local15 = local11 - 7;
		while (arg3 < local15) {
			@Pc(19) int local19 = arg3 + 1;
			arg2[local19] = arg1;
			@Pc(24) int local24 = local19 + 1;
			arg2[local24] = arg1;
			@Pc(29) int local29 = local24 + 1;
			arg2[local29] = arg1;
			@Pc(34) int local34 = local29 + 1;
			arg2[local34] = arg1;
			@Pc(39) int local39 = local34 + 1;
			arg2[local39] = arg1;
			@Pc(44) int local44 = local39 + 1;
			arg2[local44] = arg1;
			@Pc(49) int local49 = local44 + 1;
			arg2[local49] = arg1;
			arg3 = local49 + 1;
			arg2[arg3] = arg1;
		}
		while (arg3 < local11) {
			arg3++;
			arg2[arg3] = arg1;
		}
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(II)V")
	public static void method248() {
		Static242.aClass70_81.method1397(5);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "()V")
	public static void method249() {
		for (@Pc(1) int local1 = 0; local1 < Static113.anInt2094; local1++) {
			@Pc(6) Class44_Sub4 local6 = Static9.aClass44_Sub4Array1[local1];
			Static102.method4773(local6);
			Static9.aClass44_Sub4Array1[local1] = null;
		}
		Static113.anInt2094 = 0;
	}
}
