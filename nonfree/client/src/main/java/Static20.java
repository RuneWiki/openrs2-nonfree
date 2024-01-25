import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!b", name = "Q", descriptor = "I")
	public static int anInt255;

	@OriginalMember(owner = "client!b", name = "x", descriptor = "I")
	public static int anInt242 = 0;

	@OriginalMember(owner = "client!b", name = "P", descriptor = "Lclient!cp;")
	public static final Class44 aClass44_3 = new Class44(8);

	@OriginalMember(owner = "client!b", name = "S", descriptor = "Ljava/lang/String;")
	public static String aString2 = "";

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ZLjava/awt/Frame;Lclient!mj;)V")
	public static void method223(@OriginalArg(1) Frame arg0, @OriginalArg(2) Class156 arg1) {
		while (true) {
			@Pc(6) Class133 local6 = arg1.method3637(arg0);
			while (local6.anInt3257 == 0) {
				Static37.method613(10L);
			}
			if (local6.anInt3257 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static37.method613(100L);
		}
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V")
	public static void method239() {
		for (@Pc(10) Class3_Sub7_Sub17 local10 = (Class3_Sub7_Sub17) Static182.aClass138_22.method3051(); local10 != null; local10 = (Class3_Sub7_Sub17) Static182.aClass138_22.method3050()) {
			@Pc(20) Class28_Sub1_Sub5 local20 = local10.aClass28_Sub1_Sub5_1;
			if (local20.aByte73 != Static363.anInt6170 || local20.anInt5623 < Static76.anInt1617) {
				local10.method5700();
				local20.method5068();
			} else if (Static76.anInt1617 >= local20.anInt5636) {
				if (local20.anInt5629 > 0) {
					@Pc(57) Class28_Sub1_Sub1_Sub1 local57 = Static166.aClass28_Sub1_Sub1_Sub1Array41[local20.anInt5629 - 1];
					if (local57 != null && local57.anInt5774 >= 0 && local57.anInt5774 < Static12.anInt161 * 128 && local57.anInt5766 >= 0 && local57.anInt5766 < Static44.anInt787 * 128) {
						local20.method5074(local57.anInt5774, local57.anInt5766, Static76.anInt1617, Static55.method1005(local57.anInt5766, local20.aByte73, local57.anInt5774) - local20.anInt5617);
					}
				}
				if (local20.anInt5629 < 0) {
					@Pc(106) int local106 = -local20.anInt5629 - 1;
					@Pc(117) Class28_Sub1_Sub1_Sub2 local117;
					if (Static376.anInt6265 == local106) {
						local117 = Static226.aClass28_Sub1_Sub1_Sub2_2;
					} else {
						local117 = Static308.aClass28_Sub1_Sub1_Sub2Array1[local106];
					}
					if (local117 != null && local117.anInt5774 >= 0 && local117.anInt5774 < Static12.anInt161 * 128 && local117.anInt5766 >= 0 && Static44.anInt787 * 128 > local117.anInt5766) {
						local20.method5074(local117.anInt5774, local117.anInt5766, Static76.anInt1617, Static55.method1005(local117.anInt5766, local20.aByte73, local117.anInt5774) - local20.anInt5617);
					}
				}
				local20.method5070(Static38.anInt702);
				Static202.method3149(local20, true);
			}
		}
	}
}
