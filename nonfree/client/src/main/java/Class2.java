import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public abstract class Class2 {

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(III)Lclient!hd;")
	public Class2 method3943() {
		return this;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIII)V")
	public abstract void method3945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "()Z")
	public boolean method3946() {
		return false;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "()I")
	public abstract int method3948();

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!hd;IIIZ)V")
	public void method3949(@OriginalArg(0) Class2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIIIIJILclient!dc;)V")
	public abstract void method3951(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class34_Sub1 arg10);
}
