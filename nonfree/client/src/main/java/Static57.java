import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "Lclient!c;")
	public static Class31 aClass31_2;

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_20 = new Class134("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "Lclient!mg;")
	public static final Class156 aClass156_8 = new Class156();

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "([BZI)V")
	public static void method819(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) {
		if (Static242.aClass2_Sub13_5 == null) {
			Static242.aClass2_Sub13_5 = new Class2_Sub13(20000);
		}
		Static242.aClass2_Sub13_5.method3596(arg0.length, arg0);
		if (!arg1) {
			return;
		}
		Static61.method900(Static242.aClass2_Sub13_5.aByteArray52);
		Static85.aClass65_Sub1Array3 = new Class65_Sub1[Static409.anInt6678];
		@Pc(35) int local35 = 0;
		for (@Pc(37) int local37 = Static9.anInt132; local37 <= Static311.anInt6696; local37++) {
			@Pc(43) Class65_Sub1 local43 = Static14.method171(local37);
			if (local43 != null) {
				Static85.aClass65_Sub1Array3[local35++] = local43;
			}
		}
		Static418.aBoolean495 = false;
		Static244.aLong136 = Static110.method1702();
		Static242.aClass2_Sub13_5 = null;
	}
}
