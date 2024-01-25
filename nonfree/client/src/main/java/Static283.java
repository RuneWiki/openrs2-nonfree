import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!kaa", name = "i", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_108 = new Class200(56, 11);

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lclient!pfa;B)I")
	public static int method4510(@OriginalArg(0) Class269 arg0) {
		if (arg0 == Static408.aClass269_3) {
			return 7681;
		} else if (Static259.aClass269_4 == arg0) {
			return 8448;
		} else if (arg0 == Static398.aClass269_5) {
			return 34165;
		} else if (Static26.aClass269_1 == arg0) {
			return 260;
		} else if (arg0 == Static414.aClass269_6) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method4511(@OriginalArg(1) Class13 arg0) {
		if (Static119.aClass114_13.method2766() == 0) {
			return;
		}
		@Pc(23) Class2_Sub34 local23;
		if (Static305.aClass2_Sub49_15.aClass33_Sub28_1.method8687() == 0) {
			for (local23 = (Class2_Sub34) Static119.aClass114_13.method2772(); local23 != null; local23 = (Class2_Sub34) Static119.aClass114_13.method2762()) {
				Static470.aClass250_1.method5962(false, local23.anInt7180, false, Static591.aClass37_12, arg0, local23.anInt7177, local23.aBoolean517 ? Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aClass284_1 : null, local23.anInt7176, local23.anInt7181, arg0, local23.anInt7178);
				local23.method8920();
			}
			Static569.method7932();
			return;
		}
		if (Static168.aClass13_32 == null) {
			@Pc(70) Canvas local70 = new Canvas();
			local70.setSize(36, 32);
			Static168.aClass13_32 = Static620.method8621(0, local70, Static173.anInterface2_7, 0, Static98.aClass238_299);
			Static479.aClass37_7 = Static168.aClass13_32.method8136(Static28.method8897(Static358.anInt6196, Static419.aClass238_210), Static654.method3463(Static497.aClass238_223, Static358.anInt6196));
		}
		for (local23 = (Class2_Sub34) Static119.aClass114_13.method2772(); local23 != null; local23 = (Class2_Sub34) Static119.aClass114_13.method2762()) {
			Static470.aClass250_1.method5962(false, local23.anInt7180, false, Static479.aClass37_7, Static168.aClass13_32, local23.anInt7177, local23.aBoolean517 ? Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aClass284_1 : null, local23.anInt7176, local23.anInt7181, arg0, local23.anInt7178);
			local23.method8920();
		}
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IIII)V")
	public static void method4512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = Static305.aClass2_Sub49_15.aClass33_Sub9_3.method3103() * arg1 >> 8;
		if (arg2 == -1 && !Static609.aBoolean725) {
			Static334.method5086();
		} else if (arg2 != -1 && (Static57.anInt1427 != arg2 || !Static260.method4309()) && local8 != 0 && !Static609.aBoolean725) {
			Static424.method6179(local8, Static609.aClass238_284, arg0, arg2);
			Static480.method6802();
		}
		if (arg2 != Static57.anInt1427) {
			Static262.aClass2_Sub11_Sub1_3 = null;
		}
		Static57.anInt1427 = arg2;
	}
}
