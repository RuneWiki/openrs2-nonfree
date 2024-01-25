import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static599 {

	@OriginalMember(owner = "client!sw", name = "o", descriptor = "I")
	public static int anInt9769;

	@OriginalMember(owner = "client!sw", name = "p", descriptor = "I")
	public static int anInt9773;

	@OriginalMember(owner = "client!sw", name = "g", descriptor = "F")
	public static float aFloat183;

	@OriginalMember(owner = "client!sw", name = "l", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_106 = new Class286(40, -1);

	@OriginalMember(owner = "client!sw", name = "i", descriptor = "Z")
	public static boolean aBoolean706 = false;

	@OriginalMember(owner = "client!sw", name = "s", descriptor = "Z")
	public static boolean aBoolean707 = false;

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "[I")
	public static final int[] anIntArray543 = new int[4096];

	@OriginalMember(owner = "client!sw", name = "e", descriptor = "I")
	public static int anInt9774 = 0;

	@OriginalMember(owner = "client!sw", name = "b", descriptor = "(II)Lclient!m;")
	public static Class235 method8242(@OriginalArg(0) int arg0) {
		@Pc(8) Class235[] local8 = Static108.method1951();
		for (@Pc(12) int local12 = 0; local12 < local8.length; local12++) {
			@Pc(18) Class235 local18 = local8[local12];
			if (local18.anInt6819 == arg0) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(Z)V")
	public static void method8246() {
		@Pc(7) client local7 = Static556.aClient1;
		synchronized (Static556.aClient1) {
			if (Static691.aFrame2 == null) {
				@Pc(18) Container local18;
				if (Static131.aFrame1 != null) {
					local18 = Static131.aFrame1;
				} else if (Static395.anApplet1 == null) {
					local18 = Static31.anApplet_Sub1_3;
				} else {
					local18 = Static395.anApplet1;
				}
				Static554.anInt9243 = local18.getSize().width;
				Static57.anInt8465 = local18.getSize().height;
				@Pc(44) Insets local44;
				if (Static131.aFrame1 == local18) {
					local44 = Static131.aFrame1.getInsets();
					Static57.anInt8465 -= local44.bottom + local44.top;
					Static554.anInt9243 -= local44.left + local44.right;
				}
				if (Static502.method7210() == 1) {
					Static676.anInt10698 = (Static554.anInt9243 - Static347.anInt2639) / 2;
					Static575.anInt9435 = Static347.anInt2639;
					Static272.anInt5005 = Static426.anInt7511;
					Static306.anInt5502 = 0;
				} else {
					Static160.method2555();
				}
				if (Static364.aClass371_4 != Static487.aClass371_7) {
					@Pc(102) boolean local102;
					if (Static575.anInt9435 < 1024 && Static272.anInt5005 < 768) {
						local102 = true;
					} else {
						local102 = false;
					}
				}
				Static67.aCanvas1.setSize(Static575.anInt9435, Static272.anInt5005);
				if (Static488.aClass67_12 != null) {
					if (Static178.aBoolean264) {
						Static491.method7117(Static67.aCanvas1);
					} else {
						Static488.aClass67_12.method7631(Static67.aCanvas1, Static575.anInt9435, Static272.anInt5005);
					}
				}
				if (local18 == Static131.aFrame1) {
					local44 = Static131.aFrame1.getInsets();
					Static67.aCanvas1.setLocation(local44.left + Static676.anInt10698, Static306.anInt5502 + local44.top);
				} else {
					Static67.aCanvas1.setLocation(Static676.anInt10698, Static306.anInt5502);
				}
				if (Static633.anInt3426 != -1) {
					Static401.method6009(true);
				}
				Static458.method6794();
			}
		}
	}
}
