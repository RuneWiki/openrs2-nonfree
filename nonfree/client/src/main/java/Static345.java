import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!lia", name = "r", descriptor = "Lclient!oga;")
	public static Class267 aClass267_4;

	@OriginalMember(owner = "client!lia", name = "b", descriptor = "Lclient!lia;")
	public static final Class214 aClass214_1 = new Class214(0, 3, Static111.aClass79_11);

	@OriginalMember(owner = "client!lia", name = "e", descriptor = "Lclient!lia;")
	public static final Class214 aClass214_2 = new Class214(1, 3, Static111.aClass79_11);

	@OriginalMember(owner = "client!lia", name = "i", descriptor = "Lclient!lia;")
	public static final Class214 aClass214_3 = new Class214(2, 4, Static111.aClass79_7);

	@OriginalMember(owner = "client!lia", name = "m", descriptor = "Lclient!lia;")
	public static final Class214 aClass214_4 = new Class214(3, 1, Static111.aClass79_11);

	@OriginalMember(owner = "client!lia", name = "n", descriptor = "Lclient!lia;")
	public static final Class214 aClass214_5 = new Class214(4, 2, Static111.aClass79_11);

	@OriginalMember(owner = "client!lia", name = "o", descriptor = "Lclient!lia;")
	public static final Class214 aClass214_6 = new Class214(5, 3, Static111.aClass79_11);

	@OriginalMember(owner = "client!lia", name = "p", descriptor = "Lclient!lia;")
	public static final Class214 aClass214_7 = new Class214(6, 4, Static111.aClass79_11);

	@OriginalMember(owner = "client!lia", name = "q", descriptor = "I")
	public static final int anInt5278 = Static214.method3192(16);

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(IBI)Z")
	public static boolean method4661(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x100100) != 0;
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(II)V")
	public static void method4662(@OriginalArg(1) int arg0) {
		@Pc(9) Class4_Sub5_Sub11 local9 = Static652.method8695((long) arg0, 1);
		local9.method3956();
	}

	@OriginalMember(owner = "client!lia", name = "b", descriptor = "(IBI)Z")
	public static boolean method4663(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static32.method708(arg1, arg0) & Static540.method7231(arg1, arg0);
	}

	@OriginalMember(owner = "client!lia", name = "b", descriptor = "(II)Lclient!lia;")
	public static Class214 method4665(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return aClass214_1;
		} else if (arg0 == 1) {
			return aClass214_2;
		} else if (arg0 == 2) {
			return aClass214_3;
		} else if (arg0 == 3) {
			return aClass214_4;
		} else if (arg0 == 4) {
			return aClass214_5;
		} else if (arg0 == 5) {
			return aClass214_6;
		} else if (arg0 == 6) {
			return aClass214_7;
		} else {
			return null;
		}
	}
}
