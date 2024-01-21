import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "[I")
	public static int[] anIntArray55;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "Lclient!mc;")
	private static Class42 aClass42_369 = Static23.method501("Moderator option: Mute player for 48 hours: <OFF>");

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
	public static int anInt663 = 0;

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
	public static volatile int anInt664 = -1;

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "Lclient!mc;")
	private static Class42 aClass42_370 = Static23.method501("Classic");

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
	public static int anInt665 = 0;

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "Lclient!mc;")
	public static Class42 aClass42_371 = aClass42_370;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "Lclient!mc;")
	public static Class42 aClass42_372 = Static23.method501("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "Lclient!mc;")
	public static Class42 aClass42_373 = Static23.method501("Wen m-Ochten Sie hinzuf-Ugen?");

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
	public static int anInt667 = 0;

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "Z")
	public static boolean aBoolean30 = false;

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "Lclient!mc;")
	public static Class42 aClass42_374 = Static23.method501("@red@");

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "Lclient!mc;")
	public static Class42 aClass42_375 = aClass42_369;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
	public static void method446() {
		aClass42_369 = null;
		anIntArray55 = null;
		aClass42_370 = null;
		aClass42_373 = null;
		aClass42_372 = null;
		aClass42_371 = null;
		aClass42_374 = null;
		aClass42_375 = null;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "([BIII)Z")
	public static boolean method447(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class1_Sub8 local17 = new Class1_Sub8(arg0);
		@Pc(19) boolean local19 = true;
		@Pc(21) int local21 = -1;
		label52: while (true) {
			@Pc(27) int local27 = local17.method1190();
			if (local27 == 0) {
				return local19;
			}
			local21 += local27;
			@Pc(38) boolean local38 = false;
			@Pc(40) int local40 = 0;
			while (true) {
				@Pc(46) int local46;
				while (!local38) {
					local46 = local17.method1190();
					if (local46 == 0) {
						continue label52;
					}
					local40 += local46 - 1;
					@Pc(75) int local75 = local40 >> 6 & 0x3F;
					@Pc(81) int local81 = local17.method1186() >> 2;
					@Pc(85) int local85 = local40 & 0x3F;
					@Pc(89) int local89 = arg2 + local75;
					@Pc(93) int local93 = arg1 + local85;
					if (local89 > 0 && local93 > 0 && local89 < 103 && local93 < 103) {
						@Pc(112) Class1_Sub1_Sub9 local112 = Static42.method1755(local21);
						if (local81 != 22 || !Static75.aBoolean85 || local112.anInt1272 != 0 || local112.aBoolean76) {
							local38 = true;
							if (!local112.method884()) {
								local19 = false;
								Static80.anInt2110++;
							}
						}
					}
				}
				local46 = local17.method1190();
				if (local46 == 0) {
					break;
				}
				local17.method1186();
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BLclient!pa;Z)V")
	public static void method448(@OriginalArg(1) Class47 arg0, @OriginalArg(2) boolean arg1) {
		if (Static97.aClass47_29 != null) {
			try {
				Static97.aClass47_29.method1338();
			} catch (@Pc(8) Exception local8) {
			}
			Static97.aClass47_29 = null;
		}
		Static97.aClass47_29 = arg0;
		Static108.method1850(arg1);
		Static27.anInt775 = 0;
		Static90.aClass1_Sub8_5 = null;
		Static5.aClass1_Sub1_Sub13_1 = null;
		Static87.aClass1_Sub8_4.anInt1692 = 0;
		while (true) {
			@Pc(38) Class1_Sub1_Sub13 local38 = (Class1_Sub1_Sub13) Static25.aClass41_3.method1024();
			if (local38 == null) {
				while (true) {
					local38 = (Class1_Sub1_Sub13) Static19.aClass41_2.method1024();
					if (local38 == null) {
						if (Static34.aByte2 != 0) {
							try {
								@Pc(93) Class1_Sub8 local93 = new Class1_Sub8(4);
								local93.method1185(4);
								local93.method1185(Static34.aByte2);
								local93.method1222(0);
								Static97.aClass47_29.method1343(4, local93.aByteArray24);
							} catch (@Pc(114) IOException local114) {
								try {
									Static97.aClass47_29.method1338();
								} catch (@Pc(119) Exception local119) {
								}
								Static58.anInt1442++;
								Static97.aClass47_29 = null;
							}
						}
						Static8.anInt240 = 0;
						Static48.aLong36 = System.currentTimeMillis();
						return;
					}
					Static13.aClass5_1.method105(local38);
					Static101.aClass41_6.method1019(local38.aLong83, local38);
					Static65.anInt1578--;
					Static11.anInt357++;
				}
			}
			Static83.aClass41_5.method1019(local38.aLong83, local38);
			Static37.anInt909--;
			Static9.anInt253++;
		}
	}
}
