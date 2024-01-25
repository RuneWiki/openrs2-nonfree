import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public final class Class92_Sub3 extends Class92 {

	@OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
	public final int anInt10918;

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
	public final int anInt10915;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lclient!in;Lclient!ti;IIIIIIIII)V")
	public Class92_Sub3(@OriginalArg(0) Class168 arg0, @OriginalArg(1) Class339 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt10918 = arg9;
		this.anInt10915 = arg10;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)Lclient!saa;")
	@Override
	public Class310 method9078() {
		return Static204.aClass310_17;
	}
}
