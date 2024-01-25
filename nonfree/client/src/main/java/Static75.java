import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!em", name = "f", descriptor = "Lclient!nq;")
	public static Class144 aClass144_28;

	@OriginalMember(owner = "client!em", name = "j", descriptor = "I")
	public static int anInt1419;

	@OriginalMember(owner = "client!em", name = "b", descriptor = "[I")
	public static final int[] anIntArray93 = new int[50];

	@OriginalMember(owner = "client!em", name = "g", descriptor = "Z")
	public static boolean aBoolean86 = false;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V")
	public static void method1144() {
		for (@Pc(7) int local7 = 0; local7 < Static90.anInt4650; local7++) {
			@Pc(13) int local13 = Static309.anIntArray498[local7];
			@Pc(17) Class67_Sub3_Sub3_Sub1 local17 = Static356.aClass67_Sub3_Sub3_Sub1Array1[local13];
			@Pc(21) int local21 = Static246.aClass11_Sub25_Sub1_3.method5185();
			if ((local21 & 0x20) != 0) {
				local21 += Static246.aClass11_Sub25_Sub1_3.method5185() << 8;
			}
			if ((local21 & 0x400) != 0) {
				local17.anInt5027 = Static246.aClass11_Sub25_Sub1_3.method5179();
				local17.anInt5008 = Static246.aClass11_Sub25_Sub1_3.method5187();
			}
			if ((local21 & 0x4) != 0) {
				if (local17.aClass82_1.method1563()) {
					Static168.method2725(local17);
				}
				local17.method2677(Static156.method2516(Static246.aClass11_Sub25_Sub1_3.method5179()));
				local17.method4367(local17.aClass82_1.anInt1871);
				local17.anInt5055 = local17.aClass82_1.anInt1866 << 3;
				if (local17.aClass82_1.method1563()) {
					Static308.method5158(local17.anIntArray392[0], null, 0, local17, local17.anIntArray391[0], null, Static322.anInt6250);
				}
			}
			@Pc(121) int local121;
			if ((local21 & 0x200) != 0) {
				local121 = Static246.aClass11_Sub25_Sub1_3.method5187();
				local17.anInt5028 = Static246.aClass11_Sub25_Sub1_3.method5219();
				local17.anInt5020 = Static246.aClass11_Sub25_Sub1_3.method5200();
				local17.anInt5053 = local121 & 0x7FFF;
				local17.aBoolean331 = (local121 & 0x8000) != 0;
				local17.anInt5019 = local17.anInt5053 + Static293.anInt5807 + local17.anInt5028;
			}
			@Pc(169) int local169;
			@Pc(211) int local211;
			if ((local21 & 0x10) != 0) {
				local121 = Static246.aClass11_Sub25_Sub1_3.method5201();
				local169 = Static246.aClass11_Sub25_Sub1_3.method5207();
				if (local121 == 65535) {
					local121 = -1;
				}
				@Pc(176) boolean local176 = true;
				@Pc(208) Class111 local208;
				if (local121 != -1 && local17.anInt5043 != -1) {
					@Pc(196) Class213 local196;
					if (local121 == local17.anInt5043) {
						local196 = Static89.method1296(local121);
						if (local196.aBoolean424 && local196.anInt6649 != -1) {
							local208 = Static306.method5143(local196.anInt6649);
							local211 = local208.anInt2720;
							if (local211 == 0) {
								local176 = false;
							} else if (local211 == 1) {
								local176 = true;
							} else if (local211 == 2) {
								local176 = false;
								local17.anInt5000 = 0;
							}
						}
					} else {
						local196 = Static89.method1296(local121);
						@Pc(254) Class213 local254 = Static89.method1296(local17.anInt5043);
						if (local196.anInt6649 != -1 && local254.anInt6649 != -1) {
							@Pc(268) Class111 local268 = Static306.method5143(local196.anInt6649);
							@Pc(273) Class111 local273 = Static306.method5143(local254.anInt6649);
							if (local273.anInt2716 > local268.anInt2716) {
								local176 = false;
							}
						}
					}
				}
				if (local176) {
					local17.anInt5033 = local169 >> 16;
					local17.anInt5058 = 1;
					local17.anInt5061 = Static293.anInt5807 + (local169 & 0xFFFF);
					local17.anInt5007 = 0;
					local17.anInt5043 = local121;
					local17.anInt5039 = 0;
					if (Static293.anInt5807 < local17.anInt5061) {
						local17.anInt5039 = -1;
					}
					if (local17.anInt5043 != -1 && Static293.anInt5807 == local17.anInt5061) {
						@Pc(340) int local340 = Static89.method1296(local17.anInt5043).anInt6649;
						if (local340 != -1) {
							local208 = Static306.method5143(local340);
							if (local208 != null && local208.anIntArray191 != null) {
								Static354.method5681(local17.anInt6310, local17.anInt6308, local208, false, 0);
							}
						}
					}
				}
			}
			if ((local21 & 0x40) != 0) {
				local121 = Static246.aClass11_Sub25_Sub1_3.method5187();
				if (local121 == 65535) {
					local121 = -1;
				}
				local169 = Static246.aClass11_Sub25_Sub1_3.method5185();
				Static296.method4894(local121, local169, local17);
			}
			if ((local21 & 0x80) != 0) {
				local17.aString49 = Static246.aClass11_Sub25_Sub1_3.method5184();
				local17.anInt4995 = 100;
			}
			if ((local21 & 0x8) != 0) {
				local121 = Static246.aClass11_Sub25_Sub1_3.method5188();
				local169 = Static246.aClass11_Sub25_Sub1_3.method5200();
				local17.method4381(Static293.anInt5807, local121, local169);
			}
			if ((local21 & 0x2) != 0) {
				local121 = Static246.aClass11_Sub25_Sub1_3.method5188();
				local169 = Static246.aClass11_Sub25_Sub1_3.method5219();
				local17.method4381(Static293.anInt5807, local121, local169);
				local17.anInt5042 = Static293.anInt5807 + 300;
				local17.anInt4998 = Static246.aClass11_Sub25_Sub1_3.method5185();
			}
			if ((local21 & 0x100) != 0) {
				local121 = Static246.aClass11_Sub25_Sub1_3.method5185();
				@Pc(466) int[] local466 = new int[local121];
				@Pc(469) int[] local469 = new int[local121];
				@Pc(472) int[] local472 = new int[local121];
				for (@Pc(474) int local474 = 0; local474 < local121; local474++) {
					local211 = Static246.aClass11_Sub25_Sub1_3.method5179();
					if (local211 == 65535) {
						local211 = -1;
					}
					local466[local474] = local211;
					local469[local474] = Static246.aClass11_Sub25_Sub1_3.method5200();
					local472[local474] = Static246.aClass11_Sub25_Sub1_3.method5179();
				}
				Static258.method4482(local466, local472, local17, local469);
			}
			if ((local21 & 0x1) != 0) {
				local17.anInt5023 = Static246.aClass11_Sub25_Sub1_3.method5201();
				if (local17.anInt5023 == 65535) {
					local17.anInt5023 = -1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(BI)V")
	public static void method1146(@OriginalArg(1) int arg0) {
		if (arg0 == 37) {
			Static271.aFloat48 = 3.0F;
		} else if (arg0 == 50) {
			Static271.aFloat48 = 4.0F;
		} else if (arg0 == 75) {
			Static271.aFloat48 = 6.0F;
		} else if (arg0 == 100) {
			Static271.aFloat48 = 8.0F;
		} else if (arg0 == 200) {
			Static271.aFloat48 = 16.0F;
		}
		Static307.anInt4795 = -1;
		Static307.anInt4795 = -1;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(II)V")
	public static void method1147() {
		Static141.aClass26_22.method329(50);
		Static132.aClass26_21.method329(50);
		Static136.aClass26_59.method329(50);
		Static222.aClass26_42.method329(50);
		Static157.aClass26_28.method329(50);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IIZ)I")
	public static int method1149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0 >>> 24;
		@Pc(30) int local30 = ((arg0 & 0xFF00) * local12 & 0xFF0000 | (arg0 & 0xFF00FF) * local12 & 0xFF00FF00) >>> 8;
		@Pc(34) int local34 = 255 - local12;
		return ((local34 * (arg1 & 0xFF00FF) & 0xFF00FF00 | local34 * (arg1 & 0xFF00) & 0xFF0000) >>> 8) + local30;
	}
}
