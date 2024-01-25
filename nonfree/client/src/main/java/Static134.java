import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!hl", name = "J", descriptor = "I")
	public static int anInt2936;

	@OriginalMember(owner = "client!hl", name = "Q", descriptor = "I")
	public static int anInt2939;

	@OriginalMember(owner = "client!hl", name = "D", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_37 = new Class183(38, 0);

	@OriginalMember(owner = "client!hl", name = "G", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray14 = new String[100];

	@OriginalMember(owner = "client!hl", name = "H", descriptor = "[I")
	public static final int[] anIntArray224 = new int[2048];

	@OriginalMember(owner = "client!hl", name = "L", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_38 = new Class183(24, 7);

	@OriginalMember(owner = "client!hl", name = "O", descriptor = "[J")
	public static final long[] aLongArray2 = new long[32];

	@OriginalMember(owner = "client!hl", name = "P", descriptor = "[Lclient!jj;")
	public static final Class2_Sub7_Sub10[] aClass2_Sub7_Sub10Array1 = new Class2_Sub7_Sub10[14];

	@OriginalMember(owner = "client!hl", name = "R", descriptor = "I")
	public static int anInt2940 = -1;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IBLclient!rh;II)V")
	public static void method2354(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub34 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(21) long local21 = (long) (arg0 | arg2 << 28 | arg3 << 14);
		@Pc(29) Class2_Sub30 local29 = (Class2_Sub30) Static301.aClass243_24.method5967(local21);
		if (local29 == null) {
			local29 = new Class2_Sub30();
			Static301.aClass243_24.method5968(local21, local29);
			local29.aClass238_22.method5796(arg1);
			return;
		}
		@Pc(52) Class152 local52 = Static57.aClass196_1.method4827(arg1.anInt5599);
		@Pc(55) int local55 = local52.anInt4332;
		if (local52.anInt4358 == 1) {
			local55 *= arg1.anInt5603 + 1;
		}
		for (@Pc(72) Class2_Sub34 local72 = (Class2_Sub34) local29.aClass238_22.method5795(); local72 != null; local72 = (Class2_Sub34) local29.aClass238_22.method5799()) {
			local52 = Static57.aClass196_1.method4827(local72.anInt5599);
			@Pc(83) int local83 = local52.anInt4332;
			if (local52.anInt4358 == 1) {
				local83 *= local72.anInt5603 + 1;
			}
			if (local83 < local55) {
				Static265.method4511(local72, arg1);
				return;
			}
		}
		local29.aClass238_22.method5796(arg1);
	}

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "(III)Lclient!ab;")
	public static Class3 method2355(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class3 local9 = Static380.method5987(arg1);
		if (arg0 == -1) {
			return local9;
		} else if (local9 == null || local9.aClass3Array1 == null || local9.aClass3Array1.length <= arg0) {
			return null;
		} else {
			return local9.aClass3Array1[arg0];
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!oj;I)V")
	public static void method2356(@OriginalArg(0) Class48 arg0) {
		if (Static182.aClass1_Sub2_Sub1_Sub1_1.aByte73 != Static278.anInt5164 && (Static45.aClass188ArrayArrayArray5 != null && Static33.method117(arg0, Static182.aClass1_Sub2_Sub1_Sub1_1.aByte73))) {
			Static278.anInt5164 = Static182.aClass1_Sub2_Sub1_Sub1_1.aByte73;
		}
	}

	@OriginalMember(owner = "client!hl", name = "f", descriptor = "(B)V")
	public static void method2357() {
		Static147.method2658();
		Static382.aClass10_4 = null;
		Static92.aClass48_5 = null;
		Static7.aClass10_1 = null;
		Static269.aClass10_2 = null;
		Static169.aClass189ArrayArray3 = null;
	}
}
