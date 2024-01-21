import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public abstract class Class8_Sub1_Sub1 extends Class8_Sub1 {

	@OriginalMember(owner = "client!ka", name = "X", descriptor = "I")
	public int anInt2957 = 1000;

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(B)Lclient!nb;")
	public Class8_Sub1_Sub1_Sub6 method1955() {
		return null;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIIIII)V")
	public void method1959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class8_Sub1_Sub1_Sub6 local3 = this.method1955();
		if (local3 != null) {
			this.anInt2957 = local3.anInt2957;
			local3.method1959(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		}
	}
}
