import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!lia", name = "g", descriptor = "I")
	public static int anInt9965 = -1;

	@OriginalMember(owner = "client!lia", name = "d", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_255 = new Class381(19, 2);

	@OriginalMember(owner = "client!lia", name = "b", descriptor = "I")
	public static int anInt9969 = 0;

	@OriginalMember(owner = "client!lia", name = "e", descriptor = "[I")
	public static final int[] anIntArray552 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(B)V")
	public static void method8473() {
		for (@Pc(18) Class5_Sub1_Sub17 local18 = (Class5_Sub1_Sub17) Static146.aClass20_10.method378(); local18 != null; local18 = (Class5_Sub1_Sub17) Static146.aClass20_10.method366()) {
			@Pc(23) Class4_Sub1_Sub1_Sub5 local23 = local18.aClass4_Sub1_Sub1_Sub5_1;
			if (local23.aBoolean585) {
				local18.method9222();
				local23.method7578();
			} else if (Static565.anInt8921 >= local23.anInt8853) {
				local23.method7577(Static675.anInt10854);
				if (local23.aBoolean585) {
					local18.method9222();
				} else {
					Static686.method2955(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lia", name = "b", descriptor = "(I)V")
	public static void method8474() {
		try {
			@Pc(12) int local12;
			if (Static310.anInt5335 == 1) {
				local12 = Static445.aClass5_Sub4_Sub2_6.method1809();
				if (local12 > 0 && Static445.aClass5_Sub4_Sub2_6.method1822()) {
					local12 -= Static395.anInt6666;
					if (local12 < 0) {
						local12 = 0;
					}
					Static445.aClass5_Sub4_Sub2_6.method1808(local12);
					return;
				}
				Static445.aClass5_Sub4_Sub2_6.method1799();
				Static445.aClass5_Sub4_Sub2_6.method1798();
				Static451.aClass199_1 = null;
				Static27.aClass5_Sub28_1 = null;
				if (Static342.aClass126_159 == null) {
					Static310.anInt5335 = 0;
				} else {
					Static310.anInt5335 = 2;
				}
			}
			if (Static310.anInt5335 == 3) {
				local12 = Static445.aClass5_Sub4_Sub2_6.method1809();
				if (Static524.anInt8330 > local12 && Static445.aClass5_Sub4_Sub2_6.method1822()) {
					local12 += Static12.anInt158;
					if (local12 > Static524.anInt8330) {
						local12 = Static524.anInt8330;
					}
					Static445.aClass5_Sub4_Sub2_6.method1808(local12);
					return;
				}
				Static12.anInt158 = 0;
				Static310.anInt5335 = 0;
			}
		} catch (@Pc(100) Exception local100) {
			local100.printStackTrace();
			Static445.aClass5_Sub4_Sub2_6.method1799();
			Static310.anInt5335 = 0;
			Static27.aClass5_Sub4_Sub2_1 = null;
			Static451.aClass199_1 = null;
			Static342.aClass126_159 = null;
			Static27.aClass5_Sub28_1 = null;
		}
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "([II[Ljava/lang/Object;)V")
	public static void method8475(@OriginalArg(0) int[] arg0, @OriginalArg(2) Object[] arg1) {
		Static581.method8008(arg1, 0, arg0.length - 1, arg0);
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(ILclient!s;)V")
	public static void method8476(@OriginalArg(0) int arg0, @OriginalArg(1) Class84 arg1) {
		Static177.aClass84Array2[arg0] = arg1;
	}
}
