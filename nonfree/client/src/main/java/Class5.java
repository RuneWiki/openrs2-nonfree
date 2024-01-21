import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public abstract class Class5 {

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)Lclient!wd;")
	public Class5 method3161() {
		return this;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "()I")
	public abstract int method3163();

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIIIIJ)V")
	public abstract void method3164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8);

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!wd;IIIZ)V")
	public void method3165(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "()Z")
	public boolean method3166() {
		return false;
	}
}
