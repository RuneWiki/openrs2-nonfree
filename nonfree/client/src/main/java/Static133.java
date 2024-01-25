import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!eu", name = "e", descriptor = "Lclient!gk;")
	public static final Class112 aClass112_20 = new Class112();

	@OriginalMember(owner = "client!eu", name = "g", descriptor = "I")
	public static int anInt2910 = 0;

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(ZZB)V")
	public static void method2618(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			Static81.anInt1829--;
			if (Static81.anInt1829 == 0) {
				Static271.anIntArray256 = null;
			}
		}
		if (arg0) {
			Static108.anInt7946--;
			if (Static108.anInt7946 == 0) {
				Static214.anIntArray203 = null;
			}
		}
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lclient!hl;B)V")
	public static void method2620(@OriginalArg(0) Class3_Sub26 arg0) {
		if (Static309.aClass299ArrayArrayArray3 == null) {
			return;
		}
		@Pc(12) Interface4 local12 = null;
		if (arg0.anInt3742 == 0) {
			local12 = (Interface4) Static184.method3149(arg0.anInt3740, arg0.anInt3738, arg0.anInt3735);
		}
		if (arg0.anInt3742 == 1) {
			local12 = (Interface4) Static418.method5942(arg0.anInt3740, arg0.anInt3738, arg0.anInt3735);
		}
		if (arg0.anInt3742 == 2) {
			local12 = (Interface4) Static480.method6569(arg0.anInt3740, arg0.anInt3738, arg0.anInt3735, gda.class);
		}
		if (arg0.anInt3742 == 3) {
			local12 = (Interface4) Static508.method6867(arg0.anInt3740, arg0.anInt3738, arg0.anInt3735);
		}
		if (local12 == null) {
			arg0.anInt3744 = -1;
			arg0.anInt3737 = 0;
			arg0.anInt3736 = 0;
		} else {
			arg0.anInt3744 = local12.method7561();
			arg0.anInt3737 = local12.method7556();
			arg0.anInt3736 = local12.method7562();
		}
	}
}
