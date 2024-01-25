import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public final class Class10_Sub2 extends Class10 {

	@OriginalMember(owner = "client!qu", name = "o", descriptor = "I")
	public final int anInt7540;

	@OriginalMember(owner = "client!qu", name = "n", descriptor = "I")
	public final int anInt7539;

	@OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(Lclient!rn;Lclient!hv;IIIIIIII)V")
	public Class10_Sub2(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class137 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
		this.anInt7540 = arg8;
		this.anInt7539 = arg9;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)Lclient!jv;")
	@Override
	public Class165 method7847() {
		return Static245.aClass165_9;
	}
}
