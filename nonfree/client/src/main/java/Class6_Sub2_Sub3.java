import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public abstract class Class6_Sub2_Sub3 extends Class6_Sub2 {

	@OriginalMember(owner = "client!k", name = "Z", descriptor = "I")
	public int anInt3206 = 1000;

	@OriginalMember(owner = "client!k", name = "f", descriptor = "(I)Lclient!jb;")
	public Class6_Sub2_Sub3_Sub3 method2063() {
		return null;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIIIIII)V")
	public void method2065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class6_Sub2_Sub3_Sub3 local7 = this.method2063();
		if (local7 != null) {
			this.anInt3206 = local7.anInt3206;
			local7.method2065(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}
}
