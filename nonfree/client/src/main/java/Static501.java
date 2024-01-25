import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static501 {

	@OriginalMember(owner = "client!uu", name = "m", descriptor = "I")
	public static int anInt9458;

	@OriginalMember(owner = "client!uu", name = "o", descriptor = "[I")
	public static final int[] anIntArray831 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lclient!mw;IIIII)V")
	public static void method8146(@OriginalArg(0) Class1_Sub37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0.anInt5956 == -1 && arg0.anIntArray463 == null) {
			return;
		}
		@Pc(15) int local15 = 0;
		@Pc(23) int local23 = Static286.aClass1_Sub15_Sub1_1.anInt7037 * arg0.anInt5961 >> 8;
		if (arg4 > arg0.anInt5958) {
			local15 = arg4 - arg0.anInt5958;
		} else if (arg0.anInt5962 > arg4) {
			local15 = arg0.anInt5962 - arg4;
		}
		if (arg0.anInt5959 < arg2) {
			local15 += arg2 - arg0.anInt5959;
		} else if (arg0.anInt5960 > arg2) {
			local15 += arg0.anInt5960 - arg2;
		}
		if (arg0.anInt5968 == 0 || local15 - 64 > arg0.anInt5968 || Static286.aClass1_Sub15_Sub1_1.anInt7037 == 0 || arg1 != arg0.anInt5957) {
			if (arg0.aClass1_Sub4_Sub1_3 != null) {
				Static475.aClass1_Sub4_Sub2_2.method3184(arg0.aClass1_Sub4_Sub1_3);
				arg0.aClass1_Sub4_Sub1_3 = null;
			}
			if (arg0.aClass1_Sub4_Sub1_2 != null) {
				Static475.aClass1_Sub4_Sub2_2.method3184(arg0.aClass1_Sub4_Sub1_2);
				arg0.aClass1_Sub4_Sub1_2 = null;
			}
			return;
		}
		local15 -= 64;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(144) int local144 = local23 * (arg0.anInt5968 - local15) / arg0.anInt5968;
		if (arg0.aClass1_Sub4_Sub1_3 != null) {
			arg0.aClass1_Sub4_Sub1_3.method1208(local144);
		} else if (arg0.anInt5956 >= 0) {
			@Pc(159) Class233 local159 = Static552.method6179(Static339.aClass69_66, arg0.anInt5956, 0);
			if (local159 != null) {
				@Pc(166) Class1_Sub30_Sub1 local166 = local159.method6178().method5375(Static407.aClass254_1);
				@Pc(171) Class1_Sub4_Sub1 local171 = Static546.method1207(local166, local144);
				local171.method1201(-1);
				Static475.aClass1_Sub4_Sub2_2.method3189(local171);
				arg0.aClass1_Sub4_Sub1_3 = local171;
			}
		}
		if (arg0.aClass1_Sub4_Sub1_2 != null) {
			arg0.aClass1_Sub4_Sub1_2.method1208(local144);
			if (!arg0.aClass1_Sub4_Sub1_2.method8241()) {
				arg0.aClass1_Sub4_Sub1_2 = null;
			}
		} else if (arg0.anIntArray463 != null && (arg0.anInt5965 -= arg3) <= 0) {
			@Pc(221) int local221 = (int) ((double) arg0.anIntArray463.length * Math.random());
			@Pc(229) Class233 local229 = Static552.method6179(Static339.aClass69_66, arg0.anIntArray463[local221], 0);
			if (local229 != null) {
				@Pc(236) Class1_Sub30_Sub1 local236 = local229.method6178().method5375(Static407.aClass254_1);
				@Pc(241) Class1_Sub4_Sub1 local241 = Static546.method1207(local236, local144);
				local241.method1201(0);
				Static475.aClass1_Sub4_Sub2_2.method3189(local241);
				arg0.anInt5965 = (int) ((double) (arg0.anInt5966 - arg0.anInt5954) * Math.random()) + arg0.anInt5954;
				arg0.aClass1_Sub4_Sub1_2 = local241;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lclient!jj;Z)V")
	public static void method8153(@OriginalArg(0) Class1_Sub25 arg0) {
		if (!Static238.aBoolean354) {
			arg0.method8239();
			Static197.anInt4015--;
		}
	}
}
