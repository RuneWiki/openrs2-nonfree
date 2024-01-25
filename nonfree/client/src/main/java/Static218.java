import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!hw", name = "j", descriptor = "I")
	public static int anInt4108;

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(B)V")
	public static void method3708() {
		if (Static642.anInt10098 == -1 || Static438.anInt10553 == -1) {
			return;
		}
		@Pc(23) int local23 = ((Static269.anInt4829 - Static578.anInt4587) * Static235.anInt4326 >> 16) + Static578.anInt4587;
		Static235.anInt4326 += local23;
		if (Static235.anInt4326 < 65535) {
			Static430.aBoolean476 = false;
			Static53.aBoolean62 = false;
		} else {
			Static235.anInt4326 = 65535;
			if (Static430.aBoolean476) {
				Static53.aBoolean62 = false;
			} else {
				Static53.aBoolean62 = true;
			}
			Static430.aBoolean476 = true;
		}
		@Pc(55) float local55 = (float) Static235.anInt4326 / 65535.0F;
		@Pc(58) float[] local58 = new float[3];
		@Pc(62) int local62 = Static570.anInt9617 * 2;
		@Pc(88) int local88;
		@Pc(120) int local120;
		@Pc(128) int local128;
		@Pc(133) int local133;
		@Pc(143) int local143;
		@Pc(161) int local161;
		for (@Pc(64) int local64 = 0; local64 < 3; local64++) {
			@Pc(76) int local76 = Static596.anIntArrayArrayArray14[Static642.anInt10098][local62][local64] * 3;
			local88 = Static596.anIntArrayArrayArray14[Static642.anInt10098][local62 + 1][local64] * 3;
			local120 = (Static596.anIntArrayArrayArray14[Static642.anInt10098][local62 + 2][local64] + Static596.anIntArrayArrayArray14[Static642.anInt10098][local62 + 2][local64] - Static596.anIntArrayArrayArray14[Static642.anInt10098][local62 + 3][local64]) * 3;
			local128 = Static596.anIntArrayArrayArray14[Static642.anInt10098][local62][local64];
			local133 = local88 - local76;
			local143 = local76 + local120 - local88 * 2;
			local161 = Static596.anIntArrayArrayArray14[Static642.anInt10098][local62 + 2][local64] + local88 - local120 - local128;
			local58[local64] = local55 * ((float) local133 + ((float) local161 * local55 + (float) local143) * local55) + (float) local128;
		}
		Static441.anInt7550 = (int) local58[1] * -1;
		Static117.anInt2170 = (int) local58[2] - Static567.anInt9589 * 512;
		Static19.anInt277 = (int) local58[0] - Static565.anInt9560 * 512;
		@Pc(216) float[] local216 = new float[3];
		local88 = Static340.anInt5755 * 2;
		for (local120 = 0; local120 < 3; local120++) {
			local128 = Static596.anIntArrayArrayArray14[Static438.anInt10553][local88][local120] * 3;
			local133 = Static596.anIntArrayArrayArray14[Static438.anInt10553][local88 + 1][local120] * 3;
			local143 = (Static596.anIntArrayArrayArray14[Static438.anInt10553][local88 + 2][local120] + Static596.anIntArrayArrayArray14[Static438.anInt10553][local88 + 2][local120] - Static596.anIntArrayArrayArray14[Static438.anInt10553][local88 + 3][local120]) * 3;
			local161 = Static596.anIntArrayArrayArray14[Static438.anInt10553][local88][local120];
			@Pc(293) int local293 = local133 - local128;
			@Pc(302) int local302 = local143 + local128 - local133 * 2;
			@Pc(320) int local320 = local133 + Static596.anIntArrayArrayArray14[Static438.anInt10553][local88 - -2][local120] - local143 - local161;
			local216[local120] = (((float) local302 + (float) local320 * local55) * local55 + (float) local293) * local55 + (float) local161;
		}
		@Pc(363) float local363 = local216[0] - local58[0];
		@Pc(374) float local374 = -1.0F * (local216[1] - local58[1]);
		@Pc(382) float local382 = local216[2] - local58[2];
		@Pc(392) double local392 = Math.sqrt((double) (local382 * local382 + local363 * local363));
		Static210.anInt4029 = (int) (Math.atan2((double) local374, local392) * 2607.5945876176133D) & 0x3FFF;
		Static491.anInt8292 = (int) (-Math.atan2((double) local363, (double) local382) * 2607.5945876176133D) & 0x3FFF;
		Static290.anInt5062 = Static596.anIntArrayArrayArray14[Static642.anInt10098][local62][3] + (Static235.anInt4326 * (Static596.anIntArrayArrayArray14[Static642.anInt10098][local62 + 2][3] - Static596.anIntArrayArrayArray14[Static642.anInt10098][local62][3]) >> 16);
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIZ[ILclient!rs;III)Lclient!sb;")
	public static Class167_Sub3_Sub1 method3709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class133_Sub3 arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg3.aBoolean620 || Static413.method8723(arg1) && Static413.method8723(arg0)) {
			return new Class167_Sub3_Sub1(arg3, 3553, arg1, arg0, false, arg2, arg4, 0);
		} else if (arg3.aBoolean622) {
			return new Class167_Sub3_Sub1(arg3, 34037, arg1, arg0, false, arg2, arg4, 0);
		} else {
			return new Class167_Sub3_Sub1(arg3, arg1, arg0, Static613.method8740(arg1), Static613.method8740(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/lang/String;II)V")
	public static void method3712(@OriginalArg(0) Color arg0, @OriginalArg(1) Color arg1, @OriginalArg(2) Color arg2, @OriginalArg(3) String arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(6) Graphics local6 = Static83.aCanvas14.getGraphics();
			if (Static255.aFont1 == null) {
				Static255.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			if (arg0 == null) {
				arg0 = new Color(255, 255, 255);
			}
			@Pc(67) int local67;
			try {
				if (Static538.anImage3 == null) {
					Static538.anImage3 = Static83.aCanvas14.createImage(Static345.anInt5827, Static408.anInt7118);
				}
				@Pc(52) Graphics local52 = Static538.anImage3.getGraphics();
				local52.setColor(Color.black);
				local52.fillRect(0, 0, Static345.anInt5827, Static408.anInt7118);
				local67 = Static345.anInt5827 / 2 - 152;
				@Pc(73) int local73 = Static408.anInt7118 / 2 - 18;
				local52.setColor(arg1);
				local52.drawRect(local67, local73, 303, 33);
				local52.setColor(arg2);
				local52.fillRect(local67 + 2, local73 + 2, arg4 * 3, 30);
				local52.setColor(Color.black);
				local52.drawRect(local67 + 1, local73 + 1, 301, 31);
				local52.fillRect(arg4 * 3 + local67 + 2, local73 + 2, 300 - arg4 * 3, 30);
				local52.setFont(Static255.aFont1);
				local52.setColor(arg0);
				local52.drawString(arg3, local67 + (304 - arg3.length() * 6) / 2, local73 + 22);
				if (Static215.aString41 != null) {
					local52.setFont(Static255.aFont1);
					local52.setColor(arg0);
					local52.drawString(Static215.aString41, Static345.anInt5827 / 2 - Static215.aString41.length() * 6 / 2, Static408.anInt7118 / 2 + -26);
				}
				local6.drawImage(Static538.anImage3, 0, 0, null);
			} catch (@Pc(197) Exception local197) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static345.anInt5827, Static408.anInt7118);
				@Pc(212) int local212 = Static345.anInt5827 / 2 - 152;
				local67 = Static408.anInt7118 / 2 - 18;
				local6.setColor(arg1);
				local6.drawRect(local212, local67, 303, 33);
				local6.setColor(arg2);
				local6.fillRect(local212 + 2, local67 - -2, arg4 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local212 + 1, local67 + 1, 301, 31);
				local6.fillRect(local212 + arg4 * 3 + 2, local67 + 2, 300 - arg4 * 3, 30);
				local6.setFont(Static255.aFont1);
				local6.setColor(arg0);
				if (Static215.aString41 != null) {
					local6.setFont(Static255.aFont1);
					local6.setColor(arg0);
					local6.drawString(Static215.aString41, Static345.anInt5827 / 2 - Static215.aString41.length() * 6 / 2, Static408.anInt7118 / 2 - 26);
				}
				local6.drawString(arg3, local212 + (304 - arg3.length() * 6) / 2, local67 + 22);
			}
		} catch (@Pc(327) Exception local327) {
			Static83.aCanvas14.repaint();
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method3713(@OriginalArg(1) String arg0) {
		@Pc(16) String local16 = Static641.method9013(Static494.method7231(arg0));
		if (local16 == null) {
			local16 = "";
		}
		return local16;
	}
}
