import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public abstract class Class1_Sub1_Sub5 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ff", name = "L", descriptor = "I")
	public int anInt4233 = 1000;

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(Z)Lclient!rg;")
	public Class1_Sub1_Sub5_Sub4 method2896() {
		return null;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIIIIII)V")
	public void method2897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class1_Sub1_Sub5_Sub4 local7 = this.method2896();
		if (local7 != null) {
			this.anInt4233 = local7.anInt4233;
			local7.method2897(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}
}
