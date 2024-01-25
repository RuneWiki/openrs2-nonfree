import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!sf", name = "q", descriptor = "Lclient!iq;")
	public static Class104 aClass104_150;

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "Lclient!jg;")
	public static final Class107 aClass107_45 = new Class107(256);

	@OriginalMember(owner = "client!sf", name = "k", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_185 = new Class157(42, 7);

	@OriginalMember(owner = "client!sf", name = "o", descriptor = "I")
	public static int anInt5840 = -1;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!dr;Lclient!la;IIIII)V")
	public static void method4906(@OriginalArg(0) Class37 arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static32.anInt516) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static344.anInt6692) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static63.anInt1129 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class51 local62 = Static196.aClass51ArrayArrayArray3[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static9.aClass105Array1[local17].method4453(local23, local32) + Static9.aClass105Array1[local17].method4453(local23 + 1, local32) + Static9.aClass105Array1[local17].method4453(local23, local32 + 1) + Static9.aClass105Array1[local17].method4453(local23 + 1, local32 + 1)) / 4 - (Static9.aClass105Array1[arg2].method4453(arg3, arg4) + Static9.aClass105Array1[arg2].method4453(arg3 + 1, arg4) + Static9.aClass105Array1[arg2].method4453(arg3, arg4 + 1) + Static9.aClass105Array1[arg2].method4453(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class1_Sub1 local143 = local62.aClass1_Sub1_2;
									@Pc(146) Class1_Sub1 local146 = local62.aClass1_Sub1_1;
									if (local143 != null && local143.method5759()) {
										arg1.method5762(local1, local143, (local23 - arg3) * Static6.anInt96 + (1 - arg5) * Static31.anInt496, local140, (local32 - arg4) * Static6.anInt96 + (1 - arg6) * Static31.anInt496, arg0);
									}
									if (local146 != null && local146.method5759()) {
										arg1.method5762(local1, local146, (local23 - arg3) * Static6.anInt96 + (1 - arg5) * Static31.anInt496, local140, (local32 - arg4) * Static6.anInt96 + (1 - arg6) * Static31.anInt496, arg0);
									}
									for (@Pc(219) Class11 local219 = local62.aClass11_2; local219 != null; local219 = local219.aClass11_1) {
										@Pc(223) Class1_Sub2 local223 = local219.aClass1_Sub2_1;
										if (local223 != null && local223.method5759() && (local23 == local223.aShort89 || local23 == local3) && (local32 == local223.aShort90 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort88 + 1 - local223.aShort89;
											@Pc(260) int local260 = local223.aShort87 + 1 - local223.aShort90;
											arg1.method5762(local1, local223, (local223.aShort89 - arg3) * Static6.anInt96 + (local252 - arg5) * Static31.anInt496, local140, (local223.aShort90 - arg4) * Static6.anInt96 + (local260 - arg6) * Static31.anInt496, arg0);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IBI)V")
	public static void method4908(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class141 local7 = Static301.method5064(arg1);
		@Pc(10) int local10 = local7.anInt4854;
		@Pc(13) int local13 = local7.anInt4852;
		@Pc(16) int local16 = local7.anInt4853;
		@Pc(23) int local23 = Class149.anIntArray396[local16 - local13];
		if (arg0 < 0 || local23 < arg0) {
			arg0 = 0;
		}
		local23 <<= local13;
		Static196.method3636(arg0 << local13 & local23 | Static181.anIntArray308[local10] & ~local23, local10);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)V")
	public static void method4913() {
		@Pc(6) Class107 local6 = Static197.aClass107_22;
		synchronized (Static197.aClass107_22) {
			Static197.aClass107_22.method3011(5);
		}
		local6 = Static257.aClass107_35;
		synchronized (Static257.aClass107_35) {
			Static257.aClass107_35.method3011(5);
		}
		local6 = Static338.aClass107_54;
		synchronized (Static338.aClass107_54) {
			Static338.aClass107_54.method3011(5);
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BB)C")
	public static char method4922(@OriginalArg(0) byte arg0) {
		@Pc(15) int local15 = arg0 & 0xFF;
		if (local15 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local15, 16) + " provided");
		}
		if (local15 >= 128 && local15 < 160) {
			@Pc(44) char local44 = Static287.aCharArray6[local15 - 128];
			if (local44 == '\u0000') {
				local44 = '?';
			}
			local15 = local44;
		}
		return (char) local15;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILclient!fh;I)V")
	public static void method4923(@OriginalArg(1) int arg0, @OriginalArg(2) Class68 arg1, @OriginalArg(3) int arg2) {
		Static173.anInt3945 = arg2;
		Static328.aClass68_40 = arg1;
		Static200.anInt4354 = arg0;
	}
}
