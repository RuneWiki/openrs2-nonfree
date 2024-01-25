import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ae", name = "C", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray37 = new String[100];

	@OriginalMember(owner = "client!ae", name = "F", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_119 = new Class254(42, 4);

	@OriginalMember(owner = "client!ae", name = "G", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_332 = new Class12(56, 4);

	@OriginalMember(owner = "client!ae", name = "H", descriptor = "Z")
	public static boolean aBoolean541 = true;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(FFFZ)F")
	public static float method5253(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return (arg2 - arg1) * arg0 + arg1;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZI)V")
	public static void method5254(@OriginalArg(0) boolean arg0) {
		Static442.method5918();
		if (Static40.anInt629 != 30 && Static40.anInt629 != 25) {
			return;
		}
		Static343.anInt6247++;
		if (Static343.anInt6247 < 50 && !arg0) {
			return;
		}
		Static343.anInt6247 = 0;
		if (!Static158.aBoolean226 && Static169.aClass114_4 != null) {
			Static224.method3272(Static133.aClass254_49);
			try {
				Static169.aClass114_4.method2497(Static201.aClass1_Sub14_Sub2_2.anInt5695, Static201.aClass1_Sub14_Sub2_2.aByteArray65);
				Static201.aClass1_Sub14_Sub2_2.anInt5695 = 0;
			} catch (@Pc(57) IOException local57) {
				Static158.aBoolean226 = true;
			}
		}
		Static442.method5918();
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IILclient!tn;I)V")
	public static void method5256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class229 arg2) {
		if (arg2 == null) {
			return;
		}
		if (arg2.anObjectArray6 != null) {
			@Pc(13) Class1_Sub16 local13 = new Class1_Sub16();
			local13.aClass229_4 = arg2;
			local13.anObjectArray1 = arg2.anObjectArray6;
			Static354.method5070(local13);
		}
		Static36.anInt7708 = arg2.anInt6921;
		Static217.aBoolean311 = true;
		Static93.anInt1804 = arg0;
		Static380.anInt6831 = arg2.anInt6860;
		Static308.anInt7729 = arg1;
		Static224.anInt3903 = arg2.anInt6923;
		Static281.anInt4710 = arg2.anInt6918;
		Static139.anInt2525 = arg2.anInt6939;
		Static373.method5289(arg2);
	}
}
