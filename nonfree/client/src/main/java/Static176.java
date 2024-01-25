import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIIILclient!vi;)V")
	public static void method3475(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub52 arg3) {
		arg3.aClass2_Sub8_Sub2_2.method5194(arg0);
		arg3.aClass2_Sub8_Sub2_2.method5205(arg1);
		arg3.aClass2_Sub8_Sub2_2.method5218(arg2);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lclient!m;I)V")
	public static void method3476(@OriginalArg(0) Class2_Sub1_Sub13 arg0) {
		if (Static183.aBoolean305) {
			return;
		}
		arg0.method9825();
		Static276.anInt5124--;
		if (!arg0.aBoolean523) {
			@Pc(81) long local81 = arg0.aLong180;
			@Pc(89) Class2_Sub1_Sub19 local89;
			for (local89 = (Class2_Sub1_Sub19) Static539.aClass335_39.method8357(local81); local89 != null && !local89.aString113.equals(arg0.aString82); local89 = (Class2_Sub1_Sub19) Static539.aClass335_39.method8352()) {
			}
			if (local89 != null && local89.method8590(arg0)) {
				Static91.method1582(local89);
			}
			return;
		}
		for (@Pc(26) Class2_Sub1_Sub19 local26 = (Class2_Sub1_Sub19) Static112.aClass279_6.method7293(); local26 != null; local26 = (Class2_Sub1_Sub19) Static112.aClass279_6.method7298()) {
			if (local26.aString113.equals(arg0.aString82)) {
				@Pc(36) boolean local36 = false;
				for (@Pc(42) Class2_Sub1_Sub13 local42 = (Class2_Sub1_Sub13) local26.aClass279_13.method7293(); local42 != null; local42 = (Class2_Sub1_Sub13) local26.aClass279_13.method7298()) {
					if (arg0 == local42) {
						if (local26.method8590(arg0)) {
							Static91.method1582(local26);
						}
						local36 = true;
						break;
					}
				}
				if (local36) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IB)I")
	public static int method3477(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
