import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!rs", name = "q", descriptor = "Lclient!ba;")
	public static Class18 aClass18_4;

	@OriginalMember(owner = "client!rs", name = "v", descriptor = "[I")
	public static int[] anIntArray507;

	@OriginalMember(owner = "client!rs", name = "C", descriptor = "F")
	public static float aFloat87;

	@OriginalMember(owner = "client!rs", name = "o", descriptor = "I")
	public static int anInt6300 = 0;

	@OriginalMember(owner = "client!rs", name = "i", descriptor = "(I)[Lclient!fh;")
	public static Class73[] method5179() {
		return new Class73[] { Static341.aClass73_7, Static215.aClass73_6, Static173.aClass73_5 };
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!qa;BLclient!tf;)V")
	public static void method5181(@OriginalArg(0) Class30 arg0, @OriginalArg(2) Class240 arg1) {
		@Pc(35) boolean local35 = Static139.aClass193_1.method4655(arg1.anInt6856, arg1.aBoolean505 ? Static52.aClass11_Sub5_Sub2_Sub1_2.aClass90_1 : null, arg1.anInt6916, arg1.anInt6853 | 0xFF000000, arg1.anInt6881, arg1.anInt6876, arg0) == null;
		if (local35) {
			Static332.aClass91_38.method2587(new Class4_Sub33(arg1.anInt6876, arg1.anInt6881, arg1.anInt6856, arg1.anInt6853 | 0xFF000000, arg1.anInt6916, arg1.aBoolean505));
			Static273.method4374(arg1);
		}
	}
}
