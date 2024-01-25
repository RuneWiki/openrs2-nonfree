import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!tu", name = "V", descriptor = "I")
	public static final int anInt7180 = 50;

	@OriginalMember(owner = "client!tu", name = "A", descriptor = "[I")
	public static final int[] anIntArray680 = new int[anInt7180];

	@OriginalMember(owner = "client!tu", name = "T", descriptor = "[I")
	public static final int[] anIntArray681 = new int[anInt7180];

	@OriginalMember(owner = "client!tu", name = "X", descriptor = "I")
	public static int anInt7182 = 0;

	@OriginalMember(owner = "client!tu", name = "bb", descriptor = "[I")
	public static final int[] anIntArray682 = new int[anInt7180];

	@OriginalMember(owner = "client!tu", name = "hb", descriptor = "[I")
	public static final int[] anIntArray683 = new int[anInt7180];

	@OriginalMember(owner = "client!tu", name = "jb", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray42 = new String[anInt7180];

	@OriginalMember(owner = "client!tu", name = "kb", descriptor = "[I")
	public static final int[] anIntArray684 = new int[anInt7180];

	@OriginalMember(owner = "client!tu", name = "nb", descriptor = "I")
	public static final int anInt7191 = -1;

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IBI)V")
	public static void method5468(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = Static394.aClass209_10.method4694(Static192.aClass158_104.method3594(Static365.anInt6682));
		@Pc(28) int local28;
		for (@Pc(22) Class1_Sub35 local22 = (Class1_Sub35) Static401.aClass203_47.method4548(); local22 != null; local22 = (Class1_Sub35) Static401.aClass203_47.method4545()) {
			local28 = Static113.method1826(local22);
			if (local28 > local17) {
				local17 = local28;
			}
		}
		local17 += 8;
		local28 = Static126.anInt2794 * 16 + 21;
		@Pc(58) int local58 = arg0 - local17 / 2;
		if (local17 + local58 > Static152.anInt3234) {
			local58 = Static152.anInt3234 - local17;
		}
		if (local58 < 0) {
			local58 = 0;
		}
		@Pc(80) int local80 = arg1;
		if (Static342.anInt6292 < arg1 + local28) {
			local80 = Static342.anInt6292 - local28;
		}
		Static293.anInt4679 = local58;
		if (local80 < 0) {
			local80 = 0;
		}
		Static96.aBoolean151 = true;
		Static32.anInt891 = local80;
		Static316.anInt5908 = Static126.anInt2794 * 16 + (Static333.aBoolean386 ? 26 : 22);
		Static232.anInt4578 = local17;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IBIII)V")
	public static void method5472(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static349.anInt6472 == 1) {
			Static344.aClass137Array16[Static233.anInt4625 / 100].method5708(Static311.anInt5837 - 8, Static411.anInt7339 + -8);
		}
		if (Static349.anInt6472 == 2) {
			Static344.aClass137Array16[Static233.anInt4625 / 100 + 4].method5708(Static311.anInt5837 - 8, Static411.anInt7339 + -8);
		}
		Static242.method6079();
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(B)V")
	public static void method5474() {
		Static149.method2368();
		Static189.aClass86_2 = null;
		Static134.aClass108ArrayArray1 = null;
		Static424.aClass86_4 = null;
		Static388.aClass86_3 = null;
		Static194.aClass106_7 = null;
	}
}
