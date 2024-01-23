import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public abstract class Class10 {

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(III)Lclient!qf;")
	public Class10 method4972() {
		return this;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "()I")
	public abstract int method4973();

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "()Z")
	public boolean method4976() {
		return false;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIII)V")
	public abstract void method4980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIIIIJILclient!em;)V")
	public abstract void method4982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class47_Sub1 arg10);

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!qf;IIIZ)V")
	public void method4983(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
	}
}
