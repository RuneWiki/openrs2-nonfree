import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "Lclient!pg;")
	public static Class56_Sub1 aClass56_Sub1_2;

	@OriginalMember(owner = "client!vq", name = "d", descriptor = "[Lclient!vf;")
	public static Class234[] aClass234Array1;

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "Lclient!vh;")
	public static final Class2_Sub16_Sub2 aClass2_Sub16_Sub2_4 = new Class2_Sub16_Sub2(5000);

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(III)Lclient!pf;")
	public static Class188 method5458(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class188 local7 = new Class188();
		local7.anInt4570 = -1;
		local7.anInt4568 = arg1 + 6;
		local7.anInt4574 = -1;
		local7.anInt4567 = arg0 + 6;
		local7.anIntArrayArray34 = new int[local7.anInt4567][local7.anInt4568];
		local7.method4043();
		return local7;
	}
}
