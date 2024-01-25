import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!go", name = "z", descriptor = "[I")
	public static int[] anIntArray161;

	@OriginalMember(owner = "client!go", name = "v", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_102 = new Class103(31, 0);

	@OriginalMember(owner = "client!go", name = "y", descriptor = "I")
	public static int anInt2410 = 0;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIB)V")
	public static void method2064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class1_Sub5_Sub11 local14 = Static188.method2688(arg1, 16);
		local14.method2661();
		local14.anInt3213 = arg0;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!jn;Lclient!jn;I)V")
	public static void method2065(@OriginalArg(0) Class1_Sub5 arg0, @OriginalArg(1) Class1_Sub5 arg1) {
		if (arg1.aClass1_Sub5_58 != null) {
			arg1.method5305();
		}
		arg1.aClass1_Sub5_57 = arg0.aClass1_Sub5_57;
		arg1.aClass1_Sub5_58 = arg0;
		arg1.aClass1_Sub5_58.aClass1_Sub5_57 = arg1;
		arg1.aClass1_Sub5_57.aClass1_Sub5_58 = arg1;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IBI)Z")
	public static boolean method2066(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(JB)V")
	public static void method2067(@OriginalArg(0) long arg0) {
		Static18.aClass1_Sub28_Sub1_1.anInt6812 = 0;
		Static18.aClass1_Sub28_Sub1_1.method5398(Static180.aClass99_8.anInt2588);
		Static18.aClass1_Sub28_Sub1_1.method5371(arg0);
		Static18.aClass1_Sub28_Sub1_1.method5398(Static394.anInt6582);
		Static408.anInt6718 = 1;
		Static411.anInt6757 = -3;
		Static437.anInt7330 = 0;
		Static324.anInt5564 = 0;
	}

	@OriginalMember(owner = "client!go", name = "c", descriptor = "(ZI)V")
	public static void method2069(@OriginalArg(1) int arg0) {
		for (@Pc(11) Class1 local11 = Static194.aClass199_186.method4392(); local11 != null; local11 = Static194.aClass199_186.method4393()) {
			if ((long) arg0 == (local11.aLong230 >> 48 & 0xFFFFL)) {
				local11.method5915();
			}
		}
	}
}
