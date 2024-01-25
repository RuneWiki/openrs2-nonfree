import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bda", name = "f", descriptor = "Z")
	public static final boolean aBoolean44 = false;

	@OriginalMember(owner = "client!bda", name = "g", descriptor = "Lclient!tb;")
	public static final Class316 aClass316_2 = new Class316();

	@OriginalMember(owner = "client!bda", name = "h", descriptor = "I")
	public static int anInt728 = -1;

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "()V")
	public static void method638() {
		if (Static428.anInt7674 == 0 || Static120.aClass96_7 == null) {
			return;
		}
		Static458.aClass78_153.oa(Static195.anIntArray388);
		for (@Pc(12) int local12 = 0; local12 < Static64.anIntArray57.length; local12++) {
			Static458.aClass78_153.method6803(Static64.anIntArray57[local12] + Static145.anIntArray125[local12], Static195.anIntArray388[3] - Static195.anIntArray388[1], Static195.anIntArray388[1], -256);
		}
		for (@Pc(41) int local41 = 0; local41 < Static385.anInt6903; local41++) {
			@Pc(46) Class333 local46 = Static412.aClass333Array6[local41];
			Static458.aClass78_153.MA(local46.anIntArray560[0], local46.anIntArray561[0], local46.anIntArray559[0], Static498.anIntArray39);
			Static458.aClass78_153.MA(local46.anIntArray560[1], local46.anIntArray561[1], local46.anIntArray559[1], Static242.anIntArray245);
			Static458.aClass78_153.MA(local46.anIntArray560[2], local46.anIntArray561[2], local46.anIntArray559[2], Static179.anIntArray158);
			Static458.aClass78_153.MA(local46.anIntArray560[3], local46.anIntArray561[3], local46.anIntArray559[3], Static6.anIntArray618);
			if (Static498.anIntArray39[2] != -1 && Static242.anIntArray245[2] != -1 && Static179.anIntArray158[2] != -1 && Static6.anIntArray618[2] != -1) {
				@Pc(128) int local128 = -65536;
				if (local46.aByte114 == 4) {
					local128 = -16776961;
				}
				Static458.aClass78_153.method6835(Static498.anIntArray39[1], local128, Static498.anIntArray39[0], Static242.anIntArray245[0], Static242.anIntArray245[1]);
				Static458.aClass78_153.method6835(Static242.anIntArray245[1], local128, Static242.anIntArray245[0], Static179.anIntArray158[0], Static179.anIntArray158[1]);
				Static458.aClass78_153.method6835(Static179.anIntArray158[1], local128, Static179.anIntArray158[0], Static6.anIntArray618[0], Static6.anIntArray618[1]);
				Static458.aClass78_153.method6835(Static6.anIntArray618[1], local128, Static6.anIntArray618[0], Static498.anIntArray39[0], Static498.anIntArray39[1]);
				Static458.aClass78_153.method6835(Static498.anIntArray39[1], local128, Static498.anIntArray39[0], Static179.anIntArray158[0], Static179.anIntArray158[1]);
			}
		}
		Static120.aClass96_7.method7257("Static Opaque: OW: " + Static420.anIntArray440[0] + "/" + Static41.anIntArray515[0] + " UW: " + Static420.anIntArray440[1] + "/" + Static41.anIntArray515[1], 10, -256, 30, -16777216);
		Static120.aClass96_7.method7257("Static Trans: OW: " + Static512.anIntArray540[0] + "/" + Static115.anIntArray90[0] + " UW: " + Static512.anIntArray540[1] + "/" + Static115.anIntArray90[1], 10, -256, 45, -16777216);
		Static120.aClass96_7.method7257("Static Anim: OW: " + Static275.anIntArray276[0] + "/" + Static112.anIntArray83[0] + " UW: " + Static275.anIntArray276[1] + "/" + Static112.anIntArray83[1], 10, -256, 60, -16777216);
		Static120.aClass96_7.method7257("Dynamic: " + Static435.anInt7764 + "/" + 5000, 10, -256, 75, -16777216);
		Static120.aClass96_7.method7257("Total Opaque Onscreen: " + Static300.anInt9562 + "/" + 10000, 10, -256, 90, -16777216);
		Static120.aClass96_7.method7257("Total Trans Onscreen: " + Static443.anInt7826 + "/" + 5000, 10, -256, 105, -16777216);
		Static120.aClass96_7.method7257("Occluders: " + (Static165.anInt3162 + Static102.anInt1774) + " Active: " + Static385.anInt6903, 10, -256, 120, -16777216);
		Static120.aClass96_7.method7257("Occluded: Ground:" + Static324.anInt5951 + " Walls: " + Static276.anInt5044 + " CPs: " + Static509.anInt8820 + " Pixels: " + Static397.anInt7106, 10, -256, 135, -16777216);
		Static120.aClass96_7.method7257("Occlude Calc Took: " + Static508.aLong240 / 1000L + "us", 10, -256, 150, -16777216);
		if (Static428.anInt7674 != 2 || Static429.anIntArray461 == null) {
			return;
		}
		for (@Pc(461) int local461 = 0; local461 < Static429.anIntArray461.length; local461++) {
			@Pc(467) float local467 = (float) Static429.anIntArray461[local461];
			local467 /= 4194304.0F;
			if (local467 > 1.0F) {
				local467 = 1.0F;
			}
			local467 *= 255.0F;
			local467 = 255.0F - local467;
			@Pc(488) int local488 = (int) local467;
			Static429.anIntArray461[local461] = local488 | local488 << 8 | local488 << 16 | 0xFF000000;
		}
		@Pc(515) Class5 local515 = Static458.aClass78_153.method6842(Static429.anIntArray461, Static312.anInt5723, Static312.anInt5723, Static198.anInt3804);
		local515.V(10, 170, 1, 0, 0);
	}

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(B)V")
	public static void method640() {
		@Pc(11) Class268 local11 = null;
		try {
			@Pc(17) Class191 local17 = Static361.aClass198_3.method4291(false, "3");
			while (local17.anInt5014 == 0) {
				Static408.method5841(1L);
			}
			if (local17.anInt5014 == 2) {
				throw new RuntimeException("Error opening file");
			}
			local11 = (Class268) local17.anObject11;
			@Pc(47) byte[] local47 = new byte[(int) local11.method5812()];
			if (local47.length == 0) {
				Static436.aString87 = "";
				Static271.aString56 = "";
			} else {
				@Pc(70) int local70;
				for (@Pc(55) int local55 = 0; local55 < local47.length; local55 += local70) {
					local70 = local11.method5813(local47, local47.length - local55, local55);
					if (local70 == -1) {
						throw new IOException("EOF");
					}
				}
				@Pc(96) Class1_Sub3 local96 = new Class1_Sub3(local47);
				@Pc(100) int local100 = local96.method7974();
				if (local100 > 120) {
					throw new RuntimeException("Bad length");
				}
				local96.anInt9802 = local100 + 1;
				if (!local96.method7954()) {
					throw new RuntimeException("Invalid CRC");
				}
				local96.anInt9802 = 1;
				@Pc(131) int local131 = local96.method7974();
				if (local131 > 3) {
					throw new RuntimeException("Invalid version " + local131);
				}
				Static271.aString56 = local96.method7914();
				Static436.aString87 = local96.method7914();
				if (local131 >= 1) {
					Static180.anInt9478 = local96.method7945();
				} else {
					Static180.anInt9478 = Static547.anInt9149;
				}
				if (local131 >= 2) {
					Static412.aLong176 = local96.method7949();
				} else {
					Static412.aLong176 = Static495.aLong230;
				}
				if (local131 < 3) {
					Static12.aString3 = Static388.aString82;
				} else if (local96.method7974() == 1) {
					Static12.aString3 = local96.method7914();
				} else {
					Static12.aString3 = null;
				}
			}
		} catch (@Pc(213) Exception local213) {
			Static436.aString87 = "";
			Static271.aString56 = "";
		}
		try {
			if (local11 != null) {
				local11.method5816();
			}
		} catch (@Pc(224) Exception local224) {
		}
	}

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(IIB)Z")
	public static boolean method641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < Static85.aByteArrayArrayArray1[1].length && Static85.aByteArrayArrayArray1[1][arg0].length > arg1) {
			return (Static85.aByteArrayArrayArray1[1][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}
}
