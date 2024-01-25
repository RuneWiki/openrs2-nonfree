import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public final class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!jf", name = "p", descriptor = "I")
	public final int anInt5017;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(ILclient!vn;Lclient!mf;III)V")
	public Class1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class347 arg1, @OriginalArg(2) Class214 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt5017 = arg5;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)Lclient!kq;")
	@Override
	public Class184 method7073() {
		return Static470.aClass184_13;
	}
}
