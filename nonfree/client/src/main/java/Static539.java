import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static539 {

	@OriginalMember(owner = "client!wq", name = "O", descriptor = "I")
	public static int anInt9517;

	@OriginalMember(owner = "client!wq", name = "h", descriptor = "(I)V")
	public static void method8205() {
		if (Static28.aBoolean69) {
			Static28.aBoolean69 = false;
			Static322.aClass104_22 = null;
			Static242.aClass104_19 = null;
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(ZI[B)V")
	public static void method8206(@OriginalArg(0) boolean arg0, @OriginalArg(2) byte[] arg1) {
		if (Static458.aClass1_Sub17_8 == null) {
			Static458.aClass1_Sub17_8 = new Class1_Sub17(20000);
		}
		Static458.aClass1_Sub17_8.method4454(arg1.length, arg1);
		if (!arg0) {
			return;
		}
		Static513.method7850(Static458.aClass1_Sub17_8.aByteArray58);
		Static529.aClass38_Sub1Array140 = new Class38_Sub1[Static329.anInt6176];
		@Pc(31) int local31 = 0;
		for (@Pc(33) int local33 = Static411.anInt9221; local33 <= Static81.anInt1884; local33++) {
			@Pc(39) Class38_Sub1 local39 = Static430.method8163(local33);
			if (local39 != null) {
				Static529.aClass38_Sub1Array140[local31++] = local39;
			}
		}
		Static42.aBoolean101 = false;
		Static62.aLong39 = Static110.method2222();
		Static458.aClass1_Sub17_8 = null;
	}
}
