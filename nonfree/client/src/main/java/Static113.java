import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!el", name = "c", descriptor = "Lclient!vv;")
	public static Class307 aClass307_1;

	@OriginalMember(owner = "client!el", name = "h", descriptor = "Lclient!ha;")
	public static Class2 aClass2_12;

	@OriginalMember(owner = "client!el", name = "g", descriptor = "Z")
	public static boolean aBoolean142 = false;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(I[[BLclient!jda;)V")
	public static void method1911(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class149_Sub1 arg1) {
		@Pc(8) int local8 = Static449.aByteArrayArray27.length;
		for (@Pc(14) int local14 = 0; local14 < local8; local14++) {
			@Pc(20) byte[] local20 = arg0[local14];
			if (local20 != null) {
				@Pc(33) int local33 = (Static9.anIntArray23[local14] >> 8) * 64 - Static470.anInt7897;
				@Pc(44) int local44 = (Static9.anIntArray23[local14] & 0xFF) * 64 - Static534.anInt9007;
				Static63.method1142();
				arg1.method3881(local44, local33, local20, Static513.aClass122_10, Static86.aClass91Array1);
			}
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIII[B)Z")
	public static boolean method1913(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(16) Class1_Sub6 local16 = new Class1_Sub6(arg4);
		@Pc(18) int local18 = -1;
		label68: while (true) {
			@Pc(22) int local22 = local16.method3913();
			if (local22 == 0) {
				return local7;
			}
			local18 += local22;
			@Pc(30) int local30 = 0;
			@Pc(32) boolean local32 = false;
			while (true) {
				@Pc(64) int local64;
				@Pc(102) Class36 local102;
				do {
					@Pc(68) int local68;
					@Pc(72) int local72;
					do {
						do {
							do {
								do {
									@Pc(40) int local40;
									while (local32) {
										local40 = local16.method3936();
										if (local40 == 0) {
											continue label68;
										}
										local16.method3922();
									}
									local40 = local16.method3936();
									if (local40 == 0) {
										continue label68;
									}
									local30 += local40 - 1;
									@Pc(52) int local52 = local30 & 0x3F;
									@Pc(58) int local58 = local30 >> 6 & 0x3F;
									local64 = local16.method3922() >> 2;
									local68 = local58 + arg1;
									local72 = arg2 + local52;
								} while (local68 <= 0);
							} while (local72 <= 0);
						} while (arg0 - 1 <= local68);
					} while (arg3 - 1 <= local72);
					local102 = Static308.aClass96_4.method2274(local18);
				} while (local64 == 22 && !Static544.aClass1_Sub22_Sub1_1.aBoolean380 && local102.anInt992 == 0 && local102.anInt969 != 1 && !local102.aBoolean65);
				local32 = true;
				if (!local102.method962()) {
					local7 = false;
					Static532.anInt8953++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Z)V")
	public static void method1914() {
		@Pc(1) Class313 local1 = Static286.aClass313_31;
		synchronized (Static286.aClass313_31) {
			Static286.aClass313_31.method7398();
		}
	}
}
