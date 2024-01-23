import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public abstract class Class5 {

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(III)Lclient!af;")
	public Class5 method2292() {
		return this;
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(IIIII)V")
	public void method2295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!af;IIIZ)V")
	public void method2296(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "()I")
	public abstract int method2297();

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIIIIJ)V")
	public abstract void method2300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8);

	@OriginalMember(owner = "client!af", name = "b", descriptor = "()Z")
	public boolean method2302() {
		return false;
	}
}
