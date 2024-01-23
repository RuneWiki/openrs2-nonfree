import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public abstract class Class12 {

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)Lclient!nc;")
	public Class12 method2713() {
		return this;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!nc;IIIZ)V")
	public void method2714(@OriginalArg(0) Class12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIIIIJ)V")
	public abstract void method2715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8);

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "()Z")
	public boolean method2716() {
		return false;
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(III)V")
	public void method2717(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "()I")
	public abstract int method2718();
}
