import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public final class Class5_Sub43_Sub2 extends Class5_Sub43 {

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(IIIIIF)V")
	public Class5_Sub43_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(FB)V")
	@Override
	public void method8256(@OriginalArg(0) float arg0) {
		super.aFloat185 = arg0;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8252(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.anInt9640 = arg1;
		super.anInt9633 = arg0;
		super.anInt9632 = arg2;
	}
}
