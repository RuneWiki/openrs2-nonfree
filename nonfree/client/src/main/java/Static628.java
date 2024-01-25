import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static628 {

	@OriginalMember(owner = "client!vea", name = "h", descriptor = "Lclient!gga;")
	public static Class124 aClass124_127;

	@OriginalMember(owner = "client!vea", name = "o", descriptor = "I")
	public static int anInt10915;

	@OriginalMember(owner = "client!vea", name = "f", descriptor = "Z")
	public static boolean aBoolean786 = false;

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(Ljava/lang/String;Lclient!ol;Z)I")
	public static int method9328(@OriginalArg(0) String arg0, @OriginalArg(1) Class2_Sub8 arg1) {
		@Pc(12) int local12 = arg1.anInt5725;
		@Pc(16) byte[] local16 = Static278.method4686(arg0);
		arg1.method5210(local16.length);
		arg1.anInt5725 += Static220.aClass36_1.method1075(local16, arg1.lb, arg1.anInt5725, local16.length, 0);
		return arg1.anInt5725 - local12;
	}

	@OriginalMember(owner = "client!vea", name = "b", descriptor = "(I)I")
	public static int method9330() {
		@Pc(15) byte local15;
		if (Static65.anInt1229 < 96) {
			local15 = 1;
			Static520.method8043();
		} else {
			@Pc(23) int local23 = Static607.method9111();
			if (local23 <= 100) {
				Static380.method6434();
				local15 = 4;
			} else if (local23 <= 500) {
				local15 = 3;
				Static481.method7650();
			} else if (local23 <= 1000) {
				Static631.method9340();
				local15 = 2;
			} else {
				local15 = 1;
				Static520.method8043();
			}
		}
		if (Static230.aClass2_Sub54_15.aClass4_Sub16_2.method4907() != 0) {
			Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub16_1, 0);
			Static389.method6560(false, 0);
		}
		Static482.method7663();
		return local15;
	}
}
