import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class15_Sub1 extends Class15 {

	@OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
	public int anInt336;

	@OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
	public int anInt339;

	@OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
	private int anInt335 = -32768;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIIIIIJILclient!lg;)V")
	@Override
	public void method4678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class87_Sub2 arg10) {
		@Pc(17) Class15_Sub2 local17 = Static49.method909(this.anInt339).method2791(-1, null, 0, 0, null, this.anInt336);
		if (local17 != null) {
			local17.method4678(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
			this.anInt335 = local17.method4676();
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "()I")
	@Override
	public int method4676() {
		return this.anInt335;
	}
}
