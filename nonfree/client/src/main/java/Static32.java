import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bb", name = "sb", descriptor = "I")
	public static int anInt784;

	@OriginalMember(owner = "client!bb", name = "yb", descriptor = "Lclient!da;")
	public static Class19 aClass19_3;

	@OriginalMember(owner = "client!bb", name = "Ab", descriptor = "Lclient!oo;")
	public static Class207 aClass207_6;

	@OriginalMember(owner = "client!bb", name = "X", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_36 = new Class179(39, 16);

	@OriginalMember(owner = "client!bb", name = "ob", descriptor = "Lclient!iga;")
	public static final Class159 aClass159_2 = new Class159(6, 16);

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILclient!ns;)V")
	public static void method788(@OriginalArg(1) Class2_Sub1_Sub1_Sub3 arg0) {
		@Pc(5) boolean local5 = false;
		if (arg0.anInt5117 == Static90.anInt1698 || arg0.anInt5077 == -1 || arg0.anInt5065 != 0) {
			local5 = true;
		} else {
			@Pc(23) Class119 local23 = Static334.aClass268_2.method6469(arg0.anInt5077);
			if (local23.aBoolean187 || arg0.anInt5054 + 1 > local23.anIntArray168[arg0.anInt5115]) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(54) int local54 = arg0.anInt5117 - arg0.anInt5100;
			@Pc(60) int local60 = Static90.anInt1698 - arg0.anInt5100;
			@Pc(73) int local73 = arg0.anInt5094 * 512 + arg0.method4326() * 256;
			@Pc(85) int local85 = arg0.anInt5076 * 512 + arg0.method4326() * 256;
			@Pc(96) int local96 = arg0.anInt5060 * 512 + arg0.method4326() * 256;
			@Pc(110) int local110 = arg0.anInt5073 * 512 + arg0.method4326() * 256;
			arg0.anInt10006 = (local73 * (local54 - local60) + local60 * local96) / local54;
			arg0.anInt10001 = ((local54 - local60) * local85 + local60 * local110) / local54;
		}
		arg0.anInt5122 = 0;
		if (arg0.anInt5069 == 0) {
			arg0.method4328(8192, false);
		}
		if (arg0.anInt5069 == 1) {
			arg0.method4328(12288, false);
		}
		if (arg0.anInt5069 == 2) {
			arg0.method4328(0, false);
		}
		if (arg0.anInt5069 == 3) {
			arg0.method4328(4096, false);
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIILclient!ha;)V")
	public static void method791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) Class132 arg4) {
		if ((Static474.aClass9_30 == null || Static149.aClass9_16 == null || Static131.aClass9_14 == null) && Static624.aClass8_139.method273(Static557.anInt9339) && Static624.aClass8_139.method273(Static258.anInt4492) && Static624.aClass8_139.method273(Static232.anInt3961)) {
			@Pc(31) Class112 local31 = Static681.method2327(Static624.aClass8_139, Static258.anInt4492, 0);
			Static149.aClass9_16 = arg4.method7488(local31, true);
			local31.method2320();
			Static22.aClass9_2 = arg4.method7488(local31, true);
			Static474.aClass9_30 = arg4.method7488(Static681.method2327(Static624.aClass8_139, Static557.anInt9339, 0), true);
			@Pc(56) Class112 local56 = Static681.method2327(Static624.aClass8_139, Static232.anInt3961, 0);
			Static131.aClass9_14 = arg4.method7488(local56, true);
			local56.method2320();
			Static308.aClass9_25 = arg4.method7488(local56, true);
		}
		if (Static474.aClass9_30 == null || Static149.aClass9_16 == null || Static131.aClass9_14 == null) {
			return;
		}
		@Pc(85) int local85 = (arg1 - Static131.aClass9_14.method8938() * 2) / Static474.aClass9_30.method8938();
		for (@Pc(87) int local87 = 0; local87 < local85; local87++) {
			Static474.aClass9_30.method8920(Static131.aClass9_14.method8938() + arg3 + Static474.aClass9_30.method8938() * local87, arg2 + arg0 + -Static474.aClass9_30.method8918());
		}
		@Pc(128) int local128 = (arg2 - Static131.aClass9_14.method8918() - 20) / Static149.aClass9_16.method8918();
		for (@Pc(130) int local130 = 0; local130 < local128; local130++) {
			Static149.aClass9_16.method8920(arg3, arg0 + Static149.aClass9_16.method8918() * local130 + 20);
			Static22.aClass9_2.method8920(arg1 + arg3 - Static22.aClass9_2.method8938(), arg0 + 20 + local130 * Static149.aClass9_16.method8918());
		}
		Static131.aClass9_14.method8920(arg3, arg2 + arg0 - Static131.aClass9_14.method8918());
		Static308.aClass9_25.method8920(arg1 + arg3 - Static131.aClass9_14.method8938(), arg0 + arg2 - Static131.aClass9_14.method8918());
	}
}
