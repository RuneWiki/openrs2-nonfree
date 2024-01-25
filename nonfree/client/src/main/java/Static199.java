import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!gp", name = "f", descriptor = "Lclient!bt;")
	public static Class34 aClass34_50;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "I")
	public static final int anInt3294 = 0;

	@OriginalMember(owner = "client!gp", name = "d", descriptor = "[I")
	public static final int[] anIntArray242 = new int[5];

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(B)[I")
	public static int[] method3054() {
		return new int[] { Static625.anInt9801, Static371.anInt5580, Static138.anInt2559 };
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!fw;BLclient!ha;)I")
	public static int method3055(@OriginalArg(0) Class127 arg0, @OriginalArg(2) Class33 arg1) {
		if (arg0.anInt3063 != -1) {
			return arg0.anInt3063;
		}
		if (arg0.anInt3065 != -1) {
			@Pc(18) Class130 local18 = arg1.anInterface9_12.method1558(arg0.anInt3065);
			if (!local18.aBoolean241) {
				return local18.aShort49;
			}
		}
		return arg0.anInt3066;
	}
}
