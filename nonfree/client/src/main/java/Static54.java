import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!cp", name = "K", descriptor = "I")
	public static int anInt1311;

	@OriginalMember(owner = "client!cp", name = "M", descriptor = "I")
	public static int anInt1312;

	@OriginalMember(owner = "client!cp", name = "G", descriptor = "Lclient!oe;")
	public static final Class181 aClass181_5 = new Class181(128);

	@OriginalMember(owner = "client!cp", name = "L", descriptor = "Z")
	public static boolean aBoolean90 = false;

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(BLjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;ZLjava/lang/String;I)V")
	public static void method1201(@OriginalArg(1) Color arg0, @OriginalArg(2) Color arg1, @OriginalArg(3) Color arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(6) Graphics local6 = Static409.aCanvas7.getGraphics();
			if (Static316.aFont1 == null) {
				Static316.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg3) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static374.anInt6595, Static30.anInt518);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			if (arg1 == null) {
				arg1 = new Color(255, 255, 255);
			}
			try {
				if (Static117.anImage3 == null) {
					Static117.anImage3 = Static409.aCanvas7.createImage(304, 34);
				}
				@Pc(71) Graphics local71 = Static117.anImage3.getGraphics();
				local71.setColor(arg0);
				local71.drawRect(0, 0, 303, 33);
				local71.setColor(arg2);
				local71.fillRect(2, 2, arg5 * 3, 30);
				local71.setColor(Color.black);
				local71.drawRect(1, 1, 301, 31);
				local71.fillRect(arg5 * 3 + 2, 2, 300 - arg5 * 3, 30);
				local71.setFont(Static316.aFont1);
				local71.setColor(arg1);
				local71.drawString(arg4, (304 - arg4.length() * 6) / 2, 22);
				local6.drawImage(Static117.anImage3, Static374.anInt6595 / 2 - 152, Static30.anInt518 / 2 - 18, null);
			} catch (@Pc(151) Exception local151) {
				@Pc(157) int local157 = Static374.anInt6595 / 2 - 152;
				@Pc(163) int local163 = Static30.anInt518 / 2 - 18;
				local6.setColor(arg0);
				local6.drawRect(0, 0, 303, 33);
				local6.setColor(arg2);
				local6.fillRect(local157 + 2, local163 - -2, arg5 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local157 + 1, local163 - -1, 301, 31);
				local6.fillRect(local157 + arg5 * 3 + 2, local163 - -2, 300 - arg5 * 3, 30);
				local6.setFont(Static316.aFont1);
				local6.setColor(arg1);
				local6.drawString(arg4, (304 - arg4.length() * 6) / 2 + local157, local163 - -22);
			}
			if (Static195.aString50 != null) {
				local6.setFont(Static316.aFont1);
				local6.setColor(arg1);
				local6.drawString(Static195.aString50, Static374.anInt6595 / 2 - Static195.aString50.length() * 6 / 2, Static30.anInt518 / 2 + -26);
			}
		} catch (@Pc(270) Exception local270) {
			Static409.aCanvas7.repaint();
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILclient!ul;ILjava/awt/Component;I)Lclient!ed;")
	public static Class55 method1203(@OriginalArg(0) int arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) int arg3) {
		if (Static88.anInt6642 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(49) Class55 local49 = (Class55) Class.forName("Class55_Sub2").getDeclaredConstructor().newInstance();
			local49.anInt7118 = arg3;
			local49.anIntArray577 = new int[(Static3.aBoolean91 ? 2 : 1) * 256];
			local49.method5670(arg2);
			local49.anInt7122 = (-1024 & arg3) + 1024;
			if (local49.anInt7122 > 16384) {
				local49.anInt7122 = 16384;
			}
			local49.method5673(local49.anInt7122);
			if (Static160.anInt3253 > 0 && Static29.aClass175_4 == null) {
				Static29.aClass175_4 = new Class175();
				Static29.aClass175_4.aClass255_3 = arg1;
				arg1.method5820(Static29.aClass175_4, Static160.anInt3253);
			}
			if (Static29.aClass175_4 != null) {
				if (Static29.aClass175_4.aClass55Array1[arg0] != null) {
					throw new IllegalArgumentException();
				}
				Static29.aClass175_4.aClass55Array1[arg0] = local49;
			}
			return local49;
		} catch (@Pc(126) Throwable local126) {
			try {
				@Pc(132) Class55_Sub1 local132 = new Class55_Sub1(arg1, arg0);
				local132.anInt7118 = arg3;
				local132.anIntArray577 = new int[(Static3.aBoolean91 ? 2 : 1) * 256];
				local132.method5670(arg2);
				local132.anInt7122 = 16384;
				local132.method5673(local132.anInt7122);
				if (Static160.anInt3253 > 0 && Static29.aClass175_4 == null) {
					Static29.aClass175_4 = new Class175();
					Static29.aClass175_4.aClass255_3 = arg1;
					arg1.method5820(Static29.aClass175_4, Static160.anInt3253);
				}
				if (Static29.aClass175_4 != null) {
					if (Static29.aClass175_4.aClass55Array1[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Static29.aClass175_4.aClass55Array1[arg0] = local132;
				}
				return local132;
			} catch (@Pc(191) Throwable local191) {
				return new Class55();
			}
		}
	}
}
