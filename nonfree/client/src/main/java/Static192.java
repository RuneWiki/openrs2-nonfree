import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!js", name = "S", descriptor = "I")
	public static int anInt3387;

	@OriginalMember(owner = "client!js", name = "O", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_55 = new Class186(84, 3);

	@OriginalMember(owner = "client!js", name = "Q", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray6 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!js", name = "U", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_55 = new Class231(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Z)V")
	public static void method3027() {
		if (Static18.aClass105_1 != null) {
			Static18.aClass105_1.method5162();
		}
		if (Static166.aClass105_2 != null) {
			Static166.aClass105_2.method5162();
		}
	}

	@OriginalMember(owner = "client!js", name = "f", descriptor = "(I)V")
	public static void method3028() {
		@Pc(8) Class6_Sub7 local8 = (Class6_Sub7) Static254.aClass88_34.method1882();
		@Pc(19) boolean local19 = Static332.aClass239_12 != null || Static203.anInt3586 > 0;
		if (local19) {
			Static122.anInt2160 = 1;
		}
		if (Static219.aBoolean247 && Static326.aClass86_1.method1867(81) && Static228.anInt3878 > 2) {
			if (local19) {
				Static80.aClass6_Sub33_1 = (Class6_Sub33) Static307.aClass88_23.aClass6_73.aClass6_251.aClass6_251;
			} else {
				Static131.method2145((Class6_Sub33) Static307.aClass88_23.aClass6_73.aClass6_251.aClass6_251, local8.method1258(), local8.method1257());
			}
		} else if (local19) {
			Static80.aClass6_Sub33_1 = (Class6_Sub33) Static307.aClass88_23.aClass6_73.aClass6_251;
		} else {
			Static131.method2145((Class6_Sub33) Static307.aClass88_23.aClass6_73.aClass6_251, local8.method1258(), local8.method1257());
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Lclient!h;III[Z)Z")
	public static boolean method3030(@OriginalArg(0) Class6_Sub1_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static420.aClass84Array4 != Static365.aClass84Array3) {
			@Pc(11) int local11 = Static93.aClass84Array1[arg1].method5334(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class84 local18 = Static93.aClass84Array1[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.method5334(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method5333(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.method5321(arg0, arg2, local27, arg3);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Ljava/awt/Color;IZILjava/awt/Color;Ljava/lang/String;Ljava/awt/Color;)V")
	public static void method3031(@OriginalArg(0) Color arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Color arg3, @OriginalArg(5) String arg4, @OriginalArg(6) Color arg5) {
		try {
			@Pc(6) Graphics local6 = Static314.aCanvas8.getGraphics();
			if (Static88.aFont1 == null) {
				Static88.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg2) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static235.anInt4053, Static381.anInt6279);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			if (arg5 == null) {
				arg5 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(255, 255, 255);
			}
			try {
				if (Static201.anImage2 == null) {
					Static201.anImage2 = Static314.aCanvas8.createImage(304, 34);
				}
				@Pc(63) Graphics local63 = Static201.anImage2.getGraphics();
				local63.setColor(arg5);
				local63.drawRect(0, 0, 303, 33);
				local63.setColor(arg0);
				local63.fillRect(2, 2, arg1 * 3, 30);
				local63.setColor(Color.black);
				local63.drawRect(1, 1, 301, 31);
				local63.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
				local63.setFont(Static88.aFont1);
				local63.setColor(arg3);
				local63.drawString(arg4, (304 - arg4.length() * 6) / 2, 22);
				local6.drawImage(Static201.anImage2, Static235.anInt4053 / 2 - 152, Static381.anInt6279 / 2 + -18, null);
			} catch (@Pc(142) Exception local142) {
				@Pc(148) int local148 = Static235.anInt4053 / 2 - 152;
				@Pc(154) int local154 = Static381.anInt6279 / 2 - 18;
				local6.setColor(arg5);
				local6.drawRect(0, 0, 303, 33);
				local6.setColor(arg0);
				local6.fillRect(local148 + 2, local154 + 2, arg1 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local148 + 1, local154 + 1, 301, 31);
				local6.fillRect(local148 + arg1 * 3 + 2, local154 + 2, 300 - arg1 * 3, 30);
				local6.setFont(Static88.aFont1);
				local6.setColor(arg3);
				local6.drawString(arg4, local148 + (304 - arg4.length() * 6) / 2, local154 + 22);
			}
			if (Static155.aString30 != null) {
				local6.setFont(Static88.aFont1);
				local6.setColor(arg3);
				local6.drawString(Static155.aString30, Static235.anInt4053 / 2 - Static155.aString30.length() * 6 / 2, Static381.anInt6279 / 2 + -26);
			}
		} catch (@Pc(271) Exception local271) {
			Static314.aCanvas8.repaint();
		}
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(III)Z")
	public static boolean method3032(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x34) != 0;
	}
}
