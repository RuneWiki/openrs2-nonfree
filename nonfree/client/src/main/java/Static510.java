import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static510 {

	@OriginalMember(owner = "client!sa", name = "n", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_99 = new Class185(75, 0);

	@OriginalMember(owner = "client!sa", name = "J", descriptor = "[I")
	public static final int[] anIntArray449 = new int[14];

	@OriginalMember(owner = "client!sa", name = "K", descriptor = "J")
	public static long aLong238 = -1L;

	@OriginalMember(owner = "client!sa", name = "Q", descriptor = "I")
	public static int anInt8806 = 64;

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "(I)V")
	public static void method7302() {
		for (@Pc(6) Class6_Sub45 local6 = (Class6_Sub45) Static590.aClass163_60.method4966(); local6 != null; local6 = (Class6_Sub45) Static590.aClass163_60.method4965()) {
			if (local6.aBoolean660) {
				local6.method6945();
			}
		}
		for (@Pc(35) Class6_Sub45 local35 = (Class6_Sub45) Static610.aClass163_61.method4966(); local35 != null; local35 = (Class6_Sub45) Static610.aClass163_61.method4965()) {
			if (local35.aBoolean660) {
				local35.method6945();
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIZIIII)I")
	public static int method7307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg3 & 0x3;
		if ((arg1 & 0x1) == 1) {
			@Pc(12) int local12 = arg4;
			arg4 = arg5;
			arg5 = local12;
		}
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 7 + 1 - arg0 - arg4;
		} else {
			return 1 + 7 - arg5 - arg2;
		}
	}
}
