import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!km", name = "d", descriptor = "Lclient!ce;")
	public static Class3_Sub3_Sub5 aClass3_Sub3_Sub5_2;

	@OriginalMember(owner = "client!km", name = "e", descriptor = "Lclient!au;")
	public static Class15 aClass15_2;

	@OriginalMember(owner = "client!km", name = "g", descriptor = "F")
	public static float aFloat57;

	@OriginalMember(owner = "client!km", name = "f", descriptor = "I")
	public static int anInt4181 = 0;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIII)V")
	public static void method3438(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static151.aClass217ArrayArrayArray3 == null) {
			return;
		}
		@Pc(17) long local17 = (long) (arg1 | arg0 << 14 | arg2 << 28);
		@Pc(23) Class3_Sub44 local23 = (Class3_Sub44) Static157.aClass127_15.method3246(local17);
		if (local23 == null) {
			Static226.method3571(arg2, arg1, arg0);
			return;
		}
		@Pc(37) Class3_Sub22 local37 = (Class3_Sub22) local23.aClass229_46.method5328();
		if (local37 == null) {
			Static226.method3571(arg2, arg1, arg0);
			return;
		}
		@Pc(51) Class1_Sub4_Sub1 local51 = (Class1_Sub4_Sub1) Static226.method3571(arg2, arg1, arg0);
		if (local51 == null) {
			local51 = new Class1_Sub4_Sub1();
		} else {
			local51.anInt3909 = local51.anInt3915 = -1;
		}
		local51.anInt3912 = local37.anInt3545;
		local51.anInt3910 = local37.anInt3542;
		label44: while (true) {
			@Pc(89) Class3_Sub22 local89 = (Class3_Sub22) local23.aClass229_46.method5325();
			if (local89 == null) {
				break;
			}
			if (local89.anInt3545 != local51.anInt3912) {
				local51.anInt3909 = local89.anInt3545;
				local51.anInt3908 = local89.anInt3542;
				while (true) {
					@Pc(114) Class3_Sub22 local114 = (Class3_Sub22) local23.aClass229_46.method5325();
					if (local114 == null) {
						break label44;
					}
					if (local51.anInt3912 != local114.anInt3545 && local114.anInt3545 != local51.anInt3909) {
						local51.anInt3915 = local114.anInt3545;
						local51.anInt3914 = local114.anInt3542;
					}
				}
			}
		}
		@Pc(151) int local151 = Static124.method2209(arg2, (arg1 << 7) + 64, (arg0 << 7) + 64);
		Static350.method4985(arg2, arg1, arg0, local151, local51);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ZLjava/awt/Color;ZLjava/awt/Color;Ljava/lang/String;ILjava/awt/Color;)V")
	public static void method3439(@OriginalArg(1) Color arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Color arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Color arg5) {
		try {
			@Pc(11) Graphics local11 = Static351.aCanvas6.getGraphics();
			if (Static103.aFont1 == null) {
				Static103.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg1) {
				local11.setColor(Color.black);
				local11.fillRect(0, 0, Static385.anInt6686, Static120.anInt2616);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			if (arg5 == null) {
				arg5 = new Color(140, 17, 17);
			}
			if (arg0 == null) {
				arg0 = new Color(255, 255, 255);
			}
			try {
				if (Static248.anImage2 == null) {
					Static248.anImage2 = Static351.aCanvas6.createImage(304, 34);
				}
				@Pc(68) Graphics local68 = Static248.anImage2.getGraphics();
				local68.setColor(arg5);
				local68.drawRect(0, 0, 303, 33);
				local68.setColor(arg2);
				local68.fillRect(2, 2, arg4 * 3, 30);
				local68.setColor(Color.black);
				local68.drawRect(1, 1, 301, 31);
				local68.fillRect(arg4 * 3 + 2, 2, 300 - arg4 * 3, 30);
				local68.setFont(Static103.aFont1);
				local68.setColor(arg0);
				local68.drawString(arg3, (304 - arg3.length() * 6) / 2, 22);
				local11.drawImage(Static248.anImage2, Static385.anInt6686 / 2 - 152, Static120.anInt2616 / 2 + -18, null);
			} catch (@Pc(148) Exception local148) {
				@Pc(154) int local154 = Static385.anInt6686 / 2 - 152;
				@Pc(160) int local160 = Static120.anInt2616 / 2 - 18;
				local11.setColor(arg5);
				local11.drawRect(0, 0, 303, 33);
				local11.setColor(arg2);
				local11.fillRect(local154 + 2, local160 + 2, arg4 * 3, 30);
				local11.setColor(Color.black);
				local11.drawRect(local154 + 1, local160 + 1, 301, 31);
				local11.fillRect(arg4 * 3 + local154 + 2, local160 + 2, 300 - arg4 * 3, 30);
				local11.setFont(Static103.aFont1);
				local11.setColor(arg0);
				local11.drawString(arg3, (304 - arg3.length() * 6) / 2 + local154, local160 + 22);
			}
			if (Static407.aString64 != null) {
				local11.setFont(Static103.aFont1);
				local11.setColor(arg0);
				local11.drawString(Static407.aString64, Static385.anInt6686 / 2 - Static407.aString64.length() * 6 / 2, Static120.anInt2616 / 2 + -26);
			}
		} catch (@Pc(266) Exception local266) {
			Static351.aCanvas6.repaint();
		}
	}
}
