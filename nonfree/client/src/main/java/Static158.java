import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!ffa", name = "c", descriptor = "Lclient!cda;")
	public static Class46 aClass46_1;

	@OriginalMember(owner = "client!ffa", name = "e", descriptor = "Lclient!ow;")
	public static final Class271 aClass271_21 = new Class271();

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
	public static void method3194(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class357 local8 = Static226.method4160(arg3, arg2);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray5 != null) {
			@Pc(18) Class2_Sub45 local18 = new Class2_Sub45();
			local18.aClass357_131 = local8;
			local18.aString107 = arg0;
			local18.anObjectArray2 = local8.anObjectArray5;
			local18.anInt9040 = arg1;
			Static518.method8031(local18);
		}
		if (Static579.anInt10049 != 10 || !Static85.method1469(local8).method1135(arg1 - 1)) {
			return;
		}
		@Pc(66) Class2_Sub52 local66;
		if (arg1 == 1) {
			local66 = Static311.method5098(Static278.aClass341_58, Static125.aClass179_1);
			Static176.method3475(arg2, local8.anInt10396, arg3, local66);
			Static38.method791(local66);
		}
		if (arg1 == 2) {
			local66 = Static311.method5098(Static470.aClass341_60, Static125.aClass179_1);
			Static176.method3475(arg2, local8.anInt10396, arg3, local66);
			Static38.method791(local66);
		}
		if (arg1 == 3) {
			local66 = Static311.method5098(Static250.aClass341_53, Static125.aClass179_1);
			Static176.method3475(arg2, local8.anInt10396, arg3, local66);
			Static38.method791(local66);
		}
		if (arg1 == 4) {
			local66 = Static311.method5098(Static46.aClass341_12, Static125.aClass179_1);
			Static176.method3475(arg2, local8.anInt10396, arg3, local66);
			Static38.method791(local66);
		}
		if (arg1 == 5) {
			local66 = Static311.method5098(Static669.aClass341_115, Static125.aClass179_1);
			Static176.method3475(arg2, local8.anInt10396, arg3, local66);
			Static38.method791(local66);
		}
		if (arg1 == 6) {
			local66 = Static311.method5098(Static12.aClass341_4, Static125.aClass179_1);
			Static176.method3475(arg2, local8.anInt10396, arg3, local66);
			Static38.method791(local66);
		}
		if (arg1 == 7) {
			local66 = Static311.method5098(Static577.aClass341_96, Static125.aClass179_1);
			Static176.method3475(arg2, local8.anInt10396, arg3, local66);
			Static38.method791(local66);
		}
		if (arg1 == 8) {
			local66 = Static311.method5098(Static131.aClass341_36, Static125.aClass179_1);
			Static176.method3475(arg2, local8.anInt10396, arg3, local66);
			Static38.method791(local66);
		}
		if (arg1 == 9) {
			local66 = Static311.method5098(Static626.aClass341_105, Static125.aClass179_1);
			Static176.method3475(arg2, local8.anInt10396, arg3, local66);
			Static38.method791(local66);
		}
		if (arg1 == 10) {
			local66 = Static311.method5098(Static124.aClass341_31, Static125.aClass179_1);
			Static176.method3475(arg2, local8.anInt10396, arg3, local66);
			Static38.method791(local66);
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Ljava/awt/Color;ILjava/awt/Color;ILjava/awt/Color;Ljava/lang/String;)V")
	public static void method3195(@OriginalArg(0) Color arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Color arg2, @OriginalArg(4) Color arg3, @OriginalArg(5) String arg4) {
		try {
			@Pc(2) Graphics local2 = Static641.aCanvas13.getGraphics();
			if (Static368.aFont2 == null) {
				Static368.aFont2 = new Font("Helvetica", 1, 13);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(255, 255, 255);
			}
			@Pc(73) int local73;
			try {
				if (Static458.anImage12 == null) {
					Static458.anImage12 = Static641.aCanvas13.createImage(Static406.anInt7570, Static19.anInt352);
				}
				@Pc(48) Graphics local48 = Static458.anImage12.getGraphics();
				local48.setColor(Color.black);
				local48.fillRect(0, 0, Static406.anInt7570, Static19.anInt352);
				local73 = Static406.anInt7570 / 2 - 152;
				@Pc(79) int local79 = Static19.anInt352 / 2 - 18;
				local48.setColor(arg2);
				local48.drawRect(local73, local79, 303, 33);
				local48.setColor(arg0);
				local48.fillRect(local73 + 2, local79 + 2, arg1 * 3, 30);
				local48.setColor(Color.black);
				local48.drawRect(local73 + 1, local79 + 1, 301, 31);
				local48.fillRect(local73 + arg1 * 3 + 2, local79 + 2, 300 - arg1 * 3, 30);
				local48.setFont(Static368.aFont2);
				local48.setColor(arg3);
				local48.drawString(arg4, (304 - arg4.length() * 6) / 2 + local73, local79 + 22);
				if (Static168.aString46 != null) {
					local48.setFont(Static368.aFont2);
					local48.setColor(arg3);
					local48.drawString(Static168.aString46, Static406.anInt7570 / 2 - Static168.aString46.length() * 6 / 2, Static19.anInt352 / 2 + -26);
				}
				local2.drawImage(Static458.anImage12, 0, 0, (ImageObserver) null);
			} catch (@Pc(194) Exception local194) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static406.anInt7570, Static19.anInt352);
				@Pc(209) int local209 = Static406.anInt7570 / 2 - 152;
				local73 = Static19.anInt352 / 2 - 18;
				local2.setColor(arg2);
				local2.drawRect(local209, local73, 303, 33);
				local2.setColor(arg0);
				local2.fillRect(local209 + 2, local73 + 2, arg1 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local209 + 1, local73 - -1, 301, 31);
				local2.fillRect(arg1 * 3 + local209 + 2, local73 + 2, 300 - arg1 * 3, 30);
				local2.setFont(Static368.aFont2);
				local2.setColor(arg3);
				if (Static168.aString46 != null) {
					local2.setFont(Static368.aFont2);
					local2.setColor(arg3);
					local2.drawString(Static168.aString46, Static406.anInt7570 / 2 - Static168.aString46.length() * 6 / 2, Static19.anInt352 / 2 + -26);
				}
				local2.drawString(arg4, (304 - arg4.length() * 6) / 2 + local209, local73 + 22);
			}
		} catch (@Pc(323) Exception local323) {
			Static641.aCanvas13.repaint();
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IC)C")
	public static char method3197(@OriginalArg(1) char arg0) {
		if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
			return '_';
		} else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
			return arg0;
		} else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
			return 'a';
		} else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
			return 'e';
		} else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
			return 'i';
		} else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
			return 'o';
		} else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
			return 'u';
		} else if (arg0 == 'ç' || arg0 == 'Ç') {
			return 'c';
		} else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
			return 'y';
		} else if (arg0 == 'ñ' || arg0 == 'Ñ') {
			return 'n';
		} else if (arg0 == 'ß') {
			return 'b';
		} else {
			return Character.toLowerCase(arg0);
		}
	}
}
