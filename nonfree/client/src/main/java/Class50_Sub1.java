import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public final class Class50_Sub1 extends Class50 {

	@OriginalMember(owner = "client!cda", name = "q", descriptor = "I")
	public final int anInt1576;

	@OriginalMember(owner = "client!cda", name = "n", descriptor = "I")
	public final int anInt1574;

	@OriginalMember(owner = "client!cda", name = "<init>", descriptor = "(Lclient!vn;Lclient!mf;IIIIIIIII)V")
	public Class50_Sub1(@OriginalArg(0) Class347 arg0, @OriginalArg(1) Class214 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt1576 = arg10;
		this.anInt1574 = arg9;
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)Lclient!kq;")
	@Override
	public Class184 method7073() {
		return Static257.aClass184_8;
	}
}
