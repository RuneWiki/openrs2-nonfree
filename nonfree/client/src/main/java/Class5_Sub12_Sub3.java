import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public final class Class5_Sub12_Sub3 extends Class5_Sub12 {

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(IIIIIF)V")
	public Class5_Sub12_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4529(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.anInt5016 = arg2;
		super.anInt5011 = arg1;
		super.anInt5013 = arg0;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(BF)V")
	@Override
	public void method4535(@OriginalArg(1) float arg0) {
		super.aFloat123 = arg0;
	}
}
