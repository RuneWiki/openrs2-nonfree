import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!dl", name = "ab", descriptor = "[I")
	public static int[] anIntArray118;

	@OriginalMember(owner = "client!dl", name = "ib", descriptor = "I")
	public static int anInt1602;

	@OriginalMember(owner = "client!dl", name = "k", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_20 = new Class183(75, 8);

	@OriginalMember(owner = "client!dl", name = "l", descriptor = "[Z")
	public static final boolean[] aBooleanArray8 = new boolean[100];

	@OriginalMember(owner = "client!dl", name = "B", descriptor = "I")
	public static int anInt1579 = 2;

	@OriginalMember(owner = "client!dl", name = "C", descriptor = "I")
	public static int anInt1580 = 0;

	@OriginalMember(owner = "client!dl", name = "tb", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_21 = new Class183(53, 8);

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!g;B)V")
	public static void method1264(@OriginalArg(0) Class83 arg0) {
		Static114.aClass83_52 = arg0;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(BLjava/lang/String;C)[Ljava/lang/String;")
	public static String[] method1265(@OriginalArg(1) String arg0, @OriginalArg(2) char arg1) {
		@Pc(10) int local10 = Static268.method4563(arg0, arg1);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < local10; local21++) {
			@Pc(25) int local25;
			for (local25 = local19; arg0.charAt(local25) != arg1; local25++) {
			}
			local15[local17++] = arg0.substring(local19, local25);
			local19 = local25 + 1;
		}
		local15[local10] = arg0.substring(local19);
		return local15;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
	public static void method1266() {
		Static120.aClass243_10.method5970();
		Static158.aClass243_13.method5970();
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IILclient!oj;III)V")
	public static void method1270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class48 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		arg2.method2496(arg3, arg1, arg3 + arg0, arg1 + arg4);
		arg2.method2509(arg4, arg0, arg1, -16777216, arg3);
		if (Static344.anInt6330 < 100) {
			return;
		}
		@Pc(35) float local35 = (float) Static20.anInt4603 / (float) Static20.anInt4612;
		@Pc(37) int local37 = arg0;
		@Pc(39) int local39 = arg4;
		if (local35 < 1.0F) {
			local39 = (int) ((float) arg0 * local35);
		} else {
			local37 = (int) ((float) arg4 / local35);
		}
		@Pc(66) int local66 = arg3 + (arg0 - local37) / 2;
		@Pc(74) int local74 = arg1 + (arg4 - local39) / 2;
		if (Static214.aClass27_17 == null || arg0 != Static214.aClass27_17.method5320() || arg4 != Static214.aClass27_17.method5327()) {
			Static20.method4151(Static20.anInt4606, Static20.anInt4611 + Static20.anInt4603, Static20.anInt4612 + Static20.anInt4606, Static20.anInt4611, local66, local74, local66 + local37, local39 + local74);
			Static20.method4140(arg2);
			Static214.aClass27_17 = arg2.method2510(local66, local74, local37, local39, false);
		}
		Static214.aClass27_17.method5318(local66, local74);
		@Pc(126) int local126 = local37 * Static227.anInt4588 / Static20.anInt4612;
		@Pc(132) int local132 = Static391.anInt7128 * local39 / Static20.anInt4603;
		@Pc(140) int local140 = local37 * Static320.anInt7071 / Static20.anInt4612 + local66;
		@Pc(153) int local153 = local39 + local74 - Static221.anInt6801 * local39 / Static20.anInt4603 - local132;
		@Pc(155) int local155 = -1996554240;
		if (Static202.aClass38_2 == Static85.aClass38_1) {
			local155 = -1996488705;
		}
		arg2.method2470(local140, local153, local126, local132, local155, 1);
		arg2.method2534(local140, local153, local126, local132, local155, 0);
		if (Static11.anInt211 <= 0) {
			return;
		}
		@Pc(191) int local191;
		if (Static313.anInt5728 > 50) {
			local191 = (100 - Static313.anInt5728) * 5;
		} else {
			local191 = Static313.anInt5728 * 5;
		}
		for (@Pc(202) Class2_Sub10 local202 = (Class2_Sub10) Static20.aClass238_21.method5795(); local202 != null; local202 = (Class2_Sub10) Static20.aClass238_21.method5799()) {
			@Pc(212) Class212 local212 = Static20.aClass195_3.method4816(local202.anInt2183);
			if (Static232.method4183(local212)) {
				@Pc(229) int local229;
				@Pc(241) int local241;
				if (local202.anInt2183 == Static340.anInt6283) {
					local229 = local66 + local202.anInt2184 * local37 / Static20.anInt4612;
					local241 = (Static20.anInt4603 - local202.anInt2178) * local39 / Static20.anInt4603 + local74;
					arg2.method2509(4, 4, local241 - 2, local191 << 24 | 0xFFFF00, local229 - 2);
				} else if (Static228.anInt4596 != -1 && local212.anInt5985 == Static228.anInt4596) {
					local229 = local37 * local202.anInt2184 / Static20.anInt4612 + local66;
					local241 = local74 + local39 * (Static20.anInt4603 - local202.anInt2178) / Static20.anInt4603;
					arg2.method2509(4, 4, local241 - 2, local191 << 24 | 0xFFFF00, local229 - 2);
				}
			}
		}
	}
}
