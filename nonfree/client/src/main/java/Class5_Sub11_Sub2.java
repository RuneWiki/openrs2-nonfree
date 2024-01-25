import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public final class Class5_Sub11_Sub2 extends Class5_Sub11 {

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(IIIIIF)V")
	public Class5_Sub11_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIB)V")
	@Override
	public void method8094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super.anInt9393 = arg2;
		super.anInt9385 = arg1;
		super.anInt9394 = arg0;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZF)V")
	@Override
	public void method8095(@OriginalArg(1) float arg0) {
		super.aFloat177 = arg0;
	}
}
