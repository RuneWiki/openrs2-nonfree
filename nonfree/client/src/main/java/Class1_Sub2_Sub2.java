import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public abstract class Class1_Sub2_Sub2 extends Class1_Sub2 {

	@OriginalMember(owner = "client!lc", name = "V", descriptor = "S")
	public short aShort27 = -32768;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIIIIJ)V")
	public void method2704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(7) Class1_Sub2_Sub2_Sub5 local7 = this.method2706();
		if (local7 != null) {
			local7.method2704(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.aShort27 = local7.aShort27;
		}
	}

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "(B)Lclient!ia;")
	protected Class1_Sub2_Sub2_Sub5 method2706() {
		return null;
	}
}
