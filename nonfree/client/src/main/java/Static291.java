import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static291 {

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(ZII)Z")
	public static boolean method4968(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(ILclient!oa;)V")
	public static void method4969(@OriginalArg(1) Class15 arg0) {
		if (Static443.aClass2_Sub2_Sub1_Sub1_2.aByte103 != Static55.anInt1301 && (Static580.aClass125ArrayArrayArray3 != null && Static141.method2864(arg0, Static443.aClass2_Sub2_Sub1_Sub1_2.aByte103))) {
			Static55.anInt1301 = Static443.aClass2_Sub2_Sub1_Sub1_2.aByte103;
		}
	}
}
