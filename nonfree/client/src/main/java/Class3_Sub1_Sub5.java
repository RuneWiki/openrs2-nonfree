import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public abstract class Class3_Sub1_Sub5 extends Class3_Sub1 {

	@OriginalMember(owner = "client!dd", name = "Q", descriptor = "S")
	public short aShort34 = -32768;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIIIIIJ)V")
	public void method3054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(3) Class3_Sub1_Sub5_Sub3 local3 = this.method3056();
		if (local3 != null) {
			local3.method3054(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.aShort34 = local3.aShort34;
		}
	}

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "(I)Lclient!vf;")
	protected Class3_Sub1_Sub5_Sub3 method3056() {
		return null;
	}
}
