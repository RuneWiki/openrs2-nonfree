import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public final class Class3_Sub27_Sub1 extends Class3_Sub27 {

	@OriginalMember(owner = "client!iea", name = "<init>", descriptor = "(IIIIIF)V")
	public Class3_Sub27_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(BF)V")
	@Override
	public void method5632(@OriginalArg(1) float arg0) {
		super.aFloat190 = arg0;
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(IZII)V")
	@Override
	public void method5629(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.anInt6726 = arg1;
		super.anInt6720 = arg2;
		super.anInt6729 = arg0;
	}
}
