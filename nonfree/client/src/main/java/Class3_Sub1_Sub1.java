import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public abstract class Class3_Sub1_Sub1 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ee", name = "Z", descriptor = "I")
	public int anInt3333 = 1000;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIIIII)V")
	public void method2223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class3_Sub1_Sub1_Sub4 local7 = this.method2225();
		if (local7 != null) {
			this.anInt3333 = local7.anInt3333;
			local7.method2223(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "(I)Lclient!ea;")
	public Class3_Sub1_Sub1_Sub4 method2225() {
		return null;
	}
}
