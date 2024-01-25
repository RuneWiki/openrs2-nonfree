import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static393 {

	@OriginalMember(owner = "client!tr", name = "e", descriptor = "I")
	public static int anInt7135;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "Lclient!cq;")
	public static final Class43 aClass43_20 = new Class43("", 12);

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lclient!ya;I)V")
	public static void method5732(@OriginalArg(0) Class135 arg0) {
		if (Static388.aClass244_38.method5266() == 0) {
			return;
		}
		@Pc(60) Class4_Sub19 local60;
		if (Static341.anInt5549 == 0) {
			for (local60 = (Class4_Sub19) Static388.aClass244_38.method5263(); local60 != null; local60 = (Class4_Sub19) Static388.aClass244_38.method5271()) {
				Static416.aClass64_2.method1374(local60.aBoolean225 ? Static401.aClass8_Sub3_Sub1_Sub1_2.aClass60_1 : null, Static378.aClass123_7, false, arg0, local60.anInt3051, local60.anInt3052, local60.anInt3053, local60.anInt3049, false, arg0, local60.anInt3048);
				local60.method6059();
			}
			Static194.method5772();
			return;
		}
		if (Static368.aClass135_11 == null) {
			@Pc(30) Canvas local30 = new Canvas();
			local30.setSize(36, 32);
			Static368.aClass135_11 = Static458.method5338(0, Static24.aClass196_1, local30, 0, Static91.anInterface5_2);
			Static179.aClass123_5 = Static368.aClass135_11.method5352(Static259.method3463(Static57.aClass211_18, Static186.anInt3435), Static465.method4468(Static13.aClass211_11, Static186.anInt3435));
		}
		for (local60 = (Class4_Sub19) Static388.aClass244_38.method5263(); local60 != null; local60 = (Class4_Sub19) Static388.aClass244_38.method5271()) {
			Static416.aClass64_2.method1374(local60.aBoolean225 ? Static401.aClass8_Sub3_Sub1_Sub1_2.aClass60_1 : null, Static179.aClass123_5, false, arg0, local60.anInt3051, local60.anInt3052, local60.anInt3053, local60.anInt3049, false, Static368.aClass135_11, local60.anInt3048);
			local60.method6059();
		}
	}
}
