import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static503 {

	@OriginalMember(owner = "client!tea", name = "j", descriptor = "I")
	public static final int anInt9050 = 1405;

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lclient!jn;ZI)Lclient!gda;")
	public static Class114 method7393(@OriginalArg(0) Class176 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte[] local8 = arg0.method4005(arg1);
		return local8 == null ? null : new Class114(local8);
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(III[BII)Z")
	public static boolean method7395(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(17) Class4_Sub11 local17 = new Class4_Sub11(arg2);
		@Pc(19) int local19 = -1;
		label54: while (true) {
			@Pc(23) int local23 = local17.method4924();
			if (local23 == 0) {
				return local7;
			}
			local19 += local23;
			@Pc(31) int local31 = 0;
			@Pc(33) boolean local33 = false;
			while (true) {
				@Pc(39) int local39;
				while (!local33) {
					local39 = local17.method4942();
					if (local39 == 0) {
						continue label54;
					}
					local31 += local39 - 1;
					@Pc(69) int local69 = local31 & 0x3F;
					@Pc(75) int local75 = local31 >> 6 & 0x3F;
					@Pc(81) int local81 = local17.method4905() >> 2;
					@Pc(86) int local86 = local75 + arg3;
					@Pc(91) int local91 = local69 + arg1;
					if (local86 > 0 && local91 > 0 && local86 < arg4 - 1 && arg0 - 1 > local91) {
						@Pc(113) Class101 local113 = Static204.aClass139_8.method3309(local19);
						if (local81 != 22 || Static214.aClass4_Sub19_Sub1_1.aBoolean264 || local113.anInt2924 != 0 || local113.anInt2916 == 1 || local113.lb) {
							local33 = true;
							if (!local113.method2708()) {
								local7 = false;
								Static149.anInt3137++;
							}
						}
					}
				}
				local39 = local17.method4942();
				if (local39 == 0) {
					break;
				}
				local17.method4905();
			}
		}
	}
}
