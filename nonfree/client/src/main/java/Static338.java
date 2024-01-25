import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!li", name = "Dc", descriptor = "I")
	public static int anInt9520;

	@OriginalMember(owner = "client!li", name = "xc", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_291 = new Class196(85, 11);

	@OriginalMember(owner = "client!li", name = "Fc", descriptor = "I")
	public static int anInt9521 = 0;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(II)V")
	public static void method7921() {
		@Pc(5) Class265 local5 = Static540.aClass265_59;
		synchronized (Static540.aClass265_59) {
			Static540.aClass265_59.method6570(5);
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IZII)V")
	public static void method7924(@OriginalArg(1) boolean arg0) {
		Static227.anInt3654 = 22050;
		Static53.anInt4076 = 2;
		Static135.aBoolean154 = arg0;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!wga;B)Lclient!bk;")
	public static Class40 method7929(@OriginalArg(0) Class41_Sub1_Sub1 arg0) {
		@Pc(12) Class40 local12;
		if (Static196.aClass40_2 == null) {
			local12 = new Class40();
		} else {
			local12 = Static196.aClass40_2;
			Static196.aClass40_2 = Static196.aClass40_2.aClass40_1;
			local12.aClass40_1 = null;
			Static534.anInt10372--;
		}
		local12.aClass41_Sub1_Sub1_1 = arg0;
		return local12;
	}
}
