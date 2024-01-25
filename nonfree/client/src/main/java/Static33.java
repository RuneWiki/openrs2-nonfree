import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString9 = "";

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(13) int local13 = arg5 + arg0;
		@Pc(18) int local18 = arg3 - arg5;
		for (@Pc(20) int local20 = arg0; local20 < local13; local20++) {
			Static526.method7369(Static299.anIntArrayArray58[local20], arg1, arg2, arg6);
		}
		@Pc(39) int local39 = arg1 - arg5;
		@Pc(43) int local43 = arg5 + arg2;
		for (@Pc(45) int local45 = arg3; local45 > local18; local45--) {
			Static526.method7369(Static299.anIntArrayArray58[local45], arg1, arg2, arg6);
		}
		for (@Pc(65) int local65 = local13; local65 <= local18; local65++) {
			@Pc(71) int[] local71 = Static299.anIntArrayArray58[local65];
			Static526.method7369(local71, local43, arg2, arg6);
			Static526.method7369(local71, local39, local43, arg4);
			Static526.method7369(local71, arg1, local39, arg6);
		}
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)Lclient!bi;")
	public static Class3_Sub8 method1061() {
		if (Static574.aClass193_53 == null || Static612.aClass191_1 == null) {
			return null;
		}
		Static612.aClass191_1.method4409(Static574.aClass193_53);
		@Pc(23) Class3_Sub8 local23 = (Class3_Sub8) Static612.aClass191_1.method4410();
		if (local23 == null) {
			return null;
		} else {
			@Pc(35) Class145 local35 = Static574.aClass321_3.method7485(local23.anInt1242);
			return local35 != null && local35.aBoolean288 && local35.method3156(Static574.anInterface15_2) ? local23 : Static667.method8672();
		}
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(ILclient!dja;IBII)V")
	public static void method1062(@OriginalArg(0) int arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class3_Sub49 local7 = null;
		for (@Pc(24) Class3_Sub49 local24 = (Class3_Sub49) Static647.aClass193_70.method4457(); local24 != null; local24 = (Class3_Sub49) Static647.aClass193_70.method4459()) {
			if (local24.anInt8927 == arg4 && local24.anInt8929 == arg2 && local24.anInt8924 == arg0 && local24.anInt8928 == arg3) {
				local7 = local24;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class3_Sub49();
			local7.anInt8927 = arg4;
			local7.anInt8928 = arg3;
			local7.anInt8929 = arg2;
			local7.anInt8924 = arg0;
			Static647.aClass193_70.method4462(local7);
		}
		local7.aBoolean665 = false;
		local7.aClass81_1 = arg1;
		local7.aBoolean664 = true;
	}
}
