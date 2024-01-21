import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class24_Sub5 extends Class24 {

	@OriginalMember(owner = "client!pi", name = "q", descriptor = "I")
	public int anInt3068;

	@OriginalMember(owner = "client!pi", name = "v", descriptor = "I")
	public int anInt3071;

	@OriginalMember(owner = "client!pi", name = "F", descriptor = "I")
	private int anInt3077 = -32768;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(10) Class24_Sub3 local10 = Static113.method1987(this.anInt3068).method332(this.anInt3071, null, 0);
		if (local10 != null) {
			local10.method2974(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt3077 = local10.method2978();
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "()I")
	@Override
	public int method2978() {
		return this.anInt3077;
	}
}
