import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public abstract class Class4_Sub1_Sub3 extends Class4_Sub1 {

	@OriginalMember(owner = "client!dd", name = "I", descriptor = "I")
	public int anInt2808 = 1000;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIIIIII)V")
	public void method1814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class4_Sub1_Sub3_Sub3 local7 = this.method1816();
		if (local7 != null) {
			this.anInt2808 = local7.anInt2808;
			local7.method1814(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)Lclient!od;")
	public Class4_Sub1_Sub3_Sub3 method1816() {
		return null;
	}
}
