import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!pc", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString83;

	@OriginalMember(owner = "client!pc", name = "r", descriptor = "I")
	public static int anInt6972;

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "Lclient!lga;")
	public static final Class207 aClass207_44 = new Class207(10);

	@OriginalMember(owner = "client!pc", name = "t", descriptor = "[I")
	public static final int[] anIntArray410 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILjava/awt/Color;Ljava/awt/Color;Ljava/lang/String;ILjava/awt/Color;)V")
	public static void method5627(@OriginalArg(0) int arg0, @OriginalArg(1) Color arg1, @OriginalArg(2) Color arg2, @OriginalArg(3) String arg3, @OriginalArg(5) Color arg4) {
		try {
			@Pc(6) Graphics local6 = Static103.aCanvas2.getGraphics();
			if (Static437.aFont2 == null) {
				Static437.aFont2 = new Font("Helvetica", 1, 13);
			}
			if (arg4 == null) {
				arg4 = new Color(140, 17, 17);
			}
			if (arg1 == null) {
				arg1 = new Color(140, 17, 17);
			}
			if (arg2 == null) {
				arg2 = new Color(255, 255, 255);
			}
			@Pc(67) int local67;
			try {
				if (Static242.anImage12 == null) {
					Static242.anImage12 = Static103.aCanvas2.createImage(Static349.anInt6422, Static594.anInt9806);
				}
				@Pc(52) Graphics local52 = Static242.anImage12.getGraphics();
				local52.setColor(Color.black);
				local52.fillRect(0, 0, Static349.anInt6422, Static594.anInt9806);
				local67 = Static349.anInt6422 / 2 - 152;
				@Pc(73) int local73 = Static594.anInt9806 / 2 - 18;
				local52.setColor(arg1);
				local52.drawRect(local67, local73, 303, 33);
				local52.setColor(arg4);
				local52.fillRect(local67 + 2, local73 + 2, arg0 * 3, 30);
				local52.setColor(Color.black);
				local52.drawRect(local67 + 1, local73 - -1, 301, 31);
				local52.fillRect(arg0 * 3 + local67 + 2, local73 + 2, 300 - arg0 * 3, 30);
				local52.setFont(Static437.aFont2);
				local52.setColor(arg2);
				local52.drawString(arg3, local67 + (304 - arg3.length() * 6) / 2, local73 + 22);
				if (Static231.aString50 != null) {
					local52.setFont(Static437.aFont2);
					local52.setColor(arg2);
					local52.drawString(Static231.aString50, Static349.anInt6422 / 2 - Static231.aString50.length() * 6 / 2, Static594.anInt9806 / 2 + -26);
				}
				local6.drawImage(Static242.anImage12, 0, 0, null);
			} catch (@Pc(189) Exception local189) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static349.anInt6422, Static594.anInt9806);
				@Pc(204) int local204 = Static349.anInt6422 / 2 - 152;
				local67 = Static594.anInt9806 / 2 - 18;
				local6.setColor(arg1);
				local6.drawRect(local204, local67, 303, 33);
				local6.setColor(arg4);
				local6.fillRect(local204 + 2, local67 + 2, arg0 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local204 + 1, local67 - -1, 301, 31);
				local6.fillRect(local204 + arg0 * 3 + 2, local67 + 2, 300 - arg0 * 3, 30);
				local6.setFont(Static437.aFont2);
				local6.setColor(arg2);
				if (Static231.aString50 != null) {
					local6.setFont(Static437.aFont2);
					local6.setColor(arg2);
					local6.drawString(Static231.aString50, Static349.anInt6422 / 2 - Static231.aString50.length() * 6 / 2, Static594.anInt9806 / 2 + -26);
				}
				local6.drawString(arg3, (304 - arg3.length() * 6) / 2 + local204, local67 + 22);
			}
		} catch (@Pc(317) Exception local317) {
			Static103.aCanvas2.repaint();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([Lclient!f;I)V")
	public static void method5629(@OriginalArg(0) Class5[] arg0) {
		Static73.anInt1422 = arg0.length;
		Static230.anIntArray218 = new int[Static73.anInt1422 + 10];
		Static519.aClass5Array19 = new Class5[Static73.anInt1422 + 10];
		Static598.method773(arg0, 0, Static519.aClass5Array19, 0, Static73.anInt1422);
		for (@Pc(31) int local31 = 0; local31 < Static73.anInt1422; local31++) {
			Static230.anIntArray218[local31] = Static519.aClass5Array19[local31].ca();
		}
		for (@Pc(46) int local46 = Static73.anInt1422; local46 < Static519.aClass5Array19.length; local46++) {
			Static230.anIntArray218[local46] = 12;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!ks;IB)V")
	public static void method5630(@OriginalArg(0) Class197 arg0, @OriginalArg(1) int arg1) {
		if (Static439.anInt8379 >= 50 || (arg0 == null || arg0.anIntArrayArray24 == null || arg0.anIntArrayArray24.length <= arg1 || arg0.anIntArrayArray24[arg1] == null)) {
			return;
		}
		@Pc(32) int local32 = arg0.anIntArrayArray24[arg1][0];
		@Pc(41) int local41 = local32 >> 8;
		@Pc(60) int local60;
		if (arg0.anIntArrayArray24[arg1].length > 1) {
			local60 = (int) (Math.random() * (double) arg0.anIntArrayArray24[arg1].length);
			if (local60 > 0) {
				local41 = arg0.anIntArrayArray24[arg1][local60];
			}
		}
		@Pc(78) int local78 = local32 >> 5 & 0x7;
		local60 = 256;
		if (arg0.anIntArray283 != null && arg0.anIntArray282 != null) {
			local60 = Static5.method85(arg0.anIntArray283[arg1], arg0.anIntArray282[arg1]);
		}
		if (arg0.aBoolean386) {
			Static17.method396(local60, local78, false, local41, 255, 0);
		} else {
			Static485.method6697(0, 255, local78, local60, local41);
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
	public static void method5631() {
		try {
			@Pc(17) int local17;
			if (Static2.anInt71 == 1) {
				local17 = Static54.aClass1_Sub6_Sub2_2.method3518();
				if (local17 > 0 && Static54.aClass1_Sub6_Sub2_2.method3531()) {
					local17 -= Static23.anInt578;
					if (local17 < 0) {
						local17 = 0;
					}
					Static54.aClass1_Sub6_Sub2_2.method3512(local17);
					return;
				}
				Static54.aClass1_Sub6_Sub2_2.method3527();
				Static54.aClass1_Sub6_Sub2_2.method3502();
				Static145.aClass257_1 = null;
				if (Static148.aClass308_59 == null) {
					Static2.anInt71 = 0;
				} else {
					Static2.anInt71 = 2;
				}
				Static394.aClass1_Sub36_2 = null;
			}
			if (Static2.anInt71 == 3) {
				local17 = Static54.aClass1_Sub6_Sub2_2.method3518();
				if (local17 < Static429.anInt7683 && Static54.aClass1_Sub6_Sub2_2.method3531()) {
					local17 += Static556.anInt9256;
					if (local17 > Static429.anInt7683) {
						local17 = Static429.anInt7683;
					}
					Static54.aClass1_Sub6_Sub2_2.method3512(local17);
				} else {
					Static2.anInt71 = 0;
					Static556.anInt9256 = 0;
				}
			}
		} catch (@Pc(97) Exception local97) {
			local97.printStackTrace();
			Static54.aClass1_Sub6_Sub2_2.method3527();
			Static394.aClass1_Sub36_2 = null;
			Static145.aClass257_1 = null;
			Static148.aClass308_59 = null;
			Static144.aClass1_Sub6_Sub2_4 = null;
			Static2.anInt71 = 0;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZLjava/lang/String;II)V")
	public static void method5632(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static411.method5861(arg0, arg2, arg1, null, false, arg3);
	}
}
