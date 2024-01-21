import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public abstract class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!cc", name = "X", descriptor = "I")
	public int anInt2467 = 1000;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIIIII)V")
	public void method1789(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class1_Sub1_Sub2_Sub7 local7 = this.method1790();
		if (local7 != null) {
			this.anInt2467 = local7.anInt2467;
			local7.method1789(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)Lclient!na;")
	public Class1_Sub1_Sub2_Sub7 method1790() {
		return null;
	}
}
