import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static583 {

	@OriginalMember(owner = "client!tn", name = "S", descriptor = "I")
	public static int anInt9381 = 0;

	@OriginalMember(owner = "client!tn", name = "T", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray28 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!tn", name = "V", descriptor = "Lclient!fb;")
	public static final Class99 aClass99_9 = new Class99();

	@OriginalMember(owner = "client!tn", name = "W", descriptor = "[Lclient!ofa;")
	public static final Class251[] aClass251Array1 = new Class251[2048];

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)V")
	public static void method8198(@OriginalArg(1) int arg0) {
		if (Static636.anIntArray886 == null || Static636.anIntArray886.length < arg0) {
			Static636.anIntArray886 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!wea;IIIII)V")
	public static void method8199(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static183.anInt3720) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static146.anInt2951) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static602.anInt9668 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class164 local62 = Static15.aClass164ArrayArrayArray5[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static121.aClass21Array2[local17].method7973(local23, local32) + Static121.aClass21Array2[local17].method7973(local23 + 1, local32) + Static121.aClass21Array2[local17].method7973(local23, local32 + 1) + Static121.aClass21Array2[local17].method7973(local23 + 1, local32 + 1)) / 4 - (Static121.aClass21Array2[arg1].method7973(arg2, arg3) + Static121.aClass21Array2[arg1].method7973(arg2 + 1, arg3) + Static121.aClass21Array2[arg1].method7973(arg2, arg3 + 1) + Static121.aClass21Array2[arg1].method7973(arg2 + 1, arg3 + 1)) / 4;
									@Pc(151) Class28_Sub1_Sub4 local151 = local62.aClass28_Sub1_Sub4_2;
									@Pc(154) Class28_Sub1_Sub4 local154 = local62.aClass28_Sub1_Sub4_1;
									if (local151 != null && local151.method9297()) {
										arg0.method9290(Static671.aClass13_21, local151, local1, (local23 - arg2) * Static207.anInt4003 + (1 - arg4) * Static597.anInt9602, local148, (local32 - arg3) * Static207.anInt4003 + (1 - arg5) * Static597.anInt9602);
									}
									if (local154 != null && local154.method9297()) {
										arg0.method9290(Static671.aClass13_21, local154, local1, (local23 - arg2) * Static207.anInt4003 + (1 - arg4) * Static597.anInt9602, local148, (local32 - arg3) * Static207.anInt4003 + (1 - arg5) * Static597.anInt9602);
									}
									for (@Pc(227) Class125 local227 = local62.aClass125_2; local227 != null; local227 = local227.aClass125_1) {
										@Pc(231) Class28_Sub1_Sub1 local231 = local227.aClass28_Sub1_Sub1_1;
										if (local231 != null && local231.method9297() && (local23 == local231.aShort125 || local23 == local3) && (local32 == local231.aShort123 || local32 == local11)) {
											@Pc(260) int local260 = local231.aShort124 + 1 - local231.aShort125;
											@Pc(268) int local268 = local231.aShort122 + 1 - local231.aShort123;
											arg0.method9290(Static671.aClass13_21, local231, local1, (local231.aShort125 - arg2) * Static207.anInt4003 + (local260 - arg4) * Static597.anInt9602, local148, (local231.aShort123 - arg3) * Static207.anInt4003 + (local268 - arg5) * Static597.anInt9602);
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

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "(III)Lclient!kp;")
	public static Class28_Sub1_Sub4 method8200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class164 local7 = Static15.aClass164ArrayArrayArray5[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass28_Sub1_Sub4_2;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIJ)Lclient!ds;")
	public static Class3_Sub11_Sub4 method8201(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1) {
		@Pc(19) Class3_Sub11_Sub4 local19 = (Class3_Sub11_Sub4) Static66.aClass83_3.method2368((long) arg0 << 56 | arg1);
		if (local19 == null) {
			local19 = new Class3_Sub11_Sub4(arg0, arg1);
			Static66.aClass83_3.method2377(local19.aLong311, local19);
		}
		return local19;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(B[I)Ljava/lang/String;")
	public static String method8202(@OriginalArg(1) int[] arg0) {
		@Pc(17) StringBuffer local17 = new StringBuffer();
		@Pc(19) int local19 = Static498.anInt10143;
		for (@Pc(21) int local21 = 0; local21 < arg0.length; local21++) {
			@Pc(30) Class357 local30 = Static617.aClass320_1.method7845(arg0[local21]);
			if (local30.anInt9957 != -1) {
				@Pc(42) Class33 local42 = (Class33) Static403.aClass165_45.method4389((long) local30.anInt9957);
				if (local42 == null) {
					@Pc(50) Class97 local50 = Static682.method2754(Static369.aClass15_97, local30.anInt9957, 0);
					if (local50 != null) {
						local42 = Static674.aClass13_22.method8465(local50, true);
						Static403.aClass165_45.method4392(local42, (long) local30.anInt9957);
					}
				}
				if (local42 != null) {
					Static561.aClass33Array25[local19] = local42;
					local17.append(" <img=").append(local19).append(">");
					local19++;
				}
			}
		}
		return local17.toString();
	}

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "(I)V")
	public static void method8204() {
		Static146.anInt2953 = 0;
		Static218.anInt4139 = 0;
		for (@Pc(16) int local16 = 0; local16 < Static37.anInt839; local16++) {
			@Pc(22) int local22 = local16 * Static153.anInt3033;
			for (@Pc(24) int local24 = 0; local24 < Static153.anInt3033; local24++) {
				@Pc(30) int local30 = local24 + local22;
				Static534.anInterface26Array1[local30].method9016(Static336.anInt5533 * local24, Static9.anInt105 * local16, Static336.anInt5533, Static9.anInt105, true);
			}
		}
	}
}
