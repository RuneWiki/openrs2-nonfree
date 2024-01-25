import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!bj", name = "s", descriptor = "I")
	public static int anInt803;

	@OriginalMember(owner = "client!bj", name = "G", descriptor = "Lclient!vea;")
	public static final Class368 aClass368_2 = new Class368();

	@OriginalMember(owner = "client!bj", name = "y", descriptor = "Z")
	public static final boolean aBoolean65 = false;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IILclient!ub;)V")
	public static void method766(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub23_Sub2 arg1) {
		Static303.aBoolean418 = false;
		Static226.anInt3673 = 0;
		Static387.method5647(arg1);
		Static395.method5777(arg1);
		if (Static303.aBoolean418) {
			System.out.println("---endgpp---");
		}
		if (arg1.anInt9869 != arg0) {
			throw new RuntimeException("gpi1 pos:" + arg1.anInt9869 + " psize:" + arg0);
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Ljava/lang/String;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;II)V")
	public static void method768(@OriginalArg(0) String arg0, @OriginalArg(1) Color arg1, @OriginalArg(2) Color arg2, @OriginalArg(3) Color arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(6) Graphics local6 = Static24.aCanvas1.getGraphics();
			if (Static303.aFont1 == null) {
				Static303.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(255, 255, 255);
			}
			@Pc(73) int local73;
			try {
				if (Static640.anImage13 == null) {
					Static640.anImage13 = Static24.aCanvas1.createImage(Static70.anInt1125, Static631.anInt10283);
				}
				@Pc(58) Graphics local58 = Static640.anImage13.getGraphics();
				local58.setColor(Color.black);
				local58.fillRect(0, 0, Static70.anInt1125, Static631.anInt10283);
				local73 = Static70.anInt1125 / 2 - 152;
				@Pc(79) int local79 = Static631.anInt10283 / 2 - 18;
				local58.setColor(arg1);
				local58.drawRect(local73, local79, 303, 33);
				local58.setColor(arg2);
				local58.fillRect(local73 + 2, local79 + 2, arg4 * 3, 30);
				local58.setColor(Color.black);
				local58.drawRect(local73 + 1, local79 + 1, 301, 31);
				local58.fillRect(arg4 * 3 + local73 + 2, local79 + 2, 300 - arg4 * 3, 30);
				local58.setFont(Static303.aFont1);
				local58.setColor(arg3);
				local58.drawString(arg0, local73 + (304 - arg0.length() * 6) / 2, local79 + 22);
				if (Static286.aString68 != null) {
					local58.setFont(Static303.aFont1);
					local58.setColor(arg3);
					local58.drawString(Static286.aString68, Static70.anInt1125 / 2 - Static286.aString68.length() * 6 / 2, Static631.anInt10283 / 2 + -26);
				}
				local6.drawImage(Static640.anImage13, 0, 0, (ImageObserver) null);
			} catch (@Pc(200) Exception local200) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static70.anInt1125, Static631.anInt10283);
				@Pc(215) int local215 = Static70.anInt1125 / 2 - 152;
				local73 = Static631.anInt10283 / 2 - 18;
				local6.setColor(arg1);
				local6.drawRect(local215, local73, 303, 33);
				local6.setColor(arg2);
				local6.fillRect(local215 + 2, local73 + 2, arg4 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local215 + 1, local73 + 1, 301, 31);
				local6.fillRect(local215 + arg4 * 3 + 2, local73 + 2, 300 - arg4 * 3, 30);
				local6.setFont(Static303.aFont1);
				local6.setColor(arg3);
				if (Static286.aString68 != null) {
					local6.setFont(Static303.aFont1);
					local6.setColor(arg3);
					local6.drawString(Static286.aString68, Static70.anInt1125 / 2 - Static286.aString68.length() * 6 / 2, Static631.anInt10283 / 2 - 26);
				}
				local6.drawString(arg0, local215 + (304 - arg0.length() * 6) / 2, local73 + 22);
			}
		} catch (@Pc(333) Exception local333) {
			Static24.aCanvas1.repaint();
		}
	}
}
