import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public abstract class Class1 {

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!ia;IIIZ)V")
	public void method2442(@OriginalArg(0) Class1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)Lclient!ia;")
	public Class1 method2444() {
		return this;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIIIIJ)V")
	public abstract void method2445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8);

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "()Z")
	public boolean method2448() {
		return false;
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "()I")
	public abstract int method2449();
}
