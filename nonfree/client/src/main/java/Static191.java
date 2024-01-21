import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!uh", name = "cb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray50;

	@OriginalMember(owner = "client!uh", name = "M", descriptor = "Lclient!ig;")
	public static final Class47 aClass47_25 = new Class47(64);

	@OriginalMember(owner = "client!uh", name = "P", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1952 = Static187.method3089("cyan:");

	@OriginalMember(owner = "client!uh", name = "W", descriptor = "I")
	public static volatile int anInt4162 = 0;

	@OriginalMember(owner = "client!uh", name = "X", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1953 = aClass92_1952;

	@OriginalMember(owner = "client!uh", name = "fb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1955 = aClass92_1952;

	@OriginalMember(owner = "client!uh", name = "gb", descriptor = "I")
	public static int anInt4168 = 0;

	@OriginalMember(owner = "client!uh", name = "hb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1956 = Static187.method3089("hint_mapedge");

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(BILclient!ab;ZLclient!ab;)Lclient!j;")
	public static Class1_Sub3_Sub10 method3128(@OriginalArg(1) int arg0, @OriginalArg(2) Class3 arg1, @OriginalArg(4) Class3 arg2) {
		@Pc(10) int[] local10 = arg2.method3258(arg0);
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < local10.length; local14++) {
			@Pc(24) byte[] local24 = arg2.method3275(local10[local14], arg0);
			if (local24 == null) {
				local12 = false;
			} else {
				@Pc(44) int local44 = local24[1] & 0xFF | (local24[0] & 0xFF) << 8;
				@Pc(60) byte[] local60 = arg1.method3275(0, local44);
				if (local60 == null) {
					local12 = false;
				}
			}
		}
		if (!local12) {
			return null;
		}
		try {
			return new Class1_Sub3_Sub10(arg2, arg1, arg0, false);
		} catch (@Pc(94) Exception local94) {
			return null;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIII)I")
	public static int method3129(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14 = arg0 - 1 & arg2;
		@Pc(18) int local18 = arg2 / arg0;
		@Pc(24) int local24 = arg1 & arg0 - 1;
		@Pc(28) int local28 = arg1 / arg0;
		@Pc(33) int local33 = Static164.method2561(local18, local28);
		@Pc(42) int local42 = Static164.method2561(local18 + 1, local28);
		@Pc(49) int local49 = Static164.method2561(local18, local28 + 1);
		@Pc(60) int local60 = Static164.method2561(local18 + 1, local28 + 1);
		@Pc(67) int local67 = Static163.method2692(local14, local33, arg0, local42);
		@Pc(74) int local74 = Static163.method2692(local14, local49, arg0, local60);
		return Static163.method2692(local24, local67, arg0, local74);
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(II)I")
	public static int method3130(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!ab;ILclient!vd;Lclient!vd;)[Lclient!va;")
	public static Class1_Sub3_Sub1_Sub5[] method3131(@OriginalArg(0) Class3 arg0, @OriginalArg(2) Class92 arg1, @OriginalArg(3) Class92 arg2) {
		@Pc(17) int local17 = arg0.method3246(arg1);
		@Pc(23) int local23 = arg0.method3262(arg2, local17);
		return Static185.method2996(local17, arg0, local23);
	}

	@OriginalMember(owner = "client!uh", name = "f", descriptor = "(I)V")
	public static void method3132() {
		Static31.aClass47_4.method1276();
		Static97.aClass77_4.method2260();
		Static66.aClass47_10.method1276();
	}
}
