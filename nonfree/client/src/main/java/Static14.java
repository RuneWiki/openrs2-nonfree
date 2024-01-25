import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(Lclient!ha;ZJ)V")
	public static void method6445(@OriginalArg(0) Class16 arg0, @OriginalArg(2) long arg1) {
		Static613.anInt10349 = Static63.anInt1976;
		Static636.anInt10641 = 0;
		Static233.anInt5269 = 0;
		Static63.anInt1976 = 0;
		@Pc(23) long local23 = Static342.method5463();
		for (@Pc(28) Class15_Sub8 local28 = (Class15_Sub8) Static266.aClass123_7.method3537(); local28 != null; local28 = (Class15_Sub8) Static266.aClass123_7.method3541()) {
			if (local28.method6539(arg0, arg1)) {
				Static636.anInt10641++;
			}
		}
		if (Static314.aBoolean447 && arg1 % 100L == 0L) {
			System.out.println("Particle system count: " + Static266.aClass123_7.method3538() + ", running: " + Static636.anInt10641);
			System.out.println("Emitters: " + Static233.anInt5269 + " Particles: " + Static63.anInt1976 + ". Time taken: " + (Static342.method5463() - local23) + "ms");
		}
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(III)Z")
	public static boolean method6446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static627.method8456(arg0, arg1) | (arg1 & 0x2000) != 0 | Static456.method6913(arg1, arg0)) & Static284.method4804(arg1, arg0);
	}

	@OriginalMember(owner = "client!aha", name = "i", descriptor = "(I)Z")
	public static boolean method6447() {
		@Pc(10) Class8_Sub6 local10 = (Class8_Sub6) Static572.aClass43_61.method1422();
		if (local10 == null) {
			return false;
		}
		for (@Pc(23) int local23 = 0; local23 < local10.anInt1476; local23++) {
			if (local10.aClass301Array1[local23] != null && local10.aClass301Array1[local23].anInt8915 == 0) {
				return false;
			}
			if (local10.aClass301Array2[local23] != null && local10.aClass301Array2[local23].anInt8915 == 0) {
				return false;
			}
		}
		return true;
	}
}
