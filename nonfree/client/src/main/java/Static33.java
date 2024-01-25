import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "I")
	public static int anInt605;

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "Lclient!la;")
	public static final Class136 aClass136_15 = new Class136(65, 8);

	@OriginalMember(owner = "client!bo", name = "e", descriptor = "I")
	public static int anInt607 = -1;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method585(@OriginalArg(0) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static162.aStringArray16.length; local7++) {
			if (Static162.aStringArray16[local7].equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "([[BILclient!qq;)V")
	public static void method586(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class22_Sub1 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.anInt5763; local7++) {
			Static44.method856();
			for (@Pc(13) int local13 = 0; local13 < Static373.anInt6324 >> 3; local13++) {
				for (@Pc(17) int local17 = 0; local17 < Static291.anInt5062 >> 3; local17++) {
					@Pc(27) int local27 = Static390.anIntArrayArrayArray12[local7][local13][local17];
					if (local27 != -1) {
						@Pc(36) int local36 = local27 >> 24 & 0x3;
						if (!arg1.aBoolean407 || local36 == 0) {
							@Pc(50) int local50 = local27 >> 1 & 0x3;
							@Pc(56) int local56 = local27 >> 14 & 0x3FF;
							@Pc(62) int local62 = local27 >> 3 & 0x7FF;
							@Pc(72) int local72 = local62 / 8 + (local56 / 8 << 8);
							for (@Pc(74) int local74 = 0; local74 < Static127.anIntArray115.length; local74++) {
								if (Static127.anIntArray115[local74] == local72 && arg0[local74] != null) {
									arg1.method4796(Static413.aClass167_11, local13 * 8, local17 * 8, Static250.aClass128Array1, (local56 & 0x7) * 8, (local62 & 0x7) * 8, local7, local36, arg0[local74], local50);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!kw;IIIII)V")
	public static void method588(@OriginalArg(0) Class135 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt6979 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) long local16 = Static60.aLongArrayArrayArray1[arg1][local4][local7];
				@Pc(18) long local18 = 0L;
				while (true) {
					label49: while (true) {
						if (local18 > 48L) {
							continue label54;
						}
						@Pc(27) int local27 = (int) (local16 >>> (int) local18 & 0xFFFFL);
						if (local27 <= 0) {
							continue label54;
						}
						@Pc(35) Class226 local35 = Static197.aClass226Array1[local27 - 1];
						for (@Pc(37) int local37 = 0; local37 < arg0.anInt6979; local37++) {
							if (arg0.aClass3_Sub7Array3[local37] == local35.aClass3_Sub7_2) {
								local18 += 16L;
								continue label49;
							}
						}
						arg0.aClass3_Sub7Array3[arg0.anInt6979++] = local35.aClass3_Sub7_2;
						if (arg0.anInt6979 == 4) {
							break label56;
						}
						local18 += 16L;
					}
				}
			}
		}
		for (local7 = arg0.anInt6979; local7 < 4; local7++) {
			arg0.aClass3_Sub7Array3[local7] = null;
		}
	}
}
