import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public abstract class Class2_Sub2_Sub1 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ac", name = "W", descriptor = "S")
	public short aShort32 = -32768;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIIIII)V")
	public void method2907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class2_Sub2_Sub1_Sub2 local3 = this.method2908();
		if (local3 != null) {
			local3.method2907(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.aShort32 = local3.aShort32;
		}
	}

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "(I)Lclient!cd;")
	protected Class2_Sub2_Sub1_Sub2 method2908() {
		return null;
	}
}
