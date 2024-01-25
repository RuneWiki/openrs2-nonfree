import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public final class Class1_Sub27_Sub1 extends Class1_Sub27 {

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(IIIIIF)V")
	public Class1_Sub27_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(FZ)V")
	@Override
	public void method5494(@OriginalArg(0) float arg0) {
		super.aFloat124 = arg0;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BIII)V")
	@Override
	public void method5491(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.anInt6323 = arg2;
		super.anInt6325 = arg0;
		super.anInt6326 = arg1;
	}
}
