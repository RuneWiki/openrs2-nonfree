import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public abstract class Class3_Sub2_Sub1 extends Class3_Sub2 {

	@OriginalMember(owner = "client!kb", name = "P", descriptor = "S")
	public short aShort36 = -32768;

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "(I)Lclient!d;")
	protected Class3_Sub2_Sub1_Sub1 method2761() {
		return null;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIIIIJ)V")
	public void method2763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(3) Class3_Sub2_Sub1_Sub1 local3 = this.method2761();
		if (local3 != null) {
			local3.method2763(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.aShort36 = local3.aShort36;
		}
	}
}
