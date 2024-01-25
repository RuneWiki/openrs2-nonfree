import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!gga", name = "Cb", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet6;

	@OriginalMember(owner = "client!gga", name = "Eb", descriptor = "I")
	public static int anInt9944 = 0;

	@OriginalMember(owner = "client!gga", name = "m", descriptor = "(I)V")
	public static void method8370() {
		@Pc(10) int local10 = 0;
		if (Static96.aClass6_Sub22_7.aClass29_Sub21_1.method6967() == 1) {
			local10 = 55;
		}
		if (Static96.aClass6_Sub22_7.aClass29_Sub12_1.method4082() == 0) {
			local10 |= 0x40;
		}
		Static578.method8042(local10);
		Static411.aClass88_3.method2019(local10);
		Static340.aClass121_1.method2651(local10);
		Static95.aClass188_1.method4259(local10);
		Static111.aClass279_4.method6907(local10);
		Static202.method3042(local10);
		Static389.method5544(local10);
		Static122.method1891(local10);
		Static633.method8701(local10);
		Static641.method8753();
	}

	@OriginalMember(owner = "client!gga", name = "k", descriptor = "(II)I")
	public static int method8385(@OriginalArg(0) int arg0) {
		@Pc(18) int local18 = (arg0 >>> 1 & 0xD5555555) + (arg0 & 0x55555555);
		@Pc(29) int local29 = (local18 & 0x33333333) + ((local18 & 0xCCCCCCCC) >>> 2);
		@Pc(37) int local37 = (local29 >>> 4) + local29 & 0xF0F0F0F;
		@Pc(43) int local43 = local37 + (local37 >>> 8);
		@Pc(49) int local49 = local43 + (local43 >>> 16);
		return local49 & 0xFF;
	}

	@OriginalMember(owner = "client!gga", name = "t", descriptor = "(I)V")
	public static void method8388() {
		@Pc(1) Class10 local1 = Static278.aClass10_58;
		synchronized (Static278.aClass10_58) {
			Static278.aClass10_58.method380();
		}
	}
}
