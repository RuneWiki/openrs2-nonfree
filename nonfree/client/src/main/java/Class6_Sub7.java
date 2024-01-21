import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class6_Sub7 extends Class6 {

	@OriginalMember(owner = "client!rb", name = "bb", descriptor = "I")
	public int anInt3626;

	@OriginalMember(owner = "client!rb", name = "fb", descriptor = "I")
	public int anInt3630;

	@OriginalMember(owner = "client!rb", name = "db", descriptor = "I")
	private int anInt3628 = -32768;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "()I")
	@Override
	public int method2984() {
		return this.anInt3628;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(10) Class6_Sub3 local10 = Static40.method700(this.anInt3630).method216(null, 0, this.anInt3626);
		if (local10 != null) {
			local10.method2989(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt3628 = local10.method2984();
		}
	}
}
