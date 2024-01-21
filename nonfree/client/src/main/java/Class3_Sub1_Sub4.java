import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public abstract class Class3_Sub1_Sub4 extends Class3_Sub1 {

	@OriginalMember(owner = "client!sd", name = "K", descriptor = "I")
	public int anInt2525 = 1000;

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "(I)Lclient!ua;")
	public Class3_Sub1_Sub4_Sub7 method1750() {
		return null;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIIII)V")
	public void method1753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class3_Sub1_Sub4_Sub7 local7 = this.method1750();
		if (local7 != null) {
			this.anInt2525 = local7.anInt2525;
			local7.method1753(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}
}
