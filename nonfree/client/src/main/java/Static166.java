import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!g", name = "T", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BLclient!ha;ILclient!bg;)V")
	public static void method2417(@OriginalArg(1) Class133 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class34 arg2) {
		@Pc(17) int local17;
		if (Static526.anIntArray496 != null && arg2.aByte31 >= arg1) {
			for (local17 = 0; local17 < Static526.anIntArray496.length; local17++) {
				if (Static526.anIntArray496[local17] != -1000000 && (arg2.anIntArray60[0] <= Static526.anIntArray496[local17] || arg2.anIntArray60[1] <= Static526.anIntArray496[local17] || arg2.anIntArray60[2] <= Static526.anIntArray496[local17] || arg2.anIntArray60[3] <= Static526.anIntArray496[local17]) && (Static82.anIntArray115[local17] >= arg2.anIntArray62[0] || arg2.anIntArray62[1] <= Static82.anIntArray115[local17] || arg2.anIntArray62[2] <= Static82.anIntArray115[local17] || arg2.anIntArray62[3] <= Static82.anIntArray115[local17]) && (Static100.anIntArray123[local17] <= arg2.anIntArray62[0] || Static100.anIntArray123[local17] <= arg2.anIntArray62[1] || arg2.anIntArray62[2] >= Static100.anIntArray123[local17] || arg2.anIntArray62[3] >= Static100.anIntArray123[local17]) && (Static621.anIntArray590[local17] >= arg2.anIntArray61[0] || Static621.anIntArray590[local17] >= arg2.anIntArray61[1] || arg2.anIntArray61[2] <= Static621.anIntArray590[local17] || Static621.anIntArray590[local17] >= arg2.anIntArray61[3]) && (Static344.anIntArray324[local17] <= arg2.anIntArray61[0] || arg2.anIntArray61[1] >= Static344.anIntArray324[local17] || Static344.anIntArray324[local17] <= arg2.anIntArray61[2] || Static344.anIntArray324[local17] <= arg2.anIntArray61[3])) {
					return;
				}
			}
		}
		@Pc(264) int local264;
		@Pc(290) int local290;
		@Pc(314) boolean local314;
		@Pc(342) float local342;
		if (arg2.aByte32 == 1) {
			local17 = Static51.anInt1064 + arg2.aShort20 - Static260.anInt4712;
			if (local17 >= 0 && local17 <= Static51.anInt1064 + Static51.anInt1064) {
				local264 = Static51.anInt1064 + arg2.aShort21 - Static598.anInt10044;
				if (local264 < 0) {
					local264 = 0;
				} else if (Static51.anInt1064 + Static51.anInt1064 < local264) {
					return;
				}
				local290 = Static51.anInt1064 + arg2.aShort22 - Static598.anInt10044;
				if (Static51.anInt1064 + Static51.anInt1064 < local290) {
					local290 = Static51.anInt1064 + Static51.anInt1064;
				} else if (local290 < 0) {
					return;
				}
				local314 = false;
				while (local264 <= local290) {
					if (Static475.aBooleanArrayArray8[local17][local264++]) {
						local314 = true;
						break;
					}
				}
				if (local314) {
					local342 = Static36.anInt575 - arg2.anIntArray62[0];
					if (local342 < 0.0F) {
						local342 *= -1.0F;
					}
					if (!local342 < (float) Static290.anInt5061 && (Static176.method2704(arg2, 0) && (Static176.method2704(arg2, 1) && (Static176.method2704(arg2, 2) && Static176.method2704(arg2, 3))))) {
						Static41.aClass34Array2[Static333.anInt5654++] = arg2;
					}
				}
			}
		} else if (arg2.aByte32 == 2) {
			local17 = arg2.aShort21 + Static51.anInt1064 - Static598.anInt10044;
			if (local17 >= 0 && Static51.anInt1064 + Static51.anInt1064 >= local17) {
				local264 = Static51.anInt1064 + arg2.aShort20 - Static260.anInt4712;
				if (local264 < 0) {
					local264 = 0;
				} else if (Static51.anInt1064 + Static51.anInt1064 < local264) {
					return;
				}
				local290 = arg2.aShort23 + Static51.anInt1064 - Static260.anInt4712;
				if (local290 > Static51.anInt1064 + Static51.anInt1064) {
					local290 = Static51.anInt1064 + Static51.anInt1064;
				} else if (local290 < 0) {
					return;
				}
				local314 = false;
				while (local264 <= local290) {
					if (Static475.aBooleanArrayArray8[local264++][local17]) {
						local314 = true;
						break;
					}
				}
				if (local314) {
					local342 = Static73.anInt6083 - arg2.anIntArray61[0];
					if (local342 < 0.0F) {
						local342 *= -1.0F;
					}
					if (!((float) Static290.anInt5061 > local342) && (Static176.method2704(arg2, 0) && (Static176.method2704(arg2, 1) && (Static176.method2704(arg2, 2) && Static176.method2704(arg2, 3))))) {
						Static41.aClass34Array2[Static333.anInt5654++] = arg2;
					}
				}
			}
		} else if (arg2.aByte32 == 16 || arg2.aByte32 == 8) {
			local17 = Static51.anInt1064 + arg2.aShort20 - Static260.anInt4712;
			if (local17 >= 0 && Static51.anInt1064 + Static51.anInt1064 >= local17) {
				local264 = Static51.anInt1064 + arg2.aShort21 - Static598.anInt10044;
				if (local264 >= 0 && Static51.anInt1064 + Static51.anInt1064 >= local264 && Static475.aBooleanArrayArray8[local17][local264]) {
					@Pc(614) float local614 = (float) (Static36.anInt575 - arg2.anIntArray62[0]);
					if (local614 < 0.0F) {
						local614 *= -1.0F;
					}
					@Pc(630) float local630 = (float) (Static73.anInt6083 - arg2.anIntArray61[0]);
					if (local630 < 0.0F) {
						local630 *= -1.0F;
					}
					if ((!(local614 < (float) Static290.anInt5061) || !((float) Static290.anInt5061 > local630)) && (Static176.method2704(arg2, 0) && (Static176.method2704(arg2, 1) && (Static176.method2704(arg2, 2) && Static176.method2704(arg2, 3))))) {
						Static41.aClass34Array2[Static333.anInt5654++] = arg2;
					}
				}
			}
		} else if (arg2.aByte32 == 4) {
			@Pc(700) float local700 = (float) (arg2.anIntArray60[0] - Static213.anInt4045);
			if (!((float) Static10.anInt222 >= local700)) {
				local264 = Static51.anInt1064 + arg2.aShort21 - Static598.anInt10044;
				if (local264 < 0) {
					local264 = 0;
				} else if (Static51.anInt1064 + Static51.anInt1064 < local264) {
					return;
				}
				local290 = Static51.anInt1064 + arg2.aShort22 - Static598.anInt10044;
				if (Static51.anInt1064 + Static51.anInt1064 < local290) {
					local290 = Static51.anInt1064 + Static51.anInt1064;
				} else if (local290 < 0) {
					return;
				}
				@Pc(767) int local767 = arg2.aShort20 + Static51.anInt1064 - Static260.anInt4712;
				if (local767 < 0) {
					local767 = 0;
				} else if (Static51.anInt1064 + Static51.anInt1064 < local767) {
					return;
				}
				@Pc(788) int local788 = arg2.aShort23 + Static51.anInt1064 - Static260.anInt4712;
				if (local788 > Static51.anInt1064 + Static51.anInt1064) {
					local788 = Static51.anInt1064 + Static51.anInt1064;
				} else if (local788 < 0) {
					return;
				}
				@Pc(807) boolean local807 = false;
				label283: for (@Pc(809) int local809 = local767; local809 <= local788; local809++) {
					for (@Pc(813) int local813 = local264; local813 <= local290; local813++) {
						if (Static475.aBooleanArrayArray8[local809][local813]) {
							local807 = true;
							break label283;
						}
					}
				}
				if (local807 && (Static176.method2704(arg2, 0) && (Static176.method2704(arg2, 1) && (Static176.method2704(arg2, 2) && Static176.method2704(arg2, 3))))) {
					Static41.aClass34Array2[Static333.anInt5654++] = arg2;
				}
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method2418(@OriginalArg(1) String arg0) {
		if (!arg0.equals("")) {
			@Pc(21) Class5_Sub48 local21 = Static16.method232(Static636.aClass46_110, Static276.aClass251_2);
			local21.aClass5_Sub22_Sub1_2.method5905(Static381.method5596(arg0));
			local21.aClass5_Sub22_Sub1_2.method5910(arg0);
			Static277.method4436(local21);
		}
	}
}
