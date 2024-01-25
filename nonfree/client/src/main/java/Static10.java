import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!aea", name = "v", descriptor = "I")
	public static int anInt168;

	@OriginalMember(owner = "client!aea", name = "A", descriptor = "Lclient!ei;")
	public static Class83 aClass83_3;

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "I")
	public static int anInt149 = 0;

	@OriginalMember(owner = "client!aea", name = "g", descriptor = "I")
	public static int anInt155 = 0;

	@OriginalMember(owner = "client!aea", name = "u", descriptor = "[Lclient!bda;")
	public static final Class15_Sub2_Sub1_Sub1[] aClass15_Sub2_Sub1_Sub1Array1 = new Class15_Sub2_Sub1_Sub1[2048];

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IZILclient!qa;II)V")
	public static void method315(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class62 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg2.N(arg1, arg4, arg0 + arg1, arg4 + arg3);
		arg2.method7040(-16777216, arg3, arg4, arg1, arg0);
		if (Static213.anInt4055 < 100) {
			return;
		}
		@Pc(35) float local35 = (float) Static245.anInt7313 / (float) Static245.anInt7316;
		@Pc(37) int local37 = arg0;
		@Pc(39) int local39 = arg3;
		if (local35 < 1.0F) {
			local39 = (int) (local35 * (float) arg0);
		} else {
			local37 = (int) ((float) arg3 / local35);
		}
		@Pc(66) int local66 = arg1 + (arg0 - local37) / 2;
		@Pc(75) int local75 = arg4 + (arg3 - local39) / 2;
		if (Static392.aClass25_21 == null || arg0 != Static392.aClass25_21.c() || Static392.aClass25_21.la() != arg3) {
			Static245.method5966(Static245.anInt7314, Static245.anInt7313 + Static245.anInt7315, Static245.anInt7316 + Static245.anInt7314, Static245.anInt7315, local66, local75, local66 + local37, local75 - -local39);
			Static245.method5959(arg2);
			Static392.aClass25_21 = arg2.method7003(local66, local75, local37, local39, false);
		}
		Static392.aClass25_21.method6956(local66, local75);
		@Pc(133) int local133 = Static469.anInt8088 * local37 / Static245.anInt7316;
		@Pc(139) int local139 = Static214.anInt4061 * local39 / Static245.anInt7313;
		@Pc(148) int local148 = local66 + local37 * Static286.anInt5825 / Static245.anInt7316;
		@Pc(162) int local162 = local75 + local39 - local139 - local39 * Static475.anInt8220 / Static245.anInt7313;
		@Pc(164) int local164 = -1996554240;
		if (Static53.aClass155_1 == Static525.aClass155_4) {
			local164 = -1996488705;
		}
		arg2.f(local148, local162, local133, local139, local164, 1);
		arg2.method7009(local148, local162, local133, local139, local164, 0);
		if (Static224.anInt4176 <= 0) {
			return;
		}
		@Pc(199) int local199;
		if (Static183.anInt4083 <= 50) {
			local199 = Static183.anInt4083 * 5;
		} else {
			local199 = 500 - Static183.anInt4083 * 5;
		}
		for (@Pc(213) Class5_Sub18 local213 = (Class5_Sub18) Static245.aClass99_60.method2526(); local213 != null; local213 = (Class5_Sub18) Static245.aClass99_60.method2519()) {
			@Pc(221) Class101 local221 = Static245.aClass246_4.method5847(local213.anInt3138);
			if (Static517.method7111(local221)) {
				@Pc(250) int local250;
				@Pc(261) int local261;
				if (Static263.anInt5182 == local213.anInt3138) {
					local250 = local66 + local213.anInt3137 * local37 / Static245.anInt7316;
					local261 = local75 + local39 * (Static245.anInt7313 - local213.anInt3144) / Static245.anInt7313;
					arg2.method7040(local199 << 24 | 0xFFFF00, 4, local261 - 2, local250 + -2, 4);
				} else if (Static134.anInt2779 != -1 && Static134.anInt2779 == local221.anInt2886) {
					local250 = local213.anInt3137 * local37 / Static245.anInt7316 + local66;
					local261 = local39 * (Static245.anInt7313 - local213.anInt3144) / Static245.anInt7313 + local75;
					arg2.method7040(local199 << 24 | 0xFFFF00, 4, local261 - 2, local250 + -2, 4);
				}
			}
		}
	}
}
