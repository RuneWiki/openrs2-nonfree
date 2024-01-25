import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "[Lclient!cw;")
	public static Class61[] aClass61Array9;

	@OriginalMember(owner = "client!iha", name = "j", descriptor = "I")
	public static int anInt3828;

	@OriginalMember(owner = "client!iha", name = "f", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_140 = new Class288(34, -2);

	@OriginalMember(owner = "client!iha", name = "g", descriptor = "[I")
	public static int[] anIntArray267 = new int[2];

	@OriginalMember(owner = "client!iha", name = "l", descriptor = "Z")
	public static boolean aBoolean275 = false;

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(III)I")
	public static int method3208(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg1 - 1 & arg0 >> 31;
		return ((arg0 >>> 31) + arg0) % arg1 + local11;
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(Lclient!kp;B)I")
	public static int method3209(@OriginalArg(0) Class2_Sub2_Sub12 arg0) {
		@Pc(12) String local12 = Static173.method8451(arg0);
		return Static228.aClass256_7.method5540(local12, Static140.aClass61Array4);
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(Z)V")
	public static void method3210() {
		@Pc(7) client local7 = Static78.aClient1;
		synchronized (Static78.aClient1) {
			if (Static298.aFrame3 == null) {
				@Pc(20) Container local20;
				if (Static202.aFrame2 != null) {
					local20 = Static202.aFrame2;
				} else if (Static617.anApplet2 == null) {
					local20 = Static263.anApplet_Sub1_1;
				} else {
					local20 = Static617.anApplet2;
				}
				Static550.anInt9024 = local20.getSize().width;
				anInt3828 = local20.getSize().height;
				@Pc(47) Insets local47;
				if (Static202.aFrame2 == local20) {
					local47 = Static202.aFrame2.getInsets();
					Static550.anInt9024 -= local47.right + local47.left;
					anInt3828 -= local47.top + local47.bottom;
				}
				if (Static626.method8388() == 1) {
					Static511.anInt8548 = Static66.anInt10099;
					Static223.anInt3639 = 0;
					Static394.anInt6214 = (Static550.anInt9024 - Static66.anInt10099) / 2;
					Static153.anInt2747 = Static364.anInt5763;
				} else {
					Static332.method4473();
				}
				if (Static252.aClass80_3 != Static162.aClass80_2) {
					@Pc(98) boolean local98;
					if (Static511.anInt8548 < 1024 && Static153.anInt2747 < 768) {
						local98 = true;
					} else {
						local98 = false;
					}
				}
				Static504.aCanvas11.setSize(Static511.anInt8548, Static153.anInt2747);
				if (Static192.aClass95_4 != null) {
					if (Static319.aBoolean356) {
						Static203.method2860(Static504.aCanvas11);
					} else {
						Static192.aClass95_4.method6950(Static504.aCanvas11, Static511.anInt8548, Static153.anInt2747);
					}
				}
				if (Static202.aFrame2 == local20) {
					local47 = Static202.aFrame2.getInsets();
					Static504.aCanvas11.setLocation(local47.left + Static394.anInt6214, local47.top + Static223.anInt3639);
				} else {
					Static504.aCanvas11.setLocation(Static394.anInt6214, Static223.anInt3639);
				}
				if (Static38.anInt777 != -1) {
					Static311.method4222(true);
				}
				Static130.method1828();
			}
		}
	}
}
