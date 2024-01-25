import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!ta", name = "m", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_29 = new Class119(18, -1);

	@OriginalMember(owner = "client!ta", name = "o", descriptor = "Z")
	public static boolean aBoolean155 = false;

	@OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
	public static int anInt1873 = 0;

	@OriginalMember(owner = "client!ta", name = "r", descriptor = "[Lclient!br;")
	public static final Class29[] aClass29Array3 = new Class29[4];

	@OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
	public static int anInt1874 = 0;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILclient!mq;Lclient!qa;I)V")
	public static void method1458(@OriginalArg(1) int arg0, @OriginalArg(2) Class156 arg1, @OriginalArg(3) Class172 arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class58 local10 = arg1.method3762(arg2);
		if (local10 == null) {
			return;
		}
		arg2.pa(arg3, arg0, arg1.anInt4853 + arg3, arg1.anInt4823 + arg0);
		if (Static311.anInt5499 == 2 || Static311.anInt5499 == 5 || Static378.aClass8_25 == null) {
			arg2.j(-16777216, local10, arg3, arg0);
			return;
		}
		@Pc(44) int local44;
		@Pc(40) int local40;
		@Pc(50) int local50;
		@Pc(42) int local42;
		if (Static161.anInt3316 == 4) {
			local40 = Static422.anInt6891;
			local42 = 4096;
			local44 = anInt1874;
			local50 = (int) -Static252.aFloat47 & 0x3FFF;
		} else {
			local44 = Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4318;
			local42 = 4096 - Static341.anInt5790 * 16;
			local40 = Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4321;
			local50 = Static20.anInt696 + (int) -Static252.aFloat47 & 0x3FFF;
		}
		@Pc(85) int local85 = local44 / 32 + 48 - (Static40.anInt1089 - 104) * 2;
		@Pc(102) int local102 = Static44.anInt7276 * 4 + 48 + 208 - local40 / 32 - Static44.anInt7276 * 2;
		Static378.aClass8_25.method6005((float) arg1.anInt4853 / 2.0F + (float) arg3, (float) arg1.anInt4823 / 2.0F + (float) arg0, (float) local85, (float) local102, local42, local50 << 2, local10, arg3, arg0);
		@Pc(153) int local153;
		@Pc(162) int local162;
		@Pc(173) int local173;
		@Pc(184) int local184;
		for (@Pc(136) Class3_Sub34 local136 = (Class3_Sub34) Static347.aClass243_37.method5208(); local136 != null; local136 = (Class3_Sub34) Static347.aClass243_37.method5203()) {
			@Pc(141) int local141 = local136.anInt5289;
			local153 = (Static240.aClass116_2.anIntArray224[local141] >> 14 & 0x3FFF) - Static223.anInt7618;
			local162 = (Static240.aClass116_2.anIntArray224[local141] & 0x3FFF) - Static57.anInt5085;
			local173 = local153 * 4 + 2 - local44 / 32;
			local184 = local162 * 4 + 2 - local40 / 32;
			Static182.method2887(local184, arg3, local10, arg0, Static240.aClass116_2.anIntArray225[local141], arg1, local173, arg2);
		}
		for (local153 = 0; local153 < Static154.anInt3098; local153++) {
			local162 = Static328.anIntArray376[local153] * 4 + 2 - local44 / 32;
			local173 = Static380.anIntArray221[local153] * 4 + 2 - local40 / 32;
			@Pc(241) Class93 local241 = Static435.aClass30_4.method769(Static13.anIntArray49[local153]);
			if (local241.anIntArray171 != null) {
				local241 = local241.method2066(Static85.aClass49_1);
				if (local241 == null || local241.anInt2790 == -1) {
					continue;
				}
			}
			Static182.method2887(local173, arg3, local10, arg0, local241.anInt2790, arg1, local162, arg2);
		}
		for (@Pc(277) Class3_Sub39 local277 = (Class3_Sub39) Static441.aClass11_43.method313(); local277 != null; local277 = (Class3_Sub39) Static441.aClass11_43.method316()) {
			local173 = (int) (local277.aLong234 >> 28 & 0x3L);
			if (local173 == Static80.anInt2013) {
				local184 = (int) (local277.aLong234 & 0x3FFFL) * 4 + 2 - local44 / 32;
				@Pc(321) int local321 = (int) (local277.aLong234 >> 14 & 0x3FFFL) * 4 + 2 - local40 / 32;
				Static290.method4095(arg3, local10, arg1, local184, arg0, Static324.aClass8Array212[0], local321);
			}
		}
		@Pc(395) int local395;
		for (local173 = 0; local173 < Static54.anInt1472; local173++) {
			@Pc(349) Class7_Sub2_Sub3_Sub1 local349 = Static139.aClass7_Sub2_Sub3_Sub1Array11[Static319.anIntArray114[local173]];
			if (local349 != null && local349.method456() && Static379.aClass7_Sub2_Sub3_Sub2_2.aByte77 == local349.aByte77) {
				@Pc(367) Class47 local367 = local349.aClass47_1;
				if (local367 != null && local367.anIntArray94 != null) {
					local367 = local367.method1251(Static85.aClass49_1);
				}
				if (local367 != null && local367.aBoolean135 && local367.aBoolean134) {
					local395 = local349.anInt4318 / 32 - local44 / 32;
					@Pc(404) int local404 = local349.anInt4321 / 32 - local40 / 32;
					if (local367.anInt1598 == -1) {
						Static290.method4095(arg3, local10, arg1, local395, arg0, Static324.aClass8Array212[1], local404);
					} else {
						Static182.method2887(local404, arg3, local10, arg0, local367.anInt1598, arg1, local395, arg2);
					}
				}
			}
		}
		local184 = Static160.anInt3271;
		@Pc(441) int[] local441 = Static162.anIntArray212;
		@Pc(478) int local478;
		@Pc(488) int local488;
		@Pc(492) int local492;
		for (local395 = 0; local395 < local184; local395++) {
			@Pc(451) Class7_Sub2_Sub3_Sub2 local451 = Static361.aClass7_Sub2_Sub3_Sub2Array1[local441[local395]];
			if (local451 != null && local451.method3524() && Static379.aClass7_Sub2_Sub3_Sub2_2 != local451 && local451.aByte77 == Static379.aClass7_Sub2_Sub3_Sub2_2.aByte77) {
				local478 = local451.anInt4318 / 32 - local44 / 32;
				local488 = local451.anInt4321 / 32 - local40 / 32;
				@Pc(490) boolean local490 = false;
				for (local492 = 0; local492 < Static202.anInt3950; local492++) {
					if (local451.aString36.equals(Static388.aStringArray45[local492]) && Static102.anIntArray137[local492] != 0) {
						local490 = true;
						break;
					}
				}
				@Pc(519) boolean local519 = false;
				for (@Pc(521) int local521 = 0; local521 < Static85.anInt2098; local521++) {
					if (local451.aString36.equals(Static92.aClass173Array1[local521].aString50)) {
						local519 = true;
						break;
					}
				}
				@Pc(545) boolean local545 = false;
				if (Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4439 != 0 && local451.anInt4439 != 0 && local451.anInt4439 == Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4439) {
					local545 = true;
				}
				if (local451.aBoolean380) {
					Static290.method4095(arg3, local10, arg1, local478, arg0, Static324.aClass8Array212[6], local488);
				} else if (local490) {
					Static290.method4095(arg3, local10, arg1, local478, arg0, Static324.aClass8Array212[3], local488);
				} else if (local519) {
					Static290.method4095(arg3, local10, arg1, local478, arg0, Static324.aClass8Array212[5], local488);
				} else if (local545) {
					Static290.method4095(arg3, local10, arg1, local478, arg0, Static324.aClass8Array212[4], local488);
				} else {
					Static290.method4095(arg3, local10, arg1, local478, arg0, Static324.aClass8Array212[2], local488);
				}
			}
		}
		@Pc(643) Class196[] local643 = Static331.aClass196Array41;
		@Pc(738) int local738;
		for (local478 = 0; local478 < local643.length; local478++) {
			@Pc(651) Class196 local651 = local643[local478];
			if (local651 != null && local651.anInt5507 != 0 && Static253.anInt4787 % 20 < 10) {
				@Pc(714) int local714;
				if (local651.anInt5507 == 1 && local651.anInt5501 >= 0 && Static139.aClass7_Sub2_Sub3_Sub1Array11.length > local651.anInt5501) {
					@Pc(692) Class7_Sub2_Sub3_Sub1 local692 = Static139.aClass7_Sub2_Sub3_Sub1Array11[local651.anInt5501];
					if (local692 != null) {
						local492 = local692.anInt4318 / 32 - local44 / 32;
						local714 = local692.anInt4321 / 32 - local40 / 32;
						Static189.method3471(arg0, arg3, arg1, local714, local10, local651.anInt5502, 360000L, local492);
					}
				}
				if (local651.anInt5507 == 2) {
					local738 = local651.anInt5500 / 32 - local44 / 32;
					local492 = local651.anInt5508 / 32 - local40 / 32;
					@Pc(754) long local754 = (long) (local651.anInt5503 << 5);
					@Pc(758) long local758 = local754 * local754;
					Static189.method3471(arg0, arg3, arg1, local492, local10, local651.anInt5502, local758, local738);
				}
				if (local651.anInt5507 == 10 && local651.anInt5501 >= 0 && local651.anInt5501 < Static361.aClass7_Sub2_Sub3_Sub2Array1.length) {
					@Pc(791) Class7_Sub2_Sub3_Sub2 local791 = Static361.aClass7_Sub2_Sub3_Sub2Array1[local651.anInt5501];
					if (local791 != null) {
						local492 = local791.anInt4318 / 32 - local44 / 32;
						local714 = local791.anInt4321 / 32 - local40 / 32;
						Static189.method3471(arg0, arg3, arg1, local714, local10, local651.anInt5502, 360000L, local492);
					}
				}
			}
		}
		if (Static161.anInt3316 == 4) {
			return;
		}
		if (Static78.anInt1944 != 0) {
			local488 = Static78.anInt1944 * 4 + (Static379.aClass7_Sub2_Sub3_Sub2_2.method3499() + -1) * 2 + 2 - local44 / 32;
			local738 = Static312.anInt5522 * 4 + (Static379.aClass7_Sub2_Sub3_Sub2_2.method3499() + -1) * 2 + 2 - local40 / 32;
			Static290.method4095(arg3, local10, arg1, local488, arg0, Static391.aClass8Array192[Static246.aBoolean407 ? 1 : 0], local738);
		}
		arg2.method5507(-1, 3, arg3 + arg1.anInt4853 / 2 - 1, arg1.anInt4823 / 2 + -1 + arg0, 3);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BC)Z")
	public static boolean method1459(@OriginalArg(1) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static25.method590(arg0)) {
			return true;
		} else {
			@Pc(16) char[] local16 = Static8.aCharArray7;
			for (@Pc(23) int local23 = 0; local23 < local16.length; local23++) {
				@Pc(28) char local28 = local16[local23];
				if (arg0 == local28) {
					return true;
				}
			}
			@Pc(48) char[] local48 = Static453.aCharArray8;
			for (@Pc(50) int local50 = 0; local50 < local48.length; local50++) {
				@Pc(55) char local55 = local48[local50];
				if (local55 == arg0) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/awt/Color;BLjava/awt/Color;ZLjava/lang/String;ILjava/awt/Color;)V")
	public static void method1460(@OriginalArg(0) Color arg0, @OriginalArg(2) Color arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Color arg5) {
		try {
			@Pc(2) Graphics local2 = Static392.aCanvas6.getGraphics();
			if (Static407.aFont1 == null) {
				Static407.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg2) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static333.anInt5712, Static123.anInt2625);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			if (arg5 == null) {
				arg5 = new Color(140, 17, 17);
			}
			if (arg1 == null) {
				arg1 = new Color(255, 255, 255);
			}
			try {
				if (Static105.anImage2 == null) {
					Static105.anImage2 = Static392.aCanvas6.createImage(304, 34);
				}
				@Pc(66) Graphics local66 = Static105.anImage2.getGraphics();
				local66.setColor(arg5);
				local66.drawRect(0, 0, 303, 33);
				local66.setColor(arg0);
				local66.fillRect(2, 2, arg4 * 3, 30);
				local66.setColor(Color.black);
				local66.drawRect(1, 1, 301, 31);
				local66.fillRect(arg4 * 3 + 2, 2, 300 - arg4 * 3, 30);
				local66.setFont(Static407.aFont1);
				local66.setColor(arg1);
				local66.drawString(arg3, (304 - arg3.length() * 6) / 2, 22);
				local2.drawImage(Static105.anImage2, Static333.anInt5712 / 2 - 152, Static123.anInt2625 / 2 + -18, null);
			} catch (@Pc(147) Exception local147) {
				@Pc(153) int local153 = Static333.anInt5712 / 2 - 152;
				@Pc(159) int local159 = Static123.anInt2625 / 2 - 18;
				local2.setColor(arg5);
				local2.drawRect(0, 0, 303, 33);
				local2.setColor(arg0);
				local2.fillRect(local153 + 2, local159 + 2, arg4 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local153 + 1, local159 + 1, 301, 31);
				local2.fillRect(arg4 * 3 + local153 + 2, local159 + 2, 300 - arg4 * 3, 30);
				local2.setFont(Static407.aFont1);
				local2.setColor(arg1);
				local2.drawString(arg3, local153 + (304 - arg3.length() * 6) / 2, local159 + 22);
			}
			if (Static47.aString5 != null) {
				local2.setFont(Static407.aFont1);
				local2.setColor(arg1);
				local2.drawString(Static47.aString5, Static333.anInt5712 / 2 - Static47.aString5.length() * 6 / 2, Static123.anInt2625 / 2 - 26);
			}
		} catch (@Pc(268) Exception local268) {
			Static392.aCanvas6.repaint();
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIII)V")
	public static void method1461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static305.anIntArrayArray37 != null) {
			Static305.anIntArrayArray37[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static267.aByteArrayArray12 != null) {
			Static267.aByteArrayArray12[arg0][arg1] = (byte) (arg3 >> 3);
		}
		if (Static419.aByteArrayArray22 != null) {
			Static419.aByteArrayArray22[arg0][arg1] = (byte) arg4;
		}
	}
}
