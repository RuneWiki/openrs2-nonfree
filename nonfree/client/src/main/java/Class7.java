import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public abstract class Class7 {

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(III)Lclient!mf;")
	public Class7 method3142() {
		return this;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIIIIJ)V")
	public abstract void method3143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8);

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!mf;IIIZ)V")
	public void method3144(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "()I")
	public abstract int method3148();

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "()Z")
	public boolean method3150() {
		return false;
	}
}
