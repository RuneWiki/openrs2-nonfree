import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "I")
	public static int anInt6794;

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "Z")
	public static boolean aBoolean517 = true;

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "Lclient!in;")
	public static final Class169 aClass169_168 = new Class169(42, 9);

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "J")
	public static long aLong177 = 0L;

	@OriginalMember(owner = "client!lr", name = "f", descriptor = "I")
	public static int anInt6795 = -1;

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Z[B)[B")
	public static byte[] method6086(@OriginalArg(1) byte[] arg0) {
		@Pc(15) Class2_Sub8 local15 = new Class2_Sub8(arg0);
		@Pc(19) int local19 = local15.method5203();
		@Pc(23) int local23 = local15.method5172();
		if (local23 < 0 || Static412.anInt7659 != 0 && local23 > Static412.anInt7659) {
			throw new RuntimeException();
		} else if (local19 == 0) {
			@Pc(49) byte[] local49 = new byte[local23];
			local15.method5176(local49, 0, local23);
			return local49;
		} else {
			@Pc(61) int local61 = local15.method5172();
			if (local61 < 0 || Static412.anInt7659 != 0 && local61 > Static412.anInt7659) {
				throw new RuntimeException();
			}
			@Pc(82) byte[] local82 = new byte[local61];
			if (local19 == 1) {
				Static467.method7487(local82, local61, arg0, local23);
			} else {
				@Pc(95) Class216 local95 = Static491.aClass216_1;
				synchronized (Static491.aClass216_1) {
					Static491.aClass216_1.method5738(local15, local82);
				}
			}
			return local82;
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!nfa;)V")
	public static void method6087(@OriginalArg(0) Class15_Sub3 arg0) {
		if (arg0 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < 2; local4++) {
			@Pc(7) Class15_Sub3 local7 = null;
			for (@Pc(11) Class15_Sub3 local11 = Static603.aClass15_Sub3Array5[local4]; local11 != null; local11 = local11.aClass15_Sub3_23) {
				if (local11 == arg0) {
					if (local7 == null) {
						Static603.aClass15_Sub3Array5[local4] = local11.aClass15_Sub3_23;
					} else {
						local7.aClass15_Sub3_23 = local11.aClass15_Sub3_23;
					}
					Static207.aBoolean327 = true;
					return;
				}
				local7 = local11;
			}
			local7 = null;
			for (@Pc(43) Class15_Sub3 local43 = Static440.aClass15_Sub3Array4[local4]; local43 != null; local43 = local43.aClass15_Sub3_23) {
				if (local43 == arg0) {
					if (local7 == null) {
						Static440.aClass15_Sub3Array4[local4] = local43.aClass15_Sub3_23;
					} else {
						local7.aClass15_Sub3_23 = local43.aClass15_Sub3_23;
					}
					Static207.aBoolean327 = true;
					return;
				}
				local7 = local43;
			}
			local7 = null;
			for (@Pc(75) Class15_Sub3 local75 = Static98.aClass15_Sub3Array2[local4]; local75 != null; local75 = local75.aClass15_Sub3_23) {
				if (local75 == arg0) {
					if (local7 == null) {
						Static98.aClass15_Sub3Array2[local4] = local75.aClass15_Sub3_23;
					} else {
						local7.aClass15_Sub3_23 = local75.aClass15_Sub3_23;
					}
					Static207.aBoolean327 = true;
					return;
				}
				local7 = local75;
			}
		}
	}
}
