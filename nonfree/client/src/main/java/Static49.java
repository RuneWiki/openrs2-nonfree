import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!c", name = "a", descriptor = "I")
	public static int anInt823 = 0;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "Lclient!di;")
	public static Class6_Sub15 aClass6_Sub15_1 = null;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III[Ljava/lang/String;)Ljava/lang/String;")
	public static String method666(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String[] arg2) {
		if (arg0 == 0) {
			return "";
		} else if (arg0 == 1) {
			@Pc(19) String local19 = arg2[arg1];
			return local19 == null ? "null" : local19.toString();
		} else {
			@Pc(31) int local31 = arg0 + arg1;
			@Pc(33) int local33 = 0;
			for (@Pc(35) int local35 = arg1; local35 < local31; local35++) {
				@Pc(41) String local41 = arg2[local35];
				if (local41 == null) {
					local33 += 4;
				} else {
					local33 += local41.length();
				}
			}
			@Pc(60) StringBuffer local60 = new StringBuffer(local33);
			for (@Pc(62) int local62 = arg1; local62 < local31; local62++) {
				@Pc(68) String local68 = arg2[local62];
				if (local68 == null) {
					local60.append("null");
				} else {
					local60.append(local68);
				}
			}
			return local60.toString();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILclient!dga;I)Ljava/lang/String;")
	public static String method668(@OriginalArg(1) Class6_Sub14 arg0) {
		try {
			@Pc(7) int local7 = arg0.method5998();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(19) byte[] local19 = new byte[local7];
			arg0.anInt7244 += Static278.aClass322_5.method7352(0, arg0.anInt7244, arg0.aByteArray88, local19, local7);
			return Static196.method2960(local7, local19, 0);
		} catch (@Pc(43) Exception local43) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILclient!ej;II)Lclient!uw;")
	public static Class6_Sub1_Sub17 method669(@OriginalArg(0) int arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10 = arg1.anInt2059 | arg0 << 8;
		@Pc(19) Class6_Sub1_Sub17 local19 = (Class6_Sub1_Sub17) Static523.aClass284_4.method6449((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(39) byte[] local39 = Static58.aClass251_21.method5855(Static58.aClass251_21.method5858(local10));
		if (local39 == null) {
			local10 = arg1.anInt2059 | arg2 + 65536 << 8;
			local19 = (Class6_Sub1_Sub17) Static523.aClass284_4.method6449((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local39 = Static58.aClass251_21.method5855(Static58.aClass251_21.method5858(local10));
			if (local39 == null) {
				local10 = arg1.anInt2059 | 0xFFFF00;
				local19 = (Class6_Sub1_Sub17) Static523.aClass284_4.method6449((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local39 = Static58.aClass251_21.method5855(Static58.aClass251_21.method5858(local10));
				if (local39 == null) {
					return null;
				} else if (local39.length <= 1) {
					return null;
				} else {
					local19 = Static144.method2159(local39);
					local19.aClass84_11 = arg1;
					Static523.aClass284_4.method6450((long) local10 << 16, local19);
					return local19;
				}
			} else if (local39.length <= 1) {
				return null;
			} else {
				local19 = Static144.method2159(local39);
				local19.aClass84_11 = arg1;
				Static523.aClass284_4.method6450((long) local10 << 16, local19);
				return local19;
			}
		} else if (local39.length <= 1) {
			return null;
		} else {
			local19 = Static144.method2159(local39);
			local19.aClass84_11 = arg1;
			Static523.aClass284_4.method6450((long) local10 << 16, local19);
			return local19;
		}
	}
}
