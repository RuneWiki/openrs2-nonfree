import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public abstract class Class5 {

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!qf;IIIZ)V")
	public void method3771(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "()Z")
	public boolean method3772() {
		return false;
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "()I")
	public abstract int method3773();

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIB)V")
	public void method3777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIIIIJ)V")
	public abstract void method3779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8);

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(III)Lclient!qf;")
	public Class5 method3781() {
		return this;
	}
}
