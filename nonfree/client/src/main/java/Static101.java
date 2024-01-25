import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!eca", name = "F", descriptor = "Lclient!oca;")
	public static Class210 aClass210_1;

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 < 0 || arg1 < 0 || arg2 >= Static237.anInt4563 - 1 || Static373.anInt6694 - 1 <= arg1) {
			return;
		}
		if (Static263.aClass64ArrayArrayArray3 == null) {
			return;
		}
		@Pc(43) Interface7 local43;
		if (arg3 != 0) {
			if (arg3 == 1) {
				local43 = (Interface7) Static544.method6945(arg5, arg2, arg1);
				if (local43 != null) {
					if (!(local43 instanceof Class20_Sub4_Sub3)) {
						@Pc(52) int local52 = local43.method8046();
						if (arg4 != 4 && arg4 != 5) {
							if (arg4 == 6) {
								Static123.method2352(arg5, arg3, arg0 + 4, 4, arg2, local52, arg1, arg6);
								return;
							}
							if (arg4 == 7) {
								Static123.method2352(arg5, arg3, (arg0 + 2 & 0x3) + 4, 4, arg2, local52, arg1, arg6);
							} else if (arg4 == 8) {
								Static123.method2352(arg5, arg3, arg0 + 4, 4, arg2, local52, arg1, arg6);
								Static123.method2352(arg5, arg3, (arg0 + 2 & 0x3) + 4, 4, arg2, local52, arg1, arg6);
								return;
							}
							return;
						}
						Static123.method2352(arg5, arg3, arg0, 4, arg2, local52, arg1, arg6);
						return;
					}
					((Class20_Sub4_Sub3) local43).aClass178_3.method4875(arg6);
					return;
				}
				return;
			}
			if (arg3 != 2) {
				if (arg3 == 3) {
					local43 = (Interface7) Static465.method7066(arg5, arg2, arg1);
					if (local43 != null) {
						if (local43 instanceof Class20_Sub5_Sub2) {
							((Class20_Sub5_Sub2) local43).aClass178_2.method4875(arg6);
							return;
						}
						Static123.method2352(arg5, arg3, arg0, arg4, arg2, local43.method8046(), arg1, arg6);
						return;
					}
				}
				return;
			}
			local43 = (Interface7) Static100.method2041(arg5, arg2, arg1, fp.class);
			if (local43 != null) {
				if (arg4 == 11) {
					arg4 = 10;
				}
				if (!(local43 instanceof Class20_Sub1_Sub2)) {
					Static123.method2352(arg5, arg3, arg0, arg4, arg2, local43.method8046(), arg1, arg6);
					return;
				}
				((Class20_Sub1_Sub2) local43).aClass178_1.method4875(arg6);
				return;
			}
			return;
		}
		local43 = (Interface7) Static47.method5108(arg5, arg2, arg1);
		@Pc(247) Interface7 local247 = (Interface7) Static259.method4671(arg5, arg2, arg1);
		if (local43 != null && arg4 != 2) {
			if (local43 instanceof Class20_Sub2_Sub2) {
				((Class20_Sub2_Sub2) local43).aClass178_4.method4875(arg6);
			} else {
				Static123.method2352(arg5, arg3, arg0, arg4, arg2, local43.method8046(), arg1, arg6);
			}
		}
		if (local247 == null) {
			return;
		}
		if (!(local247 instanceof Class20_Sub2_Sub2)) {
			Static123.method2352(arg5, arg3, arg0, arg4, arg2, local247.method8046(), arg1, arg6);
			return;
		}
		((Class20_Sub2_Sub2) local247).aClass178_4.method4875(arg6);
		return;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(IIILclient!pq;II)Ljava/awt/Frame;")
	public static Frame method2060(@OriginalArg(2) int arg0, @OriginalArg(3) Class229 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (!arg1.method6064()) {
			return null;
		}
		@Pc(17) Class270[] local17 = Static71.method1699(arg1);
		if (local17 == null) {
			return null;
		}
		@Pc(23) boolean local23 = false;
		for (@Pc(25) int local25 = 0; local25 < local17.length; local25++) {
			if (arg2 == local17[local25].anInt7897 && arg0 == local17[local25].anInt7894 && (!local23 || local17[local25].anInt7899 > arg3)) {
				local23 = true;
				arg3 = local17[local25].anInt7899;
			}
		}
		if (!local23) {
			return null;
		}
		@Pc(86) Class311 local86 = arg1.method6082(arg0, arg3, arg2);
		while (local86.anInt9169 == 0) {
			Static265.method3147(10L);
		}
		@Pc(101) Frame local101 = (Frame) local86.anObject17;
		if (local101 == null) {
			return null;
		} else if (local86.anInt9169 == 2) {
			Static435.method6744(arg1, local101);
			return null;
		} else {
			return local101;
		}
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lclient!k;III[Z)Z")
	public static boolean method2062(@OriginalArg(0) Class1_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static296.aClass7Array11 != Static207.aClass7Array7) {
			@Pc(11) int local11 = Static411.aClass7Array12[arg1].aa(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class7 local18 = Static411.aClass7Array12[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.aa(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method8250(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.ya(arg0, arg2, local27, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}
}
