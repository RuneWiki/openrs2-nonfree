import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!rea", name = "i", descriptor = "I")
	public static int anInt7748 = -50;

	@OriginalMember(owner = "client!rea", name = "j", descriptor = "Z")
	public static boolean aBoolean544 = false;

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(I[I[I)V")
	public static void method6344(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1) {
		if (arg1 == null || arg0 == null) {
			Static385.anIntArray501 = null;
			Static579.aByteArrayArrayArray21 = null;
			Static160.anIntArray201 = null;
			return;
		}
		Static385.anIntArray501 = arg1;
		Static160.anIntArray201 = new int[arg1.length];
		Static579.aByteArrayArrayArray21 = new byte[arg1.length][][];
		for (@Pc(28) int local28 = 0; local28 < Static385.anIntArray501.length; local28++) {
			Static579.aByteArrayArrayArray21[local28] = new byte[arg0[local28]][];
		}
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(Lclient!ji;I)Lclient!ie;")
	public static Class142 method6345(@OriginalArg(0) Class6_Sub21 arg0) {
		@Pc(7) int local7 = arg0.method6069();
		@Pc(14) Class319 local14 = Static4.method161()[arg0.method6069()];
		@Pc(21) Class247 local21 = Static179.method6311()[arg0.method6069()];
		@Pc(25) int local25 = arg0.method6058();
		@Pc(29) int local29 = arg0.method6058();
		@Pc(33) int local33 = arg0.method6003();
		@Pc(44) int local44 = arg0.method6003();
		@Pc(48) int local48 = arg0.method6036();
		@Pc(52) int local52 = arg0.method6036();
		@Pc(56) int local56 = arg0.method6036();
		@Pc(65) boolean local65 = arg0.method6069() == 1;
		return new Class142(local7, local14, local21, local25, local29, local33, local44, local48, local52, local56, local65);
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(IIIIZI)V")
	public static void method6346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static415.anInt9494 < arg0 || arg4 < Static583.anInt9478) {
			return;
		}
		@Pc(25) boolean local25;
		if (Static13.anInt7634 > arg1) {
			arg1 = Static13.anInt7634;
			local25 = false;
		} else if (arg1 > Static461.anInt7899) {
			arg1 = Static461.anInt7899;
			local25 = false;
		} else {
			local25 = true;
		}
		@Pc(42) boolean local42;
		if (arg3 < Static13.anInt7634) {
			arg3 = Static13.anInt7634;
			local42 = false;
		} else if (arg3 > Static461.anInt7899) {
			arg3 = Static461.anInt7899;
			local42 = false;
		} else {
			local42 = true;
		}
		if (arg0 >= Static583.anInt9478) {
			Static208.method3687(arg1, arg2, Static454.anIntArrayArray71[arg0++], arg3);
		} else {
			arg0 = Static583.anInt9478;
		}
		if (Static415.anInt9494 >= arg4) {
			Static208.method3687(arg1, arg2, Static454.anIntArrayArray71[arg4--], arg3);
		} else {
			arg4 = Static415.anInt9494;
		}
		@Pc(101) int local101;
		if (local25 && local42) {
			for (local101 = arg0; local101 <= arg4; local101++) {
				@Pc(107) int[] local107 = Static454.anIntArrayArray71[local101];
				local107[arg1] = local107[arg3] = arg2;
			}
		} else if (local25) {
			for (local101 = arg0; local101 <= arg4; local101++) {
				Static454.anIntArrayArray71[local101][arg1] = arg2;
			}
		} else if (local42) {
			for (local101 = arg0; local101 <= arg4; local101++) {
				Static454.anIntArrayArray71[local101][arg3] = arg2;
			}
		}
	}
}
