import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public abstract class Class1_Sub3_Sub4 extends Class1_Sub3 {

	@OriginalMember(owner = "client!od", name = "T", descriptor = "I")
	public int anInt3024 = 1000;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIIIII)V")
	public void method2143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class1_Sub3_Sub4_Sub4 local7 = this.method2148();
		if (local7 != null) {
			this.anInt3024 = local7.anInt3024;
			local7.method2143(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(I)Lclient!eb;")
	public Class1_Sub3_Sub4_Sub4 method2148() {
		return null;
	}
}
