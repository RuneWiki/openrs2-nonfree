import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static352 {

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
	public static int anInt7066;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)Lclient!vj;", line = 37)
	public static Class2_Sub2_Sub17 method6313() {
		return Static321.aClass2_Sub2_Sub17_3;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(BI)Z", line = 59)
	public static boolean method6315(@OriginalArg(1) int arg0) {
		Class1.aBoolean1 = true;
		Class49_Sub3.anInt5498 = arg0 + 1 & 0xFFFF;
		return true;
	}
}
