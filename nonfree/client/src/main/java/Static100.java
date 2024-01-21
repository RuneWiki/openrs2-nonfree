import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!md", name = "i", descriptor = "[Lclient!sd;")
	public static Class73[] aClass73Array13;

	@OriginalMember(owner = "client!md", name = "m", descriptor = "[Lclient!re;")
	public static Class3_Sub1_Sub3_Sub4[] aClass3_Sub1_Sub3_Sub4Array7;

	@OriginalMember(owner = "client!md", name = "r", descriptor = "Lclient!ha;")
	public static Class29 aClass29_8;

	@OriginalMember(owner = "client!md", name = "c", descriptor = "I")
	public static int anInt2210 = 0;

	@OriginalMember(owner = "client!md", name = "f", descriptor = "I")
	public static int anInt2212 = 0;

	@OriginalMember(owner = "client!md", name = "k", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1264 = Static122.method531("hitmarks");

	@OriginalMember(owner = "client!md", name = "y", descriptor = "I")
	public static int anInt2225 = 0;

	@OriginalMember(owner = "client!md", name = "z", descriptor = "I")
	public static int anInt2226 = 0;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BLclient!sd;Z)V")
	public static void method1726(@OriginalArg(1) Class73 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class73 local11 = arg0.method2419();
		@Pc(14) short[] local14 = new short[16];
		@Pc(69) int local69;
		for (@Pc(20) int local20 = 0; local20 < Static117.anInt2799; local20++) {
			@Pc(26) Class3_Sub1_Sub7 local26 = Static3.method42(local20);
			if ((!arg1 || local26.aBoolean84) && local26.aClass73_680.method2419().method2429(local11) != -1) {
				if (local7 >= 100) {
					Static50.anInt1168 = -1;
					Static175.aShortArray37 = null;
					return;
				}
				if (local14.length <= local7) {
					@Pc(67) short[] local67 = new short[local14.length * 2];
					for (local69 = 0; local69 < local7; local69++) {
						local67[local69] = local14[local69];
					}
					local14 = local67;
				}
				local14[local7++] = (short) local20;
			}
		}
		Static104.anInt2353 = 0;
		@Pc(101) int local101 = local7;
		Static50.anInt1168 = local7;
		Static175.aShortArray37 = local14;
		@Pc(110) boolean local110;
		do {
			if (local101 <= 0) {
				return;
			}
			local101--;
			local110 = true;
			for (local69 = 0; local69 < local101; local69++) {
				@Pc(120) Class3_Sub1_Sub7 local120 = Static3.method42(local14[local69]);
				@Pc(128) Class3_Sub1_Sub7 local128 = Static3.method42(local14[local69 + 1]);
				if (local120.aClass73_680.method2408(local128.aClass73_680) > 0) {
					@Pc(139) short local139 = local14[local69];
					local14[local69] = local14[local69 + 1];
					local14[local69 + 1] = local139;
					local110 = false;
				}
			}
		} while (!local110);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V")
	public static void method1729() {
		aClass73Array13 = null;
		aClass3_Sub1_Sub3_Sub4Array7 = null;
		aClass73_1264 = null;
		aClass29_8 = null;
	}

	@OriginalMember(owner = "client!md", name = "f", descriptor = "(II)Lclient!ab;")
	public static Class3_Sub1_Sub1 method1730(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub1_Sub1 local10 = (Class3_Sub1_Sub1) Static96.aClass7_13.method183((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static129.aClass13_25.method348(4, arg0);
		local10 = new Class3_Sub1_Sub1();
		if (local20 != null) {
			local10.method43(new Class3_Sub12(local20), arg0);
		}
		local10.method45();
		Static96.aClass7_13.method186(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ILclient!f;II)Lclient!re;")
	public static Class3_Sub1_Sub3_Sub4 method1731(@OriginalArg(0) int arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(3) int arg2) {
		return Static133.method2204(arg0, arg2, arg1) ? Static133.method2205() : null;
	}
}
