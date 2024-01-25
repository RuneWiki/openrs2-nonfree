import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public final class Class321_Sub1 extends Class321 {

	@OriginalMember(owner = "client!rf", name = "p", descriptor = "I")
	public final int anInt8634;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(ILclient!al;Lclient!mfa;III)V")
	public Class321_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) Class239 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt8634 = arg5;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)Lclient!hfa;")
	@Override
	public Class152 method9627() {
		return Static203.aClass152_3;
	}
}
