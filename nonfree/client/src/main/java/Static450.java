import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static450 {

	@OriginalMember(owner = "client!wm", name = "w", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_113 = new Class217(45, 3);

	@OriginalMember(owner = "client!wm", name = "x", descriptor = "Lclient!an;")
	public static final Class11 aClass11_44 = new Class11(16);

	@OriginalMember(owner = "client!wm", name = "y", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_154 = new Class119(87, 12);

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(III)Lclient!iq;")
	public static Class118 method5835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static263.aClass118ArrayArrayArray2[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static263.aClass118ArrayArrayArray2[0][arg1][arg2] != null && Static263.aClass118ArrayArrayArray2[0][arg1][arg2].aClass118_1 != null;
			if (local28 && arg0 >= Static362.anInt6122 - 1) {
				return null;
			}
			Static136.method2168(arg0, arg1, arg2);
		}
		return Static263.aClass118ArrayArrayArray2[arg0][arg1][arg2];
	}
}
