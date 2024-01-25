import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static498 {

	@OriginalMember(owner = "client!taa", name = "k", descriptor = "Lclient!nda;")
	public static Class224 aClass224_1;

	@OriginalMember(owner = "client!taa", name = "l", descriptor = "I")
	public static int anInt8350;

	@OriginalMember(owner = "client!taa", name = "j", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray34 = new String[200];

	@OriginalMember(owner = "client!taa", name = "n", descriptor = "[Lclient!pfa;")
	public static final Class254[] aClass254Array1 = new Class254[100];

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(Lclient!wv;B)Lclient!wv;")
	public static Class365 method6955(@OriginalArg(0) Class365 arg0) {
		if (arg0.anInt9590 != -1) {
			return Static374.method5437(arg0.anInt9590);
		}
		@Pc(24) int local24 = arg0.anInt9646 >>> 16;
		@Pc(29) Class282 local29 = new Class282(Static68.aClass356_4);
		for (@Pc(34) Class1_Sub16 local34 = (Class1_Sub16) local29.method6389(); local34 != null; local34 = (Class1_Sub16) local29.method6394()) {
			if (local24 == local34.anInt2681) {
				return Static374.method5437((int) local34.aLong425);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(IIIBI)V")
	public static void method6956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(6) Class1_Sub48 local6 = Static240.method3953();
		local6.aClass1_Sub20_Sub1_2.method4378(Static189.aClass232_7.anInt6494);
		local6.aClass1_Sub20_Sub1_2.method4378(arg1);
		local6.aClass1_Sub20_Sub1_2.method4378(arg2);
		local6.aClass1_Sub20_Sub1_2.method4381(arg3);
		local6.aClass1_Sub20_Sub1_2.method4381(arg0);
		Static34.method813(local6);
		Static446.anInt7727 = 0;
		Static403.anInt6918 = -3;
		Static31.anInt879 = 1;
		Static17.anInt564 = 0;
	}
}
