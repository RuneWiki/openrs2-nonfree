import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class Class2_Sub1_Sub1 extends Class2_Sub1 {

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIIIIIJ)V")
	public abstract void method3173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8);

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!aa;IIIZ)V")
	public void method3176(@OriginalArg(0) Class2_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(III)Lclient!aa;")
	public Class2_Sub1_Sub1 method3177() {
		return this;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "()Z")
	public boolean method3178() {
		return false;
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "()I")
	public abstract int method3179();
}
