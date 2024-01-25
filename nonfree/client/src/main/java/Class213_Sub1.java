import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public final class Class213_Sub1 extends Class213 {

	@OriginalMember(owner = "client!lo", name = "v", descriptor = "I")
	public final int anInt5131;

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(ILclient!tca;Lclient!vea;III)V")
	public Class213_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class322 arg1, @OriginalArg(2) Class347 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt5131 = arg5;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)Lclient!mh;")
	@Override
	public Class225 method7443() {
		return Static373.aClass225_23;
	}
}
