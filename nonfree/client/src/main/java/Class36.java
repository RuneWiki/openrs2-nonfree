import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public abstract class Class36 {

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIII)V")
	public abstract void method4172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIIIIIJILclient!rb;)V")
	public abstract void method4173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class105_Sub1 arg10);

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "()Z")
	public boolean method4174() {
		return false;
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "()I")
	public abstract int method4175();

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(III)Lclient!eh;")
	public Class36 method4178() {
		return this;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!eh;IIIZ)V")
	public void method4179(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
	}
}
