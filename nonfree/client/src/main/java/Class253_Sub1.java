import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public final class Class253_Sub1 extends Class253 {

	@OriginalMember(owner = "client!tf", name = "s", descriptor = "I")
	public final int anInt8143;

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(ILclient!rn;Lclient!hv;III)V")
	public Class253_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class277 arg1, @OriginalArg(2) Class137 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt8143 = arg5;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)Lclient!jv;")
	@Override
	public Class165 method7847() {
		return Static500.aClass165_17;
	}
}
