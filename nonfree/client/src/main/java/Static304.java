import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!pg", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString54 = null;

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "(I)V")
	public static void method3972() {
		Static445.anIntArray561 = null;
		Static427.anIntArray230 = null;
		Static428.anIntArray541 = null;
		Static54.anIntArray92 = null;
		Static82.aBoolean108 = false;
		Static329.anIntArray430 = null;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIIIZ)V")
	public static void method3974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5) {
		Static131.anInt2368 = arg3;
		Static133.anInt2434 = arg4;
		Static64.anInt1159 = arg0;
		Static199.anInt3572 = arg2;
		Static3.anInt49 = arg1;
		if (arg5 && Static199.anInt3572 >= 100) {
			Static393.anInt7135 = Static131.anInt2368 * 128 + 64;
			Static235.anInt4004 = Static64.anInt1159 * 128 + 64;
			Static222.anInt3814 = Static94.method4425(Static393.anInt7135, Static68.anInt1387, Static235.anInt4004) - Static133.anInt2434;
		}
		Static97.anInt1791 = 2;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!ya;IIIILclient!ho;)V")
	public static void method3975(@OriginalArg(0) Class135 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class114 arg4) {
		@Pc(15) Class194 local15 = Static357.aClass122_3.method2324(arg4.anInt2866);
		if (local15.anInt4888 == -1) {
			return;
		}
		if (arg4.aBoolean203) {
			@Pc(29) int local29 = arg1 + arg4.anInt2865;
			arg1 = local29 & 0x3;
		} else {
			arg1 = 0;
		}
		@Pc(45) Class95 local45 = local15.method3883(arg0, arg1, arg4.aBoolean204);
		if (local45 == null) {
			return;
		}
		@Pc(51) int local51 = arg4.anInt2851;
		@Pc(54) int local54 = arg4.anInt2857;
		if ((arg1 & 0x1) == 1) {
			local54 = arg4.anInt2851;
			local51 = arg4.anInt2857;
		}
		@Pc(68) int local68 = local45.j();
		@Pc(71) int local71 = local45.T();
		if (local15.aBoolean356) {
			local68 = local51 * 4;
			local71 = local54 * 4;
		}
		if (local15.anInt4891 == 0) {
			local45.method5819(arg3, arg2 - (local54 - 1) * 4, local68, local71);
		} else {
			local45.s(arg3, arg2 - (local54 - 1) * 4, local68, local71, 0, local15.anInt4891 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ljava/awt/Color;IZILjava/awt/Color;Ljava/awt/Color;Ljava/lang/String;)V")
	public static void method3976(@OriginalArg(0) Color arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Color arg3, @OriginalArg(5) Color arg4, @OriginalArg(6) String arg5) {
		try {
			@Pc(2) Graphics local2 = Static391.aCanvas5.getGraphics();
			if (Static147.aFont1 == null) {
				Static147.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg2) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static345.anInt5723, Static120.anInt2134);
			}
			if (arg4 == null) {
				arg4 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			if (arg0 == null) {
				arg0 = new Color(255, 255, 255);
			}
			try {
				if (Static244.anImage2 == null) {
					Static244.anImage2 = Static391.aCanvas5.createImage(304, 34);
				}
				@Pc(59) Graphics local59 = Static244.anImage2.getGraphics();
				local59.setColor(arg3);
				local59.drawRect(0, 0, 303, 33);
				local59.setColor(arg4);
				local59.fillRect(2, 2, arg1 * 3, 30);
				local59.setColor(Color.black);
				local59.drawRect(1, 1, 301, 31);
				local59.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
				local59.setFont(Static147.aFont1);
				local59.setColor(arg0);
				local59.drawString(arg5, (304 - arg5.length() * 6) / 2, 22);
				local2.drawImage(Static244.anImage2, Static345.anInt5723 / 2 - 152, Static120.anInt2134 / 2 + -18, null);
			} catch (@Pc(150) Exception local150) {
				@Pc(156) int local156 = Static345.anInt5723 / 2 - 152;
				@Pc(162) int local162 = Static120.anInt2134 / 2 - 18;
				local2.setColor(arg3);
				local2.drawRect(0, 0, 303, 33);
				local2.setColor(arg4);
				local2.fillRect(local156 + 2, local162 - -2, arg1 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local156 + 1, local162 + 1, 301, 31);
				local2.fillRect(local156 + arg1 * 3 + 2, local162 + 2, 300 - arg1 * 3, 30);
				local2.setFont(Static147.aFont1);
				local2.setColor(arg0);
				local2.drawString(arg5, (304 - arg5.length() * 6) / 2 + local156, local162 - -22);
			}
			if (Static281.aString41 != null) {
				local2.setFont(Static147.aFont1);
				local2.setColor(arg0);
				local2.drawString(Static281.aString41, Static345.anInt5723 / 2 - Static281.aString41.length() * 6 / 2, Static120.anInt2134 / 2 + -26);
			}
		} catch (@Pc(269) Exception local269) {
			Static391.aCanvas5.repaint();
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILclient!pc;Ljava/awt/Component;BI)Lclient!vl;")
	public static Class53 method3977(@OriginalArg(0) int arg0, @OriginalArg(1) Class196 arg1, @OriginalArg(2) Component arg2, @OriginalArg(4) int arg3) {
		if (Static145.anInt2577 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(30) Class53 local30 = (Class53) Class.forName("Class53_Sub1").getDeclaredConstructor().newInstance();
			local30.anIntArray528 = new int[(Static391.aBoolean443 ? 2 : 1) * 256];
			local30.anInt7016 = arg0;
			local30.method5635(arg2);
			local30.anInt7013 = (arg0 & 0xFFFFFC00) + 1024;
			if (local30.anInt7013 > 16384) {
				local30.anInt7013 = 16384;
			}
			local30.method5624(local30.anInt7013);
			if (Static365.anInt6046 > 0 && Static142.aClass249_1 == null) {
				Static142.aClass249_1 = new Class249();
				Static142.aClass249_1.aClass196_8 = arg1;
				arg1.method3896(Static365.anInt6046, Static142.aClass249_1);
			}
			if (Static142.aClass249_1 != null) {
				if (Static142.aClass249_1.aClass53Array1[arg3] != null) {
					throw new IllegalArgumentException();
				}
				Static142.aClass249_1.aClass53Array1[arg3] = local30;
			}
			return local30;
		} catch (@Pc(103) Throwable local103) {
			try {
				@Pc(109) Class53_Sub2 local109 = new Class53_Sub2(arg1, arg3);
				local109.anInt7016 = arg0;
				local109.anIntArray528 = new int[(Static391.aBoolean443 ? 2 : 1) * 256];
				local109.method5635(arg2);
				local109.anInt7013 = 16384;
				local109.method5624(local109.anInt7013);
				if (Static365.anInt6046 > 0 && Static142.aClass249_1 == null) {
					Static142.aClass249_1 = new Class249();
					Static142.aClass249_1.aClass196_8 = arg1;
					arg1.method3896(Static365.anInt6046, Static142.aClass249_1);
				}
				if (Static142.aClass249_1 != null) {
					if (Static142.aClass249_1.aClass53Array1[arg3] != null) {
						throw new IllegalArgumentException();
					}
					Static142.aClass249_1.aClass53Array1[arg3] = local109;
				}
				return local109;
			} catch (@Pc(179) Throwable local179) {
				return new Class53();
			}
		}
	}
}
