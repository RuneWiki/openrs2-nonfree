import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public abstract class Class20 {

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "()Z")
	public boolean method3487() {
		return false;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIII)V")
	public void method3488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!ta;IIIZ)V")
	public void method3490(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "()I")
	public abstract int method3494();

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIIIIJ)V")
	public abstract void method3495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8);

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)Lclient!ta;")
	public Class20 method3497() {
		return this;
	}
}
