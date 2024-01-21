import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!gh", name = "v", descriptor = "I")
	public int anInt1380;

	@OriginalMember(owner = "client!gh", name = "z", descriptor = "I")
	public int anInt1383;

	@OriginalMember(owner = "client!gh", name = "u", descriptor = "I")
	private int anInt1379 = -32768;

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "()I")
	@Override
	public int method2449() {
		return this.anInt1379;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(14) Class1_Sub1 local14 = Static196.method2908(this.anInt1380).method1782(0, this.anInt1383, null);
		if (local14 != null) {
			local14.method2445(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt1379 = local14.method2449();
		}
	}
}
