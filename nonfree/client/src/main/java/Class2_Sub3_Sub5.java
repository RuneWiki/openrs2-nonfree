import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public abstract class Class2_Sub3_Sub5 extends Class2_Sub3 {

	@OriginalMember(owner = "client!nd", name = "C", descriptor = "S")
	public short aShort25 = -32768;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIIIIII)V")
	public void method2297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class2_Sub3_Sub5_Sub7 local3 = this.method2298();
		if (local3 != null) {
			local3.method2297(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.aShort25 = local3.aShort25;
		}
	}

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "(I)Lclient!sa;")
	protected Class2_Sub3_Sub5_Sub7 method2298() {
		return null;
	}
}
