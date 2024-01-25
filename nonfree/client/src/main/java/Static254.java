import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "[I")
	public static final int[] anIntArray351 = new int[50];

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)V")
	public static void method3215(@OriginalArg(1) int arg0) {
		@Pc(12) Class2_Sub5_Sub11 local12 = Static316.method4316(7, arg0);
		local12.method3101();
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Ljava/awt/Color;ZLjava/awt/Color;Ljava/lang/String;ILjava/awt/Color;I)V")
	public static void method3216(@OriginalArg(0) Color arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Color arg2, @OriginalArg(3) String arg3, @OriginalArg(5) Color arg4, @OriginalArg(6) int arg5) {
		try {
			@Pc(2) Graphics local2 = Static286.aCanvas4.getGraphics();
			if (Static271.aFont2 == null) {
				Static271.aFont2 = new Font("Helvetica", 1, 13);
			}
			if (arg1) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static141.anInt2513, Static314.anInt5426);
			}
			if (arg4 == null) {
				arg4 = new Color(140, 17, 17);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			if (arg0 == null) {
				arg0 = new Color(255, 255, 255);
			}
			try {
				if (Static202.anImage1 == null) {
					Static202.anImage1 = Static286.aCanvas4.createImage(304, 34);
				}
				@Pc(59) Graphics local59 = Static202.anImage1.getGraphics();
				local59.setColor(arg2);
				local59.drawRect(0, 0, 303, 33);
				local59.setColor(arg4);
				local59.fillRect(2, 2, arg5 * 3, 30);
				local59.setColor(Color.black);
				local59.drawRect(1, 1, 301, 31);
				local59.fillRect(arg5 * 3 + 2, 2, 300 - arg5 * 3, 30);
				local59.setFont(Static271.aFont2);
				local59.setColor(arg0);
				local59.drawString(arg3, (304 - arg3.length() * 6) / 2, 22);
				local2.drawImage(Static202.anImage1, Static141.anInt2513 / 2 - 152, Static314.anInt5426 / 2 - 18, null);
			} catch (@Pc(140) Exception local140) {
				@Pc(146) int local146 = Static141.anInt2513 / 2 - 152;
				@Pc(152) int local152 = Static314.anInt5426 / 2 - 18;
				local2.setColor(arg2);
				local2.drawRect(0, 0, 303, 33);
				local2.setColor(arg4);
				local2.fillRect(local146 + 2, local152 + 2, arg5 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local146 + 1, local152 + 1, 301, 31);
				local2.fillRect(arg5 * 3 + local146 + 2, local152 - -2, 300 - arg5 * 3, 30);
				local2.setFont(Static271.aFont2);
				local2.setColor(arg0);
				local2.drawString(arg3, local146 + (304 - arg3.length() * 6) / 2, local152 + 22);
			}
			if (Static87.aString208 != null) {
				local2.setFont(Static271.aFont2);
				local2.setColor(arg0);
				local2.drawString(Static87.aString208, Static141.anInt2513 / 2 - Static87.aString208.length() * 6 / 2, Static314.anInt5426 / 2 + -26);
			}
		} catch (@Pc(258) Exception local258) {
			Static286.aCanvas4.repaint();
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method3217(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(12) Class2_Sub5_Sub11 local12 = Static316.method4316(2, arg0);
		local12.method3098();
		local12.aString113 = arg1;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILclient!ja;)V")
	public static void method3218(@OriginalArg(1) Class21_Sub4 arg0) {
		arg0.aClass3_Sub4_Sub1_1 = null;
		if (Static234.anInt3750 < 20) {
			Static444.aClass93_7.method2079(arg0);
			Static234.anInt3750++;
		}
	}
}
