import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
	public static int anInt5634 = -1;

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_122 = new Class362(115, 3);

	@OriginalMember(owner = "client!kl", name = "h", descriptor = "[Lclient!un;")
	public static final Class4_Sub11[] aClass4_Sub11Array1 = new Class4_Sub11[2048];

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(BLclient!wv;)V")
	public static void method4771(@OriginalArg(1) Class4_Sub51 arg0) {
		if (Static60.aClass53ArrayArrayArray1 == null) {
			return;
		}
		@Pc(13) Interface19 local13 = null;
		if (arg0.anInt10262 == 0) {
			local13 = (Interface19) Static353.method5714(arg0.anInt10249, arg0.anInt10248, arg0.anInt10261);
		}
		if (arg0.anInt10262 == 1) {
			local13 = (Interface19) Static135.method2682(arg0.anInt10249, arg0.anInt10248, arg0.anInt10261);
		}
		if (arg0.anInt10262 == 2) {
			local13 = (Interface19) Static397.method6277(arg0.anInt10249, arg0.anInt10248, arg0.anInt10261, pn.class);
		}
		if (arg0.anInt10262 == 3) {
			local13 = (Interface19) Static460.method7015(arg0.anInt10249, arg0.anInt10248, arg0.anInt10261);
		}
		if (local13 == null) {
			arg0.anInt10251 = -1;
			arg0.anInt10253 = 0;
			arg0.anInt10258 = 0;
		} else {
			arg0.anInt10251 = local13.method7827();
			arg0.anInt10258 = local13.method7825();
			arg0.anInt10253 = local13.method7829();
		}
	}
}
