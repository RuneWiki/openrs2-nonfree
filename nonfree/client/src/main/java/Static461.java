import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static461 {

	@OriginalMember(owner = "client!rn", name = "O", descriptor = "[I")
	public static final int[] anIntArray516 = new int[8];

	@OriginalMember(owner = "client!rn", name = "P", descriptor = "Lclient!jn;")
	public static final Class167 aClass167_48 = new Class167(260);

	@OriginalMember(owner = "client!rn", name = "T", descriptor = "I")
	public static int anInt8826 = 999999;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(CI)Z")
	public static boolean method6780(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!rd;")
	public static RuntimeException_Sub1 method6781(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString179 = local12.aString179 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIII)I")
	public static int method6782(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static255.aClass115Array2 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg2 >> 9;
		@Pc(15) int local15 = arg0 >> 9;
		if (local11 < 0 || local15 < 0 || Static338.anInt6508 - 1 < local11 || Static390.anInt7654 - 1 < local15) {
			return 0;
		}
		@Pc(39) int local39 = arg1;
		if (arg1 < 3 && (Static266.aByteArrayArrayArray10[1][local11][local15] & 0x2) != 0) {
			local39 = arg1 + 1;
		}
		return Static255.aClass115Array2[local39].method8064(arg2, arg0);
	}
}
