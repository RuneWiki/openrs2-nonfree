import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class7_Sub6 extends Class7 {

	@OriginalMember(owner = "client!sa", name = "v", descriptor = "I")
	public int anInt3706;

	@OriginalMember(owner = "client!sa", name = "D", descriptor = "I")
	public int anInt3711;

	@OriginalMember(owner = "client!sa", name = "K", descriptor = "I")
	private int anInt3715 = -32768;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "()I")
	@Override
	public int method3148() {
		return this.anInt3715;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(14) Class7_Sub7 local14 = Static52.method774(this.anInt3706).method3201(this.anInt3711, null, 0);
		if (local14 != null) {
			local14.method3143(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt3715 = local14.method3148();
		}
	}
}
