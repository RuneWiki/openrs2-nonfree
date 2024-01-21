import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public abstract class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!wc", name = "rb", descriptor = "I")
	public int anInt2699 = 1000;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIIIII)V")
	public void method1895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class1_Sub1_Sub1_Sub6 local7 = this.method1897();
		if (local7 != null) {
			this.anInt2699 = local7.anInt2699;
			local7.method1895(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)Lclient!lb;")
	public Class1_Sub1_Sub1_Sub6 method1897() {
		return null;
	}
}
