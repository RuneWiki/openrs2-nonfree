import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public final class Class156_Sub1 extends Class156 {

	@OriginalMember(owner = "client!maa", name = "l", descriptor = "I")
	public final int anInt5684;

	@OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(ILclient!rt;Lclient!cp;III)V")
	public Class156_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class297 arg1, @OriginalArg(2) Class58 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt5684 = arg5;
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(B)Lclient!os;")
	@Override
	public Class258 method7256() {
		return Static157.aClass258_15;
	}
}
