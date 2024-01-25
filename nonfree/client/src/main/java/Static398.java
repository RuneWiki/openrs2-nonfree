import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!pf", name = "r", descriptor = "I")
	public static int anInt7799;

	@OriginalMember(owner = "client!pf", name = "q", descriptor = "[I")
	public static final int[] anIntArray416 = new int[4096];

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
	public static void method6101() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static179.aBooleanArray8[local7] = false;
		}
		Static300.anInt6053 = 1;
		Static453.anInt8613 = -1;
		Static587.anInt10508 = -1;
		Static68.anInt1813 = 0;
		Static458.anInt8765 = 0;
		Static166.anInt3460 = -1;
		Static456.anInt8707 = -1;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!is;Z)V")
	public static void method6102(@OriginalArg(0) Class155 arg0) {
		if (!Static430.aBoolean586) {
			return;
		}
		if (arg0.anObjectArray13 != null) {
			@Pc(14) Class155 local14 = Static539.method7544(Static286.anInt6126, Static569.anInt7644);
			if (local14 != null) {
				@Pc(20) Class4_Sub37 local20 = new Class4_Sub37();
				local20.aClass155_9 = local14;
				local20.anObjectArray31 = arg0.anObjectArray13;
				local20.aClass155_10 = arg0;
				Static471.method6884(local20);
			}
		}
		@Pc(41) Class4_Sub39 local41 = Static32.method999(Static402.aClass356_1, Static26.aClass344_6);
		local41.aClass4_Sub13_Sub2_1.method7032(arg0.anInt4793);
		local41.aClass4_Sub13_Sub2_1.method6999(Static569.anInt7644);
		local41.aClass4_Sub13_Sub2_1.method7038(arg0.anInt4785);
		local41.aClass4_Sub13_Sub2_1.method7032(Static286.anInt6126);
		local41.aClass4_Sub13_Sub2_1.method7044(arg0.anInt4765);
		local41.aClass4_Sub13_Sub2_1.method7001(Static231.anInt4893);
		Static50.method1166(local41);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IILclient!is;I)V")
	public static void method6103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class155 arg2) {
		Static220.aClass155_16 = arg2;
		Static392.anInt3639 = arg1;
		Static58.anInt1554 = arg0;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLjava/awt/Canvas;Lclient!fa;)Lclient!r;")
	public static Class7 method6105(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Interface7 arg1) {
		return new l(arg0, arg1);
	}
}
