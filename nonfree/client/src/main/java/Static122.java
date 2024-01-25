import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!eda", name = "n", descriptor = "Lclient!kba;")
	public static Class163 aClass163_15 = new Class163();

	@OriginalMember(owner = "client!eda", name = "q", descriptor = "Lclient!fha;")
	public static final Class101 aClass101_8 = new Class101(10, 7);

	@OriginalMember(owner = "client!eda", name = "u", descriptor = "[Lclient!jea;")
	public static final Class6_Sub5_Sub18[] aClass6_Sub5_Sub18Array2 = new Class6_Sub5_Sub18[14];

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(IB)V")
	public static void method2606() {
		Static412.aClass94_39.method2958(50);
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(Z[S[Ljava/lang/String;)V")
	public static void method2608(@OriginalArg(1) short[] arg0, @OriginalArg(2) String[] arg1) {
		Static461.method6935(arg0, arg1, arg1.length - 1, 0);
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(BI)V")
	public static void method2609(@OriginalArg(1) int arg0) {
		@Pc(12) Class6_Sub39 local12 = (Class6_Sub39) Static475.aClass380_36.method8747((long) arg0);
		if (local12 != null) {
			local12.aClass62_Sub1_1.method2407();
			Static508.method7293(local12.aBoolean636, local12.anInt7975);
			local12.method8792();
		}
	}
}
