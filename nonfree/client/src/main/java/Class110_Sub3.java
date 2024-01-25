import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public final class Class110_Sub3 extends Class110 {

	@OriginalMember(owner = "client!sc", name = "u", descriptor = "I")
	public final int anInt8743;

	@OriginalMember(owner = "client!sc", name = "s", descriptor = "I")
	public final int anInt8741;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lclient!fda;Lclient!aba;IIIIIIIII)V")
	public Class110_Sub3(@OriginalArg(0) Class112 arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt8743 = arg10;
		this.anInt8741 = arg9;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)Lclient!ve;")
	@Override
	public Class370 method7954() {
		return Static163.aClass370_2;
	}
}
