import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static524 {

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "Z")
	public static boolean aBoolean714 = false;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(II)Lclient!sk;")
	public static Class317 method8694(@OriginalArg(1) int arg0) {
		@Pc(8) Class317[] local8 = Static527.method9028();
		for (@Pc(15) int local15 = 0; local15 < local8.length; local15++) {
			@Pc(21) Class317 local21 = local8[local15];
			if (local21.anInt9454 == arg0) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)V")
	public static void method8703() {
		if (Static597.anInt10516 > 1) {
			Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub24_1, 4);
		} else {
			Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub24_1, 2);
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!at;I)Lclient!at;")
	public static Class24 method8704(@OriginalArg(0) Class24 arg0) {
		if (arg0.anInt511 != -1) {
			return Static87.method8101(arg0.anInt511);
		}
		@Pc(24) int local24 = arg0.anInt510 >>> 16;
		@Pc(29) Class11 local29 = new Class11(Static372.aClass99_51);
		for (@Pc(34) Class2_Sub48 local34 = (Class2_Sub48) local29.method218(); local34 != null; local34 = (Class2_Sub48) local29.method220()) {
			if (local34.anInt10125 == local24) {
				return Static87.method8101((int) local34.aLong278);
			}
		}
		return null;
	}
}
