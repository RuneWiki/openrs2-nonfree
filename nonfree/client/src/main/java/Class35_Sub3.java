import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public final class Class35_Sub3 extends Class35 {

	@OriginalMember(owner = "client!tca", name = "x", descriptor = "I")
	public final int anInt9059;

	@OriginalMember(owner = "client!tca", name = "u", descriptor = "I")
	public final int anInt9057;

	@OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(Lclient!rg;Lclient!al;IIIIIIIII)V")
	public Class35_Sub3(@OriginalArg(0) Class293 arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt9059 = arg9;
		this.anInt9057 = arg10;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Z)Lclient!ww;")
	@Override
	public Class384 method8182() {
		return Static349.aClass384_71;
	}
}
