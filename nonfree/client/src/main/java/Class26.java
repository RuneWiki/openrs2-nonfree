import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public abstract class Class26 {

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(III)Lclient!m;")
	public Class26 method2992() {
		return this;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIIIIIJ)V")
	public abstract void method2993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8);

	@OriginalMember(owner = "client!m", name = "a", descriptor = "()Z")
	public boolean method2994() {
		return false;
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "()I")
	public abstract int method2995();

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!m;IIIZ)V")
	public void method2996(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
	}
}
