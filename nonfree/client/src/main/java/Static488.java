import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static488 {

	@OriginalMember(owner = "client!sp", name = "n", descriptor = "Lclient!e;")
	public static Interface4 anInterface4_11;

	@OriginalMember(owner = "client!sp", name = "k", descriptor = "I")
	public static int anInt5159 = 0;

	@OriginalMember(owner = "client!sp", name = "m", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray16 = new String[100];

	@OriginalMember(owner = "client!sp", name = "o", descriptor = "J")
	public static long aLong141 = -1L;

	@OriginalMember(owner = "client!sp", name = "s", descriptor = "I")
	public static int anInt5164 = 0;

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(I)V")
	public static void method4436() {
		@Pc(12) int local12 = Static542.aByteArrayArray30.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			if (Static542.aByteArrayArray30[local14] != null) {
				@Pc(22) int local22 = -1;
				for (@Pc(24) int local24 = 0; local24 < Static140.anInt3111; local24++) {
					if (Static171.anIntArray211[local24] == Static365.anIntArray477[local14]) {
						local22 = local24;
						break;
					}
				}
				if (local22 == -1) {
					Static171.anIntArray211[Static140.anInt3111] = Static365.anIntArray477[local14];
					local22 = Static140.anInt3111++;
				}
				@Pc(64) Class6_Sub21 local64 = new Class6_Sub21(Static542.aByteArrayArray30[local14]);
				@Pc(66) int local66 = 0;
				while (local64.anInt7338 < Static542.aByteArrayArray30[local14].length && local66 < 511 && Static464.anInt7995 < 1023) {
					@Pc(85) int local85 = local22 | local66++ << 6;
					@Pc(89) int local89 = local64.method6003();
					@Pc(93) int local93 = local89 >> 14;
					@Pc(99) int local99 = local89 >> 7 & 0x3F;
					@Pc(103) int local103 = local89 & 0x3F;
					@Pc(116) int local116 = local99 + (Static365.anIntArray477[local14] >> 8) * 64 - Static39.anInt4952;
					@Pc(128) int local128 = local103 + (Static365.anIntArray477[local14] & 0xFF) * 64 - Static138.anInt3088;
					@Pc(135) Class273 local135 = Static577.aClass125_2.method3229(local64.method6003());
					@Pc(142) Class6_Sub34 local142 = (Class6_Sub34) Static593.aClass128_43.method3263((long) local85);
					if (local142 == null && (local135.aByte71 & 0x1) > 0 && local93 == Static294.anInt5492 && local116 >= 0 && Static473.anInt8075 > local116 + local135.anInt7439 && local128 >= 0 && Static165.anInt6749 > local135.anInt7439 + local128) {
						@Pc(183) Class4_Sub1_Sub1_Sub1 local183 = new Class4_Sub1_Sub1_Sub1();
						local183.anInt7126 = local85;
						@Pc(191) Class6_Sub34 local191 = new Class6_Sub34(local183);
						Static593.aClass128_43.method3267(local191, (long) local85);
						Static76.aClass6_Sub34Array7[Static535.anInt8885++] = local191;
						Static291.anIntArray405[Static464.anInt7995++] = local85;
						local183.anInt7080 = Static312.anInt5688;
						local183.method152(local135);
						local183.method5905(local183.aClass273_1.anInt7439);
						local183.anInt7114 = local183.aClass273_1.anInt7451 << 3;
						local183.method5903(true, (local183.aClass273_1.aByte70 + 4 & 0xFEA00007) << 11);
						local183.method154(local128, local93, local116, true, local183.method5892());
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(ILjava/awt/Color;Ljava/awt/Color;Ljava/lang/String;Ljava/awt/Color;I)V")
	public static void method4437(@OriginalArg(0) int arg0, @OriginalArg(1) Color arg1, @OriginalArg(2) Color arg2, @OriginalArg(3) String arg3, @OriginalArg(4) Color arg4) {
		try {
			@Pc(2) Graphics local2 = Static32.aCanvas3.getGraphics();
			if (Static583.aFont2 == null) {
				Static583.aFont2 = new Font("Helvetica", 1, 13);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			if (arg4 == null) {
				arg4 = new Color(140, 17, 17);
			}
			if (arg1 == null) {
				arg1 = new Color(255, 255, 255);
			}
			@Pc(63) int local63;
			try {
				if (Static34.anImage1 == null) {
					Static34.anImage1 = Static32.aCanvas3.createImage(Static240.anInt4852, Static196.anInt4059);
				}
				@Pc(48) Graphics local48 = Static34.anImage1.getGraphics();
				local48.setColor(Color.black);
				local48.fillRect(0, 0, Static240.anInt4852, Static196.anInt4059);
				local63 = Static240.anInt4852 / 2 - 152;
				@Pc(69) int local69 = Static196.anInt4059 / 2 - 18;
				local48.setColor(arg4);
				local48.drawRect(local63, local69, 303, 33);
				local48.setColor(arg2);
				local48.fillRect(local63 + 2, local69 + 2, arg0 * 3, 30);
				local48.setColor(Color.black);
				local48.drawRect(local63 + 1, local69 + 1, 301, 31);
				local48.fillRect(local63 + arg0 * 3 + 2, local69 + 2, 300 - arg0 * 3, 30);
				local48.setFont(Static583.aFont2);
				local48.setColor(arg1);
				local48.drawString(arg3, local63 + (304 - arg3.length() * 6) / 2, local69 + 22);
				if (Static473.aString84 != null) {
					local48.setFont(Static583.aFont2);
					local48.setColor(arg1);
					local48.drawString(Static473.aString84, Static240.anInt4852 / 2 - Static473.aString84.length() * 6 / 2, Static196.anInt4059 / 2 + -26);
				}
				local2.drawImage(Static34.anImage1, 0, 0, null);
			} catch (@Pc(185) Exception local185) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static240.anInt4852, Static196.anInt4059);
				@Pc(200) int local200 = Static240.anInt4852 / 2 - 152;
				local63 = Static196.anInt4059 / 2 - 18;
				local2.setColor(arg4);
				local2.drawRect(local200, local63, 303, 33);
				local2.setColor(arg2);
				local2.fillRect(local200 + 2, local63 - -2, arg0 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local200 + 1, local63 - -1, 301, 31);
				local2.fillRect(arg0 * 3 + local200 + 2, local63 + 2, 300 - arg0 * 3, 30);
				local2.setFont(Static583.aFont2);
				local2.setColor(arg1);
				if (Static473.aString84 != null) {
					local2.setFont(Static583.aFont2);
					local2.setColor(arg1);
					local2.drawString(Static473.aString84, Static240.anInt4852 / 2 - Static473.aString84.length() * 6 / 2, Static196.anInt4059 / 2 + -26);
				}
				local2.drawString(arg3, local200 + (304 - arg3.length() * 6) / 2, local63 + 22);
			}
		} catch (@Pc(315) Exception local315) {
			Static32.aCanvas3.repaint();
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!qj;Lclient!pfa;Z)V")
	public static void method4439(@OriginalArg(0) Class272 arg0, @OriginalArg(1) Class251 arg1) {
		Static299.aString41 = "";
		Static30.aClass251_13 = arg1;
		Static438.aClass272_5 = arg0;
		if (Class33.aString36.startsWith("win")) {
			Static299.aString41 = Static299.aString41 + "windows/";
		} else if (Class33.aString36.startsWith("linux")) {
			Static299.aString41 = Static299.aString41 + "linux/";
		} else if (Class33.aString36.startsWith("mac")) {
			Static299.aString41 = Static299.aString41 + "macos/";
		}
		if (Static438.aClass272_5.aBoolean512) {
			Static299.aString41 = Static299.aString41 + "msjava/";
		} else if (Class33.aString37.startsWith("amd64") || Class33.aString37.startsWith("x86_64")) {
			Static299.aString41 = Static299.aString41 + "x86_64/";
		} else if (Class33.aString37.startsWith("i386") || Class33.aString37.startsWith("i486") || Class33.aString37.startsWith("i586") || Class33.aString37.startsWith("x86")) {
			Static299.aString41 = Static299.aString41 + "x86/";
		} else if (Class33.aString37.startsWith("ppc")) {
			Static299.aString41 = Static299.aString41 + "ppc/";
		} else {
			Static299.aString41 = Static299.aString41 + "universal/";
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "([[[Lclient!qs;B)V")
	public static void method4440(@OriginalArg(0) Class276[][][] arg0) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class276[][] local9 = arg0[local3];
			for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < local9[local11].length; local15++) {
					@Pc(23) Class276 local23 = local9[local11][local15];
					if (local23 != null) {
						if (local23.aClass4_Sub3_2 instanceof Interface18) {
							((Interface18) local23.aClass4_Sub3_2).method6266();
						}
						if (local23.aClass4_Sub2_3 instanceof Interface18) {
							((Interface18) local23.aClass4_Sub2_3).method6266();
						}
						if (local23.aClass4_Sub2_2 instanceof Interface18) {
							((Interface18) local23.aClass4_Sub2_2).method6266();
						}
						if (local23.aClass4_Sub5_2 instanceof Interface18) {
							((Interface18) local23.aClass4_Sub5_2).method6266();
						}
						if (local23.aClass4_Sub5_3 instanceof Interface18) {
							((Interface18) local23.aClass4_Sub5_3).method6266();
						}
						for (@Pc(73) Class267 local73 = local23.aClass267_3; local73 != null; local73 = local73.aClass267_2) {
							@Pc(78) Class4_Sub1 local78 = local73.aClass4_Sub1_2;
							if (local78 instanceof Interface18) {
								((Interface18) local78).method6266();
							}
						}
					}
				}
			}
		}
	}
}
