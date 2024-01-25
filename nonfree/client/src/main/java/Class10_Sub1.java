import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public final class Class10_Sub1 extends Class10 {

	@OriginalMember(owner = "client!bp", name = "t", descriptor = "I")
	public final int anInt804;

	@OriginalMember(owner = "client!bp", name = "s", descriptor = "I")
	public final int anInt803;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lclient!pf;Lclient!dg;IIIIIIIIII)V")
	public Class10_Sub1(@OriginalArg(0) Class275 arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt804 = arg11;
		this.anInt803 = arg10;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)Lclient!gp;")
	@Override
	public Class139 method8810() {
		return Static549.aClass139_9;
	}
}
