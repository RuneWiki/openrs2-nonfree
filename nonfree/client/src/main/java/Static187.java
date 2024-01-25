import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!mb", name = "X", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray27;

	@OriginalMember(owner = "client!mb", name = "I", descriptor = "[I")
	public static final int[] anIntArray461 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!mb", name = "J", descriptor = "I")
	public static int anInt3893 = 0;

	@OriginalMember(owner = "client!mb", name = "V", descriptor = "I")
	public static int anInt3904 = 0;

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)I")
	public static int method3637() {
		return Static199.anInt4059;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(III)V")
	public static void method3638(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static190.aClass140_99 = new Class140(arg0);
		Static175.aClass140_94 = new Class140(arg1);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IBIIIIIIIIIII)V")
	public static void method3639(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(7) Class1_Sub5 local7 = new Class1_Sub5();
		local7.anInt415 = arg11;
		local7.anInt407 = arg3;
		local7.anInt408 = arg10;
		local7.anInt421 = arg9;
		local7.anInt416 = arg4;
		local7.anInt419 = arg6;
		local7.anInt406 = arg7;
		local7.anInt420 = arg1;
		local7.anInt414 = arg2;
		local7.anInt411 = arg8;
		local7.anInt417 = arg0;
		local7.anInt412 = arg5;
		Static92.aClass195_14.method5018(local7);
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(IZI)I")
	public static int method3641(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local7 *= arg1;
			}
			arg1 *= arg1;
			arg0 >>= 0x1;
		}
		if (arg0 == 1) {
			return local7 * arg1;
		} else {
			return local7;
		}
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(II)V")
	public static void method3642() {
		Static156.aClass140_81.method3824(5);
	}
}
