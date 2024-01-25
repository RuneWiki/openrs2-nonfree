import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static674 {

	@OriginalMember(owner = "client!wr", name = "C", descriptor = "Lclient!bt;")
	public static Class34 aClass34_134;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!da;IIILclient!aa;Lclient!bq;IILclient!kq;Ljava/lang/String;II)V")
	public static void method8949(@OriginalArg(0) Class56 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1 arg4, @OriginalArg(5) Class31 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class199 arg7, @OriginalArg(9) String arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(14) int local14;
		if (Static259.anInt4200 == 4) {
			local14 = (int) Static642.aFloat230 & 0x3FFF;
		} else {
			local14 = (int) Static642.aFloat230 + Static354.anInt5391 & 0x3FFF;
		}
		@Pc(33) int local33 = Math.max(arg7.anInt5035 / 2, arg7.anInt4994 / 2) + 10;
		@Pc(41) int local41 = arg9 * arg9 + arg3 * arg3;
		if (local33 * local33 < local41) {
			return;
		}
		@Pc(64) int local64 = Class4_Sub2_Sub26.anIntArray563[local14];
		@Pc(68) int local68 = Class4_Sub2_Sub26.anIntArray562[local14];
		if (Static259.anInt4200 != 4) {
			local68 = local68 * 256 / (Static338.anInt5228 + 256);
			local64 = local64 * 256 / (Static338.anInt5228 + 256);
		}
		@Pc(97) int local97 = arg9 * local64 + arg3 * local68 >> 14;
		@Pc(107) int local107 = local68 * arg9 - arg3 * local64 >> 14;
		@Pc(114) int local114 = arg5.method1020((Class17[]) null, arg8, 100);
		@Pc(120) int local120 = local97 - local114 / 2;
		@Pc(128) int local128 = arg5.method1021((Class17[]) null, 0, 100, arg8);
		if (-arg7.anInt5035 <= local120 && local120 <= arg7.anInt5035 && local107 >= -arg7.anInt4994 && arg7.anInt4994 >= local107) {
			arg0.method8065(arg10, 0, 1, arg2, arg10 + arg7.anInt4994 / 2 - local128 - local107 - arg6, 0, arg8, 0, 50, (Class17[]) null, arg4, local114, (int[]) null, arg2 + local120 + arg7.anInt5035 / 2, arg1);
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IBII)I")
	public static int method8951(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static140.aClass42Array4 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg2 >> 9;
		@Pc(15) int local15 = arg1 >> 9;
		if (local11 < 0 || local15 < 0 || local11 > Static224.anInt3557 - 1 || local15 > Static267.anInt4309 - 1) {
			return 0;
		}
		@Pc(46) int local46 = arg0;
		if (arg0 < 3 && (Static47.aByteArrayArrayArray3[1][local11][local15] & 0x2) != 0) {
			local46 = arg0 + 1;
		}
		return Static140.aClass42Array4[local46].method7453(arg2, arg1);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Ljava/lang/String;Ljava/awt/Color;ILjava/awt/Color;ILjava/awt/Color;)V")
	public static void method8952(@OriginalArg(0) String arg0, @OriginalArg(1) Color arg1, @OriginalArg(3) Color arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Color arg4) {
		try {
			@Pc(2) Graphics local2 = Static17.aCanvas1.getGraphics();
			if (Static250.aFont1 == null) {
				Static250.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg4 == null) {
				arg4 = new Color(140, 17, 17);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			if (arg1 == null) {
				arg1 = new Color(255, 255, 255);
			}
			@Pc(71) int local71;
			try {
				if (Static89.anImage2 == null) {
					Static89.anImage2 = Static17.aCanvas1.createImage(Static632.anInt9867, Static357.anInt5421);
				}
				@Pc(48) Graphics local48 = Static89.anImage2.getGraphics();
				local48.setColor(Color.black);
				local48.fillRect(0, 0, Static632.anInt9867, Static357.anInt5421);
				local71 = Static632.anInt9867 / 2 - 152;
				@Pc(77) int local77 = Static357.anInt5421 / 2 - 18;
				local48.setColor(arg2);
				local48.drawRect(local71, local77, 303, 33);
				local48.setColor(arg4);
				local48.fillRect(local71 + 2, local77 - -2, arg3 * 3, 30);
				local48.setColor(Color.black);
				local48.drawRect(local71 + 1, local77 - -1, 301, 31);
				local48.fillRect(arg3 * 3 + local71 + 2, local77 - -2, 300 - arg3 * 3, 30);
				local48.setFont(Static250.aFont1);
				local48.setColor(arg1);
				local48.drawString(arg0, (304 - arg0.length() * 6) / 2 + local71, local77 - -22);
				if (Static18.aString84 != null) {
					local48.setFont(Static250.aFont1);
					local48.setColor(arg1);
					local48.drawString(Static18.aString84, Static632.anInt9867 / 2 - Static18.aString84.length() * 6 / 2, Static357.anInt5421 / 2 + -26);
				}
				local2.drawImage(Static89.anImage2, 0, 0, (ImageObserver) null);
			} catch (@Pc(191) Exception local191) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static632.anInt9867, Static357.anInt5421);
				@Pc(206) int local206 = Static632.anInt9867 / 2 - 152;
				local71 = Static357.anInt5421 / 2 - 18;
				local2.setColor(arg2);
				local2.drawRect(local206, local71, 303, 33);
				local2.setColor(arg4);
				local2.fillRect(local206 + 2, local71 - -2, arg3 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local206 + 1, local71 + 1, 301, 31);
				local2.fillRect(local206 + arg3 * 3 + 2, local71 + 2, 300 - arg3 * 3, 30);
				local2.setFont(Static250.aFont1);
				local2.setColor(arg1);
				if (Static18.aString84 != null) {
					local2.setFont(Static250.aFont1);
					local2.setColor(arg1);
					local2.drawString(Static18.aString84, Static632.anInt9867 / 2 - Static18.aString84.length() * 6 / 2, Static357.anInt5421 / 2 - 26);
				}
				local2.drawString(arg0, local206 + (304 - arg0.length() * 6) / 2, local71 + 22);
			}
		} catch (@Pc(319) Exception local319) {
			Static17.aCanvas1.repaint();
		}
	}
}
