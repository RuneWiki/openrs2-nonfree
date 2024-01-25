import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!fca", name = "bb", descriptor = "Z")
	public static boolean aBoolean235 = false;

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(Lclient!gea;B)V")
	public static void method2841(@OriginalArg(0) Class3_Sub11_Sub8 arg0) {
		arg0.method9345();
		@Pc(10) boolean local10 = false;
		for (@Pc(15) Class3_Sub11_Sub8 local15 = (Class3_Sub11_Sub8) Static111.aClass74_3.method1842(); local15 != null; local15 = (Class3_Sub11_Sub8) Static111.aClass74_3.method1844()) {
			if (Static267.method4375(arg0.method3474(), local15.method3474())) {
				Static665.method9177(arg0, local15);
				local10 = true;
				break;
			}
		}
		if (!local10) {
			Static111.aClass74_3.method1840(arg0);
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(Lclient!tm;IILclient!ha;Z)V")
	public static void method2843(@OriginalArg(0) Class338 arg0, @OriginalArg(3) Class13 arg1) {
		Static93.aClass338_238.method8175();
		if (Static442.aBoolean513) {
			return;
		}
		for (@Pc(21) Class3_Sub18 local21 = (Class3_Sub18) arg0.method8177(); local21 != null; local21 = (Class3_Sub18) arg0.method8168()) {
			@Pc(29) Class308 local29 = Static317.aClass27_3.method693(local21.anInt2277);
			if (Static512.method7227(local29)) {
				@Pc(41) boolean local41 = Static62.method1302(local29, local21, arg1);
				if (local41) {
					Static312.method4766(local21, local29, arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(IBI)Z")
	public static boolean method2847(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static341.method5111(arg0, arg1) & Static528.method7626(arg0, arg1);
	}

	@OriginalMember(owner = "client!fca", name = "d", descriptor = "(I)V")
	public static void method2848() {
		for (@Pc(10) Class3_Sub40 local10 = (Class3_Sub40) Static244.aClass83_11.method2375(); local10 != null; local10 = (Class3_Sub40) Static244.aClass83_11.method2370()) {
			if (local10.aBoolean414) {
				local10.aBoolean414 = false;
			} else {
				Static674.method9364(local10.anInt5753);
			}
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(ZI)V")
	public static void method2849(@OriginalArg(1) int arg0) {
		if (Static18.anInt450 == 0) {
			Static366.aClass3_Sub1_Sub3_4.method2149(arg0);
		} else {
			Static553.anInt9041 = arg0;
		}
	}
}
