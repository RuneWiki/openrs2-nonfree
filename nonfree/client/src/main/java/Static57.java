import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!bw", name = "y", descriptor = "I")
	public static int anInt1135;

	@OriginalMember(owner = "client!bw", name = "z", descriptor = "I")
	public static int anInt1136;

	@OriginalMember(owner = "client!bw", name = "k", descriptor = "Lclient!fe;")
	public static final Class103 aClass103_1 = new Class103("WIP", 2);

	@OriginalMember(owner = "client!bw", name = "v", descriptor = "[I")
	public static final int[] anIntArray75 = new int[500];

	@OriginalMember(owner = "client!bw", name = "w", descriptor = "Z")
	public static boolean aBoolean65 = false;

	@OriginalMember(owner = "client!bw", name = "x", descriptor = "[I")
	public static final int[] anIntArray76 = new int[3];

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lclient!ov;IIIII)V")
	public static void method956(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static68.anInt1380) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static357.anInt5961) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static429.anInt7422 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class217 local62 = Static421.aClass217ArrayArrayArray5[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static11.aClass61Array1[local17].method8580(local32, local23) + Static11.aClass61Array1[local17].method8580(local32, local23 + 1) + Static11.aClass61Array1[local17].method8580(local32 + 1, local23) + Static11.aClass61Array1[local17].method8580(local32 + 1, local23 + 1)) / 4 - (Static11.aClass61Array1[arg1].method8580(arg3, arg2) + Static11.aClass61Array1[arg1].method8580(arg3, arg2 + 1) + Static11.aClass61Array1[arg1].method8580(arg3 + 1, arg2) + Static11.aClass61Array1[arg1].method8580(arg3 + 1, arg2 + 1)) / 4;
									@Pc(151) Class4_Sub2_Sub4 local151 = local62.aClass4_Sub2_Sub4_1;
									@Pc(154) Class4_Sub2_Sub4 local154 = local62.aClass4_Sub2_Sub4_2;
									if (local151 != null && local151.method8722()) {
										arg0.method8715((local23 - arg2) * Static302.anInt5267 + (1 - arg4) * Static147.anInt2575, Static517.aClass133_13, local151, local148, (local32 - arg3) * Static302.anInt5267 + (1 - arg5) * Static147.anInt2575, local1);
									}
									if (local154 != null && local154.method8722()) {
										arg0.method8715((local23 - arg2) * Static302.anInt5267 + (1 - arg4) * Static147.anInt2575, Static517.aClass133_13, local154, local148, (local32 - arg3) * Static302.anInt5267 + (1 - arg5) * Static147.anInt2575, local1);
									}
									for (@Pc(227) Class290 local227 = local62.aClass290_2; local227 != null; local227 = local227.aClass290_3) {
										@Pc(231) Class4_Sub2_Sub1 local231 = local227.aClass4_Sub2_Sub1_1;
										if (local231 != null && local231.method8722() && (local23 == local231.aShort107 || local23 == local3) && (local32 == local231.aShort108 || local32 == local11)) {
											@Pc(260) int local260 = local231.aShort109 + 1 - local231.aShort107;
											@Pc(268) int local268 = local231.aShort110 + 1 - local231.aShort108;
											arg0.method8715((local231.aShort107 - arg2) * Static302.anInt5267 + (local260 - arg4) * Static147.anInt2575, Static517.aClass133_13, local231, local148, (local231.aShort108 - arg3) * Static302.anInt5267 + (local268 - arg5) * Static147.anInt2575, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}
}
