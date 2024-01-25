import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!na", name = "d", descriptor = "Lclient!nr;")
	public static Class169 aClass169_4;

	@OriginalMember(owner = "client!na", name = "c", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_257 = new Class184(12, -2);

	@OriginalMember(owner = "client!na", name = "g", descriptor = "Z")
	public static boolean aBoolean490 = false;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!qa;)V")
	public static void method5439(@OriginalArg(0) Class75 arg0) {
		for (@Pc(1) int local1 = Static205.anInt4114; local1 < Static281.anInt5169; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static177.anInt3621; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static57.anInt1411; local7++) {
					@Pc(16) Class217 local16 = Static151.aClass217ArrayArrayArray3[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class1_Sub5 local21 = local16.aClass1_Sub5_2;
						@Pc(24) Class1_Sub5 local24 = local16.aClass1_Sub5_3;
						if (local21 != null && local21.method5839()) {
							Static116.method5252(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method5839()) {
								Static116.method5252(arg0, local24, local1, local4, local7, 1, 1);
								local24.method5836(local21, false, 0, 0, arg0, 0);
								local24.method5838();
							}
							local21.method5838();
						}
						for (@Pc(70) Class182 local70 = local16.aClass182_3; local70 != null; local70 = local70.aClass182_2) {
							@Pc(74) Class1_Sub3 local74 = local70.aClass1_Sub3_2;
							if (local74 != null && local74.method5839()) {
								Static116.method5252(arg0, local74, local1, local4, local7, local74.aShort180 + 1 - local74.aShort181, local74.aShort178 - local74.aShort179 + 1);
								local74.method5838();
							}
						}
						@Pc(111) Class1_Sub2 local111 = local16.aClass1_Sub2_1;
						if (local111 != null && local111.method5839()) {
							Static289.method4243(arg0, local111, local1, local4, local7);
							local111.method5838();
						}
					}
				}
			}
		}
	}
}
