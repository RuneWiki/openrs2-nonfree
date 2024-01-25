import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(BLclient!vfa;Lclient!ha;)V")
	public static void method8517(@OriginalArg(1) Class357 arg0, @OriginalArg(2) Class126 arg1) {
		@Pc(33) boolean local33 = Static479.aClass348_1.method8199(arg0.anInt9858 | 0xFF000000, arg0.anInt9871, arg1, arg0.anInt9836, arg0.anInt9815, arg0.anInt9816, arg0.aBoolean800 ? Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aClass339_1 : null) == null;
		if (local33) {
			Static568.aClass306_57.method7303(new Class5_Sub31(arg0.anInt9871, arg0.anInt9815, arg0.anInt9836, arg0.anInt9858 | 0xFF000000, arg0.anInt9816, arg0.aBoolean800));
			Static637.method8778(arg0);
		}
	}
}
