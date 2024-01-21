import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class8_Sub4 extends Class8 {

	@OriginalMember(owner = "client!dj", name = "p", descriptor = "I")
	public int anInt1071;

	@OriginalMember(owner = "client!dj", name = "y", descriptor = "I")
	public int anInt1080;

	@OriginalMember(owner = "client!dj", name = "z", descriptor = "I")
	private int anInt1081 = -32768;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(14) Class8_Sub5 local14 = Static102.method1549(this.anInt1080).method2938(null, this.anInt1071, 0);
		if (local14 != null) {
			local14.method2672(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt1081 = local14.method2668();
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "()I")
	@Override
	public int method2668() {
		return this.anInt1081;
	}
}
