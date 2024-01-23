import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public abstract class Class5 {

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIZ)V")
	public void method3676(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!ij;IIIZ)V")
	public void method3678(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIIIIIJ)V")
	public abstract void method3679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8);

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "()I")
	public abstract int method3680();

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "()Z")
	public boolean method3681() {
		return false;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)Lclient!ij;")
	public Class5 method3682() {
		return this;
	}
}
