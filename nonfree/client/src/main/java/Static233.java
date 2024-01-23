import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
	public static int anInt6040;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
	public static int anInt6039 = 0;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIII)V")
	public static void method4741(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static148.anInt3245 <= arg1 && arg1 <= Static166.anInt3675) {
			@Pc(19) int local19 = Static30.method572(Static53.anInt1319, arg3, Static81.anInt1915);
			@Pc(25) int local25 = Static30.method572(Static53.anInt1319, arg0, Static81.anInt1915);
			Static130.method2398(local25, arg2, local19, arg1);
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIIII)V")
	public static void method4744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class56 local8 = Static15.method273(arg3, arg2);
		if (local8 != null && local8.anObjectArray16 != null) {
			@Pc(18) Class2_Sub12 local18 = new Class2_Sub12();
			local18.aClass56_6 = local8;
			local18.anObjectArray1 = local8.anObjectArray16;
			Static204.method3467(local18);
		}
		Static239.anInt4787 = arg2;
		Static312.anInt5126 = arg0;
		Static203.anInt4260 = arg4;
		Static220.anInt4519 = arg3;
		Static237.anInt4771 = arg5;
		Static287.aBoolean373 = true;
		Static161.anInt3604 = arg1;
		Static287.method4466(local8);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V")
	public static void method4745() {
		for (@Pc(8) int local8 = 0; local8 < Static57.anInt1448; local8++) {
			@Pc(15) int local15 = Static89.anIntArray194[local8];
			@Pc(19) Class15_Sub2_Sub1 local19 = Static35.aClass15_Sub2_Sub1Array2[local15];
			if (local19 != null) {
				Static269.method4264(local19, local19.aClass188_1.anInt5867);
			}
		}
	}
}
