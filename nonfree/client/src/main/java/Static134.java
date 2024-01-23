import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!le", name = "e", descriptor = "I")
	public static int anInt3305;

	@OriginalMember(owner = "client!le", name = "b", descriptor = "I")
	public static int anInt3302 = 0;

	@OriginalMember(owner = "client!le", name = "c", descriptor = "I")
	public static int anInt3303 = 0;

	@OriginalMember(owner = "client!le", name = "g", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray27 = new String[100];

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
	public static void method2493() {
		Static81.aClass79_10.method2489();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(III)I")
	public static int method2494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class1_Sub23 local16 = (Class1_Sub23) Static249.aClass140_17.method4014((long) arg1);
		if (local16 == null) {
			return 0;
		} else if (arg0 >= 0 && local16.anIntArray343.length > arg0) {
			return local16.anIntArray343[arg0];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ZC)Z")
	public static boolean method2496(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(33) int local33 = 0;
			@Pc(35) char[] local35 = Static95.aCharArray1;
			while (local33 < local35.length) {
				@Pc(41) char local41 = local35[local33];
				if (local41 == arg0) {
					return true;
				}
				local33++;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(III)I")
	public static int method2497(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(III)I")
	public static int method2498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class1_Sub23 local12 = (Class1_Sub23) Static249.aClass140_17.method4014((long) arg1);
		if (local12 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(31) int local31 = 0;
			for (@Pc(33) int local33 = 0; local33 < local12.anIntArray343.length; local33++) {
				if (arg0 == local12.anIntArray342[local33]) {
					local31 += local12.anIntArray343[local33];
				}
			}
			return local31;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method2499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}
}
