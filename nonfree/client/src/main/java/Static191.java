import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!gka", name = "h", descriptor = "[Lclient!laa;")
	public static Interface17[] anInterface17Array1;

	@OriginalMember(owner = "client!gka", name = "b", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_69 = new Class44(32, 4);

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(Z[BI)V")
	public static void method2986(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1) {
		if (Static286.aClass14_Sub29_5 == null) {
			Static286.aClass14_Sub29_5 = new Class14_Sub29(20000);
		}
		Static286.aClass14_Sub29_5.method5838(0, arg1, arg1.length);
		if (!arg0) {
			return;
		}
		Static77.method1435(Static286.aClass14_Sub29_5.aByteArray84);
		Static372.aClass217_Sub1Array1 = new Class217_Sub1[Static327.anInt6191];
		@Pc(38) int local38 = 0;
		for (@Pc(40) int local40 = Static590.anInt10098; local40 <= Static468.anInt354; local40++) {
			@Pc(46) Class217_Sub1 local46 = Static344.method9318(local40);
			if (local46 != null) {
				Static372.aClass217_Sub1Array1[local38++] = local46;
			}
		}
		Static586.aBoolean709 = false;
		Static590.aLong264 = Static521.method7499();
		Static286.aClass14_Sub29_5 = null;
	}

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(Lclient!jc;I)Lclient!jc;")
	public static Class14_Sub5_Sub2 method2988(@OriginalArg(0) Class14_Sub5_Sub2 arg0) {
		@Pc(14) Class14_Sub5_Sub2 local14 = arg0 == null ? new Class14_Sub5_Sub2() : new Class14_Sub5_Sub2(arg0);
		local14.method3883();
		return local14;
	}

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(B)[Lclient!in;")
	public static Class168[] method2989() {
		return new Class168[] { Static119.aClass168_4, Static56.aClass168_1, Static225.aClass168_7 };
	}
}
