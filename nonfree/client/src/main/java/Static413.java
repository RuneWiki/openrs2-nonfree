import java.awt.Canvas;
import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static413 {

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)V")
	public static void method5297() {
		Static166.anInt3385 = 0;
		@Pc(16) boolean local16 = Static237.aClass3_Sub7_Sub1_1.method2582() == 1;
		@Pc(24) int local24 = Static237.aClass3_Sub7_Sub1_1.method2598();
		@Pc(28) int local28 = Static237.aClass3_Sub7_Sub1_1.method2584();
		@Pc(32) int local32 = Static237.aClass3_Sub7_Sub1_1.method2593();
		Static152.method2474(local28);
		@Pc(43) int local43 = (Static139.anInt7585 - Static237.aClass3_Sub7_Sub1_1.anInt3235) / 16;
		Static295.anIntArrayArray34 = new int[local43][4];
		@Pc(52) int local52;
		for (@Pc(49) int local49 = 0; local49 < local43; local49++) {
			for (local52 = 0; local52 < 4; local52++) {
				Static295.anIntArrayArray34[local49][local52] = Static237.aClass3_Sub7_Sub1_1.method2589();
			}
		}
		Static231.aByteArrayArray8 = new byte[local43][];
		Static322.anIntArray372 = null;
		Static242.aByteArrayArray9 = new byte[local43][];
		Static414.anIntArray465 = new int[local43];
		Static378.aByteArrayArray21 = new byte[local43][];
		Static184.anIntArray230 = new int[local43];
		Static319.anIntArray115 = new int[local43];
		Static299.aByteArrayArray15 = null;
		Static81.anIntArray204 = new int[local43];
		Static371.anIntArray402 = new int[local43];
		Static29.aByteArrayArray18 = new byte[local43][];
		local43 = 0;
		for (local52 = (local24 - (Static40.anInt1089 >> 4)) / 8; local52 <= ((Static40.anInt1089 >> 4) + local24) / 8; local52++) {
			for (@Pc(124) int local124 = (local32 - (Static44.anInt7276 >> 4)) / 8; local124 <= ((Static44.anInt7276 >> 4) + local32) / 8; local124++) {
				Static81.anIntArray204[local43] = local124 + (local52 << 8);
				Static319.anIntArray115[local43] = Static64.aClass32_28.method807("m" + local52 + "_" + local124);
				Static371.anIntArray402[local43] = Static64.aClass32_28.method807("l" + local52 + "_" + local124);
				Static414.anIntArray465[local43] = Static64.aClass32_28.method807("um" + local52 + "_" + local124);
				Static184.anIntArray230[local43] = Static64.aClass32_28.method807("ul" + local52 + "_" + local124);
				local43++;
			}
		}
		Static226.method3380(false, local24, local16, local32);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BLjava/lang/String;)Ljava/lang/String;")
	public static String method5299(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(15) int local15 = arg0.indexOf(arg1); local15 != -1; local15 = arg0.indexOf(arg1, local15 + arg2.length())) {
			arg0 = arg0.substring(0, local15) + arg2 + arg0.substring(local15 + arg1.length());
		}
		return arg0;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Ljava/awt/Canvas;Z)Lclient!qr;")
	public static Class3_Sub10 method5300(@OriginalArg(0) Canvas arg0) {
		try {
			@Pc(15) Class local15 = Class.forName("Class3_Sub10_Sub2");
			@Pc(19) Class3_Sub10 local19 = (Class3_Sub10) local15.getDeclaredConstructor().newInstance();
			local19.method2181(arg0);
			return local19;
		} catch (@Pc(26) Throwable local26) {
			@Pc(30) Class3_Sub10_Sub1 local30 = new Class3_Sub10_Sub1();
			local30.method2181(arg0);
			return local30;
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method5302(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(27) int local27 = 0;
			for (@Pc(29) long local29 = arg0; local29 != 0L; local29 /= 37L) {
				local27++;
			}
			@Pc(44) StringBuffer local44 = new StringBuffer(local27);
			while (arg0 != 0L) {
				@Pc(47) long local47 = arg0;
				arg0 /= 37L;
				local44.append(Static334.aCharArray4[(int) (local47 - arg0 * 37L)]);
			}
			return local44.reverse().toString();
		}
	}
}
