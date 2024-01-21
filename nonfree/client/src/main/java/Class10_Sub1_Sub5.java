import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public abstract class Class10_Sub1_Sub5 extends Class10_Sub1 {

	@OriginalMember(owner = "client!oa", name = "X", descriptor = "I")
	public int anInt2674 = 1000;

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)Lclient!rb;")
	protected Class10_Sub1_Sub5_Sub4 method1663() {
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIII)V")
	public void method1664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class10_Sub1_Sub5_Sub4 local7 = this.method1663();
		if (local7 != null) {
			this.anInt2674 = local7.anInt2674;
			local7.method1664(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}
}
