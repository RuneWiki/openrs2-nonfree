import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!lh", name = "o", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!lh", name = "l", descriptor = "Lclient!fg;")
	public static final Class70 aClass70_58 = new Class70(50);

	@OriginalMember(owner = "client!lh", name = "m", descriptor = "Z")
	public static boolean aBoolean235 = false;

	@OriginalMember(owner = "client!lh", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString138 = "Connected to update server";

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)Lclient!jo;")
	public static Class64_Sub1 method3400() {
		return Static139.aClass64_Sub1Array1.length > Static262.anInt4777 ? Static139.aClass64_Sub1Array1[Static262.anInt4777++] : null;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIZ)I")
	public static int method3401(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class6_Sub38 local12 = (Class6_Sub38) Static297.aClass108_31.method2900((long) arg1);
		if (local12 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(29) int local29 = 0;
			for (@Pc(31) int local31 = 0; local31 < local12.anIntArray652.length; local31++) {
				if (local12.anIntArray653[local31] == arg0) {
					local29 += local12.anIntArray652[local31];
				}
			}
			return local29;
		}
	}
}
