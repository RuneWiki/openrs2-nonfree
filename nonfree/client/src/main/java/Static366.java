import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!md", name = "I", descriptor = "I")
	public static int anInt6933;

	@OriginalMember(owner = "client!md", name = "L", descriptor = "Lclient!hi;")
	public static Class2_Sub30 aClass2_Sub30_1;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIIIZII)V")
	public static void method6210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg5 == arg3 && arg1 == arg2 && arg7 == arg6 && arg8 == arg0) {
			Static414.method6774(arg7, arg8, arg4, arg3, arg1);
			return;
		}
		@Pc(36) int local36 = arg3;
		@Pc(38) int local38 = arg1;
		@Pc(42) int local42 = arg3 * 3;
		@Pc(46) int local46 = arg1 * 3;
		@Pc(50) int local50 = arg5 * 3;
		@Pc(54) int local54 = arg2 * 3;
		@Pc(58) int local58 = arg6 * 3;
		@Pc(62) int local62 = arg0 * 3;
		@Pc(72) int local72 = local50 + arg7 - arg3 - local58;
		@Pc(82) int local82 = local54 + arg8 - arg1 - local62;
		@Pc(92) int local92 = local58 + local42 - local50 - local50;
		@Pc(101) int local101 = local62 + local46 - local54 - local54;
		@Pc(105) int local105 = local50 - local42;
		@Pc(109) int local109 = local54 - local46;
		for (@Pc(111) int local111 = 128; local111 <= 4096; local111 += 128) {
			@Pc(119) int local119 = local111 * local111 >> 12;
			@Pc(125) int local125 = local119 * local111 >> 12;
			@Pc(129) int local129 = local72 * local125;
			@Pc(133) int local133 = local82 * local125;
			@Pc(137) int local137 = local92 * local119;
			@Pc(141) int local141 = local101 * local119;
			@Pc(145) int local145 = local105 * local111;
			@Pc(149) int local149 = local111 * local109;
			@Pc(159) int local159 = (local145 + local137 + local129 >> 12) + arg3;
			@Pc(169) int local169 = (local149 + local141 + local133 >> 12) + arg1;
			Static414.method6774(local159, local169, arg4, local36, local38);
			local36 = local159;
			local38 = local169;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "([Lclient!uf;II)V")
	public static void method6211(@OriginalArg(0) Class357[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(10) int local10 = 0; local10 < arg0.length; local10++) {
			@Pc(16) Class357 local16 = arg0[local10];
			if (local16 != null) {
				if (local16.anInt10430 == 0) {
					if (local16.aClass357Array2 != null) {
						method6211(local16.aClass357Array2, arg1);
					}
					@Pc(40) Class2_Sub20 local40 = (Class2_Sub20) Static507.aClass335_33.method8357((long) local16.anInt10460);
					if (local40 != null) {
						Static525.method8170(local40.anInt1667, arg1);
					}
				}
				@Pc(59) Class2_Sub45 local59;
				if (arg1 == 0 && local16.anObjectArray24 != null) {
					local59 = new Class2_Sub45();
					local59.aClass357_131 = local16;
					local59.anObjectArray2 = local16.anObjectArray24;
					Static518.method8031(local59);
				}
				if (arg1 == 1 && local16.anObjectArray34 != null) {
					if (local16.anInt10432 >= 0) {
						@Pc(85) Class357 local85 = Static647.method9532(local16.anInt10460);
						if (local85 == null || local85.aClass357Array2 == null || local16.anInt10432 >= local85.aClass357Array2.length || local85.aClass357Array2[local16.anInt10432] != local16) {
							continue;
						}
					}
					local59 = new Class2_Sub45();
					local59.anObjectArray2 = local16.anObjectArray34;
					local59.aClass357_131 = local16;
					Static518.method8031(local59);
				}
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "g", descriptor = "(I)V")
	public static void method6212() {
		if (Static43.anInt8888 < 0) {
			Static43.anInt8888 = 0;
			Static22.anInt389 = -1;
			Static69.anInt1350 = -1;
		}
		if (Static331.anInt10587 < Static43.anInt8888) {
			Static69.anInt1350 = -1;
			Static43.anInt8888 = Static331.anInt10587;
			Static22.anInt389 = -1;
		}
		if (Static609.anInt10718 < 0) {
			Static609.anInt10718 = 0;
			Static69.anInt1350 = -1;
			Static22.anInt389 = -1;
		}
		if (Static609.anInt10718 > Static331.anInt10594) {
			Static609.anInt10718 = Static331.anInt10594;
			Static69.anInt1350 = -1;
			Static22.anInt389 = -1;
		}
	}
}
