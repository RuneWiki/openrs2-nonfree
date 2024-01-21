import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!cj", name = "db", descriptor = "Lclient!lc;")
	public static Class56 aClass56_2;

	@OriginalMember(owner = "client!cj", name = "gb", descriptor = "[Lclient!ah;")
	public static Class3_Sub3_Sub2_Sub1[] aClass3_Sub3_Sub2_Sub1Array1;

	@OriginalMember(owner = "client!cj", name = "nb", descriptor = "[Lclient!ah;")
	public static Class3_Sub3_Sub2_Sub1[] aClass3_Sub3_Sub2_Sub1Array2;

	@OriginalMember(owner = "client!cj", name = "Z", descriptor = "I")
	public static int anInt601 = 0;

	@OriginalMember(owner = "client!cj", name = "ab", descriptor = "[Lclient!ed;")
	public static final Class27[] aClass27Array1 = new Class27[6];

	@OriginalMember(owner = "client!cj", name = "ib", descriptor = "I")
	public static int anInt607 = 0;

	@OriginalMember(owner = "client!cj", name = "jb", descriptor = "[[[Lclient!bd;")
	public static final Class10[][][] aClass10ArrayArrayArray1 = new Class10[4][104][104];

	@OriginalMember(owner = "client!cj", name = "kb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_304 = Static193.method3027("Bitte geben Sie Ihren Benutzernamen ein)3");

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZLclient!oc;Ljava/awt/Color;II)V")
	public static void method512(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class70 arg1, @OriginalArg(2) Color arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(2) Graphics local2 = Static211.aCanvas1.getGraphics();
			if (Static117.aFont1 == null) {
				Static117.aFont1 = new Font("Helvetica", 1, 13);
				Static201.aFontMetrics1 = Static211.aCanvas1.getFontMetrics(Static117.aFont1);
			}
			if (arg0) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static41.anInt876, Static203.anInt4148);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			try {
				if (Static163.anImage4 == null) {
					Static163.anImage4 = Static211.aCanvas1.createImage(304, 34);
				}
				@Pc(45) Graphics local45 = Static163.anImage4.getGraphics();
				local45.setColor(arg2);
				local45.drawRect(0, 0, 303, 33);
				local45.fillRect(2, 2, arg3 * 3, 30);
				local45.setColor(Color.black);
				local45.drawRect(1, 1, 301, 31);
				local45.fillRect(arg3 * 3 + 2, 2, 300 - arg3 * 3, 30);
				local45.setFont(Static117.aFont1);
				local45.setColor(Color.white);
				arg1.method2034((304 - arg1.method2030(Static201.aFontMetrics1)) / 2, 22, local45);
				local2.drawImage(Static163.anImage4, Static41.anInt876 / 2 - 152, Static203.anInt4148 / 2 - 18, null);
			} catch (@Pc(123) Exception local123) {
				@Pc(129) int local129 = Static41.anInt876 / 2 - 152;
				@Pc(135) int local135 = Static203.anInt4148 / 2 - 18;
				local2.setColor(arg2);
				local2.drawRect(local129, local135, 303, 33);
				local2.fillRect(local129 + 2, local135 + 2, arg3 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local129 + 1, local135 - -1, 301, 31);
				local2.fillRect(arg3 * 3 + local129 + 2, local135 - -2, 300 - arg3 * 3, 30);
				local2.setFont(Static117.aFont1);
				local2.setColor(Color.white);
				arg1.method2034((304 - arg1.method2030(Static201.aFontMetrics1)) / 2 + local129, local135 + 22, local2);
			}
		} catch (@Pc(214) Exception local214) {
			Static211.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!cj", name = "d", descriptor = "(I)V")
	public static void method514() {
		Static50.aBoolean66 = false;
		Static91.aBoolean97 = false;
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(BI)V")
	public static void method515(@OriginalArg(1) int arg0) {
		if (arg0 == Static15.anInt351) {
			return;
		}
		if (Static15.anInt351 == 0) {
			Static92.method1357();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static14.anInt325 = 0;
			Static49.anInt997 = 0;
			Static192.anInt3914 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static54.aClass33_1 != null) {
			Static54.aClass33_1.method925();
			Static54.aClass33_1 = null;
		}
		if (Static15.anInt351 == 25) {
			Static182.anInt3726 = 1;
			Static6.anInt117 = 0;
			Static58.anInt1270 = 0;
			Static186.anInt3809 = 0;
			Static40.anInt858 = 1;
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static161.method2423(Static211.aCanvas1, Static118.aClass52_Sub1_19, Static138.aClass52_Sub1_20);
		} else {
			Static151.method2217();
		}
		Static15.anInt351 = arg0;
	}
}
