import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public final class Class22_Sub2 extends Class22 {

	@OriginalMember(owner = "client!fq", name = "s", descriptor = "I")
	public final int anInt3441;

	@OriginalMember(owner = "client!fq", name = "u", descriptor = "I")
	public final int anInt3442;

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lclient!og;Lclient!ega;IIIIIIIIII)V")
	public Class22_Sub2(@OriginalArg(0) Class238 arg0, @OriginalArg(1) Class79 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt3441 = arg10;
		this.anInt3442 = arg11;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(B)Lclient!io;")
	@Override
	public Class152 method5661() {
		return Static615.aClass152_10;
	}
}
