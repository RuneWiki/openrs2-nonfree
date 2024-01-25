import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!qc", name = "I", descriptor = "Z")
	public static boolean aBoolean598 = false;

	@OriginalMember(owner = "client!qc", name = "O", descriptor = "Lclient!fh;")
	public static final Class107 aClass107_7 = new Class107("LIVE", 0);

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IZII)V")
	public static void method7067(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (Static224.aClass99_38.method3056((long) arg2) != null) {
			return;
		}
		if (Static237.aBoolean378) {
			@Pc(31) Class2_Sub26 local31 = new Class2_Sub26(arg2, new Class165_Sub1(4096, Static44.aClass157_34, arg2), arg0, arg1);
			local31.aClass165_Sub1_1.method7052(Static540.aStringArray45[Static476.anInt8915]);
			Static224.aClass99_38.method3059((long) arg2, local31);
		} else {
			Static637.method9202(arg1, arg2);
		}
	}
}
