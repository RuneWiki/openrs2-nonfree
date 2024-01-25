import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static527 {

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "I")
	public static int anInt9141;

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_159 = new Class44(120, 4);

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "Z")
	public static boolean aBoolean641 = false;

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIIILclient!ha;I)V")
	public static void method7555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class137 arg4) {
		arg4.KA(arg1, arg0, arg3 + arg1, arg2 + arg0);
		arg4.method7869(arg1, arg3, -16777216, arg0, arg2);
		if (Static156.anInt3087 < 100) {
			return;
		}
		@Pc(38) float local38 = (float) Static498.anInt8794 / (float) Static498.anInt8801;
		@Pc(40) int local40 = arg3;
		@Pc(42) int local42 = arg2;
		if (local38 < 1.0F) {
			local42 = (int) ((float) arg3 * local38);
		} else {
			local40 = (int) ((float) arg2 / local38);
		}
		@Pc(68) int local68 = arg0 + (arg2 - local42) / 2;
		@Pc(77) int local77 = arg1 + (arg3 - local40) / 2;
		if (Static656.aClass20_36 == null || arg3 != Static656.aClass20_36.method7412() || Static656.aClass20_36.method7393() != arg2) {
			Static498.method7293(Static498.anInt8795, Static498.anInt8796 + Static498.anInt8794, Static498.anInt8801 + Static498.anInt8795, Static498.anInt8796, local77, local68, local40 + local77, local68 - -local42);
			Static498.method7309(arg4);
			Static656.aClass20_36 = arg4.method7900(local77, local68, local40, local42, false);
		}
		Static656.aClass20_36.method7399(local77, local68);
		@Pc(129) int local129 = Static17.anInt218 * local40 / Static498.anInt8801;
		@Pc(135) int local135 = local42 * Static461.anInt8097 / Static498.anInt8794;
		@Pc(143) int local143 = Static344.anInt11215 * local40 / Static498.anInt8801 + local77;
		@Pc(157) int local157 = local42 + local68 - Static40.anInt1721 * local42 / Static498.anInt8794 - local135;
		@Pc(159) int local159 = -1996554240;
		if (Static635.aClass77_9 == Static630.aClass77_8) {
			local159 = -1996488705;
		}
		arg4.aa(local143, local157, local129, local135, local159, 1);
		arg4.method7927(local143, local157, local129, local135, local159, 0);
		if (Static241.anInt4364 <= 0) {
			return;
		}
		@Pc(194) int local194;
		if (Static149.anInt6799 > 50) {
			local194 = 500 - Static149.anInt6799 * 5;
		} else {
			local194 = Static149.anInt6799 * 5;
		}
		for (@Pc(205) Class14_Sub46 local205 = (Class14_Sub46) Static498.aClass262_60.method6318(); local205 != null; local205 = (Class14_Sub46) Static498.aClass262_60.method6311()) {
			@Pc(213) Class42 local213 = Static498.aClass116_4.method2783(local205.anInt8309);
			if (Static557.method7833(local213)) {
				@Pc(241) int local241;
				@Pc(253) int local253;
				if (Static255.anInt4512 == local205.anInt8309) {
					local241 = local205.anInt8308 * local40 / Static498.anInt8801 + local77;
					local253 = local68 + (Static498.anInt8794 - local205.anInt8307) * local42 / Static498.anInt8794;
					arg4.method7869(local241 - 2, 4, local194 << 24 | 0xFFFF00, local253 - 2, 4);
				} else if (Static159.anInt8121 != -1 && Static159.anInt8121 == local213.anInt1303) {
					local241 = local40 * local205.anInt8308 / Static498.anInt8801 + local77;
					local253 = local42 * (Static498.anInt8794 - local205.anInt8307) / Static498.anInt8794 + local68;
					arg4.method7869(local241 - 2, 4, local194 << 24 | 0xFFFF00, local253 - 2, 4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(ILclient!wia;I)Lclient!ie;")
	public static Class158 method7557(@OriginalArg(1) Class386 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte[] local8 = arg0.method9192(arg1);
		return local8 == null ? null : new Class158(local8);
	}
}
