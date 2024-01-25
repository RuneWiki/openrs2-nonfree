import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!bq", name = "f", descriptor = "Lclient!bq;")
	public static final Class46 aClass46_2 = new Class46();

	@OriginalMember(owner = "client!bq", name = "h", descriptor = "Lclient!bq;")
	public static final Class46 aClass46_5 = new Class46();

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "Lclient!bq;")
	public static final Class46 aClass46_3 = new Class46();

	@OriginalMember(owner = "client!bq", name = "g", descriptor = "Lclient!bq;")
	public static final Class46 aClass46_4 = new Class46();

	@OriginalMember(owner = "client!bq", name = "e", descriptor = "I")
	public static int anInt1492 = -1;

	@OriginalMember(owner = "client!bq", name = "i", descriptor = "S")
	public static short aShort26 = 32767;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "Z")
	public static boolean aBoolean104 = false;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IILjava/awt/Canvas;Lclient!d;Z)Lclient!ha;")
	public static Class22 method1384(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(3) Interface4 arg3) {
		return new Class22_Sub3(arg2, arg3, arg0, arg1);
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!ee;Z[[[BIB)Z")
	public static boolean method1385(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!Static314.aBoolean334) {
			return false;
		}
		@Pc(9) int local9 = arg0.anInt10694 >> Static626.anInt9669;
		@Pc(11) int local11 = local9;
		@Pc(16) int local16 = arg0.anInt10695 >> Static626.anInt9669;
		@Pc(18) int local18 = local16;
		if (arg0 instanceof Class9_Sub1_Sub1) {
			local11 = ((Class9_Sub1_Sub1) arg0).aShort122;
			local18 = ((Class9_Sub1_Sub1) arg0).aShort121;
			local9 = ((Class9_Sub1_Sub1) arg0).aShort123;
			local16 = ((Class9_Sub1_Sub1) arg0).aShort120;
		}
		for (@Pc(39) int local39 = local9; local39 <= local11; local39++) {
			for (@Pc(42) int local42 = local16; local42 <= local18; local42++) {
				if (arg0.aByte140 < Static169.anInt2992 && local39 >= Static282.anInt2240 && local39 < Static109.anInt2308 && local42 >= Static74.anInt1707 && local42 < Static21.anInt707) {
					if ((arg2 == null || arg0.aByte139 < arg3 || arg2[arg0.aByte139][local39][local42] != arg4) && arg0.method9079() && !arg0.method9082(Static404.aClass22_6)) {
						return false;
					}
					if (!arg1 && local39 >= Static507.anInt8070 - 16 && local39 <= Static507.anInt8070 + 16 && local42 >= Static527.anInt8230 - 16 && local42 <= Static527.anInt8230 + 16) {
						if (Static539.aBoolean563) {
							Static306.aClass353Array1[Static285.anInt4364++].method7815(arg0);
							Static285.anInt4364 %= Static174.anInt3082;
						} else {
							arg0.method9085(Static404.aClass22_6);
						}
					}
				}
			}
		}
		return true;
	}
}
