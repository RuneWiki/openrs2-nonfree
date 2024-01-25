import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static265 {

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "[I")
	public static final int[] anIntArray351 = new int[3];

	@OriginalMember(owner = "client!ji", name = "k", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_53 = new Class269(42, 6);

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIZI)V")
	public static void method4296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		Static458.anInt7979 = arg3;
		Static244.anInt4842 = arg2;
		Static189.anInt4149 = arg0;
		Static307.anInt5655 = arg5;
		Static531.anInt8872 = arg1;
		if (arg4 && Static458.anInt7979 >= 100) {
			Static53.anInt1153 = Static244.anInt4842 * 512 + 256;
			Static395.anInt3530 = Static307.anInt5655 * 512 + 256;
			Static64.anInt1371 = Static582.method8038(Static16.anInt308, Static53.anInt1153, Static395.anInt3530) - Static189.anInt4149;
		}
		Static2.anInt31 = 2;
		Static644.anInt10296 = -1;
		Static23.anInt718 = -1;
	}
}
