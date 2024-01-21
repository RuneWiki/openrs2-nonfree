import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "Lclient!wb;")
	public static Class107 aClass107_1;

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "Lclient!dj;")
	public static Class23_Sub1 aClass23_Sub1_15;

	@OriginalMember(owner = "client!nh", name = "i", descriptor = "Lclient!dj;")
	public static Class23_Sub1 aClass23_Sub1_16;

	@OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
	public static int anInt2714;

	@OriginalMember(owner = "client!nh", name = "o", descriptor = "Lclient!jc;")
	public static Class47 aClass47_4;

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "J")
	public static long aLong155 = 0L;

	@OriginalMember(owner = "client!nh", name = "j", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_986 = Static161.method2452("hint_headicons");

	@OriginalMember(owner = "client!nh", name = "l", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_987 = Static161.method2452("document)3cookie=(R");

	@OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
	public static int anInt2715 = -1;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)V")
	public static void method2024() {
		@Pc(10) int local10 = (Static210.aClass1_Sub2_Sub2_2.anInt2241 >> 7) + Static86.anInt1895;
		@Pc(18) int local18 = (Static210.aClass1_Sub2_Sub2_2.anInt2234 >> 7) + Static110.anInt2295;
		Static217.anInt4212 = 0;
		if (local10 >= 3053 && local10 <= 3156 && local18 >= 3056 && local18 <= 3136) {
			Static217.anInt4212 = 1;
		}
		if (local10 >= 3072 && local10 <= 3118 && local18 >= 9492 && local18 <= 9535) {
			Static217.anInt4212 = 1;
		}
		if (Static217.anInt4212 == 1 && local10 >= 3139 && local10 <= 3199 && local18 >= 3008 && local18 <= 3062) {
			Static217.anInt4212 = 0;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(I[B)[B")
	public static byte[] method2025(@OriginalArg(1) byte[] arg0) {
		@Pc(4) Class5_Sub6 local4 = new Class5_Sub6(arg0);
		@Pc(12) int local12 = local4.method3062();
		@Pc(18) int local18 = local4.method3073();
		if (local18 < 0 || Static202.anInt3967 != 0 && Static202.anInt3967 < local18) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(89) byte[] local89 = new byte[local18];
			local4.method3051(local18, local89);
			return local89;
		} else {
			@Pc(48) int local48 = local4.method3073();
			if (local48 < 0 || Static202.anInt3967 != 0 && local48 > Static202.anInt3967) {
				throw new RuntimeException();
			}
			@Pc(65) byte[] local65 = new byte[local48];
			if (local12 == 1) {
				Static163.method2482(local65, local48, arg0, local18);
			} else {
				Static37.aClass104_3.method3104(local65, local4);
			}
			return local65;
		}
	}
}
