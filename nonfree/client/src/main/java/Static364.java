import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!nca", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString78;

	@OriginalMember(owner = "client!nca", name = "b", descriptor = "(B)V")
	public static void method6173() {
		for (@Pc(10) Class2_Sub6_Sub21 local10 = (Class2_Sub6_Sub21) Static522.aClass211_7.method6008(); local10 != null; local10 = (Class2_Sub6_Sub21) Static522.aClass211_7.method6000()) {
			if (local10.anInt10705 > 1) {
				local10.anInt10705 = 0;
				Static566.aClass169_61.method5001(local10, ((Class2_Sub6_Sub3) local10.aClass211_12.aClass2_Sub6_48.aClass2_Sub6_66).aLong60);
				local10.aClass211_12.method6006();
			}
		}
		Static193.anInt4507 = 0;
		Static298.anInt6262 = 0;
		Static216.aClass341_39.method8525();
		Static89.aClass99_22.method3057();
		Static522.aClass211_7.method6006();
		Static467.method7330(Static264.aClass2_Sub6_Sub3_2);
	}
}
