import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public abstract class Class24 {

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIIIIIJ)V")
	public abstract void method2974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8);

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!rb;IIIZ)V")
	public void method2976(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(III)Lclient!rb;")
	public Class24 method2977() {
		return this;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "()I")
	public abstract int method2978();

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "()Z")
	public boolean method2979() {
		return false;
	}
}
