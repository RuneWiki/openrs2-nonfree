import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static509 {

	@OriginalMember(owner = "client!tq", name = "f", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_163 = new Class235(43, -1);

	@OriginalMember(owner = "client!tq", name = "k", descriptor = "I")
	public static int anInt5326 = 0;

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILclient!pca;Lclient!pca;)V")
	public static void method4319(@OriginalArg(1) Class1 arg0, @OriginalArg(2) Class1 arg1) {
		if (arg0.aClass1_286 != null) {
			arg0.method7859();
		}
		arg0.aClass1_286 = arg1.aClass1_286;
		arg0.aClass1_285 = arg1;
		arg0.aClass1_286.aClass1_285 = arg0;
		arg0.aClass1_285.aClass1_286 = arg0;
	}
}
