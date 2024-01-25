import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "[I")
	public static int[] anIntArray220;

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
	public static int anInt3958;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_71 = new Class319(65, 6);

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_72 = new Class319(8, 7);

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "[F")
	public static final float[] aFloatArray36 = new float[4];

	@OriginalMember(owner = "client!hh", name = "h", descriptor = "Lclient!wv;")
	public static Class365 aClass365_7 = null;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
	public static void method3392() {
		for (@Pc(7) int local7 = 0; local7 < Static474.anInt1075; local7++) {
			@Pc(13) int local13 = Static509.anIntArray582[local7];
			@Pc(21) Class20_Sub2_Sub4_Sub1_Sub2 local21 = ((Class1_Sub39) Static131.aClass356_32.method7796((long) local13)).aClass20_Sub2_Sub4_Sub1_Sub2_2;
			@Pc(25) int local25 = Static480.aClass1_Sub20_Sub1_1.method4393();
			if ((local25 & 0x2) != 0) {
				local25 += Static480.aClass1_Sub20_Sub1_1.method4393() << 8;
			}
			@Pc(45) int local45;
			if ((local25 & 0x200) != 0) {
				local45 = Static480.aClass1_Sub20_Sub1_1.method4426();
				local21.anInt6462 = Static480.aClass1_Sub20_Sub1_1.method4393();
				local21.anInt6464 = Static480.aClass1_Sub20_Sub1_1.method4372();
				local21.aBoolean459 = (local45 & 0x8000) != 0;
				local21.anInt6437 = local45 & 0x7FFF;
				local21.anInt6390 = Static81.anInt1910 + local21.anInt6437 + local21.anInt6462;
			}
			if ((local25 & 0x10) != 0) {
				if (local21.aClass162_1.method3798()) {
					Static158.method2424(local21);
				}
				local21.method5359(Static183.aClass182_1.method4062(Static480.aClass1_Sub20_Sub1_1.method4394()));
				local21.method5356(local21.aClass162_1.anInt4408);
				local21.anInt6410 = local21.aClass162_1.anInt4424 << 3;
				if (local21.aClass162_1.method3798()) {
					Static140.method2298(local21.aByte116, null, local21, 0, local21.anIntArray437[0], local21.anIntArray436[0], null);
				}
			}
			if ((local25 & 0x1000) != 0) {
				local21.aByte91 = Static480.aClass1_Sub20_Sub1_1.method4432();
				local21.aByte90 = Static480.aClass1_Sub20_Sub1_1.method4387();
				local21.aByte89 = Static480.aClass1_Sub20_Sub1_1.method4387();
				local21.aByte88 = (byte) Static480.aClass1_Sub20_Sub1_1.method4382();
				local21.anInt6413 = Static81.anInt1910 + Static480.aClass1_Sub20_Sub1_1.method4394();
				local21.anInt6461 = Static81.anInt1910 + Static480.aClass1_Sub20_Sub1_1.method4426();
			}
			@Pc(200) int local200;
			@Pc(227) int local227;
			if ((local25 & 0x20) != 0) {
				@Pc(198) int[] local198 = new int[4];
				for (local200 = 0; local200 < 4; local200++) {
					local198[local200] = Static480.aClass1_Sub20_Sub1_1.method4417();
					if (local198[local200] == 65535) {
						local198[local200] = -1;
					}
				}
				local227 = Static480.aClass1_Sub20_Sub1_1.method4393();
				Static411.method5771(local21, local227, local198);
			}
			if ((local25 & 0x4) != 0) {
				local21.anInt6436 = Static480.aClass1_Sub20_Sub1_1.method4426();
				if (local21.anInt6436 == 65535) {
					local21.anInt6436 = -1;
				}
			}
			if ((local25 & 0x1) != 0) {
				local21.aString66 = Static480.aClass1_Sub20_Sub1_1.method4388();
				local21.anInt6463 = 100;
			}
			if ((local25 & 0x100) != 0) {
				local45 = Static480.aClass1_Sub20_Sub1_1.method4427();
				local200 = Static480.aClass1_Sub20_Sub1_1.method4408();
				local21.method5344(Static81.anInt1910, local200, local45);
			}
			if ((local25 & 0x800) != 0) {
				local45 = Static480.aClass1_Sub20_Sub1_1.method4424();
				local200 = Static480.aClass1_Sub20_Sub1_1.method4389();
				if (local45 == 65535) {
					local45 = -1;
				}
				local227 = Static480.aClass1_Sub20_Sub1_1.method4408();
				local21.method5345(local200, local227, true, local45);
			}
			if ((local25 & 0x400) != 0) {
				local21.anInt6440 = Static480.aClass1_Sub20_Sub1_1.method4432();
				local21.anInt6449 = Static480.aClass1_Sub20_Sub1_1.method4374();
				local21.anInt6426 = Static480.aClass1_Sub20_Sub1_1.method4433();
				local21.anInt6431 = Static480.aClass1_Sub20_Sub1_1.method4387();
				local21.anInt6429 = Static480.aClass1_Sub20_Sub1_1.method4424() + Static81.anInt1910;
				local21.anInt6387 = Static480.aClass1_Sub20_Sub1_1.method4394() + Static81.anInt1910;
				local21.anInt6456 = Static480.aClass1_Sub20_Sub1_1.method4372();
				local21.anInt6426 += local21.anIntArray437[0];
				local21.anInt6469 = 1;
				local21.anInt6431 += local21.anIntArray436[0];
				local21.anInt6440 += local21.anIntArray437[0];
				local21.anInt6466 = 0;
				local21.anInt6449 += local21.anIntArray436[0];
			}
			if ((local25 & 0x80) != 0) {
				local45 = Static480.aClass1_Sub20_Sub1_1.method4394();
				if (local45 == 65535) {
					local45 = -1;
				}
				local200 = Static480.aClass1_Sub20_Sub1_1.method4398();
				local227 = Static480.aClass1_Sub20_Sub1_1.method4372();
				local21.method5345(local200, local227, false, local45);
			}
			if ((local25 & 0x40) != 0) {
				local45 = Static480.aClass1_Sub20_Sub1_1.method4427();
				local200 = Static480.aClass1_Sub20_Sub1_1.method4372();
				local21.method5344(Static81.anInt1910, local200, local45);
				local21.anInt6425 = Static81.anInt1910 + 300;
				local21.anInt6395 = Static480.aClass1_Sub20_Sub1_1.method4382();
			}
			if ((local25 & 0x8) != 0) {
				local21.anInt6473 = Static480.aClass1_Sub20_Sub1_1.method4426();
				local21.anInt6491 = Static480.aClass1_Sub20_Sub1_1.method4417();
			}
			if ((local25 & 0x2000) != 0) {
				local45 = Static480.aClass1_Sub20_Sub1_1.method4382();
				@Pc(498) int[] local498 = new int[local45];
				@Pc(501) int[] local501 = new int[local45];
				@Pc(504) int[] local504 = new int[local45];
				for (@Pc(506) int local506 = 0; local506 < local45; local506++) {
					@Pc(512) int local512 = Static480.aClass1_Sub20_Sub1_1.method4424();
					if (local512 == 65535) {
						local512 = -1;
					}
					local498[local506] = local512;
					local501[local506] = Static480.aClass1_Sub20_Sub1_1.method4393();
					local504[local506] = Static480.aClass1_Sub20_Sub1_1.method4394();
				}
				Static84.method1706(local21, local504, local501, local498);
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method3394(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 == '<' || local23 == '>') {
				local15 += 3;
			}
		}
		@Pc(47) StringBuffer local47 = new StringBuffer(local15 + local13);
		for (@Pc(49) int local49 = 0; local49 < local13; local49++) {
			@Pc(55) char local55 = arg0.charAt(local49);
			if (local55 == '<') {
				local47.append("<lt>");
			} else if (local55 == '>') {
				local47.append("<gt>");
			} else {
				local47.append(local55);
			}
		}
		return local47.toString();
	}
}
