import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class10_Sub2 extends Class10 {

	@OriginalMember(owner = "client!bc", name = "y", descriptor = "I")
	public int anInt365;

	@OriginalMember(owner = "client!bc", name = "C", descriptor = "I")
	public int anInt369;

	@OriginalMember(owner = "client!bc", name = "s", descriptor = "I")
	private int anInt360 = -32768;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "()I")
	@Override
	public int method4973() {
		return this.anInt360;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIIIIIJILclient!em;)V")
	@Override
	public void method4982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class47_Sub1 arg10) {
		@Pc(17) Class10_Sub4 local17 = Static133.method2309(this.anInt365).method446(-1, 0, this.anInt369, null, null, 0);
		if (local17 != null) {
			local17.method4982(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
			this.anInt360 = local17.method4973();
		}
	}
}
