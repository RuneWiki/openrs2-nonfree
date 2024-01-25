import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wga")
public final class Class10_Sub3 extends Class10 {

	@OriginalMember(owner = "client!wga", name = "p", descriptor = "I")
	public final int anInt10606;

	@OriginalMember(owner = "client!wga", name = "m", descriptor = "I")
	public final int anInt10603;

	@OriginalMember(owner = "client!wga", name = "<init>", descriptor = "(Lclient!pf;Lclient!dg;IIIIIIIII)V")
	public Class10_Sub3(@OriginalArg(0) Class275 arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt10606 = arg10;
		this.anInt10603 = arg9;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(B)Lclient!gp;")
	@Override
	public Class139 method8810() {
		return Static590.aClass139_10;
	}
}
