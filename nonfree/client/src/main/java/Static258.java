import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static258 {

	@OriginalMember(owner = "client!mi", name = "y", descriptor = "F")
	public static float aFloat60;

	@OriginalMember(owner = "client!mi", name = "G", descriptor = "I")
	public static int anInt4312;

	@OriginalMember(owner = "client!mi", name = "E", descriptor = "I")
	public static final int anInt4311 = 2;

	@OriginalMember(owner = "client!mi", name = "F", descriptor = "Lclient!la;")
	public static final Class136 aClass136_126 = new Class136(14, -2);

	@OriginalMember(owner = "client!mi", name = "H", descriptor = "I")
	public static int anInt4313 = -1;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(BLclient!uu;Lclient!qa;)V")
	public static void method3604(@OriginalArg(1) Class250 arg0, @OriginalArg(2) Class167 arg1) {
		if (Static444.aBoolean429) {
			return;
		}
		arg1.l(0);
		Static400.aClass2_17 = arg1.method5993(Static467.method3620(arg0, Static233.anInt3997));
		Static400.aClass2_17.method5829((Static310.anInt5307 - Static400.aClass2_17.d()) / 2, (Static166.anInt3014 - Static400.aClass2_17.ga()) / 2);
		Static322.aClass2_11 = arg1.method5993(Static467.method3620(arg0, Static244.anInt4146));
		Static322.aClass2_11.method5829((Static310.anInt5307 - Static322.aClass2_11.d()) / 2, 18);
		Static444.aBoolean429 = true;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(BLjava/awt/Component;)Lclient!lv;")
	public static Class143 method3605(@OriginalArg(1) Component arg0) {
		return new Class143_Sub1(arg0);
	}
}
