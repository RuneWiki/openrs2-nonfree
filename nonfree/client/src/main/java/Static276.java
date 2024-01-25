import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!il", name = "r", descriptor = "Lclient!wc;")
	public static Class394 aClass394_7;

	@OriginalMember(owner = "client!il", name = "u", descriptor = "I")
	public static int anInt8866 = 0;

	@OriginalMember(owner = "client!il", name = "n", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_131 = new Class349(78, 7);

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V")
	public static void method7839(@OriginalArg(0) byte arg0) {
		@Pc(8) Class2_Sub20_Sub2 local8 = Static487.aClass221_2.aClass2_Sub20_Sub2_2;
		Static718.anInt10954 = local8.method8588();
		@Pc(24) boolean local24 = local8.method8557() == 1;
		@Pc(28) int local28 = local8.method8557();
		@Pc(32) int local32 = local8.method8575();
		@Pc(36) int local36 = local8.method8530();
		Static715.method9514();
		Static618.method8402(local28);
		local8.method8607();
		@Pc(50) int local50;
		@Pc(54) int local54;
		@Pc(61) int local61;
		for (@Pc(46) int local46 = 0; local46 < 4; local46++) {
			for (local50 = 0; local50 < Static426.anInt6942 >> 3; local50++) {
				for (local54 = 0; local54 < Static280.anInt6752 >> 3; local54++) {
					local61 = local8.method8608(1);
					if (local61 == 1) {
						Static675.anIntArrayArrayArray26[local46][local50][local54] = local8.method8608(26);
					} else {
						Static675.anIntArrayArrayArray26[local46][local50][local54] = -1;
					}
				}
			}
		}
		local8.method8605();
		local50 = (Static487.aClass221_2.anInt5773 - local8.anInt9723) / 16;
		Static152.anIntArrayArray15 = new int[local50][4];
		for (local54 = 0; local54 < local50; local54++) {
			for (local61 = 0; local61 < 4; local61++) {
				Static152.anIntArrayArray15[local54][local61] = local8.method8555(-9372);
			}
		}
		Static453.anIntArray534 = new int[local50];
		Static148.anIntArray187 = new int[local50];
		Static523.anIntArray462 = new int[local50];
		Static495.aByteArrayArray17 = null;
		if (arg0 != 110) {
			method7839((byte) -40);
		}
		Static336.aByteArrayArray10 = new byte[local50][];
		Static9.anIntArray32 = new int[local50];
		Static608.anIntArray687 = null;
		Static398.anIntArray452 = new int[local50];
		Static671.aByteArrayArray26 = new byte[local50][];
		Static453.aByteArrayArray13 = new byte[local50][];
		Static100.aByteArrayArray1 = new byte[local50][];
		local50 = 0;
		for (local61 = 0; local61 < 4; local61++) {
			for (@Pc(215) int local215 = 0; local215 < Static426.anInt6942 >> 3; local215++) {
				for (@Pc(219) int local219 = 0; local219 < Static280.anInt6752 >> 3; local219++) {
					@Pc(229) int local229 = Static675.anIntArrayArrayArray26[local61][local215][local219];
					if (local229 != -1) {
						@Pc(238) int local238 = local229 >> 14 & 0x3FF;
						@Pc(244) int local244 = local229 >> 3 & 0x7FF;
						@Pc(255) int local255 = (local238 / 8 << 8) + (local244 / 8);
						for (@Pc(257) int local257 = 0; local257 < local50; local257++) {
							if (local255 == Static148.anIntArray187[local257]) {
								local255 = -1;
								break;
							}
						}
						if (local255 != -1) {
							Static148.anIntArray187[local50] = local255;
							@Pc(294) int local294 = local255 >> 8 & 0xFF;
							@Pc(298) int local298 = local255 & 0xFF;
							Static398.anIntArray452[local50] = Static311.aClass254_96.method6077("m" + local294 + "_" + local298);
							Static9.anIntArray32[local50] = Static311.aClass254_96.method6077("l" + local294 + "_" + local298);
							Static523.anIntArray462[local50] = Static311.aClass254_96.method6077("um" + local294 + "_" + local298);
							Static453.anIntArray534[local50] = Static311.aClass254_96.method6077("ul" + local294 + "_" + local298);
							local50++;
						}
					}
				}
			}
		}
		Static63.method951(local32, 12, local24, local36);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(BLclient!et;)V")
	public static void method7841(@OriginalArg(1) Class2_Sub20 arg0) {
		for (@Pc(15) int local15 = 0; local15 < Static446.anInt7232; local15++) {
			@Pc(21) int local21 = arg0.method8592(255);
			@Pc(25) int local25 = arg0.method8575();
			if (local25 == 65535) {
				local25 = -1;
			}
			if (Static261.aClass88_Sub1Array3[local21] != null) {
				Static261.aClass88_Sub1Array3[local21].anInt2143 = local25;
			}
		}
	}
}
