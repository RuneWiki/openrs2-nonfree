import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "Lclient!vd;")
	public static Class353 aClass353_122;

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(ILjava/lang/String;I)I")
	public static int method8187(@OriginalArg(1) String arg0) {
		return Static612.method7494(arg0, 16);
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(ILclient!ns;)V")
	public static void method8189(@OriginalArg(1) Class20_Sub2_Sub2_Sub1 arg0) {
		@Pc(9) int local9 = arg0.anInt5512 - Static113.anInt2243;
		@Pc(21) int local21 = arg0.anInt5548 * 512 + arg0.method4913() * 256;
		@Pc(33) int local33 = arg0.anInt5563 * 512 + arg0.method4913() * 256;
		arg0.anInt10725 += (local21 - arg0.anInt10725) / local9;
		arg0.anInt10729 += (local33 - arg0.anInt10729) / local9;
		arg0.anInt5575 = 0;
		if (arg0.anInt5525 == 0) {
			arg0.method4919(8192);
		}
		if (arg0.anInt5525 == 1) {
			arg0.method4919(12288);
		}
		if (arg0.anInt5525 == 2) {
			arg0.method4919(0);
		}
		if (arg0.anInt5525 == 3) {
			arg0.method4919(4096);
		}
	}
}
