import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!lba", name = "C", descriptor = "I")
	public static int anInt5377;

	@OriginalMember(owner = "client!lba", name = "J", descriptor = "Lclient!dn;")
	public static Class75 aClass75_2;

	@OriginalMember(owner = "client!lba", name = "L", descriptor = "F")
	public static float aFloat99;

	@OriginalMember(owner = "client!lba", name = "y", descriptor = "[I")
	public static final int[] anIntArray457 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!lba", name = "H", descriptor = "Lclient!os;")
	public static final Class258 aClass258_13 = new Class258(9, 2);

	@OriginalMember(owner = "client!lba", name = "K", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_62 = new Class61(37, 3);

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(II)Lclient!lt;")
	public static Class215 method4563(@OriginalArg(1) int arg0) {
		@Pc(16) Class215[] local16 = Static331.method4969();
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			@Pc(24) Class215 local24 = local16[local18];
			if (arg0 == local24.anInt5636) {
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Lclient!eh;I)Lclient!kr;")
	public static Class52_Sub2 method4564(@OriginalArg(0) Class4_Sub9 arg0) {
		@Pc(7) Class52 local7 = Static72.method1294(arg0);
		@Pc(11) int local11 = arg0.method6026();
		@Pc(15) int local15 = arg0.method6026();
		@Pc(24) int local24 = arg0.method5982();
		return new Class52_Sub2(local7.aClass297_12, local7.aClass58_13, local7.anInt8820, local7.anInt8826, local7.anInt8822, local7.anInt8828, local7.anInt8824, local7.anInt8827, local7.anInt8821, local11, local15, local24);
	}

	@OriginalMember(owner = "client!lba", name = "f", descriptor = "(I)V")
	public static void method4565() {
		@Pc(9) int local9 = (int) ((double) Static38.anInt740 * 34.46D);
		local9 <<= 0x2;
		if (Static185.aClass66_14.method6820()) {
			local9 += 512;
		}
		Static185.aClass66_14.sa(200, local9);
	}
}
