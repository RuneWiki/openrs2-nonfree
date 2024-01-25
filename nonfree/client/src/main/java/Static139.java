import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!jd", name = "k", descriptor = "[I")
	public static int[] anIntArray281;

	@OriginalMember(owner = "client!jd", name = "p", descriptor = "Lclient!ja;")
	public static Class100 aClass100_2;

	@OriginalMember(owner = "client!jd", name = "r", descriptor = "I")
	public static int anInt3136;

	@OriginalMember(owner = "client!jd", name = "m", descriptor = "[I")
	public static final int[] anIntArray282 = new int[500];

	@OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
	public static int anInt3135 = 0;

	@OriginalMember(owner = "client!jd", name = "q", descriptor = "Ljava/lang/String;")
	public static final String aString108 = "purple:";

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "()V")
	public static void method2751() {
		for (@Pc(1) int local1 = 0; local1 < Static246.anInt5145; local1++) {
			@Pc(6) Class2_Sub2 local6 = Static124.aClass2_Sub2Array2[local1];
			Static37.method720(local6);
			Static124.aClass2_Sub2Array2[local1] = null;
		}
		Static246.anInt5145 = 0;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(B[S)[S")
	public static short[] method2752(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(17) short[] local17 = new short[arg0.length];
			Static363.method4756(arg0, 0, local17, 0, arg0.length);
			return local17;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)V")
	public static void method2754(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub1_Sub8 local8 = Static155.method2994(arg0, 11);
		local8.method2034();
	}
}
