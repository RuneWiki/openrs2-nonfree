import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "[I")
	public static int[] anIntArray324;

	@OriginalMember(owner = "client!jo", name = "h", descriptor = "I")
	public static int anInt5585;

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(BI)V")
	public static void method4575(@OriginalArg(1) int arg0) {
		if (!Static498.method7246(arg0)) {
			return;
		}
		@Pc(14) Class331[] local14 = Static368.aClass331ArrayArray2[arg0];
		for (@Pc(24) int local24 = 0; local24 < local14.length; local24++) {
			@Pc(30) Class331 local30 = local14[local24];
			if (local30 != null) {
				local30.anInt9573 = 1;
				local30.anInt9538 = 0;
				local30.anInt9493 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!rr;)V")
	public static void method4580(@OriginalArg(0) Class15_Sub1 arg0) {
		if (arg0 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < 2; local4++) {
			@Pc(7) Class15_Sub1 local7 = null;
			for (@Pc(11) Class15_Sub1 local11 = Static234.aClass15_Sub1Array3[local4]; local11 != null; local11 = local11.aClass15_Sub1_23) {
				if (local11 == arg0) {
					if (local7 == null) {
						Static234.aClass15_Sub1Array3[local4] = local11.aClass15_Sub1_23;
					} else {
						local7.aClass15_Sub1_23 = local11.aClass15_Sub1_23;
					}
					Static147.aBoolean271 = true;
					return;
				}
				local7 = local11;
			}
			local7 = null;
			for (@Pc(43) Class15_Sub1 local43 = Static351.aClass15_Sub1Array4[local4]; local43 != null; local43 = local43.aClass15_Sub1_23) {
				if (local43 == arg0) {
					if (local7 == null) {
						Static351.aClass15_Sub1Array4[local4] = local43.aClass15_Sub1_23;
					} else {
						local7.aClass15_Sub1_23 = local43.aClass15_Sub1_23;
					}
					Static147.aBoolean271 = true;
					return;
				}
				local7 = local43;
			}
			local7 = null;
			for (@Pc(75) Class15_Sub1 local75 = Static16.aClass15_Sub1Array1[local4]; local75 != null; local75 = local75.aClass15_Sub1_23) {
				if (local75 == arg0) {
					if (local7 == null) {
						Static16.aClass15_Sub1Array1[local4] = local75.aClass15_Sub1_23;
					} else {
						local7.aClass15_Sub1_23 = local75.aClass15_Sub1_23;
					}
					Static147.aBoolean271 = true;
					return;
				}
				local7 = local75;
			}
		}
	}
}
