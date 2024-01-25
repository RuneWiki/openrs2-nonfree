import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static565 {

	@OriginalMember(owner = "client!vs", name = "w", descriptor = "F")
	public static float aFloat210;

	@OriginalMember(owner = "client!vs", name = "z", descriptor = "Lclient!wo;")
	public static Class360 aClass360_6;

	@OriginalMember(owner = "client!vs", name = "x", descriptor = "Lclient!lca;")
	public static final Class203 aClass203_17 = new Class203(1);

	@OriginalMember(owner = "client!vs", name = "y", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_286 = new Class235(16, -2);

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(III)Z")
	public static boolean method7759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(ZIZIZ)I")
	public static int method7762(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) boolean arg2) {
		@Pc(10) Class1_Sub25 local10 = Static189.method2917(arg1, false);
		if (local10 == null) {
			return 0;
		}
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < local10.anIntArray328.length; local23++) {
			if (local10.anIntArray328[local23] >= 0 && local10.anIntArray328[local23] < Static175.aClass114_4.anInt2779) {
				@Pc(49) Class245 local49 = Static175.aClass114_4.method2217(local10.anIntArray328[local23]);
				@Pc(59) int local59 = local49.method5000(arg0, Static459.aClass38_2.method713(arg0).anInt2965);
				if (arg2) {
					local21 += local10.anIntArray327[local23] * local59;
				} else {
					local21 += local59;
				}
			}
		}
		return local21;
	}
}
