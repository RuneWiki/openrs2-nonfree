import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!gt", name = "o", descriptor = "[Lclient!f;")
	public static Class49[] aClass49Array55;

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_103 = new Class137(62, 0);

	@OriginalMember(owner = "client!gt", name = "i", descriptor = "I")
	public static int anInt2445 = 0;

	@OriginalMember(owner = "client!gt", name = "j", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_93 = new Class214(7, -2);

	@OriginalMember(owner = "client!gt", name = "l", descriptor = "[I")
	public static final int[] anIntArray117 = new int[4096];

	@OriginalMember(owner = "client!gt", name = "p", descriptor = "[Z")
	public static final boolean[] aBooleanArray15 = new boolean[100];

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)V")
	public static void method1908() {
		Static174.anInt2859 = -1;
		Static345.anInt5644 = 0;
		Static313.anInt5206 = -1;
	}

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)Lclient!np;")
	public static Class1_Sub3_Sub13 method1909() {
		@Pc(17) Class1_Sub3_Sub13 local17 = (Class1_Sub3_Sub13) Static446.aClass260_10.method5553();
		if (local17 != null) {
			local17.method5617();
			local17.method5312();
			return local17;
		}
		do {
			local17 = (Class1_Sub3_Sub13) Static58.aClass260_6.method5553();
			if (local17 == null) {
				return null;
			}
			if (local17.method3462() > Static232.method3058()) {
				return null;
			}
			local17.method5617();
			local17.method5312();
		} while ((local17.aLong216 & Long.MIN_VALUE) == 0L);
		return local17;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILclient!ic;)V")
	public static void method1912(@OriginalArg(1) Class113 arg0) {
		Static110.aClass113_38 = arg0;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILclient!ic;II)Lclient!uq;")
	public static Class1_Sub3_Sub16 method1913(@OriginalArg(1) Class113 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class1_Sub11 local14 = new Class1_Sub11(arg0.method2274(arg2, arg1));
		@Pc(45) Class1_Sub3_Sub16 local45 = new Class1_Sub3_Sub16(arg1, local14.method4484(), local14.method4484(), local14.method4487(), local14.method4487(), local14.method4463() == 1, local14.method4463(), local14.method4463());
		@Pc(49) int local49 = local14.method4463();
		for (@Pc(51) int local51 = 0; local51 < local49; local51++) {
			local45.aClass254_43.method5430(new Class1_Sub5(local14.method4463(), local14.method4485(), local14.method4485(), local14.method4485(), local14.method4485(), local14.method4485(), local14.method4485(), local14.method4485(), local14.method4485()));
		}
		local45.method5174();
		return local45;
	}
}
