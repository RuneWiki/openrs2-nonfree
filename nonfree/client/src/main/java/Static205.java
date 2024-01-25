import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!gg", name = "A", descriptor = "I")
	public static int anInt3396;

	@OriginalMember(owner = "client!gg", name = "K", descriptor = "Lclient!br;")
	public static Class47 aClass47_2;

	@OriginalMember(owner = "client!gg", name = "r", descriptor = "Lclient!jj;")
	public static Class193 aClass193_2;

	@OriginalMember(owner = "client!gg", name = "G", descriptor = "[Lclient!em;")
	public static final Class100[] aClass100Array1 = new Class100[16];

	@OriginalMember(owner = "client!gg", name = "z", descriptor = "[I")
	public static int[] anIntArray236 = new int[1];

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(B)V")
	public static void method3103() {
		for (@Pc(13) Class3_Sub7_Sub5 local13 = (Class3_Sub7_Sub5) Static242.aClass147_2.method3334(); local13 != null; local13 = (Class3_Sub7_Sub5) Static242.aClass147_2.method3332()) {
			if (local13.anInt2315 > 1) {
				local13.anInt2315 = 0;
				Static365.aClass307_60.method7000(local13, ((Class3_Sub7_Sub10) local13.aClass147_1.aClass3_Sub7_28.aClass3_Sub7_67).aLong144);
				local13.aClass147_1.method3331();
			}
		}
		Static716.anInt11158 = 0;
		Static239.anInt3802 = 0;
		Static419.aClass342_81.method7655();
		Static158.aClass313_15.method7101();
		Static242.aClass147_2.method3331();
		Static190.method9220(Static377.aClass3_Sub7_Sub10_1);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
	public static void method3108() {
		@Pc(7) client local7 = Static459.aClient1;
		synchronized (Static459.aClient1) {
			if (Static702.aFrame3 == null) {
				@Pc(22) Container local22;
				if (Static628.aFrame2 != null) {
					local22 = Static628.aFrame2;
				} else if (Static41.anApplet1 == null) {
					local22 = Static229.anApplet_Sub1_1;
				} else {
					local22 = Static41.anApplet1;
				}
				Static91.anInt2083 = local22.getSize().width;
				Static342.anInt5491 = local22.getSize().height;
				@Pc(44) Insets local44;
				if (Static628.aFrame2 == local22) {
					local44 = Static628.aFrame2.getInsets();
					Static342.anInt5491 -= local44.top + local44.bottom;
					Static91.anInt2083 -= local44.right + local44.left;
				}
				if (Static276.method3880(3) == 1) {
					Static251.anInt3914 = (Static91.anInt2083 - Static221.anInt3616) / 2;
					Static76.anInt1720 = Static700.anInt10927;
					Static388.anInt5985 = 0;
					Static681.anInt10652 = Static221.anInt3616;
				} else {
					Static401.method5417();
				}
				if (Static286.aClass379_8 != Static416.aClass379_6) {
					@Pc(105) boolean local105;
					if (Static681.anInt10652 < 1024 && Static76.anInt1720 < 768) {
						local105 = true;
					} else {
						local105 = false;
					}
				}
				Static508.aCanvas8.setSize(Static681.anInt10652, Static76.anInt1720);
				if (Static153.aClass22_4 != null) {
					if (Static347.aBoolean360) {
						Static308.method4569(Static508.aCanvas8);
					} else {
						Static153.aClass22_4.method9401(Static508.aCanvas8, Static681.anInt10652, Static76.anInt1720);
					}
				}
				if (local22 == Static628.aFrame2) {
					local44 = Static628.aFrame2.getInsets();
					Static508.aCanvas8.setLocation(Static251.anInt3914 + local44.left, Static388.anInt5985 + local44.top);
				} else {
					Static508.aCanvas8.setLocation(Static251.anInt3914, Static388.anInt5985);
				}
				if (Static589.anInt8959 != -1) {
					Static614.method7866(true);
				}
				Static598.method7697();
			}
		}
	}
}
