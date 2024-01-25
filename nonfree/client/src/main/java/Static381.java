import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!kg;Z)I")
	public static int method3015(@OriginalArg(0) Class3_Sub1_Sub2_Sub2 arg0) {
		if (arg0.anInt9976 == 0) {
			return 0;
		}
		@Pc(61) int local61;
		@Pc(54) int local54;
		if (arg0.anInt9947 != -1) {
			@Pc(15) Class3_Sub1_Sub2_Sub2 local15 = null;
			if (arg0.anInt9947 < 32768) {
				@Pc(41) Class4_Sub45 local41 = (Class4_Sub45) Static597.aClass66_41.method1994((long) arg0.anInt9947);
				if (local41 != null) {
					local15 = local41.aClass3_Sub1_Sub2_Sub2_Sub2_2;
				}
			} else if (arg0.anInt9947 >= 32768) {
				local15 = Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[arg0.anInt9947 - 32768];
			}
			if (local15 != null) {
				local54 = arg0.anInt9925 - local15.anInt9925;
				local61 = arg0.anInt9917 - local15.anInt9917;
				if (local54 != 0 || local61 != 0) {
					arg0.method8524((int) (Math.atan2((double) local54, (double) local61) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class3_Sub1_Sub2_Sub2_Sub1) {
			@Pc(87) Class3_Sub1_Sub2_Sub2_Sub1 local87 = (Class3_Sub1_Sub2_Sub2_Sub1) arg0;
			if (local87.anInt3955 != -1 && (local87.anInt10003 == 0 || local87.anInt10002 > 0)) {
				local87.method8524(local87.anInt3955);
				local87.anInt3955 = -1;
			}
		} else if (arg0 instanceof Class3_Sub1_Sub2_Sub2_Sub2) {
			@Pc(114) Class3_Sub1_Sub2_Sub2_Sub2 local114 = (Class3_Sub1_Sub2_Sub2_Sub2) arg0;
			if (local114.anInt10012 != -1 && (local114.anInt10003 == 0 || local114.anInt10002 > 0)) {
				local54 = local114.anInt9925 - (local114.anInt10012 - Static445.anInt6949 - Static445.anInt6949) * 256;
				local61 = local114.anInt9917 - (local114.anInt10004 - Static321.anInt5000 - Static321.anInt5000) * 256;
				if (local54 != 0 || local61 != 0) {
					local114.method8524((int) (Math.atan2((double) local54, (double) local61) * 2607.5945876176133D) & 0x3FFF);
				}
				local114.anInt10012 = -1;
			}
		}
		return arg0.method8512();
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Z)V")
	public static void method3016() {
		@Pc(14) Class4_Sub27 local14;
		for (local14 = (Class4_Sub27) Static26.aClass163_13.method3639(); local14 != null; local14 = (Class4_Sub27) Static26.aClass163_13.method3640()) {
			Static320.method7631(local14, false);
		}
		for (local14 = (Class4_Sub27) Static450.aClass163_49.method3639(); local14 != null; local14 = (Class4_Sub27) Static450.aClass163_49.method3640()) {
			Static320.method7631(local14, true);
		}
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(B)V")
	public static void method3017() {
		@Pc(7) client local7 = Static205.aClient1;
		synchronized (Static205.aClient1) {
			if (Static407.aFrame5 == null) {
				@Pc(24) Container local24;
				if (Static280.aFrame10 != null) {
					local24 = Static280.aFrame10;
				} else if (Static649.anApplet2 == null) {
					local24 = Static333.anApplet_Sub1_1;
				} else {
					local24 = Static649.anApplet2;
				}
				Static553.anInt8551 = local24.getSize().width;
				Static599.anInt9215 = local24.getSize().height;
				@Pc(48) Insets local48;
				if (local24 == Static280.aFrame10) {
					local48 = Static280.aFrame10.getInsets();
					Static599.anInt9215 -= local48.bottom + local48.top;
					Static553.anInt8551 -= local48.left + local48.right;
				}
				if (Static324.method4462() == 1) {
					Static661.anInt9530 = (Static553.anInt8551 - Static606.anInt9314) / 2;
					Static435.anInt6854 = 0;
					Static357.anInt5421 = Static353.anInt5368;
					Static632.anInt9867 = Static606.anInt9314;
				} else {
					Static613.method8031();
				}
				if (Static215.aClass60_4 != Static181.aClass60_3) {
					@Pc(97) boolean local97;
					if (Static632.anInt9867 < 1024 && Static357.anInt5421 < 768) {
						local97 = true;
					} else {
						local97 = false;
					}
				}
				Static17.aCanvas1.setSize(Static632.anInt9867, Static357.anInt5421);
				if (Static582.aClass33_13 != null) {
					if (Static423.aBoolean517) {
						Static87.method1771(Static17.aCanvas1);
					} else {
						Static582.aClass33_13.method8098(Static17.aCanvas1, Static632.anInt9867, Static357.anInt5421);
					}
				}
				if (local24 == Static280.aFrame10) {
					local48 = Static280.aFrame10.getInsets();
					Static17.aCanvas1.setLocation(Static661.anInt9530 + local48.left, local48.top - -Static435.anInt6854);
				} else {
					Static17.aCanvas1.setLocation(Static661.anInt9530, Static435.anInt6854);
				}
				if (Static77.anInt1630 != -1) {
					Static470.method6503(true);
				}
				Static271.method3929();
			}
		}
	}
}
