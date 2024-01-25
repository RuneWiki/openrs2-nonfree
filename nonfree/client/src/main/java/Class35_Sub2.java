import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public final class Class35_Sub2 extends Class35 {

	@OriginalMember(owner = "client!fq", name = "t", descriptor = "I")
	public final int anInt3249;

	@OriginalMember(owner = "client!fq", name = "y", descriptor = "I")
	public final int anInt3253;

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lclient!rg;Lclient!al;IIIIIIIIII)V")
	public Class35_Sub2(@OriginalArg(0) Class293 arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt3249 = arg11;
		this.anInt3253 = arg10;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Z)Lclient!ww;")
	@Override
	public Class384 method8182() {
		return Static556.aClass384_68;
	}
}
