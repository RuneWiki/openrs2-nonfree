import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!eg", name = "t", descriptor = "[S")
	public static short[] aShortArray105;

	@OriginalMember(owner = "client!eg", name = "k", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_96 = new Class100(88, 3);

	@OriginalMember(owner = "client!eg", name = "v", descriptor = "Lclient!ef;")
	public static final Class87 aClass87_4 = new Class87();

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IBI)V")
	public static void method5679(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class14_Sub3_Sub9 local9 = Static142.method2219((long) arg0, 7);
		local9.method2817();
		local9.anInt3419 = arg1;
	}
}
