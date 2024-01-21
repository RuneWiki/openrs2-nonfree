import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public abstract class Class2_Sub4_Sub1 extends Class2_Sub4 {

	@OriginalMember(owner = "client!d", name = "K", descriptor = "S")
	public short aShort36 = -32768;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIIIIJ)V")
	public void method2856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(7) Class2_Sub4_Sub1_Sub3 local7 = this.method2858();
		if (local7 != null) {
			local7.method2856(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.aShort36 = local7.aShort36;
		}
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(I)Lclient!df;")
	protected Class2_Sub4_Sub1_Sub3 method2858() {
		return null;
	}
}
