import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public final class Class1_Sub12_Sub2 extends Class1_Sub12 {

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(IIIIIF)V")
	public Class1_Sub12_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IF)V")
	@Override
	public void method3179(@OriginalArg(1) float arg0) {
		super.aFloat65 = arg0;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIII)V")
	@Override
	public void method3185(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.anInt3784 = arg0;
		super.anInt3782 = arg2;
		super.anInt3780 = arg1;
	}
}
