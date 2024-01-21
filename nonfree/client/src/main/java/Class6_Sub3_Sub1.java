import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public abstract class Class6_Sub3_Sub1 extends Class6_Sub3 {

	@OriginalMember(owner = "client!id", name = "kb", descriptor = "I")
	public int anInt3082 = 1000;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIIIIII)V")
	public void method2060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class6_Sub3_Sub1_Sub3 local7 = this.method2062();
		if (local7 != null) {
			this.anInt3082 = local7.anInt3082;
			local7.method2060(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!id", name = "g", descriptor = "(I)Lclient!df;")
	public Class6_Sub3_Sub1_Sub3 method2062() {
		return null;
	}
}
