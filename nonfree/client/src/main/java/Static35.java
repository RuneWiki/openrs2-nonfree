import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
	public static int anInt1011;

	@OriginalMember(owner = "client!dd", name = "t", descriptor = "[I")
	public static final int[] anIntArray96 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "([Lclient!oc;B)[Lclient!oc;")
	public static Class65[] method667(@OriginalArg(0) Class65[] arg0) {
		@Pc(8) Class65[] local8 = new Class65[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = Static109.method2004(new Class65[] { Static118.method2250(local10), Static155.aClass65_2071 });
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = Static109.method2004(new Class65[] { local8[local10], arg0[local10] });
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V")
	public static void method669() {
		for (@Pc(14) int local14 = 0; local14 < Static95.anInt2376; local14++) {
			@Pc(19) int local19 = Static191.anIntArray474[local14];
			@Pc(23) Class6_Sub4_Sub2 local23 = Static106.aClass6_Sub4_Sub2Array1[local19];
			@Pc(27) int local27 = Static1.aClass1_Sub14_Sub1_43.method1738();
			if ((local27 & 0x2) != 0) {
				local23.aClass65_2377 = Static1.aClass1_Sub14_Sub1_43.method1706();
				local23.anInt3973 = 100;
			}
			@Pc(55) int local55;
			if ((local27 & 0x80) != 0) {
				local23.anInt3964 = Static1.aClass1_Sub14_Sub1_43.method1704();
				local55 = Static1.aClass1_Sub14_Sub1_43.method1705();
				local23.anInt3935 = 0;
				local23.anInt3960 = local55 >> 16;
				local23.anInt3983 = Static174.anInt3887 + (local55 & 0xFFFF);
				local23.anInt3977 = 0;
				if (local23.anInt3964 == 65535) {
					local23.anInt3964 = -1;
				}
				if (Static174.anInt3887 < local23.anInt3983) {
					local23.anInt3977 = -1;
				}
			}
			@Pc(105) int local105;
			if ((local27 & 0x40) != 0) {
				local55 = Static1.aClass1_Sub14_Sub1_43.method1722();
				local105 = Static1.aClass1_Sub14_Sub1_43.method1722();
				local23.method2993(Static174.anInt3887, local55, local105);
				local23.anInt3985 = Static174.anInt3887 + 300;
				local23.anInt3941 = Static1.aClass1_Sub14_Sub1_43.method1722();
			}
			if ((local27 & 0x8) != 0) {
				local55 = Static1.aClass1_Sub14_Sub1_43.method1749();
				if (local55 == 65535) {
					local55 = -1;
				}
				local105 = Static1.aClass1_Sub14_Sub1_43.method1738();
				if (local55 == local23.anInt3945 && local55 != -1) {
					@Pc(211) Class1_Sub2_Sub14 local211 = Static173.method2924(local55);
					@Pc(214) int local214 = local211.anInt2493;
					if (local214 == 1) {
						local23.anInt3986 = 0;
						local23.anInt3956 = local105;
						local23.anInt3970 = 0;
						local23.anInt3968 = 0;
						Static18.method348(local211, local23.anInt3976, local23.anInt3934, false, local23.anInt3968);
					}
					if (local214 == 2) {
						local23.anInt3986 = 0;
					}
				} else if (local55 == -1 || local23.anInt3945 == -1 || Static173.method2924(local55).anInt2501 >= Static173.method2924(local23.anInt3945).anInt2501) {
					local23.anInt3968 = 0;
					local23.anInt3953 = local23.anInt3951;
					local23.anInt3970 = 0;
					local23.anInt3956 = local105;
					local23.anInt3986 = 0;
					local23.anInt3945 = local55;
					if (local23.anInt3945 != -1) {
						Static18.method348(Static173.method2924(local23.anInt3945), local23.anInt3976, local23.anInt3934, false, local23.anInt3968);
					}
				}
			}
			if ((local27 & 0x1) != 0) {
				local23.aClass1_Sub2_Sub11_1 = Static114.method2108(Static1.aClass1_Sub14_Sub1_43.method1749());
				local23.anInt3972 = local23.aClass1_Sub2_Sub11_1.anInt1583;
				local23.anInt3954 = local23.aClass1_Sub2_Sub11_1.anInt1603;
				local23.anInt3939 = local23.aClass1_Sub2_Sub11_1.anInt1600;
				local23.anInt3930 = local23.aClass1_Sub2_Sub11_1.anInt1587;
				local23.anInt3969 = local23.aClass1_Sub2_Sub11_1.anInt1578;
				local23.anInt3959 = local23.aClass1_Sub2_Sub11_1.anInt1595;
				local23.anInt3938 = local23.aClass1_Sub2_Sub11_1.anInt1590;
				local23.anInt3932 = local23.aClass1_Sub2_Sub11_1.anInt1592;
				local23.anInt3981 = local23.aClass1_Sub2_Sub11_1.anInt1593;
			}
			if ((local27 & 0x4) != 0) {
				local55 = Static1.aClass1_Sub14_Sub1_43.method1738();
				local105 = Static1.aClass1_Sub14_Sub1_43.method1722();
				local23.method2993(Static174.anInt3887, local55, local105);
			}
			if ((local27 & 0x20) != 0) {
				local23.anInt3966 = Static1.aClass1_Sub14_Sub1_43.method1715();
				local23.anInt3944 = Static1.aClass1_Sub14_Sub1_43.method1704();
			}
			if ((local27 & 0x10) != 0) {
				local23.anInt3928 = Static1.aClass1_Sub14_Sub1_43.method1749();
				if (local23.anInt3928 == 65535) {
					local23.anInt3928 = -1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZLclient!oc;Ljava/awt/Color;BI)V")
	public static void method670(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class65 arg1, @OriginalArg(2) Color arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(2) Graphics local2 = Static36.aCanvas1.getGraphics();
			if (Static50.aFont2 == null) {
				Static50.aFont2 = new Font("Helvetica", 1, 13);
				Static11.aFontMetrics1 = Static36.aCanvas1.getFontMetrics(Static50.aFont2);
			}
			if (arg0) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static176.anInt3920, Static33.anInt972);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			try {
				if (Static139.anImage4 == null) {
					Static139.anImage4 = Static36.aCanvas1.createImage(304, 34);
				}
				@Pc(45) Graphics local45 = Static139.anImage4.getGraphics();
				local45.setColor(arg2);
				local45.drawRect(0, 0, 303, 33);
				local45.fillRect(2, 2, arg3 * 3, 30);
				local45.setColor(Color.black);
				local45.drawRect(1, 1, 301, 31);
				local45.fillRect(arg3 * 3 + 2, 2, 300 - arg3 * 3, 30);
				local45.setFont(Static50.aFont2);
				local45.setColor(Color.white);
				arg1.method2450(local45, (304 - arg1.method2476(Static11.aFontMetrics1)) / 2, 22);
				local2.drawImage(Static139.anImage4, Static176.anInt3920 / 2 - 152, Static33.anInt972 / 2 + -18, null);
			} catch (@Pc(127) Exception local127) {
				@Pc(133) int local133 = Static176.anInt3920 / 2 - 152;
				@Pc(139) int local139 = Static33.anInt972 / 2 - 18;
				local2.setColor(arg2);
				local2.drawRect(local133, local139, 303, 33);
				local2.fillRect(local133 + 2, local139 + 2, arg3 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local133 + 1, local139 + 1, 301, 31);
				local2.fillRect(arg3 * 3 + local133 + 2, local139 + 2, 300 - arg3 * 3, 30);
				local2.setFont(Static50.aFont2);
				local2.setColor(Color.white);
				arg1.method2450(local2, (304 - arg1.method2476(Static11.aFontMetrics1)) / 2 + local133, local139 + 22);
			}
		} catch (@Pc(218) Exception local218) {
			Static36.aCanvas1.repaint();
		}
	}
}
