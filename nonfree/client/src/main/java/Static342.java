import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!mfa", name = "cb", descriptor = "[Lclient!oc;")
	public static final Interface18[] anInterface18Array2 = new Interface18[75];

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
	public static void method5551(@OriginalArg(0) String arg0) {
		Static145.method2337(0, "", arg0, 4, "", "");
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Lclient!ns;B)V")
	public static void method5552(@OriginalArg(0) Class20_Sub2_Sub2_Sub1 arg0) {
		if (arg0.anIntArray334 == null && arg0.anIntArray328 == null) {
			return;
		}
		@Pc(14) boolean local14 = true;
		for (@Pc(16) int local16 = 0; local16 < arg0.anIntArray334.length; local16++) {
			@Pc(20) int local20 = -1;
			if (arg0.anIntArray334 != null) {
				local20 = arg0.anIntArray334[local16];
			}
			if (local20 != -1) {
				local14 = false;
				@Pc(85) int local85;
				@Pc(92) int local92;
				@Pc(98) int local98;
				if ((local20 & 0xC0000000) == -1073741824) {
					local98 = local20 & 0xFFFFFFF;
					@Pc(136) int local136 = local98 >> 14;
					@Pc(140) int local140 = local98 & 0x3FFF;
					local85 = arg0.anInt10725 - (local136 - Static606.anInt8651) * 512 - 256;
					local92 = arg0.anInt10729 - (-Static195.anInt3961 + local140) * 512 - 256;
				} else if ((local20 & 0x8000) == 0) {
					@Pc(66) Class6_Sub46 local66 = (Class6_Sub46) Static347.aClass128_23.method3560((long) local20);
					if (local66 == null) {
						arg0.method4912(local16, -1);
						continue;
					}
					@Pc(79) Class20_Sub2_Sub2_Sub1_Sub2 local79 = local66.aClass20_Sub2_Sub2_Sub1_Sub2_1;
					local85 = arg0.anInt10725 - local79.anInt10725;
					local92 = arg0.anInt10729 - local79.anInt10729;
				} else {
					local98 = local20 & 0x7FFF;
					@Pc(102) Class20_Sub2_Sub2_Sub1_Sub1 local102 = Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[local98];
					if (local102 == null) {
						arg0.method4912(local16, -1);
						continue;
					}
					local92 = arg0.anInt10729 - local102.anInt10729;
					local85 = arg0.anInt10725 - local102.anInt10725;
				}
				if (local85 != 0 || local92 != 0) {
					arg0.method4912(local16, (int) (Math.atan2((double) local85, (double) local92) * 2607.5945876176133D) & 0x3FFF);
				}
			} else if (!arg0.method4912(local16, -1)) {
				local14 = false;
			}
		}
		if (local14) {
			arg0.anIntArray328 = null;
			arg0.anIntArray334 = null;
		}
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(II)V")
	public static void method5553(@OriginalArg(0) int arg0) {
		Static16.anInt284 = -1;
		Static344.anInt6482 = 3;
		Static316.anInt6069 = arg0;
		Static243.anInt4836 = 100;
	}
}
