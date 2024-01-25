import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!gr", name = "p", descriptor = "I")
	public static int anInt4448;

	@OriginalMember(owner = "client!gr", name = "q", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_49 = new Class218(46, 6);

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(BLclient!tn;)Lclient!gn;")
	public static Class102 method3795(@OriginalArg(1) Class3_Sub15 arg0) {
		@Pc(7) int local7 = arg0.method8414();
		@Pc(16) Class117 local16 = Static505.method7370()[arg0.method8401()];
		@Pc(23) Class178 local23 = Static324.method5445()[arg0.method8401()];
		@Pc(27) int local27 = arg0.method8444();
		@Pc(36) int local36 = arg0.method8444();
		return new Class102(local7, local16, local23, local27, local36);
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lclient!lea;BZ)V")
	public static void method3797(@OriginalArg(0) Class2_Sub3_Sub1_Sub2_Sub2 arg0, @OriginalArg(2) boolean arg1) {
		if (Static443.anInt8026 >= 400) {
			return;
		}
		if (Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2 != arg0) {
			@Pc(67) String local67;
			if (arg0.anInt6361 == 0) {
				@Pc(95) boolean local95 = true;
				if (Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt6349 != -1 && arg0.anInt6349 != -1) {
					@Pc(114) int local114 = Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt6349 < arg0.anInt6349 ? Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt6349 : arg0.anInt6349;
					@Pc(120) int local120 = Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt6383 - arg0.anInt6383;
					if (local120 < 0) {
						local120 = -local120;
					}
					if (local120 > local114) {
						local95 = false;
					}
				}
				@Pc(143) String local143 = Static518.aClass62_15 == Static648.aClass62_16 ? Static287.aClass176_30.method4986(Static380.anInt7247) : Static287.aClass176_28.method4986(Static380.anInt7247);
				if (arg0.anInt6353 <= arg0.anInt6383) {
					local67 = arg0.method5327() + (local95 ? Static370.method5904(arg0.anInt6383, Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt6383) : "<col=ffffff>") + " (" + local143 + arg0.anInt6383 + ")";
				} else {
					local67 = arg0.method5327() + (local95 ? Static370.method5904(arg0.anInt6383, Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt6383) : "<col=ffffff>") + " (" + local143 + arg0.anInt6383 + "+" + (arg0.anInt6353 - arg0.anInt6383) + ")";
				}
			} else if (arg0.anInt6361 == -1) {
				local67 = arg0.method5327();
			} else {
				local67 = arg0.method5327() + " (" + Static287.aClass176_29.method4986(Static380.anInt7247) + arg0.anInt6361 + ")";
			}
			if (Static82.aBoolean192 && !arg1 && (Static607.anInt10027 & 0x8) != 0) {
				Static512.method7408(46, Static275.aString60 + " -> <col=ffffff>" + local67, -1, true, (long) arg0.anInt6289, Static330.aString71, (long) arg0.anInt6289, false, 0, 0, false, Static287.anInt5894);
			}
			if (arg1) {
				Static512.method7408(-1, "", 0, false, (long) arg0.anInt6289, "<col=cccccc>" + local67, 0L, true, 0, 0, false, -1);
			} else {
				for (@Pc(296) int local296 = 7; local296 >= 0; local296--) {
					if (Static186.aStringArray17[local296] != null) {
						@Pc(304) short local304 = 0;
						if (Static648.aClass62_16 == Static592.aClass62_13 && Static186.aStringArray17[local296].equalsIgnoreCase(Static287.aClass176_23.method4986(Static380.anInt7247))) {
							if (arg0.anInt6383 > Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt6383) {
								local304 = 2000;
							}
							if (Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt6377 != 0 && arg0.anInt6377 != 0) {
								if (arg0.anInt6377 == Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt6377) {
									local304 = 2000;
								} else {
									local304 = 0;
								}
							}
						} else if (Static185.aBooleanArray13[local296]) {
							local304 = 2000;
						}
						@Pc(355) short local355 = (short) (Static271.aShortArray89[local296] + local304);
						@Pc(366) int local366 = Static382.anIntArray440[local296] == -1 ? Static83.anInt6965 : Static382.anIntArray440[local296];
						Static512.method7408(local355, "<col=ffffff>" + local67, -1, true, (long) arg0.anInt6289, Static186.aStringArray17[local296], (long) arg0.anInt6289, false, 0, 0, false, local366);
					}
				}
			}
			if (!arg1) {
				for (@Pc(406) Class3_Sub1_Sub4 local406 = (Class3_Sub1_Sub4) Static187.aClass276_28.method6907(); local406 != null; local406 = (Class3_Sub1_Sub4) Static187.aClass276_28.method6912()) {
					if (local406.anInt3485 == 48) {
						local406.aString26 = "<col=ffffff>" + local67;
						return;
					}
				}
			}
		} else if (Static82.aBoolean192 && (Static607.anInt10027 & 0x10) != 0) {
			Static512.method7408(47, Static275.aString60 + " -> <col=ffffff>" + Static287.aClass176_37.method4986(Static380.anInt7247), -1, true, (long) arg0.anInt6289, Static330.aString71, 0L, false, 0, 0, false, Static287.anInt5894);
		}
	}
}
