import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!mu", name = "u", descriptor = "[I")
	public static int[] anIntArray398;

	@OriginalMember(owner = "client!mu", name = "w", descriptor = "Lclient!mv;")
	public static Class229 aClass229_83;

	@OriginalMember(owner = "client!mu", name = "j", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_97 = new Class349(82, 1);

	@OriginalMember(owner = "client!mu", name = "p", descriptor = "I")
	public static int anInt5888 = 1;

	@OriginalMember(owner = "client!mu", name = "s", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_72 = new Class154(20, 7);

	@OriginalMember(owner = "client!mu", name = "t", descriptor = "Lclient!nb;")
	public static final Class232 aClass232_14 = new Class232("LIVE", 0);

	@OriginalMember(owner = "client!mu", name = "v", descriptor = "I")
	public static int anInt5890 = -1;

	@OriginalMember(owner = "client!mu", name = "d", descriptor = "(I)V")
	public static void method4948() {
		if (Static43.aFrame1 != null) {
			return;
		}
		@Pc(19) Container local19;
		if (Static223.aFrame2 != null) {
			local19 = Static223.aFrame2;
		} else if (Static195.anApplet4 == null) {
			local19 = Static414.anApplet_Sub1_1;
		} else {
			local19 = Static195.anApplet4;
		}
		Static441.anInt7086 = local19.getSize().width;
		Static222.anInt3250 = local19.getSize().height;
		@Pc(41) Insets local41;
		if (local19 == Static223.aFrame2) {
			local41 = Static223.aFrame2.getInsets();
			Static441.anInt7086 -= local41.left + local41.right;
			Static222.anInt3250 -= local41.bottom + local41.top;
		}
		if (Static480.method6206() == 1) {
			Static107.anInt1866 = 0;
			Static172.anInt2621 = Static14.anInt330;
			Static8.anInt227 = (Static441.anInt7086 - Static14.anInt330) / 2;
			Static187.anInt8962 = Static370.anInt6187;
		} else {
			Static544.method7111();
		}
		if (aClass232_14 != Static416.aClass232_7) {
			@Pc(91) boolean local91;
			if (Static172.anInt2621 < 1024 && Static187.anInt8962 < 768) {
				local91 = true;
			} else {
				local91 = false;
			}
		}
		Static9.aCanvas1.setSize(Static172.anInt2621, Static187.anInt8962);
		if (Static417.aClass162_17 != null) {
			Static417.aClass162_17.method6831(Static9.aCanvas1);
		}
		if (local19 == Static223.aFrame2) {
			local41 = Static223.aFrame2.getInsets();
			Static9.aCanvas1.setLocation(Static8.anInt227 + local41.left, Static107.anInt1866 + local41.top);
		} else {
			Static9.aCanvas1.setLocation(Static8.anInt227, Static107.anInt1866);
		}
		if (Static122.anInt2094 != -1) {
			Static579.method7524(true);
		}
		Static539.method7062();
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4949(@OriginalArg(0) String arg0) {
		if (Static502.aClass53Array1 != null) {
			@Pc(15) Class2_Sub34 local15 = Static555.method7264(Static70.aClass154_12, Static551.aClass64_2);
			local15.aClass2_Sub7_Sub2_2.method4459(Static474.method6143(arg0));
			local15.aClass2_Sub7_Sub2_2.method4481(arg0);
			Static100.method1508(local15);
		}
	}
}
