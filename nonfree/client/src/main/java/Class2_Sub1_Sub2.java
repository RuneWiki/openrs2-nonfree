import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public abstract class Class2_Sub1_Sub2 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ae", name = "db", descriptor = "I")
	public int anInt2876 = 1000;

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "(I)Lclient!ga;")
	protected Class2_Sub1_Sub2_Sub2 method2061() {
		return null;
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(IIIIIIIII)V")
	public void method2064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class2_Sub1_Sub2_Sub2 local7 = this.method2061();
		if (local7 != null) {
			this.anInt2876 = local7.anInt2876;
			local7.method2064(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}
}
