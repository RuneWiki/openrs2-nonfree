import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
	public static int anInt7498;

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_153 = new Class215(81, 6);

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_77 = new Class94(77, -1);

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(II[Ljava/awt/Rectangle;)V")
	public static void method6422(@OriginalArg(0) int arg0, @OriginalArg(2) Rectangle[] arg1) throws Exception_Sub1 {
		if (Static66.anInt10075 == 1) {
			Static214.aClass20_7.method7310(arg1, arg0, Static114.anInt3048, Static272.anInt5779);
		} else {
			Static214.aClass20_7.method7310(arg1, arg0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
	public static void method6424() {
		if (Static232.aFrame1 != null) {
			return;
		}
		@Pc(10) int local10 = Static57.anInt1928;
		@Pc(12) int local12 = Static110.anInt3008;
		@Pc(27) int local27 = Static584.anInt5338 - local10 - Static81.anInt2497;
		@Pc(35) int local35 = Static330.anInt6688 - local12 - Static423.anInt7984;
		if (local10 <= 0 && local27 <= 0 && local12 <= 0 && local35 <= 0) {
			return;
		}
		try {
			@Pc(61) Container local61;
			if (Static255.aFrame2 != null) {
				local61 = Static255.aFrame2;
			} else if (Static334.anApplet2 == null) {
				local61 = Static297.anApplet_Sub1_1;
			} else {
				local61 = Static334.anApplet2;
			}
			@Pc(71) int local71 = 0;
			@Pc(73) int local73 = 0;
			if (local61 == Static255.aFrame2) {
				@Pc(79) Insets local79 = Static255.aFrame2.getInsets();
				local71 = local79.left;
				local73 = local79.top;
			}
			@Pc(88) Graphics local88 = local61.getGraphics();
			local88.setColor(Color.black);
			if (local10 > 0) {
				local88.fillRect(local71, local73, local10, Static330.anInt6688);
			}
			if (local12 > 0) {
				local88.fillRect(local71, local73, Static584.anInt5338, local12);
			}
			if (local27 > 0) {
				local88.fillRect(Static584.anInt5338 + local71 - local27, local73, local27, Static330.anInt6688);
			}
			if (local35 > 0) {
				local88.fillRect(local71, Static330.anInt6688 + local73 - local35, Static584.anInt5338, local35);
				return;
			}
		} catch (@Pc(137) Exception local137) {
			return;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIZ)Ljava/lang/String;")
	public static String method6425(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		return arg1 && arg0 >= 0 ? Static302.method5354(arg0, arg1) : Integer.toString(arg0);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BI)Z")
	public static boolean method6426(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}
}
