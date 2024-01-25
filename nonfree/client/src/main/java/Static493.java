import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static493 {

	@OriginalMember(owner = "client!sv", name = "o", descriptor = "Z")
	public static volatile boolean aBoolean599 = true;

	@OriginalMember(owner = "client!sv", name = "u", descriptor = "Lclient!db;")
	public static final Class64 aClass64_425 = new Class64(46, -2);

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(III)Z")
	public static boolean method7053(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIIIIIIBII)V")
	public static void method7054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg5 == arg2 && arg3 == arg0 && arg6 == arg8 && arg4 == arg1) {
			Static37.method649(arg5, arg7, arg1, arg8, arg3);
			return;
		}
		@Pc(36) int local36 = arg5;
		@Pc(38) int local38 = arg3;
		@Pc(42) int local42 = arg5 * 3;
		@Pc(46) int local46 = arg3 * 3;
		@Pc(50) int local50 = arg2 * 3;
		@Pc(54) int local54 = arg0 * 3;
		@Pc(58) int local58 = arg6 * 3;
		@Pc(62) int local62 = arg4 * 3;
		@Pc(72) int local72 = local50 + arg8 - arg5 - local58;
		@Pc(82) int local82 = arg1 + local54 - arg3 - local62;
		@Pc(91) int local91 = local42 + local58 - local50 - local50;
		@Pc(99) int local99 = local46 + local62 - local54 - local54;
		@Pc(104) int local104 = local50 - local42;
		@Pc(109) int local109 = local54 - local46;
		for (@Pc(111) int local111 = 128; local111 <= 4096; local111 += 128) {
			@Pc(119) int local119 = local111 * local111 >> 12;
			@Pc(125) int local125 = local111 * local119 >> 12;
			@Pc(129) int local129 = local72 * local125;
			@Pc(133) int local133 = local125 * local82;
			@Pc(137) int local137 = local119 * local91;
			@Pc(141) int local141 = local99 * local119;
			@Pc(145) int local145 = local111 * local104;
			@Pc(149) int local149 = local111 * local109;
			@Pc(159) int local159 = (local145 + local129 + local137 >> 12) + arg5;
			@Pc(169) int local169 = (local149 + local133 + local141 >> 12) + arg3;
			Static37.method649(local36, arg7, local169, local159, local38);
			local36 = local159;
			local38 = local169;
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!kb;ILclient!oa;)I")
	public static int method7056(@OriginalArg(0) Class187 arg0, @OriginalArg(2) Class66 arg1) {
		if (arg0.anInt5079 != -1) {
			return arg0.anInt5079;
		}
		if (arg0.anInt5090 != -1) {
			@Pc(28) Class271 local28 = arg1.anInterface3_15.method7249(arg1.method6834() ? arg0.anInt5090 : arg0.anInt5087);
			if (!local28.aBoolean514) {
				return local28.aShort94;
			}
		}
		return arg0.anInt5088;
	}
}
