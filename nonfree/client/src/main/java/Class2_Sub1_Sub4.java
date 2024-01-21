import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public abstract class Class2_Sub1_Sub4 extends Class2_Sub1 {

	@OriginalMember(owner = "client!db", name = "eb", descriptor = "I")
	public int anInt2916 = 1000;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIIIII)V")
	public void method2029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class2_Sub1_Sub4_Sub1 local7 = this.method2031();
		if (local7 != null) {
			this.anInt2916 = local7.anInt2916;
			local7.method2029(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!db", name = "d", descriptor = "(B)Lclient!fd;")
	public Class2_Sub1_Sub4_Sub1 method2031() {
		return null;
	}
}
