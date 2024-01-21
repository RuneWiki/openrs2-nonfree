import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public abstract class Class5_Sub2_Sub4 extends Class5_Sub2 {

	@OriginalMember(owner = "client!jf", name = "qb", descriptor = "I")
	public int anInt2379 = 1000;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIIIIII)V")
	public void method1611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class5_Sub2_Sub4_Sub2 local7 = this.method1612();
		if (local7 != null) {
			this.anInt2379 = local7.anInt2379;
			local7.method1611(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "(I)Lclient!dd;")
	public Class5_Sub2_Sub4_Sub2 method1612() {
		return null;
	}
}
