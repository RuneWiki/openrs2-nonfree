import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public final class Class1_Sub4_Sub1 extends Class1_Sub4 {

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(IIIIIF)V")
	public Class1_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IBII)V")
	@Override
	public void method3806(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.anInt4992 = arg0;
		super.anInt4987 = arg2;
		super.anInt4984 = arg1;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(FB)V")
	@Override
	public void method3807(@OriginalArg(0) float arg0) {
		super.aFloat66 = arg0;
	}
}
