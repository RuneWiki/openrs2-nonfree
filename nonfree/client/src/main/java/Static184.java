import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!hl", name = "P", descriptor = "I")
	public static int anInt3392;

	@OriginalMember(owner = "client!hl", name = "Q", descriptor = "I")
	public static int anInt3393;

	@OriginalMember(owner = "client!hl", name = "L", descriptor = "[I")
	public static final int[] anIntArray369 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!hl", name = "R", descriptor = "[Lclient!to;")
	public static final Class274[] aClass274Array1 = new Class274[16];

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!qa;ILclient!ch;)I")
	public static int method3038(@OriginalArg(0) Class39 arg0, @OriginalArg(2) Class37 arg1) {
		if (arg1.anInt1214 != -1) {
			return arg1.anInt1214;
		}
		if (arg1.anInt1219 != -1) {
			@Pc(31) Class204 local31 = arg0.anInterface12_15.method2573(arg0.method6036() ? arg1.anInt1219 : arg1.anInt1212);
			if (!local31.aBoolean460) {
				return local31.aShort118;
			}
		}
		return arg1.anInt1208;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILclient!qa;)V")
	public static void method3039(@OriginalArg(1) Class39 arg0) {
		if (Static254.aBoolean340) {
			Static308.method4795(arg0);
		} else {
			Static453.method6916(arg0);
		}
	}
}
