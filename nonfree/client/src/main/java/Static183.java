import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
	public static int anInt3911 = 0;

	@OriginalMember(owner = "client!ub", name = "o", descriptor = "[I")
	public static final int[] anIntArray449 = new int[100];

	@OriginalMember(owner = "client!ub", name = "q", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2320 = Static118.method2249("(U5");

	@OriginalMember(owner = "client!ub", name = "s", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2321 = Static118.method2249("title)3jpg");

	@OriginalMember(owner = "client!ub", name = "z", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2324 = Static118.method2249("Loading config )2 ");

	@OriginalMember(owner = "client!ub", name = "u", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2322 = aClass65_2324;

	@OriginalMember(owner = "client!ub", name = "v", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2323 = Static118.method2249(" <col=00ff80>");

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II[BB)Lclient!oc;")
	public static Class65 method2975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(3) Class65 local3 = new Class65();
		local3.anInt3190 = 0;
		local3.aByteArray37 = new byte[arg1];
		for (@Pc(12) int local12 = arg0; local12 < arg1 + arg0; local12++) {
			if (arg2[local12] != 0) {
				local3.aByteArray37[local3.anInt3190++] = arg2[local12];
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)V")
	public static void method2977(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int[] local8 = new int[4];
		@Pc(11) int[] local11 = new int[4];
		local8[0] = arg1;
		local11[0] = arg0;
		@Pc(29) int local29 = 1;
		for (@Pc(31) int local31 = 0; local31 < 4; local31++) {
			if (Static77.anIntArray217[local31] != arg1) {
				local8[local29] = Static77.anIntArray217[local31];
				local11[local29] = Static184.anIntArray462[local31];
				local29++;
			}
		}
		Static77.anIntArray217 = local8;
		Static184.anIntArray462 = local11;
		Static188.method3127(0, Static184.anIntArray462, Static195.aClass3Array1.length - 1, Static77.anIntArray217, Static195.aClass3Array1);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)I")
	public static int method2978(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)I")
	public static int method2979() {
		if (Static119.aDouble9 == 3.0D) {
			return 37;
		} else if (Static119.aDouble9 == 4.0D) {
			return 50;
		} else if (Static119.aDouble9 == 6.0D) {
			return 75;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIIII)I")
	public static int method2980(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg1 & 0x1) == 1) {
			@Pc(10) int local10 = arg0;
			arg0 = arg5;
			arg5 = local10;
		}
		@Pc(18) int local18 = arg3 & 0x3;
		if (local18 == 0) {
			return arg4;
		} else if (local18 == 1) {
			return arg2;
		} else if (local18 == 2) {
			return 1 + 7 - arg0 - arg4;
		} else {
			return 1 + 7 - arg5 - arg2;
		}
	}
}
