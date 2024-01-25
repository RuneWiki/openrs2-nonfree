import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public final class Class194_Sub1 extends Class194 {

	@OriginalMember(owner = "client!ko", name = "l", descriptor = "I")
	public final int anInt5699;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(ILclient!pe;Lclient!op;III)V")
	public Class194_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class258 arg1, @OriginalArg(2) Class250 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt5699 = arg5;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)Lclient!sq;")
	@Override
	public Class307 method8175() {
		return Static479.aClass307_13;
	}
}
