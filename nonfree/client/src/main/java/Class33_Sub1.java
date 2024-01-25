import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public final class Class33_Sub1 extends Class33 {

	@OriginalMember(owner = "client!be", name = "p", descriptor = "I")
	public final int anInt578;

	@OriginalMember(owner = "client!be", name = "q", descriptor = "I")
	public final int anInt577;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lclient!al;Lclient!mfa;IIIIIIIII)V")
	public Class33_Sub1(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Class239 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt578 = arg9;
		this.anInt577 = arg10;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I)Lclient!hfa;")
	@Override
	public Class152 method9627() {
		return Static683.aClass152_9;
	}
}
