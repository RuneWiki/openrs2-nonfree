import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public abstract class Class2_Sub1_Sub1 extends Class2_Sub1 {

	@OriginalMember(owner = "client!pa", name = "U", descriptor = "I")
	public int anInt3029 = 1000;

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "(I)Lclient!ad;")
	public Class2_Sub1_Sub1_Sub2 method2168() {
		return null;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIIIIII)V")
	public void method2169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class2_Sub1_Sub1_Sub2 local7 = this.method2168();
		if (local7 != null) {
			this.anInt3029 = local7.anInt3029;
			local7.method2169(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}
}
