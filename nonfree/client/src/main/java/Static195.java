import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!mo", name = "M", descriptor = "Lclient!wo;")
	public static Class216 aClass216_66;

	@OriginalMember(owner = "client!mo", name = "N", descriptor = "Lclient!fa;")
	public static Class63 aClass63_5;

	@OriginalMember(owner = "client!mo", name = "J", descriptor = "I")
	public static int anInt4169 = 0;

	@OriginalMember(owner = "client!mo", name = "P", descriptor = "Z")
	public static boolean aBoolean384 = false;

	@OriginalMember(owner = "client!mo", name = "Q", descriptor = "I")
	public static int anInt4173 = 0;

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "(II)V")
	public static void method3772(@OriginalArg(0) int arg0) {
		Static190.aClass87_35 = new Class87(arg0);
	}

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "(II)Lclient!og;")
	public static Class151 method3774(@OriginalArg(0) int arg0) {
		@Pc(10) Class151 local10 = (Class151) Static133.aClass87_27.method2482((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static110.aClass216_95.method5648(34, arg0);
		local10 = new Class151();
		if (local22 != null) {
			local10.method4150(new Class1_Sub8(local22), arg0);
		}
		Static133.aClass87_27.method2481(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!mo", name = "e", descriptor = "(II)I")
	public static int method3775(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 & 0x3F;
		@Pc(18) int local18 = arg0 >> 6 & 0x3;
		if (local12 == 18) {
			if (local18 == 0) {
				return 1;
			}
			if (local18 == 1) {
				return 2;
			}
			if (local18 == 2) {
				return 4;
			}
			if (local18 == 3) {
				return 8;
			}
		} else if (local12 == 19 || local12 == 21) {
			if (local18 == 0) {
				return 16;
			}
			if (local18 == 1) {
				return 32;
			}
			if (local18 == 2) {
				return 64;
			}
			if (local18 == 3) {
				return 128;
			}
		}
		return 0;
	}
}
