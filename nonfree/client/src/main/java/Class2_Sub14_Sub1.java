import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public final class Class2_Sub14_Sub1 extends Class2_Sub14 {

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(IIIIIF)V")
	public Class2_Sub14_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIBI)V")
	@Override
	public void method7690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		super.anInt9273 = arg0;
		super.anInt9262 = arg2;
		super.anInt9263 = arg1;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IF)V")
	@Override
	public void method7688(@OriginalArg(1) float arg0) {
		super.aFloat262 = arg0;
	}
}
