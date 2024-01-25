import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static621 {

	@OriginalMember(owner = "client!waa", name = "r", descriptor = "I")
	public static int anInt10237;

	@OriginalMember(owner = "client!waa", name = "s", descriptor = "I")
	public static int anInt10238;

	@OriginalMember(owner = "client!waa", name = "o", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_97 = new Class208(70, 0);

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(ILclient!ns;)I")
	public static int method8657(@OriginalArg(1) Class20_Sub2_Sub2_Sub1 arg0) {
		if (arg0.anInt5544 == 0) {
			return 0;
		}
		@Pc(62) int local62;
		@Pc(56) int local56;
		if (arg0.anInt5572 != -1) {
			@Pc(16) Class20_Sub2_Sub2_Sub1 local16 = null;
			if (arg0.anInt5572 < 32768) {
				@Pc(30) Class6_Sub46 local30 = (Class6_Sub46) Static347.aClass128_23.method3560((long) arg0.anInt5572);
				if (local30 != null) {
					local16 = local30.aClass20_Sub2_Sub2_Sub1_Sub2_1;
				}
			} else if (arg0.anInt5572 >= 32768) {
				local16 = Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[arg0.anInt5572 - 32768];
			}
			if (local16 != null) {
				local56 = arg0.anInt10725 - local16.anInt10725;
				local62 = arg0.anInt10729 - local16.anInt10729;
				if (local56 != 0 || local62 != 0) {
					arg0.method4919((int) (Math.atan2((double) local56, (double) local62) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class20_Sub2_Sub2_Sub1_Sub1) {
			@Pc(166) Class20_Sub2_Sub2_Sub1_Sub1 local166 = (Class20_Sub2_Sub2_Sub1_Sub1) arg0;
			if (local166.anInt1219 != -1 && (local166.anInt5574 == 0 || local166.anInt5575 > 0)) {
				local166.method4919(local166.anInt1219);
				local166.anInt1219 = -1;
			}
		} else if (arg0 instanceof Class20_Sub2_Sub2_Sub1_Sub2) {
			@Pc(94) Class20_Sub2_Sub2_Sub1_Sub2 local94 = (Class20_Sub2_Sub2_Sub1_Sub2) arg0;
			if (local94.anInt5596 != -1 && (local94.anInt5574 == 0 || local94.anInt5575 > 0)) {
				local56 = local94.anInt10725 - (local94.anInt5596 - Static606.anInt8651 - Static606.anInt8651) * 256;
				local62 = local94.anInt10729 - (local94.anInt5582 - Static195.anInt3961 - Static195.anInt3961) * 256;
				if (local56 != 0 || local62 != 0) {
					local94.method4919((int) (Math.atan2((double) local56, (double) local62) * 2607.5945876176133D) & 0x3FFF);
				}
				local94.anInt5596 = -1;
			}
		}
		return arg0.method4921();
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "()V")
	public static void method8660() {
		for (@Pc(1) int local1 = 0; local1 < Static574.aClass334Array1.length; local1++) {
			Static574.aClass334Array1[local1].method8102();
		}
		Static574.aClass334Array1 = null;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(IIIILclient!ha;III)V")
	public static void method8661(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class100 arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4) {
		Static117.aClass100_5 = arg2;
		Static105.aClass154_1 = Static117.aClass100_5.method8838();
		Static335.aClass154_4 = Static117.aClass100_5.method8838();
		Static503.aClass154_8 = Static117.aClass100_5.method8838();
		Static345.anInt6515 = arg3;
		Static469.anInt8256 = 1;
		Static14.anInt268 = 0;
		Static11.anInt221 = arg4;
		Static152.anInt5119 = 2;
		Static180.anInterface20_1 = null;
		Static160.anInt3354 = 2;
		Static426.anInt7764 = 0;
		Static563.method8109(arg0, arg1);
	}
}
