import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static675 {

	@OriginalMember(owner = "client!vda", name = "H", descriptor = "Z")
	public static boolean aBoolean771 = true;

	@OriginalMember(owner = "client!vda", name = "O", descriptor = "[I")
	public static final int[] anIntArray602 = new int[13];

	@OriginalMember(owner = "client!vda", name = "Q", descriptor = "I")
	public static int anInt10693 = -1;

	@OriginalMember(owner = "client!vda", name = "K", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_189 = new Class186(75, 5);

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(III)V")
	public static void method8935(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) Class3_Sub4_Sub2 local19 = Static502.method7211(18, (long) arg1 | (long) arg0 << 32);
		local19.method627();
	}

	@OriginalMember(owner = "client!vda", name = "d", descriptor = "(I)V")
	public static void method8937() {
		for (@Pc(6) Class3_Sub24 local6 = (Class3_Sub24) Static699.aClass136_50.method3509(); local6 != null; local6 = (Class3_Sub24) Static699.aClass136_50.method3506()) {
			if (local6.aClass78_Sub1_1.method2108()) {
				Static411.method5564(local6.anInt3357);
			} else {
				local6.aClass78_Sub1_1.method2109();
				try {
					local6.aClass78_Sub1_1.method2098();
				} catch (@Pc(33) Exception local33) {
					Static64.method799("TV: " + local6.anInt3357, local33);
					Static411.method5564(local6.anInt3357);
				}
				if (!local6.aBoolean273 && !local6.aBoolean271) {
					@Pc(63) Class3_Sub8_Sub3 local63 = local6.aClass78_Sub1_1.method2106();
					if (local63 != null) {
						@Pc(69) Class3_Sub22_Sub3 local69 = local63.method8287();
						if (local69 != null) {
							local69.method7191(local6.anInt3353);
							Static155.aClass3_Sub22_Sub4_1.method9058(local69);
							local6.aBoolean273 = true;
						}
					}
				}
			}
		}
		if (3 == 3) {
			;
		}
	}
}
