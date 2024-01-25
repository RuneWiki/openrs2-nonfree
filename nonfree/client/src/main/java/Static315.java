import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!ua", name = "i", descriptor = "[I")
	public static int[] anIntArray478;

	@OriginalMember(owner = "client!ua", name = "n", descriptor = "Lclient!tj;")
	public static Class193 aClass193_98;

	@OriginalMember(owner = "client!ua", name = "s", descriptor = "[[I")
	public static final int[][] anIntArrayArray169 = new int[128][128];

	@OriginalMember(owner = "client!ua", name = "v", descriptor = "Z")
	public static boolean aBoolean453 = true;

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)V")
	public static void method5195() {
		if (Static200.aString38.toLowerCase().indexOf("microsoft") != -1) {
			Static19.anIntArray13[188] = 71;
			Static19.anIntArray13[187] = 27;
			Static19.anIntArray13[219] = 42;
			Static19.anIntArray13[190] = 72;
			Static19.anIntArray13[221] = 43;
			Static19.anIntArray13[222] = 59;
			Static19.anIntArray13[191] = 73;
			Static19.anIntArray13[223] = 28;
			Static19.anIntArray13[192] = 58;
			Static19.anIntArray13[186] = 57;
			Static19.anIntArray13[189] = 26;
			Static19.anIntArray13[220] = 74;
			return;
		}
		Static19.anIntArray13[92] = 74;
		Static19.anIntArray13[47] = 73;
		Static19.anIntArray13[59] = 57;
		Static19.anIntArray13[44] = 71;
		if (Static200.aMethod1 == null) {
			Static19.anIntArray13[192] = 58;
			Static19.anIntArray13[222] = 59;
		} else {
			Static19.anIntArray13[192] = 28;
			Static19.anIntArray13[222] = 58;
			Static19.anIntArray13[520] = 59;
		}
		Static19.anIntArray13[61] = 27;
		Static19.anIntArray13[93] = 43;
		Static19.anIntArray13[45] = 26;
		Static19.anIntArray13[46] = 72;
		Static19.anIntArray13[91] = 42;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIBLclient!hl;II)V")
	public static void method5197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class8_Sub1_Sub2 arg3) {
		Static160.method3157(arg3.anInt6702, arg2, arg3.anInt6701, arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class4_Sub32 local7 = null;
		for (@Pc(12) Class4_Sub32 local12 = (Class4_Sub32) Static82.aClass116_11.method3270(); local12 != null; local12 = (Class4_Sub32) Static82.aClass116_11.method3272()) {
			if (arg8 == local12.anInt4721 && arg3 == local12.anInt4726 && arg7 == local12.anInt4722 && local12.anInt4724 == arg1) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class4_Sub32();
			local7.anInt4721 = arg8;
			local7.anInt4726 = arg3;
			local7.anInt4724 = arg1;
			local7.anInt4722 = arg7;
			Static63.method1311(local7);
			Static82.aClass116_11.method3274(local7);
		}
		local7.anInt4732 = arg4;
		local7.anInt4728 = arg2;
		local7.anInt4729 = arg0;
		local7.anInt4723 = arg6;
		local7.anInt4727 = arg5;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILclient!tj;)V")
	public static void method5199(@OriginalArg(1) Class193 arg0) {
		Static344.aClass193_46 = arg0;
		Static168.anInt6696 = Static344.aClass193_46.method5055(15);
	}
}
