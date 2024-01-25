import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static578 {

	@OriginalMember(owner = "client!ti", name = "i", descriptor = "I")
	public static int anInt8920;

	@OriginalMember(owner = "client!ti", name = "g", descriptor = "Lclient!oh;")
	public static final Class268 aClass268_37 = new Class268("", 19);

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZLclient!ha;Lclient!kq;)V")
	public static void method7619(@OriginalArg(1) Class33 arg0, @OriginalArg(2) Class199 arg1) {
		@Pc(31) boolean local31 = Static532.aClass255_2.method5207(arg0, arg1.anInt5032, arg1.anInt5022 | 0xFF000000, arg1.anInt5016, arg1.anInt5034, arg1.aBoolean384 ? Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aClass245_1 : null, arg1.anInt5002) == null;
		if (local31) {
			Static55.aClass163_11.method3646(new Class4_Sub17(arg1.anInt5002, arg1.anInt5032, arg1.anInt5016, arg1.anInt5022 | 0xFF000000, arg1.anInt5034, arg1.aBoolean384));
			Static331.method4565(arg1);
		}
	}
}
