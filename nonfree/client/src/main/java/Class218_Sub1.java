import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public final class Class218_Sub1 extends Class218 {

	@OriginalMember(owner = "client!la", name = "p", descriptor = "I")
	public final int anInt6033;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(ILclient!eaa;Lclient!cq;III)V")
	public Class218_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class92 arg1, @OriginalArg(2) Class65 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt6033 = arg5;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I)Lclient!aca;")
	@Override
	public Class6 method8749() {
		return Static397.aClass6_23;
	}
}
