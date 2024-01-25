import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public final class Class260_Sub3 extends Class260 {

	@OriginalMember(owner = "client!u", name = "q", descriptor = "I")
	public final int anInt9480;

	@OriginalMember(owner = "client!u", name = "t", descriptor = "I")
	public final int anInt9482;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lclient!ffa;Lclient!oca;IIIIIIIIII)V")
	public Class260_Sub3(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class237 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt9480 = arg10;
		this.anInt9482 = arg11;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)Lclient!fl;")
	@Override
	public Class103 method7774() {
		return Static30.aClass103_2;
	}
}
