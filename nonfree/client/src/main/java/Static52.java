import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "Lclient!gj;")
	public static Class31 aClass31_29;

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
	public static int anInt1117 = 0;

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
	public static int anInt1118 = 0;

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "[Lclient!tr;")
	public static final Class192[] aClass192Array1 = new Class192[4];

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
	public static int anInt1119 = -1;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
	public static void method1198() {
		if (!Static262.aBoolean479) {
			return;
		}
		@Pc(11) Class146 local11 = Static86.method1928(Static7.anInt157, Static48.anInt1094);
		if (local11 != null && local11.anObjectArray22 != null) {
			@Pc(20) Class2_Sub44 local20 = new Class2_Sub44();
			local20.anObjectArray35 = local11.anObjectArray22;
			local20.aClass146_18 = local11;
			Static72.method1646(local20);
		}
		Static139.anInt2893 = -1;
		Static262.aBoolean479 = false;
		Static256.anInt5081 = -1;
		if (local11 != null) {
			Static152.method2932(local11);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!qm;ILclient!jh;IIILclient!qr;I)V")
	public static void method1200(@OriginalArg(0) Class62_Sub1_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class96 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class62_Sub1_Sub2_Sub2 arg5, @OriginalArg(7) int arg6) {
		@Pc(12) Class2_Sub7 local12 = new Class2_Sub7();
		local12.anInt539 = arg4 * 128;
		local12.anInt534 = arg6 * 128;
		local12.anInt540 = arg1;
		if (arg2 != null) {
			local12.aClass96_1 = arg2;
			@Pc(33) int local33 = arg2.anInt3120;
			@Pc(36) int local36 = arg2.anInt3135;
			if (arg3 == 1 || arg3 == 3) {
				local33 = arg2.anInt3135;
				local36 = arg2.anInt3120;
			}
			local12.anInt548 = (arg4 + local36) * 128;
			local12.anIntArray33 = arg2.anIntArray256;
			local12.anInt536 = arg2.anInt3157;
			local12.anInt535 = (local33 + arg6) * 128;
			local12.anInt531 = arg2.anInt3146;
			local12.anInt545 = arg2.anInt3113;
			local12.anInt542 = arg2.anInt3133;
			local12.anInt533 = arg2.anInt3114 * 128;
			if (arg2.anIntArray259 != null) {
				local12.aBoolean65 = true;
				local12.method761();
			}
			if (local12.anIntArray33 != null) {
				local12.anInt543 = local12.anInt542 + (int) (Math.random() * (double) (local12.anInt545 - local12.anInt542));
			}
			Static47.aClass216_17.method5995(local12);
		} else if (arg0 != null) {
			local12.aClass62_Sub1_Sub2_Sub1_1 = arg0;
			@Pc(128) Class186 local128 = arg0.aClass186_1;
			if (local128.anIntArray432 != null) {
				local12.aBoolean65 = true;
				local128 = local128.method5206();
			}
			if (local128 != null) {
				local12.anInt548 = (arg4 + local128.anInt5977) * 128;
				local12.anInt535 = (local128.anInt5977 + arg6) * 128;
				local12.anInt536 = Static18.method666(arg0);
				local12.anInt533 = local128.anInt5972 * 128;
				local12.anInt531 = local128.anInt5976;
			}
			Static283.aClass216_43.method5995(local12);
		} else if (arg5 != null) {
			local12.aClass62_Sub1_Sub2_Sub2_1 = arg5;
			local12.anInt535 = (arg5.method4777() + arg6) * 128;
			local12.anInt548 = (arg5.method4777() + arg4) * 128;
			local12.anInt536 = Static24.method737(arg5);
			local12.anInt531 = arg5.anInt5391;
			local12.anInt533 = arg5.anInt5392 * 128;
			Static167.aClass199_17.method5749(local12, (long) arg5.anInt5328);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method1201(@OriginalArg(0) String arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static172.aStringArray29.length; local12++) {
			if (Static172.aStringArray29[local12].equalsIgnoreCase(arg0)) {
				return local12;
			}
		}
		return -1;
	}
}
