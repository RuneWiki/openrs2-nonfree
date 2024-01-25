import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!ifa", name = "e", descriptor = "[Lclient!cn;")
	public static Class23_Sub2[] aClass23_Sub2Array2;

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "Lclient!ju;")
	public static final Class201 aClass201_11 = new Class201(9, 2);

	@OriginalMember(owner = "client!ifa", name = "d", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray3 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IILclient!uv;)V")
	public static void method3942(@OriginalArg(1) int arg0, @OriginalArg(2) Class23_Sub2_Sub1_Sub2 arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (arg1.anInt10151 > Static621.anInt9665) {
			Static275.method5690(arg1);
		} else if (arg1.anInt10162 < Static621.anInt9665) {
			Static549.method4290(false, arg1);
			local9 = Static156.anInt5829;
			local7 = Static82.anInt1891;
		} else {
			Static638.method8380(arg1);
		}
		@Pc(116) int local116;
		if (arg1.anInt10108 < 512 || arg1.anInt10109 < 512 || Static251.anInt4680 * 512 - 512 <= arg1.anInt10108 || arg1.anInt10109 >= Static406.anInt6924 * 512 - 512) {
			arg1.anInt10151 = 0;
			arg1.anInt10135 = -1;
			arg1.anIntArray651 = null;
			arg1.anInt10162 = 0;
			local7 = -1;
			local9 = 0;
			arg1.anInt10108 = arg1.anIntArray659[0] * 512 + arg1.method8625() * 256;
			arg1.anInt10109 = arg1.anIntArray660[0] * 512 + arg1.method8625() * 256;
			arg1.method8616();
			for (local116 = 0; local116 < arg1.aClass375Array3.length; local116++) {
				arg1.aClass375Array3[local116].anInt9871 = -1;
			}
		}
		if (Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2 == arg1 && (arg1.anInt10108 < 6144 || arg1.anInt10109 < 6144 || arg1.anInt10108 >= (Static251.anInt4680 - 12) * 512 || (Static406.anInt6924 - 12) * 512 <= arg1.anInt10109)) {
			local9 = 0;
			local7 = -1;
			arg1.anInt10162 = 0;
			arg1.anInt10135 = -1;
			arg1.anIntArray651 = null;
			arg1.anInt10151 = 0;
			arg1.anInt10108 = arg1.anIntArray659[0] * 512 + arg1.method8625() * 256;
			arg1.anInt10109 = arg1.anIntArray660[0] * 512 + arg1.method8625() * 256;
			arg1.method8616();
			for (local116 = 0; local116 < arg1.aClass375Array3.length; local116++) {
				arg1.aClass375Array3[local116].anInt9871 = -1;
			}
		}
		local116 = Static127.method2230(arg1);
		Static431.method6360(arg1);
		Static51.method1370(local9, local7, arg1, local116);
		Static350.method5261(arg1, local7);
		Static508.method7190(arg1);
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "()V")
	public static void method3944() {
		if (Static519.anInt8675 == 0 || Static192.aClass69_4 == null) {
			return;
		}
		Static486.aClass16_8.K(Static226.anIntArray405);
		for (@Pc(12) int local12 = 0; local12 < Static59.anIntArray65.length; local12++) {
			Static486.aClass16_8.method8151(Static59.anIntArray65[local12] + Static221.anIntArray277[local12], Static226.anIntArray405[3] - Static226.anIntArray405[1], -256, Static226.anIntArray405[1]);
		}
		for (@Pc(41) int local41 = 0; local41 < Static447.anInt7715; local41++) {
			@Pc(46) Class167 local46 = Static142.aClass167Array12[local41];
			Static486.aClass16_8.H(local46.anIntArray291[0], local46.anIntArray292[0], local46.anIntArray293[0], Static595.anIntArray610);
			Static486.aClass16_8.H(local46.anIntArray291[1], local46.anIntArray292[1], local46.anIntArray293[1], Static525.anIntArray558);
			Static486.aClass16_8.H(local46.anIntArray291[2], local46.anIntArray292[2], local46.anIntArray293[2], Static371.anIntArray406);
			Static486.aClass16_8.H(local46.anIntArray291[3], local46.anIntArray292[3], local46.anIntArray293[3], Static163.anIntArray196);
			if (Static595.anIntArray610[2] != -1 && Static525.anIntArray558[2] != -1 && Static371.anIntArray406[2] != -1 && Static163.anIntArray196[2] != -1) {
				@Pc(128) int local128 = -65536;
				if (local46.aByte64 == 4) {
					local128 = -16776961;
				}
				Static486.aClass16_8.method8141(Static525.anIntArray558[1], Static525.anIntArray558[0], Static595.anIntArray610[1], Static595.anIntArray610[0], local128);
				Static486.aClass16_8.method8141(Static371.anIntArray406[1], Static371.anIntArray406[0], Static525.anIntArray558[1], Static525.anIntArray558[0], local128);
				Static486.aClass16_8.method8141(Static163.anIntArray196[1], Static163.anIntArray196[0], Static371.anIntArray406[1], Static371.anIntArray406[0], local128);
				Static486.aClass16_8.method8141(Static595.anIntArray610[1], Static595.anIntArray610[0], Static163.anIntArray196[1], Static163.anIntArray196[0], local128);
				Static486.aClass16_8.method8141(Static371.anIntArray406[1], Static371.anIntArray406[0], Static595.anIntArray610[1], Static595.anIntArray610[0], local128);
			}
		}
		Static192.aClass69_4.method7451(75, -256, -16777216, "Dynamic: " + Static279.anInt5224 + "/" + 5000, 10);
		Static192.aClass69_4.method7451(90, -256, -16777216, "Total Opaque Onscreen: " + Static639.anInt9861 + "/" + 10000, 10);
		Static192.aClass69_4.method7451(105, -256, -16777216, "Total Trans Onscreen: " + Static263.anInt4938 + "/" + 5000, 10);
		Static192.aClass69_4.method7451(120, -256, -16777216, "Occluders: " + (Static114.anInt2292 + Static246.anInt4586) + " Active: " + Static447.anInt7715, 10);
		Static192.aClass69_4.method7451(135, -256, -16777216, "Occluded: Ground:" + Static293.anInt5388 + " Walls: " + Static77.anInt1743 + " CPs: " + Static236.anInt4477 + " Pixels: " + Static594.anInt9366, 10);
		Static192.aClass69_4.method7451(150, -256, -16777216, "Occlude Calc Took: " + Static472.aLong231 / 1000L + "us", 10);
		if (Static519.anInt8675 != 2 || Static600.anIntArray615 == null) {
			return;
		}
		for (@Pc(355) int local355 = 0; local355 < Static600.anIntArray615.length; local355++) {
			@Pc(361) float local361 = (float) Static600.anIntArray615[local355];
			local361 /= 4194304.0F;
			if (local361 > 1.0F) {
				local361 = 1.0F;
			}
			local361 *= 255.0F;
			local361 = 255.0F - local361;
			@Pc(382) int local382 = (int) local361;
			Static600.anIntArray615[local355] = local382 | local382 << 8 | local382 << 16 | 0xFF000000;
		}
		@Pc(410) Class102 local410 = Static486.aClass16_8.method8131(Static526.anInt8708, Static600.anIntArray615, Static652.anInt10051, Static526.anInt8708);
		local410.method6955(10, 170, 1, 0, 0);
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IILclient!lu;III)Ljava/awt/Frame;")
	public static Frame method3945(@OriginalArg(0) int arg0, @OriginalArg(2) Class231 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (!arg1.method5294()) {
			return null;
		}
		@Pc(17) Class234[] local17 = Static563.method7677(arg1);
		if (local17 == null) {
			return null;
		}
		@Pc(23) boolean local23 = false;
		for (@Pc(25) int local25 = 0; local25 < local17.length; local25++) {
			if (local17[local25].anInt6403 == arg0 && local17[local25].anInt6402 == arg2 && (!local23 || arg3 < local17[local25].anInt6409)) {
				local23 = true;
				arg3 = local17[local25].anInt6409;
			}
		}
		if (!local23) {
			return null;
		}
		@Pc(91) Class129 local91 = arg1.method5291(arg3, arg2, arg0);
		while (local91.anInt3299 == 0) {
			Static365.method3472(10L);
		}
		@Pc(111) Frame local111 = (Frame) local91.anObject7;
		if (local111 == null) {
			return null;
		} else if (local91.anInt3299 == 2) {
			Static185.method3000(local111, arg1);
			return null;
		} else {
			return local111;
		}
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(CI)Z")
	public static boolean method3946(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}
}
