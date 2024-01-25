import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!pw", name = "d", descriptor = "Lclient!dda;")
	public static Class53 aClass53_109;

	@OriginalMember(owner = "client!pw", name = "f", descriptor = "I")
	public static int anInt7071;

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(Lclient!ej;III)J")
	public static long method5987(@OriginalArg(0) Interface6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = 2147483648L;
		@Pc(9) long local9 = Long.MIN_VALUE;
		@Pc(16) Class129 local16 = Static505.aClass206_4.method5326(arg0.method7688());
		@Pc(37) long local37 = (long) (arg2 << 7 | arg1 | arg0.method7685() << 14 | arg0.method7687() << 20 | 0x40000000);
		if (local16.anInt3660 == 0) {
			local37 |= local9;
		}
		if (local16.anInt3679 == 1) {
			local37 |= local5;
		}
		if (local16.aBoolean288) {
			local37 |= local7;
		}
		return local37 | (long) arg0.method7688() << 32;
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(B)V")
	public static void method5988() {
		Static93.method1721(Static386.aClass243_70);
		Static381.aClass2_Sub29_Sub2_2.method5172(Static181.method3002());
		Static381.aClass2_Sub29_Sub2_2.method5217(Static461.anInt8348);
		Static381.aClass2_Sub29_Sub2_2.method5217(Static223.anInt3996);
		Static381.aClass2_Sub29_Sub2_2.method5172(Static281.aClass2_Sub19_Sub1_1.anInt2192);
	}

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "(B)V")
	public static void method5989() {
		for (@Pc(15) int local15 = 0; local15 < Static267.aByteArrayArrayArray19.length; local15++) {
			for (@Pc(19) int local19 = 0; local19 < Static267.aByteArrayArrayArray19[0].length; local19++) {
				for (@Pc(23) int local23 = 0; local23 < Static267.aByteArrayArrayArray19[0][0].length; local23++) {
					Static267.aByteArrayArrayArray19[local15][local19][local23] = 0;
				}
			}
		}
	}
}
