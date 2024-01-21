import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public abstract class Class8 {

	@OriginalMember(owner = "client!e", name = "a", descriptor = "()I")
	public abstract int method2668();

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(III)Lclient!e;")
	public Class8 method2669() {
		return this;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "()Z")
	public boolean method2671() {
		return false;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIIIIJ)V")
	public abstract void method2672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!e;IIIZ)V")
	public void method2674(@OriginalArg(0) Class8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
	}
}
