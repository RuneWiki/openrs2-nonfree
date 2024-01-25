import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
	public static int anInt2984;

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_148 = new Class123(98, 6);

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "[I")
	public static final int[] anIntArray183 = new int[4096];

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IC)Z")
	public static boolean method2488(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(37) char[] local37 = Static336.aCharArray4;
			for (@Pc(39) int local39 = 0; local39 < local37.length; local39++) {
				@Pc(45) char local45 = local37[local39];
				if (local45 == arg0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLclient!qp;Lclient!qp;IZ)I")
	public static int method2489(@OriginalArg(1) Class152_Sub1 arg0, @OriginalArg(2) Class152_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(12) int local12;
		if (arg2 == 1) {
			@Pc(9) int local9 = arg0.anInt5622;
			local12 = arg1.anInt5622;
			if (!arg3) {
				if (local9 == -1) {
					local9 = 2001;
				}
				if (local12 == -1) {
					local12 = 2001;
				}
			}
			return local9 - local12;
		} else if (arg2 == 2) {
			return Static268.method4088(arg0.method4729().aString20, arg1.method4729().aString20, Static161.anInt3239);
		} else if (arg2 == 3) {
			if (arg0.aString47.equals("-")) {
				if (arg1.aString47.equals("-")) {
					return 0;
				} else if (arg3) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg1.aString47.equals("-")) {
				return arg3 ? 1 : -1;
			} else {
				return Static268.method4088(arg0.aString47, arg1.aString47, Static161.anInt3239);
			}
		} else if (arg2 == 4) {
			if (arg0.method4725()) {
				return arg1.method4725() ? 0 : 1;
			} else if (arg1.method4725()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 5) {
			if (arg0.method4721()) {
				return arg1.method4721() ? 0 : 1;
			} else if (arg1.method4721()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 6) {
			if (arg0.method4722()) {
				return arg1.method4722() ? 0 : 1;
			} else if (arg1.method4722()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 7) {
			if (arg0.method4726()) {
				return arg1.method4726() ? 0 : 1;
			} else if (arg1.method4726()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 8) {
			local12 = arg0.anInt5638;
			@Pc(200) int local200 = arg1.anInt5638;
			if (arg3) {
				if (local12 == 1000) {
					local12 = -1;
				}
				if (local200 == 1000) {
					local200 = -1;
				}
			} else {
				if (local12 == -1) {
					local12 = 1000;
				}
				if (local200 == -1) {
					local200 = 1000;
				}
			}
			return local12 - local200;
		} else {
			return arg0.anInt5635 - arg1.anInt5635;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIII)V")
	public static void method2490(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static268.anInt4864 = arg3;
		Static308.anInt5415 = arg1;
		Static303.anInt5375 = arg2;
		client.lb = arg0;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!he;II)Lclient!mo;")
	public static Class166 method2491(@OriginalArg(0) Class100 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte[] local8 = arg0.method2515(arg1);
		return local8 == null ? null : new Class166(local8);
	}
}
