import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public abstract class Class15 {

	@OriginalMember(owner = "client!io", name = "a", descriptor = "()I")
	public abstract int method4676();

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIIIIIIJILclient!lg;)V")
	public abstract void method4678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class87_Sub2 arg10);

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIII)V")
	public abstract void method4679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!io", name = "b", descriptor = "()Z")
	public boolean method4680() {
		return false;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!io;IIIZ)V")
	public void method4683(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(III)Lclient!io;")
	public Class15 method4684() {
		return this;
	}
}
