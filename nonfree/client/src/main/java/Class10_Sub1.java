import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public final class Class10_Sub1 extends Class10 {

	@OriginalMember(owner = "client!bk", name = "n", descriptor = "I")
	public final int anInt635;

	@OriginalMember(owner = "client!bk", name = "m", descriptor = "I")
	public final int anInt634;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lclient!rn;Lclient!hv;IIIIIII)V")
	public Class10_Sub1(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class137 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
		this.anInt635 = arg8;
		this.anInt634 = arg7;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)Lclient!jv;")
	@Override
	public Class165 method7847() {
		return Static343.aClass165_14;
	}
}
