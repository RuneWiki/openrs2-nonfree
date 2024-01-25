import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!md", name = "p", descriptor = "Lclient!l;")
	public static Interface4 anInterface4_6;

	@OriginalMember(owner = "client!md", name = "A", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_75 = new Class242(21, 15);

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
	public static void method3559() {
		Static269.aClass53_1.method3911();
		Static181.aClass224_1.method5614();
		Static324.aClient1.method731();
		Static91.aCanvas2.setBackground(Color.black);
		Static141.anInt6095 = -1;
		Static269.aClass53_1 = Static82.method1003(Static91.aCanvas2);
		Static181.aClass224_1 = Static242.method3486(Static91.aCanvas2);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIILclient!jg;)V")
	public static void method3560(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) Class11_Sub1_Sub3 arg3) {
		Static145.method1820(arg3.anInt6430, arg3.anInt6428, arg2, arg0, 0, arg1, arg3.aByte90);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;BLjava/lang/String;IILjava/lang/String;)V")
	public static void method3561(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6) {
		for (@Pc(15) int local15 = 99; local15 > 0; local15--) {
			Static360.anIntArray439[local15] = Static360.anIntArray439[local15 - 1];
			Static259.anIntArray336[local15] = Static259.anIntArray336[local15 - 1];
			Static151.aStringArray13[local15] = Static151.aStringArray13[local15 - 1];
			Static327.aStringArray42[local15] = Static327.aStringArray42[local15 - 1];
			Static189.aStringArray22[local15] = Static189.aStringArray22[local15 - 1];
			Static210.aStringArray51[local15] = Static210.aStringArray51[local15 - 1];
			Static213.anIntArray282[local15] = Static213.anIntArray282[local15 - 1];
		}
		Static360.anIntArray439[0] = arg4;
		Static151.aStringArray13[0] = arg6;
		Static259.anIntArray336[0] = arg1;
		Static327.aStringArray42[0] = arg3;
		Static189.aStringArray22[0] = arg2;
		Static307.anInt5109 = Static163.anInt5780;
		Static213.anIntArray282[0] = arg5;
		Static1.anInt17++;
		Static210.aStringArray51[0] = arg0;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ZLclient!jg;)I")
	public static int method3562(@OriginalArg(1) Class11_Sub1_Sub3 arg0) {
		if (arg0.anInt3297 == 0) {
			return 0;
		}
		@Pc(67) int local67;
		@Pc(60) int local60;
		if (arg0.anInt3318 != -1) {
			@Pc(20) Class11_Sub1_Sub3 local20 = null;
			if (arg0.anInt3318 < 32768) {
				@Pc(46) Class1_Sub44 local46 = (Class1_Sub44) Static46.aClass208_33.method4405((long) arg0.anInt3318);
				if (local46 != null) {
					local20 = local46.aClass11_Sub1_Sub3_Sub1_2;
				}
			} else if (arg0.anInt3318 >= 32768) {
				local20 = Static399.aClass11_Sub1_Sub3_Sub2Array1[arg0.anInt3318 - 32768];
			}
			if (local20 != null) {
				local60 = arg0.anInt6428 - local20.anInt6428;
				local67 = arg0.anInt6430 - local20.anInt6430;
				if (local60 != 0 || local67 != 0) {
					arg0.method2631((int) (Math.atan2((double) local60, (double) local67) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class11_Sub1_Sub3_Sub2) {
			@Pc(164) Class11_Sub1_Sub3_Sub2 local164 = (Class11_Sub1_Sub3_Sub2) arg0;
			if (local164.anInt3361 != -1 && (local164.anInt3342 == 0 || local164.anInt3345 > 0)) {
				local164.method2631(local164.anInt3361);
				local164.anInt3361 = -1;
			}
		} else if (arg0 instanceof Class11_Sub1_Sub3_Sub1) {
			@Pc(96) Class11_Sub1_Sub3_Sub1 local96 = (Class11_Sub1_Sub3_Sub1) arg0;
			if (local96.anInt1603 != -1 && (local96.anInt3342 == 0 || local96.anInt3345 > 0)) {
				local60 = local96.anInt6428 - (local96.anInt1603 - Static315.anInt5207 - Static315.anInt5207) * 64;
				local67 = local96.anInt6430 - (local96.anInt1610 - Static47.anInt676 - Static47.anInt676) * 64;
				if (local60 != 0 || local67 != 0) {
					local96.method2631((int) (Math.atan2((double) local60, (double) local67) * 2607.5945876176133D) & 0x3FFF);
				}
				local96.anInt1603 = -1;
			}
		}
		return arg0.method2633();
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method3564(@OriginalArg(0) String arg0) {
		return Static45.method604(10, arg0);
	}
}
