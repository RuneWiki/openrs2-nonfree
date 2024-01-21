import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public abstract class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ka", name = "L", descriptor = "S")
	public short aShort36 = -32768;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIIIII)V")
	public void method3156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class1_Sub1_Sub1_Sub2 local7 = this.method3157();
		if (local7 != null) {
			local7.method3156(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.aShort36 = local7.aShort36;
		}
	}

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "(I)Lclient!w;")
	protected Class1_Sub1_Sub1_Sub2 method3157() {
		return null;
	}
}
