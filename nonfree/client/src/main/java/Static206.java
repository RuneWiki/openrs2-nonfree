import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!jv", name = "w", descriptor = "Lclient!sc;")
	public static Class223 aClass223_3;

	@OriginalMember(owner = "client!jv", name = "C", descriptor = "F")
	public static float aFloat25;

	@OriginalMember(owner = "client!jv", name = "o", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray42 = new String[8];

	@OriginalMember(owner = "client!jv", name = "y", descriptor = "J")
	public static long aLong172 = -1L;

	@OriginalMember(owner = "client!jv", name = "B", descriptor = "I")
	public static int anInt3554 = 0;

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "([I[[BIII[I[B[[B)I")
	public static int method2908(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) byte[][] arg6) {
		@Pc(17) int local17 = arg4[arg2];
		@Pc(23) int local23 = arg0[arg2] + local17;
		@Pc(27) int local27 = arg4[arg3];
		@Pc(33) int local33 = arg0[arg3] + local27;
		@Pc(35) int local35 = local17;
		if (local17 < local27) {
			local35 = local27;
		}
		@Pc(42) int local42 = local23;
		if (local23 > local33) {
			local42 = local33;
		}
		@Pc(53) int local53 = arg5[arg2] & 0xFF;
		if (local53 > (arg5[arg3] & 0xFF)) {
			local53 = arg5[arg3] & 0xFF;
		}
		@Pc(70) byte[] local70 = arg6[arg2];
		@Pc(74) byte[] local74 = arg1[arg3];
		@Pc(79) int local79 = local35 - local17;
		@Pc(84) int local84 = local35 - local27;
		for (@Pc(86) int local86 = local35; local86 < local42; local86++) {
			@Pc(98) int local98 = local74[local84++] + local70[local79++];
			if (local98 < local53) {
				local53 = local98;
			}
		}
		return -local53;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IZ)V")
	public static void method2909(@OriginalArg(0) int arg0) {
		Static9.anInt6381 = arg0;
		@Pc(11) Class188 local11 = Static288.aClass188_42;
		synchronized (Static288.aClass188_42) {
			Static288.aClass188_42.method4156();
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Ljava/awt/Color;Ljava/awt/Color;ZLjava/awt/Color;ZILjava/lang/String;)V")
	public static void method2910(@OriginalArg(0) Color arg0, @OriginalArg(1) Color arg1, @OriginalArg(3) Color arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5) {
		try {
			@Pc(2) Graphics local2 = Static291.aCanvas6.getGraphics();
			if (Static316.aFont1 == null) {
				Static316.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg3) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static49.anInt789, Static344.anInt6105);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			if (arg2 == null) {
				arg2 = new Color(255, 255, 255);
			}
			try {
				if (Static88.anImage7 == null) {
					Static88.anImage7 = Static291.aCanvas6.createImage(304, 34);
				}
				@Pc(59) Graphics local59 = Static88.anImage7.getGraphics();
				local59.setColor(arg0);
				local59.drawRect(0, 0, 303, 33);
				local59.setColor(arg1);
				local59.fillRect(2, 2, arg4 * 3, 30);
				local59.setColor(Color.black);
				local59.drawRect(1, 1, 301, 31);
				local59.fillRect(arg4 * 3 + 2, 2, 300 - arg4 * 3, 30);
				local59.setFont(Static316.aFont1);
				local59.setColor(arg2);
				local59.drawString(arg5, (304 - arg5.length() * 6) / 2, 22);
				local2.drawImage(Static88.anImage7, Static49.anInt789 / 2 - 152, Static344.anInt6105 / 2 + -18, null);
			} catch (@Pc(144) Exception local144) {
				@Pc(150) int local150 = Static49.anInt789 / 2 - 152;
				@Pc(156) int local156 = Static344.anInt6105 / 2 - 18;
				local2.setColor(arg0);
				local2.drawRect(0, 0, 303, 33);
				local2.setColor(arg1);
				local2.fillRect(local150 + 2, local156 + 2, arg4 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local150 + 1, local156 - -1, 301, 31);
				local2.fillRect(arg4 * 3 + local150 + 2, local156 + 2, 300 - arg4 * 3, 30);
				local2.setFont(Static316.aFont1);
				local2.setColor(arg2);
				local2.drawString(arg5, local150 + (304 - arg5.length() * 6) / 2, local156 - -22);
			}
			if (Static460.aString75 != null) {
				local2.setFont(Static316.aFont1);
				local2.setColor(arg2);
				local2.drawString(Static460.aString75, Static49.anInt789 / 2 - Static460.aString75.length() * 6 / 2, Static344.anInt6105 / 2 + -26);
			}
		} catch (@Pc(265) Exception local265) {
			Static291.aCanvas6.repaint();
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2912(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 == arg5) {
			Static11.method175(arg3, arg2, arg0, arg6, arg4, arg1);
		} else if (arg4 - arg2 >= Static347.anInt6160 && Static385.anInt6686 >= arg2 + arg4 && Static118.anInt2005 <= arg3 - arg5 && arg3 + arg5 <= Static123.anInt2069) {
			Static296.method4223(arg2, arg3, arg5, arg6, arg1, arg0, arg4);
		} else {
			Static440.method5934(arg3, arg0, arg2, arg5, arg1, arg4, arg6);
		}
	}

	@OriginalMember(owner = "client!jv", name = "c", descriptor = "(I)V")
	public static void method2913() {
		if (Static157.aBoolean179) {
			return;
		}
		Static157.aBoolean179 = true;
		if (Static434.aClass165_Sub1_1.aBoolean290) {
			Static37.aFloat9 = (int) Static37.aFloat9 + 191 & 0xFFFFFF80;
		} else {
			Static417.aFloat93 += (24.0F - Static417.aFloat93) / 2.0F;
		}
		Static94.aBoolean395 = true;
	}
}
