import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static446 {

	@OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
	public static int anInt8090;

	@OriginalMember(owner = "client!qb", name = "o", descriptor = "[I")
	public static final int[] anIntArray507 = new int[3];

	@OriginalMember(owner = "client!qb", name = "y", descriptor = "Lclient!jt;")
	public static final Class167 aClass167_6 = new Class167(1);

	@OriginalMember(owner = "client!qb", name = "z", descriptor = "Lclient!qi;")
	public static final Class275 aClass275_7 = new Class275(5, 1);

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!mb;)V")
	public static void method6762(@OriginalArg(0) Class2_Sub3 arg0) {
		Static185.aClass33_8.H(arg0.anInt10428, arg0.anInt10429 + (arg0.method8574() >> 1), arg0.anInt10424, Static376.anIntArray413);
		arg0.anInt10421 = Static376.anIntArray413[0];
		arg0.anInt10422 = Static376.anIntArray413[1];
		arg0.anInt10423 = Static376.anIntArray413[2];
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!cca;Lclient!cca;B)V")
	public static void method6763(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2 arg1) {
		if (arg0.aClass2_66 != null) {
			arg0.method8558();
		}
		arg0.aClass2_66 = arg1.aClass2_66;
		arg0.aClass2_65 = arg1;
		arg0.aClass2_66.aClass2_65 = arg0;
		arg0.aClass2_65.aClass2_66 = arg0;
	}
}
