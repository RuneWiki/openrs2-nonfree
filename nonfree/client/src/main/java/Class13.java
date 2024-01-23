import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public abstract class Class13 {

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!uk;IIIZ)V")
	public void method4261(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIIIIIJILclient!il;)V")
	public abstract void method4262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class21_Sub1 arg10);

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "()Z")
	public boolean method4264() {
		return false;
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "()I")
	public abstract int method4266();

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIII)V")
	public abstract void method4267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(III)Lclient!uk;")
	public Class13 method4268() {
		return this;
	}
}
