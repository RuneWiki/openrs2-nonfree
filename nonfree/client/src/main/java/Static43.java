import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "I")
	public static int anInt1122 = 0;

	@OriginalMember(owner = "client!bia", name = "e", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("8f7feb37295d518ee1a9d54b127e20c29e573fbc44c899df33c6f5f76f7f5e16301f172a5ecf621b4d28b3b162fe99c52072240cee10ec780db5e58f61d0146d", 16);

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(II)Lclient!ria;")
	public static Class303 method1101(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static261.aClass303ArrayArray1[local7] == null || Static261.aClass303ArrayArray1[local7][local11] == null) {
			@Pc(25) boolean local25 = Static31.method728(local7);
			if (!local25) {
				return null;
			}
		}
		return Static261.aClass303ArrayArray1[local7][local11];
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(Lclient!rba;)V")
	public static void method1103(@OriginalArg(0) Class16_Sub1 arg0) {
		if (arg0 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < 2; local4++) {
			@Pc(7) Class16_Sub1 local7 = null;
			for (@Pc(11) Class16_Sub1 local11 = Static524.aClass16_Sub1Array5[local4]; local11 != null; local11 = local11.aClass16_Sub1_23) {
				if (local11 == arg0) {
					if (local7 == null) {
						Static524.aClass16_Sub1Array5[local4] = local11.aClass16_Sub1_23;
					} else {
						local7.aClass16_Sub1_23 = local11.aClass16_Sub1_23;
					}
					Static578.aBoolean673 = true;
					return;
				}
				local7 = local11;
			}
			local7 = null;
			for (@Pc(43) Class16_Sub1 local43 = Static451.aClass16_Sub1Array3[local4]; local43 != null; local43 = local43.aClass16_Sub1_23) {
				if (local43 == arg0) {
					if (local7 == null) {
						Static451.aClass16_Sub1Array3[local4] = local43.aClass16_Sub1_23;
					} else {
						local7.aClass16_Sub1_23 = local43.aClass16_Sub1_23;
					}
					Static578.aBoolean673 = true;
					return;
				}
				local7 = local43;
			}
			local7 = null;
			for (@Pc(75) Class16_Sub1 local75 = Static518.aClass16_Sub1Array4[local4]; local75 != null; local75 = local75.aClass16_Sub1_23) {
				if (local75 == arg0) {
					if (local7 == null) {
						Static518.aClass16_Sub1Array4[local4] = local75.aClass16_Sub1_23;
					} else {
						local7.aClass16_Sub1_23 = local75.aClass16_Sub1_23;
					}
					Static578.aBoolean673 = true;
					return;
				}
				local7 = local75;
			}
		}
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(BILjava/awt/Color;Ljava/lang/String;Ljava/awt/Color;Ljava/awt/Color;)V")
	public static void method1104(@OriginalArg(1) int arg0, @OriginalArg(2) Color arg1, @OriginalArg(3) String arg2, @OriginalArg(4) Color arg3, @OriginalArg(5) Color arg4) {
		try {
			@Pc(2) Graphics local2 = Static150.aCanvas4.getGraphics();
			if (Static299.aFont1 == null) {
				Static299.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			if (arg4 == null) {
				arg4 = new Color(255, 255, 255);
			}
			@Pc(63) int local63;
			try {
				if (Static304.anImage2 == null) {
					Static304.anImage2 = Static150.aCanvas4.createImage(Class16_Sub1_Sub5_Sub1.lb, Static71.anInt1925);
				}
				@Pc(48) Graphics local48 = Static304.anImage2.getGraphics();
				local48.setColor(Color.black);
				local48.fillRect(0, 0, Class16_Sub1_Sub5_Sub1.lb, Static71.anInt1925);
				local63 = Class16_Sub1_Sub5_Sub1.lb / 2 - 152;
				@Pc(69) int local69 = Static71.anInt1925 / 2 - 18;
				local48.setColor(arg1);
				local48.drawRect(local63, local69, 303, 33);
				local48.setColor(arg3);
				local48.fillRect(local63 + 2, local69 + 2, arg0 * 3, 30);
				local48.setColor(Color.black);
				local48.drawRect(local63 + 1, local69 + 1, 301, 31);
				local48.fillRect(local63 + arg0 * 3 + 2, local69 + 2, 300 - arg0 * 3, 30);
				local48.setFont(Static299.aFont1);
				local48.setColor(arg4);
				local48.drawString(arg2, (304 - arg2.length() * 6) / 2 + local63, local69 + 22);
				if (Static596.aString105 != null) {
					local48.setFont(Static299.aFont1);
					local48.setColor(arg4);
					local48.drawString(Static596.aString105, Class16_Sub1_Sub5_Sub1.lb / 2 - Static596.aString105.length() * 6 / 2, Static71.anInt1925 / 2 + -26);
				}
				local2.drawImage(Static304.anImage2, 0, 0, (ImageObserver) null);
			} catch (@Pc(188) Exception local188) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Class16_Sub1_Sub5_Sub1.lb, Static71.anInt1925);
				@Pc(203) int local203 = Class16_Sub1_Sub5_Sub1.lb / 2 - 152;
				local63 = Static71.anInt1925 / 2 - 18;
				local2.setColor(arg1);
				local2.drawRect(local203, local63, 303, 33);
				local2.setColor(arg3);
				local2.fillRect(local203 + 2, local63 + 2, arg0 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local203 + 1, local63 - -1, 301, 31);
				local2.fillRect(arg0 * 3 + local203 + 2, local63 - -2, 300 - arg0 * 3, 30);
				local2.setFont(Static299.aFont1);
				local2.setColor(arg4);
				if (Static596.aString105 != null) {
					local2.setFont(Static299.aFont1);
					local2.setColor(arg4);
					local2.drawString(Static596.aString105, Class16_Sub1_Sub5_Sub1.lb / 2 - Static596.aString105.length() * 6 / 2, Static71.anInt1925 / 2 + -26);
				}
				local2.drawString(arg2, local203 + (304 - arg2.length() * 6) / 2, local63 - -22);
			}
		} catch (@Pc(317) Exception local317) {
			Static150.aCanvas4.repaint();
		}
	}
}
