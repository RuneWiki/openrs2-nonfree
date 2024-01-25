import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "I")
	public static int anInt7101;

	@OriginalMember(owner = "client!nt", name = "d", descriptor = "I")
	public static int anInt7104;

	@OriginalMember(owner = "client!nt", name = "f", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_69 = new Class257(42, 3);

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "(I)J")
	public static long method5846() {
		return Static538.aClass109_1.method4082();
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(III)Z")
	public static boolean method5847(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static536.method7560(arg0, arg1)) {
			return Static33.method1193(arg0, arg1) | (arg0 & 0x9000) != 0 | Static46.method1368(arg1, arg0) ? true : ((arg0 & 0x2000) != 0 | Static271.method4662(arg0, arg1) | Static571.method7931(arg1, arg0)) & (arg1 & 0x37) == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIII)V")
	public static void method5848(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class8_Sub4 local10 = (Class8_Sub4) Static584.aClass43_63.method1422(); local10 != null; local10 = (Class8_Sub4) Static584.aClass43_63.method1426()) {
			Static511.method7367(local10, arg3, arg1, arg2, arg0);
		}
		@Pc(181) boolean local181;
		for (@Pc(39) Class8_Sub4 local39 = (Class8_Sub4) Static295.aClass43_32.method1422(); local39 != null; local39 = (Class8_Sub4) Static295.aClass43_32.method1426()) {
			@Pc(43) byte local43 = 1;
			@Pc(48) Class102 local48 = local39.aClass15_Sub1_Sub2_Sub2_Sub2_1.method6686();
			if (local39.aClass15_Sub1_Sub2_Sub2_Sub2_1.anInt8107 == -1 || local39.aClass15_Sub1_Sub2_Sub2_Sub2_1.aBoolean585) {
				local43 = 0;
			} else if (local48.anInt3731 == local39.aClass15_Sub1_Sub2_Sub2_Sub2_1.anInt8107 || local48.anInt3744 == local39.aClass15_Sub1_Sub2_Sub2_Sub2_1.anInt8107 || local48.anInt3753 == local39.aClass15_Sub1_Sub2_Sub2_Sub2_1.anInt8107 || local48.anInt3740 == local39.aClass15_Sub1_Sub2_Sub2_Sub2_1.anInt8107) {
				local43 = 2;
			} else if (local48.anInt3763 == local39.aClass15_Sub1_Sub2_Sub2_Sub2_1.anInt8107 || local39.aClass15_Sub1_Sub2_Sub2_Sub2_1.anInt8107 == local48.anInt3734 || local39.aClass15_Sub1_Sub2_Sub2_Sub2_1.anInt8107 == local48.anInt3760 || local48.anInt3755 == local39.aClass15_Sub1_Sub2_Sub2_Sub2_1.anInt8107) {
				local43 = 3;
			}
			if (local39.anInt1044 != local43) {
				@Pc(140) int local140 = Static627.method8455(local39.aClass15_Sub1_Sub2_Sub2_Sub2_1);
				@Pc(144) Class300 local144 = local39.aClass15_Sub1_Sub2_Sub2_Sub2_1.aClass300_1;
				if (local144.anIntArray498 != null) {
					local144 = local144.method7306(Static420.aClass77_1);
				}
				if (local144 == null || local140 == -1) {
					local39.aBoolean101 = false;
					local39.anInt1044 = local43;
					local39.anInt1055 = -1;
				} else if (local140 == local39.anInt1055 && local144.aBoolean632 == local39.aBoolean101) {
					local39.anInt1048 = local144.anInt8889;
					local39.anInt1044 = local43;
				} else {
					local181 = false;
					if (local39.aClass8_Sub16_Sub3_2 == null) {
						local181 = true;
					} else {
						local39.anInt1048 -= 512;
						if (local39.anInt1048 <= 0) {
							Static15.aClass8_Sub16_Sub5_1.method7443(local39.aClass8_Sub16_Sub3_2);
							local181 = true;
							local39.aClass8_Sub16_Sub3_2 = null;
						}
					}
					if (local181) {
						local39.aClass8_Sub13_1 = null;
						local39.aBoolean101 = local144.aBoolean632;
						local39.anInt1055 = local140;
						local39.aClass8_Sub9_Sub1_1 = null;
						local39.anInt1044 = local43;
						local39.anInt1048 = local144.anInt8889;
					}
				}
			}
			local39.anInt1056 = local39.aClass15_Sub1_Sub2_Sub2_Sub2_1.anInt10301;
			local39.anInt1054 = local39.aClass15_Sub1_Sub2_Sub2_Sub2_1.anInt10301 + (local39.aClass15_Sub1_Sub2_Sub2_Sub2_1.method6692() << 8);
			local39.anInt1059 = local39.aClass15_Sub1_Sub2_Sub2_Sub2_1.anInt10298;
			local39.anInt1049 = local39.aClass15_Sub1_Sub2_Sub2_Sub2_1.anInt10298 + (local39.aClass15_Sub1_Sub2_Sub2_Sub2_1.method6692() << 8);
			Static511.method7367(local39, arg3, arg1, arg2, arg0);
		}
		for (@Pc(295) Class8_Sub4 local295 = (Class8_Sub4) Static413.aClass253_30.method6593(); local295 != null; local295 = (Class8_Sub4) Static413.aClass253_30.method6595()) {
			@Pc(299) byte local299 = 1;
			@Pc(304) Class102 local304 = local295.aClass15_Sub1_Sub2_Sub2_Sub1_1.method6686();
			if (local295.aClass15_Sub1_Sub2_Sub2_Sub1_1.anInt8107 == -1 || local295.aClass15_Sub1_Sub2_Sub2_Sub1_1.aBoolean585) {
				local299 = 0;
			} else if (local295.aClass15_Sub1_Sub2_Sub2_Sub1_1.anInt8107 == local304.anInt3731 || local304.anInt3744 == local295.aClass15_Sub1_Sub2_Sub2_Sub1_1.anInt8107 || local295.aClass15_Sub1_Sub2_Sub2_Sub1_1.anInt8107 == local304.anInt3753 || local295.aClass15_Sub1_Sub2_Sub2_Sub1_1.anInt8107 == local304.anInt3740) {
				local299 = 2;
			} else if (local295.aClass15_Sub1_Sub2_Sub2_Sub1_1.anInt8107 == local304.anInt3763 || local304.anInt3734 == local295.aClass15_Sub1_Sub2_Sub2_Sub1_1.anInt8107 || local304.anInt3760 == local295.aClass15_Sub1_Sub2_Sub2_Sub1_1.anInt8107 || local295.aClass15_Sub1_Sub2_Sub2_Sub1_1.anInt8107 == local304.anInt3755) {
				local299 = 3;
			}
			if (local295.anInt1044 != local299) {
				@Pc(389) int local389 = Static122.method2760(local295.aClass15_Sub1_Sub2_Sub2_Sub1_1);
				if (local295.anInt1055 == local389 && local295.aBoolean101 == local295.aClass15_Sub1_Sub2_Sub2_Sub1_1.aBoolean250) {
					local295.anInt1044 = local299;
					local295.anInt1048 = local295.aClass15_Sub1_Sub2_Sub2_Sub1_1.anInt3285;
				} else {
					local181 = false;
					if (local295.aClass8_Sub16_Sub3_2 == null) {
						local181 = true;
					} else {
						local295.anInt1048 -= 512;
						if (local295.anInt1048 <= 0) {
							Static15.aClass8_Sub16_Sub5_1.method7443(local295.aClass8_Sub16_Sub3_2);
							local181 = true;
							local295.aClass8_Sub16_Sub3_2 = null;
						}
					}
					if (local181) {
						local295.aBoolean101 = local295.aClass15_Sub1_Sub2_Sub2_Sub1_1.aBoolean250;
						local295.anInt1055 = local389;
						local295.anInt1044 = local299;
						local295.aClass8_Sub13_1 = null;
						local295.anInt1048 = local295.aClass15_Sub1_Sub2_Sub2_Sub1_1.anInt3285;
						local295.aClass8_Sub9_Sub1_1 = null;
					}
				}
			}
			local295.anInt1056 = local295.aClass15_Sub1_Sub2_Sub2_Sub1_1.anInt10301;
			local295.anInt1054 = local295.aClass15_Sub1_Sub2_Sub2_Sub1_1.anInt10301 + (local295.aClass15_Sub1_Sub2_Sub2_Sub1_1.method6692() << 8);
			local295.anInt1059 = local295.aClass15_Sub1_Sub2_Sub2_Sub1_1.anInt10298;
			local295.anInt1049 = local295.aClass15_Sub1_Sub2_Sub2_Sub1_1.anInt10298 + (local295.aClass15_Sub1_Sub2_Sub2_Sub1_1.method6692() << 8);
			Static511.method7367(local295, arg3, arg1, arg2, arg0);
		}
	}
}
