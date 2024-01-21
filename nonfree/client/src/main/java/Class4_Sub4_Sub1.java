import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public abstract class Class4_Sub4_Sub1 extends Class4_Sub4 {

	@OriginalMember(owner = "client!le", name = "J", descriptor = "I")
	public int anInt2816 = 1000;

	@OriginalMember(owner = "client!le", name = "e", descriptor = "(B)Lclient!rb;")
	public Class4_Sub4_Sub1_Sub6 method1976() {
		return null;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIIIII)V")
	public void method1983(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class4_Sub4_Sub1_Sub6 local3 = this.method1976();
		if (local3 != null) {
			this.anInt2816 = local3.anInt2816;
			local3.method1983(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}
}
