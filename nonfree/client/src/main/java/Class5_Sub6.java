import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class5_Sub6 extends Class5 {

	@OriginalMember(owner = "client!rc", name = "t", descriptor = "I")
	public int anInt3992;

	@OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
	public int anInt3997;

	@OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
	private int anInt3993 = -32768;

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "()I")
	@Override
	public int method3773() {
		return this.anInt3993;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(10) Class5_Sub3 local10 = Static32.method3209(this.anInt3992).method2737(this.anInt3997, null, 0);
		if (local10 != null) {
			local10.method3779(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt3993 = local10.method3773();
		}
	}
}
