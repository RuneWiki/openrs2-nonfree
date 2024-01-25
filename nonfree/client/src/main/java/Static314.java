import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static314 {

	@OriginalMember(owner = "client!kh", name = "j", descriptor = "Lclient!rd;")
	public static Class263 aClass263_6;

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
	public static int anInt5517;

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "Lclient!kh;")
	public static final Class202 aClass202_1 = new Class202();

	@OriginalMember(owner = "client!kh", name = "i", descriptor = "Lclient!kh;")
	public static final Class202 aClass202_2 = new Class202();

	@OriginalMember(owner = "client!kh", name = "h", descriptor = "Lclient!kh;")
	public static final Class202 aClass202_3 = new Class202();

	@OriginalMember(owner = "client!kh", name = "k", descriptor = "Lclient!kh;")
	public static final Class202 aClass202_4 = new Class202();

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "[I")
	public static final int[] anIntArray309 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "[Lclient!ev;")
	public static Class106[] aClass106Array1 = new Class106[50];

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString72 = "";

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!v;ILclient!v;)V")
	public static void method4993(@OriginalArg(0) Class14_Sub2 arg0, @OriginalArg(2) Class14_Sub2 arg1) {
		if (arg0.aClass14_Sub2_66 != null) {
			arg0.method9093();
		}
		arg0.aClass14_Sub2_67 = arg1.aClass14_Sub2_67;
		arg0.aClass14_Sub2_66 = arg1;
		arg0.aClass14_Sub2_66.aClass14_Sub2_67 = arg0;
		arg0.aClass14_Sub2_67.aClass14_Sub2_66 = arg0;
	}
}
