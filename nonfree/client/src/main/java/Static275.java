import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "Lclient!ri;")
	public static Class284 aClass284_83;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)I")
	public static int method4163(@OriginalArg(0) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIZIII)V")
	public static void method4164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static333.anInt6022 < arg1 || arg2 < Static112.anInt2687) {
			return;
		}
		@Pc(15) boolean local15;
		if (Static384.anInt6641 > arg4) {
			local15 = false;
			arg4 = Static384.anInt6641;
		} else if (arg4 <= Static191.anInt4134) {
			local15 = true;
		} else {
			arg4 = Static191.anInt4134;
			local15 = false;
		}
		@Pc(43) boolean local43;
		if (arg3 < Static384.anInt6641) {
			local43 = false;
			arg3 = Static384.anInt6641;
		} else if (Static191.anInt4134 >= arg3) {
			local43 = true;
		} else {
			arg3 = Static191.anInt4134;
			local43 = false;
		}
		if (Static112.anInt2687 <= arg1) {
			Static504.method6755(arg0, arg3, Static570.anIntArrayArray100[arg1++], arg4);
		} else {
			arg1 = Static112.anInt2687;
		}
		if (Static333.anInt6022 >= arg2) {
			Static504.method6755(arg0, arg3, Static570.anIntArrayArray100[arg2--], arg4);
		} else {
			arg2 = Static333.anInt6022;
		}
		@Pc(93) int local93;
		if (local15 && local43) {
			for (local93 = arg1; local93 <= arg2; local93++) {
				@Pc(99) int[] local99 = Static570.anIntArrayArray100[local93];
				local99[arg4] = local99[arg3] = arg0;
			}
		} else if (local15) {
			for (local93 = arg1; local93 <= arg2; local93++) {
				Static570.anIntArrayArray100[local93][arg4] = arg0;
			}
		} else if (local43) {
			for (local93 = arg1; local93 <= arg2; local93++) {
				Static570.anIntArrayArray100[local93][arg3] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZILclient!qk;)V")
	public static void method4166(@OriginalArg(2) Class3_Sub16_Sub3 arg0) {
		Static229.aClass58_5.method5327(arg0);
		Static326.method4808(Static537.aClass284_153, Static229.aClass58_5, Static513.aClass284_146, arg0, Static118.aClass284_39);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)V")
	public static void method4167(@OriginalArg(0) int arg0) {
		Static501.anInt8648 = arg0;
		@Pc(15) Class342 local15 = Static589.aClass342_203;
		synchronized (Static589.aClass342_203) {
			Static589.aClass342_203.method7693();
		}
	}
}
