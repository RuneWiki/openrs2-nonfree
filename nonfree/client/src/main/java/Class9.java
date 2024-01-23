import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public abstract class Class9 {

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "()Z")
	public boolean method2896() {
		return false;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(III)Lclient!dd;")
	public Class9 method2898() {
		return this;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!dd;IIIZ)V")
	public void method2900(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(III)V")
	public void method2901(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "()I")
	public abstract int method2902();

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIIIIIJ)V")
	public abstract void method2903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8);
}
