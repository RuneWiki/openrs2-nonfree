import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public abstract class Class2_Sub2_Sub3 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ka", name = "T", descriptor = "S")
	public short aShort34 = -32768;

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)Lclient!ue;")
	protected Class2_Sub2_Sub3_Sub4 method2725() {
		return null;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIIIIJ)V")
	public void method2726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(7) Class2_Sub2_Sub3_Sub4 local7 = this.method2725();
		if (local7 != null) {
			local7.method2726(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.aShort34 = local7.aShort34;
		}
	}
}
