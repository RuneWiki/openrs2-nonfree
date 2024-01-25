import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public final class Class175_Sub3 extends Class175 {

	@OriginalMember(owner = "client!ob", name = "A", descriptor = "I")
	public final int anInt6566;

	@OriginalMember(owner = "client!ob", name = "z", descriptor = "I")
	public final int anInt6565;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lclient!tl;Lclient!fn;IIIIIIIII)V")
	public Class175_Sub3(@OriginalArg(0) Class314 arg0, @OriginalArg(1) Class103 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt6566 = arg9;
		this.anInt6565 = arg10;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)Lclient!tca;")
	@Override
	public Class307 method7827() {
		return Static445.aClass307_9;
	}
}
