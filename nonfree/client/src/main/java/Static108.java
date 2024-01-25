import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "[I")
	public static final int[] anIntArray163 = new int[1000];

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILclient!ps;)V")
	public static void method1583(@OriginalArg(1) Class273 arg0) {
		if (Static229.anInt3342 != arg0.anInt6825) {
			return;
		}
		if (Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aString75 == null) {
			arg0.anInt6828 = 0;
			arg0.anInt6874 = 0;
			return;
		}
		arg0.anInt6863 = 150;
		arg0.anInt6801 = (int) (Math.sin((double) Static532.anInt8757 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt6850 = 5;
		arg0.anInt6828 = Static18.anInt4109;
		arg0.anInt6874 = Static275.method3998(Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aString75);
		arg0.anInt6811 = 0;
		arg0.anInt6799 = Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt8351;
		arg0.anInt6802 = Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt8376;
		arg0.anInt6833 = Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt8415;
		@Pc(81) Class148 local81 = arg0.anInt6799 == -1 ? null : Static117.aClass18_1.method296(arg0.anInt6799);
		if (local81 != null) {
			Static28.method382(local81, arg0.anInt6802);
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIII)V")
	public static void method1584(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class2_Sub2_Sub18 local8 = Static508.method6607(arg0, 4);
		local8.method6227();
		local8.anInt7693 = arg3;
		local8.anInt7695 = arg2;
		local8.anInt7701 = arg1;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V")
	public static void method1585() {
		@Pc(5) Class21 local5 = Static31.aClass21_9;
		synchronized (Static31.aClass21_9) {
			Static31.aClass21_9.method314();
		}
		local5 = Static547.aClass21_88;
		synchronized (Static547.aClass21_88) {
			Static547.aClass21_88.method314();
		}
	}
}
