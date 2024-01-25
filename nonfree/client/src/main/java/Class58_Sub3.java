import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public final class Class58_Sub3 extends Class58 {

	@OriginalMember(owner = "client!vm", name = "v", descriptor = "I")
	public final int anInt10062;

	@OriginalMember(owner = "client!vm", name = "t", descriptor = "I")
	public final int anInt10063;

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lclient!rj;Lclient!mq;IIIIIIIIII)V")
	public Class58_Sub3(@OriginalArg(0) Class318 arg0, @OriginalArg(1) Class238 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt10062 = arg10;
		this.anInt10063 = arg11;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)Lclient!uu;")
	@Override
	public Class369 method8734() {
		return Static189.aClass369_8;
	}
}
