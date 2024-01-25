import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
	public static int anInt3776;

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "[Lclient!cq;")
	public static Class8[] aClass8Array8;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIII)V")
	public static void method3194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(35) String local35 = "tele " + arg2 + "," + (arg0 >> 6) + "," + (arg1 >> 6) + "," + (arg0 & 0x3F) + "," + (arg1 & 0x3F);
		System.out.println(local35);
		Static311.method5345(local35, true);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)V")
	public static void method3195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static269.aClass37_88 = new Class37(arg1);
		Static44.aClass37_21 = new Class37(arg0);
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(III)I")
	public static int method3196(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg1 - 1 & arg0 >> 31;
		return local11 + (arg0 + (arg0 >>> 31)) % arg1;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIII)I")
	public static int method3197(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg3 & 0xF;
		@Pc(14) int local14 = local7 < 8 ? arg0 : arg2;
		@Pc(33) int local33 = local7 >= 4 ? (local7 == 12 || local7 == 14 ? arg0 : arg1) : arg2;
		return ((local7 & 0x2) == 0 ? local33 : -local33) + ((local7 & 0x1) == 0 ? local14 : -local14);
	}
}
