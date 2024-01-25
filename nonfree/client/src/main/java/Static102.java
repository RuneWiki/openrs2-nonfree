import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!de", name = "g", descriptor = "Lclient!kka;")
	public static final Class198 aClass198_1 = new Class198();

	@OriginalMember(owner = "client!de", name = "l", descriptor = "I")
	public static int anInt2210 = 0;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I[Ljava/lang/String;)V")
	public static void method1990(@OriginalArg(1) String[] arg0) {
		if (arg0.length <= 1) {
			Static390.aString58 = Static390.aString58 + arg0[0];
			Static576.anInt9395 += arg0[0].length();
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < arg0.length; local30++) {
			if (arg0[local30].startsWith("pause")) {
				@Pc(47) int local47 = 5;
				try {
					local47 = Integer.parseInt(arg0[local30].substring(6));
				} catch (@Pc(56) Exception local56) {
				}
				Static574.method7927("Pausing for " + local47 + " seconds...");
				Static584.aStringArray53 = arg0;
				Static175.anInt3416 = local30 + 1;
				Static170.aLong67 = Static547.method7619() + (long) (local47 * 1000);
				return;
			}
			Static390.aString58 = arg0[local30];
			Static127.method2321(false);
		}
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(II)I")
	public static int method1991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static25.aByteArrayArray1 == null ? 0 : Static25.aByteArrayArray1[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I[BIIII)Z")
	public static boolean method1993(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(18) Class5_Sub41 local18 = new Class5_Sub41(arg1);
		@Pc(20) int local20 = -1;
		label56: while (true) {
			@Pc(24) int local24 = local18.method7817();
			if (local24 == 0) {
				return local7;
			}
			local20 += local24;
			@Pc(32) int local32 = 0;
			@Pc(34) boolean local34 = false;
			while (true) {
				@Pc(40) int local40;
				while (!local34) {
					local40 = local18.method7812();
					if (local40 == 0) {
						continue label56;
					}
					local32 += local40 - 1;
					@Pc(67) int local67 = local32 & 0x3F;
					@Pc(73) int local73 = local32 >> 6 & 0x3F;
					@Pc(79) int local79 = local18.method7816() >> 2;
					@Pc(83) int local83 = arg4 + local73;
					@Pc(88) int local88 = local67 + arg0;
					if (local83 > 0 && local88 > 0 && arg2 - 1 > local83 && arg3 - 1 > local88) {
						@Pc(117) Class164 local117 = Static568.aClass315_5.method7511(local20);
						if (local79 != 22 || Static172.aClass5_Sub50_14.aClass12_Sub10_1.method2365() != 0 || local117.anInt4647 != 0 || local117.anInt4632 == 1 || local117.aBoolean379) {
							if (!local117.method3904()) {
								Static408.anInt7217++;
								local7 = false;
							}
							local34 = true;
						}
					}
				}
				local40 = local18.method7812();
				if (local40 == 0) {
					break;
				}
				local18.method7816();
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "e", descriptor = "(I)V")
	public static void method1995() {
		@Pc(10) Class373 local10 = null;
		try {
			@Pc(16) Class331 local16 = Static570.aClass268_5.method6326("");
			while (local16.anInt9108 == 0) {
				Static579.method8004(1L);
			}
			if (local16.anInt9108 == 1) {
				local10 = (Class373) local16.anObject20;
				@Pc(40) Class5_Sub41 local40 = Static172.aClass5_Sub50_14.method7534();
				local10.method8638(local40.aByteArray93, local40.anInt9230, 0);
			}
		} catch (@Pc(50) Exception local50) {
		}
		try {
			if (local10 != null) {
				local10.method8641();
			}
		} catch (@Pc(57) Exception local57) {
		}
	}
}
