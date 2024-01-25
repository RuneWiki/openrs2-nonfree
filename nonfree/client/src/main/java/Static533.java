import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static533 {

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "I")
	public static int anInt8763;

	@OriginalMember(owner = "client!saa", name = "b", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_176 = new Class126(123, 6);

	@OriginalMember(owner = "client!saa", name = "m", descriptor = "I")
	public static int anInt8771 = -1;

	@OriginalMember(owner = "client!saa", name = "p", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_126 = new Class376(83, 3);

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "([BB)Lclient!fp;")
	public static Class3_Sub6_Sub9 method7419(@OriginalArg(0) byte[] arg0) {
		@Pc(9) Class3_Sub6_Sub9 local9 = new Class3_Sub6_Sub9();
		@Pc(14) Class3_Sub17 local14 = new Class3_Sub17(arg0);
		local14.lb = local14.aByteArray59.length - 2;
		@Pc(25) int local25 = local14.method4858();
		@Pc(36) int local36 = local14.aByteArray59.length - local25 - 2 - 16;
		local14.lb = local36;
		@Pc(43) int local43 = local14.method4868();
		local9.anInt3317 = local14.method4858();
		local9.anInt3310 = local14.method4858();
		local9.anInt3311 = local14.method4858();
		local9.anInt3313 = local14.method4858();
		local9.anInt3316 = local14.method4858();
		local9.anInt3315 = local14.method4858();
		@Pc(81) int local81 = local14.method4888();
		@Pc(89) int local89;
		@Pc(97) int local97;
		if (local81 > 0) {
			local9.aClass62Array1 = new Class62[local81];
			for (local89 = 0; local89 < local81; local89++) {
				local97 = local14.method4858();
				@Pc(104) Class62 local104 = new Class62(Static527.method7377(local97));
				local9.aClass62Array1[local89] = local104;
				while (local97-- > 0) {
					@Pc(115) int local115 = local14.method4868();
					@Pc(119) int local119 = local14.method4868();
					local104.method1686((long) local115, new Class3_Sub53(local119));
				}
			}
		}
		local14.lb = 0;
		local9.aString35 = local14.method4897();
		local9.anIntArray229 = new int[local43];
		local89 = 0;
		while (local14.lb < local36) {
			local97 = local14.method4858();
			if (local97 == 3) {
				if (local9.aStringArray25 == null) {
					local9.aStringArray25 = new String[local43];
				}
				local9.aStringArray25[local89] = local14.method4847().intern();
			} else if (local97 == 54) {
				if (local9.aLongArray1 == null) {
					local9.aLongArray1 = new long[local43];
				}
				local9.aLongArray1[local89] = local14.method4865();
			} else {
				if (local9.anIntArray228 == null) {
					local9.anIntArray228 = new int[local43];
				}
				if (local97 >= 150 || local97 == 21 || local97 == 38 || local97 == 39) {
					local9.anIntArray228[local89] = local14.method4888();
				} else {
					local9.anIntArray228[local89] = local14.method4868();
				}
			}
			local9.anIntArray229[local89++] = local97;
		}
		return local9;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(IIIIIII)Lclient!en;")
	public static Class106 method7424(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg1 * 986053L ^ (long) arg5 * 475427L ^ (long) arg4 * 97549L ^ (long) arg3 * 67481L ^ (long) arg2 * 32147369L ^ (long) arg0 * 76724863L;
		@Pc(39) Class106 local39 = (Class106) Static240.aClass279_24.method6631(local33);
		if (local39 == null) {
			local39 = Static355.aClass16_6.method8177(arg3, arg4, arg5, arg1, arg2, arg0);
			Static240.aClass279_24.method6635(local39, local33);
			return local39;
		} else {
			return local39;
		}
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(IB)V")
	public static void method7425(@OriginalArg(0) int arg0) {
		@Pc(9) Class3_Sub6_Sub7 local9 = Static198.method3146((long) arg0, 11);
		local9.method1709();
	}
}
