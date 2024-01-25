import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!os", name = "h", descriptor = "[S")
	public static short[] aShortArray84;

	@OriginalMember(owner = "client!os", name = "i", descriptor = "I")
	public static int anInt5134;

	@OriginalMember(owner = "client!os", name = "c", descriptor = "[I")
	public static final int[] anIntArray443 = new int[50];

	@OriginalMember(owner = "client!os", name = "e", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_59 = new Class179(33, -1);

	@OriginalMember(owner = "client!os", name = "g", descriptor = "I")
	public static int anInt5133 = 0;

	@OriginalMember(owner = "client!os", name = "a", descriptor = "([II[I[ILclient!wq;)V")
	public static void method4253(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class31_Sub2_Sub1_Sub2 arg3) {
		for (@Pc(8) int local8 = 0; local8 < arg2.length; local8++) {
			@Pc(14) int local14 = arg2[local8];
			@Pc(18) int local18 = arg1[local8];
			@Pc(22) int local22 = arg0[local8];
			for (@Pc(24) int local24 = 0; local18 != 0 && arg3.aClass225Array3.length > local24; local24++) {
				if ((local18 & 0x1) != 0) {
					if (local14 == -1) {
						arg3.aClass225Array3[local24] = null;
					} else {
						@Pc(39) Class223 local39 = Static293.aClass127_1.method2975(local14);
						@Pc(42) int local42 = local39.anInt6050;
						@Pc(47) Class225 local47 = arg3.aClass225Array3[local24];
						if (local47 != null) {
							if (local47.anInt6081 == local14) {
								if (local42 == 0) {
									local47 = arg3.aClass225Array3[local24] = null;
								} else if (local42 == 1) {
									local47.anInt6087 = 0;
									local47.anInt6088 = 0;
									local47.anInt6085 = local22;
									local47.anInt6083 = 0;
									local47.anInt6082 = 1;
									Static172.method2762(local39, arg3.anInt7300, false, 0, arg3.aByte100, arg3.anInt7298);
								} else if (local42 == 2) {
									local47.anInt6083 = 0;
								}
							} else if (local39.anInt6039 >= Static293.aClass127_1.method2975(local47.anInt6081).anInt6039) {
								local47 = arg3.aClass225Array3[local24] = null;
							}
						}
						if (local47 == null) {
							local47 = arg3.aClass225Array3[local24] = new Class225();
							local47.anInt6082 = 1;
							local47.anInt6083 = 0;
							local47.anInt6088 = 0;
							local47.anInt6087 = 0;
							local47.anInt6081 = local14;
							local47.anInt6085 = local22;
							Static172.method2762(local39, arg3.anInt7300, false, 0, arg3.aByte100, arg3.anInt7298);
						}
					}
				}
				local18 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Ljava/awt/Color;ILjava/lang/String;BLjava/awt/Color;Ljava/awt/Color;Z)V")
	public static void method4255(@OriginalArg(0) Color arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) Color arg3, @OriginalArg(5) Color arg4, @OriginalArg(6) boolean arg5) {
		try {
			@Pc(2) Graphics local2 = Static155.aCanvas4.getGraphics();
			if (Static140.aFont1 == null) {
				Static140.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg5) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static95.anInt1971, Static34.anInt715);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			if (arg4 == null) {
				arg4 = new Color(140, 17, 17);
			}
			if (arg0 == null) {
				arg0 = new Color(255, 255, 255);
			}
			try {
				if (Static304.anImage3 == null) {
					Static304.anImage3 = Static155.aCanvas4.createImage(304, 34);
				}
				@Pc(59) Graphics local59 = Static304.anImage3.getGraphics();
				local59.setColor(arg4);
				local59.drawRect(0, 0, 303, 33);
				local59.setColor(arg3);
				local59.fillRect(2, 2, arg1 * 3, 30);
				local59.setColor(Color.black);
				local59.drawRect(1, 1, 301, 31);
				local59.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
				local59.setFont(Static140.aFont1);
				local59.setColor(arg0);
				local59.drawString(arg2, (304 - arg2.length() * 6) / 2, 22);
				local2.drawImage(Static304.anImage3, Static95.anInt1971 / 2 - 152, Static34.anInt715 / 2 + -18, null);
			} catch (@Pc(138) Exception local138) {
				@Pc(144) int local144 = Static95.anInt1971 / 2 - 152;
				@Pc(150) int local150 = Static34.anInt715 / 2 - 18;
				local2.setColor(arg4);
				local2.drawRect(0, 0, 303, 33);
				local2.setColor(arg3);
				local2.fillRect(local144 + 2, local150 - -2, arg1 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local144 + 1, local150 - -1, 301, 31);
				local2.fillRect(arg1 * 3 + local144 + 2, local150 + 2, 300 - arg1 * 3, 30);
				local2.setFont(Static140.aFont1);
				local2.setColor(arg0);
				local2.drawString(arg2, local144 + (304 - arg2.length() * 6) / 2, local150 + 22);
			}
			if (Static16.aString3 != null) {
				local2.setFont(Static140.aFont1);
				local2.setColor(arg0);
				local2.drawString(Static16.aString3, Static95.anInt1971 / 2 - Static16.aString3.length() * 6 / 2, Static34.anInt715 / 2 + -26);
			}
		} catch (@Pc(256) Exception local256) {
			Static155.aCanvas4.repaint();
		}
	}
}
