import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!go", name = "Q", descriptor = "[J")
	public static long[] aLongArray2;

	@OriginalMember(owner = "client!go", name = "T", descriptor = "Ljava/lang/Object;")
	public static Object anObject19;

	@OriginalMember(owner = "client!go", name = "P", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_42 = new Class61(80, 0);

	@OriginalMember(owner = "client!go", name = "R", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_43 = new Class61(5, 6);

	@OriginalMember(owner = "client!go", name = "S", descriptor = "Lclient!nea;")
	public static final Class240 aClass240_2 = new Class240();

	@OriginalMember(owner = "client!go", name = "U", descriptor = "I")
	public static int anInt3756 = 0;

	@OriginalMember(owner = "client!go", name = "V", descriptor = "I")
	public static int anInt3757 = 0;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(JJ)J")
	public static long method3323(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(BI[B)[B")
	public static byte[] method3325(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(14) byte[] local14 = new byte[arg0];
		Static602.method1586(arg1, 0, local14, 0, arg0);
		return local14;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "()V")
	public static void method3326() {
		for (@Pc(1) int local1 = 0; local1 < Static593.anInt9755; local1++) {
			@Pc(6) Class10_Sub1 local6 = Static463.aClass10_Sub1Array3[local1];
			Static182.method3381(local6);
			Static463.aClass10_Sub1Array3[local1] = null;
		}
		Static593.anInt9755 = 0;
	}
}
